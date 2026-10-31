package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xwq implements kko {
    public final wen0 a;
    public final /* synthetic */ jd6 b;

    public xwq(wen0 wen0Var, jd6 jd6Var) {
        this.b = jd6Var;
        this.a = wen0Var;
    }

    public final zob1 a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, tv80 tv80Var, onm onmVar) {
        wwq wwqVar;
        if (onmVar instanceof wwq) {
            wwqVar = (wwq) onmVar;
            int i = wwqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wwqVar.c = i - Integer.MIN_VALUE;
            } else {
                wwqVar = new wwq(this, onmVar);
            }
        } else {
            wwqVar = new wwq(this, onmVar);
        }
        Object objJ = wwqVar.a;
        int i2 = wwqVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleC = ((oj3) this.b.f).c(Collections.singletonList(str), "", "", ((ijo) this.a.getValue()).a.contains(str), new gj3(27, tv80Var));
                wwqVar.c = 1;
                objJ = fc11.j(singleC, wwqVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
        } catch (Throwable unused) {
        }
        return rih1.a;
    }
}
