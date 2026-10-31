package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pc01 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ jkr0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc01(jkr0 jkr0Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = jkr0Var;
        this.d = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.d;
        jkr0 jkr0Var = this.c;
        switch (b) {
            case 0:
                return new pc01(jkr0Var, ven0Var, lnmVar, (byte) 0);
            default:
                return new pc01(jkr0Var, ven0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        ven0 ven0Var = this.d;
        jkr0 jkr0Var = this.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    int iS = ((err0) jkr0Var.d.c).s();
                    id01 id01Var = zc01.a;
                    if (iS >= ((List) ven0Var.getValue()).size() && !((List) ven0Var.getValue()).isEmpty()) {
                        int size = ((List) ven0Var.getValue()).size() - 1;
                        this.b = true;
                        if (jkr0.s(jkr0Var, size, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = jkr0Var.p.a;
                mp0 mp0Var = new mp0(ven0Var, (byte) 26);
                this.b = true;
                dt71Var.collect(mp0Var, this);
                return d9nVar;
        }
    }
}
