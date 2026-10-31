package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wm6 implements xm6 {
    public final int a;
    public final int b;
    public final List c;

    public wm6(int i, int i2, List list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm6)) {
            return false;
        }
        wm6 wm6Var = (wm6) obj;
        return this.a == wm6Var.a && this.b == wm6Var.b && this.c.equals(wm6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
