package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bqa1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ cqa1 c;
    public final /* synthetic */ zpa1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bqa1(cqa1 cqa1Var, zpa1 zpa1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = cqa1Var;
        this.d = zpa1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        zpa1 zpa1Var = this.d;
        cqa1 cqa1Var = this.c;
        switch (b) {
            case 0:
                return new bqa1(cqa1Var, zpa1Var, lnmVar, (byte) 0);
            default:
                return new bqa1(cqa1Var, zpa1Var, lnmVar, (byte) 1);
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
        zpa1 zpa1Var = this.d;
        cqa1 cqa1Var = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ylk0 ylk0Var = cqa1Var.a;
                String str = zpa1Var.a;
                List list = zpa1Var.b;
                List list2 = zpa1Var.c;
                this.b = true;
                Object objD = ylk0Var.d.d(str, list, list2, this);
                return objD == d9nVar ? d9nVar : objD;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    bqa1 bqa1Var = new bqa1(cqa1Var, zpa1Var, lnmVar, (byte) 0);
                    this.b = true;
                    obj = rc2.O(20000L, bqa1Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                List list3 = (List) obj;
                return list3 == null ? z6x.a : list3;
        }
    }
}
