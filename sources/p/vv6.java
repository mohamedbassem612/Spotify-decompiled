package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vv6 implements yzc0 {
    public final xe01 a;
    public final q8n b;
    public final xg6 c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final jge e;
    public final jge f;

    public vv6(xe01 xe01Var, q8n q8nVar, xg6 xg6Var) {
        this.a = xe01Var;
        this.b = q8nVar;
        this.c = xg6Var;
        mr20 mr20VarR = o4p1.r(new c64(xe01Var, this, (byte) 12), q8nVar);
        this.e = hu20.e(mr20VarR, new i64(3, (lnm) null, (byte) 1));
        this.f = hu20.e(mr20VarR, new i64(3, (lnm) null, (byte) 2));
    }

    public final mr20 a() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(tv80 tv80Var, yjp1 yjp1Var, onm onmVar) {
        uv6 uv6Var;
        if (onmVar instanceof uv6) {
            uv6Var = (uv6) onmVar;
            int i = uv6Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                uv6Var.e = i - Integer.MIN_VALUE;
            } else {
                uv6Var = new uv6(this, onmVar);
            }
        } else {
            uv6Var = new uv6(this, onmVar);
        }
        Object objM = uv6Var.c;
        int i2 = uv6Var.e;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objM);
            uv6Var.a = tv80Var;
            uv6Var.b = yjp1Var;
            uv6Var.e = 1;
            objM = m(uv6Var);
            if (objM != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objM);
                return objM;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yjp1Var = uv6Var.b;
        tv80Var = uv6Var.a;
        hm5.M(objM);
        uv6Var.a = null;
        uv6Var.b = null;
        uv6Var.e = 2;
        Object objB = ((yzc0) objM).b(tv80Var, yjp1Var, uv6Var);
        return objB == obj ? obj : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        tv6 tv6Var;
        if (onmVar instanceof tv6) {
            tv6Var = (tv6) onmVar;
            int i = tv6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tv6Var.d = i - Integer.MIN_VALUE;
            } else {
                tv6Var = new tv6(this, onmVar);
            }
        } else {
            tv6Var = new tv6(this, onmVar);
        }
        Object objM = tv6Var.b;
        int i2 = tv6Var.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objM);
            tv6Var.a = str;
            tv6Var.d = 1;
            objM = m(tv6Var);
            if (objM != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objM);
                return objM;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = tv6Var.a;
        hm5.M(objM);
        tv6Var.a = null;
        tv6Var.d = 2;
        Object objC = ((yzc0) objM).c(str, tv6Var);
        return objC == obj ? obj : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (((p.yzc0) r9).d(r7, r8, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(p.wzc0 r7, java.lang.String r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.nv6
            if (r0 == 0) goto L13
            r0 = r9
            p.nv6 r0 = (p.nv6) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.nv6 r0 = new p.nv6
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r9)
            goto L58
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            java.lang.String r8 = r0.b
            p.wzc0 r7 = r0.a
            p.hm5.M(r9)
            goto L49
        L39:
            p.hm5.M(r9)
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r9 = r6.m(r0)
            if (r9 != r5) goto L49
            goto L57
        L49:
            p.yzc0 r9 = (p.yzc0) r9
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r9.d(r7, r8, r0)
            if (r6 != r5) goto L58
        L57:
            return r5
        L58:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vv6.d(p.wzc0, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) {
        pv6 pv6Var;
        if (onmVar instanceof pv6) {
            pv6Var = (pv6) onmVar;
            int i = pv6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pv6Var.d = i - Integer.MIN_VALUE;
            } else {
                pv6Var = new pv6(this, onmVar);
            }
        } else {
            pv6Var = new pv6(this, onmVar);
        }
        Object objM = pv6Var.b;
        int i2 = pv6Var.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objM);
            pv6Var.a = str;
            pv6Var.d = 1;
            objM = m(pv6Var);
            if (objM != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objM);
                return objM;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = pv6Var.a;
        hm5.M(objM);
        pv6Var.a = null;
        pv6Var.d = 2;
        Object objE = ((yzc0) objM).e(str, pv6Var);
        return objE == obj ? obj : objE;
    }

    public final trc0 f() {
        return n((String) this.a.a.getValue()).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, onm onmVar) {
        lv6 lv6Var;
        if (onmVar instanceof lv6) {
            lv6Var = (lv6) onmVar;
            int i = lv6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lv6Var.d = i - Integer.MIN_VALUE;
            } else {
                lv6Var = new lv6(this, onmVar);
            }
        } else {
            lv6Var = new lv6(this, onmVar);
        }
        Object objM = lv6Var.b;
        int i2 = lv6Var.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objM);
            lv6Var.a = str;
            lv6Var.d = 1;
            objM = m(lv6Var);
            if (objM != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objM);
                return objM;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = lv6Var.a;
        hm5.M(objM);
        lv6Var.a = null;
        lv6Var.d = 2;
        Object objG = ((yzc0) objM).g(str, lv6Var);
        return objG == obj ? obj : objG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (((p.yzc0) r10).h(r7, r8, r9, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(p.wzc0 r7, p.tv80 r8, p.yjp1 r9, p.onm r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof p.ov6
            if (r0 == 0) goto L13
            r0 = r10
            p.ov6 r0 = (p.ov6) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.ov6 r0 = new p.ov6
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.yjp1 r9 = r0.c
            p.tv80 r8 = r0.b
            p.wzc0 r7 = r0.a
            p.hm5.M(r10)
            goto L4d
        L3b:
            p.hm5.M(r10)
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.f = r3
            java.lang.Object r10 = r6.m(r0)
            if (r10 != r5) goto L4d
            goto L5d
        L4d:
            p.yzc0 r10 = (p.yzc0) r10
            r0.a = r4
            r0.b = r4
            r0.c = r4
            r0.f = r2
            java.lang.Object r6 = r10.h(r7, r8, r9, r0)
            if (r6 != r5) goto L5e
        L5d:
            return r5
        L5e:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vv6.h(p.wzc0, p.tv80, p.yjp1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(tv80 tv80Var, onm onmVar) {
        mv6 mv6Var;
        if (onmVar instanceof mv6) {
            mv6Var = (mv6) onmVar;
            int i = mv6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mv6Var.d = i - Integer.MIN_VALUE;
            } else {
                mv6Var = new mv6(this, onmVar);
            }
        } else {
            mv6Var = new mv6(this, onmVar);
        }
        Object objM = mv6Var.b;
        int i2 = mv6Var.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objM);
            mv6Var.a = tv80Var;
            mv6Var.d = 1;
            objM = m(mv6Var);
            if (objM != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objM);
                return objM;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tv80Var = mv6Var.a;
        hm5.M(objM);
        mv6Var.a = null;
        mv6Var.d = 2;
        Object objI = ((yzc0) objM).i(tv80Var, mv6Var);
        return objI == obj ? obj : objI;
    }

    public final mr20 j() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(tv80 tv80Var, onm onmVar) {
        qv6 qv6Var;
        if (onmVar instanceof qv6) {
            qv6Var = (qv6) onmVar;
            int i = qv6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qv6Var.d = i - Integer.MIN_VALUE;
            } else {
                qv6Var = new qv6(this, onmVar);
            }
        } else {
            qv6Var = new qv6(this, onmVar);
        }
        Object objM = qv6Var.b;
        int i2 = qv6Var.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objM);
            qv6Var.a = tv80Var;
            qv6Var.d = 1;
            objM = m(qv6Var);
            if (objM != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objM);
                return objM;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tv80Var = qv6Var.a;
        hm5.M(objM);
        qv6Var.a = null;
        qv6Var.d = 2;
        Object objK = ((yzc0) objM).k(tv80Var, qv6Var);
        return objK == obj ? obj : objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (((p.yzc0) r9).l(r7, r8, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r7, p.tv80 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.rv6
            if (r0 == 0) goto L13
            r0 = r9
            p.rv6 r0 = (p.rv6) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.rv6 r0 = new p.rv6
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r9)
            goto L58
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            p.tv80 r8 = r0.b
            java.lang.String r7 = r0.a
            p.hm5.M(r9)
            goto L49
        L39:
            p.hm5.M(r9)
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r9 = r6.m(r0)
            if (r9 != r5) goto L49
            goto L57
        L49:
            p.yzc0 r9 = (p.yzc0) r9
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r9.l(r7, r8, r0)
            if (r6 != r5) goto L58
        L57:
            return r5
        L58:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vv6.l(java.lang.String, p.tv80, p.onm):java.lang.Object");
    }

    public final Object m(onm onmVar) {
        return fn31.Y(this.b, new kk(this, (lnm) null, (byte) 16), onmVar);
    }

    public final yzc0 n(String str) {
        LinkedHashMap linkedHashMap = this.d;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = (yzc0) this.c.invoke(str);
            linkedHashMap.put(str, obj);
        }
        return (yzc0) obj;
    }
}
