package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.SpotifyMainActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qva extends fac0 implements fwa, jik1, ug30, o6r0 {
    public i8h1 G1;
    public Flowable H1;
    public SpotifyMainActivity I1;
    public gw70 J1;
    public Scheduler K1;
    public fp8 L1;
    public gxn M1;
    public xf4 N1;
    public iw4 O1;
    public ewa P1;
    public tva Q1;
    public uo5 R1;
    public lik1 S1;
    public rm5 T1;
    public boolean U1;
    public final vq6 V1;
    public ewa W1;

    public qva(vq6 vq6Var) {
        this.V1 = vq6Var;
    }

    public final String A(Context context) {
        return "";
    }

    @Override // p.fwa
    public final void B(String str) {
        this.Q1.B(str);
    }

    @Override // p.fwa
    public final void D(Throwable th) {
        this.Q1.D(th);
    }

    @Override // p.fwa
    public final void F(String str) {
        this.Q1.F(str);
    }

    @Override // p.fac0, p.zf30
    public final void F0(Bundle bundle) {
        super.F0(bundle);
        ewa ewaVar = this.P1;
        if (ewaVar != null) {
            ewaVar.d(bundle);
        }
    }

    @Override // p.fac0, p.zf30
    public final void G0() {
        super.G0();
        this.P1.e(this);
    }

    @Override // p.fac0, p.zf30
    public final void H0() {
        super.H0();
        this.P1.f();
    }

    @Override // p.fwa
    public final void I(String str) {
        this.Q1.I(str);
    }

    @Override // p.fwa
    public final void K(String str, String str2, String str3) {
        this.Q1.K(str, str2, str3);
    }

    public final gn10 Q() {
        return mno1.u;
    }

    @Override // p.fwa
    public final void S(fxn fxnVar) {
        this.Q1.S(fxnVar);
        this.O1.c();
    }

    @Override // p.fwa
    public final void T(String str) {
        this.Q1.T(str);
    }

    @Override // p.fwa
    public final void U() {
        this.Q1.U();
    }

    @Override // p.fwa
    public final void W() {
        this.Q1.W();
    }

    @Override // p.fwa
    public final void Z(String str) {
        this.Q1.Z(str);
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.m(yon1.O());
    }

    @Override // p.fwa
    public final void d(boolean z) {
        this.Q1.d(z);
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.O();
    }

    @Override // p.fwa
    public final void g(String str) {
        this.Q1.g(str);
    }

    public final lik1 getViewUri() {
        return this.S1;
    }

    @Override // p.fwa
    public final void h(List list) {
        this.Q1.h(list);
    }

    @Override // p.fwa
    public final void n(List list) {
        this.Q1.n(list);
    }

    @Override // p.fwa
    public final void r() {
        this.Q1.getClass();
    }

    public final String s() {
        return this.S1.a;
    }

    @Override // p.zf30
    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    @Override // p.fwa
    public final void w() {
        this.Q1.w();
    }

    @Override // p.fac0, p.zf30
    public final void w0(Bundle bundle) {
        super.w0(bundle);
        this.U1 = xoi1.a(h0());
        lik1 parcelable = O0().getParcelable("artist_uri");
        parcelable.getClass();
        this.S1 = parcelable;
        String str = parcelable.a;
        this.R1 = new uo5(str);
        this.T1 = new rm5(str, this.G1);
        U0();
    }

    @Override // p.fwa
    public final void x(String str) {
        this.Q1.x(str);
    }

    @Override // p.zf30
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ewa ewaVar = this.P1;
        if (ewaVar == null) {
            String str = (String) this.R1.c;
            boolean zH = this.N1.h();
            gxn gxnVar = this.M1;
            Observable observable = zH ? gxnVar.b(str).toObservable() : gxnVar.a(str).toObservable();
            Scheduler scheduler = this.K1;
            Flowable flowable = this.H1;
            ewaVar = new ewa(scheduler, observable, x0d.j(flowable, flowable), this.T1, this, (String) this.R1.b);
            this.W1 = ewaVar;
            this.P1 = ewaVar;
        }
        ewaVar.c(bundle);
        tva tvaVar = new tva(h0(), layoutInflater, this.J1, this.T1, this.U1, this.N1.z(), this.N1.A());
        this.Q1 = tvaVar;
        tvaVar.e(new pva(this, (byte) 0));
        this.Q1.c(new pva(this, (byte) 1));
        this.Q1.getClass();
        iw4 iw4Var = (iw4) this.L1.b;
        this.O1 = iw4Var;
        xh3 xh3Var = new xh3(this, (byte) 13);
        iw4Var.f = null;
        iw4Var.e = xh3Var;
        iw4Var.e(1, true);
        int i = kgr0.T0;
        return xyn1.z(this.Q1.b());
    }

    @Override // p.fwa
    public final void y() {
        if (f0() != null) {
            f0().invalidateOptionsMenu();
        }
    }

    @Override // p.zf30
    public final void z0() {
        this.h1 = true;
        this.O1.b(3);
    }
}
