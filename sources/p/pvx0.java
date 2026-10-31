package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pvx0 extends qvx0 {
    public final String a;
    public final String b;

    public pvx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvx0)) {
            return false;
        }
        pvx0 pvx0Var = (pvx0) obj;
        return this.a.equals(pvx0Var.a) && u890.j(this.b, pvx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
