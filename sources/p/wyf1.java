package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wyf1 extends mc7 {
    public final umf0 d;
    public final alk0 e;
    public final d0r f;
    public final b6p0 g;
    public final ltx h = ltx.c;
    public final boolean i = true;

    public wyf1(umf0 umf0Var, alk0 alk0Var, d0r d0rVar, b6p0 b6p0Var) {
        this.d = umf0Var;
        this.e = alk0Var;
        this.f = d0rVar;
        this.g = b6p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    @Override // p.mc7
    public final Object f(kc7 kc7Var) {
        c380 c380VarA;
        g gVar = (g) kc7Var.b;
        String strY0 = o7h.y0(gVar.t, ", ", (String) null, (String) null, uyf1.Y, 30);
        boolean z = kc7Var.d;
        List list = gVar.X;
        if (list != null) {
            List<h> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (h hVar : list2) {
                arrayList.add(new phx(8, 0L, hVar.c, hVar.a, hVar.b));
            }
            c380VarA = mqo1.A(arrayList);
            if (c380VarA == null) {
                c380VarA = fg91.b;
            }
        } else {
            c380VarA = fg91.b;
        }
        return new cyf1(strY0, c380VarA, z);
    }

    @Override // p.mc7
    public final hux g() {
        return this.h;
    }

    @Override // p.mc7
    public final int h() {
        return this.i ? 1 : 0;
    }

    @Override // p.mc7
    public final boolean i(kc7 kc7Var) {
        g gVar = (g) kc7Var.b;
        if (gVar.i) {
            return false;
        }
        if (super.i(kc7Var)) {
            return true;
        }
        if (gVar.Y && gVar.e) {
            return (gVar.h && kc7Var.i) ? false : true;
        }
        return false;
    }

    @Override // p.mc7
    public final mr20 j(String str, boolean z) {
        return !z ? new huz(Boolean.FALSE, (byte) 10) : hu20.e(this.g.e, new c6e0((byte) 27, this, str, (lnm) null));
    }

    @Override // p.mc7
    public final boolean k(kc7 kc7Var) {
        g gVar = (g) kc7Var.b;
        if (gVar.i) {
            return true;
        }
        return gVar.f && kc7Var.g && !gVar.Y;
    }

    @Override // p.mc7
    public final vu30 n(lc7 lc7Var, b0k b0kVar) {
        j2i j2iVarR;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(185019403);
        cyf1 cyf1Var = (cyf1) lc7Var.i;
        if (cyf1Var.b) {
            x340Var.i0(1470142621);
            j2iVarR = apo.r(1545043184, new xaf1(this, lc7Var, (byte) 9), x340Var);
            x340Var.r(false);
        } else if (cyf1Var.c.isEmpty()) {
            x340Var.i0(1470534770);
            x340Var.r(false);
            j2iVarR = null;
        } else {
            x340Var.i0(1470456341);
            j2iVarR = apo.r(775478567, new cc8(lc7Var, (byte) 4), x340Var);
            x340Var.r(false);
        }
        x340Var.r(false);
        return j2iVarR;
    }
}
