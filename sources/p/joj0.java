package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class joj0 extends ava {
    public static final joj0 g;
    public static final joj0 h;
    public final boolean f;

    static {
        joj0 joj0Var = new joj0(false, new int[]{2, 3, 0});
        g = joj0Var;
        int i = joj0Var.c;
        int i2 = joj0Var.b;
        h = (i2 == 1 && i == 9) ? new joj0(false, new int[]{2, 0, 0}) : new joj0(false, new int[]{i2, i + 1, 0});
        new joj0(false, new int[0]);
    }

    public joj0(boolean z, int[] iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        this.f = z;
    }
}
