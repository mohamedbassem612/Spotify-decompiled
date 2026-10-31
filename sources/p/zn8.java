package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zn8 extends a8d1 implements vu30 {
    public /* synthetic */ Object N0;
    public final /* synthetic */ wn8 O0;
    public final /* synthetic */ bo8 P0;
    public final /* synthetic */ String Q0;
    public final /* synthetic */ lik1 R0;
    public igm X;
    public int Y;
    public byte Z;
    public s2t a;
    public l2t b;
    public l2t c;
    public l2t d;
    public l2t e;
    public l2t f;
    public Object g;
    public Object h;
    public Object i;
    public List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn8(wn8 wn8Var, bo8 bo8Var, String str, lik1 lik1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.O0 = wn8Var;
        this.P0 = bo8Var;
        this.Q0 = str;
        this.R0 = lik1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        zn8 zn8Var = new zn8(this.O0, this.P0, this.Q0, this.R0, lnmVar);
        zn8Var.N0 = obj;
        return zn8Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0198  */
    /* JADX WARN: Code duplicated, block: B:36:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x020a  */
    /* JADX WARN: Code duplicated, block: B:50:0x021c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0244  */
    /* JADX WARN: Code duplicated, block: B:56:0x024a  */
    /* JADX WARN: Code duplicated, block: B:58:0x024f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0251 A[PHI: r1 r2 r3 r4 r6 r7 r9 r10 r13 r14
      0x0251: PHI (r1v17 int) = (r1v15 int), (r1v19 int) binds: [B:49:0x021a, B:58:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r2v19 p.igm) = (r2v17 p.igm), (r2v21 p.igm) binds: [B:49:0x021a, B:58:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r3v12 java.util.List) = (r3v9 java.util.List), (r3v18 java.util.List) binds: [B:49:0x021a, B:58:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r4v12 java.util.List) = (r4v9 java.util.List), (r4v14 java.util.List) binds: [B:49:0x021a, B:58:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r6v14 p.bo8) = (r6v11 p.bo8), (r6v18 p.bo8) binds: [B:49:0x021a, B:58:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r7v28 p.wn8) = (r7v25 p.wn8), (r7v31 p.wn8) binds: [B:49:0x021a, B:58:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r9v19 p.d9n) = (r9v16 p.d9n), (r9v21 p.d9n) binds: [B:49:0x021a, B:58:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r10v18 p.l2t) = (r10v14 p.l2t), (r10v22 p.l2t) binds: [B:49:0x021a, B:58:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r13v11 p.l2t) = (r13v9 p.l2t), (r13v13 p.l2t) binds: [B:49:0x021a, B:58:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r14v10 p.l2t) = (r14v8 p.l2t), (r14v11 p.l2t) binds: [B:49:0x021a, B:58:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0258  */
    /* JADX WARN: Code duplicated, block: B:64:0x0263  */
    /* JADX WARN: Code duplicated, block: B:67:0x0287  */
    /* JADX WARN: Code duplicated, block: B:70:0x028d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0291  */
    /* JADX WARN: Code duplicated, block: B:72:0x0293 A[PHI: r1 r2 r4 r5 r8 r9 r13
      0x0293: PHI (r1v21 int) = (r1v18 int), (r1v24 int) binds: [B:63:0x0261, B:71:0x0291] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r2v23 p.igm) = (r2v20 p.igm), (r2v26 p.igm) binds: [B:63:0x0261, B:71:0x0291] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r4v17 java.util.List) = (r4v13 java.util.List), (r4v19 java.util.List) binds: [B:63:0x0261, B:71:0x0291] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r5v17 java.util.List) = (r5v11 java.util.List), (r5v19 java.util.List) binds: [B:63:0x0261, B:71:0x0291] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r8v15 p.l2t) = (r8v12 p.l2t), (r8v16 p.l2t) binds: [B:63:0x0261, B:71:0x0291] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r9v24 p.d9n) = (r9v20 p.d9n), (r9v26 p.d9n) binds: [B:63:0x0261, B:71:0x0291] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r13v15 p.l2t) = (r13v12 p.l2t), (r13v16 p.l2t) binds: [B:63:0x0261, B:71:0x0291] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x02e8  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        lik1 lik1Var;
        l2t l2tVar;
        l2t l2tVarQ;
        l2t l2tVar2;
        l2t l2tVarQ2;
        Object objQ;
        d9n d9nVar;
        l2t l2tVar3;
        l2t l2tVar4;
        s2t s2tVar;
        l2t l2tVar5;
        igm igmVar;
        List listN;
        l2t l2tVar6;
        wn8 wn8Var;
        int i;
        List list;
        Object objE;
        l2t l2tVar7;
        igm igmVar2;
        List list2;
        bo8 bo8Var;
        l2t l2tVar8;
        bo8 bo8Var2;
        Object objE2;
        igm igmVar3;
        int i2;
        List list3;
        wn8 wn8Var2;
        bo8 bo8Var3;
        jhm jhmVar;
        Object objE3;
        l2t l2tVar9;
        l2t l2tVar10;
        List list4;
        p860 p860Var;
        Object objE4;
        l2t l2tVar11;
        l2t l2tVar12;
        jhm jhmVar2;
        Object objE5;
        int i3;
        igm igmVar4;
        jhm jhmVar3;
        Object objE6;
        List list5;
        jhm jhmVar4;
        c9n c9nVar = (c9n) this.N0;
        byte b = this.Z;
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        wn8 wn8Var3 = this.O0;
        bo8 bo8Var4 = this.P0;
        lnm lnmVar = null;
        d9n d9nVar2 = d9n.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                String str = this.Q0;
                byte b2 = 1;
                s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new xn8(bo8Var4, str, lnmVar, b2), 3);
                s2t s2tVarQ2 = wn8Var3.a ? fn31.q(c9nVar, (o8n) null, 0, new xn8(bo8Var4, str, lnmVar, objArr2 == true ? 1 : 0), 3) : null;
                l2t l2tVarQ3 = fn31.q(c9nVar, (o8n) null, 0, new yn8(bo8Var4, str, lnmVar, b2), 3);
                boolean z = bo8Var4.i;
                lik1 lik1Var2 = this.R0;
                if (z && wn8Var3.b) {
                    l2tVar = l2tVarQ3;
                    hb1 hb1Var = new hb1(bo8Var4, str, lik1Var2, lnmVar, (byte) 24);
                    lik1Var = lik1Var2;
                    l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, hb1Var, 3);
                } else {
                    lik1Var = lik1Var2;
                    l2tVar = l2tVarQ3;
                    l2tVarQ = null;
                }
                l2t l2tVarQ4 = fn31.q(c9nVar, (o8n) null, 0, new yn8(bo8Var4, str, lnmVar, objArr == true ? 1 : 0), 3);
                l2tVar2 = l2tVarQ;
                l2t l2tVarQ5 = fn31.q(c9nVar, (o8n) null, 0, new wc5(bo8Var4, lik1Var, str, (lnm) null, (byte) 20), 3);
                l2tVarQ2 = wn8Var3.c ? fn31.q(c9nVar, (o8n) null, 0, new kk(bo8Var4, lnmVar, (byte) 18), 3) : null;
                this.N0 = null;
                this.a = s2tVarQ2;
                this.b = l2tVar;
                this.c = l2tVar2;
                this.d = l2tVarQ4;
                this.e = l2tVarQ5;
                this.f = l2tVarQ2;
                this.Z = (byte) 1;
                objQ = s2tVarQ.Q(this);
                d9nVar = d9nVar2;
                if (objQ != d9nVar) {
                    l2tVar3 = l2tVarQ5;
                    l2tVar4 = l2tVarQ4;
                    s2tVar = s2tVarQ2;
                    l2tVar5 = l2tVar;
                    igmVar = (igm) objQ;
                    listN = k4p1.n();
                    if (s2tVar != null) {
                        this.N0 = null;
                        this.a = null;
                        this.b = l2tVar5;
                        this.c = l2tVar2;
                        this.d = l2tVar4;
                        this.e = l2tVar3;
                        this.f = l2tVarQ2;
                        this.g = wn8Var3;
                        this.h = bo8Var4;
                        this.i = listN;
                        this.t = listN;
                        this.X = igmVar;
                        this.Y = 0;
                        this.Z = (byte) 2;
                        objE = s2tVar.E(this);
                        if (objE != d9nVar) {
                            l2tVar6 = l2tVar4;
                            l2tVar7 = l2tVarQ2;
                            igmVar2 = igmVar;
                            list2 = listN;
                            jhmVar = (jhm) objE;
                            if (jhmVar != null) {
                                list2.add(jhmVar);
                                bo8Var = bo8Var4;
                                l2tVar8 = l2tVar7;
                            } else {
                                List list6 = list2;
                                igmVar = igmVar2;
                                l2tVarQ2 = l2tVar7;
                                wn8Var = wn8Var3;
                                i = i4;
                                list = list6;
                                bo8Var = bo8Var4;
                                l2tVar8 = l2tVarQ2;
                                igmVar2 = igmVar;
                                list2 = list;
                                i4 = i;
                                wn8Var3 = wn8Var;
                            }
                            bo8Var2 = bo8Var;
                            this.N0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = l2tVar2;
                            this.d = l2tVar6;
                            this.e = l2tVar3;
                            this.f = l2tVar8;
                            this.g = wn8Var3;
                            this.h = bo8Var2;
                            this.i = listN;
                            this.t = list2;
                            this.X = igmVar2;
                            this.Y = i4;
                            this.Z = (byte) 3;
                            objE2 = l2tVar5.E(this);
                            if (objE2 != d9nVar) {
                                List list7 = list2;
                                igmVar3 = igmVar2;
                                i2 = i4;
                                list3 = list7;
                                wn8Var2 = wn8Var3;
                                bo8Var3 = bo8Var2;
                                list3.add((jhm) objE2);
                                if (l2tVar8 != null) {
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = l2tVar2;
                                    this.d = l2tVar6;
                                    this.e = l2tVar3;
                                    this.f = null;
                                    this.g = wn8Var2;
                                    this.h = bo8Var3;
                                    this.i = listN;
                                    this.t = list3;
                                    this.X = igmVar3;
                                    this.Y = i2;
                                    this.Z = (byte) 4;
                                    objE3 = l2tVar8.E(this);
                                    if (objE3 != d9nVar) {
                                        l2tVar9 = l2tVar3;
                                        l2tVar10 = l2tVar2;
                                        jhmVar2 = (jhm) objE3;
                                        if (jhmVar2 != null) {
                                            list3.add(jhmVar2);
                                        } else {
                                            l2tVar2 = l2tVar10;
                                            l2tVar3 = l2tVar9;
                                            l2tVar9 = l2tVar3;
                                            l2tVar10 = l2tVar2;
                                        }
                                        list4 = listN;
                                        p860Var = wn8Var2.d;
                                        if (p860Var != null) {
                                            list3.add(bo8Var3.h.h(p860Var));
                                        }
                                        if (l2tVar10 != null) {
                                            this.N0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = l2tVar6;
                                            this.e = l2tVar9;
                                            this.f = null;
                                            this.g = list4;
                                            this.h = list3;
                                            this.i = igmVar3;
                                            this.t = null;
                                            this.X = null;
                                            this.Y = i2;
                                            this.Z = (byte) 5;
                                            objE4 = l2tVar10.E(this);
                                            if (objE4 != d9nVar) {
                                                l2tVar11 = l2tVar9;
                                                l2tVar12 = l2tVar6;
                                                jhmVar3 = (jhm) objE4;
                                                if (jhmVar3 != null) {
                                                    list3.add(jhmVar3);
                                                } else {
                                                    l2tVar9 = l2tVar11;
                                                    l2tVar6 = l2tVar12;
                                                    l2tVar11 = l2tVar9;
                                                    l2tVar12 = l2tVar6;
                                                }
                                                this.N0 = null;
                                                this.a = null;
                                                this.b = null;
                                                this.c = null;
                                                this.d = null;
                                                this.e = l2tVar11;
                                                this.f = null;
                                                this.g = list4;
                                                this.h = list3;
                                                this.i = igmVar3;
                                                this.t = null;
                                                this.X = null;
                                                this.Y = i2;
                                                this.Z = (byte) 6;
                                                objE5 = l2tVar12.E(this);
                                                if (objE5 != d9nVar) {
                                                    igm igmVar5 = igmVar3;
                                                    i3 = i2;
                                                    igmVar4 = igmVar5;
                                                    list3.add((jhm) objE5);
                                                    this.N0 = null;
                                                    this.a = null;
                                                    this.b = null;
                                                    this.c = null;
                                                    this.d = null;
                                                    this.e = null;
                                                    this.f = null;
                                                    this.g = list4;
                                                    this.h = list3;
                                                    this.i = igmVar4;
                                                    this.Y = i3;
                                                    this.Z = (byte) 7;
                                                    objE6 = l2tVar11.E(this);
                                                    if (objE6 != d9nVar) {
                                                        list5 = list3;
                                                        jhmVar4 = (jhm) objE6;
                                                        if (jhmVar4 != null) {
                                                            list5.add(jhmVar4);
                                                        }
                                                        return new kjm(igmVar4, k4p1.k(list4), 4);
                                                    }
                                                }
                                            }
                                        } else {
                                            l2tVar11 = l2tVar9;
                                            l2tVar12 = l2tVar6;
                                            this.N0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = l2tVar11;
                                            this.f = null;
                                            this.g = list4;
                                            this.h = list3;
                                            this.i = igmVar3;
                                            this.t = null;
                                            this.X = null;
                                            this.Y = i2;
                                            this.Z = (byte) 6;
                                            objE5 = l2tVar12.E(this);
                                            if (objE5 != d9nVar) {
                                                igm igmVar6 = igmVar3;
                                                i3 = i2;
                                                igmVar4 = igmVar6;
                                                list3.add((jhm) objE5);
                                                this.N0 = null;
                                                this.a = null;
                                                this.b = null;
                                                this.c = null;
                                                this.d = null;
                                                this.e = null;
                                                this.f = null;
                                                this.g = list4;
                                                this.h = list3;
                                                this.i = igmVar4;
                                                this.Y = i3;
                                                this.Z = (byte) 7;
                                                objE6 = l2tVar11.E(this);
                                                if (objE6 != d9nVar) {
                                                    list5 = list3;
                                                    jhmVar4 = (jhm) objE6;
                                                    if (jhmVar4 != null) {
                                                        list5.add(jhmVar4);
                                                    }
                                                    return new kjm(igmVar4, k4p1.k(list4), 4);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    l2tVar9 = l2tVar3;
                                    l2tVar10 = l2tVar2;
                                    list4 = listN;
                                    p860Var = wn8Var2.d;
                                    if (p860Var != null) {
                                        list3.add(bo8Var3.h.h(p860Var));
                                    }
                                    if (l2tVar10 != null) {
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = l2tVar6;
                                        this.e = l2tVar9;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar3;
                                        this.t = null;
                                        this.X = null;
                                        this.Y = i2;
                                        this.Z = (byte) 5;
                                        objE4 = l2tVar10.E(this);
                                        if (objE4 != d9nVar) {
                                            l2tVar11 = l2tVar9;
                                            l2tVar12 = l2tVar6;
                                            jhmVar3 = (jhm) objE4;
                                            if (jhmVar3 != null) {
                                                list3.add(jhmVar3);
                                            } else {
                                                l2tVar9 = l2tVar11;
                                                l2tVar6 = l2tVar12;
                                                l2tVar11 = l2tVar9;
                                                l2tVar12 = l2tVar6;
                                            }
                                            this.N0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = l2tVar11;
                                            this.f = null;
                                            this.g = list4;
                                            this.h = list3;
                                            this.i = igmVar3;
                                            this.t = null;
                                            this.X = null;
                                            this.Y = i2;
                                            this.Z = (byte) 6;
                                            objE5 = l2tVar12.E(this);
                                            if (objE5 != d9nVar) {
                                                igm igmVar7 = igmVar3;
                                                i3 = i2;
                                                igmVar4 = igmVar7;
                                                list3.add((jhm) objE5);
                                                this.N0 = null;
                                                this.a = null;
                                                this.b = null;
                                                this.c = null;
                                                this.d = null;
                                                this.e = null;
                                                this.f = null;
                                                this.g = list4;
                                                this.h = list3;
                                                this.i = igmVar4;
                                                this.Y = i3;
                                                this.Z = (byte) 7;
                                                objE6 = l2tVar11.E(this);
                                                if (objE6 != d9nVar) {
                                                    list5 = list3;
                                                    jhmVar4 = (jhm) objE6;
                                                    if (jhmVar4 != null) {
                                                        list5.add(jhmVar4);
                                                    }
                                                    return new kjm(igmVar4, k4p1.k(list4), 4);
                                                }
                                            }
                                        }
                                    } else {
                                        l2tVar11 = l2tVar9;
                                        l2tVar12 = l2tVar6;
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = l2tVar11;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar3;
                                        this.t = null;
                                        this.X = null;
                                        this.Y = i2;
                                        this.Z = (byte) 6;
                                        objE5 = l2tVar12.E(this);
                                        if (objE5 != d9nVar) {
                                            igm igmVar8 = igmVar3;
                                            i3 = i2;
                                            igmVar4 = igmVar8;
                                            list3.add((jhm) objE5);
                                            this.N0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = null;
                                            this.f = null;
                                            this.g = list4;
                                            this.h = list3;
                                            this.i = igmVar4;
                                            this.Y = i3;
                                            this.Z = (byte) 7;
                                            objE6 = l2tVar11.E(this);
                                            if (objE6 != d9nVar) {
                                                list5 = list3;
                                                jhmVar4 = (jhm) objE6;
                                                if (jhmVar4 != null) {
                                                    list5.add(jhmVar4);
                                                }
                                                return new kjm(igmVar4, k4p1.k(list4), 4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        l2tVar6 = l2tVar4;
                        wn8Var = wn8Var3;
                        i = 0;
                        list = listN;
                        bo8Var = bo8Var4;
                        l2tVar8 = l2tVarQ2;
                        igmVar2 = igmVar;
                        list2 = list;
                        i4 = i;
                        wn8Var3 = wn8Var;
                        bo8Var2 = bo8Var;
                        this.N0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = l2tVar2;
                        this.d = l2tVar6;
                        this.e = l2tVar3;
                        this.f = l2tVar8;
                        this.g = wn8Var3;
                        this.h = bo8Var2;
                        this.i = listN;
                        this.t = list2;
                        this.X = igmVar2;
                        this.Y = i4;
                        this.Z = (byte) 3;
                        objE2 = l2tVar5.E(this);
                        if (objE2 != d9nVar) {
                            List list8 = list2;
                            igmVar3 = igmVar2;
                            i2 = i4;
                            list3 = list8;
                            wn8Var2 = wn8Var3;
                            bo8Var3 = bo8Var2;
                            list3.add((jhm) objE2);
                            if (l2tVar8 != null) {
                                this.N0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = l2tVar2;
                                this.d = l2tVar6;
                                this.e = l2tVar3;
                                this.f = null;
                                this.g = wn8Var2;
                                this.h = bo8Var3;
                                this.i = listN;
                                this.t = list3;
                                this.X = igmVar3;
                                this.Y = i2;
                                this.Z = (byte) 4;
                                objE3 = l2tVar8.E(this);
                                if (objE3 != d9nVar) {
                                    l2tVar9 = l2tVar3;
                                    l2tVar10 = l2tVar2;
                                    jhmVar2 = (jhm) objE3;
                                    if (jhmVar2 != null) {
                                        list3.add(jhmVar2);
                                    } else {
                                        l2tVar2 = l2tVar10;
                                        l2tVar3 = l2tVar9;
                                        l2tVar9 = l2tVar3;
                                        l2tVar10 = l2tVar2;
                                    }
                                    list4 = listN;
                                    p860Var = wn8Var2.d;
                                    if (p860Var != null) {
                                        list3.add(bo8Var3.h.h(p860Var));
                                    }
                                    if (l2tVar10 != null) {
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = l2tVar6;
                                        this.e = l2tVar9;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar3;
                                        this.t = null;
                                        this.X = null;
                                        this.Y = i2;
                                        this.Z = (byte) 5;
                                        objE4 = l2tVar10.E(this);
                                        if (objE4 != d9nVar) {
                                            l2tVar11 = l2tVar9;
                                            l2tVar12 = l2tVar6;
                                            jhmVar3 = (jhm) objE4;
                                            if (jhmVar3 != null) {
                                                list3.add(jhmVar3);
                                            } else {
                                                l2tVar9 = l2tVar11;
                                                l2tVar6 = l2tVar12;
                                                l2tVar11 = l2tVar9;
                                                l2tVar12 = l2tVar6;
                                            }
                                            this.N0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = l2tVar11;
                                            this.f = null;
                                            this.g = list4;
                                            this.h = list3;
                                            this.i = igmVar3;
                                            this.t = null;
                                            this.X = null;
                                            this.Y = i2;
                                            this.Z = (byte) 6;
                                            objE5 = l2tVar12.E(this);
                                            if (objE5 != d9nVar) {
                                                igm igmVar9 = igmVar3;
                                                i3 = i2;
                                                igmVar4 = igmVar9;
                                                list3.add((jhm) objE5);
                                                this.N0 = null;
                                                this.a = null;
                                                this.b = null;
                                                this.c = null;
                                                this.d = null;
                                                this.e = null;
                                                this.f = null;
                                                this.g = list4;
                                                this.h = list3;
                                                this.i = igmVar4;
                                                this.Y = i3;
                                                this.Z = (byte) 7;
                                                objE6 = l2tVar11.E(this);
                                                if (objE6 != d9nVar) {
                                                    list5 = list3;
                                                    jhmVar4 = (jhm) objE6;
                                                    if (jhmVar4 != null) {
                                                        list5.add(jhmVar4);
                                                    }
                                                    return new kjm(igmVar4, k4p1.k(list4), 4);
                                                }
                                            }
                                        }
                                    } else {
                                        l2tVar11 = l2tVar9;
                                        l2tVar12 = l2tVar6;
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = l2tVar11;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar3;
                                        this.t = null;
                                        this.X = null;
                                        this.Y = i2;
                                        this.Z = (byte) 6;
                                        objE5 = l2tVar12.E(this);
                                        if (objE5 != d9nVar) {
                                            igm igmVar10 = igmVar3;
                                            i3 = i2;
                                            igmVar4 = igmVar10;
                                            list3.add((jhm) objE5);
                                            this.N0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = null;
                                            this.f = null;
                                            this.g = list4;
                                            this.h = list3;
                                            this.i = igmVar4;
                                            this.Y = i3;
                                            this.Z = (byte) 7;
                                            objE6 = l2tVar11.E(this);
                                            if (objE6 != d9nVar) {
                                                list5 = list3;
                                                jhmVar4 = (jhm) objE6;
                                                if (jhmVar4 != null) {
                                                    list5.add(jhmVar4);
                                                }
                                                return new kjm(igmVar4, k4p1.k(list4), 4);
                                            }
                                        }
                                    }
                                }
                            } else {
                                l2tVar9 = l2tVar3;
                                l2tVar10 = l2tVar2;
                                list4 = listN;
                                p860Var = wn8Var2.d;
                                if (p860Var != null) {
                                    list3.add(bo8Var3.h.h(p860Var));
                                }
                                if (l2tVar10 != null) {
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = l2tVar6;
                                    this.e = l2tVar9;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar3;
                                    this.t = null;
                                    this.X = null;
                                    this.Y = i2;
                                    this.Z = (byte) 5;
                                    objE4 = l2tVar10.E(this);
                                    if (objE4 != d9nVar) {
                                        l2tVar11 = l2tVar9;
                                        l2tVar12 = l2tVar6;
                                        jhmVar3 = (jhm) objE4;
                                        if (jhmVar3 != null) {
                                            list3.add(jhmVar3);
                                        } else {
                                            l2tVar9 = l2tVar11;
                                            l2tVar6 = l2tVar12;
                                            l2tVar11 = l2tVar9;
                                            l2tVar12 = l2tVar6;
                                        }
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = l2tVar11;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar3;
                                        this.t = null;
                                        this.X = null;
                                        this.Y = i2;
                                        this.Z = (byte) 6;
                                        objE5 = l2tVar12.E(this);
                                        if (objE5 != d9nVar) {
                                            igm igmVar11 = igmVar3;
                                            i3 = i2;
                                            igmVar4 = igmVar11;
                                            list3.add((jhm) objE5);
                                            this.N0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = null;
                                            this.f = null;
                                            this.g = list4;
                                            this.h = list3;
                                            this.i = igmVar4;
                                            this.Y = i3;
                                            this.Z = (byte) 7;
                                            objE6 = l2tVar11.E(this);
                                            if (objE6 != d9nVar) {
                                                list5 = list3;
                                                jhmVar4 = (jhm) objE6;
                                                if (jhmVar4 != null) {
                                                    list5.add(jhmVar4);
                                                }
                                                return new kjm(igmVar4, k4p1.k(list4), 4);
                                            }
                                        }
                                    }
                                } else {
                                    l2tVar11 = l2tVar9;
                                    l2tVar12 = l2tVar6;
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = l2tVar11;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar3;
                                    this.t = null;
                                    this.X = null;
                                    this.Y = i2;
                                    this.Z = (byte) 6;
                                    objE5 = l2tVar12.E(this);
                                    if (objE5 != d9nVar) {
                                        igm igmVar12 = igmVar3;
                                        i3 = i2;
                                        igmVar4 = igmVar12;
                                        list3.add((jhm) objE5);
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = null;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar4;
                                        this.Y = i3;
                                        this.Z = (byte) 7;
                                        objE6 = l2tVar11.E(this);
                                        if (objE6 != d9nVar) {
                                            list5 = list3;
                                            jhmVar4 = (jhm) objE6;
                                            if (jhmVar4 != null) {
                                                list5.add(jhmVar4);
                                            }
                                            return new kjm(igmVar4, k4p1.k(list4), 4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 1:
                l2tVarQ2 = this.f;
                l2t l2tVar13 = this.e;
                l2tVar4 = this.d;
                l2t l2tVar14 = this.c;
                l2t l2tVar15 = this.b;
                s2tVar = this.a;
                hm5.M(obj);
                l2tVar2 = l2tVar14;
                l2tVar5 = l2tVar15;
                d9nVar = d9nVar2;
                l2tVar3 = l2tVar13;
                objQ = obj;
                igmVar = (igm) objQ;
                listN = k4p1.n();
                if (s2tVar != null) {
                    this.N0 = null;
                    this.a = null;
                    this.b = l2tVar5;
                    this.c = l2tVar2;
                    this.d = l2tVar4;
                    this.e = l2tVar3;
                    this.f = l2tVarQ2;
                    this.g = wn8Var3;
                    this.h = bo8Var4;
                    this.i = listN;
                    this.t = listN;
                    this.X = igmVar;
                    this.Y = 0;
                    this.Z = (byte) 2;
                    objE = s2tVar.E(this);
                    if (objE != d9nVar) {
                        l2tVar6 = l2tVar4;
                        l2tVar7 = l2tVarQ2;
                        igmVar2 = igmVar;
                        list2 = listN;
                        jhmVar = (jhm) objE;
                        if (jhmVar != null) {
                            list2.add(jhmVar);
                            bo8Var = bo8Var4;
                            l2tVar8 = l2tVar7;
                        } else {
                            List list9 = list2;
                            igmVar = igmVar2;
                            l2tVarQ2 = l2tVar7;
                            wn8Var = wn8Var3;
                            i = i4;
                            list = list9;
                            bo8Var = bo8Var4;
                            l2tVar8 = l2tVarQ2;
                            igmVar2 = igmVar;
                            list2 = list;
                            i4 = i;
                            wn8Var3 = wn8Var;
                        }
                        bo8Var2 = bo8Var;
                        this.N0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = l2tVar2;
                        this.d = l2tVar6;
                        this.e = l2tVar3;
                        this.f = l2tVar8;
                        this.g = wn8Var3;
                        this.h = bo8Var2;
                        this.i = listN;
                        this.t = list2;
                        this.X = igmVar2;
                        this.Y = i4;
                        this.Z = (byte) 3;
                        objE2 = l2tVar5.E(this);
                        if (objE2 != d9nVar) {
                            List list10 = list2;
                            igmVar3 = igmVar2;
                            i2 = i4;
                            list3 = list10;
                            wn8Var2 = wn8Var3;
                            bo8Var3 = bo8Var2;
                            list3.add((jhm) objE2);
                            if (l2tVar8 != null) {
                                this.N0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = l2tVar2;
                                this.d = l2tVar6;
                                this.e = l2tVar3;
                                this.f = null;
                                this.g = wn8Var2;
                                this.h = bo8Var3;
                                this.i = listN;
                                this.t = list3;
                                this.X = igmVar3;
                                this.Y = i2;
                                this.Z = (byte) 4;
                                objE3 = l2tVar8.E(this);
                                if (objE3 != d9nVar) {
                                    l2tVar9 = l2tVar3;
                                    l2tVar10 = l2tVar2;
                                    jhmVar2 = (jhm) objE3;
                                    if (jhmVar2 != null) {
                                        list3.add(jhmVar2);
                                    } else {
                                        l2tVar2 = l2tVar10;
                                        l2tVar3 = l2tVar9;
                                        l2tVar9 = l2tVar3;
                                        l2tVar10 = l2tVar2;
                                    }
                                    list4 = listN;
                                    p860Var = wn8Var2.d;
                                    if (p860Var != null) {
                                        list3.add(bo8Var3.h.h(p860Var));
                                    }
                                    if (l2tVar10 != null) {
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = l2tVar6;
                                        this.e = l2tVar9;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar3;
                                        this.t = null;
                                        this.X = null;
                                        this.Y = i2;
                                        this.Z = (byte) 5;
                                        objE4 = l2tVar10.E(this);
                                        if (objE4 != d9nVar) {
                                            l2tVar11 = l2tVar9;
                                            l2tVar12 = l2tVar6;
                                            jhmVar3 = (jhm) objE4;
                                            if (jhmVar3 != null) {
                                                list3.add(jhmVar3);
                                            } else {
                                                l2tVar9 = l2tVar11;
                                                l2tVar6 = l2tVar12;
                                                l2tVar11 = l2tVar9;
                                                l2tVar12 = l2tVar6;
                                            }
                                            this.N0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = l2tVar11;
                                            this.f = null;
                                            this.g = list4;
                                            this.h = list3;
                                            this.i = igmVar3;
                                            this.t = null;
                                            this.X = null;
                                            this.Y = i2;
                                            this.Z = (byte) 6;
                                            objE5 = l2tVar12.E(this);
                                            if (objE5 != d9nVar) {
                                                igm igmVar13 = igmVar3;
                                                i3 = i2;
                                                igmVar4 = igmVar13;
                                                list3.add((jhm) objE5);
                                                this.N0 = null;
                                                this.a = null;
                                                this.b = null;
                                                this.c = null;
                                                this.d = null;
                                                this.e = null;
                                                this.f = null;
                                                this.g = list4;
                                                this.h = list3;
                                                this.i = igmVar4;
                                                this.Y = i3;
                                                this.Z = (byte) 7;
                                                objE6 = l2tVar11.E(this);
                                                if (objE6 != d9nVar) {
                                                    list5 = list3;
                                                    jhmVar4 = (jhm) objE6;
                                                    if (jhmVar4 != null) {
                                                        list5.add(jhmVar4);
                                                    }
                                                    return new kjm(igmVar4, k4p1.k(list4), 4);
                                                }
                                            }
                                        }
                                    } else {
                                        l2tVar11 = l2tVar9;
                                        l2tVar12 = l2tVar6;
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = l2tVar11;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar3;
                                        this.t = null;
                                        this.X = null;
                                        this.Y = i2;
                                        this.Z = (byte) 6;
                                        objE5 = l2tVar12.E(this);
                                        if (objE5 != d9nVar) {
                                            igm igmVar14 = igmVar3;
                                            i3 = i2;
                                            igmVar4 = igmVar14;
                                            list3.add((jhm) objE5);
                                            this.N0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = null;
                                            this.f = null;
                                            this.g = list4;
                                            this.h = list3;
                                            this.i = igmVar4;
                                            this.Y = i3;
                                            this.Z = (byte) 7;
                                            objE6 = l2tVar11.E(this);
                                            if (objE6 != d9nVar) {
                                                list5 = list3;
                                                jhmVar4 = (jhm) objE6;
                                                if (jhmVar4 != null) {
                                                    list5.add(jhmVar4);
                                                }
                                                return new kjm(igmVar4, k4p1.k(list4), 4);
                                            }
                                        }
                                    }
                                }
                            } else {
                                l2tVar9 = l2tVar3;
                                l2tVar10 = l2tVar2;
                                list4 = listN;
                                p860Var = wn8Var2.d;
                                if (p860Var != null) {
                                    list3.add(bo8Var3.h.h(p860Var));
                                }
                                if (l2tVar10 != null) {
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = l2tVar6;
                                    this.e = l2tVar9;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar3;
                                    this.t = null;
                                    this.X = null;
                                    this.Y = i2;
                                    this.Z = (byte) 5;
                                    objE4 = l2tVar10.E(this);
                                    if (objE4 != d9nVar) {
                                        l2tVar11 = l2tVar9;
                                        l2tVar12 = l2tVar6;
                                        jhmVar3 = (jhm) objE4;
                                        if (jhmVar3 != null) {
                                            list3.add(jhmVar3);
                                        } else {
                                            l2tVar9 = l2tVar11;
                                            l2tVar6 = l2tVar12;
                                            l2tVar11 = l2tVar9;
                                            l2tVar12 = l2tVar6;
                                        }
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = l2tVar11;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar3;
                                        this.t = null;
                                        this.X = null;
                                        this.Y = i2;
                                        this.Z = (byte) 6;
                                        objE5 = l2tVar12.E(this);
                                        if (objE5 != d9nVar) {
                                            igm igmVar15 = igmVar3;
                                            i3 = i2;
                                            igmVar4 = igmVar15;
                                            list3.add((jhm) objE5);
                                            this.N0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = null;
                                            this.f = null;
                                            this.g = list4;
                                            this.h = list3;
                                            this.i = igmVar4;
                                            this.Y = i3;
                                            this.Z = (byte) 7;
                                            objE6 = l2tVar11.E(this);
                                            if (objE6 != d9nVar) {
                                                list5 = list3;
                                                jhmVar4 = (jhm) objE6;
                                                if (jhmVar4 != null) {
                                                    list5.add(jhmVar4);
                                                }
                                                return new kjm(igmVar4, k4p1.k(list4), 4);
                                            }
                                        }
                                    }
                                } else {
                                    l2tVar11 = l2tVar9;
                                    l2tVar12 = l2tVar6;
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = l2tVar11;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar3;
                                    this.t = null;
                                    this.X = null;
                                    this.Y = i2;
                                    this.Z = (byte) 6;
                                    objE5 = l2tVar12.E(this);
                                    if (objE5 != d9nVar) {
                                        igm igmVar16 = igmVar3;
                                        i3 = i2;
                                        igmVar4 = igmVar16;
                                        list3.add((jhm) objE5);
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = null;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar4;
                                        this.Y = i3;
                                        this.Z = (byte) 7;
                                        objE6 = l2tVar11.E(this);
                                        if (objE6 != d9nVar) {
                                            list5 = list3;
                                            jhmVar4 = (jhm) objE6;
                                            if (jhmVar4 != null) {
                                                list5.add(jhmVar4);
                                            }
                                            return new kjm(igmVar4, k4p1.k(list4), 4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    l2tVar6 = l2tVar4;
                    wn8Var = wn8Var3;
                    i = 0;
                    list = listN;
                    bo8Var = bo8Var4;
                    l2tVar8 = l2tVarQ2;
                    igmVar2 = igmVar;
                    list2 = list;
                    i4 = i;
                    wn8Var3 = wn8Var;
                    bo8Var2 = bo8Var;
                    this.N0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = l2tVar2;
                    this.d = l2tVar6;
                    this.e = l2tVar3;
                    this.f = l2tVar8;
                    this.g = wn8Var3;
                    this.h = bo8Var2;
                    this.i = listN;
                    this.t = list2;
                    this.X = igmVar2;
                    this.Y = i4;
                    this.Z = (byte) 3;
                    objE2 = l2tVar5.E(this);
                    if (objE2 != d9nVar) {
                        List list11 = list2;
                        igmVar3 = igmVar2;
                        i2 = i4;
                        list3 = list11;
                        wn8Var2 = wn8Var3;
                        bo8Var3 = bo8Var2;
                        list3.add((jhm) objE2);
                        if (l2tVar8 != null) {
                            this.N0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = l2tVar2;
                            this.d = l2tVar6;
                            this.e = l2tVar3;
                            this.f = null;
                            this.g = wn8Var2;
                            this.h = bo8Var3;
                            this.i = listN;
                            this.t = list3;
                            this.X = igmVar3;
                            this.Y = i2;
                            this.Z = (byte) 4;
                            objE3 = l2tVar8.E(this);
                            if (objE3 != d9nVar) {
                                l2tVar9 = l2tVar3;
                                l2tVar10 = l2tVar2;
                                jhmVar2 = (jhm) objE3;
                                if (jhmVar2 != null) {
                                    list3.add(jhmVar2);
                                } else {
                                    l2tVar2 = l2tVar10;
                                    l2tVar3 = l2tVar9;
                                    l2tVar9 = l2tVar3;
                                    l2tVar10 = l2tVar2;
                                }
                                list4 = listN;
                                p860Var = wn8Var2.d;
                                if (p860Var != null) {
                                    list3.add(bo8Var3.h.h(p860Var));
                                }
                                if (l2tVar10 != null) {
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = l2tVar6;
                                    this.e = l2tVar9;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar3;
                                    this.t = null;
                                    this.X = null;
                                    this.Y = i2;
                                    this.Z = (byte) 5;
                                    objE4 = l2tVar10.E(this);
                                    if (objE4 != d9nVar) {
                                        l2tVar11 = l2tVar9;
                                        l2tVar12 = l2tVar6;
                                        jhmVar3 = (jhm) objE4;
                                        if (jhmVar3 != null) {
                                            list3.add(jhmVar3);
                                        } else {
                                            l2tVar9 = l2tVar11;
                                            l2tVar6 = l2tVar12;
                                            l2tVar11 = l2tVar9;
                                            l2tVar12 = l2tVar6;
                                        }
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = l2tVar11;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar3;
                                        this.t = null;
                                        this.X = null;
                                        this.Y = i2;
                                        this.Z = (byte) 6;
                                        objE5 = l2tVar12.E(this);
                                        if (objE5 != d9nVar) {
                                            igm igmVar17 = igmVar3;
                                            i3 = i2;
                                            igmVar4 = igmVar17;
                                            list3.add((jhm) objE5);
                                            this.N0 = null;
                                            this.a = null;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = null;
                                            this.f = null;
                                            this.g = list4;
                                            this.h = list3;
                                            this.i = igmVar4;
                                            this.Y = i3;
                                            this.Z = (byte) 7;
                                            objE6 = l2tVar11.E(this);
                                            if (objE6 != d9nVar) {
                                                list5 = list3;
                                                jhmVar4 = (jhm) objE6;
                                                if (jhmVar4 != null) {
                                                    list5.add(jhmVar4);
                                                }
                                                return new kjm(igmVar4, k4p1.k(list4), 4);
                                            }
                                        }
                                    }
                                } else {
                                    l2tVar11 = l2tVar9;
                                    l2tVar12 = l2tVar6;
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = l2tVar11;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar3;
                                    this.t = null;
                                    this.X = null;
                                    this.Y = i2;
                                    this.Z = (byte) 6;
                                    objE5 = l2tVar12.E(this);
                                    if (objE5 != d9nVar) {
                                        igm igmVar18 = igmVar3;
                                        i3 = i2;
                                        igmVar4 = igmVar18;
                                        list3.add((jhm) objE5);
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = null;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar4;
                                        this.Y = i3;
                                        this.Z = (byte) 7;
                                        objE6 = l2tVar11.E(this);
                                        if (objE6 != d9nVar) {
                                            list5 = list3;
                                            jhmVar4 = (jhm) objE6;
                                            if (jhmVar4 != null) {
                                                list5.add(jhmVar4);
                                            }
                                            return new kjm(igmVar4, k4p1.k(list4), 4);
                                        }
                                    }
                                }
                            }
                        } else {
                            l2tVar9 = l2tVar3;
                            l2tVar10 = l2tVar2;
                            list4 = listN;
                            p860Var = wn8Var2.d;
                            if (p860Var != null) {
                                list3.add(bo8Var3.h.h(p860Var));
                            }
                            if (l2tVar10 != null) {
                                this.N0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = l2tVar6;
                                this.e = l2tVar9;
                                this.f = null;
                                this.g = list4;
                                this.h = list3;
                                this.i = igmVar3;
                                this.t = null;
                                this.X = null;
                                this.Y = i2;
                                this.Z = (byte) 5;
                                objE4 = l2tVar10.E(this);
                                if (objE4 != d9nVar) {
                                    l2tVar11 = l2tVar9;
                                    l2tVar12 = l2tVar6;
                                    jhmVar3 = (jhm) objE4;
                                    if (jhmVar3 != null) {
                                        list3.add(jhmVar3);
                                    } else {
                                        l2tVar9 = l2tVar11;
                                        l2tVar6 = l2tVar12;
                                        l2tVar11 = l2tVar9;
                                        l2tVar12 = l2tVar6;
                                    }
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = l2tVar11;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar3;
                                    this.t = null;
                                    this.X = null;
                                    this.Y = i2;
                                    this.Z = (byte) 6;
                                    objE5 = l2tVar12.E(this);
                                    if (objE5 != d9nVar) {
                                        igm igmVar19 = igmVar3;
                                        i3 = i2;
                                        igmVar4 = igmVar19;
                                        list3.add((jhm) objE5);
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = null;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar4;
                                        this.Y = i3;
                                        this.Z = (byte) 7;
                                        objE6 = l2tVar11.E(this);
                                        if (objE6 != d9nVar) {
                                            list5 = list3;
                                            jhmVar4 = (jhm) objE6;
                                            if (jhmVar4 != null) {
                                                list5.add(jhmVar4);
                                            }
                                            return new kjm(igmVar4, k4p1.k(list4), 4);
                                        }
                                    }
                                }
                            } else {
                                l2tVar11 = l2tVar9;
                                l2tVar12 = l2tVar6;
                                this.N0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = l2tVar11;
                                this.f = null;
                                this.g = list4;
                                this.h = list3;
                                this.i = igmVar3;
                                this.t = null;
                                this.X = null;
                                this.Y = i2;
                                this.Z = (byte) 6;
                                objE5 = l2tVar12.E(this);
                                if (objE5 != d9nVar) {
                                    igm igmVar110 = igmVar3;
                                    i3 = i2;
                                    igmVar4 = igmVar110;
                                    list3.add((jhm) objE5);
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar4;
                                    this.Y = i3;
                                    this.Z = (byte) 7;
                                    objE6 = l2tVar11.E(this);
                                    if (objE6 != d9nVar) {
                                        list5 = list3;
                                        jhmVar4 = (jhm) objE6;
                                        if (jhmVar4 != null) {
                                            list5.add(jhmVar4);
                                        }
                                        return new kjm(igmVar4, k4p1.k(list4), 4);
                                    }
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 2:
                i4 = this.Y;
                igmVar2 = this.X;
                list2 = this.t;
                List list12 = (List) this.i;
                bo8Var4 = (bo8) this.h;
                wn8 wn8Var4 = (wn8) this.g;
                l2t l2tVar16 = this.f;
                l2tVar3 = this.e;
                l2t l2tVar17 = this.d;
                l2tVar2 = this.c;
                l2tVar5 = this.b;
                hm5.M(obj);
                listN = list12;
                wn8Var3 = wn8Var4;
                l2tVar7 = l2tVar16;
                d9nVar = d9nVar2;
                l2tVar6 = l2tVar17;
                objE = obj;
                jhmVar = (jhm) objE;
                if (jhmVar != null) {
                    list2.add(jhmVar);
                    bo8Var = bo8Var4;
                    l2tVar8 = l2tVar7;
                } else {
                    List list13 = list2;
                    igmVar = igmVar2;
                    l2tVarQ2 = l2tVar7;
                    wn8Var = wn8Var3;
                    i = i4;
                    list = list13;
                    bo8Var = bo8Var4;
                    l2tVar8 = l2tVarQ2;
                    igmVar2 = igmVar;
                    list2 = list;
                    i4 = i;
                    wn8Var3 = wn8Var;
                }
                bo8Var2 = bo8Var;
                this.N0 = null;
                this.a = null;
                this.b = null;
                this.c = l2tVar2;
                this.d = l2tVar6;
                this.e = l2tVar3;
                this.f = l2tVar8;
                this.g = wn8Var3;
                this.h = bo8Var2;
                this.i = listN;
                this.t = list2;
                this.X = igmVar2;
                this.Y = i4;
                this.Z = (byte) 3;
                objE2 = l2tVar5.E(this);
                if (objE2 != d9nVar) {
                    List list14 = list2;
                    igmVar3 = igmVar2;
                    i2 = i4;
                    list3 = list14;
                    wn8Var2 = wn8Var3;
                    bo8Var3 = bo8Var2;
                    list3.add((jhm) objE2);
                    if (l2tVar8 != null) {
                        this.N0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = l2tVar2;
                        this.d = l2tVar6;
                        this.e = l2tVar3;
                        this.f = null;
                        this.g = wn8Var2;
                        this.h = bo8Var3;
                        this.i = listN;
                        this.t = list3;
                        this.X = igmVar3;
                        this.Y = i2;
                        this.Z = (byte) 4;
                        objE3 = l2tVar8.E(this);
                        if (objE3 != d9nVar) {
                            l2tVar9 = l2tVar3;
                            l2tVar10 = l2tVar2;
                            jhmVar2 = (jhm) objE3;
                            if (jhmVar2 != null) {
                                list3.add(jhmVar2);
                            } else {
                                l2tVar2 = l2tVar10;
                                l2tVar3 = l2tVar9;
                                l2tVar9 = l2tVar3;
                                l2tVar10 = l2tVar2;
                            }
                            list4 = listN;
                            p860Var = wn8Var2.d;
                            if (p860Var != null) {
                                list3.add(bo8Var3.h.h(p860Var));
                            }
                            if (l2tVar10 != null) {
                                this.N0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = l2tVar6;
                                this.e = l2tVar9;
                                this.f = null;
                                this.g = list4;
                                this.h = list3;
                                this.i = igmVar3;
                                this.t = null;
                                this.X = null;
                                this.Y = i2;
                                this.Z = (byte) 5;
                                objE4 = l2tVar10.E(this);
                                if (objE4 != d9nVar) {
                                    l2tVar11 = l2tVar9;
                                    l2tVar12 = l2tVar6;
                                    jhmVar3 = (jhm) objE4;
                                    if (jhmVar3 != null) {
                                        list3.add(jhmVar3);
                                    } else {
                                        l2tVar9 = l2tVar11;
                                        l2tVar6 = l2tVar12;
                                        l2tVar11 = l2tVar9;
                                        l2tVar12 = l2tVar6;
                                    }
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = l2tVar11;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar3;
                                    this.t = null;
                                    this.X = null;
                                    this.Y = i2;
                                    this.Z = (byte) 6;
                                    objE5 = l2tVar12.E(this);
                                    if (objE5 != d9nVar) {
                                        igm igmVar111 = igmVar3;
                                        i3 = i2;
                                        igmVar4 = igmVar111;
                                        list3.add((jhm) objE5);
                                        this.N0 = null;
                                        this.a = null;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = null;
                                        this.f = null;
                                        this.g = list4;
                                        this.h = list3;
                                        this.i = igmVar4;
                                        this.Y = i3;
                                        this.Z = (byte) 7;
                                        objE6 = l2tVar11.E(this);
                                        if (objE6 != d9nVar) {
                                            list5 = list3;
                                            jhmVar4 = (jhm) objE6;
                                            if (jhmVar4 != null) {
                                                list5.add(jhmVar4);
                                            }
                                            return new kjm(igmVar4, k4p1.k(list4), 4);
                                        }
                                    }
                                }
                            } else {
                                l2tVar11 = l2tVar9;
                                l2tVar12 = l2tVar6;
                                this.N0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = l2tVar11;
                                this.f = null;
                                this.g = list4;
                                this.h = list3;
                                this.i = igmVar3;
                                this.t = null;
                                this.X = null;
                                this.Y = i2;
                                this.Z = (byte) 6;
                                objE5 = l2tVar12.E(this);
                                if (objE5 != d9nVar) {
                                    igm igmVar112 = igmVar3;
                                    i3 = i2;
                                    igmVar4 = igmVar112;
                                    list3.add((jhm) objE5);
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar4;
                                    this.Y = i3;
                                    this.Z = (byte) 7;
                                    objE6 = l2tVar11.E(this);
                                    if (objE6 != d9nVar) {
                                        list5 = list3;
                                        jhmVar4 = (jhm) objE6;
                                        if (jhmVar4 != null) {
                                            list5.add(jhmVar4);
                                        }
                                        return new kjm(igmVar4, k4p1.k(list4), 4);
                                    }
                                }
                            }
                        }
                    } else {
                        l2tVar9 = l2tVar3;
                        l2tVar10 = l2tVar2;
                        list4 = listN;
                        p860Var = wn8Var2.d;
                        if (p860Var != null) {
                            list3.add(bo8Var3.h.h(p860Var));
                        }
                        if (l2tVar10 != null) {
                            this.N0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = l2tVar6;
                            this.e = l2tVar9;
                            this.f = null;
                            this.g = list4;
                            this.h = list3;
                            this.i = igmVar3;
                            this.t = null;
                            this.X = null;
                            this.Y = i2;
                            this.Z = (byte) 5;
                            objE4 = l2tVar10.E(this);
                            if (objE4 != d9nVar) {
                                l2tVar11 = l2tVar9;
                                l2tVar12 = l2tVar6;
                                jhmVar3 = (jhm) objE4;
                                if (jhmVar3 != null) {
                                    list3.add(jhmVar3);
                                } else {
                                    l2tVar9 = l2tVar11;
                                    l2tVar6 = l2tVar12;
                                    l2tVar11 = l2tVar9;
                                    l2tVar12 = l2tVar6;
                                }
                                this.N0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = l2tVar11;
                                this.f = null;
                                this.g = list4;
                                this.h = list3;
                                this.i = igmVar3;
                                this.t = null;
                                this.X = null;
                                this.Y = i2;
                                this.Z = (byte) 6;
                                objE5 = l2tVar12.E(this);
                                if (objE5 != d9nVar) {
                                    igm igmVar113 = igmVar3;
                                    i3 = i2;
                                    igmVar4 = igmVar113;
                                    list3.add((jhm) objE5);
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar4;
                                    this.Y = i3;
                                    this.Z = (byte) 7;
                                    objE6 = l2tVar11.E(this);
                                    if (objE6 != d9nVar) {
                                        list5 = list3;
                                        jhmVar4 = (jhm) objE6;
                                        if (jhmVar4 != null) {
                                            list5.add(jhmVar4);
                                        }
                                        return new kjm(igmVar4, k4p1.k(list4), 4);
                                    }
                                }
                            }
                        } else {
                            l2tVar11 = l2tVar9;
                            l2tVar12 = l2tVar6;
                            this.N0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = l2tVar11;
                            this.f = null;
                            this.g = list4;
                            this.h = list3;
                            this.i = igmVar3;
                            this.t = null;
                            this.X = null;
                            this.Y = i2;
                            this.Z = (byte) 6;
                            objE5 = l2tVar12.E(this);
                            if (objE5 != d9nVar) {
                                igm igmVar114 = igmVar3;
                                i3 = i2;
                                igmVar4 = igmVar114;
                                list3.add((jhm) objE5);
                                this.N0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = list4;
                                this.h = list3;
                                this.i = igmVar4;
                                this.Y = i3;
                                this.Z = (byte) 7;
                                objE6 = l2tVar11.E(this);
                                if (objE6 != d9nVar) {
                                    list5 = list3;
                                    jhmVar4 = (jhm) objE6;
                                    if (jhmVar4 != null) {
                                        list5.add(jhmVar4);
                                    }
                                    return new kjm(igmVar4, k4p1.k(list4), 4);
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 3:
                i2 = this.Y;
                igmVar3 = this.X;
                list3 = this.t;
                List list15 = (List) this.i;
                bo8Var3 = (bo8) this.h;
                wn8Var2 = (wn8) this.g;
                l2tVar8 = this.f;
                l2t l2tVar18 = this.e;
                l2t l2tVar19 = this.d;
                l2t l2tVar20 = this.c;
                hm5.M(obj);
                l2tVar3 = l2tVar18;
                d9nVar = d9nVar2;
                l2tVar6 = l2tVar19;
                listN = list15;
                l2tVar2 = l2tVar20;
                objE2 = obj;
                list3.add((jhm) objE2);
                if (l2tVar8 != null) {
                    this.N0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = l2tVar2;
                    this.d = l2tVar6;
                    this.e = l2tVar3;
                    this.f = null;
                    this.g = wn8Var2;
                    this.h = bo8Var3;
                    this.i = listN;
                    this.t = list3;
                    this.X = igmVar3;
                    this.Y = i2;
                    this.Z = (byte) 4;
                    objE3 = l2tVar8.E(this);
                    if (objE3 != d9nVar) {
                        l2tVar9 = l2tVar3;
                        l2tVar10 = l2tVar2;
                        jhmVar2 = (jhm) objE3;
                        if (jhmVar2 != null) {
                            list3.add(jhmVar2);
                        } else {
                            l2tVar2 = l2tVar10;
                            l2tVar3 = l2tVar9;
                            l2tVar9 = l2tVar3;
                            l2tVar10 = l2tVar2;
                        }
                        list4 = listN;
                        p860Var = wn8Var2.d;
                        if (p860Var != null) {
                            list3.add(bo8Var3.h.h(p860Var));
                        }
                        if (l2tVar10 != null) {
                            this.N0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = l2tVar6;
                            this.e = l2tVar9;
                            this.f = null;
                            this.g = list4;
                            this.h = list3;
                            this.i = igmVar3;
                            this.t = null;
                            this.X = null;
                            this.Y = i2;
                            this.Z = (byte) 5;
                            objE4 = l2tVar10.E(this);
                            if (objE4 != d9nVar) {
                                l2tVar11 = l2tVar9;
                                l2tVar12 = l2tVar6;
                                jhmVar3 = (jhm) objE4;
                                if (jhmVar3 != null) {
                                    list3.add(jhmVar3);
                                } else {
                                    l2tVar9 = l2tVar11;
                                    l2tVar6 = l2tVar12;
                                    l2tVar11 = l2tVar9;
                                    l2tVar12 = l2tVar6;
                                }
                                this.N0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = l2tVar11;
                                this.f = null;
                                this.g = list4;
                                this.h = list3;
                                this.i = igmVar3;
                                this.t = null;
                                this.X = null;
                                this.Y = i2;
                                this.Z = (byte) 6;
                                objE5 = l2tVar12.E(this);
                                if (objE5 != d9nVar) {
                                    igm igmVar115 = igmVar3;
                                    i3 = i2;
                                    igmVar4 = igmVar115;
                                    list3.add((jhm) objE5);
                                    this.N0 = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.g = list4;
                                    this.h = list3;
                                    this.i = igmVar4;
                                    this.Y = i3;
                                    this.Z = (byte) 7;
                                    objE6 = l2tVar11.E(this);
                                    if (objE6 != d9nVar) {
                                        list5 = list3;
                                        jhmVar4 = (jhm) objE6;
                                        if (jhmVar4 != null) {
                                            list5.add(jhmVar4);
                                        }
                                        return new kjm(igmVar4, k4p1.k(list4), 4);
                                    }
                                }
                            }
                        } else {
                            l2tVar11 = l2tVar9;
                            l2tVar12 = l2tVar6;
                            this.N0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = l2tVar11;
                            this.f = null;
                            this.g = list4;
                            this.h = list3;
                            this.i = igmVar3;
                            this.t = null;
                            this.X = null;
                            this.Y = i2;
                            this.Z = (byte) 6;
                            objE5 = l2tVar12.E(this);
                            if (objE5 != d9nVar) {
                                igm igmVar116 = igmVar3;
                                i3 = i2;
                                igmVar4 = igmVar116;
                                list3.add((jhm) objE5);
                                this.N0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = list4;
                                this.h = list3;
                                this.i = igmVar4;
                                this.Y = i3;
                                this.Z = (byte) 7;
                                objE6 = l2tVar11.E(this);
                                if (objE6 != d9nVar) {
                                    list5 = list3;
                                    jhmVar4 = (jhm) objE6;
                                    if (jhmVar4 != null) {
                                        list5.add(jhmVar4);
                                    }
                                    return new kjm(igmVar4, k4p1.k(list4), 4);
                                }
                            }
                        }
                    }
                } else {
                    l2tVar9 = l2tVar3;
                    l2tVar10 = l2tVar2;
                    list4 = listN;
                    p860Var = wn8Var2.d;
                    if (p860Var != null) {
                        list3.add(bo8Var3.h.h(p860Var));
                    }
                    if (l2tVar10 != null) {
                        this.N0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = l2tVar6;
                        this.e = l2tVar9;
                        this.f = null;
                        this.g = list4;
                        this.h = list3;
                        this.i = igmVar3;
                        this.t = null;
                        this.X = null;
                        this.Y = i2;
                        this.Z = (byte) 5;
                        objE4 = l2tVar10.E(this);
                        if (objE4 != d9nVar) {
                            l2tVar11 = l2tVar9;
                            l2tVar12 = l2tVar6;
                            jhmVar3 = (jhm) objE4;
                            if (jhmVar3 != null) {
                                list3.add(jhmVar3);
                            } else {
                                l2tVar9 = l2tVar11;
                                l2tVar6 = l2tVar12;
                                l2tVar11 = l2tVar9;
                                l2tVar12 = l2tVar6;
                            }
                            this.N0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = l2tVar11;
                            this.f = null;
                            this.g = list4;
                            this.h = list3;
                            this.i = igmVar3;
                            this.t = null;
                            this.X = null;
                            this.Y = i2;
                            this.Z = (byte) 6;
                            objE5 = l2tVar12.E(this);
                            if (objE5 != d9nVar) {
                                igm igmVar117 = igmVar3;
                                i3 = i2;
                                igmVar4 = igmVar117;
                                list3.add((jhm) objE5);
                                this.N0 = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = list4;
                                this.h = list3;
                                this.i = igmVar4;
                                this.Y = i3;
                                this.Z = (byte) 7;
                                objE6 = l2tVar11.E(this);
                                if (objE6 != d9nVar) {
                                    list5 = list3;
                                    jhmVar4 = (jhm) objE6;
                                    if (jhmVar4 != null) {
                                        list5.add(jhmVar4);
                                    }
                                    return new kjm(igmVar4, k4p1.k(list4), 4);
                                }
                            }
                        }
                    } else {
                        l2tVar11 = l2tVar9;
                        l2tVar12 = l2tVar6;
                        this.N0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = l2tVar11;
                        this.f = null;
                        this.g = list4;
                        this.h = list3;
                        this.i = igmVar3;
                        this.t = null;
                        this.X = null;
                        this.Y = i2;
                        this.Z = (byte) 6;
                        objE5 = l2tVar12.E(this);
                        if (objE5 != d9nVar) {
                            igm igmVar118 = igmVar3;
                            i3 = i2;
                            igmVar4 = igmVar118;
                            list3.add((jhm) objE5);
                            this.N0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = list4;
                            this.h = list3;
                            this.i = igmVar4;
                            this.Y = i3;
                            this.Z = (byte) 7;
                            objE6 = l2tVar11.E(this);
                            if (objE6 != d9nVar) {
                                list5 = list3;
                                jhmVar4 = (jhm) objE6;
                                if (jhmVar4 != null) {
                                    list5.add(jhmVar4);
                                }
                                return new kjm(igmVar4, k4p1.k(list4), 4);
                            }
                        }
                    }
                }
                return d9nVar;
            case 4:
                i2 = this.Y;
                igmVar3 = this.X;
                list3 = this.t;
                List list16 = (List) this.i;
                bo8Var3 = (bo8) this.h;
                wn8Var2 = (wn8) this.g;
                l2tVar9 = this.e;
                l2t l2tVar21 = this.d;
                l2tVar10 = this.c;
                hm5.M(obj);
                l2tVar6 = l2tVar21;
                d9nVar = d9nVar2;
                listN = list16;
                objE3 = obj;
                jhmVar2 = (jhm) objE3;
                if (jhmVar2 != null) {
                    list3.add(jhmVar2);
                } else {
                    l2tVar2 = l2tVar10;
                    l2tVar3 = l2tVar9;
                    l2tVar9 = l2tVar3;
                    l2tVar10 = l2tVar2;
                }
                list4 = listN;
                p860Var = wn8Var2.d;
                if (p860Var != null) {
                    list3.add(bo8Var3.h.h(p860Var));
                }
                if (l2tVar10 != null) {
                    this.N0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = l2tVar6;
                    this.e = l2tVar9;
                    this.f = null;
                    this.g = list4;
                    this.h = list3;
                    this.i = igmVar3;
                    this.t = null;
                    this.X = null;
                    this.Y = i2;
                    this.Z = (byte) 5;
                    objE4 = l2tVar10.E(this);
                    if (objE4 != d9nVar) {
                        l2tVar11 = l2tVar9;
                        l2tVar12 = l2tVar6;
                        jhmVar3 = (jhm) objE4;
                        if (jhmVar3 != null) {
                            list3.add(jhmVar3);
                        } else {
                            l2tVar9 = l2tVar11;
                            l2tVar6 = l2tVar12;
                            l2tVar11 = l2tVar9;
                            l2tVar12 = l2tVar6;
                        }
                        this.N0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = l2tVar11;
                        this.f = null;
                        this.g = list4;
                        this.h = list3;
                        this.i = igmVar3;
                        this.t = null;
                        this.X = null;
                        this.Y = i2;
                        this.Z = (byte) 6;
                        objE5 = l2tVar12.E(this);
                        if (objE5 != d9nVar) {
                            igm igmVar119 = igmVar3;
                            i3 = i2;
                            igmVar4 = igmVar119;
                            list3.add((jhm) objE5);
                            this.N0 = null;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = list4;
                            this.h = list3;
                            this.i = igmVar4;
                            this.Y = i3;
                            this.Z = (byte) 7;
                            objE6 = l2tVar11.E(this);
                            if (objE6 != d9nVar) {
                                list5 = list3;
                                jhmVar4 = (jhm) objE6;
                                if (jhmVar4 != null) {
                                    list5.add(jhmVar4);
                                }
                                return new kjm(igmVar4, k4p1.k(list4), 4);
                            }
                        }
                    }
                } else {
                    l2tVar11 = l2tVar9;
                    l2tVar12 = l2tVar6;
                    this.N0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = l2tVar11;
                    this.f = null;
                    this.g = list4;
                    this.h = list3;
                    this.i = igmVar3;
                    this.t = null;
                    this.X = null;
                    this.Y = i2;
                    this.Z = (byte) 6;
                    objE5 = l2tVar12.E(this);
                    if (objE5 != d9nVar) {
                        igm igmVar1110 = igmVar3;
                        i3 = i2;
                        igmVar4 = igmVar1110;
                        list3.add((jhm) objE5);
                        this.N0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.f = null;
                        this.g = list4;
                        this.h = list3;
                        this.i = igmVar4;
                        this.Y = i3;
                        this.Z = (byte) 7;
                        objE6 = l2tVar11.E(this);
                        if (objE6 != d9nVar) {
                            list5 = list3;
                            jhmVar4 = (jhm) objE6;
                            if (jhmVar4 != null) {
                                list5.add(jhmVar4);
                            }
                            return new kjm(igmVar4, k4p1.k(list4), 4);
                        }
                    }
                }
                return d9nVar;
            case 5:
                i2 = this.Y;
                igmVar3 = (igm) this.i;
                list3 = (List) this.h;
                list4 = (List) this.g;
                l2tVar11 = this.e;
                l2tVar12 = this.d;
                hm5.M(obj);
                objE4 = obj;
                d9nVar = d9nVar2;
                jhmVar3 = (jhm) objE4;
                if (jhmVar3 != null) {
                    list3.add(jhmVar3);
                } else {
                    l2tVar9 = l2tVar11;
                    l2tVar6 = l2tVar12;
                    l2tVar11 = l2tVar9;
                    l2tVar12 = l2tVar6;
                }
                this.N0 = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = l2tVar11;
                this.f = null;
                this.g = list4;
                this.h = list3;
                this.i = igmVar3;
                this.t = null;
                this.X = null;
                this.Y = i2;
                this.Z = (byte) 6;
                objE5 = l2tVar12.E(this);
                if (objE5 != d9nVar) {
                    igm igmVar1111 = igmVar3;
                    i3 = i2;
                    igmVar4 = igmVar1111;
                    list3.add((jhm) objE5);
                    this.N0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.g = list4;
                    this.h = list3;
                    this.i = igmVar4;
                    this.Y = i3;
                    this.Z = (byte) 7;
                    objE6 = l2tVar11.E(this);
                    if (objE6 != d9nVar) {
                        list5 = list3;
                        jhmVar4 = (jhm) objE6;
                        if (jhmVar4 != null) {
                            list5.add(jhmVar4);
                        }
                        return new kjm(igmVar4, k4p1.k(list4), 4);
                    }
                }
                return d9nVar;
            case 6:
                int i5 = this.Y;
                igm igmVar20 = (igm) this.i;
                list3 = (List) this.h;
                list4 = (List) this.g;
                l2tVar11 = this.e;
                hm5.M(obj);
                i3 = i5;
                igmVar4 = igmVar20;
                objE5 = obj;
                d9nVar = d9nVar2;
                list3.add((jhm) objE5);
                this.N0 = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = list4;
                this.h = list3;
                this.i = igmVar4;
                this.Y = i3;
                this.Z = (byte) 7;
                objE6 = l2tVar11.E(this);
                if (objE6 != d9nVar) {
                    list5 = list3;
                    jhmVar4 = (jhm) objE6;
                    if (jhmVar4 != null) {
                        list5.add(jhmVar4);
                    }
                    return new kjm(igmVar4, k4p1.k(list4), 4);
                }
                return d9nVar;
            case 7:
                igmVar4 = (igm) this.i;
                list5 = (List) this.h;
                List list17 = (List) this.g;
                hm5.M(obj);
                list4 = list17;
                objE6 = obj;
                jhmVar4 = (jhm) objE6;
                if (jhmVar4 != null) {
                    list5.add(jhmVar4);
                }
                return new kjm(igmVar4, k4p1.k(list4), 4);
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
