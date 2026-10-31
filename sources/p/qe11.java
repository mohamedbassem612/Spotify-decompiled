package p;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qe11 implements Serializable {
    public final String a;
    public final int b;

    public qe11(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private final Object readResolve() {
        return new se11(Pattern.compile(this.a, this.b));
    }
}
