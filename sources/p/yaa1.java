package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yaa1 {
    public final String a;
    public final String b;
    public final boolean c;

    public yaa1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yaa1)) {
            return false;
        }
        yaa1 yaa1Var = (yaa1) obj;
        return u890.j(this.a, yaa1Var.a) && u890.j(this.b, yaa1Var.b) && this.c == yaa1Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
