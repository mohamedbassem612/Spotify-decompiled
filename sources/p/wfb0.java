package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wfb0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public wfb0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfb0)) {
            return false;
        }
        wfb0 wfb0Var = (wfb0) obj;
        return u890.j(this.a, wfb0Var.a) && u890.j(this.b, wfb0Var.b) && u890.j(this.c, wfb0Var.c) && this.d == wfb0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public /* synthetic */ wfb0(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }
}
