package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mak0 {
    public final String a;
    public final String b;

    public mak0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mak0)) {
            return false;
        }
        mak0 mak0Var = (mak0) obj;
        return u890.j(this.a, mak0Var.a) && u890.j(this.b, mak0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
