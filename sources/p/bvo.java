package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bvo {
    public final String a;
    public final String b;
    public final jwm c;
    public final String d;
    public final r4f e;

    public bvo(String str, String str2, String str3, r4f r4fVar, jwm jwmVar) {
        this.a = str;
        this.b = str2;
        this.c = jwmVar;
        this.d = str3;
        this.e = r4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvo)) {
            return false;
        }
        bvo bvoVar = (bvo) obj;
        return u890.j(this.a, bvoVar.a) && u890.j(this.b, bvoVar.b) && this.c.equals(bvoVar.c) && u890.j(this.d, bvoVar.d) && u890.j(this.e, bvoVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }
}
