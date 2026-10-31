package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a1j0 implements a2j0 {
    public final String a;
    public final String b;

    public a1j0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1j0)) {
            return false;
        }
        a1j0 a1j0Var = (a1j0) obj;
        return this.a.equals(a1j0Var.a) && this.b.equals(a1j0Var.b);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
