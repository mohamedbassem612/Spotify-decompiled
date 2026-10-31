package p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zus implements x4f1, s4j0 {
    public static final /* synthetic */ mma0[] i = {new een0(zus.class, "requestJob", "getRequestJob()Lkotlinx/coroutines/Job;", 0)};
    public final dg30 a;
    public final e4j0 b;
    public final j5f1 c;
    public uus d;
    public x3f1 e;
    public final llm g;
    public final bpb1 f = gio1.b(b7x.a);
    public final de0 h = new de0((byte) 1);

    public zus(dg30 dg30Var, e4j0 e4j0Var, Scheduler scheduler, j5f1 j5f1Var) {
        this.a = dg30Var;
        this.b = e4j0Var;
        this.c = j5f1Var;
        this.g = smo1.e(ha71.A(op71.f(), w0h1.h(scheduler)));
        ((f0i) dg30Var).a.a(new tus(this, (byte) 0));
    }

    @Override // p.s4j0
    public final mr20 c() {
        return new iib(this.f, this, (byte) 5);
    }

    public final void d() {
        uus uusVar = this.d;
        if (uusVar != null) {
            uusVar.d().e();
            uusVar.d().g((ssm) null);
            this.d = null;
        }
    }

    public final void e(mus musVar, View view, d3j0 d3j0Var, Function0 function0, Function0 function1, iu30 iu30Var) {
        faa0 faa0VarY = c921.y(this.g, (o8n) null, 0, new n5s(this, new uus(musVar, new WeakReference(view), d3j0Var, function0, function1, iu30Var), (lnm) null, (byte) 11), 3);
        this.h.c(i[0], this, faa0VarY);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(uus uusVar, onm onmVar) {
        vus vusVar;
        if (onmVar instanceof vus) {
            vusVar = (vus) onmVar;
            int i2 = vusVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vusVar.d = i2 - Integer.MIN_VALUE;
            } else {
                vusVar = new vus(this, onmVar);
            }
        } else {
            vusVar = new vus(this, onmVar);
        }
        Object objG = vusVar.b;
        int i3 = vusVar.d;
        if (i3 == 0) {
            hm5.M(objG);
            d3j0 d3j0VarC = uusVar.c();
            vusVar.a = uusVar;
            vusVar.d = 1;
            objG = g(d3j0VarC, vusVar);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uusVar = vusVar.a;
            hm5.M(objG);
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        View view = (View) uusVar.a().get();
        rih1 rih1Var = rih1.a;
        if (!zBooleanValue) {
            Logger.d("Orchestrator denied presentation, cannot attach tooltip", new Object[0]);
            iu30 iu30VarB = uusVar.b();
            if (iu30VarB != null) {
                iu30VarB.invoke(o4f1.b);
                return rih1Var;
            }
        } else {
            if (view != null && view.isShown()) {
                if (view.isAttachedToWindow()) {
                    uusVar.d().h(new vas(uusVar, (byte) 20));
                    uusVar.d().g(new ssm(this, view, uusVar, (byte) 13));
                    uusVar.d().i(new wrs(this, uusVar, (byte) 2));
                    this.e = new x3f1(view, new ots(uusVar, (byte) 2));
                    view.getViewTreeObserver().addOnGlobalLayoutListener(this.e);
                    ogr ogrVar = new ogr(this, (byte) 11);
                    WeakHashMap weakHashMap = b8k1.a;
                    r7k1.c(view, ogrVar);
                    uusVar.d().c(view);
                } else {
                    view.addOnAttachStateChangeListener(new wus(view, uusVar, this, view));
                }
                if (view.isAttachedToWindow()) {
                    view.addOnAttachStateChangeListener(new c9s(view, uusVar, (byte) 1));
                    return rih1Var;
                }
                uusVar.d().e();
                return rih1Var;
            }
            Logger.d("Anchor view is null or not showing, cannot attach tooltip", new Object[0]);
            iu30 iu30VarB2 = uusVar.b();
            if (iu30VarB2 != null) {
                iu30VarB2.invoke(o4f1.a);
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(d3j0 d3j0Var, onm onmVar) {
        yus yusVar;
        boolean zBooleanValue;
        if (onmVar instanceof yus) {
            yusVar = (yus) onmVar;
            int i2 = yusVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yusVar.c = i2 - Integer.MIN_VALUE;
            } else {
                yusVar = new yus(this, onmVar);
            }
        } else {
            yusVar = new yus(this, onmVar);
        }
        Object objB = yusVar.a;
        int i3 = yusVar.c;
        try {
            if (i3 == 0) {
                hm5.M(objB);
                e4j0 e4j0Var = this.b;
                p4j0 p4j0Var = p4j0.a;
                yusVar.c = 1;
                objB = e4j0Var.b(p4j0Var, d3j0Var, yusVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            zBooleanValue = ((Boolean) objB).booleanValue();
        } catch (CancellationException unused) {
            zBooleanValue = false;
        }
        return yah0.m(zBooleanValue);
    }
}
