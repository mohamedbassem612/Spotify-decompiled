package p;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.a;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.android.ObservableMutableLiveData;
import io.reactivex.rxjava3.core.Observable;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h751 implements f4h1, ihr0 {
    public final g931 a;
    public final r4u b;
    public final i751 c;
    public final q450 d;
    public final iac0 e;
    public final d751 f;
    public final rjd g;
    public final svh0 h;

    public h751(g931 g931Var, r4u r4uVar, i751 i751Var, q450 q450Var, iac0 iac0Var, d751 d751Var, cir0 cir0Var) {
        this.a = g931Var;
        this.b = r4uVar;
        this.c = i751Var;
        this.d = q450Var;
        this.e = iac0Var;
        this.f = d751Var;
        rjd rjdVar = new rjd(this, (byte) 7);
        this.g = rjdVar;
        this.h = new svh0((byte) 15, false);
        iac0Var.getLifecycle().a(rjdVar);
        cir0Var.j(new pd8(this, (byte) 16));
    }

    public final boolean b(ehr0 ehr0Var) {
        return false;
    }

    public final Object getView() {
        return (ConstraintLayout) this.a.b;
    }

    public final Bundle serialize() {
        Bundle bundle;
        Parcelable parcelableX0;
        Bundle bundle2 = new Bundle();
        g931 g931Var = this.a;
        bundle2.putBoolean("isSearchFieldFocused", ((m251) ((bpb1) ((z72) g931Var.c).X).getValue()).b);
        ConstraintLayout constraintLayout = (ConstraintLayout) g931Var.b;
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1VarA = s7k1.a(constraintLayout);
        boolean z = false;
        if (hsl1VarA != null && !hsl1VarA.a.u(8)) {
            z = true;
        }
        bundle2.putBoolean("isKeyboardVisible", !z);
        wmy wmyVar = (wmy) g931Var.d;
        if (wmyVar != null) {
            rw41 rw41Var = (rw41) wmyVar.e;
            bundle = new Bundle();
            a layoutManager = rw41Var.d.getLayoutManager();
            if (layoutManager != null && (parcelableX0 = layoutManager.x0()) != null) {
                bundle.putParcelable("layout_manager_state", parcelableX0);
            }
            dts dtsVar = (dts) rw41Var.h.b;
            dtsVar.getClass();
            Bundle bundle3 = new Bundle();
            for (Map.Entry entry : dtsVar.a.entrySet()) {
                Object key = entry.getKey();
                ipb1 ipb1Var = (ipb1) entry.getValue();
                Bundle bundleSerialize = ipb1Var.serialize();
                Bundle bundleC = ipb1Var.c();
                if (bundleSerialize != null) {
                    bundle3.putBundle(key.toString(), bundleSerialize);
                }
                if (bundleC != null) {
                    bundle3.putBundle(key + "_ui", bundleC);
                }
            }
            bundle.putBundle("StateHolderStoreKey", bundle3);
        } else {
            bundle = null;
        }
        bundle2.putParcelable("searchElementsBodyState", bundle);
        u551 u551Var = (u551) this.f.a.d;
        if (u551Var != null) {
            bundle2.putString("query", ((z551) u551Var.V()).a);
            return bundle2;
        }
        u890.C("mobiusViewModel");
        throw null;
    }

    public final void start() {
        dt30 dt30Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.a.b;
        boolean zIsAttachedToWindow = constraintLayout.isAttachedToWindow();
        svh0 svh0Var = this.h;
        if (!zIsAttachedToWindow) {
            constraintLayout.addOnAttachStateChangeListener(new c9s(constraintLayout, svh0Var, (byte) 9));
        } else if (!svh0Var.b && ((dt30) svh0Var.c) == null) {
            g0i g0iVarH = v9p1.H(constraintLayout);
            if (g0iVarH == null || (dt30Var = (dt30) g0iVarH.g.getValue()) == null) {
                dt30Var = null;
            } else if (dt30Var.c()) {
                svh0Var.b = true;
            } else {
                dt30Var.a();
            }
            svh0Var.c = dt30Var;
        }
        g751 g751Var = new g751(this, (byte) 0);
        es3 es3Var = new es3(this.c, (byte) 7);
        g751 g751Var2 = new g751(this, (byte) 1);
        d751 d751Var = this.f;
        g931 g931Var = d751Var.a;
        u551 u551Var = (u551) g931Var.d;
        if (u551Var == null) {
            u890.C("mobiusViewModel");
            throw null;
        }
        u551Var.h.b(u551Var.g.t().subscribe(new tr41(u551Var, (byte) 2)));
        u551 u551Var2 = (u551) g931Var.d;
        if (u551Var2 == null) {
            u890.C("mobiusViewModel");
            throw null;
        }
        ObservableMutableLiveData observableMutableLiveData = ((MobiusLoopViewModel) u551Var2).b;
        iac0 iac0Var = this.e;
        d751Var.t.b(Observable.fromPublisher(new ind0(iac0Var, observableMutableLiveData)).observeOn(d751Var.b).map(new bb01(d751Var, (byte) 18)).subscribe());
        d751Var.i.f(iac0Var, g751Var);
        u551 u551Var3 = (u551) g931Var.d;
        if (u551Var3 != null) {
            ((MobiusLoopViewModel) u551Var3).c.a(iac0Var, es3Var, g751Var2);
        } else {
            u890.C("mobiusViewModel");
            throw null;
        }
    }

    public final void stop() {
        svh0 svh0Var = this.h;
        if (!svh0Var.b) {
            svh0Var.b = true;
            dt30 dt30Var = (dt30) svh0Var.c;
            if (dt30Var != null) {
                dt30Var.d();
            }
            svh0Var.c = null;
        }
        iac0 iac0Var = this.e;
        iac0Var.getLifecycle().d(this.g);
        d751 d751Var = this.f;
        g931 g931Var = d751Var.a;
        u551 u551Var = (u551) g931Var.d;
        if (u551Var == null) {
            u890.C("mobiusViewModel");
            throw null;
        }
        ((MobiusLoopViewModel) u551Var).b.l(iac0Var);
        u551Var.h.g();
        d751Var.t.g();
        u551 u551Var2 = (u551) g931Var.d;
        if (u551Var2 == null) {
            u890.C("mobiusViewModel");
            throw null;
        }
        ((MobiusLoopViewModel) u551Var2).c.b();
        d751Var.e.a(d751Var.g);
    }
}
