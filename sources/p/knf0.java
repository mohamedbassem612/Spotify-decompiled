package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class knf0 extends a8d1 implements vu30 {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ dhf0 Z;
    public vgn0 a;
    public String b;
    public lnf0 c;
    public String d;
    public String e;
    public dhf0 f;
    public int g;
    public byte h;
    public final /* synthetic */ lnf0 i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knf0(lnf0 lnf0Var, String str, String str2, String str3, dhf0 dhf0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.i = lnf0Var;
        this.t = str;
        this.X = str2;
        this.Y = str3;
        this.Z = dhf0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new knf0(this.i, this.t, this.X, this.Y, this.Z, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        lnf0 lnf0Var;
        knf0 knf0Var;
        String str;
        String str2;
        String str3;
        dhf0 dhf0Var;
        int i;
        knf0 knf0Var2;
        a9h a9hVar;
        byte b = this.h;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (b == 0) {
                    hm5.M(obj);
                    lnf0Var = this.i;
                    knf0Var = lnf0Var.l;
                    this.a = knf0Var;
                    str = this.t;
                    this.b = str;
                    this.c = lnf0Var;
                    str2 = this.X;
                    this.d = str2;
                    str3 = this.Y;
                    this.e = str3;
                    dhf0 dhf0Var2 = this.Z;
                    this.f = dhf0Var2;
                    this.g = 0;
                    this.h = (byte) 1;
                    if (knf0Var.a(this) != d9nVar) {
                        dhf0Var = dhf0Var2;
                        i = 0;
                    }
                    return d9nVar;
                }
                if (b != 1) {
                    if (b == 2) {
                        knf0Var2 = this.a;
                        hm5.M(obj);
                        a9hVar = (a9h) obj;
                        knf0Var2.c((Object) null);
                        a9hVar.getClass();
                        return a9hVar;
                    }
                    if (b != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    knf0Var2 = this.a;
                    hm5.M(obj);
                    a9hVar = (a9h) obj;
                    knf0Var2.c((Object) null);
                    a9hVar.getClass();
                    return a9hVar;
                }
                i = this.g;
                dhf0Var = this.f;
                str3 = this.e;
                str2 = this.d;
                lnf0Var = this.c;
                str = this.b;
                knf0 knf0Var3 = this.a;
                hm5.M(obj);
                knf0Var = knf0Var3;
                if (str == null) {
                    a9h a9hVar2 = (a9h) lnf0Var.c.a.c(str2);
                    if (a9hVar2 == null) {
                        Single singleB = lnf0Var.b(str2, str3, dhf0Var, (String) null);
                        this.a = knf0Var;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.f = null;
                        this.g = i;
                        this.h = (byte) 3;
                        Object objJ = fc11.j(singleB, this);
                        if (objJ != d9nVar) {
                            knf0 knf0Var4 = knf0Var;
                            obj = objJ;
                            knf0Var2 = knf0Var4;
                            a9hVar = (a9h) obj;
                        }
                    } else {
                        knf0Var2 = knf0Var;
                        a9hVar = a9hVar2;
                    }
                    knf0Var2.c((Object) null);
                    a9hVar.getClass();
                    return a9hVar;
                }
                Single singleB2 = lnf0Var.b(str2, str3, dhf0Var, str);
                this.a = knf0Var;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = i;
                this.h = (byte) 2;
                Object objJ2 = fc11.j(singleB2, this);
                if (objJ2 != d9nVar) {
                    knf0 knf0Var5 = knf0Var;
                    obj = objJ2;
                    knf0Var2 = knf0Var5;
                    a9hVar = (a9h) obj;
                    knf0Var2.c((Object) null);
                    a9hVar.getClass();
                    return a9hVar;
                }
                return d9nVar;
            } catch (Throwable th) {
                knf0 knf0Var6 = knf0Var;
                th = th;
                this = knf0Var6;
                this.c((Object) null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
