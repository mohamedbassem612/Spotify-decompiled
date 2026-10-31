package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.liveeventslocation.v1.userlocation.StoreUserLocationRequest;
import com.spotify.liveeventslocation.v1.userlocation.StoreUserLocationResponse;
import com.spotify.mobius.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qk3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public int d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk3(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r6.emit(r12, r11) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f
            p.gp0 r0 = (p.gp0) r0
            byte r1 = r11.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L30
            if (r1 == r3) goto L20
            if (r1 != r2) goto L1a
            java.lang.Object r11 = r11.c
            p.vr20 r11 = (p.vr20) r11
            p.hm5.M(r12)
            goto L9e
        L1a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r4
        L20:
            int r1 = r11.d
            java.lang.Object r6 = r11.t
            p.vr20 r6 = (p.vr20) r6
            java.lang.Object r7 = r11.c
            p.vr20 r7 = (p.vr20) r7
            p.hm5.M(r12)     // Catch: java.lang.Throwable -> L2e
            goto L60
        L2e:
            r12 = move-exception
            goto L63
        L30:
            p.hm5.M(r12)
            java.lang.Object r12 = r11.c
            r6 = r12
            p.vr20 r6 = (p.vr20) r6
            java.lang.Object r12 = r11.e
            p.z8w r12 = (p.z8w) r12
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.invoke(r1)
            r1 = 0
            java.lang.Object r7 = r11.g     // Catch: java.lang.Throwable -> L2e
            p.q8n r7 = (p.q8n) r7     // Catch: java.lang.Throwable -> L2e
            p.xr00 r8 = new p.xr00     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r11.h     // Catch: java.lang.Throwable -> L2e
            p.bfd r9 = (p.bfd) r9     // Catch: java.lang.Throwable -> L2e
            r10 = 27
            r8.<init>(r9, r12, r4, r10)     // Catch: java.lang.Throwable -> L2e
            r11.c = r4     // Catch: java.lang.Throwable -> L2e
            r11.t = r6     // Catch: java.lang.Throwable -> L2e
            r11.d = r1     // Catch: java.lang.Throwable -> L2e
            r11.b = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r12 = p.fn31.Y(r7, r8, r11)     // Catch: java.lang.Throwable -> L2e
            if (r12 != r5) goto L60
            goto L9d
        L60:
            p.goe r12 = (p.goe) r12     // Catch: java.lang.Throwable -> L2e
            goto L69
        L63:
            p.m231 r7 = new p.m231
            r7.<init>(r12)
            r12 = r7
        L69:
            java.lang.Throwable r7 = p.e331.a(r12)
            if (r7 != 0) goto L7e
            p.goe r12 = (p.goe) r12
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r0.invoke(r12)
            java.lang.Object r11 = r11.i
            p.wq9 r11 = (p.wq9) r11
            r11.invoke()
            goto L9e
        L7e:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r0.invoke(r12)
            p.o8n r12 = r11.getContext()
            p.op71.x(r12)
            p.zm50 r12 = new p.zm50
            r12.<init>(r3)
            r11.c = r4
            r11.t = r4
            r11.d = r1
            r11.b = r2
            java.lang.Object r11 = r6.emit(r12, r11)
            if (r11 != r5) goto L9e
        L9d:
            return r5
        L9e:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qk3.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0111 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    private final Object g(Object obj) {
        ?? r4;
        xle0 xle0Var;
        vr20 vr20Var;
        dke0 dke0Var;
        Object objB;
        vr20 vr20Var2;
        xle0 xle0Var2;
        int i = this.b;
        rih1 rih1Var = rih1.a;
        ?? r6 = 1;
        d9n d9nVar = d9n.a;
        try {
            if (i == 0) {
                hm5.M(obj);
                vr20Var = (vr20) this.c;
                dke0Var = (dke0) this.e;
                if (dke0Var.c.equals(jj40.c)) {
                    eg.m("Location is empty");
                    return null;
                }
                try {
                    im01 im01Var = (im01) this.f;
                    jj40 jj40Var = dke0Var.c;
                    fm01 fm01Var = new fm01(jj40Var.b, jj40Var.a);
                    this.c = null;
                    this.h = dke0Var;
                    this.i = vr20Var;
                    this.d = 0;
                    this.b = (byte) 1;
                    Object objJ = im01Var.a.j(fm01Var, this);
                    if (objJ != d9nVar) {
                        objJ = rih1Var;
                    }
                    if (objJ != d9nVar) {
                        i = 0;
                        uo5 uo5Var = (uo5) this.g;
                        int i2 = dke0Var.c.b;
                        this.c = null;
                        this.h = null;
                        this.i = vr20Var;
                        this.t = vr20Var;
                        this.d = i;
                        this.b = (byte) 2;
                        c3c1 c3c1VarN = StoreUserLocationRequest.n();
                        c3c1VarN.n(String.valueOf(i2));
                        StoreUserLocationRequest storeUserLocationRequestBuild = c3c1VarN.build();
                        cpd0 cpd0Var = (cpd0) uo5Var.b;
                        storeUserLocationRequestBuild.getClass();
                        objB = cpd0Var.b(storeUserLocationRequestBuild, this);
                        if (objB != d9nVar) {
                            vr20 vr20Var3 = vr20Var;
                            obj = objB;
                            vr20Var2 = vr20Var3;
                            r6 = vr20Var3;
                            xle0Var2 = new xle0(((StoreUserLocationResponse) obj).n());
                            this.c = null;
                            this.h = null;
                            this.i = r6;
                            this.t = null;
                            this.d = i;
                            this.b = (byte) 3;
                            if (vr20Var2.emit(xle0Var2, this) != d9nVar) {
                                return rih1Var;
                            }
                        }
                    }
                } catch (Exception unused) {
                    r4 = vr20Var;
                    i = 0;
                    xle0Var = new xle0(false);
                    this.c = null;
                    this.h = null;
                    this.i = null;
                    this.t = null;
                    this.d = i;
                    this.b = (byte) 4;
                    if (r4.emit(xle0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                }
                return d9nVar;
            }
            if (i == 1) {
                i = this.d;
                vr20 vr20Var4 = (vr20) this.i;
                dke0Var = (dke0) this.h;
                hm5.M(obj);
                vr20Var = vr20Var4;
                try {
                    uo5 uo5Var2 = (uo5) this.g;
                    int i3 = dke0Var.c.b;
                    this.c = null;
                    this.h = null;
                    this.i = vr20Var;
                    this.t = vr20Var;
                    this.d = i;
                    this.b = (byte) 2;
                    c3c1 c3c1VarN2 = StoreUserLocationRequest.n();
                    c3c1VarN2.n(String.valueOf(i3));
                    StoreUserLocationRequest storeUserLocationRequestBuild2 = c3c1VarN2.build();
                    cpd0 cpd0Var2 = (cpd0) uo5Var2.b;
                    storeUserLocationRequestBuild2.getClass();
                    objB = cpd0Var2.b(storeUserLocationRequestBuild2, this);
                    if (objB != d9nVar) {
                        vr20 vr20Var5 = vr20Var;
                        obj = objB;
                        vr20Var2 = vr20Var5;
                        r6 = vr20Var5;
                        xle0Var2 = new xle0(((StoreUserLocationResponse) obj).n());
                        this.c = null;
                        this.h = null;
                        this.i = r6;
                        this.t = null;
                        this.d = i;
                        this.b = (byte) 3;
                        if (vr20Var2.emit(xle0Var2, this) != d9nVar) {
                        }
                    }
                } catch (Exception unused2) {
                    r4 = vr20Var;
                    xle0Var = new xle0(false);
                    this.c = null;
                    this.h = null;
                    this.i = null;
                    this.t = null;
                    this.d = i;
                    this.b = (byte) 4;
                    if (r4.emit(xle0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return d9nVar;
            }
            if (i == 2) {
                i = this.d;
                vr20 vr20Var6 = (vr20) this.t;
                vr20 vr20Var7 = (vr20) this.i;
                hm5.M(obj);
                vr20Var2 = vr20Var6;
                r6 = vr20Var7;
                xle0Var2 = new xle0(((StoreUserLocationResponse) obj).n());
                this.c = null;
                this.h = null;
                this.i = r6;
                this.t = null;
                this.d = i;
                this.b = (byte) 3;
                if (vr20Var2.emit(xle0Var2, this) != d9nVar) {
                    return d9nVar;
                }
            } else if (i == 3) {
                i = this.d;
                r4 = (vr20) this.i;
                try {
                    hm5.M(obj);
                } catch (Exception unused3) {
                    xle0Var = new xle0(false);
                    this.c = null;
                    this.h = null;
                    this.i = null;
                    this.t = null;
                    this.d = i;
                    this.b = (byte) 4;
                    if (r4.emit(xle0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                }
            } else {
                if (i != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1Var;
        } catch (Exception unused4) {
            r4 = r6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (r3.emit(r12, r11) == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f
            p.gp0 r0 = (p.gp0) r0
            byte r1 = r11.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L30
            if (r1 == r3) goto L20
            if (r1 != r2) goto L1a
            java.lang.Object r11 = r11.c
            p.vr20 r11 = (p.vr20) r11
            p.hm5.M(r12)
            goto La4
        L1a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r4
        L20:
            int r1 = r11.d
            java.lang.Object r3 = r11.t
            p.vr20 r3 = (p.vr20) r3
            java.lang.Object r6 = r11.c
            p.vr20 r6 = (p.vr20) r6
            p.hm5.M(r12)     // Catch: java.lang.Throwable -> L2e
            goto L62
        L2e:
            r12 = move-exception
            goto L69
        L30:
            p.hm5.M(r12)
            java.lang.Object r12 = r11.c
            p.vr20 r12 = (p.vr20) r12
            java.lang.Object r1 = r11.e
            p.a9w r1 = (p.a9w) r1
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.invoke(r6)
            r6 = 0
            java.lang.Object r7 = r11.g     // Catch: java.lang.Throwable -> L65
            p.q8n r7 = (p.q8n) r7     // Catch: java.lang.Throwable -> L65
            p.cto0 r8 = new p.cto0     // Catch: java.lang.Throwable -> L65
            java.lang.Object r9 = r11.h     // Catch: java.lang.Throwable -> L65
            p.bfd r9 = (p.bfd) r9     // Catch: java.lang.Throwable -> L65
            r10 = 8
            r8.<init>(r9, r1, r4, r10)     // Catch: java.lang.Throwable -> L65
            r11.c = r4     // Catch: java.lang.Throwable -> L65
            r11.t = r12     // Catch: java.lang.Throwable -> L65
            r11.d = r6     // Catch: java.lang.Throwable -> L65
            r11.b = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = p.fn31.Y(r7, r8, r11)     // Catch: java.lang.Throwable -> L65
            if (r1 != r5) goto L5f
            goto La3
        L5f:
            r3 = r12
            r12 = r1
            r1 = r6
        L62:
            p.goe r12 = (p.goe) r12     // Catch: java.lang.Throwable -> L2e
            goto L6f
        L65:
            r1 = move-exception
            r3 = r12
            r12 = r1
            r1 = r6
        L69:
            p.m231 r6 = new p.m231
            r6.<init>(r12)
            r12 = r6
        L6f:
            java.lang.Throwable r6 = p.e331.a(r12)
            if (r6 != 0) goto L84
            p.goe r12 = (p.goe) r12
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r0.invoke(r12)
            java.lang.Object r11 = r11.i
            p.wq9 r11 = (p.wq9) r11
            r11.invoke()
            goto La4
        L84:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r0.invoke(r12)
            p.o8n r12 = r11.getContext()
            p.op71.x(r12)
            p.slp0 r12 = new p.slp0
            r12.<init>()
            r11.c = r4
            r11.t = r4
            r11.d = r1
            r11.b = r2
            java.lang.Object r11 = r3.emit(r12, r11)
            if (r11 != r5) goto La4
        La3:
            return r5
        La4:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qk3.h(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qk3 qk3Var = new qk3((bl3) this.f, (nk3) this.t, (String) this.h, lnmVar);
                qk3Var.c = obj;
                return qk3Var;
            case 1:
                qk3 qk3Var2 = new qk3((byte) 1, this.e, (gp0) this.f, (q8n) this.g, (bfd) this.h, (wq9) this.i, lnmVar);
                qk3Var2.c = obj;
                return qk3Var2;
            case 2:
                qk3 qk3Var3 = new qk3((byte) 2, this.e, (gp0) this.f, (q8n) this.g, (bfd) this.h, (s1q0) this.i, lnmVar);
                qk3Var3.c = obj;
                return qk3Var3;
            case 3:
                qk3 qk3Var4 = new qk3(this.e, lnmVar, (dg8) this.f, (rm5) this.g, (xrk) this.h, (byte) 3);
                qk3Var4.c = obj;
                return qk3Var4;
            case 4:
                qk3 qk3Var5 = new qk3(this.e, lnmVar, (rm5) this.f, (kt91) this.g, (Context) this.h, (byte) 4);
                qk3Var5.c = obj;
                return qk3Var5;
            case 5:
                qk3 qk3Var6 = new qk3(this.e, lnmVar, (ps7) this.f, (npk) this.g, (cfd) this.h, (byte) 5);
                qk3Var6.c = obj;
                return qk3Var6;
            case 6:
                qk3 qk3Var7 = new qk3(this.e, lnmVar, (mu10) this.f, (Consumer) this.g, (byte) 6);
                qk3Var7.c = obj;
                return qk3Var7;
            case 7:
                qk3 qk3Var8 = new qk3(this.e, lnmVar, (mu10) this.f, (Consumer) this.g, (byte) 7);
                qk3Var8.c = obj;
                return qk3Var8;
            case 8:
                return new qk3((uy10) this.t, (String) this.h, (Set) this.c, lnmVar);
            case 9:
                qk3 qk3Var9 = new qk3((byte) 9, this.e, (gp0) this.f, (q8n) this.g, (bfd) this.h, (wq9) this.i, lnmVar);
                qk3Var9.c = obj;
                return qk3Var9;
            case 10:
                qk3 qk3Var10 = new qk3(this.e, lnmVar, (im01) this.f, (uo5) this.g, (byte) 10);
                qk3Var10.c = obj;
                return qk3Var10;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                qk3 qk3Var11 = new qk3((byte) 11, this.e, (gp0) this.f, (q8n) this.g, (bfd) this.h, (wq9) this.i, lnmVar);
                qk3Var11.c = obj;
                return qk3Var11;
            case grn1.d /* 12 */:
                return new qk3((in71) this.i, (ajk1) this.t, (wls0) this.c, lnmVar);
            default:
                qk3 qk3Var12 = new qk3((byte) 13, this.e, (add) this.f, (bfd) this.g, (q8n) this.h, (lzn0) this.i, lnmVar);
                qk3Var12.c = obj;
                return qk3Var12;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:159:0x039a  */
    /* JADX WARN: Code duplicated, block: B:221:0x0573  */
    /* JADX WARN: Code duplicated, block: B:257:0x0674  */
    /* JADX WARN: Code duplicated, block: B:258:0x0676 A[Catch: Exception -> 0x06a7, PHI: r2 r3 r8 r11
      0x0676: PHI (r2v22 ??) = (r2v95 ??), (r2v25 ??) binds: [B:256:0x0672, B:246:0x061c] A[DONT_GENERATE, DONT_INLINE]
      0x0676: PHI (r3v22 int) = (r3v18 int), (r3v26 int) binds: [B:256:0x0672, B:246:0x061c] A[DONT_GENERATE, DONT_INLINE]
      0x0676: PHI (r8v9 p.y6k) = (r8v6 p.y6k), (r8v11 p.y6k) binds: [B:256:0x0672, B:246:0x061c] A[DONT_GENERATE, DONT_INLINE]
      0x0676: PHI (r11v2 java.lang.Object) = (r11v1 java.lang.Object), (r11v8 java.lang.Object) binds: [B:256:0x0672, B:246:0x061c] A[DONT_GENERATE, DONT_INLINE], TryCatch #11 {Exception -> 0x06a7, blocks: (B:271:0x06c2, B:273:0x06cc, B:276:0x06d1, B:268:0x06ab, B:258:0x0676, B:260:0x0682, B:255:0x0662), top: B:392:0x0662 }] */
    /* JADX WARN: Code duplicated, block: B:260:0x0682 A[Catch: Exception -> 0x06a7, TryCatch #11 {Exception -> 0x06a7, blocks: (B:271:0x06c2, B:273:0x06cc, B:276:0x06d1, B:268:0x06ab, B:258:0x0676, B:260:0x0682, B:255:0x0662), top: B:392:0x0662 }] */
    /* JADX WARN: Code duplicated, block: B:262:0x069b  */
    /* JADX WARN: Code duplicated, block: B:263:0x069d  */
    /* JADX WARN: Code duplicated, block: B:267:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:270:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:271:0x06c2 A[Catch: Exception -> 0x06a7, PHI: r0 r2 r3 r5
      0x06c2: PHI (r0v95 java.lang.Object) = (r0v93 java.lang.Object), (r0v103 java.lang.Object) binds: [B:269:0x06bf, B:238:0x05eb] A[DONT_GENERATE, DONT_INLINE]
      0x06c2: PHI (r2v31 ??) = (r2v93 ??), (r2v33 ??) binds: [B:269:0x06bf, B:238:0x05eb] A[DONT_GENERATE, DONT_INLINE]
      0x06c2: PHI (r3v33 int) = (r3v27 int), (r3v36 int) binds: [B:269:0x06bf, B:238:0x05eb] A[DONT_GENERATE, DONT_INLINE]
      0x06c2: PHI (r5v21 p.y6k) = (r5v17 p.y6k), (r5v24 p.y6k) binds: [B:269:0x06bf, B:238:0x05eb] A[DONT_GENERATE, DONT_INLINE], TryCatch #11 {Exception -> 0x06a7, blocks: (B:271:0x06c2, B:273:0x06cc, B:276:0x06d1, B:268:0x06ab, B:258:0x0676, B:260:0x0682, B:255:0x0662), top: B:392:0x0662 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x06cc A[Catch: Exception -> 0x06a7, TryCatch #11 {Exception -> 0x06a7, blocks: (B:271:0x06c2, B:273:0x06cc, B:276:0x06d1, B:268:0x06ab, B:258:0x0676, B:260:0x0682, B:255:0x0662), top: B:392:0x0662 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:371:0x0903  */
    /* JADX WARN: Code duplicated, block: B:372:0x0905  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0205, code lost:
    
        if (r1 == r9) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v14, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, p.vr20] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, p.vr20] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v79, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qk3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk3(Object obj, lnm lnmVar, Object obj2, Object obj3, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk3(Object obj, lnm lnmVar, Object obj2, Object obj3, Object obj4, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk3(bl3 bl3Var, nk3 nk3Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.f = bl3Var;
        this.t = nk3Var;
        this.h = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk3(uy10 uy10Var, String str, Set set, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.t = uy10Var;
        this.h = str;
        this.c = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk3(in71 in71Var, ajk1 ajk1Var, wls0 wls0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.i = in71Var;
        this.t = ajk1Var;
        this.c = wls0Var;
    }
}
