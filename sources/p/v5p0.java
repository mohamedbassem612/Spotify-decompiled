package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v5p0 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ x5p0 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5p0(x5p0 x5p0Var, long j, lnm lnmVar) {
        super(1, lnmVar);
        this.b = x5p0Var;
        this.c = j;
    }

    public final lnm create(lnm lnmVar) {
        return new v5p0(this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            int i = x5p0.h;
            x5p0 x5p0Var = this.b;
            if (x5p0Var.b.a0) {
                yb7 yb7Var = x5p0Var.a;
                if (yb7Var.d == qb7.a) {
                    String str = yb7Var.c;
                    Set set = s4b1.f;
                    if (uic.k(str, new b3i1[]{nyu0.e, wyu0.f})) {
                        this.a = true;
                        obj = x5p0Var.g(this.c, this);
                        d9n d9nVar = d9n.a;
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
            }
            return k5p0.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        return (l5p0) obj;
    }
}
