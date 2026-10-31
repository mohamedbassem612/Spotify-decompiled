package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kgt0 implements sgt0 {
    public final String a;
    public final String b;
    public final Long c;

    public kgt0(Long l, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgt0)) {
            return false;
        }
        kgt0 kgt0Var = (kgt0) obj;
        return this.a.equals(kgt0Var.a) && u890.j(this.b, kgt0Var.b) && u890.j(this.c, kgt0Var.c);
    }

    public final String getContextUri() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
