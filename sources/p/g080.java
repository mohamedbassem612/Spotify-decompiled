package p;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g080 extends rxd1 {
    public final ujo0 a;
    public final Bitmap b;
    public final vu30 c;
    public final iu30 d;
    public final iu30 e;
    public final cvy0 f;
    public final List g;
    public final atk h;

    public g080(ujo0 ujo0Var, Bitmap bitmap, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, cvy0 cvy0Var, List list, atk atkVar) {
        this.a = ujo0Var;
        this.b = bitmap;
        this.c = vu30Var;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = cvy0Var;
        this.g = list;
        this.h = atkVar;
    }

    public final cvy0 a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g080)) {
            return false;
        }
        g080 g080Var = (g080) obj;
        return u890.j(this.a, g080Var.a) && u890.j(this.b, g080Var.b) && u890.j(this.c, g080Var.c) && u890.j(this.d, g080Var.d) && u890.j(this.e, g080Var.e) && this.f.equals(g080Var.f) && this.g.equals(g080Var.g) && u890.j(this.h, g080Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vu30 vu30Var = this.c;
        int iB = f4i1.b((this.f.hashCode() + ktd.g(this.e, ktd.g(this.d, xcg1.g((iHashCode + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31, 31, true), 31), 31)) * 31, 31, this.g);
        atk atkVar = this.h;
        return iB + (atkVar != null ? atkVar.hashCode() : 0);
    }
}
