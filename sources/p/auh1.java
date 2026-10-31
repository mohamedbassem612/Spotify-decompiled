package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class auh1 {
    public final String a;
    public final String b;
    public final boolean c;

    public auh1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auh1)) {
            return false;
        }
        auh1 auh1Var = (auh1) obj;
        return this.a.equals(auh1Var.a) && u890.j(this.b, auh1Var.b) && this.c == auh1Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
