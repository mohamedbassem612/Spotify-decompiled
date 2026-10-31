package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class eb10 {
    public static final db10 Companion = new db10();
    public static final znb0[] e = {null, dm5.S(2, ny00.h), null, null};
    public final String a;
    public final List b;
    public final int c;
    public final int d;

    public /* synthetic */ eb10(int i, int i2, int i3, String str, List list) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, cb10.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb10)) {
            return false;
        }
        eb10 eb10Var = (eb10) obj;
        return u890.j(this.a, eb10Var.a) && u890.j(this.b, eb10Var.b) && this.c == eb10Var.c && this.d == eb10Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
