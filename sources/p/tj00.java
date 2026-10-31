package p;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.home.evopage.mobius.Event;
import com.spotify.home.evopage.mobius.e;
import com.spotify.home.evopage.structureapi.DismissedEntity;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tj00 extends x7e0 implements com.spotify.home.evopage.structureapi.a, b031 {
    public final v4r0 N0;
    public final w25 O0;
    public final kdn0 P0;
    public final kdn0 Q0;
    public final CompositeDisposable R0;
    public MobiusLoop S0;
    public Disposable T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public final qj00 X;
    public rj00 X0;
    public final ynb0 Y;
    public final hq60 Y0;
    public final v6a0 Z;
    public dq60 Z0;
    public final Activity d;
    public final e e;
    public final ml00 f;
    public final tp60 g;
    public final wo60 h;
    public final bn70 i;
    public final iac0 t;

    public tj00(pj00 pj00Var, Activity activity, e eVar, ml00 ml00Var, tp60 tp60Var, wo60 wo60Var, bn70 bn70Var, iac0 iac0Var, qj00 qj00Var, ynb0 ynb0Var, v6a0 v6a0Var, v4r0 v4r0Var, w25 w25Var) {
        this.d = activity;
        this.e = eVar;
        this.f = ml00Var;
        this.g = tp60Var;
        this.h = wo60Var;
        this.i = bn70Var;
        this.t = iac0Var;
        this.X = qj00Var;
        this.Y = ynb0Var;
        this.Z = v6a0Var;
        this.N0 = v4r0Var;
        this.O0 = w25Var;
        kdn0 kdn0Var = new kdn0();
        this.P0 = kdn0Var;
        this.Q0 = kdn0Var;
        this.R0 = new CompositeDisposable();
        this.U0 = true;
        this.Y0 = tp60Var.o();
        Logger.b("EvoLoadableResource :: init", new Object[0]);
        iac0Var.getLifecycle().a(pj00Var);
    }

    @Override // p.b031
    public final void a(Bundle bundle) {
        this.V0 = bundle.getBoolean("isRestored", false);
    }

    @Override // p.x7e0
    public final void e() {
        this.g.e(this.Y0);
        this.h.l();
        Logger.b("EvoLoadableResource :: onStart", new Object[0]);
        cc00 cc00Var = new cc00(this, (byte) 1);
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            cc00Var.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new a6n(cc00Var, (byte) 19));
        }
    }

    @Override // p.x7e0
    public final void f() {
        Logger.b("EvoLoadableResource :: onStop", new Object[0]);
        this.W0 = true;
        rj00 rj00Var = this.X0;
        if (rj00Var != null) {
            if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                this.t.getLifecycle().d(rj00Var);
            } else {
                new Handler(Looper.getMainLooper()).post(new nx30(this, rj00Var, (byte) 23));
            }
        }
        this.X0 = null;
        this.X.c();
        this.R0.g();
        Disposable disposable = this.T0;
        if (disposable == null) {
            u890.C("loopDisposable");
            throw null;
        }
        disposable.dispose();
        ml00 ml00Var = this.f;
        ml00Var.g = true;
        Iterator it = ml00Var.e.iterator();
        while (it.hasNext()) {
            ((hs80) it.next()).dispose();
        }
        MobiusLoop mobiusLoop = this.S0;
        if (mobiusLoop == null) {
            u890.C("loop");
            throw null;
        }
        mobiusLoop.dispose();
        this.g.m(3, this.d);
        wo60 wo60Var = this.h;
        wo60Var.b();
        wo60Var.a();
    }

    public final void k(String str, DismissedEntity.Type type) {
        DismissedEntity dismissedEntity = new DismissedEntity(str, type);
        if (type != DismissedEntity.Type.SHOWCASE) {
            l(new Event.DismissSection(dismissedEntity));
        } else {
            bpb1 bpb1Var = ((yxd1) this.Y.get()).a;
            bpb1Var.m(null, dm61.x0(dismissedEntity, (Set) bpb1Var.getValue()));
        }
    }

    public final void l(Event event) {
        Object m231Var;
        MobiusLoop mobiusLoop = this.S0;
        if (mobiusLoop == null || this.W0) {
            return;
        }
        try {
            mobiusLoop.a(event);
            m231Var = rih1.a;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            n57.t("Failed to dispatch event to loop: " + event, thA);
        }
    }

    public final void m(String str, DismissedEntity.Type type) {
        l(new Event.UndoDismissSection(new DismissedEntity(str, type)));
    }

    @Override // p.b031
    public final Bundle serialize() {
        return mno1.h(new mmr0[]{oqn1.n("isRestored", Boolean.TRUE)});
    }
}
