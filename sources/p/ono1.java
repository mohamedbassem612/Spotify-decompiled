package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ono1 extends a8d1 implements vu30 {
    public zwo1 a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cik1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ono1(cik1 cik1Var, long j, long j2, lnm lnmVar) {
        super(2, lnmVar);
        this.d = cik1Var;
        this.e = j;
        this.f = j2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ono1 ono1Var = new ono1(this.d, this.e, this.f, lnmVar);
        ono1Var.c = obj;
        return ono1Var;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e7 A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        zwo1 zwo1Var;
        Object qwo1Var;
        zwo1 zwo1Var2;
        Object objInvoke;
        zwo1 zwo1Var3;
        yln1 yln1Var;
        bz11 bz11Var;
        u9c u9cVarW;
        Object qwo1Var2;
        yln1 yln1Var2;
        cik1 cik1Var = this.d;
        cik1 cik1Var2 = (cik1) cik1Var.b;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            zwo1Var = (zwo1) this.c;
            this.c = zwo1Var;
            this.a = zwo1Var;
            this.b = (byte) 1;
            qwo1Var = new qwo1(new oz80(cik1Var2, this.e, (lnm) null));
            if (qwo1Var != d9nVar) {
                zwo1Var2 = zwo1Var;
            }
            return d9nVar;
        }
        if (b == 1) {
            zwo1Var = this.a;
            zwo1Var2 = (zwo1) this.c;
            hm5.M(obj);
            qwo1Var = obj;
        } else {
            if (b == 2) {
                zwo1 zwo1Var4 = (zwo1) this.c;
                hm5.M(obj);
                zwo1Var3 = zwo1Var4;
                objInvoke = obj;
                yln1Var = (yln1) objInvoke;
                if (((b1o1) cik1Var.e) == null) {
                    return yln1Var;
                }
                bz11Var = (bz11) cik1Var.d;
                if (yln1Var.G()) {
                    ssk1 ssk1VarW = bz11Var.w(false);
                    tmc0 tmc0Var = new tmc0(Collections.singletonList(bz11Var.x(true)), false);
                    fqn1 fqn1Var = (fqn1) bz11Var.d;
                    u9cVarW = new u9c(ssk1VarW, tmc0Var, (uyo1) fqn1Var.c, (dzp0) bz11Var.e, (qeh1) bz11Var.k);
                } else {
                    u9cVarW = bz11Var.w(true);
                }
                u9c u9cVar = u9cVarW;
                cik1Var.e = u9cVar;
                this.c = yln1Var;
                this.a = zwo1Var3;
                this.b = (byte) 3;
                qwo1Var2 = new qwo1(new p18(this.f, cik1Var2, u9cVar, yln1Var, (lnm) null, (byte) 7));
                if (qwo1Var2 != d9nVar) {
                    yln1Var2 = yln1Var;
                }
                return d9nVar;
            }
            if (b != 3) {
                yln1 yln1Var3 = (yln1) this.c;
                hm5.M(obj);
                return yln1Var3;
            }
            zwo1 zwo1Var5 = this.a;
            yln1Var2 = (yln1) this.c;
            hm5.M(obj);
            zwo1Var3 = zwo1Var5;
            qwo1Var2 = obj;
        }
        this.c = yln1Var2;
        this.a = null;
        this.b = (byte) 4;
        if (((qwo1) qwo1Var2).a.invoke(zwo1Var3, this) != d9nVar) {
            return yln1Var2;
        }
        return d9nVar;
        this.c = zwo1Var2;
        this.a = null;
        this.b = (byte) 2;
        objInvoke = ((qwo1) qwo1Var).a.invoke(zwo1Var, this);
        if (objInvoke != d9nVar) {
            zwo1Var3 = zwo1Var2;
            yln1Var = (yln1) objInvoke;
            if (((b1o1) cik1Var.e) == null) {
                return yln1Var;
            }
            bz11Var = (bz11) cik1Var.d;
            if (yln1Var.G()) {
                ssk1 ssk1VarW2 = bz11Var.w(false);
                tmc0 tmc0Var2 = new tmc0(Collections.singletonList(bz11Var.x(true)), false);
                fqn1 fqn1Var2 = (fqn1) bz11Var.d;
                u9cVarW = new u9c(ssk1VarW2, tmc0Var2, (uyo1) fqn1Var2.c, (dzp0) bz11Var.e, (qeh1) bz11Var.k);
            } else {
                u9cVarW = bz11Var.w(true);
            }
            u9c u9cVar2 = u9cVarW;
            cik1Var.e = u9cVar2;
            this.c = yln1Var;
            this.a = zwo1Var3;
            this.b = (byte) 3;
            qwo1Var2 = new qwo1(new p18(this.f, cik1Var2, u9cVar2, yln1Var, (lnm) null, (byte) 7));
            if (qwo1Var2 != d9nVar) {
                yln1Var2 = yln1Var;
                this.c = yln1Var2;
                this.a = null;
                this.b = (byte) 4;
                if (((qwo1) qwo1Var2).a.invoke(zwo1Var3, this) != d9nVar) {
                    return yln1Var2;
                }
            }
        }
        return d9nVar;
    }
}
