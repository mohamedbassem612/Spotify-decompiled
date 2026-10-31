package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class k0b0 {
    public static final j0b0 Companion = new j0b0();
    public final String a;
    public final String b;
    public final Date c;

    public /* synthetic */ k0b0(int i, String str, String str2, Date date) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, i0b0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0b0)) {
            return false;
        }
        k0b0 k0b0Var = (k0b0) obj;
        return u890.j(this.a, k0b0Var.a) && u890.j(this.b, k0b0Var.b) && u890.j(this.c, k0b0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public k0b0(String str, String str2, Date date) {
        this.a = str;
        this.b = str2;
        this.c = date;
    }
}
