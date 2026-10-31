package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dab0 {
    public final String a;
    public final String b;
    public final boolean c;

    public dab0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dab0)) {
            return false;
        }
        dab0 dab0Var = (dab0) obj;
        return u890.j(this.a, dab0Var.a) && u890.j(this.b, dab0Var.b) && this.c == dab0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
