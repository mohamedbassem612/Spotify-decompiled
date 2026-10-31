package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class di40 {
    public final String a;
    public final String b;
    public final Object c;
    public final Long d;

    public di40(String str, String str2, Long l, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di40)) {
            return false;
        }
        di40 di40Var = (di40) obj;
        return u890.j(this.a, di40Var.a) && u890.j(this.b, di40Var.b) && u890.j(this.c, di40Var.c) && u890.j(this.d, di40Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.c;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l = this.d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }
}
