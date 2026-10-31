package p;

import android.app.Activity;
import android.content.Context;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class spj0 implements tpj0, ViewTreeObserver.OnScrollChangedListener {
    public Disposable N0;
    public o860 O0;
    public boolean P0;
    public boolean Q0;
    public dif1 R0;
    public final q3c X;
    public j2e0 Y;
    public Object Z;
    public final jt4 a;
    public final dxy b;
    public final uo5 c;
    public final Scheduler d;
    public final boolean e;
    public final q8n f;
    public final Function0 g;
    public final BehaviorSubject h;
    public llm i;
    public final o0g t;

    public spj0(jt4 jt4Var, dxy dxyVar, uo5 uo5Var, Scheduler scheduler, boolean z, q8n q8nVar) {
        ppj0 ppj0Var = ppj0.a;
        this.a = jt4Var;
        this.b = dxyVar;
        this.c = uo5Var;
        this.d = scheduler;
        this.e = z;
        this.f = q8nVar;
        this.g = ppj0Var;
        this.h = BehaviorSubject.f();
        this.t = new o0g((byte) 12);
        this.X = o0g.K();
        dxyVar.o(new qpj0(this, (byte) 0));
    }

    public final void a(String str) {
        dif1 dif1Var = this.R0;
        o0g o0gVar = this.t;
        if (dif1Var != null) {
            dif1Var.d(o0gVar.D() + 1);
        }
        o0gVar.M();
        this.Y = null;
        o860 o860Var = this.O0;
        uo5 uo5Var = this.c;
        if (o860Var != null) {
            if (this.P0) {
                o860Var.x();
            }
            uo5Var.getClass();
            if (o860Var.o()) {
                ((mwb) uo5Var.b).c(o860Var);
            }
            this.O0 = null;
            this.P0 = false;
        }
        if (str != null) {
            o860 o860VarC = ((x6o0) uo5Var.d).c();
            ConcurrentHashMap concurrentHashMapL = o860VarC.l();
            if (str.equals("home-funkis")) {
                str = "home";
            }
            concurrentHashMapL.put("page_identifier", str);
            this.O0 = o860VarC;
            e();
        }
    }

    public final void b(ps41 ps41Var, boolean z) {
        mlw0 mlw0VarX;
        long jA = ps41Var.a();
        o0g o0gVar = this.t;
        if (jA != o0gVar.D()) {
            return;
        }
        if (!z) {
            j2e0 j2e0Var = this.Y;
            if (j2e0Var == null || j2e0Var.k() != ps41Var) {
                return;
            }
            o0gVar.A(j2e0Var.f());
            this.Y = null;
        } else {
            if (!this.Q0) {
                return;
            }
            j2e0 j2e0Var2 = this.Y;
            if ((j2e0Var2 != null ? j2e0Var2.k() : null) == ps41Var || (mlw0VarX = o0gVar.x(this.X, ps41Var.a())) == null) {
                return;
            } else {
                this.Y = new j2e0(ps41Var, mlw0VarX, (byte) 29);
            }
        }
        e();
    }

    @Override // p.iyf0
    public final void c() {
        if (this.Q0) {
            return;
        }
        llm llmVarE = smo1.e(ha71.A(guo1.B(), this.f));
        this.i = llmVarE;
        this.Q0 = true;
        e();
        dif1 dif1Var = this.R0;
        if (dif1Var != null) {
            dif1Var.b(llmVarE, this.t.D());
        } else {
            f();
        }
        this.b.N();
    }

    @Override // p.iyf0
    public final void d() {
        this.Q0 = false;
        e();
        dif1 dif1Var = this.R0;
        if (dif1Var != null) {
            dif1Var.a();
        }
        this.Z = null;
        Disposable disposable = this.N0;
        if (disposable != null) {
            disposable.dispose();
        }
        this.N0 = null;
        llm llmVar = this.i;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        this.i = null;
        this.b.P();
        a(null);
    }

    public final void e() {
        boolean z = this.Q0 && this.O0 != null && this.t.I();
        if (z == this.P0) {
            return;
        }
        o860 o860Var = this.O0;
        if (z) {
            if (o860Var != null) {
                o860Var.w();
            }
        } else if (o860Var != null) {
            o860Var.x();
        }
        this.P0 = z;
    }

    public final void f() {
        this.Z = null;
        Disposable disposable = this.N0;
        if (disposable != null) {
            disposable.dispose();
        }
        this.N0 = null;
        llm llmVar = this.i;
        if (llmVar == null) {
            return;
        }
        Object obj = new Object();
        this.Z = obj;
        p811 p811Var = new p811();
        this.N0 = this.h.skip(2L).take(1L).doOnComplete(new tt60(this, p811Var, (byte) 5)).flatMap(new hod0(this, (byte) 16)).subscribe((Consumer) new y43(llmVar, this, obj, p811Var, (byte) 8));
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            n57.s("MetricKeeperPageMonitorPlugin: Could not get the Activity for " + viewGroup.getContext());
            return;
        }
        Window window = activity.getWindow();
        if (window != null) {
            jt4 jt4Var = this.a;
            jt4Var.getClass();
            fn31.B(window, jt4Var);
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this);
            if (this.e && this.R0 == null) {
                Window.Callback callback = activity.getWindow().getCallback();
                if (callback == null) {
                    n57.s("MetricKeeperPageMonitorPlugin: Could not observe window touch events");
                    return;
                }
                dif1 dif1Var = new dif1(ViewConfiguration.get(activity).getScaledTouchSlop(), this.g, new c4z(this));
                activity.getWindow().setCallback(new rpj0(callback, dif1Var));
                this.Z = null;
                Disposable disposable = this.N0;
                if (disposable != null) {
                    disposable.dispose();
                }
                this.N0 = null;
                this.R0 = dif1Var;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        dif1 dif1Var = this.R0;
        if (dif1Var != null) {
            dif1Var.c();
        } else {
            this.h.onNext(rih1.a);
        }
    }
}
