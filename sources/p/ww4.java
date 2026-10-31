package p;

import android.graphics.Path;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ww4 {
    public static final tw4 a() {
        return new tw4(new Path());
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final Path.Direction c(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return Path.Direction.CCW;
        }
        if (iC == 1) {
            return Path.Direction.CW;
        }
        eg.o();
        return null;
    }
}
