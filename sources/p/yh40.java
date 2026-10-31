package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class yh40 {
    public static final xh40 Companion = new xh40();
    public final vh40 a;
    public final vh40 b;
    public final vh40 c;

    public /* synthetic */ yh40(int i, vh40 vh40Var, vh40 vh40Var2, vh40 vh40Var3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, wh40.a.getDescriptor());
            throw null;
        }
        this.a = vh40Var;
        this.b = vh40Var2;
        this.c = vh40Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh40)) {
            return false;
        }
        yh40 yh40Var = (yh40) obj;
        return u890.j(this.a, yh40Var.a) && u890.j(this.b, yh40Var.b) && u890.j(this.c, yh40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
