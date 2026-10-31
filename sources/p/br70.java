package p;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class br70 extends rxd1 {
    public final ujo0 a;
    public final Bitmap b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final iu30 g;
    public final iu30 h;
    public final cvy0 i;
    public final List j;

    public br70(ujo0 ujo0Var, Bitmap bitmap, String str, String str2, String str3, String str4, iu30 iu30Var, iu30 iu30Var2, cvy0 cvy0Var, List list) {
        this.a = ujo0Var;
        this.b = bitmap;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = iu30Var;
        this.h = iu30Var2;
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
        if (!(obj instanceof br70)) {
            return false;
        }
        br70 br70Var = (br70) obj;
        return this.a.equals(br70Var.a) && u890.j(this.b, br70Var.b) && u890.j(this.c, br70Var.c) && u890.j(this.d, br70Var.d) && u890.j(this.e, br70Var.e) && u890.j(this.f, br70Var.f) && u890.j(this.g, br70Var.g) && u890.j(this.h, br70Var.h) && this.i.equals(br70Var.i) && this.j.equals(br70Var.j);
    }

    public final int hashCode() {
        return f4i1.b((this.i.hashCode() + ktd.g(this.h, ktd.g(this.g, cy30.d(cy30.d(cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31)) * 31, 31, this.j);
    }
}
