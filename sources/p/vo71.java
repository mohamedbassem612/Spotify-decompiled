package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vo71 implements wo71 {
    public final String a;
    public final boolean b;

    public vo71(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo71)) {
            return false;
        }
        vo71 vo71Var = (vo71) obj;
        return u890.j(this.a, vo71Var.a) && this.b == vo71Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
