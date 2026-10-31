package p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hgo0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public Object b;
    public byte c;
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgo0(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
        this.g = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x0174 A[PHI: r24
      0x0174: PHI (r24v5 float) = (r24v1 float), (r24v6 float) binds: [B:76:0x0171, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    private final Object e(Object obj) {
        xgn0 xgn0Var;
        jo51 jo51Var;
        Object objV1;
        hrr0 hrr0Var;
        drr0 drr0Var;
        float f;
        co51 co51Var;
        mhg1 mhg1Var = (mhg1) this.g;
        Object obj2 = this.b;
        jo51 jo51Var2 = (jo51) this.f;
        byte b = this.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                Object value = jo51Var2.c.getValue();
                if (!obj2.equals(value)) {
                    jo51Var2.x1();
                    jo51Var2.C1(0.0f);
                    mhg1Var.r(obj2);
                    mhg1Var.n(0L);
                    jo51Var2.o1(value);
                    jo51Var2.c.setValue(obj2);
                }
                xgn0 xgn0Var2 = jo51Var2.Y;
                this.d = xgn0Var2;
                this.e = jo51Var2;
                this.c = (byte) 1;
                if (xgn0Var2.a(this) != d9nVar) {
                    xgn0Var = xgn0Var2;
                    jo51Var = jo51Var2;
                }
            }
            if (b == 1) {
                jo51Var = (jo51) this.e;
                xgn0Var = (xgn0) this.d;
                hm5.M(obj);
            } else {
                if (b == 2) {
                    hm5.M(obj);
                    this.c = (byte) 3;
                    if (jo51Var2.F1(this) != d9nVar) {
                        hrr0Var = jo51Var2.d;
                        drr0Var = jo51Var2.t;
                        if (!u890.j(hrr0Var.getValue(), obj2)) {
                            if (drr0Var.s() < 1.0f) {
                                f = 0.0f;
                            } else {
                                f = 0.0f;
                            }
                            this.d = null;
                            this.e = null;
                            this.c = (byte) 4;
                            if (jo51Var2.z1(this) != d9nVar) {
                            }
                        }
                    }
                }
                if (b == 3) {
                    hm5.M(obj);
                    hrr0Var = jo51Var2.d;
                    drr0Var = jo51Var2.t;
                    if (!u890.j(hrr0Var.getValue(), obj2)) {
                        if (drr0Var.s() < 1.0f || ((co51Var = jo51Var2.P0) != null && u890.j((Object) null, co51Var.b))) {
                            f = 0.0f;
                        } else {
                            fui1 fui1Var = co51Var != null ? co51Var.b : null;
                            oe5 ke5Var = jo51.T0;
                            if (fui1Var != null) {
                                long j = co51Var.a;
                                ke5 ke5Var2 = co51Var.e;
                                f = 0.0f;
                                oe5 oe5Var = co51Var.f;
                                ke5Var = (ke5) fui1Var.g(j, ke5Var2, jo51.U0, oe5Var == null ? ke5Var : oe5Var);
                            } else {
                                f = 0.0f;
                                if (co51Var != null && co51Var.a != 0) {
                                    long j2 = co51Var.g;
                                    if (j2 == Long.MIN_VALUE) {
                                        j2 = jo51Var2.g;
                                    }
                                    float f2 = j2 / 1.0E9f;
                                    if (f2 > 0.0f) {
                                        ke5Var = new ke5(1.0f / f2);
                                    }
                                }
                            }
                            if (co51Var == null) {
                                co51Var = new co51();
                            }
                            ke5 ke5Var3 = co51Var.e;
                            co51Var.b = null;
                            co51Var.c = false;
                            co51Var.d = drr0Var.s();
                            ke5Var3.e(drr0Var.s(), 0);
                            long j3 = jo51Var2.g;
                            co51Var.g = j3;
                            co51Var.a = 0L;
                            co51Var.f = ke5Var;
                            co51Var.h = jch0.a0((1.0d - ((double) drr0Var.s())) * j3);
                            jo51Var2.P0 = co51Var;
                        }
                        this.d = null;
                        this.e = null;
                        this.c = (byte) 4;
                        if (jo51Var2.z1(this) != d9nVar) {
                        }
                    }
                }
                if (b != 4) {
                    if (b == 5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                f = 0.0f;
            }
            jo51Var2.o1(obj2);
            jo51Var2.C1(f);
            mhg1Var.i();
            this.c = (byte) 5;
            return jo51Var2.E1(this) == d9nVar ? d9nVar : rih1Var;
            Object obj3 = jo51Var.e;
            xgn0Var.c((Object) null);
            if (obj2.equals(obj3)) {
                hrr0Var = jo51Var2.d;
                drr0Var = jo51Var2.t;
                if (!u890.j(hrr0Var.getValue(), obj2)) {
                    if (drr0Var.s() < 1.0f) {
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    this.d = null;
                    this.e = null;
                    this.c = (byte) 4;
                    if (jo51Var2.z1(this) != d9nVar) {
                        jo51Var2.o1(obj2);
                        jo51Var2.C1(f);
                        mhg1Var.i();
                        this.c = (byte) 5;
                        if (jo51Var2.E1(this) == d9nVar) {
                        }
                    }
                }
            }
            this.d = null;
            this.e = null;
            this.c = (byte) 2;
            if (jo51Var2.N0 != Long.MIN_VALUE ? (objV1 = jo51Var2.v1(this)) != d9nVar : (objV1 = s110.r(jo51Var2.Q0, this)) != d9nVar) {
                objV1 = rih1Var;
            }
            if (objV1 != d9nVar) {
                this.c = (byte) 3;
                if (jo51Var2.F1(this) != d9nVar) {
                    hrr0Var = jo51Var2.d;
                    drr0Var = jo51Var2.t;
                    if (!u890.j(hrr0Var.getValue(), obj2)) {
                        if (drr0Var.s() < 1.0f) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                        }
                        this.d = null;
                        this.e = null;
                        this.c = (byte) 4;
                        if (jo51Var2.z1(this) != d9nVar) {
                            jo51Var2.o1(obj2);
                            jo51Var2.C1(f);
                            mhg1Var.i();
                            this.c = (byte) 5;
                            if (jo51Var2.E1(this) == d9nVar) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            xgn0Var.c((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        if (r14 == r7) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hgo0.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r12 == r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        if (r12 == r4) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hgo0.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082 A[Catch: all -> 0x0026, PHI: r1 r4 r7 r8
      0x0082: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v8 java.lang.Object) binds: [B:23:0x007f, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r4v7 ??) = (r4v12 ??), (r4v13 ??) binds: [B:23:0x007f, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r7v4 p.ks21) = (r7v3 p.ks21), (r7v8 p.ks21) binds: [B:23:0x007f, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r8v3 p.vr20) = (r8v2 p.vr20), (r8v7 p.vr20) binds: [B:23:0x007f, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0026, blocks: (B:15:0x003d, B:25:0x0082, B:22:0x0071, B:27:0x008c, B:8:0x0022), top: B:42:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:27:0x008c A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:15:0x003d, B:25:0x0082, B:22:0x0071, B:27:0x008c, B:8:0x0022), top: B:42:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, p.jfe] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008a -> B:22:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009d -> B:22:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object i(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.g
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            byte r1 = r10.c
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L41
            if (r1 == r4) goto L14
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L29
        L14:
            java.lang.Object r1 = r10.b
            java.lang.Object r4 = r10.e
            p.jfe r4 = (p.jfe) r4
            java.lang.Object r7 = r10.d
            p.ks21 r7 = (p.ks21) r7
            java.lang.Object r8 = r10.f
            p.vr20 r8 = (p.vr20) r8
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L26
            goto L71
        L26:
            r10 = move-exception
            goto La1
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r5
        L2f:
            java.lang.Object r1 = r10.b
            java.lang.Object r4 = r10.e
            p.jfe r4 = (p.jfe) r4
            java.lang.Object r7 = r10.d
            p.ks21 r7 = (p.ks21) r7
            java.lang.Object r8 = r10.f
            p.vr20 r8 = (p.vr20) r8
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L26
            goto L82
        L41:
            p.hm5.M(r11)
            java.lang.Object r11 = r10.f
            r8 = r11
            p.vr20 r8 = (p.vr20) r8
            p.ks21 r7 = new p.ks21
            r7.<init>()
            p.n191 r11 = new p.n191
            r11.<init>()
            r7.b = r11
            r11 = 6
            r1 = 0
            p.bbc r11 = p.mno1.a(r4, r1, r11)
            java.lang.Object r1 = r7.e(r11, r0)     // Catch: java.lang.Throwable -> L9f
            r10.f = r8     // Catch: java.lang.Throwable -> L9f
            r10.d = r7     // Catch: java.lang.Throwable -> L9f
            r10.e = r11     // Catch: java.lang.Throwable -> L9f
            r10.b = r1     // Catch: java.lang.Throwable -> L9f
            r10.c = r4     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r4 = r8.emit(r1, r10)     // Catch: java.lang.Throwable -> L9f
            if (r4 != r6) goto L70
            goto L9c
        L70:
            r4 = r11
        L71:
            r10.f = r8     // Catch: java.lang.Throwable -> L26
            r10.d = r7     // Catch: java.lang.Throwable -> L26
            r10.e = r4     // Catch: java.lang.Throwable -> L26
            r10.b = r1     // Catch: java.lang.Throwable -> L26
            r10.c = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r11 = r4.r(r10)     // Catch: java.lang.Throwable -> L26
            if (r11 != r6) goto L82
            goto L9c
        L82:
            java.lang.Object r11 = r7.e(r4, r0)     // Catch: java.lang.Throwable -> L26
            boolean r9 = p.u890.j(r11, r1)     // Catch: java.lang.Throwable -> L26
            if (r9 != 0) goto L71
            r10.f = r8     // Catch: java.lang.Throwable -> L26
            r10.d = r7     // Catch: java.lang.Throwable -> L26
            r10.e = r4     // Catch: java.lang.Throwable -> L26
            r10.b = r11     // Catch: java.lang.Throwable -> L26
            r10.c = r2     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r8.emit(r11, r10)     // Catch: java.lang.Throwable -> L26
            if (r1 != r6) goto L9d
        L9c:
            return r6
        L9d:
            r1 = r11
            goto L71
        L9f:
            r10 = move-exception
            r4 = r11
        La1:
            java.lang.Object r11 = r7.b
            p.k9 r11 = (p.k9) r11
            if (r11 == 0) goto Laa
            r11.m1(r4)
        Laa:
            java.lang.Object r11 = r7.b
            p.k9 r11 = (p.k9) r11
            if (r11 == 0) goto Lb1
            goto Lb6
        Lb1:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            p.bmv0.b(r0)
        Lb6:
            r11.J0()
            r7.b = r5
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hgo0.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r0 == r10) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.e
            p.zpa1 r0 = (p.zpa1) r0
            java.lang.Object r1 = r11.d
            p.cqa1 r1 = (p.cqa1) r1
            byte r2 = r11.c
            r3 = 2
            r4 = 1
            p.d9n r10 = p.d9n.a
            if (r2 == 0) goto L25
            if (r2 == r4) goto L20
            if (r2 != r3) goto L19
            p.hm5.M(r12)
            r0 = r12
            goto L71
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L20:
            p.hm5.M(r12)
            r2 = r12
            goto L3e
        L25:
            p.hm5.M(r12)
            java.util.concurrent.ConcurrentHashMap r2 = r1.d
            p.bdd0 r5 = new p.bdd0
            r5.<init>(r1, r0, r3)
            java.lang.Object r2 = r2.computeIfAbsent(r0, r5)
            p.l2t r2 = (p.l2t) r2
            r11.c = r4
            java.lang.Object r2 = r2.E(r11)
            if (r2 != r10) goto L3e
            goto L70
        L3e:
            java.util.List r2 = (java.util.List) r2
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L4e
            p.oy21 r0 = new p.oy21
            p.rih1 r1 = p.rih1.a
            r0.<init>(r1)
            return r0
        L4e:
            p.ylk0 r1 = r1.a
            java.lang.Object r4 = r11.f
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r0 = r0.b
            java.lang.Object r5 = r11.b
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r11.g
            java.util.List r6 = (java.util.List) r6
            r11.c = r3
            r3 = r2
            r2 = r0
            r0 = r1
            r1 = r4
            p.ddd1 r4 = p.ddd1.W0
            r7 = 0
            r9 = 64
            r8 = r11
            java.lang.Object r0 = p.ylk0.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r10) goto L71
        L70:
            return r10
        L71:
            p.py21 r0 = (p.py21) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hgo0.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5 A[PHI: r12
      0x00c5: PHI (r12v14 java.lang.Object) = (r12v10 java.lang.Object), (r12v0 java.lang.Object) binds: [B:33:0x00c2, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v7 java.lang.Object, still in use, count: 2, list:
          (r1v7 java.lang.Object) from 0x0082: PHI (r1 I:??) = (r1v4 java.lang.Object), (r1v7 java.lang.Object) binds: [B:22:0x0081, B:53:0x0082] A[DONT_GENERATE, DONT_INLINE]
          (r1v7 java.lang.Object) from 0x0076: CHECK_CAST (p.rvb1) (r1v7 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private final java.lang.Object m(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hgo0.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x02ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:111:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:141:0x046b  */
    /* JADX WARN: Code duplicated, block: B:143:0x046f A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:144:0x0474  */
    /* JADX WARN: Code duplicated, block: B:148:0x0494  */
    /* JADX WARN: Code duplicated, block: B:150:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:152:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:154:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:156:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:158:0x04de  */
    /* JADX WARN: Code duplicated, block: B:160:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:165:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:166:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:170:0x0517 A[LOOP:4: B:168:0x0511->B:170:0x0517, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:172:0x0536  */
    /* JADX WARN: Code duplicated, block: B:174:0x053b  */
    /* JADX WARN: Code duplicated, block: B:391:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x053e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x0682 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (r1 == r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r0 == r11) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 3250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hgo0.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) {
        s2t s2tVarQ;
        String str;
        String str2 = (String) this.g;
        hce1 hce1Var = (hce1) this.f;
        c9n c9nVar = (c9n) this.b;
        byte b = this.c;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                s2tVarQ = (s2t) this.d;
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.e;
                hm5.M(obj);
            }
            return new r0g1(str, ((Boolean) obj).booleanValue());
        }
        hm5.M(obj);
        s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new y0g1(hce1Var, str2, (lnm) null, (byte) 4), 3);
        s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new y0g1(hce1Var, str2, (lnm) null, (byte) 3), 3);
        this.b = null;
        this.d = s2tVarQ;
        this.c = (byte) 1;
        obj = s2tVarQ2.Q(this);
        if (obj != d9nVar) {
        }
        return d9nVar;
        String str3 = (String) obj;
        this.b = null;
        this.d = null;
        this.e = str3;
        this.c = (byte) 2;
        Object objE = s2tVarQ.E(this);
        if (objE != d9nVar) {
            obj = objE;
            str = str3;
            return new r0g1(str, ((Boolean) obj).booleanValue());
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r9 == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (r9 == r7) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.e
            p.f1g1 r1 = (p.f1g1) r1
            byte r2 = r8.c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r2 == 0) goto L2b
            if (r2 == r6) goto L27
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1d
            p.hm5.M(r9)
            goto L9e
        L1d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r3
        L23:
            p.hm5.M(r9)
            goto L86
        L27:
            p.hm5.M(r9)
            goto L6b
        L2b:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.d
            p.ay61 r9 = (p.ay61) r9
            if (r9 == 0) goto L54
            java.lang.Object r8 = r8.f
            p.wa71 r8 = (p.wa71) r8
            java.util.Set r0 = p.f1g1.i
            p.j7s r0 = r1.c
            r0.c = r9
            r0.f = r8
            android.content.Context r8 = r1.a
            r9 = 2131963361(0x7f132de1, float:1.9563473E38)
            java.lang.String r8 = r8.getString(r9)
            r0.d = r8
            p.u771 r8 = r0.b()
            java.util.List r8 = java.util.Collections.singletonList(r8)
            return r8
        L54:
            java.util.Set r9 = p.s4b1.f
            p.blc0 r9 = p.blc0.M3
            boolean r9 = p.uic.g(r0, r9)
            if (r9 == 0) goto L8f
            java.lang.Object r9 = r8.g
            p.s2t r9 = (p.s2t) r9
            r8.c = r6
            java.lang.Object r9 = r9.Q(r8)
            if (r9 != r7) goto L6b
            goto L9d
        L6b:
            p.p0g1 r9 = (p.p0g1) r9
            if (r9 == 0) goto L89
            java.lang.String r2 = r9.b
            java.lang.String r9 = r9.c
            java.lang.String[] r9 = new java.lang.String[]{r0, r2, r9}
            java.util.Set r9 = p.dm61.B0(r9)
            r8.c = r5
            java.util.Set r0 = p.f1g1.i
            java.lang.Object r9 = r1.e(r9, r8)
            if (r9 != r7) goto L86
            goto L9d
        L86:
            r3 = r9
            java.util.List r3 = (java.util.List) r3
        L89:
            if (r3 != 0) goto L8e
            p.z6x r8 = p.z6x.a
            return r8
        L8e:
            return r3
        L8f:
            java.util.Set r9 = java.util.Collections.singleton(r0)
            r8.c = r4
            java.util.Set r0 = p.f1g1.i
            java.lang.Object r9 = r1.e(r9, r8)
            if (r9 != r7) goto L9e
        L9d:
            return r7
        L9e:
            java.util.List r9 = (java.util.List) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hgo0.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6 A[RETURN] */
    private final Object s(Object obj) {
        Object objB;
        String str;
        Object objA;
        PlaybackSettingsEsperantoService.ContentSettings contentSettings;
        String strP;
        String str2;
        php0 php0VarB;
        efb1 efb1Var;
        r4u0 r4u0Var = (r4u0) this.g;
        rng1 rng1Var = (rng1) this.f;
        bpb1 bpb1Var = rng1Var.e;
        bpb1 bpb1Var2 = rng1Var.d;
        vr20 vr20Var = (vr20) this.b;
        byte b = this.c;
        c4u0 c4u0Var = c4u0.W0;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            String str3 = (String) this.e;
            uu00 uu00Var = rng1Var.b;
            this.b = vr20Var;
            this.c = (byte) 1;
            objB = qon1.B(str3, uu00Var, "translation-language-state", this);
            if (objB != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            hm5.M(obj);
            objB = obj;
        } else {
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 3) {
                str = (String) this.d;
                hm5.M(obj);
                objA = obj;
                contentSettings = (PlaybackSettingsEsperantoService.ContentSettings) ((PlaybackSettingsEsperantoService.GetSettingsResponse) objA).o().get(str);
                if (contentSettings != null || (strP = contentSettings.p()) == null || strP.length() == 0) {
                    strP = null;
                }
                if (bpb1Var2.getValue() instanceof mng1) {
                    bpb1Var.l(strP);
                }
                this.b = vr20Var;
                this.d = str;
                this.c = (byte) 4;
                if (vr20Var.emit(strP, this) != d9nVar) {
                    str2 = str;
                }
                return d9nVar;
            }
            if (b != 4) {
                if (b == 5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = (String) this.d;
            hm5.M(obj);
        }
        php0VarB = r4u0Var.b(new c4u0[]{c4u0Var});
        efb1Var = new efb1(str2, rng1Var, vr20Var);
        this.b = null;
        this.d = null;
        this.c = (byte) 5;
        if (php0VarB.collect(efb1Var, this) != d9nVar) {
            return d9nVar;
        }
        return rih1Var;
        str = (String) objB;
        if (str == null) {
            if (bpb1Var2.getValue() instanceof mng1) {
                bpb1Var.l((Object) null);
            }
            this.b = null;
            this.d = null;
            this.c = (byte) 2;
            if (vr20Var.emit((Object) null, this) != d9nVar) {
                return rih1Var;
            }
        } else {
            this.b = vr20Var;
            this.d = str;
            this.c = (byte) 3;
            objA = r4u0Var.a(str, new c4u0[]{c4u0Var}, this);
            if (objA != d9nVar) {
                contentSettings = (PlaybackSettingsEsperantoService.ContentSettings) ((PlaybackSettingsEsperantoService.GetSettingsResponse) objA).o().get(str);
                if (contentSettings != null) {
                    strP = null;
                } else {
                    strP = null;
                }
                if (bpb1Var2.getValue() instanceof mng1) {
                    bpb1Var.l(strP);
                }
                this.b = vr20Var;
                this.d = str;
                this.c = (byte) 4;
                if (vr20Var.emit(strP, this) != d9nVar) {
                    str2 = str;
                    php0VarB = r4u0Var.b(new c4u0[]{c4u0Var});
                    efb1Var = new efb1(str2, rng1Var, vr20Var);
                    this.b = null;
                    this.d = null;
                    this.c = (byte) 5;
                    if (php0VarB.collect(efb1Var, this) != d9nVar) {
                        return rih1Var;
                    }
                }
            }
        }
        return d9nVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                hgo0 hgo0Var = new hgo0(this.f, obj2, lnmVar, (byte) 0);
                hgo0Var.b = obj;
                return hgo0Var;
            case 1:
                hgo0 hgo0Var2 = new hgo0(this.f, obj2, lnmVar, (byte) 1);
                hgo0Var2.e = obj;
                return hgo0Var2;
            case 2:
                hgo0 hgo0Var3 = new hgo0(this.f, obj2, lnmVar, (byte) 2);
                hgo0Var3.e = obj;
                return hgo0Var3;
            case 3:
                hgo0 hgo0Var4 = new hgo0(this.e, this.f, obj2, lnmVar, (byte) 3);
                hgo0Var4.b = obj;
                return hgo0Var4;
            case 4:
                hgo0 hgo0Var5 = new hgo0((poj0) this.d, (Map) this.e, (m9m) this.f, (lt20) obj2, lnmVar, (byte) 4);
                hgo0Var5.b = obj;
                return hgo0Var5;
            case 5:
                hgo0 hgo0Var6 = new hgo0(this.e, this.f, obj2, lnmVar, (byte) 5);
                hgo0Var6.b = obj;
                return hgo0Var6;
            case 6:
                hgo0 hgo0Var7 = new hgo0((m1x0) this.d, (z6x0) this.e, (n1r) this.f, (n1r) obj2, lnmVar, (byte) 6);
                hgo0Var7.b = obj;
                return hgo0Var7;
            case 7:
                hgo0 hgo0Var8 = new hgo0(this.f, obj2, lnmVar, (byte) 7);
                hgo0Var8.b = obj;
                return hgo0Var8;
            case 8:
                hgo0 hgo0Var9 = new hgo0(this.e, this.f, obj2, lnmVar, (byte) 8);
                hgo0Var9.b = obj;
                return hgo0Var9;
            case 9:
                hgo0 hgo0Var10 = new hgo0(this.e, this.f, obj2, lnmVar, (byte) 9);
                hgo0Var10.b = obj;
                return hgo0Var10;
            case 10:
                return new hgo0((byte) 10, (kdy0) this.d, (mzr0) this.e, (String) this.f, (String) this.b, (String) obj2, lnmVar);
            case 11:
                return new hgo0((byte) 11, (jl21) this.d, (lik1) this.e, (tv80) this.f, (String) this.b, (Map) obj2, lnmVar);
            case 12:
                hgo0 hgo0Var11 = new hgo0(this.e, this.f, obj2, lnmVar, (byte) 12);
                hgo0Var11.b = obj;
                return hgo0Var11;
            case 13:
                hgo0 hgo0Var12 = new hgo0(this.f, obj2, lnmVar, (byte) 13);
                hgo0Var12.e = obj;
                return hgo0Var12;
            case 14:
                hgo0 hgo0Var13 = new hgo0(this.f, obj2, lnmVar, (byte) 14);
                hgo0Var13.b = obj;
                return hgo0Var13;
            case 15:
                hgo0 hgo0Var14 = new hgo0(this.f, obj2, lnmVar, (byte) 15);
                hgo0Var14.b = obj;
                return hgo0Var14;
            case 16:
                return new hgo0((mzr0) this.e, (ykg1) this.f, (z0k0) this.b, (ykg1) obj2, lnmVar);
            case 17:
                return new hgo0((byte) 17, (ven0) this.d, (ysf0) this.e, (xtb0) this.f, (wat) this.b, (Function0) obj2, lnmVar);
            case 18:
                return new hgo0((jo51) this.f, this.b, (mhg1) obj2, lnmVar);
            case 19:
                return new hgo0((byte) 19, (ov20) this.d, (krh) this.e, (id81) this.f, (t2j0) this.b, (hd81) obj2, lnmVar);
            case 20:
                hgo0 hgo0Var15 = new hgo0(this.e, this.f, obj2, lnmVar, (byte) 20);
                hgo0Var15.b = obj;
                return hgo0Var15;
            case 21:
                return new hgo0((byte) 21, (qc91) this.d, (jx0) this.e, (be91) this.f, (Map) this.b, (String) obj2, lnmVar);
            case 22:
                hgo0 hgo0Var16 = new hgo0((Function0) obj2, lnmVar);
                hgo0Var16.f = obj;
                return hgo0Var16;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new hgo0((byte) 23, (cqa1) this.d, (zpa1) this.e, (String) this.f, (List) this.b, (List) obj2, lnmVar);
            case 24:
                hgo0 hgo0Var17 = new hgo0(this.f, obj2, lnmVar, (byte) 24);
                hgo0Var17.b = obj;
                return hgo0Var17;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                hgo0 hgo0Var18 = new hgo0(this.f, obj2, lnmVar, (byte) 25);
                hgo0Var18.b = obj;
                return hgo0Var18;
            case 26:
                hgo0 hgo0Var19 = new hgo0(this.f, obj2, lnmVar, (byte) 26);
                hgo0Var19.b = obj;
                return hgo0Var19;
            case 27:
                return new hgo0((byte) 27, (ay61) this.d, (f1g1) this.e, (wa71) this.f, (String) this.b, (s2t) obj2, lnmVar);
            case 28:
                hgo0 hgo0Var20 = new hgo0(this.e, this.f, obj2, lnmVar, (byte) 28);
                hgo0Var20.b = obj;
                return hgo0Var20;
            default:
                hgo0 hgo0Var21 = new hgo0(this.f, obj2, lnmVar, (byte) 29);
                hgo0Var21.b = obj;
                return hgo0Var21;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:257:0x0614  */
    /* JADX WARN: Code duplicated, block: B:260:0x062b  */
    /* JADX WARN: Code duplicated, block: B:262:0x062f  */
    /* JADX WARN: Code duplicated, block: B:317:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:318:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:323:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:521:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f4  */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0365, code lost:
    
        if (r2 == r9) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x099c, code lost:
    
        if (p.b5p1.j(r0, r1, r19) == r9) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0100, code lost:
    
        if (r2 == r9) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0194, code lost:
    
        if (p.hm5.I(r2, r1, r2, false, r4, r5, r19) == r9) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0203, code lost:
    
        if ((r1 - ((p.qtb0) p.o7h.A0(r2.h().l)).a) == 1) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 2842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hgo0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgo0(Object obj, Object obj2, Serializable serializable, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = serializable;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgo0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgo0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgo0(Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 22;
        this.g = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgo0(mzr0 mzr0Var, ykg1 ykg1Var, z0k0 z0k0Var, ykg1 ykg1Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 16;
        this.e = mzr0Var;
        this.f = ykg1Var;
        this.b = z0k0Var;
        this.g = ykg1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgo0(jo51 jo51Var, Object obj, mhg1 mhg1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 18;
        this.f = jo51Var;
        this.b = obj;
        this.g = mhg1Var;
    }
}
