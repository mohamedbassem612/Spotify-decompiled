package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bab0 {
    public final String a;
    public final String b;
    public final boolean c;

    public bab0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bab0)) {
            return false;
        }
        bab0 bab0Var = (bab0) obj;
        return u890.j(this.a, bab0Var.a) && u890.j(this.b, bab0Var.b) && this.c == bab0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
