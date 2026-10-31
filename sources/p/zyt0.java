package p;

import android.content.Context;
import android.content.DialogInterface;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zyt0 extends s5w0 {
    public final pjq0 H1;
    public kt91 I1;
    public crd J1;
    public wr00 K1;
    public yh2 L1;
    public wyt0 M1;
    public zeu0 N1;
    public o241 O1;
    public Scheduler P1;
    public nw40 Q1;
    public boolean T1;
    public Disposable R1 = EmptyDisposable.a;
    public final rku S1 = new rku();
    public final ifl1 U1 = new ifl1((byte) 19);

    static {
        new i5w0("premium");
    }

    public zyt0(pjq0 pjq0Var) {
        this.H1 = pjq0Var;
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        this.S1.a();
        hma1 hma1VarEdit = this.M1.a.edit();
        hma1VarEdit.f(wyt0.b);
        hma1VarEdit.f(wyt0.c);
        hma1VarEdit.g();
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        ima1 ima1Var = this.M1.a;
        bma1 bma1Var = wyt0.b;
        if (ima1Var.n(bma1Var)) {
            ima1 ima1Var2 = this.M1.a;
            dm5.m(ima1Var2.n(bma1Var));
            int iM = ima1Var2.m(bma1Var);
            ima1 ima1Var3 = this.M1.a;
            bma1 bma1Var2 = wyt0.c;
            dm5.m(ima1Var3.n(bma1Var2));
            String strF = ima1Var3.f(bma1Var2);
            if (!this.T1) {
                Z0(iM, f0(), strF);
            }
        }
        Observable observableSwitchMap = this.O1.a.map(new hfr("type", (byte) 16)).distinctUntilChanged().map(new qpp0((byte) 18)).distinctUntilChanged().switchMap(new pjq0(this, (byte) 14));
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        this.S1.b(observableSwitchMap.observeOn(scheduler).subscribe(new xyt0(this, (byte) 0), new jld((byte) 12)));
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        this.R1 = this.J1.c.observeOn(this.P1).subscribe((Consumer) new xyt0(this, (byte) 1));
    }

    public final void H0() {
        ((zf30) this).h1 = true;
        this.R1.dispose();
    }

    public final void Z0(int i, Context context, String str) {
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        if (i == 2) {
            this.I1.k(k4k.p(2131963270).c());
            return;
        }
        if (i == 14) {
            this.I1.k(k4k.p(2131963270).c());
            return;
        }
        if (i == 39) {
            this.I1.k(k4k.p(2131963261).c());
            return;
        }
        if (i == 16) {
            this.I1.k(k4k.p(2131963270).c());
            return;
        }
        if (i == 17) {
            this.I1.k(k4k.p(2131963270).c());
            return;
        }
        if (i == 32 || i == 33) {
            this.L1.b(str, (String) null);
            return;
        }
        switch (i) {
            case 20:
                this.I1.k(k4k.p(2131963287).c());
                break;
            case 21:
            case 26:
                this.I1.k(k4k.p(2131963284).c());
                break;
            case 22:
                this.I1.k(k4k.p(2131963290).c());
                break;
            case 23:
                this.I1.k(k4k.p(2131963289).c());
                break;
            case 24:
                this.I1.k(k4k.p(2131963285).c());
                break;
            case 25:
                m2l.a(context, nik1.v0);
                break;
            case 27:
                this.I1.k(k4k.p(2131963288).c());
                break;
            case 28:
                this.I1.k(k4k.p(2131963270).c());
                break;
            case 29:
            case 30:
                this.K1.a(str);
                break;
            default:
                switch (i) {
                    case 35:
                        ifl1 ifl1Var = this.U1;
                        if (((p7s0) ifl1Var.b) == null) {
                            zog zogVar = new zog(context, 2132018150);
                            zogVar.f();
                            zogVar.d();
                            zogVar.e(new oad(ifl1Var, (byte) 16));
                            p7s0 p7s0VarA = zogVar.a();
                            ifl1Var.b = p7s0VarA;
                            p7s0VarA.show();
                            ((p7s0) ifl1Var.b).getClass();
                            break;
                        }
                        break;
                    case 36:
                        String string = P0().getString(2131963471);
                        String string2 = P0().getString(2131963469);
                        String string3 = P0().getString(2131963470);
                        mw40 mw40VarT = yoi1.T(this.Q1.a, string, string2);
                        mw40VarT.c(string3, (DialogInterface.OnClickListener) null);
                        mw40VarT.a(true);
                        mw40VarT.b().b();
                        break;
                    case 37:
                        if (blc0Var != blc0.LIVE_ROOM) {
                            this.I1.k(k4k.p(2131963286).c());
                        }
                        break;
                    default:
                        blc0 blc0Var2 = blc0.SHOW_EPISODE;
                        kt91 kt91Var = this.I1;
                        if (blc0Var != blc0Var2) {
                            kt91Var.k(k4k.p(2131963283).c());
                        } else {
                            kt91Var.k(k4k.p(2131963282).c());
                        }
                        break;
                }
                break;
        }
    }

    public final void v0(Context context) {
        this.H1.f(this);
        super.v0(context);
    }
}
