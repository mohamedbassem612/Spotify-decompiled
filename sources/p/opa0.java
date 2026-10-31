package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class opa0 {
    public final String a;
    public final zjd1 b;
    public final iu30 c;

    public opa0(String str, zjd1 zjd1Var, iu30 iu30Var) {
        this.a = str;
        this.b = zjd1Var;
        this.c = iu30Var;
    }

    public final iu30 a() {
        return this.c;
    }

    public final zjd1 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opa0)) {
            return false;
        }
        opa0 opa0Var = (opa0) obj;
        return this.a.equals(opa0Var.a) && this.b.equals(opa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Step(" + this.a + ", " + this.b + ")";
    }
}
