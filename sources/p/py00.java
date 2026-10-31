package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class py00 {
    public static final oy00 Companion = new oy00();
    public static final znb0[] f = {null, null, null, dm5.S(2, oxx.e1), dm5.S(2, ny00.b)};
    public final String a;
    public final int b;
    public final String c;
    public final Set d;
    public final Set e;

    public /* synthetic */ py00(int i, String str, int i2, String str2, Set set, Set set2) {
        if (5 != (i & 5)) {
            o6p1.t(i, 5, my00.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        this.c = str2;
        int i3 = i & 8;
        w7x w7xVar = w7x.a;
        if (i3 == 0) {
            this.d = w7xVar;
        } else {
            this.d = set;
        }
        if ((i & 16) == 0) {
            this.e = w7xVar;
        } else {
            this.e = set2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py00)) {
            return false;
        }
        py00 py00Var = (py00) obj;
        return u890.j(this.a, py00Var.a) && this.b == py00Var.b && u890.j(this.c, py00Var.c) && u890.j(this.d, py00Var.d) && u890.j(this.e, py00Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gvg.c(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public py00(int i, String str, String str2, Set set, Set set2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = set;
        this.e = set2;
    }
}
