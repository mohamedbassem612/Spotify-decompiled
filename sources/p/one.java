package p;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class one {
    public static final Charset a = StandardCharsets.US_ASCII;
    public static final Charset b;
    public static final Charset c;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        b = StandardCharsets.UTF_8;
        Charset charset2 = StandardCharsets.UTF_16BE;
        Charset charset3 = StandardCharsets.UTF_16LE;
        c = StandardCharsets.UTF_16;
    }
}
