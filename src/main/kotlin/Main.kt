import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LockClock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    MaterialTheme {
        val stopWatch = remember { StopWatch() }

        StopWatchScreen(
            stopWatch.formattedTime,
            onStartClick = {
                stopWatch.start()
            },
            onPauseClick = {
                stopWatch.pause()
            },
            onResetClick = {
                stopWatch.reset()
            },
            modifier = Modifier.fillMaxSize()
        )
    }
}

fun main() = application {

    Window(
        onCloseRequest = ::exitApplication,
        title = "Stop Watch",
        icon = rememberVectorPainter(Icons.Default.LockClock)
    ) {
        App()
    }
}
