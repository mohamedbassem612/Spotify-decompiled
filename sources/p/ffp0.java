package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ffp0 {
    public final Object a;
    public int b;
    public final /* synthetic */ gfp0 c;

    public ffp0(gfp0 gfp0Var, int i) {
        this.c = gfp0Var;
        this.a = gfp0Var.a[i];
        this.b = i;
    }

    public final int a() {
        int i = this.b;
        Object obj = this.a;
        gfp0 gfp0Var = this.c;
        if (i == -1 || i >= gfp0Var.c || !zno1.k(obj, gfp0Var.a[i])) {
            this.b = gfp0Var.c(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return gfp0Var.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ffp0) {
            ffp0 ffp0Var = (ffp0) obj;
            if (a() == ffp0Var.a() && zno1.k(this.a, ffp0Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return a() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int iA = a();
        return iA == 1 ? strValueOf : l1d.k(iA, strValueOf, " x ");
    }
}
