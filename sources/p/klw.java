package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class klw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qlw a;
    public final /* synthetic */ String b;

    public klw(qlw qlwVar, String str) {
        this.a = qlwVar;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jlw jlwVar;
        Exception exc;
        qgo qgoVar;
        if (onmVar instanceof jlw) {
            jlwVar = (jlw) onmVar;
            int i = jlwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jlwVar.b = i - Integer.MIN_VALUE;
            } else {
                jlwVar = new jlw(this, onmVar);
            }
        } else {
            jlwVar = new jlw(this, onmVar);
        }
        Object objJ = jlwVar.a;
        int i2 = jlwVar.b;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                qgo qgoVar2 = (qgo) obj;
                try {
                    oj3 oj3Var = this.a.a;
                    String str = this.b;
                    if (str == null) {
                        str = "";
                    }
                    Single singleC = oj3Var.c(k4p1.x(qgoVar2.a), "", str, qgoVar2.b, new gj3(27, qgoVar2.c));
                    jlwVar.d = qgoVar2;
                    jlwVar.b = 1;
                    objJ = fc11.j(singleC, jlwVar);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    qgoVar = qgoVar2;
                } catch (Exception e) {
                    exc = e;
                    qgoVar = qgoVar2;
                    n57.t("Failed to curate item: " + qgoVar.a, exc);
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgoVar = jlwVar.d;
                try {
                    hm5.M(objJ);
                } catch (Exception e2) {
                    exc = e2;
                    n57.t("Failed to curate item: " + qgoVar.a, exc);
                }
            }
            objJ.getClass();
            return rih1.a;
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
