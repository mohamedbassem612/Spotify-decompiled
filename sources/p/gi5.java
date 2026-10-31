package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gi5 {
    public final int a;
    public final em3 b;
    public final mh5 c;
    public final String d;

    public gi5(em3 em3Var, mh5 mh5Var, String str) {
        this.b = em3Var;
        this.c = mh5Var;
        this.d = str;
        this.a = k8p1.j(new Object[]{em3Var, mh5Var, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gi5)) {
            return false;
        }
        gi5 gi5Var = (gi5) obj;
        return k8p1.h(this.b, gi5Var.b) && k8p1.h(this.c, gi5Var.c) && k8p1.h(this.d, gi5Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
