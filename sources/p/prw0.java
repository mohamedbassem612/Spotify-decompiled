package p;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class prw0 implements dwo {
    public final Context a;
    public final llm b;
    public final Object c;
    public boolean d;

    public prw0(Context context, xb4 xb4Var, int i, q8n q8nVar) {
        a5e0 a5e0Var = b5e0.i;
        tqt tqtVar = new tqt("thread listing");
        tqt tqtVar2 = new tqt("thread stat reads");
        tqt tqtVar3 = new tqt("own CPU stat");
        tqt tqtVar4 = new tqt("oom_score_adj read");
        n811 n811Var = new n811();
        n811 n811Var2 = new n811();
        p811 p811Var = new p811();
        int iMyPid = Process.myPid();
        vt1 vt1Var = new vt1(tqtVar, n811Var, n811Var2, tqtVar2, p811Var, (byte) 22);
        lb50 lb50Var = new lb50(n811Var, n811Var2, p811Var, (byte) 24);
        y4e0 y4e0Var = new y4e0(tqtVar3, (byte) 0);
        qnd0 qnd0Var = new qnd0(context, (byte) 6);
        z4e0 z4e0Var = z4e0.a;
        b5e0 b5e0Var = new b5e0(iMyPid, vt1Var, lb50Var, y4e0Var, qnd0Var, new p350(0, a5e0Var, a5e0.class, "readImportance", "readImportance()Ljava/lang/Integer;", 0, (byte) 14), new y4e0(tqtVar4, (byte) 1));
        fns fnsVar = igu.a;
        q8n q8nVarM = b3s.c.M(1);
        this.a = context;
        v62 v62Var = new v62(olj0.T0, (byte) 16);
        j0d1 j0d1VarB = guo1.B();
        p8n p8nVar = q8n.b;
        llm llmVarE = smo1.e(flo1.l(j0d1VarB, q8nVar.M(1)).y(new z8n("process-load-monitor")).y(v62Var));
        this.b = llmVarE;
        this.c = new Object();
        this.d = true;
        zrw0 zrw0Var = bsw0.a;
        bsw0.c = Integer.valueOf(i);
        if (!xb4Var.a() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        mrw0 mrw0Var = new mrw0(new nab1(b5e0Var.a, b5e0Var.b, b5e0Var.c, b5e0Var.h), new gx21(b5e0Var.e, b5e0Var.d), new nrw0(this, (byte) 1), new nrw0(this, (byte) 2));
        Function0 function0 = b5e0Var.f;
        nrw0 nrw0Var = new nrw0(this, (byte) 0);
        int iB = xb4Var.b();
        llm llmVarE2 = smo1.e(llmVarE.a.y(q8nVarM));
        av7 av7Var = new av7();
        av7Var.c = function0;
        av7Var.d = nrw0Var;
        av7Var.a = iB;
        av7Var.e = llmVarE2;
        av7Var.f = new AtomicBoolean(false);
        rl1 rl1Var = new rl1(b5e0Var.g, new nrw0(this, (byte) 3));
        long jD = xb4Var.d();
        long jC = xb4Var.c();
        fn31.T(llmVarE, (o8n) null, 0, new ie3(this, jD, mrw0Var, av7Var, rl1Var, (lnm) null), 3);
        fn31.T(llmVarE, (o8n) null, 0, new xn2(this, jC, mrw0Var, (lnm) null, (byte) 9), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(c9n c9nVar, long j, Function0 function0, onm onmVar) {
        orw0 orw0Var;
        if (onmVar instanceof orw0) {
            orw0Var = (orw0) onmVar;
            int i = orw0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                orw0Var.f = i - Integer.MIN_VALUE;
            } else {
                orw0Var = new orw0(this, onmVar);
            }
        } else {
            orw0Var = new orw0(this, onmVar);
        }
        Object obj = orw0Var.d;
        int i2 = orw0Var.f;
        if (i2 == 0) {
            hm5.M(obj);
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = orw0Var.c;
            Function0 function1 = orw0Var.b;
            c9n c9nVar2 = orw0Var.a;
            hm5.M(obj);
            function0 = function1;
            j = j2;
            c9nVar = c9nVar2;
        }
        while (smo1.u(c9nVar)) {
            try {
                function0.invoke();
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Logger.l(th, "Process load sampling step failed", new Object[0]);
            }
            orw0Var.a = c9nVar;
            orw0Var.b = function0;
            orw0Var.c = j;
            orw0Var.f = 1;
            Object objI = hap1.i(j, orw0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }

    public final void shutdown() {
        smo1.p(this.b, (CancellationException) null);
        synchronized (this.c) {
            this.d = false;
            synchronized (s0u.a) {
                s0u.b = '?';
                s0u.c = "0000";
                s0u.d = null;
                s0u.e = null;
                s0u.f = s0u.b();
            }
        }
    }
}
