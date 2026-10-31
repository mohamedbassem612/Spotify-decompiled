package p;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mrd0 implements iyf0, eyf0 {
    public final llm N0;
    public tqd0 O0;
    public boolean P0;
    public boolean Q0;
    public final u9c0 S0;
    public srd0 T0;
    public volatile boolean V0;
    public final vq4 X;
    public final mr20 Y;
    public final q8n Z;
    public final dg30 a;
    public final th30 b;
    public final ynb0 c;
    public faa0 c1;
    public final kly0 d;
    public sn41 d1;
    public final ynb0 e;
    public yqd0 e1;
    public final Scheduler f;
    public volatile boolean f1;
    public final Scheduler g;
    public final ynb0 h;
    public final ynb0 i;
    public final ynb0 t;
    public final BehaviorSubject R0 = BehaviorSubject.f();
    public final BehaviorSubject U0 = BehaviorSubject.g(Boolean.FALSE);
    public final idd1 W0 = new idd1(new hrd0(this, (byte) 9));
    public final idd1 X0 = new idd1(new cc00(this, (byte) 23));
    public final idd1 Y0 = new idd1(new hrd0(this, (byte) 10));
    public final idd1 Z0 = new idd1(new hrd0(this, (byte) 11));
    public final idd1 a1 = new idd1(new hrd0(this, (byte) 12));
    public final idd1 b1 = new idd1(new hrd0(this, (byte) 13));
    public final SerialDisposable g1 = new SerialDisposable();
    public final SerialDisposable h1 = new SerialDisposable();

    public mrd0(dg30 dg30Var, th30 th30Var, ynb0 ynb0Var, kly0 kly0Var, ynb0 ynb0Var2, Scheduler scheduler, Scheduler scheduler2, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, vq4 vq4Var, mr20 mr20Var, q8n q8nVar, llm llmVar) {
        this.a = dg30Var;
        this.b = th30Var;
        this.c = ynb0Var;
        this.d = kly0Var;
        this.e = ynb0Var2;
        this.f = scheduler;
        this.g = scheduler2;
        this.h = ynb0Var3;
        this.i = ynb0Var4;
        this.t = ynb0Var5;
        this.X = vq4Var;
        this.Y = mr20Var;
        this.Z = q8nVar;
        this.N0 = llmVar;
        this.S0 = cto1.q(dg30Var);
    }

    @Override // p.eyf0
    public final void a(Intent intent) {
        ComponentName component = intent.getComponent();
        String className = component != null ? component.getClassName() : null;
        if (className != null && className.hashCode() == 461356827 && className.equals("com.spotify.music.SpotifyEntryPointForGoogleMeet")) {
            this.V0 = true;
            this.U0.onNext(Boolean.TRUE);
        }
    }

    public final p350 b() {
        if (this.X.a()) {
            return new p350(this);
        }
        return null;
    }

    @Override // p.iyf0
    public final void c() {
        faa0 faa0Var = this.c1;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.c1 = c921.y(this.S0, this.Z, 0, new p6d0(this, (lnm) null, (byte) 4), 2);
        this.f1 = true;
        sn41 sn41Var = this.d1;
        if (sn41Var != null) {
            sn41Var.dispose();
        }
        this.d1 = null;
        this.f1 = false;
        xm41 xm41Var = (xm41) this.d.get();
        xy50 xy50Var = new xy50(this, (byte) 9);
        SerialDisposable serialDisposable = new SerialDisposable();
        sam0 sam0Var = (sam0) xm41Var;
        this.d1 = new sn41(serialDisposable, sam0Var.e(new g521(serialDisposable, (byte) 23), new hf31(serialDisposable, xy50Var, (byte) 19)));
    }

    @Override // p.iyf0
    public final void d() {
        faa0 faa0Var = this.c1;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.f1 = true;
        sn41 sn41Var = this.d1;
        if (sn41Var != null) {
            sn41Var.dispose();
        }
        this.d1 = null;
        this.f1 = false;
        srd0 srd0Var = this.T0;
        if (srd0Var != null) {
            srd0Var.b.set(null);
        }
        this.T0 = null;
        e();
        h().b();
    }

    public final void e() {
        this.h1.a(EmptyDisposable.a);
        t2u t2uVar = this.O0;
        if (t2uVar == null) {
            return;
        }
        this.O0 = null;
        if (!(t2uVar instanceof t2u)) {
            t2uVar.dismiss();
            return;
        }
        t2u t2uVar2 = t2uVar;
        if (((zf30) t2uVar2).U0 != null) {
            t2uVar2.Y0();
        }
    }

    public final d350 f() {
        return (d350) this.W0.getValue();
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
        idd1 idd1Var = this.b1;
        ((oe41) idd1Var.getValue()).c("live_sharing_plugin_saved_state_registry_key", new uk(this, (byte) 9));
        Bundle bundleA = ((oe41) idd1Var.getValue()).a("live_sharing_plugin_saved_state_registry_key");
        if (bundleA != null) {
            this.P0 = bundleA.getBoolean("live_sharing_session_dismissed");
            this.Q0 = this.X.a() ? bundleA.getBoolean("live_sharing_banner_dismissed") : false;
            Object obj = (grd0) jhc1.t(bundleA, "live_sharing_dialog", grd0.class);
            if (obj == null) {
                obj = drd0.a;
            }
            this.R0.onNext(obj);
        }
    }

    public final q350 h() {
        return (q350) this.Z0.getValue();
    }

    public final void j(tqd0 tqd0Var, boolean z) {
        e();
        th30 th30Var = this.b;
        if (th30Var.L) {
            Logger.k("Skipping live session dialog, FragmentManager is destroyed", new Object[0]);
            return;
        }
        if (!th30Var.U()) {
            this.O0 = tqd0Var;
            tqd0Var.m(th30Var);
        } else {
            if (!z) {
                Logger.k("Skipping live session dialog, FragmentManager state is saved", new Object[0]);
                return;
            }
            this.h1.a(this.f.c(new nx30(this, tqd0Var, (byte) 29)));
        }
    }
}
