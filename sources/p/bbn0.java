package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bbn0 {
    public final String a;
    public final boolean b;

    public bbn0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbn0)) {
            return false;
        }
        bbn0 bbn0Var = (bbn0) obj;
        return u890.j(this.a, bbn0Var.a) && this.b == bbn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
