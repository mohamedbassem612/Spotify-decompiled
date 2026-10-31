package p;

import com.spotify.casita.v1.resolved.ResolvedHome;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i2e extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public s2t b;
    public String c;
    public boolean d;
    public boolean e;
    public byte f;
    public /* synthetic */ Object g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2e(k2e k2eVar, String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, lnm lnmVar) {
        super(2, lnmVar);
        this.i = k2eVar;
        this.c = str;
        this.t = str2;
        this.d = z;
        this.X = str3;
        this.Y = str4;
        this.e = z2;
        this.Z = str5;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.t;
        switch (b) {
            case 0:
                i2e i2eVar = new i2e((k2e) this.i, this.c, (String) obj5, this.d, (String) obj4, (String) obj3, this.e, (String) obj2, lnmVar);
                i2eVar.g = obj;
                return i2eVar;
            default:
                i2e i2eVar2 = new i2e((szu) obj5, (hti0) obj4, (qxc0) obj3, (d0r) obj2, lnmVar);
                i2eVar2.g = obj;
                return i2eVar2;
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

    /* JADX WARN: Code duplicated, block: B:51:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        l2t l2tVarQ;
        Object objQ;
        sy21 sy21Var;
        Object objE;
        Object objO;
        sy21 sy21Var2;
        sy21 sy21Var3;
        s2t s2tVar;
        s2t s2tVarQ;
        zeu zeuVar;
        lik1 lik1Var;
        String str;
        Object objQ2;
        Object objE2;
        boolean z;
        boolean z2;
        String str2;
        lik1 lik1Var2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.Y;
        Object obj3 = this.t;
        Object obj4 = this.X;
        Object obj5 = this.Z;
        switch (b) {
            case 0:
                k2e k2eVar = (k2e) this.i;
                c9n c9nVar = (c9n) this.g;
                byte b2 = this.f;
                if (b2 != 0) {
                    if (b2 == 1) {
                        l2t l2tVar = this.b;
                        hm5.M(obj);
                        l2tVarQ = l2tVar;
                        objQ = obj;
                    } else if (b2 == 2) {
                        sy21 sy21Var4 = (sy21) this.h;
                        hm5.M(obj);
                        sy21Var = sy21Var4;
                        objO = obj;
                        sy21Var2 = (sy21) objO;
                        if (sy21Var2 == null) {
                            sy21Var3 = sy21Var;
                        } else {
                            sy21Var3 = sy21Var2;
                        }
                        if (sy21Var3 != null) {
                            return sy21Var3;
                        }
                        hhg1.n("Required value was null.");
                    } else if (b2 == 3) {
                        sy21 sy21Var5 = (sy21) this.h;
                        hm5.M(obj);
                        sy21Var = sy21Var5;
                        objE = obj;
                        sy21Var2 = (sy21) objE;
                        if (sy21Var2 == null) {
                            sy21Var3 = sy21Var;
                        } else {
                            sy21Var3 = sy21Var2;
                        }
                        if (sy21Var3 != null) {
                            return sy21Var3;
                        }
                        hhg1.n("Required value was null.");
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                l2tVarQ = fn31.q(c9nVar, k2eVar.h.b, 0, new g2e(k2eVar, this.c, (String) obj3, this.d, (String) obj4, (String) obj2, this.e, (String) obj5, null, (byte) 1), 2);
                s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new g2e(k2eVar, this.c, (String) obj3, this.d, (String) obj4, (String) obj2, this.e, (String) obj5, null, (byte) 0), 3);
                this.g = null;
                this.b = l2tVarQ;
                this.f = (byte) 1;
                objQ = s2tVarQ2.Q(this);
                if (objQ == d9nVar) {
                    return d9nVar;
                }
                sy21 sy21Var6 = (sy21) objQ;
                if ((sy21Var6 != null ? (ResolvedHome) sy21Var6.b : null) == null) {
                    objQ = null;
                }
                sy21Var = (sy21) objQ;
                if (sy21Var == null) {
                    this.g = null;
                    this.b = null;
                    this.h = sy21Var;
                    this.f = (byte) 3;
                    objE = l2tVarQ.E(this);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                    sy21Var2 = (sy21) objE;
                    if (sy21Var2 == null) {
                        sy21Var3 = sy21Var;
                    } else {
                        sy21Var3 = sy21Var2;
                    }
                    if (sy21Var3 != null) {
                        return sy21Var3;
                    }
                    hhg1.n("Required value was null.");
                    return null;
                }
                long j = k2eVar.l;
                h2e h2eVar = new h2e(l2tVarQ, null, (byte) 0);
                this.g = null;
                this.b = null;
                this.h = sy21Var;
                this.f = (byte) 2;
                objO = rc2.O(j, h2eVar, this);
                if (objO == d9nVar) {
                    return d9nVar;
                }
                sy21Var2 = (sy21) objO;
                if (sy21Var2 == null) {
                    sy21Var3 = sy21Var;
                } else {
                    sy21Var3 = sy21Var2;
                }
                if (sy21Var3 != null) {
                    return sy21Var3;
                }
                hhg1.n("Required value was null.");
                return null;
            default:
                d0r d0rVar = (d0r) obj5;
                hti0 hti0Var = (hti0) obj4;
                szu szuVar = (szu) obj3;
                c9n c9nVar2 = (c9n) this.g;
                byte b3 = this.f;
                lnm lnmVar = null;
                if (b3 != 0) {
                    if (b3 == 1) {
                        String str3 = this.c;
                        lik1 lik1Var3 = (lik1) this.i;
                        zeu zeuVar2 = (zeu) this.h;
                        s2tVarQ = this.b;
                        hm5.M(obj);
                        str = str3;
                        lik1Var = lik1Var3;
                        zeuVar = zeuVar2;
                        s2tVar = null;
                        objQ2 = obj;
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z3 = this.e;
                        boolean z4 = this.d;
                        str2 = this.c;
                        lik1 lik1Var4 = (lik1) this.i;
                        zeu zeuVar3 = (zeu) this.h;
                        hm5.M(obj);
                        z2 = z3;
                        z = z4;
                        lik1Var2 = lik1Var4;
                        zeuVar = zeuVar3;
                        objE2 = obj;
                    }
                    return zeuVar.j(lik1Var2, str2, (h2v) objE2, z, z2, false);
                }
                hm5.M(obj);
                s2tVar = null;
                s2t s2tVarQ3 = fn31.q(c9nVar2, (o8n) null, 0, new qzu(szuVar, d0rVar, hti0Var, lnmVar, (byte) 0), 3);
                s2tVarQ = fn31.q(c9nVar2, (o8n) null, 0, new qzu(szuVar, d0rVar, hti0Var, lnmVar, (byte) 1), 3);
                zeuVar = szuVar.f;
                lik1Var = hti0Var.b;
                str = hti0Var.a;
                this.g = null;
                this.b = s2tVarQ;
                this.h = zeuVar;
                this.i = lik1Var;
                this.c = str;
                this.f = (byte) 1;
                objQ2 = s2tVarQ3.Q(this);
                if (objQ2 == d9nVar) {
                    return d9nVar;
                }
                boolean z5 = ((vnb1) objQ2).a;
                boolean z6 = ((qxc0) obj2).h;
                this.g = s2tVar;
                this.b = s2tVar;
                this.h = zeuVar;
                this.i = lik1Var;
                this.c = str;
                this.d = z5;
                this.e = z6;
                this.f = (byte) 2;
                objE2 = s2tVarQ.E(this);
                if (objE2 == d9nVar) {
                    return d9nVar;
                }
                z = z5;
                z2 = z6;
                str2 = str;
                lik1Var2 = lik1Var;
                return zeuVar.j(lik1Var2, str2, (h2v) objE2, z, z2, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2e(szu szuVar, hti0 hti0Var, qxc0 qxc0Var, d0r d0rVar, lnm lnmVar) {
        super(2, lnmVar);
        this.t = szuVar;
        this.X = hti0Var;
        this.Y = qxc0Var;
        this.Z = d0rVar;
    }
}
