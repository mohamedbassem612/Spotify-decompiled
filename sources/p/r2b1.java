package p;

import android.net.Uri;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r2b1 {
    public final u3c a;
    public final d2n0 b;
    public final onv0 c;
    public final em3 d;
    public final kly0 e;
    public final qc4 f;
    public final v3c g;
    public final llm i;
    public final LinkedList h = new LinkedList();
    public final PublishSubject j = new PublishSubject();
    public final vku k = new vku();

    public r2b1(u3c u3cVar, d2n0 d2n0Var, onv0 onv0Var, em3 em3Var, ipq ipqVar, qc4 qc4Var, q8n q8nVar, v3c v3cVar) {
        this.a = u3cVar;
        this.b = d2n0Var;
        this.c = onv0Var;
        this.d = em3Var;
        this.e = ipqVar;
        this.f = qc4Var;
        this.g = v3cVar;
        this.i = smo1.e(q8nVar);
    }

    public final void a(gj5 gj5Var) {
        this.a.getClass();
        n3c.e(true);
        Uri data = gj5Var.getIntent().getData();
        if (this.g.f(String.valueOf(data))) {
            return;
        }
        d(new p2b1(this, gj5Var, null, data, false));
    }

    public final void b() {
        this.a.getClass();
        dn81 dn81VarA = u3c.a();
        if (dn81VarA != null && dn81VarA.f()) {
            synchronized (this.h) {
                try {
                    for (t3c t3cVar : this.h) {
                        this.d.r(this.c.b(), this.c.a());
                        t3cVar.b(dn81VarA.d());
                    }
                    this.h.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        q2b1 q2b1Var;
        if (onmVar instanceof q2b1) {
            q2b1Var = (q2b1) onmVar;
            int i = q2b1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q2b1Var.c = i - Integer.MIN_VALUE;
            } else {
                q2b1Var = new q2b1(this, onmVar);
            }
        } else {
            q2b1Var = new q2b1(this, onmVar);
        }
        Object objI = q2b1Var.a;
        int i2 = q2b1Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            ezc ezcVarJ = y7y0.J((o241) this.e.get());
            q2b1Var.c = 1;
            objI = b5p1.i(ezcVarJ, q2b1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        if (((Boolean) objI).booleanValue()) {
            this.a.getClass();
            dn81 dn81VarA = u3c.a();
            if (dn81VarA != null) {
                dn81VarA.j();
            }
        }
        return rih1.a;
    }

    public final void d(Function0 function0) {
        this.a.getClass();
        if (u3c.a() != null) {
            function0.invoke();
            return;
        }
        this.k.a(this.j.subscribe(new t1s(function0, (byte) 1)));
    }
}
