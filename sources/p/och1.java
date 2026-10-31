package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class och1 {
    public static final nch1 Companion = new nch1();
    public static final znb0[] e = {null, null, dm5.S(2, vbh1.c), null};
    public final String a;
    public final boolean b;
    public final List c;
    public final uga0 d;

    public /* synthetic */ och1(int i, String str, boolean z, List list, uga0 uga0Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = z6x.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = uga0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof och1)) {
            return false;
        }
        och1 och1Var = (och1) obj;
        return u890.j(this.a, och1Var.a) && this.b == och1Var.b && u890.j(this.c, och1Var.c) && u890.j(this.d, och1Var.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        uga0 uga0Var = this.d;
        return iB + (uga0Var == null ? 0 : uga0Var.a.hashCode());
    }
}
