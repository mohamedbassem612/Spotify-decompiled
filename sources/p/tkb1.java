package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class tkb1 {
    public static final skb1 Companion = new skb1();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ tkb1(String str, String str2, int i, String str3) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, rkb1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = "7d-opt-in";
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkb1)) {
            return false;
        }
        tkb1 tkb1Var = (tkb1) obj;
        return u890.j(this.a, tkb1Var.a) && u890.j(this.b, tkb1Var.b) && u890.j(this.c, tkb1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public tkb1(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = "7d-opt-in";
    }
}
