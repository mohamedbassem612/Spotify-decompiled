package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class drk1 implements rrk1 {
    public final String a;
    public final b32 b;

    public drk1(String str, b32 b32Var) {
        this.a = str;
        this.b = b32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drk1)) {
            return false;
        }
        drk1 drk1Var = (drk1) obj;
        return u890.j(this.a, drk1Var.a) && this.b.equals(drk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
