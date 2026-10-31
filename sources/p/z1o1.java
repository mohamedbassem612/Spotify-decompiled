package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z1o1 {
    public static final z1o1 b;
    public static final z1o1 c;
    public final Throwable a;

    static {
        if (fzo1.d) {
            c = null;
            b = null;
        } else {
            c = new z1o1(null);
            b = new z1o1(null);
        }
    }

    public z1o1(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
