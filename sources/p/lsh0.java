package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lsh0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsh0(pt ptVar, tbr0 tbr0Var, i8h1 i8h1Var, ihg0 ihg0Var, ihg0 ihg0Var2, String str, ihg0 ihg0Var3, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = ptVar;
        this.c = tbr0Var;
        this.d = i8h1Var;
        this.e = ihg0Var;
        this.f = ihg0Var2;
        this.h = str;
        this.g = ihg0Var3;
        this.i = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                return new lsh0((pt) this.b, (tbr0) obj8, (i8h1) obj7, (ihg0) obj6, (ihg0) obj5, (String) obj3, (ihg0) obj4, (iu30) obj2, lnmVar);
            default:
                lsh0 lsh0Var = new lsh0((fal1) obj8, (ven0) obj7, (m0t) obj6, (gij1) obj5, (q9l1) obj4, (ven0) obj3, (o0i) obj2, lnmVar);
                lsh0Var.b = obj;
                return lsh0Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (b) {
            case 0:
                hm5.M(obj);
                pt ptVar = (pt) this.b;
                xsh0 xsh0Var = (xsh0) ptVar.d;
                xsh0Var.h = new xwb((tbr0) obj6, (byte) 4);
                xsh0Var.c = new gnf0((i8h1) obj5, ptVar, (ihg0) obj8, (byte) 10);
                xsh0Var.d = new dvg0((ihg0) obj7, (String) obj3, (byte) 2);
                xsh0Var.g = new qee0((ihg0) obj4, (byte) 1);
                iu30 iu30Var = (iu30) obj2;
                xsh0Var.e = new ksh0(ptVar, iu30Var, (byte) 0);
                xsh0Var.f = new ksh0(ptVar, iu30Var, (byte) 1);
                break;
            default:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                ven0 ven0Var = (ven0) obj5;
                lnm lnmVar = null;
                fn31.T(c9nVar, (o8n) null, 0, new d7i0(obj6, (Object) ven0Var, lnmVar, (byte) 27), 3);
                fn31.T(c9nVar, (o8n) null, 0, new ary((byte) 21, (m0t) obj8, (gij1) obj7, (q9l1) obj4, ven0Var, (ven0) obj3, (lnm) null), 3);
                o0i o0iVar = (o0i) obj2;
                fn31.T(c9nVar, (o8n) null, 0, new wkk0(o0iVar, ven0Var, (gij1) obj7, lnmVar, (byte) 11), 3);
                m0t m0tVar = (m0t) obj8;
                fn31.T(c9nVar, (o8n) null, 0, new zwm0(m0tVar, ven0Var, (lnm) null, (byte) 0), 3);
                fn31.T(c9nVar, (o8n) null, 0, new wkk0(m0tVar, o0iVar, ven0Var, lnmVar, (byte) 12), 3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsh0(fal1 fal1Var, ven0 ven0Var, m0t m0tVar, gij1 gij1Var, q9l1 q9l1Var, ven0 ven0Var2, o0i o0iVar, lnm lnmVar) {
        super(2, lnmVar);
        this.c = fal1Var;
        this.d = ven0Var;
        this.e = m0tVar;
        this.f = gij1Var;
        this.g = q9l1Var;
        this.h = ven0Var2;
        this.i = o0iVar;
    }
}
