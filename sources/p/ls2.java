package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ls2 {
    public final String a;
    public final hr2 b;
    public final String c;
    public final String d;

    public ls2(String str, hr2 hr2Var, String str2, String str3) {
        this.a = str;
        this.b = hr2Var;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final hr2 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls2)) {
            return false;
        }
        ls2 ls2Var = (ls2) obj;
        return this.a.equals(ls2Var.a) && u890.j(this.b, ls2Var.b) && u890.j(this.c, ls2Var.c) && u890.j(this.d, ls2Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hr2 hr2Var = this.b;
        int iHashCode2 = (iHashCode + (hr2Var == null ? 0 : hr2Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
