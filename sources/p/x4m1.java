package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x4m1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public vgn0 b;
    public y4m1 c;
    public String d;
    public boolean e;
    public int f;
    public byte g;
    public final /* synthetic */ y4m1 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4m1(y4m1 y4m1Var, String str, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.h = y4m1Var;
        this.i = str;
        this.t = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new x4m1(this.h, this.i, this.t, lnmVar, (byte) 0);
            case 1:
                return new x4m1(this.h, this.i, this.t, lnmVar, (byte) 1);
            default:
                return new x4m1(this.h, this.i, this.t, lnmVar, (byte) 2);
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
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        vgn0 vgn0Var;
        Throwable th;
        vgn0 vgn0Var2;
        vgn0 vgn0Var3;
        Throwable th2;
        vgn0 vgn0Var4;
        vgn0 vgn0Var5;
        Throwable th3;
        vgn0 vgn0Var6;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.t;
        String str = this.i;
        y4m1 y4m1Var = this.h;
        d9n d9nVar = d9n.a;
        int i = 0;
        switch (b) {
            case 0:
                byte b2 = this.g;
                try {
                    if (b2 == 0) {
                        hm5.M(obj);
                        vgn0Var = y4m1Var.d;
                        this.b = vgn0Var;
                        this.c = y4m1Var;
                        this.d = str;
                        this.e = z;
                        this.f = 0;
                        this.g = (byte) 1;
                        if (vgn0Var.a(this) != d9nVar) {
                        }
                        return d9nVar;
                    }
                    if (b2 != 1) {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vgn0Var2 = this.b;
                        try {
                            hm5.M(obj);
                            vgn0Var2.c((Object) null);
                            return rih1Var;
                        } catch (Throwable th4) {
                            th = th4;
                            vgn0Var2.c((Object) null);
                            throw th;
                        }
                    }
                    i = this.f;
                    z = this.e;
                    str = this.d;
                    y4m1Var = this.c;
                    vgn0 vgn0Var7 = this.b;
                    hm5.M(obj);
                    vgn0Var = vgn0Var7;
                    bma1 bma1Var = ezl1.b;
                    this.b = vgn0Var;
                    this.c = null;
                    this.d = null;
                    this.f = i;
                    this.g = (byte) 2;
                    if (y4m1Var.d(bma1Var, str, z, this) != d9nVar) {
                        vgn0Var2 = vgn0Var;
                        vgn0Var2.c((Object) null);
                        return rih1Var;
                    }
                    return d9nVar;
                } catch (Throwable th5) {
                    vgn0 vgn0Var8 = vgn0Var;
                    th = th5;
                    vgn0Var2 = vgn0Var8;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            case 1:
                byte b3 = this.g;
                try {
                    if (b3 == 0) {
                        hm5.M(obj);
                        vgn0Var3 = y4m1Var.d;
                        this.b = vgn0Var3;
                        this.c = y4m1Var;
                        this.d = str;
                        this.e = z;
                        this.f = 0;
                        this.g = (byte) 1;
                        if (vgn0Var3.a(this) != d9nVar) {
                        }
                        return d9nVar;
                    }
                    if (b3 != 1) {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vgn0Var4 = this.b;
                        try {
                            hm5.M(obj);
                            vgn0Var4.c((Object) null);
                            return rih1Var;
                        } catch (Throwable th6) {
                            th2 = th6;
                            vgn0Var4.c((Object) null);
                            throw th2;
                        }
                    }
                    i = this.f;
                    z = this.e;
                    str = this.d;
                    y4m1Var = this.c;
                    vgn0 vgn0Var9 = this.b;
                    hm5.M(obj);
                    vgn0Var3 = vgn0Var9;
                    this.b = vgn0Var3;
                    this.c = null;
                    this.d = null;
                    this.f = i;
                    this.g = (byte) 2;
                    if (y4m1Var.c(str, this, z) != d9nVar) {
                        vgn0Var4 = vgn0Var3;
                        vgn0Var4.c((Object) null);
                        return rih1Var;
                    }
                    return d9nVar;
                } catch (Throwable th7) {
                    vgn0 vgn0Var10 = vgn0Var3;
                    th2 = th7;
                    vgn0Var4 = vgn0Var10;
                    vgn0Var4.c((Object) null);
                    throw th2;
                }
            default:
                byte b4 = this.g;
                try {
                    if (b4 == 0) {
                        hm5.M(obj);
                        vgn0Var5 = y4m1Var.d;
                        this.b = vgn0Var5;
                        this.c = y4m1Var;
                        this.d = str;
                        this.e = z;
                        this.f = 0;
                        this.g = (byte) 1;
                        if (vgn0Var5.a(this) != d9nVar) {
                        }
                        return d9nVar;
                    }
                    if (b4 != 1) {
                        if (b4 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vgn0Var6 = this.b;
                        try {
                            hm5.M(obj);
                            vgn0Var6.c((Object) null);
                            return rih1Var;
                        } catch (Throwable th8) {
                            th3 = th8;
                            vgn0Var6.c((Object) null);
                            throw th3;
                        }
                    }
                    i = this.f;
                    z = this.e;
                    str = this.d;
                    y4m1Var = this.c;
                    vgn0 vgn0Var11 = this.b;
                    hm5.M(obj);
                    vgn0Var5 = vgn0Var11;
                    bma1 bma1Var2 = ezl1.a;
                    this.b = vgn0Var5;
                    this.c = null;
                    this.d = null;
                    this.f = i;
                    this.g = (byte) 2;
                    if (y4m1Var.d(bma1Var2, str, z, this) != d9nVar) {
                        vgn0Var6 = vgn0Var5;
                        vgn0Var6.c((Object) null);
                        return rih1Var;
                    }
                    return d9nVar;
                } catch (Throwable th9) {
                    vgn0 vgn0Var12 = vgn0Var5;
                    th3 = th9;
                    vgn0Var6 = vgn0Var12;
                    vgn0Var6.c((Object) null);
                    throw th3;
                }
        }
    }
}
