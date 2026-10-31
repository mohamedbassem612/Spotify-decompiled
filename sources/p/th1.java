package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class th1 implements kko {
    public final wen0 a;
    public final /* synthetic */ vh1 b;

    public th1(wen0 wen0Var, vh1 vh1Var) {
        this.b = vh1Var;
        this.a = wen0Var;
    }

    public final zob1 a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, tv80 tv80Var, onm onmVar) {
        sh1 sh1Var;
        if (onmVar instanceof sh1) {
            sh1Var = (sh1) onmVar;
            int i = sh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sh1Var.c = i - Integer.MIN_VALUE;
            } else {
                sh1Var = new sh1(this, onmVar);
            }
        } else {
            sh1Var = new sh1(this, onmVar);
        }
        Object objJ = sh1Var.a;
        int i2 = sh1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleC = this.b.a.c(Collections.singletonList(str), "", "", ((ijo) this.a.getValue()).a.contains(str), new gj3(27, tv80Var));
                sh1Var.c = 1;
                objJ = fc11.j(singleC, sh1Var);
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
