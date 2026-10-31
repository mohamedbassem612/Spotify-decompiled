package p;

import android.content.Context;
import com.spotify.ondemandtrials.configimpl.OnDemandTrialFetchEndWorker;
import j$.time.ZonedDateTime;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ihq0 implements wgq0 {
    public final Context a;
    public final wn4 b;
    public final u4q0 c;
    public final k4q0 d;
    public final hrg1 e;
    public final yqg f;
    public Boolean g;

    public ihq0(Context context, wn4 wn4Var, u4q0 u4q0Var, k4q0 k4q0Var, hrg1 hrg1Var, yqg yqgVar) {
        this.a = context;
        this.b = wn4Var;
        this.c = u4q0Var;
        this.d = k4q0Var;
        this.e = hrg1Var;
        this.f = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r6.k(false, r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.ygq0
            if (r0 == 0) goto L13
            r0 = r7
            p.ygq0 r0 = (p.ygq0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.ygq0 r0 = new p.ygq0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 3
            r3 = 2
            r4 = 1
            p.hrg1 r6 = r6.e
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2f
            p.hm5.M(r7)
            goto L5d
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L36:
            p.hm5.M(r7)
            goto L53
        L3a:
            p.hm5.M(r7)
            goto L4a
        L3e:
            p.hm5.M(r7)
            r0.c = r4
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r5) goto L4a
            goto L5c
        L4a:
            r0.c = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r5) goto L53
            goto L5c
        L53:
            r0.c = r2
            r7 = 0
            java.lang.Object r6 = r6.k(r7, r0)
            if (r6 != r5) goto L5d
        L5c:
            return r5
        L5d:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ihq0.a(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        zgq0 zgq0Var;
        Object objB;
        rrg1 rrg1Var;
        ZonedDateTime zonedDateTimeA;
        long epochSecond;
        Integer numB;
        if (onmVar instanceof zgq0) {
            zgq0Var = (zgq0) onmVar;
            int i = zgq0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgq0Var.c = i - Integer.MIN_VALUE;
            } else {
                zgq0Var = new zgq0(this, onmVar);
            }
        } else {
            zgq0Var = new zgq0(this, onmVar);
        }
        Object obj = zgq0Var.a;
        int i2 = zgq0Var.c;
        xgq0 xgq0Var = null;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.b.c()) {
                zgq0Var.c = 1;
                if (this.e.k(true, zgq0Var) != d9nVar) {
                }
                return d9nVar;
            }
            return rih1Var;
        }
        if (i2 == 1) {
            hm5.M(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objB = ((e331) obj).a;
        }
        if (objB instanceof m231) {
            objB = null;
        }
        rrg1Var = (rrg1) objB;
        if (rrg1Var != null) {
            zonedDateTimeA = rrg1Var.a();
            if (zonedDateTimeA != null) {
                epochSecond = zonedDateTimeA.toEpochSecond();
                numB = rrg1Var.b();
                if (numB != null) {
                    xgq0Var = new xgq0(epochSecond, numB.intValue());
                }
            }
            if (xgq0Var != null) {
                zgq0Var.c = 3;
                if (i(xgq0Var, zgq0Var) == d9nVar) {
                    return d9nVar;
                }
            }
        }
        return rih1Var;
        zgq0Var.c = 2;
        objB = this.d.b(zgq0Var);
        if (objB != d9nVar) {
            if (objB instanceof m231) {
                objB = null;
            }
            rrg1Var = (rrg1) objB;
            if (rrg1Var != null) {
                zonedDateTimeA = rrg1Var.a();
                if (zonedDateTimeA != null) {
                    epochSecond = zonedDateTimeA.toEpochSecond();
                    numB = rrg1Var.b();
                    if (numB != null) {
                        xgq0Var = new xgq0(epochSecond, numB.intValue());
                    }
                }
                if (xgq0Var != null) {
                    zgq0Var.c = 3;
                    if (i(xgq0Var, zgq0Var) == d9nVar) {
                    }
                }
            }
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        ahq0 ahq0Var;
        long j;
        int iIntValue;
        if (onmVar instanceof ahq0) {
            ahq0Var = (ahq0) onmVar;
            int i = ahq0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahq0Var.d = i - Integer.MIN_VALUE;
            } else {
                ahq0Var = new ahq0(this, onmVar);
            }
        } else {
            ahq0Var = new ahq0(this, onmVar);
        }
        Object objH = ahq0Var.b;
        int i2 = ahq0Var.d;
        hrg1 hrg1Var = this.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objH);
            ahq0Var.d = 1;
            objH = hrg1Var.h(ahq0Var);
            if (objH != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objH);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ahq0Var.a;
            hm5.M(objH);
        }
        iIntValue = ((Number) objH).intValue();
        if (iIntValue != -1) {
            return new xgq0(j, iIntValue);
        }
        return null;
        Long l = (Long) objH;
        if (l != null) {
            long jLongValue = l.longValue();
            ahq0Var.a = jLongValue;
            ahq0Var.d = 2;
            objH = hrg1Var.f(ahq0Var);
            if (objH != d9nVar) {
                j = jLongValue;
                iIntValue = ((Number) objH).intValue();
                if (iIntValue != -1) {
                    return new xgq0(j, iIntValue);
                }
            }
            return d9nVar;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r6.k(true, r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(p.onm r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.bhq0
            if (r0 == 0) goto L13
            r0 = r7
            p.bhq0 r0 = (p.bhq0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.bhq0 r0 = new p.bhq0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 3
            r3 = 2
            p.hrg1 r6 = r6.e
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2f
            p.hm5.M(r7)
            goto L5c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L36:
            p.hm5.M(r7)
            goto L53
        L3a:
            p.hm5.M(r7)
            goto L4a
        L3e:
            p.hm5.M(r7)
            r0.c = r4
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r5) goto L4a
            goto L5b
        L4a:
            r0.c = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r5) goto L53
            goto L5b
        L53:
            r0.c = r2
            java.lang.Object r6 = r6.k(r4, r0)
            if (r6 != r5) goto L5c
        L5b:
            return r5
        L5c:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ihq0.d(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(boolean z, onm onmVar) {
        chq0 chq0Var;
        if (onmVar instanceof chq0) {
            chq0Var = (chq0) onmVar;
            int i = chq0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                chq0Var.d = i - Integer.MIN_VALUE;
            } else {
                chq0Var = new chq0(this, onmVar);
            }
        } else {
            chq0Var = new chq0(this, onmVar);
        }
        Object objJ = chq0Var.b;
        int i2 = chq0Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            if (this.b.c()) {
                Boolean bool = this.g;
                this.g = yah0.m(z);
                if (z && !u890.j(bool, yah0.m(true))) {
                    chq0Var.a = z;
                    chq0Var.d = 1;
                    if (d(chq0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else if (!z) {
                    chq0Var.a = z;
                    chq0Var.d = 2;
                    objJ = this.e.j(chq0Var);
                    if (objJ != d9nVar) {
                    }
                    return d9nVar;
                }
            }
            return rih1Var;
        }
        if (i2 == 1) {
            hm5.M(objJ);
            return rih1Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                hm5.M(objJ);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = chq0Var.a;
        hm5.M(objJ);
        if (((Boolean) objJ).booleanValue()) {
            chq0Var.a = z;
            chq0Var.d = 3;
            if (a(chq0Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(onm onmVar) {
        dhq0 dhq0Var;
        if (onmVar instanceof dhq0) {
            dhq0Var = (dhq0) onmVar;
            int i = dhq0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dhq0Var.c = i - Integer.MIN_VALUE;
            } else {
                dhq0Var = new dhq0(this, onmVar);
            }
        } else {
            dhq0Var = new dhq0(this, onmVar);
        }
        Object obj = dhq0Var.a;
        int i2 = dhq0Var.c;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (!this.b.c()) {
                return rih1Var;
            }
            dhq0Var.c = 1;
            Object objD = d(dhq0Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        nb51.y(this.a.getApplicationContext()).c("com.spotify.ondemandtrials.on-demand-trial-fetch-end", 2, new ciq0(OnDemandTrialFetchEndWorker.class).a("com.spotify.ondemandtrials.on-demand-trial-fetch-end").b());
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r7 == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(p.onm r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.ehq0
            if (r0 == 0) goto L13
            r0 = r7
            p.ehq0 r0 = (p.ehq0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.ehq0 r0 = new p.ehq0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L36
            if (r1 == r4) goto L32
            if (r1 != r3) goto L2b
            p.hm5.M(r7)
            goto L62
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L32:
            p.hm5.M(r7)
            goto L51
        L36:
            p.hm5.M(r7)
            p.wn4 r7 = r6.b
            boolean r7 = r7.c()
            if (r7 != 0) goto L46
            java.lang.Boolean r6 = p.yah0.m(r2)
            return r6
        L46:
            r0.c = r4
            p.hrg1 r7 = r6.e
            java.lang.Object r7 = r7.j(r0)
            if (r7 != r5) goto L51
            goto L61
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L64
            r0.c = r3
            java.lang.Object r7 = r6.c(r0)
            if (r7 != r5) goto L62
        L61:
            return r5
        L62:
            if (r7 != 0) goto L65
        L64:
            r2 = r4
        L65:
            java.lang.Boolean r6 = p.yah0.m(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ihq0.g(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (a(r0) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        if (a(r0) == r7) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(p.onm r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof p.fhq0
            if (r0 == 0) goto L13
            r0 = r13
            p.fhq0 r0 = (p.fhq0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.fhq0 r0 = new p.fhq0
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.a
            int r1 = r0.c
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L45
            if (r1 == r5) goto L41
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L38
            if (r1 != r2) goto L31
            p.hm5.M(r13)
            return r13
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            r12 = 0
            return r12
        L38:
            p.hm5.M(r13)
            goto La7
        L3d:
            p.hm5.M(r13)
            goto L77
        L41:
            p.hm5.M(r13)
            goto L5f
        L45:
            p.hm5.M(r13)
            p.wn4 r13 = r12.b
            boolean r1 = r13.c()
            if (r1 == 0) goto Lb6
            boolean r13 = r13.d()
            if (r13 == 0) goto Lb6
            r0.c = r5
            java.lang.Object r13 = r12.c(r0)
            if (r13 != r7) goto L5f
            goto Lb4
        L5f:
            p.xgq0 r13 = (p.xgq0) r13
            if (r13 != 0) goto L68
            java.lang.Boolean r12 = p.yah0.m(r6)
            return r12
        L68:
            int r1 = r13.b()
            if (r1 == r5) goto L7c
            r0.c = r4
            java.lang.Object r12 = r12.a(r0)
            if (r12 != r7) goto L77
            goto Lb4
        L77:
            java.lang.Boolean r12 = p.yah0.m(r6)
            return r12
        L7c:
            p.yqg r1 = r12.f
            long r4 = r1.b()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r8
            long r8 = r13.a()
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 <= 0) goto L92
            java.lang.Boolean r12 = p.yah0.m(r6)
            return r12
        L92:
            long r8 = r13.a()
            r10 = 1209600(0x127500, double:5.97622E-318)
            long r8 = r8 + r10
            int r13 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r13 <= 0) goto Lac
            r0.c = r3
            java.lang.Object r12 = r12.a(r0)
            if (r12 != r7) goto La7
            goto Lb4
        La7:
            java.lang.Boolean r12 = p.yah0.m(r6)
            return r12
        Lac:
            r0.c = r2
            java.lang.Object r12 = r12.j(r0)
            if (r12 != r7) goto Lb5
        Lb4:
            return r7
        Lb5:
            return r12
        Lb6:
            java.lang.Boolean r12 = p.yah0.m(r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ihq0.h(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r7.k(false, r0) == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(p.xgq0 r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.ghq0
            if (r0 == 0) goto L13
            r0 = r9
            p.ghq0 r0 = (p.ghq0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.ghq0 r0 = new p.ghq0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            p.hrg1 r7 = r7.e
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3a
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            p.hm5.M(r9)
            goto L6d
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L36:
            p.hm5.M(r9)
            goto L61
        L3a:
            p.xgq0 r8 = r0.a
            p.hm5.M(r9)
            goto L52
        L40:
            p.hm5.M(r9)
            int r9 = r8.b()
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = r7.l(r9, r0)
            if (r9 != r6) goto L52
            goto L6c
        L52:
            long r8 = r8.a()
            r0.a = r2
            r0.d = r4
            java.lang.Object r8 = r7.n(r8, r0)
            if (r8 != r6) goto L61
            goto L6c
        L61:
            r0.a = r2
            r0.d = r3
            r8 = 0
            java.lang.Object r7 = r7.k(r8, r0)
            if (r7 != r6) goto L6d
        L6c:
            return r6
        L6d:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ihq0.i(p.xgq0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be A[PHI: r1
      0x00be: PHI (r1v7 p.xgq0) = (r1v6 p.xgq0), (r1v9 p.xgq0) binds: [B:49:0x00bb, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
    
        if (a(r0) == r9) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f1, code lost:
    
        if (a(r0) == r9) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(p.onm r15) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ihq0.j(p.onm):java.lang.Object");
    }
}
