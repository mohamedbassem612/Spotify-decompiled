package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fnh implements lnh {
    public final String a;
    public final String b;
    public final boolean c;

    public fnh(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnh)) {
            return false;
        }
        fnh fnhVar = (fnh) obj;
        return u890.j(this.a, fnhVar.a) && u890.j(this.b, fnhVar.b) && this.c == fnhVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
