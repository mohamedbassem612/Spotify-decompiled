package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oov extends a8d1 implements vu30 {
    public final /* synthetic */ Object N0;
    public Object X;
    public Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 2;
    public String b;
    public s2t c;
    public l2t d;
    public boolean e;
    public byte f;
    public /* synthetic */ Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oov(jl1 jl1Var, hti0 hti0Var, qxc0 qxc0Var, d0r d0rVar, lnm lnmVar) {
        super(2, lnmVar);
        this.Y = jl1Var;
        this.Z = hti0Var;
        this.X = qxc0Var;
        this.N0 = d0rVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.N0;
        Object obj3 = this.Z;
        switch (b) {
            case 0:
                oov oovVar = new oov((jl1) this.Y, (hti0) obj3, (qxc0) this.X, (d0r) obj2, lnmVar);
                oovVar.g = obj;
                return oovVar;
            case 1:
                oov oovVar2 = new oov((yzu) obj3, (String) obj2, lnmVar);
                oovVar2.g = obj;
                return oovVar2;
            default:
                oov oovVar3 = new oov((String) this.X, (String) this.Y, (String) obj3, (hce1) obj2, lnmVar);
                oovVar3.g = obj;
                return oovVar3;
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

    /* JADX WARN: Code duplicated, block: B:108:0x0303  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0214  */
    public final Object invokeSuspend(Object obj) {
        s2t s2tVarQ;
        String str;
        Object objQ;
        l2t l2tVar;
        zeu zeuVar;
        boolean zBooleanValue;
        Object objE;
        g3d0 g3d0Var;
        qxc0 qxc0Var;
        Object objE2;
        boolean z;
        zeu zeuVar2;
        g3d0 g3d0Var2;
        String str2;
        qxc0 qxc0Var2;
        Object objD;
        String str3;
        l2t l2tVarQ;
        l2t l2tVarQ2;
        Object objQ2;
        jo70 jo70Var;
        hll hllVar;
        d7u0 d7u0Var;
        wkk1 wkk1Var;
        String str4;
        Object objE3;
        l2t l2tVar2;
        tqj1 tqj1Var;
        boolean zBooleanValue2;
        Object objE4;
        wkk1 wkk1Var2;
        String str5;
        jo70 jo70Var2;
        hll hllVar2;
        String str6;
        Object objQ3;
        l2t l2tVar3;
        s2t s2tVar;
        Object objE5;
        l2t l2tVar4;
        r0g1 r0g1Var;
        boolean z2;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z3;
        Object objE6;
        String str11;
        boolean z4;
        byte b = this.a;
        Object obj2 = this.Z;
        d9n d9nVar = d9n.a;
        Object obj3 = this.N0;
        Long l = null;
        switch (b) {
            case 0:
                d0r d0rVar = (d0r) obj3;
                hti0 hti0Var = (hti0) obj2;
                jl1 jl1Var = (jl1) this.Y;
                c9n c9nVar = (c9n) this.g;
                byte b2 = this.f;
                lnm lnmVar = null;
                if (b2 != 0) {
                    if (b2 == 1) {
                        String str12 = this.b;
                        zeuVar = (zeu) this.h;
                        l2tVar = this.d;
                        s2tVarQ = this.c;
                        hm5.M(obj);
                        str = str12;
                        objQ = obj;
                    } else if (b2 == 2) {
                        zBooleanValue = this.e;
                        String str13 = this.b;
                        zeu zeuVar3 = (zeu) this.h;
                        l2t l2tVar5 = this.d;
                        hm5.M(obj);
                        str = str13;
                        zeuVar = zeuVar3;
                        l2tVar = l2tVar5;
                        objE = obj;
                        g3d0Var = (g3d0) objE;
                        qxc0Var = (qxc0) this.X;
                        this.g = null;
                        this.c = null;
                        this.d = null;
                        this.h = zeuVar;
                        this.b = str;
                        this.i = g3d0Var;
                        this.t = qxc0Var;
                        this.e = zBooleanValue;
                        this.f = (byte) 3;
                        objE2 = l2tVar.E(this);
                        if (objE2 == d9nVar) {
                            return d9nVar;
                        }
                        z = zBooleanValue;
                        zeuVar2 = zeuVar;
                        g3d0Var2 = g3d0Var;
                        str2 = str;
                        qxc0Var2 = qxc0Var;
                    } else {
                        if (b2 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = this.e;
                        qxc0 qxc0Var3 = (qxc0) this.t;
                        g3d0 g3d0Var3 = (g3d0) this.i;
                        String str14 = this.b;
                        zeu zeuVar4 = (zeu) this.h;
                        hm5.M(obj);
                        qxc0Var2 = qxc0Var3;
                        str2 = str14;
                        g3d0Var2 = g3d0Var3;
                        z = z5;
                        zeuVar2 = zeuVar4;
                        objE2 = obj;
                    }
                    return zeuVar2.i(str2, z, g3d0Var2, qxc0Var2, (Set) objE2);
                }
                hm5.M(obj);
                s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new nov(jl1Var, d0rVar, hti0Var, lnmVar, (byte) 1), 3);
                l2t l2tVarQ3 = fn31.q(c9nVar, (o8n) null, 0, new nov(jl1Var, d0rVar, hti0Var, lnmVar, (byte) 0), 3);
                s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new ett(jl1Var, (lnm) null, (byte) 6), 3);
                zeu zeuVar5 = (zeu) jl1Var.b;
                str = hti0Var.a;
                this.g = null;
                this.c = s2tVarQ;
                this.d = l2tVarQ3;
                this.h = zeuVar5;
                this.b = str;
                this.f = (byte) 1;
                objQ = s2tVarQ2.Q(this);
                if (objQ == d9nVar) {
                    return d9nVar;
                }
                l2tVar = l2tVarQ3;
                zeuVar = zeuVar5;
                zBooleanValue = ((Boolean) objQ).booleanValue();
                this.g = null;
                this.c = null;
                this.d = l2tVar;
                this.h = zeuVar;
                this.b = str;
                this.e = zBooleanValue;
                this.f = (byte) 2;
                objE = s2tVarQ.E(this);
                if (objE == d9nVar) {
                    return d9nVar;
                }
                g3d0Var = (g3d0) objE;
                qxc0Var = (qxc0) this.X;
                this.g = null;
                this.c = null;
                this.d = null;
                this.h = zeuVar;
                this.b = str;
                this.i = g3d0Var;
                this.t = qxc0Var;
                this.e = zBooleanValue;
                this.f = (byte) 3;
                objE2 = l2tVar.E(this);
                if (objE2 == d9nVar) {
                    return d9nVar;
                }
                z = zBooleanValue;
                zeuVar2 = zeuVar;
                g3d0Var2 = g3d0Var;
                str2 = str;
                qxc0Var2 = qxc0Var;
                return zeuVar2.i(str2, z, g3d0Var2, qxc0Var2, (Set) objE2);
            case 1:
                yzu yzuVar = (yzu) obj2;
                c9n c9nVar2 = (c9n) this.g;
                byte b3 = this.f;
                if (b3 == 0) {
                    hm5.M(obj);
                    this.g = c9nVar2;
                    this.f = (byte) 1;
                    objD = ((h0y) yzuVar.a).d((String) obj3, this);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            l2tVarQ2 = this.d;
                            l2t l2tVar6 = this.c;
                            str3 = this.b;
                            hm5.M(obj);
                            l2tVarQ = l2tVar6;
                            objQ2 = obj;
                            zbz zbzVar = (zbz) objQ2;
                            jo70Var = zbzVar.a;
                            hllVar = zbzVar.b;
                            d7u0Var = zbzVar.c;
                            wkk1Var = zbzVar.d;
                            if (d7u0Var != null || (tqj1Var = (tqj1) o7h.s0(d7u0Var.b)) == null) {
                                str4 = null;
                            } else {
                                str4 = tqj1Var.b.a;
                                if (str4.length() <= 0) {
                                    str4 = null;
                                }
                            }
                            this.g = null;
                            this.b = null;
                            this.c = null;
                            this.d = l2tVarQ2;
                            this.h = str3;
                            this.i = jo70Var;
                            this.t = hllVar;
                            this.X = str4;
                            this.Y = wkk1Var;
                            this.f = (byte) 3;
                            objE3 = l2tVarQ.E(this);
                            if (objE3 == d9nVar) {
                                return d9nVar;
                            }
                            l2tVar2 = l2tVarQ2;
                            zBooleanValue2 = ((Boolean) objE3).booleanValue();
                            this.g = null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.h = str3;
                            this.i = jo70Var;
                            this.t = hllVar;
                            this.X = str4;
                            this.Y = wkk1Var;
                            this.e = zBooleanValue2;
                            this.f = (byte) 4;
                            objE4 = l2tVar2.E(this);
                            if (objE4 == d9nVar) {
                                return d9nVar;
                            }
                            wkk1Var2 = wkk1Var;
                            str5 = str3;
                            jo70Var2 = jo70Var;
                            hllVar2 = hllVar;
                            str6 = str4;
                        } else if (b3 == 3) {
                            wkk1 wkk1Var3 = (wkk1) this.Y;
                            String str15 = (String) this.X;
                            hll hllVar3 = (hll) this.t;
                            jo70Var = (jo70) this.i;
                            String str16 = (String) this.h;
                            l2tVar2 = this.d;
                            hm5.M(obj);
                            str4 = str15;
                            hllVar = hllVar3;
                            str3 = str16;
                            objE3 = obj;
                            wkk1Var = wkk1Var3;
                            zBooleanValue2 = ((Boolean) objE3).booleanValue();
                            this.g = null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.h = str3;
                            this.i = jo70Var;
                            this.t = hllVar;
                            this.X = str4;
                            this.Y = wkk1Var;
                            this.e = zBooleanValue2;
                            this.f = (byte) 4;
                            objE4 = l2tVar2.E(this);
                            if (objE4 == d9nVar) {
                                return d9nVar;
                            }
                            wkk1Var2 = wkk1Var;
                            str5 = str3;
                            jo70Var2 = jo70Var;
                            hllVar2 = hllVar;
                            str6 = str4;
                        } else {
                            if (b3 != 4) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            zBooleanValue2 = this.e;
                            wkk1 wkk1Var4 = (wkk1) this.Y;
                            String str17 = (String) this.X;
                            hllVar2 = (hll) this.t;
                            jo70 jo70Var3 = (jo70) this.i;
                            String str18 = (String) this.h;
                            hm5.M(obj);
                            str6 = str17;
                            jo70Var2 = jo70Var3;
                            wkk1Var2 = wkk1Var4;
                            str5 = str18;
                            objE4 = obj;
                        }
                        return new ccz(str5, jo70Var2, hllVar2, str6, wkk1Var2, zBooleanValue2, ((Boolean) objE4).booleanValue());
                    }
                    hm5.M(obj);
                    objD = obj;
                }
                str3 = (String) objD;
                if (str3 != null) {
                    s2t s2tVarQ3 = fn31.q(c9nVar2, (o8n) null, 0, new acz(yzuVar, str3, null, (byte) 0), 3);
                    l2tVarQ = fn31.q(c9nVar2, (o8n) null, 0, new acz(yzuVar, str3, null, (byte) 1), 3);
                    l2tVarQ2 = fn31.q(c9nVar2, (o8n) null, 0, new acz(yzuVar, str3, null, (byte) 2), 3);
                    this.g = null;
                    this.b = str3;
                    this.c = l2tVarQ;
                    this.d = l2tVarQ2;
                    this.f = (byte) 2;
                    objQ2 = s2tVarQ3.Q(this);
                    if (objQ2 == d9nVar) {
                        return d9nVar;
                    }
                    zbz zbzVar2 = (zbz) objQ2;
                    jo70Var = zbzVar2.a;
                    hllVar = zbzVar2.b;
                    d7u0Var = zbzVar2.c;
                    wkk1Var = zbzVar2.d;
                    if (d7u0Var != null) {
                        str4 = null;
                    } else {
                        str4 = null;
                    }
                    this.g = null;
                    this.b = null;
                    this.c = null;
                    this.d = l2tVarQ2;
                    this.h = str3;
                    this.i = jo70Var;
                    this.t = hllVar;
                    this.X = str4;
                    this.Y = wkk1Var;
                    this.f = (byte) 3;
                    objE3 = l2tVarQ.E(this);
                    if (objE3 == d9nVar) {
                        return d9nVar;
                    }
                    l2tVar2 = l2tVarQ2;
                    zBooleanValue2 = ((Boolean) objE3).booleanValue();
                    this.g = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.h = str3;
                    this.i = jo70Var;
                    this.t = hllVar;
                    this.X = str4;
                    this.Y = wkk1Var;
                    this.e = zBooleanValue2;
                    this.f = (byte) 4;
                    objE4 = l2tVar2.E(this);
                    if (objE4 == d9nVar) {
                        return d9nVar;
                    }
                    wkk1Var2 = wkk1Var;
                    str5 = str3;
                    jo70Var2 = jo70Var;
                    hllVar2 = hllVar;
                    str6 = str4;
                    return new ccz(str5, jo70Var2, hllVar2, str6, wkk1Var2, zBooleanValue2, ((Boolean) objE4).booleanValue());
                }
                return null;
            default:
                hce1 hce1Var = (hce1) obj3;
                String str19 = (String) this.Y;
                c9n c9nVar3 = (c9n) this.g;
                byte b4 = this.f;
                if (b4 != 0) {
                    if (b4 == 1) {
                        l2t l2tVar7 = this.d;
                        s2tVar = this.c;
                        hm5.M(obj);
                        l2tVar3 = l2tVar7;
                        objQ3 = obj;
                    } else {
                        if (b4 == 2) {
                            z2 = this.e;
                            r0g1 r0g1Var2 = (r0g1) this.h;
                            l2t l2tVar8 = this.d;
                            hm5.M(obj);
                            l2tVar4 = l2tVar8;
                            r0g1Var = r0g1Var2;
                            objE5 = obj;
                            str7 = (String) objE5;
                            if (str7 == null) {
                                if (r0g1Var.b) {
                                    str7 = null;
                                } else {
                                    str7 = str19;
                                }
                            }
                            str8 = r0g1Var.a;
                            if (str8 == null) {
                                str19 = str8;
                            } else if (!r0g1Var.b) {
                                str19 = null;
                            }
                            str9 = (String) obj2;
                            if (l2tVar4 != null) {
                                this.g = null;
                                this.c = null;
                                this.d = null;
                                this.h = null;
                                this.b = str7;
                                this.i = str19;
                                this.t = str9;
                                this.e = z2;
                                this.f = (byte) 3;
                                objE6 = l2tVar4.E(this);
                                if (objE6 == d9nVar) {
                                    return d9nVar;
                                }
                                boolean z6 = z2;
                                str11 = str19;
                                z4 = z6;
                            } else {
                                str10 = str19;
                                z3 = z2;
                            }
                            return new p0g1(l, str7, str10, str9, z3);
                        }
                        if (b4 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z4 = this.e;
                        str9 = (String) this.t;
                        str11 = (String) this.i;
                        String str20 = this.b;
                        hm5.M(obj);
                        str7 = str20;
                        objE6 = obj;
                    }
                    l = (Long) objE6;
                    z3 = z4;
                    str10 = str11;
                    return new p0g1(l, str7, str10, str9, z3);
                }
                hm5.M(obj);
                s2t s2tVarQ4 = fn31.q(c9nVar3, (o8n) null, 0, new y0g1(hce1Var, str19, (lnm) null, (byte) 2), 3);
                s2t s2tVarQ5 = fn31.q(c9nVar3, (o8n) null, 0, new y0g1(hce1Var, str19, (lnm) null, (byte) 0), 3);
                String str21 = (String) this.X;
                l2t l2tVarQ4 = str21 != null ? fn31.q(c9nVar3, (o8n) null, 0, new y0g1(hce1Var, str21, (lnm) null, (byte) 1), 3) : null;
                this.g = null;
                this.c = s2tVarQ5;
                this.d = l2tVarQ4;
                this.f = (byte) 1;
                objQ3 = s2tVarQ4.Q(this);
                if (objQ3 == d9nVar) {
                    return d9nVar;
                }
                l2tVar3 = l2tVarQ4;
                s2tVar = s2tVarQ5;
                r0g1 r0g1Var3 = (r0g1) objQ3;
                boolean z7 = r0g1Var3.b;
                this.g = null;
                this.c = null;
                this.d = l2tVar3;
                this.h = r0g1Var3;
                this.e = z7;
                this.f = (byte) 2;
                objE5 = s2tVar.E(this);
                if (objE5 == d9nVar) {
                    return d9nVar;
                }
                l2tVar4 = l2tVar3;
                r0g1Var = r0g1Var3;
                z2 = z7;
                str7 = (String) objE5;
                if (str7 == null) {
                    if (r0g1Var.b) {
                        str7 = str19;
                    } else {
                        str7 = null;
                    }
                }
                str8 = r0g1Var.a;
                if (str8 == null) {
                    str19 = str8;
                } else if (!r0g1Var.b) {
                    str19 = null;
                }
                str9 = (String) obj2;
                if (l2tVar4 != null) {
                    this.g = null;
                    this.c = null;
                    this.d = null;
                    this.h = null;
                    this.b = str7;
                    this.i = str19;
                    this.t = str9;
                    this.e = z2;
                    this.f = (byte) 3;
                    objE6 = l2tVar4.E(this);
                    if (objE6 == d9nVar) {
                        return d9nVar;
                    }
                    boolean z8 = z2;
                    str11 = str19;
                    z4 = z8;
                    l = (Long) objE6;
                    z3 = z4;
                    str10 = str11;
                } else {
                    str10 = str19;
                    z3 = z2;
                }
                return new p0g1(l, str7, str10, str9, z3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oov(String str, String str2, String str3, hce1 hce1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.N0 = hce1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oov(yzu yzuVar, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.Z = yzuVar;
        this.N0 = str;
    }
}
