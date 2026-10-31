package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uem extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uem(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                uem uemVar = new uem(2, lnmVar, (byte) 0);
                uemVar.c = obj;
                return uemVar;
            default:
                uem uemVar2 = new uem(2, lnmVar, (byte) 1);
                uemVar2.c = obj;
                return uemVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                hem hemVar = new hem(new kjm((igm) null, (List) null, 3));
                this.c = null;
                this.b = true;
                return vr20Var.emit(hemVar, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = (vr20) this.c;
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
                x9a0 x9a0Var = x9a0.d;
                x9a0 x9a0VarH = vhc.h();
                this.c = null;
                this.b = true;
                return vr20Var2.emit(x9a0VarH, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
