package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.webkit.WebView;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xjl1 implements tjl1, f961 {
    public final Context a;
    public final q8n b;
    public final bpb1 c;
    public final llm d;

    public xjl1(Context context, q8n q8nVar, luk lukVar) {
        this.a = context;
        this.b = q8nVar;
        bpb1 bpb1VarB = gio1.b(zjl1.a);
        this.c = bpb1VarB;
        llm llmVarE = smo1.e(flo1.l(q8nVar, op71.f()));
        this.d = llmVarE;
        if (new e85(false, lukVar).a()) {
            bpb1VarB.m((Object) null, bkl1.a);
            fn31.T(llmVarE, (o8n) null, 0, new fkj1((Object) this, (lnm) null, (byte) 17), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        vjl1 vjl1Var;
        if (onmVar instanceof vjl1) {
            vjl1Var = (vjl1) onmVar;
            int i = vjl1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vjl1Var.c = i - Integer.MIN_VALUE;
            } else {
                vjl1Var = new vjl1(this, onmVar);
            }
        } else {
            vjl1Var = new vjl1(this, onmVar);
        }
        Object obj = vjl1Var.a;
        Object obj2 = d9n.a;
        int i2 = vjl1Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (Build.VERSION.SDK_INT >= 36) {
            try {
                WebView.getWebViewClassLoader();
            } catch (Resources.NotFoundException e) {
                zrw0 zrw0Var = bsw0.a;
                bsw0.a(this.a, c2u.a);
                return new m231(e);
            }
        }
        vjl1Var.c = 1;
        Object objB = b(vjl1Var);
        return objB == obj2 ? obj2 : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        wjl1 wjl1Var;
        if (onmVar instanceof wjl1) {
            wjl1Var = (wjl1) onmVar;
            int i = wjl1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjl1Var.c = i - Integer.MIN_VALUE;
            } else {
                wjl1Var = new wjl1(this, onmVar);
            }
        } else {
            wjl1Var = new wjl1(this, onmVar);
        }
        Object objR = wjl1Var.a;
        int i2 = wjl1Var.c;
        if (i2 == 0) {
            hm5.M(objR);
            wjl1Var.c = 1;
            ohd ohdVar = new ohd(1, aym.t(wjl1Var));
            ohdVar.t();
            Executor executorL = qgo1.l(this.b);
            sjl1 sjl1Var = new sjl1(executorL);
            qpj1 qpj1Var = new qpj1(this, ohdVar, (byte) 16);
            int i3 = sil1.a;
            executorL.execute(new vqh0(sjl1Var, qpj1Var, this.a, (byte) 20));
            objR = ohdVar.r();
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objR);
        }
        return ((e331) objR).a;
    }

    public final void shutdown() {
        smo1.p(this.d, (CancellationException) null);
    }

    public final Object getApi() {
        return this;
    }
}
