package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wkf1 {
    public final c380 a;
    public final String b;
    public final boolean c;

    public wkf1(String str, c380 c380Var, boolean z) {
        this.a = c380Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkf1)) {
            return false;
        }
        wkf1 wkf1Var = (wkf1) obj;
        return u890.j(this.a, wkf1Var.a) && u890.j(this.b, wkf1Var.b) && this.c == wkf1Var.c;
    }

    public final int hashCode() {
        int iF = kaa0.f(4, this.a.hashCode() * 31, 961);
        String str = this.b;
        return Boolean.hashCode(false) + xcg1.g(xcg1.g(xcg1.g((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, false), 961, false);
    }
}
