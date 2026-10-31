package p;

import android.app.Activity;
import android.content.Context;
import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cro0 {
    public final Context a;
    public final Activity b;
    public final qnv0 c;
    public final dto0 d;
    public final lcs e;
    public final uro0 f;
    public final kt91 g;
    public final lzn0 h;
    public final a1r0 i;
    public final q8n j;
    public final q8n k;

    public cro0(Context context, Activity activity, qnv0 qnv0Var, dto0 dto0Var, lcs lcsVar, uro0 uro0Var, kt91 kt91Var, lzn0 lzn0Var, a1r0 a1r0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = context;
        this.b = activity;
        this.c = qnv0Var;
        this.d = dto0Var;
        this.e = lcsVar;
        this.f = uro0Var;
        this.g = kt91Var;
        this.h = lzn0Var;
        this.i = a1r0Var;
        this.j = q8nVar;
        this.k = q8nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        sqo0 sqo0Var;
        if (onmVar instanceof sqo0) {
            sqo0Var = (sqo0) onmVar;
            int i = sqo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sqo0Var.c = i - Integer.MIN_VALUE;
            } else {
                sqo0Var = new sqo0(this, onmVar);
            }
        } else {
            sqo0Var = new sqo0(this, onmVar);
        }
        Object obj = sqo0Var.a;
        int i2 = sqo0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableD = this.c.d(new smq0[]{new smq0(gfe.b, mmq0.g, true)}, 3, str, false, (dg30) null);
                sqo0Var.c = 1;
                Object objI = fc11.i(completableD, sqo0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return fro0.a;
        } catch (Throwable th) {
            n57.t("Failed to enable PROMPTED_EXPERIENCES notification", th);
            return new ero0(th);
        }
    }
}
