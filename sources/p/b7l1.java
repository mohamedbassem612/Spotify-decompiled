package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b7l1 extends sqe {
    public final String d;
    public final String e;
    public final String f;

    public b7l1(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7l1)) {
            return false;
        }
        b7l1 b7l1Var = (b7l1) obj;
        return this.d.equals(b7l1Var.d) && this.e.equals(b7l1Var.e) && this.f.equals(b7l1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(this.d.hashCode() * 31, 31, this.e);
    }
}
