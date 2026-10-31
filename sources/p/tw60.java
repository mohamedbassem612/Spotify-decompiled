package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tw60 {
    public final String a;
    public final int b;

    public tw60(String str, int i) {
        Objects.requireNonNull(str);
        this.a = str;
        this.b = i;
    }

    public final String toString() {
        return this.a + ", uid: " + this.b;
    }
}
