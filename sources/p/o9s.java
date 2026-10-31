package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o9s extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y9s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9s(y9s y9sVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = y9sVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                o9s o9sVar = new o9s(this.c, lnmVar, (byte) 0);
                o9sVar.b = obj;
                return o9sVar;
            default:
                o9s o9sVar2 = new o9s(this.c, lnmVar, (byte) 1);
                o9sVar2.b = obj;
                return o9sVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                create((rxt) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) this.b;
                hm5.M(obj);
                list.getClass();
                this.c.getClass();
                return Boolean.valueOf(y9s.d(list));
            default:
                rxt rxtVar = (rxt) this.b;
                hm5.M(obj);
                boolean z = rxtVar.b;
                y9s y9sVar = this.c;
                y9sVar.h = fn31.T(y9sVar.g, (o8n) null, 0, new hl1(y9sVar.h, y9sVar, z, (lnm) null, (byte) 3), 3);
                return rih1.a;
        }
    }
}
