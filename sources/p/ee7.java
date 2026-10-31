package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ee7 implements l4h1 {
    public final i1p a;
    public final f1p b;
    public final cir0 c;

    public ee7(i1p i1pVar, f1p f1pVar, cir0 cir0Var) {
        this.a = i1pVar;
        this.b = f1pVar;
        this.c = cir0Var;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        yxo yxoVar = (yxo) this.b.a.c;
        Context contextA = ((ae7) yxoVar.d).a();
        c8o.l(contextA);
        nd51 nd51Var = (nd51) yxoVar.b1.get();
        i8h1 i8h1VarZ = u1n0.z((q7r0) yxoVar.e);
        be7 be7Var = (be7) yxoVar.c;
        p6r0 p6r0VarE = be7Var.d.e();
        c8o.m(p6r0VarE);
        em3 em3Var = new em3(i8h1VarZ, new bqk0(p6r0VarE.path(), yxoVar.d().a, (byte) 8), (byte) 21);
        ae7 ae7Var = (ae7) yxoVar.d;
        xfx xfxVarB = ae7Var.b();
        c8o.l(xfxVarB);
        wy6 wy6Var = new wy6(new igx(xfxVarB.c, (byte) 6), (byte) 1);
        xfx xfxVarB2 = ae7Var.b();
        c8o.l(xfxVarB2);
        hh3 hh3Var = new hh3(new pp(xfxVarB2.c, (byte) 2), (byte) 0);
        luk lukVar = (luk) ae7Var.s.get();
        c8o.l(lukVar);
        qdy0 qdy0Var = new qdy0(new pl4(lukVar));
        v6q v6qVar = (v6q) ae7Var.E.get();
        c8o.l(v6qVar);
        umf0 umf0Var = new umf0(v6qVar, (d0r) yxoVar.Z0.get());
        xfx xfxVarB3 = ae7Var.b();
        c8o.l(xfxVarB3);
        ndz ndzVar = new ndz(qdy0Var, umf0Var, new igx(xfxVarB3.c, (byte) 7), (byte) 1);
        xfx xfxVarB4 = ae7Var.b();
        c8o.l(xfxVarB4);
        wy6 wy6Var2 = new wy6(new pp(xfxVarB4.c, (byte) 3), (byte) 0);
        luk lukVar2 = (luk) ae7Var.s.get();
        c8o.l(lukVar2);
        qdy0 qdy0Var2 = new qdy0(new pl4(lukVar2));
        xfx xfxVarB5 = ae7Var.b();
        c8o.l(xfxVarB5);
        pp ppVar = new pp(xfxVarB5.c, (byte) 26);
        kly0 kly0Var = ae7Var.B;
        ufs ufsVar = (ufs) kly0Var.get();
        c8o.l(ufsVar);
        ndz ndzVar2 = new ndz(qdy0Var2, ppVar, ufsVar, (byte) 0);
        xfx xfxVarB6 = ae7Var.b();
        c8o.l(xfxVarB6);
        hh3 hh3Var2 = new hh3(new pp(xfxVarB6.c, (byte) 2), (byte) 1);
        ufs ufsVar2 = (ufs) kly0Var.get();
        c8o.l(ufsVar2);
        xfx xfxVarB7 = ae7Var.b();
        c8o.l(xfxVarB7);
        id8 id8Var = new id8(ufsVar2, new pp(xfxVarB7.c, (byte) 4), (byte) 0);
        Context contextA2 = ae7Var.a();
        c8o.l(contextA2);
        xfx xfxVarB8 = ae7Var.b();
        c8o.l(xfxVarB8);
        id8 id8Var2 = new id8(contextA2, new yfx(xfxVarB8.e, (byte) 1), (byte) 1);
        kly0 kly0Var2 = ae7Var.g;
        Activity activity = (Activity) kly0Var2.get();
        c8o.l(activity);
        bgg bggVar = new bgg(activity, (byte) 1);
        Activity activity2 = (Activity) kly0Var2.get();
        c8o.l(activity2);
        List listM = p7h.M(new ey31[]{wy6Var, hh3Var, ndzVar, wy6Var2, ndzVar2, hh3Var2, id8Var, id8Var2, bggVar, new bgg(activity2, (byte) 0)});
        Executor executor = (Executor) ae7Var.e.get();
        c8o.l(executor);
        lcb0 lcb0Var = new lcb0(listM, executor);
        String str = be7Var.c;
        c8o.m(str);
        return new de7(new he7(contextA, nd51Var, em3Var, lcb0Var, str, layoutInflater, viewGroup, bundle), this.a.a(this.c, (le7) obj, zhm0.g).a());
    }
}
