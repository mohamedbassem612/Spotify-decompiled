package androidx.media3.common;

import java.io.IOException;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ParserException extends IOException {
    public final boolean a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ParserException(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static ParserException a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException b(String str) {
        return new ParserException(str, null, true, 4);
    }

    public static ParserException c(String str) {
        return new ParserException(str, null, true, 8);
    }

    public static ParserException d(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return gvg.j(sb, this.b, "}");
    }
}
