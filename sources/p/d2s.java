package p;

import android.view.View;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d2s implements x4l, o5s {
    public hj70 N0;
    public final ucs X;
    public final rku Y = new rku();
    public View Z;
    public final gj5 a;
    public final x4f1 b;
    public final sus c;
    public final ior d;
    public final z1s e;
    public final hur f;
    public final Scheduler g;
    public final ye90 h;
    public final x390 i;
    public final vx40 t;

    public d2s(gj5 gj5Var, x4f1 x4f1Var, sus susVar, ior iorVar, z1s z1sVar, hur hurVar, Scheduler scheduler, ye90 ye90Var, x390 x390Var, vx40 vx40Var, ucs ucsVar) {
        this.a = gj5Var;
        this.b = x4f1Var;
        this.c = susVar;
        this.d = iorVar;
        this.e = z1sVar;
        this.f = hurVar;
        this.g = scheduler;
        this.h = ye90Var;
        this.i = x390Var;
        this.t = vx40Var;
        this.X = ucsVar;
        ((f0i) gj5Var).a.a(this);
    }

    public final void a(View view) {
        this.Z = view;
        hj70 hj70Var = this.N0;
        if (hj70Var != null) {
            c(hj70Var);
            this.N0 = null;
        }
    }

    public final void b() {
        this.Z = null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    public final void c(hj70 hj70Var) {
        mus musVarB;
        int i;
        j4b1 j4b1Var;
        ye90 ye90Var;
        View view = this.Z;
        boolean z = hj70Var instanceof qi70;
        sus susVar = this.c;
        gj5 gj5Var = this.a;
        Function0 c2sVar = null;
        if (z) {
            if (this.f.k()) {
                String string = gj5Var.getString(2131956950);
                b2s b2sVar = new b2s(this, (byte) 0);
                px81 px81Var = new px81();
                px81Var.i = string;
                ((l5f1) px81Var).b = b2sVar;
                musVarB = sus.b(susVar, px81Var);
            } else {
                musVarB = null;
            }
        } else if (hj70Var instanceof bi70) {
            int i2 = ((bi70) hj70Var).c;
            int iC = l1d.C(i2);
            if (iC == 0) {
                i = 2131956814;
            } else if (iC == 1) {
                i = 2131956815;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                i = 2131956812;
            }
            int iC2 = l1d.C(i2);
            if (iC2 == 0) {
                j4b1Var = null;
            } else {
                if (iC2 != 1 && iC2 != 2) {
                    eg.o();
                    return;
                }
                j4b1Var = j4b1.X2;
            }
            int iC3 = l1d.C(i2);
            if (iC3 == 0) {
                ye90Var = this.i;
            } else {
                if (iC3 != 1 && iC3 != 2) {
                    eg.o();
                    return;
                }
                ye90Var = this.h;
            }
            px81 px81Var2 = new px81();
            px81Var2.i = gj5Var.getString(i);
            if (j4b1Var != null) {
                px81Var2.h = new ox81(j4b1Var);
            }
            px81Var2.k = new nx81(gj5Var.getString(2131956813), new a2s(ye90Var, this, (byte) 0), 0);
            ((l5f1) px81Var2).c = new a2s(ye90Var, this, (byte) 1);
            ((l5f1) px81Var2).b = new a2s(ye90Var, this, (byte) 2);
            musVarB = sus.b(susVar, px81Var2);
        } else if (hj70Var instanceof aj70) {
            z9o0 z9o0VarQ = f3o1.q(gj5Var.getResources(), (aj70) hj70Var);
            if (z9o0VarQ == null) {
                musVarB = null;
            } else {
                px81 px81Var3 = new px81();
                px81Var3.i = z9o0VarQ.a;
                px81Var3.k = new nx81(gj5Var.getString(z9o0VarQ.b), new b2s(this, (byte) 1), 0);
                ((l5f1) px81Var3).c = new b2s(this, (byte) 2);
                ((l5f1) px81Var3).b = new b2s(this, (byte) 3);
                musVarB = sus.b(susVar, px81Var3);
            }
        } else {
            musVarB = null;
        }
        if (z) {
            c2sVar = new c2s(this, (byte) 0);
        } else if (hj70Var instanceof bi70) {
            c2sVar = new nxr(this, hj70Var, (byte) 12);
        } else if (hj70Var instanceof aj70) {
            c2sVar = new c2s(this, (byte) 1);
        }
        Function0 function0 = c2sVar;
        if (view != null && musVarB != null) {
            x4f1.a(this.b, musVarB, view, function0, (g5f1) null, 44);
        } else if (musVarB != null) {
            this.N0 = hj70Var;
        }
    }

    public final void onPause(iac0 iac0Var) {
        this.X.a.onNext(Boolean.FALSE);
        this.Y.a();
    }

    public final void onResume(iac0 iac0Var) {
        hj70 hj70Var;
        this.X.a.onNext(Boolean.TRUE);
        this.Y.b(this.e.d.observeOn(this.g).subscribe(new yrh(this, (byte) 25)));
        z1s z1sVar = this.e;
        synchronized (z1sVar.f) {
            hj70Var = z1sVar.g;
            z1sVar.g = null;
        }
        if (hj70Var != null) {
            c(hj70Var);
        }
    }
}
