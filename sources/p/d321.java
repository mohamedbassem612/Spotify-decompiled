package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class d321 {
    public static final c321 Companion = new c321();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ d321(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, b321.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d321)) {
            return false;
        }
        d321 d321Var = (d321) obj;
        return u890.j(this.a, d321Var.a) && u890.j(this.b, d321Var.b) && u890.j(this.c, d321Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
