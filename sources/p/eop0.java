package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eop0 implements fop0 {
    public final String a;
    public final String b;
    public final String c;
    public final hux d;

    public eop0(String str, String str2, String str3, hux huxVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eop0)) {
            return false;
        }
        eop0 eop0Var = (eop0) obj;
        return this.a.equals(eop0Var.a) && this.b.equals(eop0Var.b) && this.c.equals(eop0Var.c) && this.d.equals(eop0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(cy30.d(Integer.hashCode(2131959313) * 31, 31, this.a), 31, this.b), 31, this.c);
    }
}
