package p;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tag extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        ConsoleMessage.MessageLevel messageLevel = consoleMessage != null ? consoleMessage.messageLevel() : null;
        if (consoleMessage != null) {
            consoleMessage.message();
        }
        if (consoleMessage != null) {
            consoleMessage.sourceId();
        }
        if (consoleMessage != null) {
            consoleMessage.lineNumber();
        }
        Objects.toString(messageLevel);
        return true;
    }
}
