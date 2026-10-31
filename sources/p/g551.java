package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g551 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h551 b;

    public /* synthetic */ g551(h551 h551Var, byte b) {
        this.a = b;
        this.b = h551Var;
    }

    public final void b(Object obj) {
        switch (this.a) {
            case 0:
                x751 x751Var = (x751) obj;
                if (x751Var != null && !x751Var.c) {
                    int i = x751Var.b;
                    h551 h551Var = this.b;
                    i551 i551Var = h551Var.f;
                    xb51 xb51Var = i551Var != null ? i551Var.e : null;
                    if (xb51Var != null && i == xb51Var.a) {
                        h551Var.a.postInvalidateOnAnimation();
                    }
                    break;
                }
                break;
            default:
                rnc0 rnc0Var = (rnc0) obj;
                rnc0Var.getClass();
                h551 h551Var2 = this.b;
                h551Var2.j = rnc0Var;
                long j = h551Var2.e + 1;
                h551Var2.e = j;
                int i2 = h551Var2.d;
                List list = rnc0Var.b;
                boolean z = !u890.j(list, h551Var2.k);
                v751 v751Var = h551Var2.i;
                if (i2 == v751Var.e) {
                    v751Var.f = j;
                    v751Var.h = v751Var.g;
                    v751Var.i = null;
                }
                h551Var2.m.b(rnc0Var);
                h551Var2.k = list;
                i551 i551Var2 = h551Var2.f;
                h551Var2.i.b(i2, j, i551Var2 != null ? i551Var2.e : null, z, new ka0(i551Var2, h551Var2, i2, rnc0Var, (byte) 12));
                break;
        }
    }
}
