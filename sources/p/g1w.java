package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g1w implements l4h1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ g1w(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                goq goqVar = (goq) obj4;
                dg30 dg30Var = (dg30) obj5;
                return new f1w(new a2w(dg30Var, layoutInflater, viewGroup, (af10) goqVar.g, (Scheduler) goqVar.b, (mzr0) goqVar.c, (r0w) goqVar.d, (pp) goqVar.e, (l7m0) goqVar.f, (kt91) goqVar.h), (gdx0) obj2, dg30Var, (myv) obj, (q0w) obj3);
            case 1:
                return new a8y(layoutInflater.inflate(2131624582, viewGroup, false), (Observable) obj, (yjq) obj4, ((bgx) obj5).a((l0i) null), (kt91) obj3, (lzn0) obj2);
            case 2:
                re70 re70Var = (re70) obj;
                tm30 tm30Var = (tm30) obj5;
                if (bundle != null) {
                    tm30Var.c(bundle);
                }
                ie70 ie70Var = tm30Var.a;
                ie70Var.c(re70Var);
                ie70Var.a(tm30Var.d);
                tm30Var.d = null;
                View viewE = tm30Var.b.e();
                gs71 gs71VarT = zqo1.t((hs71) obj3, (String) obj2);
                if (gs71VarT != null) {
                    viewE.getClass();
                    viewE = gs71VarT.e(viewE, new tr71(fr71.a));
                }
                viewE.getClass();
                return new awa(viewE, (sp00) obj4, tm30Var, (byte) 1);
            case 3:
                nh00 nh00Var = (nh00) obj;
                uny unyVar = (uny) obj5;
                return new wod0(nh00Var.i, new goq(layoutInflater, viewGroup, (gw70) unyVar.c, (xfx) unyVar.b, (i7d) unyVar.d, (uny) obj3), (cir0) obj2, (haa0) obj4, new l6d0(nh00Var, (byte) 12));
            default:
                int i = kgr0.T0;
                return new ox11(xyn1.z(layoutInflater.inflate(2131625583, viewGroup, false)), (iac0) obj5, (vw11) obj, bundle, (znq) obj4, (hoc) obj3, (khc) obj2);
        }
    }
}
