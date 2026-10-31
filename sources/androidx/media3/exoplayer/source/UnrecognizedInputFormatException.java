package androidx.media3.exoplayer.source;

import androidx.media3.common.ParserException;
import p.b380;
import p.bg11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final b380 c;

    public UnrecognizedInputFormatException(String str, bg11 bg11Var) {
        super(str, (Throwable) null, false, 1);
        this.c = b380.p(bg11Var);
    }

    public final String getMessage() {
        String message = super.getMessage();
        b380 b380Var = this.c;
        if (b380Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + b380Var;
    }
}
