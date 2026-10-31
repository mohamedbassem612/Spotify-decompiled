package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l9w0 {
    public final String a;
    public final String b;
    public final boolean c;

    public l9w0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9w0)) {
            return false;
        }
        l9w0 l9w0Var = (l9w0) obj;
        return this.a.equals(l9w0Var.a) && u890.j(this.b, l9w0Var.b) && this.c == l9w0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
