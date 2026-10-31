package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zdb extends zf30 implements z0d1, lir0 {
    public final vq6 F1;
    public kg0 G1;
    public lg0 H1;
    public ohv0 I1;
    public boolean J1;
    public wab K1;
    public bbb L1;
    public dv M1;
    public wbd1 N1;
    public t0i O1;
    public gp41 P1;
    public wnh1 Q1;
    public mir0 R1;
    public t8h1 S1;
    public g1f0 T1;
    public teb U1;
    public q5o V1;
    public Map W1;
    public boolean Y1;
    public boolean Z1;
    public String b2;
    public final CompositeDisposable X1 = new CompositeDisposable();
    public final hrr0 a2 = xto.t((Object) null);

    public zdb(vq6 vq6Var) {
        this.F1 = vq6Var;
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        d7e.l(Z0());
        wnh1.H(a1());
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        d7e.l(Z0());
        a1().F();
    }

    public final void F0(Bundle bundle) {
        Bundle bundleI;
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 == null || !dg30VarF0.isChangingConfigurations() || (bundleI = a1().I()) == null) {
            return;
        }
        bundle.putBundle("PBL_STATE", bundleI);
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        d7e.l(Z0());
        a1().G();
        if (!this.Z1) {
            ohv0 ohv0Var = this.I1;
            if (ohv0Var == null) {
                u890.C("authTracker");
                throw null;
            }
            gp41 gp41Var = this.P1;
            if (gp41Var == null) {
                u890.C("screenIdentifier");
                throw null;
            }
            ohv0Var.a(new nhv0(gp41Var.a, a1().Y.c.a));
        }
        wbd1 wbd1Var = this.N1;
        if (wbd1Var == null) {
            u890.C("accountSwitcherState");
            throw null;
        }
        Disposable disposableSubscribe = wbd1Var.b.subscribe((Consumer) new xdb(this, (byte) 0));
        CompositeDisposable compositeDisposable = this.X1;
        compositeDisposable.b(disposableSubscribe);
        q5o q5oVar = this.V1;
        if (q5oVar != null) {
            compositeDisposable.b(q5oVar.g().subscribe((Consumer) new xdb(this, (byte) 1)));
        } else {
            u890.C("credentialsStore");
            throw null;
        }
    }

    public final void H0() {
        this.X1.g();
        ((zf30) this).h1 = true;
    }

    public final void I0(View view, Bundle bundle) {
        String str;
        N0().J().a(n0(), new ydb(this, (byte) 0));
        if (!Y0().r() && !this.Z1 && Z0() == fjt.b && !this.Y1) {
            Bundle bundle2 = ((zf30) this).f;
            if ((bundle2 != null ? bundle2.getString("ARG_PREFILL_EMAIL") : null) == null) {
                this.Y1 = true;
                q5o q5oVar = this.V1;
                if (q5oVar == null) {
                    u890.C("credentialsStore");
                    throw null;
                }
                q5o.h(q5oVar);
            }
        }
        ohv0 ohv0Var = this.I1;
        if (ohv0Var == null) {
            u890.C("authTracker");
            throw null;
        }
        gp41 gp41Var = this.P1;
        if (gp41Var == null) {
            u890.C("screenIdentifier");
            throw null;
        }
        String str2 = gp41Var.a;
        int iOrdinal = Z0().ordinal();
        if (iOrdinal == 0) {
            str = "intent_sign_up";
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            str = "intent_login";
        }
        ohv0Var.a(new khv0(str2, "layout", zno1.t(oqn1.n("value", str))));
    }

    public final g1f0 Y0() {
        g1f0 g1f0Var = this.T1;
        if (g1f0Var != null) {
            return g1f0Var;
        }
        u890.C("loginFlowRemoteProperties");
        throw null;
    }

    public final fjt Z0() {
        Bundle bundle = ((zf30) this).f;
        fjt fjtVar = bundle != null ? (fjt) bundle.getParcelable("ARG_MODE") : null;
        fjtVar.getClass();
        return fjtVar;
    }

    public final wnh1 a1() {
        wnh1 wnh1Var = this.Q1;
        if (wnh1Var != null) {
            return wnh1Var;
        }
        u890.C("pageBoundUbiLogger");
        throw null;
    }

    @Override // p.lir0
    /* JADX INFO: renamed from: c */
    public final mir0 getU1() {
        mir0 mir0Var = this.R1;
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
        Bundle bundle2;
        super.w0(bundle);
        this.Z1 = bundle != null;
        if (bundle == null || (bundle2 = bundle.getBundle("PBL_STATE")) == null) {
            return;
        }
        a1().y(bundle2);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayListB;
        at80 at80VarC;
        gus0 gus0Var;
        fjt parcelable = O0().getParcelable("ARG_MODE");
        parcelable.getClass();
        fjt fjtVar = parcelable;
        Map map = this.W1;
        if (map == null) {
            u890.C("viewModelFactoryMap");
            throw null;
        }
        Object obj = map.get(MobiusLoopViewModel.class);
        obj.getClass();
        MobiusLoopViewModel mobiusLoopViewModel = (MobiusLoopViewModel) new hck1(this, (eck1) obj).a(MobiusLoopViewModel.class);
        int iOrdinal = fjtVar.ordinal();
        if (iOrdinal == 0) {
            wab wabVar = this.K1;
            if (wabVar == null) {
                u890.C("blueprint");
                throw null;
            }
            t0i t0iVar = this.O1;
            if (t0iVar == null) {
                u890.C("componentExposer");
                throw null;
            }
            t0iVar.a(wabVar.b);
            bbb bbbVar = this.L1;
            if (bbbVar == null) {
                u890.C("blueprintActionsButtonProvider");
                throw null;
            }
            arrayListB = bbbVar.b(wabVar);
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            wab wabVar2 = this.K1;
            if (wabVar2 == null) {
                u890.C("blueprint");
                throw null;
            }
            t0i t0iVar2 = this.O1;
            if (t0iVar2 == null) {
                u890.C("componentExposer");
                throw null;
            }
            t0iVar2.a(wabVar2.b);
            bbb bbbVar2 = this.L1;
            if (bbbVar2 == null) {
                u890.C("blueprintActionsButtonProvider");
                throw null;
            }
            arrayListB = bbbVar2.a(wabVar2);
        }
        ArrayList arrayList = arrayListB;
        int iOrdinal2 = fjtVar.ordinal();
        at80 at80Var = at80.a;
        if (iOrdinal2 == 0) {
            at80VarC = Y0().C();
        } else {
            if (iOrdinal2 != 1) {
                eg.o();
                return null;
            }
            at80VarC = at80Var;
        }
        if (fjtVar == fjt.a && at80VarC != at80Var && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gus0Var = null;
                    break;
                }
                if (((zk8) it.next()).a.a == jj8.a) {
                    Map map2 = this.W1;
                    if (map2 == null) {
                        u890.C("viewModelFactoryMap");
                        throw null;
                    }
                    Object obj2 = map2.get(gus0.class);
                    obj2.getClass();
                    gus0Var = (gus0) new hck1(this, (eck1) obj2).a(gus0.class);
                    break;
                }
            }
        } else {
            gus0Var = null;
            break;
        }
        mobiusLoopViewModel.c.c(n0(), new z11(this, (byte) 4));
        lg0 lg0Var = this.H1;
        if (lg0Var == null) {
            u890.C("zeroResult");
            throw null;
        }
        tka0 tka0VarB = rc11.a.b(yit.class);
        tla tlaVar = new tla(mobiusLoopViewModel, (byte) 10);
        String strO = tka0VarB.o();
        sap1.n(this, strO != null ? strO : "zeroResult", new q1(lg0Var, tka0VarB, tlaVar, (byte) 7));
        return bmq0.n(this, apo.j(1535608090, new wdb(mobiusLoopViewModel, fjtVar, gus0Var, this, arrayList, at80VarC, (byte) 1), true));
    }

    public final void z0() {
        q5o q5oVar = this.V1;
        if (q5oVar == null) {
            u890.C("credentialsStore");
            throw null;
        }
        q5oVar.e();
        ((zf30) this).h1 = true;
    }
}
