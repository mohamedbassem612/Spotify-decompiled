package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b3s0 implements yte0 {
    public final gj5 a;
    public final mr20 b;
    public final r0s0 c;
    public final p2o0 d;
    public final s741 e;
    public final rm5 f;
    public final cj3 g;
    public final oi h;
    public final p68 i;
    public final d3s0 j;
    public final q8n k;
    public final q8n l;
    public llm m;

    public b3s0(gj5 gj5Var, mr20 mr20Var, r0s0 r0s0Var, p2o0 p2o0Var, s741 s741Var, rm5 rm5Var, cj3 cj3Var, oi oiVar, p68 p68Var, d3s0 d3s0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = gj5Var;
        this.b = mr20Var;
        this.c = r0s0Var;
        this.d = p2o0Var;
        this.e = s741Var;
        this.f = rm5Var;
        this.g = cj3Var;
        this.h = oiVar;
        this.i = p68Var;
        this.j = d3s0Var;
        this.k = q8nVar;
        this.l = q8nVar2;
    }

    @Override // p.yte0
    public final void a() {
        llm llmVar = this.m;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        this.m = null;
    }

    @Override // p.yte0
    public final void b() {
        llm llmVar = this.m;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        llm llmVarE = smo1.e(ha71.A(guo1.B(), this.l));
        this.m = llmVarE;
        c921.y(llmVarE, (o8n) null, 0, new i2p0(this, (lnm) null, (byte) 17), 3);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008e A[PHI: r11
      0x008e: PHI (r11v11 java.lang.Object) = (r11v10 java.lang.Object), (r11v1 java.lang.Object) binds: [B:24:0x008a, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3 A[PHI: r11
      0x00a3: PHI (r11v17 java.lang.Object) = (r11v16 java.lang.Object), (r11v1 java.lang.Object) binds: [B:30:0x00a0, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4 A[PHI: r11
      0x00d4: PHI (r11v24 java.lang.Object) = (r11v22 java.lang.Object), (r11v1 java.lang.Object) binds: [B:41:0x00d1, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        a3s0 a3s0Var;
        Object objH;
        Object objH2;
        if (onmVar instanceof a3s0) {
            a3s0Var = (a3s0) onmVar;
            int i = a3s0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a3s0Var.c = i - Integer.MIN_VALUE;
            } else {
                a3s0Var = new a3s0(this, onmVar);
            }
        } else {
            a3s0Var = new a3s0(this, onmVar);
        }
        Object objJ = a3s0Var.a;
        int i2 = a3s0Var.c;
        q8n q8nVar = this.k;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (i2) {
            case 0:
                hm5.M(objJ);
                zio0 zio0Var = new zio0((byte) 5);
                a3s0Var.c = 1;
                objJ = b5p1.j(this.b, zio0Var, a3s0Var);
                if (objJ != d9nVar) {
                    String str = ((th61) objJ).a;
                    s741 s741Var = this.e;
                    s741Var.c = spq0.d(s741Var.a.b(s741Var.b, str));
                    cj3 cj3Var = this.g;
                    cj3Var.c = cj3Var.a.b(cj3Var.b, str);
                    Single singleO = this.c.o();
                    a3s0Var.c = 2;
                    objJ = fc11.j(singleO, a3s0Var);
                    if (objJ != d9nVar) {
                        if (((Boolean) objJ).booleanValue()) {
                            a3s0Var.c = 3;
                            objJ = this.i.i(a3s0Var);
                            if (objJ != d9nVar) {
                                if (((Boolean) objJ).booleanValue()) {
                                    oxa0 oxa0Var = new oxa0(this, (lnm) null, (byte) 27);
                                    a3s0Var.c = 4;
                                    objH = c921.H(q8nVar, new cto0(this, oxa0Var, (lnm) null, (byte) 23), a3s0Var);
                                    if (objH != d9nVar) {
                                        objH = rih1Var;
                                    }
                                    if (objH != d9nVar) {
                                    }
                                } else {
                                    Single singleW = this.d.W();
                                    a3s0Var.c = 5;
                                    objJ = fc11.j(singleW, a3s0Var);
                                    if (objJ != d9nVar) {
                                        if (((Boolean) objJ).booleanValue()) {
                                            ro8 ro8Var = new ro8(this, (lnm) null, (byte) 18);
                                            a3s0Var.c = 6;
                                            objH2 = c921.H(q8nVar, new cto0(this, ro8Var, (lnm) null, (byte) 23), a3s0Var);
                                            if (objH2 != d9nVar) {
                                                objH2 = rih1Var;
                                            }
                                            if (objH2 == d9nVar) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 1:
                hm5.M(objJ);
                String str2 = ((th61) objJ).a;
                s741 s741Var2 = this.e;
                s741Var2.c = spq0.d(s741Var2.a.b(s741Var2.b, str2));
                cj3 cj3Var2 = this.g;
                cj3Var2.c = cj3Var2.a.b(cj3Var2.b, str2);
                Single singleO2 = this.c.o();
                a3s0Var.c = 2;
                objJ = fc11.j(singleO2, a3s0Var);
                if (objJ != d9nVar) {
                    if (((Boolean) objJ).booleanValue()) {
                        a3s0Var.c = 3;
                        objJ = this.i.i(a3s0Var);
                        if (objJ != d9nVar) {
                            if (((Boolean) objJ).booleanValue()) {
                                oxa0 oxa0Var2 = new oxa0(this, (lnm) null, (byte) 27);
                                a3s0Var.c = 4;
                                objH = c921.H(q8nVar, new cto0(this, oxa0Var2, (lnm) null, (byte) 23), a3s0Var);
                                if (objH != d9nVar) {
                                    objH = rih1Var;
                                }
                                if (objH != d9nVar) {
                                }
                            } else {
                                Single singleW2 = this.d.W();
                                a3s0Var.c = 5;
                                objJ = fc11.j(singleW2, a3s0Var);
                                if (objJ != d9nVar) {
                                    if (((Boolean) objJ).booleanValue()) {
                                        ro8 ro8Var2 = new ro8(this, (lnm) null, (byte) 18);
                                        a3s0Var.c = 6;
                                        objH2 = c921.H(q8nVar, new cto0(this, ro8Var2, (lnm) null, (byte) 23), a3s0Var);
                                        if (objH2 != d9nVar) {
                                            objH2 = rih1Var;
                                        }
                                        if (objH2 == d9nVar) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return rih1Var;
                }
                return d9nVar;
            case 2:
                hm5.M(objJ);
                if (((Boolean) objJ).booleanValue()) {
                    a3s0Var.c = 3;
                    objJ = this.i.i(a3s0Var);
                    if (objJ != d9nVar) {
                        if (((Boolean) objJ).booleanValue()) {
                            oxa0 oxa0Var3 = new oxa0(this, (lnm) null, (byte) 27);
                            a3s0Var.c = 4;
                            objH = c921.H(q8nVar, new cto0(this, oxa0Var3, (lnm) null, (byte) 23), a3s0Var);
                            if (objH != d9nVar) {
                                objH = rih1Var;
                            }
                            if (objH != d9nVar) {
                            }
                        } else {
                            Single singleW3 = this.d.W();
                            a3s0Var.c = 5;
                            objJ = fc11.j(singleW3, a3s0Var);
                            if (objJ != d9nVar) {
                                if (((Boolean) objJ).booleanValue()) {
                                    ro8 ro8Var3 = new ro8(this, (lnm) null, (byte) 18);
                                    a3s0Var.c = 6;
                                    objH2 = c921.H(q8nVar, new cto0(this, ro8Var3, (lnm) null, (byte) 23), a3s0Var);
                                    if (objH2 != d9nVar) {
                                        objH2 = rih1Var;
                                    }
                                    if (objH2 == d9nVar) {
                                    }
                                }
                            }
                        }
                    }
                    return d9nVar;
                }
                return rih1Var;
            case 3:
                hm5.M(objJ);
                if (((Boolean) objJ).booleanValue()) {
                    oxa0 oxa0Var4 = new oxa0(this, (lnm) null, (byte) 27);
                    a3s0Var.c = 4;
                    objH = c921.H(q8nVar, new cto0(this, oxa0Var4, (lnm) null, (byte) 23), a3s0Var);
                    if (objH != d9nVar) {
                        objH = rih1Var;
                    }
                    if (objH != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    Single singleW4 = this.d.W();
                    a3s0Var.c = 5;
                    objJ = fc11.j(singleW4, a3s0Var);
                    if (objJ != d9nVar) {
                        if (((Boolean) objJ).booleanValue()) {
                            ro8 ro8Var4 = new ro8(this, (lnm) null, (byte) 18);
                            a3s0Var.c = 6;
                            objH2 = c921.H(q8nVar, new cto0(this, ro8Var4, (lnm) null, (byte) 23), a3s0Var);
                            if (objH2 != d9nVar) {
                                objH2 = rih1Var;
                            }
                            if (objH2 == d9nVar) {
                            }
                        }
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 4:
                hm5.M(objJ);
                return rih1Var;
            case 5:
                hm5.M(objJ);
                if (((Boolean) objJ).booleanValue()) {
                    ro8 ro8Var5 = new ro8(this, (lnm) null, (byte) 18);
                    a3s0Var.c = 6;
                    objH2 = c921.H(q8nVar, new cto0(this, ro8Var5, (lnm) null, (byte) 23), a3s0Var);
                    if (objH2 != d9nVar) {
                        objH2 = rih1Var;
                    }
                    if (objH2 == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 6:
                hm5.M(objJ);
                return rih1Var;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
