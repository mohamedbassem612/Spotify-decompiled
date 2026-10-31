package p;

import android.net.Uri;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ga41 implements hyf0 {
    public final /* synthetic */ uph a;

    public ga41(uph uphVar) {
        this.a = uphVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(lnm lnmVar) {
        fa41 fa41Var;
        Object objA;
        mn1 mn1Var = (mn1) this.a.b;
        if (lnmVar instanceof fa41) {
            fa41Var = (fa41) lnmVar;
            int i = fa41Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fa41Var.c = i - Integer.MIN_VALUE;
            } else {
                fa41Var = new fa41(this, (onm) lnmVar);
            }
        } else {
            fa41Var = new fa41(this, (onm) lnmVar);
        }
        Object obj = fa41Var.a;
        int i2 = fa41Var.c;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                fa41Var.c = 1;
                Uri uri = mn1Var.g;
                if (uri == null || (objA = mn1Var.a(uri.toString(), fa41Var)) != d9nVar) {
                    objA = rih1.a;
                }
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    throw new KotlinNothingValueException();
                }
                hm5.M(obj);
            }
            fa41Var.c = 2;
            hap1.f(fa41Var);
            return d9nVar;
        } catch (Throwable th) {
            d520 d520Var = mn1Var.b;
            ((vku) d520Var.g).c();
            vh3 vh3Var = (vh3) d520Var.h;
            if (vh3Var != null) {
                vh3Var.dismiss();
            }
            d520Var.h = null;
            throw th;
        }
    }
}
