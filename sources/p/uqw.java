package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uqw {
    public final Object a;
    public final laa b;
    public final Object c;
    public final Object d;
    public final boolean e;
    public final vu30 f;
    public final Function0 g;
    public final iu30 h;
    public final vu30 i;

    public uqw(laa laaVar, Object obj, Object obj2, boolean z, vu30 vu30Var, Function0 function0, iu30 iu30Var, vu30 vu30Var2) {
        this.a = obj2;
        this.b = laaVar;
        this.c = obj;
        this.d = obj2;
        this.e = z;
        this.f = vu30Var;
        this.g = function0;
        this.h = iu30Var;
        this.i = vu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqw)) {
            return false;
        }
        uqw uqwVar = (uqw) obj;
        return u890.j(this.b, uqwVar.b) && u890.j(this.c, uqwVar.c) && u890.j(this.d, uqwVar.d) && this.e == uqwVar.e && u890.j(this.f, uqwVar.f) && u890.j(this.g, uqwVar.g) && u890.j(this.h, uqwVar.h) && u890.j(this.i, uqwVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Object obj = this.c;
        int iG = xcg1.g((this.d.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31, 31, this.e);
        vu30 vu30Var = this.f;
        return this.i.hashCode() + ktd.g(this.h, rjx.n((iG + (vu30Var != null ? vu30Var.hashCode() : 0)) * 31, 31, this.g), 31);
    }

    public /* synthetic */ uqw(qtw qtwVar, lu8 lu8Var, Integer num, Function0 function0, iu30 iu30Var, k7f k7fVar) {
        this(qtwVar, lu8Var, num, false, null, function0, iu30Var, k7fVar);
    }
}
