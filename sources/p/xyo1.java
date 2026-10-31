package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xyo1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public Object b;
    public String c;
    public byte d;
    public final /* synthetic */ Object e;
    public Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyo1(String str, ain1 ain1Var, ain1 ain1Var2, fqn1 fqn1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.c = str;
        this.f = ain1Var;
        this.g = ain1Var2;
        this.e = fqn1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                return new xyo1((yyo1) obj3, (String) obj2, lnmVar, (byte) 0);
            case 1:
                return new xyo1((bzo1) obj3, (String) obj2, lnmVar, (byte) 1);
            default:
                xyo1 xyo1Var = new xyo1(this.c, (ain1) this.f, (ain1) obj3, (fqn1) obj2, lnmVar);
                xyo1Var.b = obj;
                return xyo1Var;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zwo1 zwo1Var = (zwo1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(zwo1Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        yyo1 yyo1Var;
        String str;
        vgn0 vgn0VarC;
        Throwable th;
        vgn0 vgn0Var;
        bzo1 bzo1Var;
        String str2;
        vgn0 vgn0VarC2;
        Throwable th2;
        vgn0 vgn0Var2;
        zwo1 zwo1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.g;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.d;
                try {
                    if (b2 == 0) {
                        hm5.M(obj);
                        yyo1Var = (yyo1) obj3;
                        str = (String) obj2;
                        vgn0VarC = yyo1Var.c();
                        this.b = vgn0VarC;
                        this.f = yyo1Var;
                        this.c = str;
                        this.d = (byte) 1;
                        if (vgn0VarC.a(this) != d9nVar) {
                        }
                        return d9nVar;
                    }
                    if (b2 != 1) {
                        vgn0Var = (vgn0) this.b;
                        try {
                            hm5.M(obj);
                            vgn0Var.c((Object) null);
                            return rih1Var;
                        } catch (Throwable th3) {
                            th = th3;
                            vgn0Var.c((Object) null);
                            throw th;
                        }
                    }
                    str = this.c;
                    yyo1 yyo1Var2 = (yyo1) this.f;
                    vgn0 vgn0Var3 = (vgn0) this.b;
                    hm5.M(obj);
                    yyo1Var = yyo1Var2;
                    vgn0VarC = vgn0Var3;
                    a6n1 a6n1VarJ = yyo1Var.j();
                    String strB = yyo1Var.b();
                    StringBuilder sb = new StringBuilder(strB.length() + String.valueOf(str).length());
                    sb.append(strB);
                    sb.append(str);
                    String string = sb.toString();
                    this.b = vgn0VarC;
                    this.f = null;
                    this.c = null;
                    this.d = (byte) 2;
                    if (a6n1VarJ.d(string, this) != d9nVar) {
                        vgn0Var = vgn0VarC;
                        vgn0Var.c((Object) null);
                        return rih1Var;
                    }
                    return d9nVar;
                } catch (Throwable th4) {
                    th = th4;
                    vgn0Var = vgn0VarC;
                    vgn0Var.c((Object) null);
                    throw th;
                }
            case 1:
                byte b3 = this.d;
                try {
                    if (b3 == 0) {
                        hm5.M(obj);
                        bzo1Var = (bzo1) obj3;
                        str2 = (String) obj2;
                        vgn0VarC2 = bzo1Var.c();
                        this.b = vgn0VarC2;
                        this.f = bzo1Var;
                        this.c = str2;
                        this.d = (byte) 1;
                        if (vgn0VarC2.a(this) != d9nVar) {
                        }
                        return d9nVar;
                    }
                    if (b3 != 1) {
                        vgn0Var2 = (vgn0) this.b;
                        try {
                            hm5.M(obj);
                            vgn0Var2.c((Object) null);
                            return rih1Var;
                        } catch (Throwable th5) {
                            th2 = th5;
                            vgn0Var2.c((Object) null);
                            throw th2;
                        }
                    }
                    str2 = this.c;
                    bzo1 bzo1Var2 = (bzo1) this.f;
                    vgn0 vgn0Var4 = (vgn0) this.b;
                    hm5.M(obj);
                    bzo1Var = bzo1Var2;
                    vgn0VarC2 = vgn0Var4;
                    a6n1 a6n1Var = bzo1Var.j;
                    String strB2 = bzo1Var.b();
                    StringBuilder sb2 = new StringBuilder(strB2.length() + String.valueOf(str2).length());
                    sb2.append(strB2);
                    sb2.append(str2);
                    String string2 = sb2.toString();
                    this.b = vgn0VarC2;
                    this.f = null;
                    this.c = null;
                    this.d = (byte) 2;
                    if (a6n1Var.d(string2, this) != d9nVar) {
                        vgn0Var2 = vgn0VarC2;
                        vgn0Var2.c((Object) null);
                        return rih1Var;
                    }
                    return d9nVar;
                } catch (Throwable th6) {
                    th2 = th6;
                    vgn0Var2 = vgn0VarC2;
                    vgn0Var2.c((Object) null);
                    throw th2;
                }
            default:
                byte b4 = this.d;
                if (b4 != 0) {
                    if (b4 != 1) {
                        hm5.M(obj);
                    } else {
                        zwo1Var = (zwo1) this.b;
                        hm5.M(obj);
                    }
                    return (sln1) obj;
                }
                hm5.M(obj);
                zwo1Var = (zwo1) this.b;
                String str3 = this.c;
                rln1 rln1VarC = sln1.C();
                rln1VarC.h(str3);
                rln1VarC.l((ain1) this.f);
                rln1VarC.i((ain1) obj3);
                sln1 sln1VarE = rln1VarC.e();
                uyo1 uyo1VarG = ((fqn1) obj2).g();
                this.b = zwo1Var;
                this.d = (byte) 1;
                obj = f0p1.e(uyo1VarG, sln1VarE);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                this.b = null;
                this.d = (byte) 2;
                obj = ((nwo1) obj).a(zwo1Var, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                return (sln1) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xyo1(f0p1 f0p1Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.g = f0p1Var;
        this.e = str;
    }
}
