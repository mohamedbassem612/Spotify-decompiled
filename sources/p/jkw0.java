package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jkw0 extends a8d1 implements vu30 {
    public final /* synthetic */ String N0;
    public final /* synthetic */ h08 O0;
    public final /* synthetic */ yjp1 P0;
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ tv80 Z;
    public xgn0 a;
    public kkw0 b;
    public String c;
    public String d;
    public tv80 e;
    public String f;
    public h08 g;
    public yjp1 h;
    public boolean i;
    public final /* synthetic */ kkw0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkw0(kkw0 kkw0Var, String str, String str2, tv80 tv80Var, String str3, h08 h08Var, yjp1 yjp1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.t = kkw0Var;
        this.X = str;
        this.Y = str2;
        this.Z = tv80Var;
        this.N0 = str3;
        this.O0 = h08Var;
        this.P0 = yjp1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new jkw0(this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        kkw0 kkw0Var;
        tv80 tv80Var;
        String str3;
        xgn0 xgn0Var;
        yjp1 yjp1Var;
        h08 h08Var;
        boolean z = this.i;
        if (!z) {
            hm5.M(obj);
            kkw0 kkw0Var2 = this.t;
            xgn0 xgn0Var2 = kkw0Var2.e;
            this.a = xgn0Var2;
            this.b = kkw0Var2;
            String str4 = this.X;
            this.c = str4;
            str = this.Y;
            this.d = str;
            tv80 tv80Var2 = this.Z;
            this.e = tv80Var2;
            String str5 = this.N0;
            this.f = str5;
            h08 h08Var2 = this.O0;
            this.g = h08Var2;
            yjp1 yjp1Var2 = this.P0;
            this.h = yjp1Var2;
            this.i = true;
            Object objA = xgn0Var2.a(this);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            str2 = str5;
            kkw0Var = kkw0Var2;
            tv80Var = tv80Var2;
            str3 = str4;
            xgn0Var = xgn0Var2;
            yjp1Var = yjp1Var2;
            h08Var = h08Var2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yjp1 yjp1Var3 = this.h;
            h08 h08Var3 = this.g;
            String str6 = this.f;
            tv80 tv80Var3 = this.e;
            str = this.d;
            String str7 = this.c;
            kkw0 kkw0Var3 = this.b;
            xgn0Var = this.a;
            hm5.M(obj);
            str2 = str6;
            kkw0Var = kkw0Var3;
            tv80Var = tv80Var3;
            str3 = str7;
            yjp1Var = yjp1Var3;
            h08Var = h08Var3;
        }
        try {
            zau0 zau0Var = kkw0Var.d;
            if (!((Boolean) zau0Var.b.getValue()).booleanValue()) {
                kkw0Var.a.a(zau0Var);
                bpb1 bpb1Var = kkw0Var.c;
                bpb1Var.l(q3p1.r(zau0Var, (r091) bpb1Var.getValue()));
            }
            kkw0Var.a(str3, str, tv80Var, str2, h08Var, yjp1Var);
            return rih1.a;
        } finally {
            xgn0Var.c((Object) null);
        }
    }
}
