package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class id91 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ kd91 c;
    public final /* synthetic */ ff91 d;
    public final /* synthetic */ qkg e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id91(kd91 kd91Var, ff91 ff91Var, qkg qkgVar, String str, boolean z, String str2, String str3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = kd91Var;
        this.d = ff91Var;
        this.e = qkgVar;
        this.f = str;
        this.g = z;
        this.h = str2;
        this.i = str3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new id91(this.c, this.d, this.e, this.f, this.g, this.h, this.i, lnmVar, (byte) 0);
            default:
                return new id91(this.c, this.d, this.e, this.f, this.g, this.h, this.i, lnmVar, (byte) 1);
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
        d9n d9nVar = d9n.a;
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
                upc upcVar = upc.o;
                upcVar.getClass();
                String strZ = nyn1.Z(upcVar);
                this.b = true;
                Object objA = this.c.a(this.d, this.e, strZ, this.f, this.g, this.h, this.i, this);
                return objA == d9nVar ? d9nVar : objA;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA2 = this.c.a(this.d, this.e, "", this.f, this.g, this.h, this.i, this);
                    return objA2 == d9nVar ? d9nVar : objA2;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
