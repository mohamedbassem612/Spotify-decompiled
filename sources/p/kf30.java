package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kf30 {
    public static final kf30 c = new kf30("");
    public final lf30 a;
    public transient kf30 b;

    public kf30(String str) {
        this.a = new lf30(str, this);
    }

    public final kf30 a(ajn0 ajn0Var) {
        return new kf30(this.a.a(ajn0Var), this);
    }

    public final kf30 b() {
        kf30 kf30Var = this.b;
        if (kf30Var != null) {
            return kf30Var;
        }
        lf30 lf30Var = this.a;
        if (lf30Var.c()) {
            eg.m("root");
            return null;
        }
        kf30 kf30Var2 = new kf30(lf30Var.e());
        this.b = kf30Var2;
        return kf30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kf30) {
            return this.a.equals(((kf30) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public kf30(lf30 lf30Var) {
        this.a = lf30Var;
    }

    public kf30(lf30 lf30Var, kf30 kf30Var) {
        this.a = lf30Var;
        this.b = kf30Var;
    }
}
