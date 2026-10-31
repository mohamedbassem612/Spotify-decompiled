package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bnk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cnk a;

    public bnk(cnk cnkVar) {
        this.a = cnkVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ank ankVar;
        r261 r261Var2;
        imk imkVar;
        String str;
        ink hnkVar;
        if (onmVar instanceof ank) {
            ankVar = (ank) onmVar;
            int i = ankVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ankVar.b = i - Integer.MIN_VALUE;
            } else {
                ankVar = new ank(this, onmVar);
            }
        } else {
            ankVar = new ank(this, onmVar);
        }
        Object obj2 = ankVar.a;
        int i2 = ankVar.b;
        rih1 rih1Var = rih1.a;
        cnk cnkVar = this.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    str = ankVar.f;
                    imkVar = ankVar.e;
                    r261Var2 = ankVar.d;
                    try {
                        hm5.M(obj2);
                    } catch (Exception unused) {
                        hnkVar = new hnk(imkVar.b);
                    }
                } else {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj2);
                }
                return rih1Var;
            }
            hm5.M(obj2);
            imk imkVar2 = (imk) obj;
            try {
                Set set = s4b1.f;
                String strS = uic.x(imkVar2.a).s();
                if (strS == null) {
                    hnkVar = new hnk(imkVar2.b);
                    ankVar.d = null;
                    ankVar.e = null;
                    ankVar.f = null;
                    ankVar.b = 2;
                    if (r261Var.b(hnkVar, ankVar) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    fnk fnkVar = cnkVar.a;
                    ankVar.d = r261Var;
                    ankVar.e = imkVar2;
                    ankVar.f = strS;
                    ankVar.b = 1;
                    if (fnkVar.b(strS, ankVar) != d9nVar) {
                        r261Var2 = r261Var;
                        imkVar = imkVar2;
                        str = strS;
                    }
                }
            } catch (Exception unused2) {
                r261Var2 = r261Var;
                imkVar = imkVar2;
                hnkVar = new hnk(imkVar.b);
            }
            return d9nVar;
            ((dt71) cnkVar.h.c).a(rih1Var);
            hnkVar = new ink(str, imkVar.b);
            r261Var = r261Var2;
            ankVar.d = null;
            ankVar.e = null;
            ankVar.f = null;
            ankVar.b = 2;
            if (r261Var.b(hnkVar, ankVar) != d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
