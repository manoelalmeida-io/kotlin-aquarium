package game

enum class Direction(val direction: String) {
  NORTH("n"),
  SOUTH("s"),
  EAST("e"),
  WEST("w"),
  START("start"),
  END("end")
}

class Game(var path: MutableList<Direction> = mutableListOf(Direction.START)) {

  private val north = { path.add(Direction.NORTH) }
  private val south = { path.add(Direction.SOUTH) }
  private val east = { path.add(Direction.EAST) }
  private val west = { path.add(Direction.WEST) }

  private val end: () -> Boolean = {
    path.add(Direction.END)
    println("Game Over: $path")
    path.clear()

    false
  }

  private fun move(where: () -> Boolean) {
    where()
  }

  fun makeMove(where: String?) {
    if (Direction.values().map { it.direction }.contains(where)) {
      when (where) {
        "n" -> move(north)
        "s" -> move(south)
        "e" -> move(east)
        "w" -> move(west)
      }
    } else {
      move(end)
    }
  }
}

fun main() {
  val game = Game()

  while (true) {
    print("Enter a direction: n/s/e/w: ")
    game.makeMove(readLine())
  }
}