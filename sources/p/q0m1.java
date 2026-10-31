package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q0m1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lo9 a;

    public q0m1(lo9 lo9Var) {
        this.a = lo9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        p0m1 p0m1Var;
        if (onmVar instanceof p0m1) {
            p0m1Var = (p0m1) onmVar;
            int i = p0m1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p0m1Var.b = i - Integer.MIN_VALUE;
            } else {
                p0m1Var = new p0m1(this, onmVar);
            }
        } else {
            p0m1Var = new p0m1(this, onmVar);
        }
        Object obj2 = p0m1Var.a;
        int i2 = p0m1Var.b;
        byte[] bArr = null;
        if (i2 == 0) {
            hm5.M(obj2);
            seo seoVar = ((yzl1) obj).a;
            hur hurVar = (hur) this.a.b;
            try {
                File fileJ = hurVar.j(seoVar);
                if (fileJ.exists()) {
                    byte[] bArrG = y520.G(fileJ);
                    fileJ.setLastModified(((yqg) hurVar.b).b());
                    bArr = bArrG;
                }
            } catch (Exception unused) {
            }
            f1m1 f1m1Var = new f1m1(bArr != null ? new a58(bArr) : new d58(seoVar.a, seoVar.b, seoVar.c), seoVar.e);
            p0m1Var.b = 1;
            Object objB = r261Var.b(f1m1Var, p0m1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
