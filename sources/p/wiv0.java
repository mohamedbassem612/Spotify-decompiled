package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wiv0 {
    public final String a;
    public final String b;
    public final Long c;
    public final iu30 d;

    public wiv0(String str, String str2, Long l, iu30 iu30Var) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = iu30Var;
    }

    public static wiv0 a(wiv0 wiv0Var, iu30 iu30Var) {
        String str = wiv0Var.a;
        String str2 = wiv0Var.b;
        Long l = wiv0Var.c;
        wiv0Var.getClass();
        return new wiv0(str, str2, l, iu30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wiv0)) {
            return false;
        }
        wiv0 wiv0Var = (wiv0) obj;
        return u890.j(this.a, wiv0Var.a) && u890.j(this.b, wiv0Var.b) && u890.j(this.c, wiv0Var.c) && u890.j(this.d, wiv0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        int iHashCode = (iD + (l == null ? 0 : l.hashCode())) * 31;
        iu30 iu30Var = this.d;
        return iHashCode + (iu30Var != null ? iu30Var.hashCode() : 0);
    }

    public /* synthetic */ wiv0(Long l, String str, String str2) {
        this(str, str2, l, null);
    }
}
