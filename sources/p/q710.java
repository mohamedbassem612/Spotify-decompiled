package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q710 {
    public final String a;
    public final int b;
    public final String c;

    public q710(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q710)) {
            return false;
        }
        q710 q710Var = (q710) obj;
        return u890.j(this.a, q710Var.a) && this.b == q710Var.b && u890.j(this.c, q710Var.c);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ q710(String str, int i) {
        this(str, i, null);
    }
}
