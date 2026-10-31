package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r3k1 extends a8d1 implements vu30 {
    public byte N0;
    public /* synthetic */ Object O0;
    public final /* synthetic */ u3k1 P0;
    public final /* synthetic */ d0r Q0;
    public final /* synthetic */ dc31 R0;
    public final /* synthetic */ ewn0 S0;
    public final /* synthetic */ vi11 T0;
    public final /* synthetic */ ptf1 U0;
    public String X;
    public long Y;
    public long Z;
    public s2t a;
    public d4k1 b;
    public llg c;
    public String d;
    public k3k1 e;
    public s2t f;
    public l2t g;
    public d4k1 h;
    public xkk1 i;
    public llg t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3k1(u3k1 u3k1Var, d0r d0rVar, dc31 dc31Var, ewn0 ewn0Var, vi11 vi11Var, ptf1 ptf1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.P0 = u3k1Var;
        this.Q0 = d0rVar;
        this.R0 = dc31Var;
        this.S0 = ewn0Var;
        this.T0 = vi11Var;
        this.U0 = ptf1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        r3k1 r3k1Var = new r3k1(this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, lnmVar);
        r3k1Var.O0 = obj;
        return r3k1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd A[PHI: r2 r5
      0x00bd: PHI (r2v8 p.d4k1) = (r2v5 p.d4k1), (r2v11 p.d4k1) binds: [B:20:0x00b9, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v5 java.lang.Object) binds: [B:20:0x00b9, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x010a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0113  */
    /* JADX WARN: Code duplicated, block: B:48:0x0173  */
    /* JADX WARN: Code duplicated, block: B:52:0x019e  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c7  */
    public final Object invokeSuspend(Object obj) {
        l2t l2tVarQ;
        Object objQ;
        d4k1 d4k1Var;
        Object objE;
        llg llgVar;
        String str;
        Long l;
        long jLongValue;
        k3k1 k3k1Var;
        String str2;
        Object objF;
        llg llgVar2;
        String str3;
        io70 io70Var;
        d4k1 d4k1Var2;
        s2t s2tVarQ;
        long j;
        l2t l2tVarQ2;
        Object objQ2;
        llg llgVar3;
        s2t s2tVar;
        l2t l2tVar;
        d4k1 d4k1Var3;
        xkk1 xkk1Var;
        Object objE2;
        long j2;
        String str4;
        Object objE3;
        xkk1 xkk1Var2;
        d4k1 d4k1Var4;
        String str5;
        llg llgVar4;
        long j3;
        c9n c9nVar = (c9n) this.O0;
        byte b = this.N0;
        d0r d0rVar = this.Q0;
        v3k1 v3k1Var = v3k1.a;
        u3k1 u3k1Var = this.P0;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new gqj1(d0rVar, u3k1Var, (lnm) null, (byte) 3), 3);
                l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new gqj1(u3k1Var, this.R0, (lnm) null, (byte) 2), 3);
                this.O0 = c9nVar;
                this.a = l2tVarQ;
                this.N0 = (byte) 1;
                objQ = s2tVarQ2.Q(this);
                if (objQ != d9nVar) {
                    d4k1Var = (d4k1) objQ;
                    if (d4k1Var == null) {
                        l2tVarQ.d((CancellationException) null);
                        return v3k1Var;
                    }
                    this.O0 = c9nVar;
                    this.a = null;
                    this.b = d4k1Var;
                    this.N0 = (byte) 2;
                    objE = l2tVarQ.E(this);
                    if (objE != d9nVar) {
                        llgVar = (llg) objE;
                        if (llgVar != null) {
                            io70Var = d4k1Var.a.e;
                            if (io70Var != null) {
                                str = io70Var.b;
                            }
                            return v3k1Var;
                        }
                        str = u3k1Var.a.a;
                        if (llgVar == null) {
                            l = u3k1Var.a.b;
                            if (l != null) {
                                jLongValue = l.longValue();
                            }
                            return v3k1Var;
                        }
                        jLongValue = llgVar.d;
                        k3k1Var = new k3k1(u3k1Var.a.b, str);
                        if (llgVar != null) {
                            o3r o3rVar = f4k1.g;
                            this.O0 = c9nVar;
                            this.a = null;
                            this.b = null;
                            this.c = llgVar;
                            this.d = str;
                            this.e = k3k1Var;
                            this.Y = jLongValue;
                            this.N0 = (byte) 3;
                            objF = t3k1.F(d0rVar, o3rVar, k3k1Var, this);
                            if (objF != d9nVar) {
                                llgVar2 = llgVar;
                                str3 = str;
                                d4k1Var = (d4k1) objF;
                                if (d4k1Var != null) {
                                    str2 = str3;
                                    llgVar = llgVar2;
                                    d4k1Var2 = d4k1Var;
                                    long j4 = jLongValue;
                                    s2t s2tVarQ3 = fn31.q(c9nVar, (o8n) null, 0, new vxg1(d4k1Var2, d0rVar, k3k1Var, (lnm) null, (byte) 21), 3);
                                    String str6 = str2;
                                    s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new d6(this.S0, str6, this.T0, j4, (lnm) null), 3);
                                    j = j4;
                                    l2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new xn2(this.U0, d4k1Var2, str6, j4, (lnm) null, (byte) 16), 3);
                                    this.O0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = llgVar;
                                    this.d = null;
                                    this.e = null;
                                    this.f = s2tVarQ;
                                    this.g = l2tVarQ2;
                                    this.h = d4k1Var2;
                                    this.Y = j;
                                    this.N0 = (byte) 4;
                                    objQ2 = s2tVarQ3.Q(this);
                                    if (objQ2 != d9nVar) {
                                        llgVar3 = llgVar;
                                        s2tVar = s2tVarQ;
                                        l2tVar = l2tVarQ2;
                                        d4k1Var3 = d4k1Var2;
                                        xkk1Var = (xkk1) objQ2;
                                        this.O0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = null;
                                        this.f = null;
                                        this.g = l2tVar;
                                        this.h = d4k1Var3;
                                        this.i = xkk1Var;
                                        this.t = llgVar3;
                                        this.Y = j;
                                        this.Z = j;
                                        this.N0 = (byte) 5;
                                        objE2 = s2tVar.E(this);
                                        if (objE2 != d9nVar) {
                                            j2 = j;
                                            str4 = (String) objE2;
                                            this.O0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = null;
                                            this.f = null;
                                            this.g = null;
                                            this.h = d4k1Var3;
                                            this.i = xkk1Var;
                                            this.t = llgVar3;
                                            this.X = str4;
                                            this.Y = j2;
                                            this.Z = j;
                                            this.N0 = (byte) 6;
                                            objE3 = l2tVar.E(this);
                                            if (objE3 != d9nVar) {
                                                d4k1 d4k1Var5 = d4k1Var3;
                                                xkk1Var2 = xkk1Var;
                                                d4k1Var4 = d4k1Var5;
                                                str5 = str4;
                                                llgVar4 = llgVar3;
                                                j3 = j;
                                                return new w3k1(d4k1Var4, xkk1Var2, llgVar4, j3, str5, (String) objE3);
                                            }
                                        }
                                    }
                                }
                                return v3k1Var;
                            }
                        } else {
                            str2 = str;
                            d4k1Var2 = d4k1Var;
                            long j5 = jLongValue;
                            s2t s2tVarQ4 = fn31.q(c9nVar, (o8n) null, 0, new vxg1(d4k1Var2, d0rVar, k3k1Var, (lnm) null, (byte) 21), 3);
                            String str7 = str2;
                            s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new d6(this.S0, str7, this.T0, j5, (lnm) null), 3);
                            j = j5;
                            l2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new xn2(this.U0, d4k1Var2, str7, j5, (lnm) null, (byte) 16), 3);
                            this.O0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = llgVar;
                            this.d = null;
                            this.e = null;
                            this.f = s2tVarQ;
                            this.g = l2tVarQ2;
                            this.h = d4k1Var2;
                            this.Y = j;
                            this.N0 = (byte) 4;
                            objQ2 = s2tVarQ4.Q(this);
                            if (objQ2 != d9nVar) {
                                llgVar3 = llgVar;
                                s2tVar = s2tVarQ;
                                l2tVar = l2tVarQ2;
                                d4k1Var3 = d4k1Var2;
                                xkk1Var = (xkk1) objQ2;
                                this.O0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = l2tVar;
                                this.h = d4k1Var3;
                                this.i = xkk1Var;
                                this.t = llgVar3;
                                this.Y = j;
                                this.Z = j;
                                this.N0 = (byte) 5;
                                objE2 = s2tVar.E(this);
                                if (objE2 != d9nVar) {
                                    j2 = j;
                                    str4 = (String) objE2;
                                    this.O0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.g = null;
                                    this.h = d4k1Var3;
                                    this.i = xkk1Var;
                                    this.t = llgVar3;
                                    this.X = str4;
                                    this.Y = j2;
                                    this.Z = j;
                                    this.N0 = (byte) 6;
                                    objE3 = l2tVar.E(this);
                                    if (objE3 != d9nVar) {
                                        d4k1 d4k1Var6 = d4k1Var3;
                                        xkk1Var2 = xkk1Var;
                                        d4k1Var4 = d4k1Var6;
                                        str5 = str4;
                                        llgVar4 = llgVar3;
                                        j3 = j;
                                        return new w3k1(d4k1Var4, xkk1Var2, llgVar4, j3, str5, (String) objE3);
                                    }
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 1:
                l2t l2tVar2 = this.a;
                hm5.M(obj);
                l2tVarQ = l2tVar2;
                objQ = obj;
                d4k1Var = (d4k1) objQ;
                if (d4k1Var == null) {
                    l2tVarQ.d((CancellationException) null);
                    return v3k1Var;
                }
                this.O0 = c9nVar;
                this.a = null;
                this.b = d4k1Var;
                this.N0 = (byte) 2;
                objE = l2tVarQ.E(this);
                if (objE != d9nVar) {
                    llgVar = (llg) objE;
                    if (llgVar != null) {
                        io70Var = d4k1Var.a.e;
                        if (io70Var != null) {
                            str = io70Var.b;
                        }
                        return v3k1Var;
                    }
                    str = u3k1Var.a.a;
                    if (llgVar == null) {
                        l = u3k1Var.a.b;
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                        return v3k1Var;
                    }
                    jLongValue = llgVar.d;
                    k3k1Var = new k3k1(u3k1Var.a.b, str);
                    if (llgVar != null) {
                        o3r o3rVar2 = f4k1.g;
                        this.O0 = c9nVar;
                        this.a = null;
                        this.b = null;
                        this.c = llgVar;
                        this.d = str;
                        this.e = k3k1Var;
                        this.Y = jLongValue;
                        this.N0 = (byte) 3;
                        objF = t3k1.F(d0rVar, o3rVar2, k3k1Var, this);
                        if (objF != d9nVar) {
                            llgVar2 = llgVar;
                            str3 = str;
                            d4k1Var = (d4k1) objF;
                            if (d4k1Var != null) {
                                str2 = str3;
                                llgVar = llgVar2;
                                d4k1Var2 = d4k1Var;
                                long j6 = jLongValue;
                                s2t s2tVarQ5 = fn31.q(c9nVar, (o8n) null, 0, new vxg1(d4k1Var2, d0rVar, k3k1Var, (lnm) null, (byte) 21), 3);
                                String str8 = str2;
                                s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new d6(this.S0, str8, this.T0, j6, (lnm) null), 3);
                                j = j6;
                                l2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new xn2(this.U0, d4k1Var2, str8, j6, (lnm) null, (byte) 16), 3);
                                this.O0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = llgVar;
                                this.d = null;
                                this.e = null;
                                this.f = s2tVarQ;
                                this.g = l2tVarQ2;
                                this.h = d4k1Var2;
                                this.Y = j;
                                this.N0 = (byte) 4;
                                objQ2 = s2tVarQ5.Q(this);
                                if (objQ2 != d9nVar) {
                                    llgVar3 = llgVar;
                                    s2tVar = s2tVarQ;
                                    l2tVar = l2tVarQ2;
                                    d4k1Var3 = d4k1Var2;
                                    xkk1Var = (xkk1) objQ2;
                                    this.O0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.g = l2tVar;
                                    this.h = d4k1Var3;
                                    this.i = xkk1Var;
                                    this.t = llgVar3;
                                    this.Y = j;
                                    this.Z = j;
                                    this.N0 = (byte) 5;
                                    objE2 = s2tVar.E(this);
                                    if (objE2 != d9nVar) {
                                        j2 = j;
                                        str4 = (String) objE2;
                                        this.O0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = null;
                                        this.f = null;
                                        this.g = null;
                                        this.h = d4k1Var3;
                                        this.i = xkk1Var;
                                        this.t = llgVar3;
                                        this.X = str4;
                                        this.Y = j2;
                                        this.Z = j;
                                        this.N0 = (byte) 6;
                                        objE3 = l2tVar.E(this);
                                        if (objE3 != d9nVar) {
                                            d4k1 d4k1Var7 = d4k1Var3;
                                            xkk1Var2 = xkk1Var;
                                            d4k1Var4 = d4k1Var7;
                                            str5 = str4;
                                            llgVar4 = llgVar3;
                                            j3 = j;
                                            return new w3k1(d4k1Var4, xkk1Var2, llgVar4, j3, str5, (String) objE3);
                                        }
                                    }
                                }
                            }
                            return v3k1Var;
                        }
                    } else {
                        str2 = str;
                        d4k1Var2 = d4k1Var;
                        long j7 = jLongValue;
                        s2t s2tVarQ6 = fn31.q(c9nVar, (o8n) null, 0, new vxg1(d4k1Var2, d0rVar, k3k1Var, (lnm) null, (byte) 21), 3);
                        String str9 = str2;
                        s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new d6(this.S0, str9, this.T0, j7, (lnm) null), 3);
                        j = j7;
                        l2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new xn2(this.U0, d4k1Var2, str9, j7, (lnm) null, (byte) 16), 3);
                        this.O0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = llgVar;
                        this.d = null;
                        this.e = null;
                        this.f = s2tVarQ;
                        this.g = l2tVarQ2;
                        this.h = d4k1Var2;
                        this.Y = j;
                        this.N0 = (byte) 4;
                        objQ2 = s2tVarQ6.Q(this);
                        if (objQ2 != d9nVar) {
                            llgVar3 = llgVar;
                            s2tVar = s2tVarQ;
                            l2tVar = l2tVarQ2;
                            d4k1Var3 = d4k1Var2;
                            xkk1Var = (xkk1) objQ2;
                            this.O0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = l2tVar;
                            this.h = d4k1Var3;
                            this.i = xkk1Var;
                            this.t = llgVar3;
                            this.Y = j;
                            this.Z = j;
                            this.N0 = (byte) 5;
                            objE2 = s2tVar.E(this);
                            if (objE2 != d9nVar) {
                                j2 = j;
                                str4 = (String) objE2;
                                this.O0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = d4k1Var3;
                                this.i = xkk1Var;
                                this.t = llgVar3;
                                this.X = str4;
                                this.Y = j2;
                                this.Z = j;
                                this.N0 = (byte) 6;
                                objE3 = l2tVar.E(this);
                                if (objE3 != d9nVar) {
                                    d4k1 d4k1Var8 = d4k1Var3;
                                    xkk1Var2 = xkk1Var;
                                    d4k1Var4 = d4k1Var8;
                                    str5 = str4;
                                    llgVar4 = llgVar3;
                                    j3 = j;
                                    return new w3k1(d4k1Var4, xkk1Var2, llgVar4, j3, str5, (String) objE3);
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 2:
                d4k1Var = this.b;
                hm5.M(obj);
                objE = obj;
                llgVar = (llg) objE;
                if (llgVar != null) {
                    io70Var = d4k1Var.a.e;
                    if (io70Var != null) {
                        str = io70Var.b;
                    }
                    return v3k1Var;
                }
                str = u3k1Var.a.a;
                if (llgVar == null) {
                    l = u3k1Var.a.b;
                    if (l != null) {
                        jLongValue = l.longValue();
                    }
                    return v3k1Var;
                }
                jLongValue = llgVar.d;
                k3k1Var = new k3k1(u3k1Var.a.b, str);
                if (llgVar != null) {
                    o3r o3rVar3 = f4k1.g;
                    this.O0 = c9nVar;
                    this.a = null;
                    this.b = null;
                    this.c = llgVar;
                    this.d = str;
                    this.e = k3k1Var;
                    this.Y = jLongValue;
                    this.N0 = (byte) 3;
                    objF = t3k1.F(d0rVar, o3rVar3, k3k1Var, this);
                    if (objF != d9nVar) {
                        llgVar2 = llgVar;
                        str3 = str;
                        d4k1Var = (d4k1) objF;
                        if (d4k1Var != null) {
                            str2 = str3;
                            llgVar = llgVar2;
                            d4k1Var2 = d4k1Var;
                            long j8 = jLongValue;
                            s2t s2tVarQ7 = fn31.q(c9nVar, (o8n) null, 0, new vxg1(d4k1Var2, d0rVar, k3k1Var, (lnm) null, (byte) 21), 3);
                            String str10 = str2;
                            s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new d6(this.S0, str10, this.T0, j8, (lnm) null), 3);
                            j = j8;
                            l2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new xn2(this.U0, d4k1Var2, str10, j8, (lnm) null, (byte) 16), 3);
                            this.O0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = llgVar;
                            this.d = null;
                            this.e = null;
                            this.f = s2tVarQ;
                            this.g = l2tVarQ2;
                            this.h = d4k1Var2;
                            this.Y = j;
                            this.N0 = (byte) 4;
                            objQ2 = s2tVarQ7.Q(this);
                            if (objQ2 != d9nVar) {
                                llgVar3 = llgVar;
                                s2tVar = s2tVarQ;
                                l2tVar = l2tVarQ2;
                                d4k1Var3 = d4k1Var2;
                                xkk1Var = (xkk1) objQ2;
                                this.O0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = l2tVar;
                                this.h = d4k1Var3;
                                this.i = xkk1Var;
                                this.t = llgVar3;
                                this.Y = j;
                                this.Z = j;
                                this.N0 = (byte) 5;
                                objE2 = s2tVar.E(this);
                                if (objE2 != d9nVar) {
                                    j2 = j;
                                    str4 = (String) objE2;
                                    this.O0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.g = null;
                                    this.h = d4k1Var3;
                                    this.i = xkk1Var;
                                    this.t = llgVar3;
                                    this.X = str4;
                                    this.Y = j2;
                                    this.Z = j;
                                    this.N0 = (byte) 6;
                                    objE3 = l2tVar.E(this);
                                    if (objE3 != d9nVar) {
                                        d4k1 d4k1Var9 = d4k1Var3;
                                        xkk1Var2 = xkk1Var;
                                        d4k1Var4 = d4k1Var9;
                                        str5 = str4;
                                        llgVar4 = llgVar3;
                                        j3 = j;
                                        return new w3k1(d4k1Var4, xkk1Var2, llgVar4, j3, str5, (String) objE3);
                                    }
                                }
                            }
                        }
                        return v3k1Var;
                    }
                } else {
                    str2 = str;
                    d4k1Var2 = d4k1Var;
                    long j9 = jLongValue;
                    s2t s2tVarQ8 = fn31.q(c9nVar, (o8n) null, 0, new vxg1(d4k1Var2, d0rVar, k3k1Var, (lnm) null, (byte) 21), 3);
                    String str11 = str2;
                    s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new d6(this.S0, str11, this.T0, j9, (lnm) null), 3);
                    j = j9;
                    l2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new xn2(this.U0, d4k1Var2, str11, j9, (lnm) null, (byte) 16), 3);
                    this.O0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = llgVar;
                    this.d = null;
                    this.e = null;
                    this.f = s2tVarQ;
                    this.g = l2tVarQ2;
                    this.h = d4k1Var2;
                    this.Y = j;
                    this.N0 = (byte) 4;
                    objQ2 = s2tVarQ8.Q(this);
                    if (objQ2 != d9nVar) {
                        llgVar3 = llgVar;
                        s2tVar = s2tVarQ;
                        l2tVar = l2tVarQ2;
                        d4k1Var3 = d4k1Var2;
                        xkk1Var = (xkk1) objQ2;
                        this.O0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.f = null;
                        this.g = l2tVar;
                        this.h = d4k1Var3;
                        this.i = xkk1Var;
                        this.t = llgVar3;
                        this.Y = j;
                        this.Z = j;
                        this.N0 = (byte) 5;
                        objE2 = s2tVar.E(this);
                        if (objE2 != d9nVar) {
                            j2 = j;
                            str4 = (String) objE2;
                            this.O0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = d4k1Var3;
                            this.i = xkk1Var;
                            this.t = llgVar3;
                            this.X = str4;
                            this.Y = j2;
                            this.Z = j;
                            this.N0 = (byte) 6;
                            objE3 = l2tVar.E(this);
                            if (objE3 != d9nVar) {
                                d4k1 d4k1Var10 = d4k1Var3;
                                xkk1Var2 = xkk1Var;
                                d4k1Var4 = d4k1Var10;
                                str5 = str4;
                                llgVar4 = llgVar3;
                                j3 = j;
                                return new w3k1(d4k1Var4, xkk1Var2, llgVar4, j3, str5, (String) objE3);
                            }
                        }
                    }
                }
                return d9nVar;
            case 3:
                jLongValue = this.Y;
                k3k1 k3k1Var2 = this.e;
                str3 = this.d;
                llgVar2 = this.c;
                hm5.M(obj);
                k3k1Var = k3k1Var2;
                objF = obj;
                d4k1Var = (d4k1) objF;
                if (d4k1Var != null) {
                    str2 = str3;
                    llgVar = llgVar2;
                    d4k1Var2 = d4k1Var;
                    long j10 = jLongValue;
                    s2t s2tVarQ9 = fn31.q(c9nVar, (o8n) null, 0, new vxg1(d4k1Var2, d0rVar, k3k1Var, (lnm) null, (byte) 21), 3);
                    String str12 = str2;
                    s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new d6(this.S0, str12, this.T0, j10, (lnm) null), 3);
                    j = j10;
                    l2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new xn2(this.U0, d4k1Var2, str12, j10, (lnm) null, (byte) 16), 3);
                    this.O0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = llgVar;
                    this.d = null;
                    this.e = null;
                    this.f = s2tVarQ;
                    this.g = l2tVarQ2;
                    this.h = d4k1Var2;
                    this.Y = j;
                    this.N0 = (byte) 4;
                    objQ2 = s2tVarQ9.Q(this);
                    if (objQ2 != d9nVar) {
                        llgVar3 = llgVar;
                        s2tVar = s2tVarQ;
                        l2tVar = l2tVarQ2;
                        d4k1Var3 = d4k1Var2;
                        xkk1Var = (xkk1) objQ2;
                        this.O0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.f = null;
                        this.g = l2tVar;
                        this.h = d4k1Var3;
                        this.i = xkk1Var;
                        this.t = llgVar3;
                        this.Y = j;
                        this.Z = j;
                        this.N0 = (byte) 5;
                        objE2 = s2tVar.E(this);
                        if (objE2 != d9nVar) {
                            j2 = j;
                            str4 = (String) objE2;
                            this.O0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = d4k1Var3;
                            this.i = xkk1Var;
                            this.t = llgVar3;
                            this.X = str4;
                            this.Y = j2;
                            this.Z = j;
                            this.N0 = (byte) 6;
                            objE3 = l2tVar.E(this);
                            if (objE3 != d9nVar) {
                                d4k1 d4k1Var11 = d4k1Var3;
                                xkk1Var2 = xkk1Var;
                                d4k1Var4 = d4k1Var11;
                                str5 = str4;
                                llgVar4 = llgVar3;
                                j3 = j;
                                return new w3k1(d4k1Var4, xkk1Var2, llgVar4, j3, str5, (String) objE3);
                            }
                        }
                    }
                    return d9nVar;
                }
                return v3k1Var;
            case 4:
                long j11 = this.Y;
                d4k1Var3 = this.h;
                l2t l2tVar3 = this.g;
                s2tVar = this.f;
                llgVar3 = this.c;
                hm5.M(obj);
                j = j11;
                l2tVar = l2tVar3;
                objQ2 = obj;
                xkk1Var = (xkk1) objQ2;
                this.O0 = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = l2tVar;
                this.h = d4k1Var3;
                this.i = xkk1Var;
                this.t = llgVar3;
                this.Y = j;
                this.Z = j;
                this.N0 = (byte) 5;
                objE2 = s2tVar.E(this);
                if (objE2 != d9nVar) {
                    j2 = j;
                    str4 = (String) objE2;
                    this.O0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.h = d4k1Var3;
                    this.i = xkk1Var;
                    this.t = llgVar3;
                    this.X = str4;
                    this.Y = j2;
                    this.Z = j;
                    this.N0 = (byte) 6;
                    objE3 = l2tVar.E(this);
                    if (objE3 != d9nVar) {
                        d4k1 d4k1Var12 = d4k1Var3;
                        xkk1Var2 = xkk1Var;
                        d4k1Var4 = d4k1Var12;
                        str5 = str4;
                        llgVar4 = llgVar3;
                        j3 = j;
                        return new w3k1(d4k1Var4, xkk1Var2, llgVar4, j3, str5, (String) objE3);
                    }
                }
                return d9nVar;
            case 5:
                long j12 = this.Z;
                long j13 = this.Y;
                llg llgVar5 = this.t;
                xkk1 xkk1Var3 = this.i;
                d4k1 d4k1Var13 = this.h;
                l2tVar = this.g;
                hm5.M(obj);
                j = j12;
                xkk1Var = xkk1Var3;
                objE2 = obj;
                llgVar3 = llgVar5;
                j2 = j13;
                d4k1Var3 = d4k1Var13;
                str4 = (String) objE2;
                this.O0 = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = d4k1Var3;
                this.i = xkk1Var;
                this.t = llgVar3;
                this.X = str4;
                this.Y = j2;
                this.Z = j;
                this.N0 = (byte) 6;
                objE3 = l2tVar.E(this);
                if (objE3 != d9nVar) {
                    d4k1 d4k1Var14 = d4k1Var3;
                    xkk1Var2 = xkk1Var;
                    d4k1Var4 = d4k1Var14;
                    str5 = str4;
                    llgVar4 = llgVar3;
                    j3 = j;
                    return new w3k1(d4k1Var4, xkk1Var2, llgVar4, j3, str5, (String) objE3);
                }
                return d9nVar;
            case 6:
                long j14 = this.Z;
                String str13 = this.X;
                llgVar4 = this.t;
                xkk1 xkk1Var4 = this.i;
                d4k1 d4k1Var15 = this.h;
                hm5.M(obj);
                str5 = str13;
                xkk1Var2 = xkk1Var4;
                j3 = j14;
                d4k1Var4 = d4k1Var15;
                objE3 = obj;
                return new w3k1(d4k1Var4, xkk1Var2, llgVar4, j3, str5, (String) objE3);
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
