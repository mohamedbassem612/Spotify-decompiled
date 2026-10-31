package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fq81 extends zf30 implements lir0 {
    public final hq81 F1;
    public eyd1 G1;
    public ohv0 H1;
    public mq81 I1;
    public fd J1;
    public xfx K1;
    public f69 L1;
    public wnh1 M1;
    public wnh1 N1;
    public mir0 O1;
    public t8h1 P1;
    public i8h1 Q1;
    public vzl0 R1;
    public g1f0 S1;
    public mwn0 T1;
    public final PublishSubject U1 = new PublishSubject();
    public MobiusLoop.Controller V1;
    public qq81 W1;

    static {
        new twa();
    }

    public fq81(hq81 hq81Var) {
        this.F1 = hq81Var;
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        wnh1.H(Y0());
        MobiusLoop.Controller controller = this.V1;
        if (controller != null) {
            controller.stop();
        }
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        MobiusLoop.Controller controller = this.V1;
        if (controller != null) {
            controller.start();
        }
    }

    public final void F0(Bundle bundle) {
        Bundle bundleI;
        MobiusLoop.Controller controller = this.V1;
        if (controller != null) {
            this.W1 = (qq81) controller.a();
        }
        bundle.putParcelable("KEY_SIGNUP_MODEL", this.W1);
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 == null || !dg30VarF0.isChangingConfigurations() || (bundleI = Y0().I()) == null) {
            return;
        }
        bundle.putBundle("PBL_STATE", bundleI);
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        Y0().G();
    }

    public final wnh1 Y0() {
        wnh1 wnh1Var = this.M1;
        if (wnh1Var != null) {
            return wnh1Var;
        }
        u890.C("pageBoundUbiLogger");
        throw null;
    }

    @Override // p.lir0
    /* JADX INFO: renamed from: c */
    public final mir0 getU1() {
        mir0 mir0Var = this.O1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle != null) {
            this.W1 = bundle.getParcelable("KEY_SIGNUP_MODEL");
            Bundle bundle2 = bundle.getBundle("PBL_STATE");
            if (bundle2 != null) {
                Y0().y(bundle2);
            }
        }
        N0().J().a(this, new ydb(this, (byte) 27));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        Throwable th;
        String str;
        qq81 qq81VarA = this.W1;
        if (qq81VarA == null) {
            qq81VarA = null;
        }
        if (qq81VarA == null) {
            qq81 qq81Var = new qq81(O0().getBoolean("skip_email"), O0().getString("graduation_identifier_token"));
            String string = O0().getString("email");
            bk8 bk8Var = (bk8) O0().getSerializable("auth_source");
            if (bk8Var == null) {
                eg.m("Required value was null.");
                return null;
            }
            String string2 = O0().getString("identifier_token");
            String string3 = O0().getString("display_name");
            String string4 = O0().getString("phone_number");
            if (string2 != null) {
                str = string3;
                th = null;
                qq81Var = qq81.a(qq81Var, (oq81) null, (nxw) null, (v6s0) null, (th2) null, (id40) null, (wjn0) null, false, string2, (bk8) null, 0, (String) null, 16255);
            } else {
                str = string3;
                th = null;
            }
            qq81 qq81VarA2 = qq81Var;
            if (string != null) {
                qq81VarA2 = qq81.a(qq81VarA2, (oq81) null, new nxw(new dyw(string), 8), (v6s0) null, (th2) null, (id40) null, (wjn0) null, false, (String) null, (bk8) null, 0, (String) null, 16381);
            }
            qq81 qq81VarA3 = qq81VarA2;
            if (str != null && !ihc1.y0(str)) {
                qq81VarA3 = qq81.a(qq81VarA3, (oq81) null, (nxw) null, (v6s0) null, (th2) null, (id40) null, new wjn0(new ujn0(str), 14), false, (String) null, (bk8) null, 0, (String) null, 16351);
            }
            qq81 qq81VarA4 = qq81VarA3;
            if (string4 != null) {
                qq81VarA4 = qq81.a(qq81VarA4, (oq81) null, (nxw) null, (v6s0) null, (th2) null, (id40) null, (wjn0) null, false, (String) null, (bk8) null, 0, string4, 8191);
            }
            qq81 qq81Var2 = qq81VarA4;
            th2 th2VarX = rc2.x();
            g1f0 g1f0Var = this.S1;
            if (g1f0Var == null) {
                u890.C("remoteProperties");
                throw th;
            }
            boolean z = g1f0Var.L() && qq81Var2.g() == null;
            g1f0 g1f0Var2 = this.S1;
            if (g1f0Var2 == null) {
                u890.C("remoteProperties");
                throw th;
            }
            qq81VarA = qq81.a(qq81Var2, (oq81) null, (nxw) null, (v6s0) null, th2.a(th2VarX, 0, 0, 0, (yj2) null, z, g1f0Var2.H() && qq81Var2.g() == null, 15), (id40) null, (wjn0) null, false, (String) null, bk8Var, 0, (String) null, 16119);
        } else {
            th = null;
        }
        qq81 qq81Var3 = qq81VarA;
        Context contextP0 = P0();
        i8h1 i8h1Var = this.Q1;
        if (i8h1Var == null) {
            Throwable th2 = th;
            u890.C("ubiLogger");
            throw th2;
        }
        vzl0 vzl0Var = this.R1;
        if (vzl0Var == null) {
            Throwable th3 = th;
            u890.C("accountAlreadyExistsEventFactory");
            throw th3;
        }
        t8h1 t8h1Var = this.P1;
        if (t8h1Var == null) {
            Throwable th4 = th;
            u890.C("locationChangeListener");
            throw th4;
        }
        mwn0 mwn0Var = this.T1;
        if (mwn0Var == null) {
            Throwable th5 = th;
            u890.C("navigationLogger");
            throw th5;
        }
        y3u y3uVar = new y3u(contextP0, i8h1Var, vzl0Var, t8h1Var, mwn0Var);
        hd40 hd40VarB = qq81Var3.b().b();
        LayoutInflater layoutInflaterB0 = ((zf30) this).o1;
        if (layoutInflaterB0 == null) {
            layoutInflaterB0 = B0(th);
            ((zf30) this).o1 = layoutInflaterB0;
        }
        LayoutInflater layoutInflater2 = layoutInflaterB0;
        eyd1 eyd1Var = this.G1;
        if (eyd1Var == null) {
            u890.C("termsAndConditionsDialogs");
            throw null;
        }
        ohv0 ohv0Var = this.H1;
        if (ohv0Var == null) {
            u890.C("authTracker");
            throw null;
        }
        pxw pxwVarN = hon1.n(qq81Var3);
        d781 d781Var = new d781(this, (byte) 13);
        fd fdVar = this.J1;
        if (fdVar == null) {
            u890.C("acceptanceRowModelMapper");
            throw null;
        }
        xfx xfxVar = this.K1;
        if (xfxVar == null) {
            u890.C("encoreConsumerEntryPoint");
            throw null;
        }
        pp ppVarA = epo1.A(xfxVar.c);
        f69 f69Var = this.L1;
        if (f69Var == null) {
            u890.C("autofillManagerClient");
            throw null;
        }
        g1f0 g1f0Var3 = this.S1;
        if (g1f0Var3 == null) {
            u890.C("remoteProperties");
            throw null;
        }
        boolean zN = g1f0Var3.N();
        g1f0 g1f0Var4 = this.S1;
        if (g1f0Var4 == null) {
            u890.C("remoteProperties");
            throw null;
        }
        boolean zG = g1f0Var4.g();
        int iL = twa.l(qq81Var3);
        t8h1 t8h1Var2 = this.P1;
        if (t8h1Var2 == null) {
            u890.C("locationChangeListener");
            throw null;
        }
        fe81 fe81Var = new fe81(this, (byte) 5);
        wnh1 wnh1Var = this.N1;
        if (wnh1Var == null) {
            u890.C("ageConfirmationDialogUbiLogger");
            throw null;
        }
        Connectable kr81Var = new kr81(hd40VarB, layoutInflater2, eyd1Var, y3uVar, ohv0Var, pxwVarN, d781Var, fdVar, ppVarA, f69Var, zN, zG, iL, t8h1Var2, fe81Var, wnh1Var);
        mq81 mq81Var = this.I1;
        if (mq81Var == null) {
            u890.C("signupMobiusControllerFactory");
            throw null;
        }
        MobiusLoop.Controller controllerA = mq81Var.a(N0(), kr81Var, qq81Var3, this.U1, y3uVar, hon1.n(qq81Var3));
        controllerA.c(kr81Var);
        this.V1 = controllerA;
        return kr81Var.c();
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        MobiusLoop.Controller controller = this.V1;
        if (controller != null) {
            controller.getClass();
            this.W1 = (qq81) controller.a();
        }
        MobiusLoop.Controller controller2 = this.V1;
        if (controller2 != null) {
            controller2.disconnect();
        }
    }

    public final void I0(View view, Bundle bundle) {
    }
}
