package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ev8 {
    public static final dv8 Companion = new dv8();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ ev8(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, cv8.a.getDescriptor());
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
        if (!(obj instanceof ev8)) {
            return false;
        }
        ev8 ev8Var = (ev8) obj;
        return u890.j(this.a, ev8Var.a) && u890.j(this.b, ev8Var.b) && u890.j(this.c, ev8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
