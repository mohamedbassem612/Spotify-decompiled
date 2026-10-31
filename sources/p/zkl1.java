package p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zkl1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cll1 a;
    public final /* synthetic */ p811 b;

    public zkl1(cll1 cll1Var, p811 p811Var) {
        this.a = cll1Var;
        this.b = p811Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ykl1 ykl1Var;
        Uri uri;
        Uri uri2;
        if (onmVar instanceof ykl1) {
            ykl1Var = (ykl1) onmVar;
            int i = ykl1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ykl1Var.b = i - Integer.MIN_VALUE;
            } else {
                ykl1Var = new ykl1(this, onmVar);
            }
        } else {
            ykl1Var = new ykl1(this, onmVar);
        }
        Object obj2 = ykl1Var.a;
        d9n d9nVar = d9n.a;
        int i2 = ykl1Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1.a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        Uri uri3 = Uri.parse(((ygj0) obj).c);
        oll1 oll1Var = this.a.g;
        synchronized (oll1Var) {
            try {
                nll1 nll1Var = oll1Var.c;
                kll1 kll1Var = kll1.a;
                if (!nll1Var.equals(kll1Var)) {
                    if (nll1Var instanceof jll1) {
                        uri = ((jll1) nll1Var).a.a;
                    } else if (nll1Var instanceof lll1) {
                        uri = ((lll1) nll1Var).a;
                    } else {
                        if (!nll1Var.equals(mll1.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f8h1 f8h1VarA = oll1Var.a.a(uri3, oll1Var.b.a);
                        if (f8h1VarA != null) {
                            oll1Var.c = new jll1(f8h1VarA);
                            uri = f8h1VarA.a;
                        } else {
                            oll1Var.c = kll1Var;
                        }
                    }
                    uri2 = uri;
                }
                uri2 = uri3;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.a = fn31.T(zso1.H(this.a.h.e().getLifecycle()), flo1.l(this.a.a, op71.f()), 0, new l3g1(uri3, this.a, uri2, dt71VarE, (lnm) null, (byte) 9), 2);
        aud1 aud1Var = new aud1(r261Var, (byte) 16);
        ykl1Var.b = 1;
        dt71VarE.collect(aud1Var, ykl1Var);
        return d9nVar;
    }
}
