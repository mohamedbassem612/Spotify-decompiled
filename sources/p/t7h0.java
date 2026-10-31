package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t7h0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7h0(Object obj, String str, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = str;
        this.e = obj2;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                t7h0 t7h0Var = new t7h0((y7h0) obj3, this.c, (List) obj2, lnmVar, (byte) 0);
                t7h0Var.b = obj;
                return t7h0Var;
            default:
                t7h0 t7h0Var2 = new t7h0((u9c) obj3, this.c, (String) obj2, lnmVar, (byte) 1);
                t7h0Var2.b = obj;
                return t7h0Var2;
        }
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((t7h0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                ((t7h0) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                y7h0 y7h0Var = (y7h0) obj3;
                c921.y(c9nVar, (o8n) null, 0, new v4e0(y7h0Var, this.c, (lnm) null, (byte) 16), 3);
                List list = (List) obj2;
                c921.y(c9nVar, (o8n) null, 0, new s7h0(y7h0Var, list, (lnm) null, (byte) 0), 3);
                c921.y(c9nVar, (o8n) null, 0, new s7h0(y7h0Var, list, (lnm) null, (byte) 1), 3);
                c921.y(c9nVar, (o8n) null, 0, new s7h0(y7h0Var, list, (lnm) null, (byte) 2), 3);
                return c921.y(c9nVar, (o8n) null, 0, new s7h0(y7h0Var, list, (lnm) null, (byte) 3), 3);
            default:
                hm5.M(obj);
                zwo1 zwo1Var = (zwo1) this.b;
                u9c u9cVar = (u9c) obj3;
                String str = this.c;
                c921.y(((qeh1) u9cVar.f).a(), (o8n) null, 0, new azn1(zwo1Var, u9cVar, str, (String) obj2, new vrv0(u9cVar, str, (l2t) null, (sln1) null), (lnm) null, (byte) 1), 3);
                return rih1.a;
        }
    }
}
