package p;

import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eqo1 extends a8d1 implements vu30 {
    public zwo1 a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lqo1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ i2x0 g;
    public final /* synthetic */ swo1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqo1(long j, String str, lnm lnmVar, i2x0 i2x0Var, lqo1 lqo1Var, swo1 swo1Var) {
        super(2, lnmVar);
        this.d = lqo1Var;
        this.e = j;
        this.f = str;
        this.g = i2x0Var;
        this.h = swo1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        eqo1 eqo1Var = new eqo1(this.e, this.f, lnmVar, this.g, this.d, this.h);
        eqo1Var.c = obj;
        return eqo1Var;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    public final Object invokeSuspend(Object obj) throws zzhm {
        zwo1 zwo1Var;
        zwo1 zwo1Var2;
        zwo1 zwo1Var3;
        eto1 eto1VarC;
        qwo1 qwo1VarA;
        eto1 eto1Var;
        zwo1 zwo1Var4;
        lqo1 lqo1Var = this.d;
        rlf1 rlf1Var = (rlf1) lqo1Var.b;
        byte b = this.b;
        long j = this.e;
        String str = this.f;
        qwo1 qwo1Var = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                zwo1Var = (zwo1) this.c;
                lqo1.a(lqo1Var, j, str);
                vfo1 vfo1VarD = rlf1Var.d();
                this.c = zwo1Var;
                this.a = zwo1Var;
                this.b = (byte) 1;
                obj = vfo1VarD.a();
                if (obj != qwo1Var) {
                    zwo1Var2 = zwo1Var;
                }
                return qwo1Var;
            }
            if (b == 1) {
                zwo1Var = this.a;
                zwo1Var2 = (zwo1) this.c;
                hm5.M(obj);
            } else {
                if (b == 2) {
                    zwo1Var3 = (zwo1) this.c;
                    hm5.M(obj);
                    eto1VarC = rlf1Var.c(str, this.g);
                    this.c = eto1VarC;
                    this.a = zwo1Var3;
                    this.b = (byte) 3;
                    qwo1VarA = eto1VarC.a(j, this);
                    if (qwo1VarA != qwo1Var) {
                        zwo1 zwo1Var5 = zwo1Var3;
                        eto1Var = eto1VarC;
                        obj = qwo1VarA;
                        zwo1Var4 = zwo1Var5;
                        this.c = eto1Var;
                        this.a = null;
                        this.b = (byte) 4;
                        if (((qwo1) obj).a(zwo1Var4, this) == qwo1Var) {
                        }
                    }
                    return qwo1Var;
                }
                if (b != 3) {
                    eto1Var = (eto1) this.c;
                    hm5.M(obj);
                } else {
                    zwo1 zwo1Var6 = this.a;
                    eto1 eto1Var2 = (eto1) this.c;
                    hm5.M(obj);
                    zwo1Var4 = zwo1Var6;
                    eto1Var = eto1Var2;
                    this.c = eto1Var;
                    this.a = null;
                    this.b = (byte) 4;
                    if (((qwo1) obj).a(zwo1Var4, this) == qwo1Var) {
                        return qwo1Var;
                    }
                }
            }
            xoo1 xoo1Var = new xoo1(eto1Var, str, this.h, rlf1Var.e());
            lqo1Var.d = xoo1Var;
            return xoo1Var;
            this.c = zwo1Var2;
            this.a = null;
            this.b = (byte) 2;
            if (((qwo1) obj).a(zwo1Var, this) != qwo1Var) {
                zwo1Var3 = zwo1Var2;
                eto1VarC = rlf1Var.c(str, this.g);
                this.c = eto1VarC;
                this.a = zwo1Var3;
                this.b = (byte) 3;
                qwo1VarA = eto1VarC.a(j, this);
                if (qwo1VarA != qwo1Var) {
                    zwo1 zwo1Var7 = zwo1Var3;
                    eto1Var = eto1VarC;
                    obj = qwo1VarA;
                    zwo1Var4 = zwo1Var7;
                    this.c = eto1Var;
                    this.a = null;
                    this.b = (byte) 4;
                    if (((qwo1) obj).a(zwo1Var4, this) == qwo1Var) {
                    }
                    xoo1 xoo1Var2 = new xoo1(eto1Var, str, this.h, rlf1Var.e());
                    lqo1Var.d = xoo1Var2;
                    return xoo1Var2;
                }
            }
            return qwo1Var;
        } catch (zzhm e) {
            throw e;
        } catch (Exception e2) {
            throw new zzhm(tgo1.c, ij81.d, e2.getMessage(), (Exception) null);
        }
    }
}
