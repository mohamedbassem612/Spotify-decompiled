package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Init;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x0w0 implements l4h1 {
    public final n2w0 a;
    public final uip0 b;
    public final w62 c;
    public final tzr0 d;
    public final fp7 e;

    public x0w0(n2w0 n2w0Var, uip0 uip0Var, w62 w62Var, tzr0 tzr0Var, fp7 fp7Var) {
        this.a = n2w0Var;
        this.b = uip0Var;
        this.c = w62Var;
        this.d = tzr0Var;
        this.e = fp7Var;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        t2w0 t2w0Var = (t2w0) obj;
        String strM = t2w0Var.b.i;
        int length = strM.length();
        n2w0 n2w0Var = this.a;
        if (length > 0) {
            n2w0Var.c.a(strM);
        }
        List list = t2w0Var.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((o3w0) obj2).j) {
                arrayList.add(obj2);
            }
        }
        if (!t2w0Var.s || strM.length() <= 0) {
            strM = l1d.m("spotify:prerelease:", t2w0Var.a);
        }
        Init k2w0Var = t2w0Var.l ? new k2w0() : new l2w0();
        m2w0 m2w0Var = new m2w0();
        o0w0 o0w0Var = n2w0Var.b;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        tr41 tr41Var = o0w0Var.e;
        Scheduler scheduler = o0w0Var.a;
        subtypeEffectHandlerBuilderC.d(k0w0.class, tr41Var, scheduler);
        subtypeEffectHandlerBuilderC.g(zzv0.class, o0w0Var.g);
        subtypeEffectHandlerBuilderC.d(f0w0.class, o0w0Var.h, scheduler);
        subtypeEffectHandlerBuilderC.d(a0w0.class, new n0w0(o0w0Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(c0w0.class, new n0w0(o0w0Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(b0w0.class, new n0w0(o0w0Var, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.b(j0w0.class, o0w0Var.d, scheduler);
        subtypeEffectHandlerBuilderC.d(d0w0.class, o0w0Var.i, scheduler);
        subtypeEffectHandlerBuilderC.g(l0w0.class, o0w0Var.j);
        subtypeEffectHandlerBuilderC.d(i0w0.class, o0w0Var.f, scheduler);
        subtypeEffectHandlerBuilderC.d(g0w0.class, o0w0Var.l, scheduler);
        subtypeEffectHandlerBuilderC.c(m0w0.class, o0w0Var.k);
        subtypeEffectHandlerBuilderC.g(e0w0.class, o0w0Var.m);
        subtypeEffectHandlerBuilderC.d(h0w0.class, o0w0Var.n, scheduler);
        MobiusLoop.Builder builderD = Mobius.d(m2w0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        yqu0 yqu0Var = n2w0Var.a;
        Observable[] observableArr = (Observable[]) p7h.M(new Observable[]{yoi1.i(new qsc0(((g0d0) yqu0Var.b).g, arrayList, yqu0Var, (byte) 25), o6x.a).distinctUntilChanged(), ((s4w0) yqu0Var.c).b(strM).map(yb10.e1).distinctUntilChanged()}).toArray(new Observable[0]);
        MobiusLoop.Controller controllerB = Mobius.b(builderD.h(RxEventSources.a((ObservableSource[]) Arrays.copyOf(observableArr, observableArr.length))), t2w0Var, k2w0Var, MainThreadWorkRunner.a());
        tzr0 tzr0Var = this.d;
        dzp0 dzp0Var = new dzp0(layoutInflater, viewGroup, (xfx) tzr0Var.b, (ivj1) tzr0Var.c, (af10) tzr0Var.d, ((rh4) tzr0Var.e).c());
        idd1 idd1Var = (idd1) dzp0Var.b;
        w62 w62Var = this.c;
        hoc hocVar = (hoc) w62Var.k;
        return new w0w0(controllerB, new bfz(new xmu0(new o0g1((ViewGroup) idd1Var.getValue(), (uhs) ((idd1) dzp0Var.c).getValue(), hocVar, (byte) 14), new z0w0(((ViewGroup) idd1Var.getValue()).getContext(), (RecyclerView) ((idd1) dzp0Var.d).getValue(), (kui0) w62Var.c, (kui0) w62Var.d, (kui0) w62Var.e, (kui0) w62Var.f, (kui0) w62Var.g, (bjx) w62Var.h, (typ) w62Var.i, ((rh4) w62Var.j).a(), hocVar, w62Var.b)), dzp0Var, t2w0Var, (bfz) this.b.b), this.e);
    }
}
