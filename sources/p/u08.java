package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u08 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ tqw c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u08(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r0 == r12) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (r0 == r12) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
    
        if (r0 == r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u08.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r12 == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if (r12 == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u08.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00fb A[RETURN] */
    private final Object h(Object obj) {
        uiv0 uiv0Var;
        tqw tqwVar;
        Object objY;
        njv0 njv0Var = (njv0) this.g;
        drj0 drj0Var = njv0Var.b;
        uiv0 uiv0Var2 = (uiv0) this.d;
        ziv0 ziv0Var = (ziv0) this.e;
        oiv0 oiv0Var = (oiv0) this.f;
        tqw tqwVar2 = this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            if (!u890.j(oiv0Var, oiv0.a)) {
                eg.o();
                return null;
            }
            int iC = l1d.C(ziv0Var.a);
            if (iC == 0) {
                uiv0Var = uiv0Var2;
                tqwVar = null;
                String str = uiv0Var.a;
                this.d = uiv0Var;
                this.e = null;
                this.f = null;
                this.c = null;
                this.b = (byte) 1;
                objY = fn31.Y((q8n) drj0Var.c, new hl0(z, (Object) drj0Var, (Object) str, (lnm) tqwVar, (byte) 16), this);
                if (objY != d9nVar) {
                }
            } else if (iC == 1) {
                String str2 = uiv0Var2.a;
                this.d = null;
                this.e = null;
                this.f = null;
                this.c = null;
                this.b = (byte) 3;
                if (fn31.Y((q8n) drj0Var.c, new hl0(false, (Object) drj0Var, (Object) str2, lnmVar, (byte) 16), this) != d9nVar) {
                    return rih1Var;
                }
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                q8n q8nVar = njv0Var.f;
                rwm0 rwm0Var = new rwm0(njv0Var, uiv0Var2, tqwVar2, (lnm) null, (byte) 25);
                this.d = null;
                this.e = null;
                this.f = null;
                this.c = null;
                this.b = (byte) 4;
                if (fn31.Y(q8nVar, rwm0Var, this) != d9nVar) {
                    return rih1Var;
                }
            }
            return d9nVar;
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 4) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        objY = obj;
        uiv0Var = uiv0Var2;
        tqwVar = null;
        if (((Boolean) objY).booleanValue()) {
            dlv0 dlv0Var = (dlv0) njv0Var.d.get();
            fpo fpoVar = new fpo(njv0Var, uiv0Var, tqwVar, (byte) 27);
            this.d = tqwVar;
            this.e = tqwVar;
            this.f = tqwVar;
            this.c = tqwVar;
            this.b = (byte) 2;
            Object objY2 = fn31.Y(dlv0Var.e, new f3t0(dlv0Var, fpoVar, tqwVar, (byte) 28), this);
            if (objY2 != d9nVar) {
                objY2 = rih1Var;
            }
            if (objY2 == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.g;
        switch (b) {
            case 0:
                u08 u08Var = new u08((y08) obj6, (lnm) obj5, (byte) 0);
                u08Var.d = (p08) obj;
                u08Var.e = (q08) obj2;
                u08Var.f = (m08) obj3;
                u08Var.c = (tqw) obj4;
                return u08Var.invokeSuspend(rih1Var);
            case 1:
                u08 u08Var2 = new u08((iu30) this.f, (yu3) obj6, (lnm) obj5, (byte) 1);
                u08Var2.d = (ep8) obj2;
                u08Var2.e = (cp8) obj3;
                u08Var2.c = (tqw) obj4;
                return u08Var2.invokeSuspend(rih1Var);
            case 2:
                u08 u08Var3 = new u08((uhh) obj6, (lnm) obj5, (byte) 2);
                u08Var3.d = (khh) obj;
                u08Var3.e = (mhh) obj2;
                u08Var3.f = (jhh) obj3;
                u08Var3.c = (tqw) obj4;
                return u08Var3.invokeSuspend(rih1Var);
            case 3:
                u08 u08Var4 = new u08((sgk) obj6, (lnm) obj5, (byte) 3);
                u08Var4.d = (ngk) obj;
                u08Var4.e = (ogk) obj2;
                u08Var4.f = (lgk) obj3;
                u08Var4.c = (tqw) obj4;
                return u08Var4.invokeSuspend(rih1Var);
            case 4:
                u08 u08Var5 = new u08((uqk) obj6, (lnm) obj5, (byte) 4);
                u08Var5.d = (vqk) obj;
                u08Var5.e = (pqk) obj2;
                u08Var5.f = (nqk) obj3;
                u08Var5.c = (tqw) obj4;
                return u08Var5.invokeSuspend(rih1Var);
            case 5:
                u08 u08Var6 = new u08((uwl) obj6, (lnm) obj5, (byte) 5);
                u08Var6.d = (yom0) obj;
                u08Var6.e = (zom0) obj2;
                u08Var6.f = (xom0) obj3;
                u08Var6.c = (tqw) obj4;
                return u08Var6.invokeSuspend(rih1Var);
            case 6:
                u08 u08Var7 = new u08((j330) obj6, (lnm) obj5, (byte) 6);
                u08Var7.d = (p330) obj;
                u08Var7.e = (w330) obj2;
                u08Var7.f = (m330) obj3;
                u08Var7.c = (tqw) obj4;
                return u08Var7.invokeSuspend(rih1Var);
            case 7:
                u08 u08Var8 = new u08((d430) obj6, (lnm) obj5, (byte) 7);
                u08Var8.d = (p330) obj;
                u08Var8.e = (w330) obj2;
                u08Var8.f = (m330) obj3;
                u08Var8.c = (tqw) obj4;
                return u08Var8.invokeSuspend(rih1Var);
            case 8:
                u08 u08Var9 = new u08((pt) this.f, (qtr) obj6, (lnm) obj5, (byte) 8);
                u08Var9.d = (k5a0) obj2;
                u08Var9.e = (g5a0) obj3;
                u08Var9.c = (tqw) obj4;
                return u08Var9.invokeSuspend(rih1Var);
            case 9:
                u08 u08Var10 = new u08((wmh0) obj6, (lnm) obj5, (byte) 9);
                u08Var10.d = (pmh0) obj;
                u08Var10.e = (smh0) obj2;
                u08Var10.f = (omh0) obj3;
                u08Var10.c = (tqw) obj4;
                return u08Var10.invokeSuspend(rih1Var);
            case 10:
                u08 u08Var11 = new u08((t8k0) obj6, (lnm) obj5, (byte) 10);
                u08Var11.d = (c8k0) obj;
                u08Var11.e = (d8k0) obj2;
                u08Var11.f = (z7k0) obj3;
                u08Var11.c = (tqw) obj4;
                return u08Var11.invokeSuspend(rih1Var);
            case 11:
                u08 u08Var12 = new u08((ynb0) obj6, (lnm) obj5, (byte) 11);
                u08Var12.d = (set0) obj;
                u08Var12.e = (uet0) obj2;
                u08Var12.f = (let0) obj3;
                u08Var12.c = (tqw) obj4;
                return u08Var12.invokeSuspend(rih1Var);
            case 12:
                u08 u08Var13 = new u08((nm1) obj6, (lnm) obj5, (byte) 12);
                u08Var13.d = (lvt0) obj;
                u08Var13.e = (ovt0) obj2;
                u08Var13.f = (jvt0) obj3;
                u08Var13.c = (tqw) obj4;
                return u08Var13.invokeSuspend(rih1Var);
            case 13:
                u08 u08Var14 = new u08((hjv0) obj6, (lnm) obj5, (byte) 13);
                u08Var14.d = (wiv0) obj;
                u08Var14.e = (yiv0) obj2;
                u08Var14.f = (riv0) obj3;
                u08Var14.c = (tqw) obj4;
                return u08Var14.invokeSuspend(rih1Var);
            case 14:
                u08 u08Var15 = new u08((njv0) obj6, (lnm) obj5, (byte) 14);
                u08Var15.d = (uiv0) obj;
                u08Var15.e = (ziv0) obj2;
                u08Var15.f = (oiv0) obj3;
                u08Var15.c = (tqw) obj4;
                return u08Var15.invokeSuspend(rih1Var);
            default:
                u08 u08Var16 = new u08((xu30) this.f, (xu30) obj6, (lnm) obj5, (byte) 15);
                u08Var16.d = obj;
                u08Var16.e = (lhb1) obj3;
                u08Var16.c = (tqw) obj4;
                return u08Var16.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:593:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0a50, code lost:
    
        if (r0 == r10) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0a67, code lost:
    
        if (r0 == r10) goto L502;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u08.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u08(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.g = obj;
    }
}
