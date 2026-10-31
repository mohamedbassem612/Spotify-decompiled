package p;

import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zwn1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zwn1(Object obj, Object obj2, long j, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.c = j;
        this.d = obj3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                return new zwn1((zwo1) obj4, (cwn1) obj3, this.c, (yln1) obj2, lnmVar, (byte) 0);
            case 1:
                zwn1 zwn1Var = new zwn1((rvo1) obj4, (u9c) obj3, this.c, (yln1) obj2, lnmVar, (byte) 1);
                zwn1Var.e = obj;
                return zwn1Var;
            default:
                return new zwn1((zwo1) obj4, (yro1) obj3, this.c, (ayh) obj2, lnmVar, (byte) 2);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
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

    public final Object invokeSuspend(Object obj) {
        zwo1 zwo1Var;
        Object nwo1Var;
        l2t l2tVarQ;
        zwo1 zwo1Var2;
        Object qwo1Var;
        byte b = this.a;
        m231 m231Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                try {
                    if (b2 != 0) {
                        if (b2 != 1) {
                            hm5.M(obj);
                        } else {
                            zwo1Var = (zwo1) this.e;
                            hm5.M(obj);
                            nwo1Var = obj;
                        }
                        return new e331(m231Var);
                    }
                    hm5.M(obj);
                    zwo1Var = (zwo1) obj4;
                    cwn1 cwn1Var = (cwn1) obj3;
                    this.e = zwo1Var;
                    this.b = (byte) 1;
                    nwo1Var = new nwo1(cwn1Var.d(), new d6(cwn1Var, this.c, (yln1) obj2, (lnm) null, (byte) 14), (Integer) null);
                    if (nwo1Var == d9nVar) {
                        return d9nVar;
                    }
                    this.e = null;
                    this.b = (byte) 2;
                    if (((nwo1) nwo1Var).a(zwo1Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } catch (zzhm e) {
                    m231Var = new m231(e);
                }
                return new e331(m231Var);
            case 1:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    c9n c9nVar = (c9n) this.e;
                    rvo1 rvo1Var = (rvo1) obj4;
                    u9c u9cVar = (u9c) obj3;
                    yln1 yln1Var = (yln1) obj2;
                    lnm lnmVar = null;
                    long j = this.c;
                    s2t s2tVarQ = c921.q(c9nVar, (o8n) null, 0, new tzn1(rvo1Var, u9cVar, j, yln1Var, lnmVar, (byte) 1), 3);
                    l2tVarQ = c921.q(c9nVar, (o8n) null, 0, new tzn1(rvo1Var, u9cVar, j, yln1Var, lnmVar, (byte) 0), 3);
                    this.e = l2tVarQ;
                    this.b = (byte) 1;
                    if (s2tVarQ.Q(this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    hm5.M(obj);
                    return m231Var;
                }
                l2tVarQ = (l2t) this.e;
                hm5.M(obj);
                this.e = null;
                this.b = (byte) 2;
                if (l2tVarQ.E(this) != d9nVar) {
                    return m231Var;
                }
                return d9nVar;
            default:
                byte b4 = this.b;
                if (b4 == 0) {
                    hm5.M(obj);
                    zwo1Var2 = (zwo1) obj4;
                    this.e = zwo1Var2;
                    this.b = (byte) 1;
                    long j2 = this.c;
                    qwo1Var = new qwo1(new gxn1(j2, (ayh) obj2, (lnm) null, (yro1) obj3));
                    if (qwo1Var != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b4 != 1) {
                    hm5.M(obj);
                    return m231Var;
                }
                zwo1Var2 = (zwo1) this.e;
                hm5.M(obj);
                qwo1Var = obj;
                this.e = null;
                this.b = (byte) 2;
                if (((qwo1) qwo1Var).a(zwo1Var2, this) != d9nVar) {
                    return m231Var;
                }
                return d9nVar;
        }
    }
}
