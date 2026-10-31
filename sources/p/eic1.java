package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eic1 {
    public final String a;
    public final String b;

    public eic1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eic1)) {
            return false;
        }
        eic1 eic1Var = (eic1) obj;
        return this.a.equals(eic1Var.a) && u890.j(this.b, eic1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
