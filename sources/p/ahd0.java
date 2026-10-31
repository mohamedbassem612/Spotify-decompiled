package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ahd0 implements ehd0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Long f;

    public ahd0(Long l, String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahd0)) {
            return false;
        }
        ahd0 ahd0Var = (ahd0) obj;
        return u890.j(this.a, ahd0Var.a) && this.b.equals(ahd0Var.b) && u890.j(this.c, ahd0Var.c) && u890.j(this.d, ahd0Var.d) && this.e == ahd0Var.e && u890.j(this.f, ahd0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Long l = this.f;
        return iG + (l != null ? l.hashCode() : 0);
    }
}
