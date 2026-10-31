package p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ql6 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ tqw c;
    public /* synthetic */ Object d;
    public Object e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql6(iu30 iu30Var, Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.d = iu30Var;
        this.h = obj;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.h;
        switch (b) {
            case 0:
                ql6 ql6Var = new ql6((iu30) this.d, (yu3) obj6, (lnm) obj5, (byte) 0);
                ql6Var.e = (ol6) obj;
                ql6Var.f = (pl6) obj2;
                ql6Var.g = (nl6) obj3;
                ql6Var.c = (tqw) obj4;
                return ql6Var.invokeSuspend(rih1Var);
            case 1:
                ql6 ql6Var2 = new ql6((iu30) this.d, (ccc0) obj6, (lnm) obj5, (byte) 1);
                ql6Var2.e = (jx6) obj;
                ql6Var2.f = (lx6) obj2;
                ql6Var2.g = (dx6) obj3;
                ql6Var2.c = (tqw) obj4;
                return ql6Var2.invokeSuspend(rih1Var);
            case 2:
                ql6 ql6Var3 = new ql6((iu30) this.d, (ix7) obj6, (lnm) obj5, (byte) 2);
                ql6Var3.e = (pn8) obj;
                ql6Var3.f = (qn8) obj2;
                ql6Var3.g = (on8) obj3;
                ql6Var3.c = (tqw) obj4;
                return ql6Var3.invokeSuspend(rih1Var);
            default:
                ql6 ql6Var4 = new ql6((ezg0) obj6, (lnm) obj5);
                ql6Var4.g = (uyg0) obj2;
                ql6Var4.d = (syg0) obj3;
                ql6Var4.c = (tqw) obj4;
                return ql6Var4.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:18:0x0059, B:21:0x0061, B:73:0x0125, B:75:0x0129, B:24:0x006c, B:64:0x00f4, B:67:0x00fc, B:69:0x0118, B:70:0x011b, B:27:0x0078, B:51:0x00c5, B:53:0x00cb, B:55:0x00d1, B:57:0x00d5, B:60:0x00db, B:39:0x009b, B:42:0x00a3, B:44:0x00a7, B:46:0x00ab, B:48:0x00b1, B:61:0x00df), top: B:259:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:18:0x0059, B:21:0x0061, B:73:0x0125, B:75:0x0129, B:24:0x006c, B:64:0x00f4, B:67:0x00fc, B:69:0x0118, B:70:0x011b, B:27:0x0078, B:51:0x00c5, B:53:0x00cb, B:55:0x00d1, B:57:0x00d5, B:60:0x00db, B:39:0x009b, B:42:0x00a3, B:44:0x00a7, B:46:0x00ab, B:48:0x00b1, B:61:0x00df), top: B:259:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0118 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:18:0x0059, B:21:0x0061, B:73:0x0125, B:75:0x0129, B:24:0x006c, B:64:0x00f4, B:67:0x00fc, B:69:0x0118, B:70:0x011b, B:27:0x0078, B:51:0x00c5, B:53:0x00cb, B:55:0x00d1, B:57:0x00d5, B:60:0x00db, B:39:0x009b, B:42:0x00a3, B:44:0x00a7, B:46:0x00ab, B:48:0x00b1, B:61:0x00df), top: B:259:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128  */
    /* JADX WARN: Code duplicated, block: B:96:0x017f A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #0 {all -> 0x0049, blocks: (B:11:0x0044, B:16:0x0052, B:94:0x017b, B:96:0x017f, B:87:0x015a, B:89:0x0162, B:91:0x0166), top: B:259:0x0029 }] */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objC;
        Object objI;
        Object objC2;
        Object objI2;
        Object objC3;
        Object objI3;
        gzg0 gzg0Var;
        Object objA;
        ou80 ou80Var;
        tv80 tv80VarY;
        Object objA2;
        Object objA3;
        ou80 ou80Var2;
        noe noeVar;
        tv80 tv80VarA;
        String str2;
        ou80 ou80Var3;
        String str3;
        fq2 fq2Var;
        Object objL;
        zyg0 zyg0Var;
        yyg0 yyg0Var;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.h;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                yu3 yu3Var = (yu3) obj2;
                iu30 iu30Var = (iu30) this.d;
                ol6 ol6Var = (ol6) this.e;
                pl6 pl6Var = (pl6) this.f;
                nl6 nl6Var = (nl6) this.g;
                tqw tqwVar = this.c;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    if (nl6Var instanceof ml6) {
                        iu30Var.invoke(new v051(new z951(ol6Var.a, 3, pl6Var.j, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, ol6Var.d, (String) null, false, 0, false, false, false, 259568), tqwVar != null ? n3o1.y(tqwVar) : null, ((ml6) nl6Var).a));
                    } else if (u890.j(nl6Var, ll6.a)) {
                        ubc0 ubc0Var = tqwVar != null ? new ubc0(n3o1.y(tqwVar)) : null;
                        boolean z = pl6Var.i;
                        ccc0 ccc0Var = (ccc0) yu3Var.d;
                        if (z) {
                            String str4 = ol6Var.a;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.c = null;
                            this.b = (byte) 1;
                            objI = ccc0.i(ccc0Var, str4, true, ubc0Var, this);
                            if (objI == d9nVar) {
                                return d9nVar;
                            }
                            ((Boolean) objI).getClass();
                        } else {
                            String str5 = ol6Var.a;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.c = null;
                            this.b = (byte) 2;
                            objC = ccc0.c(ccc0Var, str5, true, ubc0Var, this);
                            if (objC == d9nVar) {
                                return d9nVar;
                            }
                            ((Boolean) objC).getClass();
                        }
                    } else if (u890.j(nl6Var, jl6.a)) {
                        hl6 hl6Var = pl6Var.m;
                        if (hl6Var != null) {
                            iu30Var.invoke(new lz41(hl6Var.a));
                        }
                    } else {
                        if (!u890.j(nl6Var, kl6.a)) {
                            eg.o();
                            return null;
                        }
                        hl6 hl6Var2 = pl6Var.m;
                        if (hl6Var2 != null && (str = hl6Var2.a) != null) {
                            boolean z2 = pl6Var.n;
                            sd41 sd41Var = (sd41) yu3Var.e;
                            if (z2) {
                                Completable completableA = sd41.a(sd41Var, str, (tv80) null, 6);
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.c = null;
                                this.b = (byte) 3;
                                if (fc11.i(completableA, this) == d9nVar) {
                                    return d9nVar;
                                }
                            } else {
                                Completable completableB = sd41.b(sd41Var, str, (tv80) null, 6);
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.c = null;
                                this.b = (byte) 4;
                                if (fc11.i(completableB, this) == d9nVar) {
                                    return d9nVar;
                                }
                            }
                        }
                    }
                } else if (b2 == 1) {
                    hm5.M(obj);
                    objI = obj;
                    ((Boolean) objI).getClass();
                } else if (b2 == 2) {
                    hm5.M(obj);
                    objC = obj;
                    ((Boolean) objC).getClass();
                } else {
                    if (b2 != 3 && b2 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 1:
                jx6 jx6Var = (jx6) this.e;
                lx6 lx6Var = (lx6) this.f;
                dx6 dx6Var = (dx6) this.g;
                tqw tqwVar2 = this.c;
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    if (dx6Var instanceof zw6) {
                        ((iu30) this.d).invoke(new v051(new z951(jx6Var.a, 3, lx6Var.g, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, jx6Var.d, (String) null, false, 0, false, false, false, 259568), tqwVar2 != null ? n3o1.y(tqwVar2) : null, ((zw6) dx6Var).a));
                    } else {
                        if (!u890.j(dx6Var, xw6.a)) {
                            eg.o();
                            return null;
                        }
                        ubc0 ubc0Var2 = tqwVar2 != null ? new ubc0(n3o1.y(tqwVar2)) : null;
                        ccc0 ccc0Var2 = (ccc0) obj2;
                        if (lx6Var.h) {
                            String str6 = jx6Var.a;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.c = null;
                            this.b = (byte) 1;
                            objI2 = ccc0.i(ccc0Var2, str6, true, ubc0Var2, this);
                            if (objI2 == d9nVar) {
                                return d9nVar;
                            }
                            ((Boolean) objI2).getClass();
                        } else {
                            String str7 = jx6Var.a;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.c = null;
                            this.b = (byte) 2;
                            objC2 = ccc0.c(ccc0Var2, str7, true, ubc0Var2, this);
                            if (objC2 == d9nVar) {
                                return d9nVar;
                            }
                            ((Boolean) objC2).getClass();
                        }
                    }
                } else if (b3 == 1) {
                    hm5.M(obj);
                    objI2 = obj;
                    ((Boolean) objI2).getClass();
                } else {
                    if (b3 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC2 = obj;
                    ((Boolean) objC2).getClass();
                }
                return rih1Var;
            case 2:
                pn8 pn8Var = (pn8) this.e;
                qn8 qn8Var = (qn8) this.f;
                on8 on8Var = (on8) this.g;
                tqw tqwVar3 = this.c;
                byte b4 = this.b;
                if (b4 == 0) {
                    hm5.M(obj);
                    if (on8Var instanceof nn8) {
                        ((iu30) this.d).invoke(new v051(new z951(pn8Var.a, 3, qn8Var.g, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, pn8Var.d, (String) null, false, 0, false, false, false, 259568), tqwVar3 != null ? n3o1.y(tqwVar3) : null, ((nn8) on8Var).a));
                    } else {
                        if (!u890.j(on8Var, mn8.a)) {
                            eg.o();
                            return null;
                        }
                        ubc0 ubc0Var3 = tqwVar3 != null ? new ubc0(n3o1.y(tqwVar3)) : null;
                        boolean z3 = qn8Var.f;
                        ccc0 ccc0Var3 = (ccc0) ((ix7) obj2).d;
                        if (z3) {
                            String str8 = pn8Var.a;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.c = null;
                            this.b = (byte) 1;
                            objI3 = ccc0.i(ccc0Var3, str8, true, ubc0Var3, this);
                            if (objI3 == d9nVar) {
                                return d9nVar;
                            }
                            ((Boolean) objI3).getClass();
                        } else {
                            String str9 = pn8Var.a;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.c = null;
                            this.b = (byte) 2;
                            objC3 = ccc0.c(ccc0Var3, str9, true, ubc0Var3, this);
                            if (objC3 == d9nVar) {
                                return d9nVar;
                            }
                            ((Boolean) objC3).getClass();
                        }
                    }
                } else if (b4 == 1) {
                    hm5.M(obj);
                    objI3 = obj;
                    ((Boolean) objI3).getClass();
                } else {
                    if (b4 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC3 = obj;
                    ((Boolean) objC3).getClass();
                }
                return rih1Var;
            default:
                ezg0 ezg0Var = (ezg0) obj2;
                bbc bbcVar = ezg0Var.Z;
                fq2 fq2Var2 = ezg0Var.i;
                joe joeVar = ezg0Var.a;
                xgn0 xgn0Var = ezg0Var.N0;
                uyg0 uyg0Var = (uyg0) this.g;
                syg0 syg0Var = (syg0) this.d;
                tqw tqwVar4 = this.c;
                try {
                    try {
                        switch (this.b) {
                            case 0:
                                hm5.M(obj);
                                o3r o3rVar = ezg0.S0;
                                gzg0Var = uyg0Var.e;
                                if (!ezg0Var.h()) {
                                    gzg0Var = null;
                                }
                                if (syg0Var instanceof pyg0) {
                                    if (xgn0Var.g()) {
                                        tv80VarY = tqwVar4 != null ? n3o1.y(tqwVar4) : null;
                                        String str10 = (tv80VarY == null || (ou80Var2 = tv80VarY.a) == null) ? null : ou80Var2.a;
                                        if (ezg0Var.h()) {
                                            this.g = null;
                                            this.d = null;
                                            this.c = null;
                                            this.e = gzg0Var;
                                            this.f = null;
                                            this.b = (byte) 2;
                                            objA2 = joeVar.a(str10, this);
                                            if (objA2 == d9nVar) {
                                                return d9nVar;
                                            }
                                            if (!(((noe) objA2) instanceof loe)) {
                                                if (gzg0Var == null) {
                                                    this.g = null;
                                                    this.d = null;
                                                    this.c = null;
                                                    this.e = null;
                                                    this.f = null;
                                                    this.b = (byte) 3;
                                                    fq2Var = fq2Var2;
                                                    if (fq2Var.s.a.getValue() instanceof hre) {
                                                        fq2Var.i();
                                                    }
                                                    objL = fq2Var2.L("spotify:internal:npv-mini-chat", this);
                                                    if (objL == d9nVar) {
                                                        return d9nVar;
                                                    }
                                                    str3 = (String) objL;
                                                } else {
                                                    str3 = null;
                                                }
                                                zyg0Var = new zyg0(str3);
                                                this.g = null;
                                                this.d = null;
                                                this.c = null;
                                                this.e = null;
                                                this.f = null;
                                                this.b = (byte) 4;
                                                if (bbcVar.b(zyg0Var, this) == d9nVar) {
                                                    return d9nVar;
                                                }
                                            }
                                            xgn0Var.c((Object) null);
                                        } else {
                                            this.g = null;
                                            this.d = null;
                                            this.c = null;
                                            this.e = null;
                                            this.f = tv80VarY;
                                            this.b = (byte) 1;
                                            objA3 = joeVar.a(str10, this);
                                            if (objA3 == d9nVar) {
                                                return d9nVar;
                                            }
                                            noeVar = (noe) objA3;
                                            if (!(noeVar instanceof loe)) {
                                                tv80VarA = noeVar.a(tv80VarY);
                                                if (tv80VarA != null || (ou80Var3 = tv80VarA.a) == null) {
                                                    str2 = null;
                                                } else {
                                                    str2 = ou80Var3.a;
                                                }
                                                ezg0.g(ezg0Var, str2, (String) null, 6);
                                            }
                                            xgn0Var.c((Object) null);
                                        }
                                    }
                                } else if (syg0Var instanceof qyg0) {
                                    if (xgn0Var.g()) {
                                        String str11 = (tqwVar4 == null || (ou80Var = n3o1.y(tqwVar4).a) == null) ? null : ou80Var.a;
                                        this.g = null;
                                        this.d = null;
                                        this.c = null;
                                        this.e = null;
                                        this.f = null;
                                        this.b = (byte) 5;
                                        objA = joeVar.a(str11, this);
                                        if (objA == d9nVar) {
                                            return d9nVar;
                                        }
                                        if (!(objA instanceof loe)) {
                                            yyg0Var = yyg0.a;
                                            this.g = null;
                                            this.d = null;
                                            this.c = null;
                                            this.e = null;
                                            this.f = null;
                                            this.b = (byte) 6;
                                            if (bbcVar.b(yyg0Var, this) == d9nVar) {
                                                return d9nVar;
                                            }
                                        }
                                        xgn0Var.c((Object) null);
                                    }
                                } else {
                                    if (!(syg0Var instanceof ryg0)) {
                                        eg.o();
                                        return null;
                                    }
                                    lpk1 lpk1Var = ((ryg0) syg0Var).a;
                                    String string = ihc1.e1(lpk1Var.a).toString();
                                    if (!ihc1.y0(string)) {
                                        if (gzg0Var != null || ezg0Var.h()) {
                                            gp21 gp21Var = new gp21(456, gzg0Var != null ? "genpods_prompt_chat" : "npv_martini_chat", gzg0Var != null ? gzg0Var.b : null, gzg0Var != null ? gzg0Var.b : "spotify:internal:npv-mini-chat", (String) null, (String) null, gzg0Var != null ? rq2.i : rq2.e, (tv80) null, new uya1(ezg0Var.c.x() && lpk1Var.b, false), false);
                                            this.g = null;
                                            this.d = null;
                                            this.c = null;
                                            this.e = null;
                                            this.f = null;
                                            this.b = (byte) 7;
                                            if (fq2Var2.z(string, gp21Var, this) == d9nVar) {
                                                return d9nVar;
                                            }
                                        } else {
                                            ezg0.g(ezg0Var, (String) null, string, 1);
                                        }
                                    }
                                }
                                return rih1Var;
                            case 1:
                                tv80 tv80Var = (tv80) this.f;
                                hm5.M(obj);
                                tv80VarY = tv80Var;
                                objA3 = obj;
                                noeVar = (noe) objA3;
                                if (!(noeVar instanceof loe)) {
                                    tv80VarA = noeVar.a(tv80VarY);
                                    if (tv80VarA != null) {
                                        str2 = null;
                                    } else {
                                        str2 = null;
                                    }
                                    ezg0.g(ezg0Var, str2, (String) null, 6);
                                }
                                xgn0Var.c((Object) null);
                                return rih1Var;
                            case 2:
                                gzg0 gzg0Var2 = (gzg0) this.e;
                                hm5.M(obj);
                                gzg0Var = gzg0Var2;
                                objA2 = obj;
                                if (!(((noe) objA2) instanceof loe)) {
                                    if (gzg0Var == null) {
                                        this.g = null;
                                        this.d = null;
                                        this.c = null;
                                        this.e = null;
                                        this.f = null;
                                        this.b = (byte) 3;
                                        fq2Var = fq2Var2;
                                        if (fq2Var.s.a.getValue() instanceof hre) {
                                            fq2Var.i();
                                        }
                                        objL = fq2Var2.L("spotify:internal:npv-mini-chat", this);
                                        if (objL == d9nVar) {
                                            return d9nVar;
                                        }
                                        str3 = (String) objL;
                                    } else {
                                        str3 = null;
                                    }
                                    zyg0Var = new zyg0(str3);
                                    this.g = null;
                                    this.d = null;
                                    this.c = null;
                                    this.e = null;
                                    this.f = null;
                                    this.b = (byte) 4;
                                    if (bbcVar.b(zyg0Var, this) == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                                xgn0Var.c((Object) null);
                                return rih1Var;
                            case 3:
                                hm5.M(obj);
                                objL = obj;
                                str3 = (String) objL;
                                zyg0Var = new zyg0(str3);
                                this.g = null;
                                this.d = null;
                                this.c = null;
                                this.e = null;
                                this.f = null;
                                this.b = (byte) 4;
                                if (bbcVar.b(zyg0Var, this) == d9nVar) {
                                    return d9nVar;
                                }
                                xgn0Var.c((Object) null);
                                return rih1Var;
                            case 4:
                                hm5.M(obj);
                                xgn0Var.c((Object) null);
                                return rih1Var;
                            case 5:
                                hm5.M(obj);
                                objA = obj;
                                if (!(objA instanceof loe)) {
                                    yyg0Var = yyg0.a;
                                    this.g = null;
                                    this.d = null;
                                    this.c = null;
                                    this.e = null;
                                    this.f = null;
                                    this.b = (byte) 6;
                                    if (bbcVar.b(yyg0Var, this) == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                                xgn0Var.c((Object) null);
                                return rih1Var;
                            case 6:
                                hm5.M(obj);
                                xgn0Var.c((Object) null);
                                return rih1Var;
                            case 7:
                                hm5.M(obj);
                                return rih1Var;
                            default:
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    } catch (Throwable th) {
                        xgn0Var.c((Object) null);
                        throw th;
                    }
                } catch (Throwable th2) {
                    xgn0Var.c((Object) null);
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql6(ezg0 ezg0Var, lnm lnmVar) {
        super(5, lnmVar);
        this.a = (byte) 3;
        this.h = ezg0Var;
    }
}
