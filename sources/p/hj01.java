package p;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hj01 {
    public final esa1 a;
    public final yqg b;
    public final q8n c;
    public final ij01 d;
    public a6b1 g;
    public volatile int h;
    public volatile long i;
    public volatile boolean j;
    public volatile npn0 k;
    public faa0 m;
    public final String n;
    public final dt71 e = mgo1.e(1, 0, 0, 6);
    public final bbc f = mno1.a(-1, 0, 6);
    public final xgn0 l = ygn0.a();

    public hj01(esa1 esa1Var, yqg yqgVar, q8n q8nVar, ij01 ij01Var) {
        this.a = esa1Var;
        this.b = yqgVar;
        this.c = q8nVar;
        this.d = ij01Var;
        this.n = esa1Var.s();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        zi01 zi01Var;
        if (onmVar instanceof zi01) {
            zi01Var = (zi01) onmVar;
            int i = zi01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zi01Var.c = i - Integer.MIN_VALUE;
            } else {
                zi01Var = new zi01(this, onmVar);
            }
        } else {
            zi01Var = new zi01(this, onmVar);
        }
        Object objL = zi01Var.a;
        d9n d9nVar = d9n.a;
        int i2 = zi01Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            esa1 esa1Var = this.a;
            zi01Var.c = 1;
            objL = esa1Var.l(zi01Var);
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        x4b1 x4b1Var = (z4b1) objL;
        if (x4b1Var instanceof y4b1) {
            return ((y4b1) x4b1Var).a;
        }
        if (!(x4b1Var instanceof x4b1)) {
            eg.o();
            return null;
        }
        if (this.j) {
            return null;
        }
        npn0 npn0Var = this.k;
        if (npn0Var == null) {
            u890.C("recaptchaTracker");
            throw null;
        }
        npn0Var.e(x4b1Var.a());
        this.j = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(a6b1 a6b1Var, long j, onm onmVar) {
        cj01 cj01Var;
        long j2;
        long jB;
        npn0 npn0Var;
        rih1 rih1Var = rih1.a;
        if (onmVar instanceof cj01) {
            cj01Var = (cj01) onmVar;
            int i = cj01Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cj01Var.d = i - Integer.MIN_VALUE;
            } else {
                cj01Var = new cj01(this, onmVar);
            }
        } else {
            cj01Var = new cj01(this, onmVar);
        }
        Object objY = cj01Var.b;
        d9n d9nVar = d9n.a;
        int i2 = cj01Var.d;
        if (i2 == 0) {
            hm5.M(objY);
            cj01Var.a = j;
            cj01Var.d = 1;
            objY = buo1.y(3, new dj01(this, a6b1Var, null), cj01Var);
            if (objY != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            j = cj01Var.a;
            hm5.M(objY);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = cj01Var.a;
            hm5.M(objY);
        }
        if (this.h <= 1) {
            jB = this.b.b() - j2;
            npn0Var = this.k;
            if (npn0Var != null) {
                npn0Var.g(jB);
                return rih1Var;
            }
            u890.C("recaptchaTracker");
            throw null;
        }
        return rih1Var;
        String str = (String) objY;
        if (str != null) {
            this.h++;
            this.i = this.b.b();
            dt71 dt71Var = this.e;
            cj01Var.a = j;
            cj01Var.d = 2;
            if (dt71Var.emit(str, cj01Var) != d9nVar) {
                j2 = j;
                if (this.h <= 1) {
                    jB = this.b.b() - j2;
                    npn0Var = this.k;
                    if (npn0Var != null) {
                        npn0Var.g(jB);
                        return rih1Var;
                    }
                    u890.C("recaptchaTracker");
                    throw null;
                }
            }
            return d9nVar;
        }
        return rih1Var;
    }

    public final String c(String str, String str2) throws Throwable {
        if (this.b.b() - this.i > 85000) {
            npn0 npn0Var = this.k;
            if (npn0Var != null) {
                npn0Var.a(str, str2, false);
                return null;
            }
            u890.C("recaptchaTracker");
            throw null;
        }
        String str3 = (String) o7h.s0(this.e.c());
        if (str3 != null) {
            this.e.d();
            this.f.l(rih1.a);
        }
        npn0 npn0Var2 = this.k;
        if (npn0Var2 != null) {
            npn0Var2.a(str, str2, str3 != null);
            return str3;
        }
        u890.C("recaptchaTracker");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ad A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:30:0x007d, B:32:0x0084, B:33:0x008e, B:44:0x00a9, B:46:0x00ad, B:53:0x00c8, B:54:0x00cb), top: B:61:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:30:0x007d, B:32:0x0084, B:33:0x008e, B:44:0x00a9, B:46:0x00ad, B:53:0x00c8, B:54:0x00cb), top: B:61:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, p.d9n] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final Object d(long j, boolean z, onm onmVar) throws Throwable {
        ej01 ej01Var;
        long j2;
        boolean z2;
        npn0 npn0Var;
        m231 m231Var;
        npn0 npn0Var2;
        rih1 rih1Var = rih1.a;
        if (onmVar instanceof ej01) {
            ej01Var = (ej01) onmVar;
            int i = ej01Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ej01Var.e = i - Integer.MIN_VALUE;
            } else {
                ej01Var = new ej01(this, onmVar);
            }
        } else {
            ej01Var = new ej01(this, onmVar);
        }
        Object objM = ej01Var.c;
        long j3 = d9n.a;
        int i2 = ej01Var.e;
        try {
            if (i2 == 0) {
                hm5.M(objM);
                long jB = this.b.b();
                try {
                    if (this.b.b() - this.i > 85000) {
                        this.e.d();
                        this.f.l(rih1Var);
                    }
                    aj01 aj01Var = new aj01(this, (lnm) null, (byte) 1);
                    ej01Var.b = z;
                    ej01Var.a = jB;
                    ej01Var.e = 1;
                    objM = rc2.M(j, aj01Var, ej01Var);
                    if (objM == j3) {
                        return j3;
                    }
                    z2 = z;
                    j2 = jB;
                } catch (TimeoutCancellationException e) {
                    e = e;
                    j2 = jB;
                    npn0Var = this.k;
                    if (npn0Var != null) {
                        u890.C("recaptchaTracker");
                        throw null;
                    }
                    npn0Var.b();
                    m231Var = new m231(e);
                    npn0Var2 = this.k;
                    if (npn0Var2 != null) {
                        npn0Var2.c(this.b.b() - j2);
                        return m231Var;
                    }
                    u890.C("recaptchaTracker");
                    throw null;
                } catch (Throwable th) {
                    th = th;
                    j3 = jB;
                    npn0 npn0Var3 = this.k;
                    if (npn0Var3 == null) {
                        u890.C("recaptchaTracker");
                        throw null;
                    }
                    npn0Var3.c(this.b.b() - j3);
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = ej01Var.a;
                z2 = ej01Var.b;
                try {
                    hm5.M(objM);
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                    npn0Var = this.k;
                    if (npn0Var != null) {
                        u890.C("recaptchaTracker");
                        throw null;
                    }
                    npn0Var.b();
                    m231Var = new m231(e);
                    npn0Var2 = this.k;
                    if (npn0Var2 != null) {
                        npn0Var2.c(this.b.b() - j2);
                        return m231Var;
                    }
                    u890.C("recaptchaTracker");
                    throw null;
                }
            }
            Object obj = ((e331) objM).a;
            if (z2) {
                this.e.d();
                this.f.l(rih1Var);
            }
            Object obj2 = ((e331) objM).a;
            npn0 npn0Var4 = this.k;
            if (npn0Var4 != null) {
                npn0Var4.c(this.b.b() - j2);
                return obj2;
            }
            u890.C("recaptchaTracker");
            throw null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(onm onmVar) {
        fj01 fj01Var;
        hj01 hj01Var;
        long j;
        rih1 rih1Var = rih1.a;
        if (onmVar instanceof fj01) {
            fj01Var = (fj01) onmVar;
            int i = fj01Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fj01Var.e = i - Integer.MIN_VALUE;
            } else {
                fj01Var = new fj01(this, onmVar);
            }
        } else {
            fj01Var = new fj01(this, onmVar);
        }
        Object objA = fj01Var.c;
        d9n d9nVar = d9n.a;
        int i2 = fj01Var.e;
        if (i2 == 0) {
            hm5.M(objA);
            if (this.g == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                fj01Var.b = this;
                fj01Var.a = jCurrentTimeMillis;
                fj01Var.e = 1;
                objA = a(fj01Var);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                hj01Var = this;
                j = jCurrentTimeMillis;
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = fj01Var.a;
        hj01Var = fj01Var.b;
        hm5.M(objA);
        hj01Var.g = (a6b1) objA;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        if (this.g != null) {
            npn0 npn0Var = this.k;
            if (npn0Var != null) {
                npn0Var.d(jCurrentTimeMillis2);
                return rih1Var;
            }
            u890.C("recaptchaTracker");
            throw null;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007d -> B:19:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void f(p.onm r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof p.gj01
            if (r0 == 0) goto L13
            r0 = r12
            p.gj01 r0 = (p.gj01) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.gj01 r0 = new p.gj01
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            p.d9n r1 = p.d9n.a
            int r2 = r0.d
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2f
            long r6 = r0.a
            p.hm5.M(r12)
            goto L4a
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return
        L35:
            long r6 = r0.a
            p.hm5.M(r12)
            goto L64
        L3b:
            long r6 = r0.a
            p.hm5.M(r12)
            goto L55
        L41:
            p.hm5.M(r12)
            p.yqg r12 = r11.b
            long r6 = r12.b()
        L4a:
            r0.a = r6
            r0.d = r4
            java.lang.Object r12 = r11.e(r0)
            if (r12 != r1) goto L55
            goto L7f
        L55:
            p.a6b1 r12 = r11.g
            if (r12 == 0) goto L64
            r0.a = r6
            r0.d = r5
            java.lang.Object r12 = r11.b(r12, r6, r0)
            if (r12 != r1) goto L64
            goto L7f
        L64:
            int r12 = r11.h
            if (r12 <= r5) goto L6b
            r8 = 20000(0x4e20, double:9.8813E-320)
            goto L6d
        L6b:
            r8 = 3000(0xbb8, double:1.482E-320)
        L6d:
            p.vse0 r12 = new p.vse0
            r2 = 14
            r10 = 0
            r12.<init>(r11, r10, r2)
            r0.a = r6
            r0.d = r3
            java.lang.Object r12 = p.rc2.O(r8, r12, r0)
            if (r12 != r1) goto L4a
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hj01.f(p.onm):void");
    }
}
