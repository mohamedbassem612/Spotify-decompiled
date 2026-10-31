package p;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cai0 extends rxd1 {
    public final ujo0 a;
    public final Bitmap b;
    public final String c;
    public final String d;
    public final Bitmap e;
    public final iu30 f;
    public final iu30 g;
    public final iu30 h;
    public final cvy0 i;
    public final List j;

    public cai0(ujo0 ujo0Var, Bitmap bitmap, String str, String str2, Bitmap bitmap2, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, cvy0 cvy0Var, List list) {
        this.a = ujo0Var;
        this.b = bitmap;
        this.c = str;
        this.d = str2;
        this.e = bitmap2;
        this.f = iu30Var;
        this.g = iu30Var2;
        this.h = iu30Var3;
        this.i = cvy0Var;
        this.j = list;
    }

    public final cvy0 a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cai0)) {
            return false;
        }
        cai0 cai0Var = (cai0) obj;
        return this.a.equals(cai0Var.a) && u890.j(this.b, cai0Var.b) && u890.j(this.c, cai0Var.c) && u890.j(this.d, cai0Var.d) && u890.j(this.e, cai0Var.e) && u890.j(this.f, cai0Var.f) && u890.j(this.g, cai0Var.g) && u890.j(this.h, cai0Var.h) && this.i.equals(cai0Var.i) && this.j.equals(cai0Var.j);
    }

    public final int hashCode() {
        return f4i1.b((this.i.hashCode() + ktd.g(this.h, ktd.g(this.g, ktd.g(this.f, (this.e.hashCode() + cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31), 31), 31)) * 31, 31, this.j);
    }
}
