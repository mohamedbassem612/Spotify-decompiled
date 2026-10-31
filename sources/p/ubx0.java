package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ubx0 implements l4h1 {
    public final yqu0 a;
    public final k8x0 b;
    public final sbx0 c;
    public final cbx0 d;

    public ubx0(yqu0 yqu0Var, k8x0 k8x0Var, sbx0 sbx0Var, cbx0 cbx0Var) {
        this.a = yqu0Var;
        this.b = k8x0Var;
        this.c = sbx0Var;
        this.d = cbx0Var;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        String str;
        j8x0 j8x0Var;
        Observable observable = (Observable) obj;
        Set set = s4b1.f;
        sbx0 sbx0Var = this.c;
        String str2 = sbx0Var.b;
        s4b1 s4b1VarX = uic.x(sbx0Var.a);
        k8x0 k8x0Var = this.b;
        int iC = l1d.C(k8x0Var.type());
        if (iC != 4) {
            str = iC != 5 ? null : "friendsProfileListData";
        } else {
            str = "blockedUsersProfileListData";
        }
        if (bundle == null || str == null || (j8x0Var = (j8x0) jhc1.t(bundle, str, j8x0.class)) == null) {
            j8x0Var = j8x0.h;
        }
        String strB = k8x0Var.b();
        int iType = k8x0Var.type();
        String strJ = k8x0Var.j();
        String strL = k8x0Var.l();
        boolean zJ = u890.j(s4b1VarX.s(), str2);
        r830 r830Var = r830.PROFILES;
        yqu0 yqu0Var = this.a;
        g1b g1bVar = new g1b(layoutInflater, viewGroup, (i8x0) yqu0Var.c, (s880) yqu0Var.b);
        boolean z = iType == 3 || (iType == 1 && zJ);
        cbx0 cbx0Var = this.d;
        uip0 uip0Var = cbx0Var.h;
        xmu0 xmu0Var = cbx0Var.d;
        zsc zscVar = cbx0Var.e;
        j8x0 j8x0Var2 = j8x0Var;
        o730 o730Var = cbx0Var.l;
        Scheduler scheduler = cbx0Var.c;
        uu0 uu0Var = cbx0Var.f;
        kt91 kt91Var = cbx0Var.g;
        Activity activity = cbx0Var.i;
        e630 e630Var = cbx0Var.j;
        kp5 kp5Var = cbx0Var.n;
        j0a1 j0a1Var = cbx0Var.k;
        q8n q8nVar = cbx0Var.q;
        boolean z2 = z;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(o8x0.class, new o4e0(observable, (byte) 23));
        subtypeEffectHandlerBuilderC.g(p8x0.class, new p9x0(k8x0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(w8x0.class, new p9x0(k8x0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.d(r8x0.class, new q9x0(xmu0Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(v8x0.class, new r9x0(uu0Var, (byte) 3), scheduler);
        subtypeEffectHandlerBuilderC.d(s8x0.class, new r9x0(uu0Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(t8x0.class, new r9x0(uu0Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(b9x0.class, new t9x0(uip0Var, kt91Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(i9x0.class, new t9x0(uip0Var, kt91Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(j9x0.class, new lyw0(o730Var, (byte) 3), scheduler);
        subtypeEffectHandlerBuilderC.g(k9x0.class, new z1x0(zscVar, (byte) 1));
        subtypeEffectHandlerBuilderC.d(z8x0.class, new l5x0(kt91Var, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.d(h9x0.class, new l5x0(kt91Var, (byte) 3), scheduler);
        subtypeEffectHandlerBuilderC.d(a9x0.class, new hi1(e630Var, activity, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.d(q8x0.class, new q9x0(xmu0Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(u8x0.class, new r9x0(uu0Var, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.g(y8x0.class, new u5x0(scheduler, kp5Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(x8x0.class, new k5x0(q8nVar, j0a1Var, (byte) 5));
        subtypeEffectHandlerBuilderC.d(g9x0.class, new t9x0(uip0Var, kt91Var, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.g(m8x0.class, new k5x0(q8nVar, j0a1Var, (byte) 3));
        subtypeEffectHandlerBuilderC.d(d9x0.class, new t9x0(uip0Var, kt91Var, (byte) 3), scheduler);
        subtypeEffectHandlerBuilderC.d(c9x0.class, new t9x0(uip0Var, kt91Var, (byte) 4), scheduler);
        subtypeEffectHandlerBuilderC.g(n8x0.class, new k5x0(q8nVar, j0a1Var, (byte) 4));
        subtypeEffectHandlerBuilderC.d(f9x0.class, new t9x0(uip0Var, kt91Var, (byte) 5), scheduler);
        subtypeEffectHandlerBuilderC.d(e9x0.class, new t9x0(uip0Var, kt91Var, (byte) 6), scheduler);
        MobiusLoop.Builder builderD = Mobius.d(zax0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        ao30 ao30Var = cbx0Var.o;
        kbd kbdVar = cbx0Var.f3p;
        ObservableSource observableSourceJust = Observable.just(kax0.a);
        c1v0 c1v0Var = new c1v0(rqt0.u(kbdVar.b()), (byte) 25);
        o6x o6xVar = o6x.a;
        return new tbx0(g1bVar, Mobius.c(l1d.g(builderD.h(RxEventSources.a(new ObservableSource[]{observableSourceJust, yoi1.i(c1v0Var, o6xVar), yoi1.i(new dwv(j0a1Var.b, (byte) 16), o6xVar), yoi1.i(new hxk(o730Var.d, (byte) 3), o6xVar), yoi1.i(new hxk(ao30Var.b, (byte) 4), o6xVar)})).b(new abx0(cbx0Var)).d(new bbx0(cbx0Var))), new qbx0(strB, iType, str2, zJ, (3039 & 16) != 0 ? j8x0Var2 : null, (3039 & 32) != 0 ? false : z2, strJ, strL, 0, (3039 & 512) != 0 ? r830Var : null, (3039 & 1024) != 0 ? false : cbx0Var.m.a.m(), false), MainThreadWorkRunner.a()));
    }
}
