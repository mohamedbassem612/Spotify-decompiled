package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rq71 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tq71 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ il71 f;
    public final /* synthetic */ z771 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rq71(byte b, String str, lnm lnmVar, z771 z771Var, il71 il71Var, tq71 tq71Var) {
        super(2, lnmVar);
        this.a = b;
        this.d = tq71Var;
        this.e = str;
        this.f = il71Var;
        this.g = z771Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                rq71 rq71Var = new rq71((byte) 0, this.e, lnmVar, this.g, this.f, this.d);
                rq71Var.c = obj;
                return rq71Var;
            default:
                rq71 rq71Var2 = new rq71((byte) 1, this.e, lnmVar, this.g, this.f, this.d);
                rq71Var2.c = obj;
                return rq71Var2;
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
        tq71 tq71Var;
        Object objV;
        tq71 tq71Var2;
        Object objV2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                c9n c9nVar = (c9n) this.c;
                boolean z = this.b;
                tq71 tq71Var3 = this.d;
                if (!z) {
                    hm5.M(obj);
                    tq71Var = tq71Var3;
                    l2t[] l2tVarArr = {fn31.q(c9nVar, (o8n) null, 0, new qq71((byte) 0, this.e, null, this.g, this.f, tq71Var3), 3), fn31.q(c9nVar, (o8n) null, 0, new qq71((byte) 1, this.e, null, this.g, this.f, tq71Var3), 3)};
                    this.c = null;
                    this.b = true;
                    objV = o1p1.v(l2tVarArr, this);
                    if (objV == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objV = obj;
                    tq71Var = tq71Var3;
                }
                List list = (List) objV;
                return new zd71(tq71Var.a, this.e, (jq71) list.get(0), (jq71) list.get(1), null, 16);
            default:
                c9n c9nVar2 = (c9n) this.c;
                boolean z2 = this.b;
                tq71 tq71Var4 = this.d;
                if (!z2) {
                    hm5.M(obj);
                    tq71Var2 = tq71Var4;
                    l2t[] l2tVarArr2 = {fn31.q(c9nVar2, (o8n) null, 0, new qq71((byte) 2, this.e, null, this.g, this.f, tq71Var4), 3), fn31.q(c9nVar2, (o8n) null, 0, new qq71((byte) 3, this.e, null, this.g, this.f, tq71Var4), 3)};
                    this.c = null;
                    this.b = true;
                    objV2 = o1p1.v(l2tVarArr2, this);
                    if (objV2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objV2 = obj;
                    tq71Var2 = tq71Var4;
                }
                List list2 = (List) objV2;
                return new zd71(tq71Var2.a, this.e, (jq71) list2.get(0), (jq71) list2.get(1), null, 16);
        }
    }
}
