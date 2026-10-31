package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rjm implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ cv30 f;

    public /* synthetic */ rjm(mr20 mr20Var, Object obj, Function0 function0, Object obj2, cv30 cv30Var, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = obj;
        this.d = function0;
        this.e = obj2;
        this.f = cv30Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        vu30 vu30Var = this.f;
        Object obj = this.e;
        Object obj2 = this.c;
        mr20 mr20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mr20Var.collect(new d9l(vr20Var, (k9k) obj2, this.d, (lew0) obj, (lew0) vu30Var, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = ((p3t) mr20Var).collect(new d9l(vr20Var, (dpb) obj2, this.d, (Set) obj, vu30Var, (byte) 4), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
