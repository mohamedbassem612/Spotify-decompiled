package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class te7 implements l4h1 {
    public final i1p a;
    public final j1p b;
    public final cir0 c;

    public te7(i1p i1pVar, j1p j1pVar, cir0 cir0Var) {
        this.a = i1pVar;
        this.b = j1pVar;
        this.c = cir0Var;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        voa voaVar = (voa) this.b.a.c;
        Context contextA = ((oe7) voaVar.b).a();
        c8o.l(contextA);
        nd51 nd51Var = (nd51) ((jly0) voaVar.A).get();
        i8h1 i8h1VarZ = u1n0.z((q7r0) voaVar.c);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        em3 em3Var = new em3(i8h1VarZ, new bqk0(yon1.G1("ASSISTED_CURATION_SEARCH", "assisted-curation/search", 183, "assisted-curation").path(), voaVar.l().a, (byte) 8), (byte) 21);
        oe7 oe7Var = (oe7) voaVar.b;
        xfx xfxVarB = oe7Var.b();
        c8o.l(xfxVarB);
        wy6 wy6Var = new wy6(new igx(xfxVarB.c, (byte) 6), (byte) 1);
        xfx xfxVarB2 = oe7Var.b();
        c8o.l(xfxVarB2);
        hh3 hh3Var = new hh3(new pp(xfxVarB2.c, (byte) 2), (byte) 0);
        luk lukVar = (luk) oe7Var.s.get();
        c8o.l(lukVar);
        qdy0 qdy0Var = new qdy0(new pl4(lukVar));
        v6q v6qVar = (v6q) oe7Var.E.get();
        c8o.l(v6qVar);
        umf0 umf0Var = new umf0(v6qVar, (d0r) ((jly0) voaVar.y).get());
        xfx xfxVarB3 = oe7Var.b();
        c8o.l(xfxVarB3);
        ndz ndzVar = new ndz(qdy0Var, umf0Var, new igx(xfxVarB3.c, (byte) 7), (byte) 1);
        xfx xfxVarB4 = oe7Var.b();
        c8o.l(xfxVarB4);
        wy6 wy6Var2 = new wy6(new pp(xfxVarB4.c, (byte) 3), (byte) 0);
        luk lukVar2 = (luk) oe7Var.s.get();
        c8o.l(lukVar2);
        qdy0 qdy0Var2 = new qdy0(new pl4(lukVar2));
        xfx xfxVarB5 = oe7Var.b();
        c8o.l(xfxVarB5);
        pp ppVar = new pp(xfxVarB5.c, (byte) 26);
        kly0 kly0Var = oe7Var.B;
        ufs ufsVar = (ufs) kly0Var.get();
        c8o.l(ufsVar);
        ndz ndzVar2 = new ndz(qdy0Var2, ppVar, ufsVar, (byte) 0);
        xfx xfxVarB6 = oe7Var.b();
        c8o.l(xfxVarB6);
        hh3 hh3Var2 = new hh3(new pp(xfxVarB6.c, (byte) 2), (byte) 1);
        ufs ufsVar2 = (ufs) kly0Var.get();
        c8o.l(ufsVar2);
        xfx xfxVarB7 = oe7Var.b();
        c8o.l(xfxVarB7);
        id8 id8Var = new id8(ufsVar2, new pp(xfxVarB7.c, (byte) 4), (byte) 0);
        Context contextA2 = oe7Var.a();
        c8o.l(contextA2);
        xfx xfxVarB8 = oe7Var.b();
        c8o.l(xfxVarB8);
        id8 id8Var2 = new id8(contextA2, new yfx(xfxVarB8.e, (byte) 1), (byte) 1);
        kly0 kly0Var2 = oe7Var.g;
        Activity activity = (Activity) kly0Var2.get();
        c8o.l(activity);
        bgg bggVar = new bgg(activity, (byte) 1);
        Activity activity2 = (Activity) kly0Var2.get();
        c8o.l(activity2);
        List listM = p7h.M(new ey31[]{wy6Var, hh3Var, ndzVar, wy6Var2, ndzVar2, hh3Var2, id8Var, id8Var2, bggVar, new bgg(activity2, (byte) 0)});
        Executor executor = (Executor) oe7Var.e.get();
        c8o.l(executor);
        lcb0 lcb0Var = new lcb0(listM, executor);
        String str = ((pe7) voaVar.a).c;
        c8o.m(str);
        xfx xfxVarB9 = oe7Var.b();
        c8o.l(xfxVarB9);
        t8x t8xVar = new t8x(xfxVarB9.f, (byte) 1);
        xfx xfxVarB10 = oe7Var.b();
        c8o.l(xfxVarB10);
        mg7 mg7Var = new mg7(contextA, nd51Var, em3Var, lcb0Var, str, t8xVar, new t8x(xfxVarB10.f, (byte) 6), (k1p) ((jly0) voaVar.B).get(), (l1p) ((jly0) voaVar.C).get(), layoutInflater, viewGroup, bundle);
        return new se7(mg7Var, this.a.a(this.c, (le7) obj, mg7Var).a());
    }
}
