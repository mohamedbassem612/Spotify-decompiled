package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w621 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w621(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[Catch: Exception -> 0x0034, CancellationException -> 0x00dd, TryCatch #2 {CancellationException -> 0x00dd, Exception -> 0x0034, blocks: (B:16:0x0037, B:30:0x0074, B:32:0x0082, B:34:0x0093, B:36:0x0097, B:39:0x00b0, B:12:0x0030, B:19:0x0040, B:21:0x0046, B:24:0x004c, B:27:0x0069), top: B:48:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: Exception -> 0x0034, CancellationException -> 0x00dd, TryCatch #2 {CancellationException -> 0x00dd, Exception -> 0x0034, blocks: (B:16:0x0037, B:30:0x0074, B:32:0x0082, B:34:0x0093, B:36:0x0097, B:39:0x00b0, B:12:0x0030, B:19:0x0040, B:21:0x0046, B:24:0x004c, B:27:0x0069), top: B:48:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0097 A[Catch: Exception -> 0x0034, CancellationException -> 0x00dd, TryCatch #2 {CancellationException -> 0x00dd, Exception -> 0x0034, blocks: (B:16:0x0037, B:30:0x0074, B:32:0x0082, B:34:0x0093, B:36:0x0097, B:39:0x00b0, B:12:0x0030, B:19:0x0040, B:21:0x0046, B:24:0x004c, B:27:0x0069), top: B:48:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0 A[Catch: Exception -> 0x0034, CancellationException -> 0x00dd, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00dd, Exception -> 0x0034, blocks: (B:16:0x0037, B:30:0x0074, B:32:0x0082, B:34:0x0093, B:36:0x0097, B:39:0x00b0, B:12:0x0030, B:19:0x0040, B:21:0x0046, B:24:0x004c, B:27:0x0069), top: B:48:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00db A[RETURN] */
    private final Object e(Object obj) {
        Object objE;
        chh1 chh1Var;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ytm0 ytm0Var;
        aum0 aum0Var;
        kjg1 kjg1Var = (kjg1) this.c;
        String str = (String) this.d;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (b != 0) {
                if (b != 1) {
                    if (b == 2) {
                        hm5.M(obj);
                        objE = obj;
                        chh1Var = (ehh1) objE;
                        linkedHashMap = kjg1Var.h;
                        linkedHashMap2 = kjg1Var.h;
                        if (linkedHashMap.get(str) == jjg1.b) {
                            linkedHashMap2.remove(str);
                            linkedHashMap2.remove(str);
                            fn31.T(kjg1Var.f, (o8n) null, 0, new p230(kjg1Var, str, false, (lnm) null), 3);
                            return rih1Var;
                        }
                        if (chh1Var instanceof dhh1) {
                            aum0Var = new aum0(null, Collections.singletonList(str), null, null, 13);
                            this.b = (byte) 3;
                            if (kjg1Var.a(str, aum0Var, this) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            ytm0Var = new ytm0(chh1Var.a);
                            this.b = (byte) 4;
                            if (kjg1Var.a(str, ytm0Var, this) != d9nVar) {
                                return d9nVar;
                            }
                        }
                    } else if (b != 3 && b != 4) {
                        if (b != 5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                }
                hm5.M(obj);
                return rih1Var;
            }
            hm5.M(obj);
            ajg1 ajg1Var = kjg1Var.b.U0;
            String str2 = ajg1Var != null ? ajg1Var.c : null;
            if (str2 == null) {
                Logger.d("TransitionOperationLauncher: no transition info for removal", new Object[0]);
                ytm0 ytm0Var2 = new ytm0(new IllegalStateException("No transition info for removal"));
                this.b = (byte) 1;
                if (kjg1Var.a(str, ytm0Var2, this) == d9nVar) {
                }
                return rih1Var;
            }
            cig1 cig1Var = kjg1Var.a;
            this.b = (byte) 2;
            objE = cig1Var.e(str2, str, this);
            if (objE != d9nVar) {
                chh1Var = (ehh1) objE;
                linkedHashMap = kjg1Var.h;
                linkedHashMap2 = kjg1Var.h;
                if (linkedHashMap.get(str) == jjg1.b) {
                    linkedHashMap2.remove(str);
                    linkedHashMap2.remove(str);
                    fn31.T(kjg1Var.f, (o8n) null, 0, new p230(kjg1Var, str, false, (lnm) null), 3);
                    return rih1Var;
                }
                if (chh1Var instanceof dhh1) {
                    aum0Var = new aum0(null, Collections.singletonList(str), null, null, 13);
                    this.b = (byte) 3;
                    if (kjg1Var.a(str, aum0Var, this) == d9nVar) {
                    }
                    return rih1Var;
                }
                ytm0Var = new ytm0(chh1Var.a);
                this.b = (byte) 4;
                if (kjg1Var.a(str, ytm0Var, this) != d9nVar) {
                    return rih1Var;
                }
            }
            return d9nVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Transition removal failed for %s", new Object[]{str});
            kjg1Var.getClass();
            ytm0 ytm0Var3 = new ytm0(e2);
            this.b = (byte) 5;
            if (kjg1Var.a(str, ytm0Var3, this) == d9nVar) {
                return d9nVar;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r9.c(r1, p.y8k0.a, r0, r8) == r7) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            p.tv80 r0 = (p.tv80) r0
            java.lang.Object r1 = r8.c
            p.alg1 r1 = (p.alg1) r1
            java.lang.Object r2 = r1.b
            p.cbk0 r2 = (p.cbk0) r2
            byte r3 = r8.b
            r4 = 3
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L2e
            if (r3 == r6) goto L2a
            if (r3 == r5) goto L26
            if (r3 != r4) goto L1f
            p.hm5.M(r9)
            goto L6a
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L26:
            p.hm5.M(r9)
            goto L51
        L2a:
            p.hm5.M(r9)
            goto L40
        L2e:
            p.hm5.M(r9)
            java.lang.Object r9 = r1.d
            p.cdk0 r9 = (p.cdk0) r9
            r8.b = r6
            p.ldk0 r9 = (p.ldk0) r9
            java.lang.Object r9 = r9.h(r8)
            if (r9 != r7) goto L40
            goto L69
        L40:
            if (r0 == 0) goto L6a
            java.lang.Object r9 = r1.f
            p.fgk0 r9 = (p.fgk0) r9
            java.lang.String r3 = r2.a
            r8.b = r5
            java.lang.Object r9 = r9.a(r3, r8)
            if (r9 != r7) goto L51
            goto L69
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6a
            java.lang.Object r9 = r1.e
            p.h9k0 r9 = (p.h9k0) r9
            java.lang.String r1 = r2.a
            r8.b = r4
            p.y8k0 r2 = p.y8k0.a
            java.lang.Object r8 = r9.c(r1, r2, r0, r8)
            if (r8 != r7) goto L6a
        L69:
            return r7
        L6a:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w621.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (p.op71.p(r5, r4) == r3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r5) {
        /*
            r4 = this;
            byte r0 = r4.b
            r1 = 2
            r2 = 1
            p.d9n r3 = p.d9n.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            p.hm5.M(r5)
            goto L44
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            r4 = 0
            return r4
        L17:
            p.hm5.M(r5)
            goto L31
        L1b:
            p.hm5.M(r5)
            java.lang.Object r5 = r4.c
            p.n2o r5 = (p.n2o) r5
            java.lang.Object r5 = r5.d
            p.xab1 r5 = (p.xab1) r5
            if (r5 == 0) goto L31
            r4.b = r2
            java.lang.Object r5 = p.op71.p(r5, r4)
            if (r5 != r3) goto L31
            goto L43
        L31:
            java.lang.Object r5 = r4.d
            p.a5f1 r5 = (p.a5f1) r5
            java.lang.Object r5 = r5.b
            p.xab1 r5 = (p.xab1) r5
            if (r5 == 0) goto L44
            r4.b = r1
            java.lang.Object r4 = p.op71.p(r5, r4)
            if (r4 != r3) goto L44
        L43:
            return r3
        L44:
            p.rih1 r4 = p.rih1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w621.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        if (r1.a(r9) == r8) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            p.wok1 r0 = (p.wok1) r0
            p.ty60 r1 = r0.i
            byte r2 = r9.b
            r3 = 4
            r4 = 2
            r5 = 1
            r6 = 3
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 == r4) goto L31
            if (r2 == r6) goto L2b
            if (r2 == r3) goto L1f
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r7
        L1f:
            java.lang.Object r9 = r9.c
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L28
            goto L93
        L28:
            r9 = move-exception
            goto L97
        L2b:
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L2f
            goto L64
        L2f:
            r9 = move-exception
            goto L6a
        L31:
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            goto L58
        L35:
            r10 = move-exception
            goto L84
        L37:
            r10 = move-exception
            goto L6e
        L39:
            p.hm5.M(r10)
            p.b1y r10 = r0.f     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            p.lm4 r10 = r10.a     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            boolean r10 = r10.n()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            if (r10 == 0) goto L4f
            r9.b = r5     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            java.lang.Object r10 = r0.g(r9)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            if (r10 != r8) goto L58
            goto L91
        L4f:
            r9.b = r4     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            java.lang.Object r10 = r0.f(r9)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            if (r10 != r8) goto L58
            goto L91
        L58:
            r1.g()     // Catch: java.lang.Throwable -> L2f
            r9.b = r6     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = r1.a(r9)     // Catch: java.lang.Throwable -> L2f
            if (r9 != r8) goto L64
            goto L91
        L64:
            r1.b()
            p.rih1 r9 = p.rih1.a
            return r9
        L6a:
            r1.b()
            throw r9
        L6e:
            p.o8n r2 = r9.getContext()     // Catch: java.lang.Throwable -> L35
            p.op71.x(r2)     // Catch: java.lang.Throwable -> L35
            p.wen0 r2 = r0.h     // Catch: java.lang.Throwable -> L35
            p.a090 r4 = p.a090.a     // Catch: java.lang.Throwable -> L35
            p.bpb1 r2 = (p.bpb1) r2     // Catch: java.lang.Throwable -> L35
            r2.m(r7, r4)     // Catch: java.lang.Throwable -> L35
            p.zeu r0 = r0.g     // Catch: java.lang.Throwable -> L35
            r0.v(r7)     // Catch: java.lang.Throwable -> L35
            throw r10     // Catch: java.lang.Throwable -> L35
        L84:
            r1.g()     // Catch: java.lang.Throwable -> L28
            r9.c = r10     // Catch: java.lang.Throwable -> L28
            r9.b = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = r1.a(r9)     // Catch: java.lang.Throwable -> L28
            if (r9 != r8) goto L92
        L91:
            return r8
        L92:
            r9 = r10
        L93:
            r1.b()
            throw r9
        L97:
            r1.b()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w621.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r0.emit(r1, r7) == r5) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r7.b
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            p.hm5.M(r8)
            goto L79
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L1b:
            p.hm5.M(r8)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            goto L3b
        L1f:
            r8 = move-exception
            goto L6a
        L21:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.d     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            p.bxk1 r8 = (p.bxk1) r8     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            p.gvk1 r1 = r8.a     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            p.hwk1 r8 = r8.b     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            java.lang.String r6 = r8.a     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            java.lang.String r8 = r8.b     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            r7.c = r0     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            r7.b = r4     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            java.lang.Object r8 = r1.a(r6, r8, r7)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            if (r8 != r5) goto L3b
            goto L78
        L3b:
            p.cwk1 r8 = (p.cwk1) r8     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            boolean r1 = r8 instanceof p.awk1     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            if (r1 == 0) goto L47
            p.c5e0 r1 = new p.c5e0     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            goto L6e
        L47:
            boolean r1 = r8 instanceof p.zvk1     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            if (r1 == 0) goto L58
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            java.lang.String r1 = "Results state without redirect_uri"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            p.m5e0 r1 = new p.m5e0     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            goto L6e
        L58:
            boolean r1 = r8 instanceof p.bwk1     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            if (r1 == 0) goto L62
            p.f5e0 r1 = new p.f5e0     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            goto L6e
        L62:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            r8.<init>()     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
            throw r8     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L68
        L68:
            r7 = move-exception
            goto L7c
        L6a:
            p.o5e0 r1 = p.q3p1.o(r8)
        L6e:
            r7.c = r2
            r7.b = r3
            java.lang.Object r7 = r0.emit(r1, r7)
            if (r7 != r5) goto L79
        L78:
            return r5
        L79:
            p.rih1 r7 = p.rih1.a
            return r7
        L7c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w621.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r8.collect(r0, r7) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            p.rnh r0 = (p.rnh) r0
            java.lang.Object r1 = r7.c
            p.g2x0 r1 = (p.g2x0) r1
            byte r2 = r7.b
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L18
            p.hm5.M(r8)
            goto L66
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L1f:
            p.hm5.M(r8)
            goto L4a
        L23:
            p.hm5.M(r8)
            java.lang.Object r8 = r1.b
            io.reactivex.rxjava3.core.Flowable r8 = (io.reactivex.rxjava3.core.Flowable) r8
            p.qeh1 r2 = new p.qeh1
            r6 = 10
            r2.<init>(r0, r6)
            io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter r8 = r8.x(r2)
            p.i5x0 r2 = p.i5x0.W0
            io.reactivex.rxjava3.internal.operators.flowable.FlowableMap r8 = r8.J(r2)
            java.lang.String r2 = ""
            io.reactivex.rxjava3.core.Single r8 = r8.y(r2)
            r7.b = r4
            java.lang.Object r8 = p.fc11.j(r8, r7)
            if (r8 != r5) goto L4a
            goto L65
        L4a:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r1.c
            p.pn0 r1 = (p.pn0) r1
            java.lang.String r0 = r0.a
            r8.getClass()
            p.rn0 r1 = (p.rn0) r1
            p.ezc r8 = r1.b(r0, r8)
            p.ft1 r0 = p.ft1.h
            r7.b = r3
            java.lang.Object r7 = r8.collect(r0, r7)
            if (r7 != r5) goto L66
        L65:
            return r5
        L66:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w621.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (p.rc2.N(r7, r10, r9) == r6) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            p.h5l1 r0 = (p.h5l1) r0
            java.lang.Object r1 = r9.c
            p.c9n r1 = (p.c9n) r1
            byte r2 = r9.b
            r3 = 1
            r4 = 0
            r5 = 2
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L23
            if (r2 == r3) goto L1f
            if (r2 != r5) goto L19
            p.hm5.M(r10)
            return r10
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r4
        L1f:
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L41
            goto L44
        L23:
            p.hm5.M(r10)
            p.ytw0 r10 = p.jfv.b     // Catch: java.lang.Exception -> L41
            p.ngv r10 = p.ngv.e     // Catch: java.lang.Exception -> L41
            r2 = 3
            long r7 = p.fdg1.k0(r2, r10)     // Catch: java.lang.Exception -> L41
            p.fkj1 r10 = new p.fkj1     // Catch: java.lang.Exception -> L41
            r2 = 11
            r10.<init>(r0, r4, r2)     // Catch: java.lang.Exception -> L41
            r9.c = r1     // Catch: java.lang.Exception -> L41
            r9.b = r3     // Catch: java.lang.Exception -> L41
            java.lang.Object r10 = p.rc2.N(r7, r10, r9)     // Catch: java.lang.Exception -> L41
            if (r10 != r6) goto L44
            goto L54
        L41:
            p.smo1.t(r1)
        L44:
            p.fmy0 r10 = r0.a
            io.reactivex.rxjava3.core.Single r10 = p.fmy0.a(r10)
            r9.c = r4
            r9.b = r5
            java.lang.Object r9 = p.fc11.j(r10, r9)
            if (r9 != r6) goto L55
        L54:
            return r6
        L55:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w621.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (p.jkr0.g(r0, r9, r1, r8, 2) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            p.jkr0 r0 = (p.jkr0) r0
            byte r1 = r8.b
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            p.hm5.M(r9)
            goto L72
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L1b:
            p.hm5.M(r9)
            goto L4e
        L1f:
            p.hm5.M(r9)
            int r9 = r0.l()
            p.kl1 r1 = r0.d
            java.lang.Object r1 = r1.c
            p.err0 r1 = (p.err0) r1
            int r1 = r1.s()
            int r1 = r1 + r4
            if (r9 <= r1) goto L72
            java.lang.Object r9 = r8.d
            p.ven0 r9 = (p.ven0) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L72
            r8.b = r4
            r6 = 100
            java.lang.Object r9 = p.hap1.i(r6, r8)
            if (r9 != r5) goto L4e
            goto L71
        L4e:
            p.jns r9 = r0.k
            boolean r9 = r9.b()
            if (r9 != 0) goto L72
            p.kl1 r9 = r0.d
            java.lang.Object r9 = r9.c
            p.err0 r9 = (p.err0) r9
            int r9 = r9.s()
            int r9 = r9 + r4
            r1 = 1128792064(0x43480000, float:200.0)
            r4 = 5
            r6 = 0
            p.n8b1 r1 = p.irn1.l0(r6, r1, r2, r4)
            r8.b = r3
            java.lang.Object r8 = p.jkr0.g(r0, r9, r1, r8, r3)
            if (r8 != r5) goto L72
        L71:
            return r5
        L72:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w621.p(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new w621((x621) this.c, (String) obj2, lnmVar, (byte) 0);
            case 1:
                return new w621((rn3) this.c, (bo31) obj2, lnmVar, (byte) 1);
            case 2:
                return new w621((lz31) this.c, (String) obj2, lnmVar, (byte) 2);
            case 3:
                return new w621((ty51) obj2, lnmVar, (byte) 3);
            case 4:
                return new w621((rb61) this.c, (o95) obj2, lnmVar, (byte) 4);
            case 5:
                return new w621((pbg) this.c, (bpb1) obj2, lnmVar, (byte) 5);
            case 6:
                return new w621((y441) obj2, lnmVar, (byte) 6);
            case 7:
                w621 w621Var = new w621((h191) obj2, lnmVar, (byte) 7);
                w621Var.c = obj;
                return w621Var;
            case 8:
                return new w621((ayb1) this.c, (String) obj2, lnmVar, (byte) 8);
            case 9:
                w621 w621Var2 = new w621((ayb1) obj2, lnmVar, (byte) 9);
                w621Var2.c = obj;
                return w621Var2;
            case 10:
                w621 w621Var3 = new w621((esa1) obj2, lnmVar, (byte) 10);
                w621Var3.c = obj;
                return w621Var3;
            case 11:
                return new w621((ua91) this.c, (Uri) obj2, lnmVar, (byte) 11);
            case 12:
                return new w621((ven0) this.c, (ven0) obj2, lnmVar, (byte) 12);
            case 13:
                w621 w621Var4 = new w621((n2d1) obj2, lnmVar, (byte) 13);
                w621Var4.c = obj;
                return w621Var4;
            case 14:
                return new w621((b4d1) this.c, (o95) obj2, lnmVar, (byte) 14);
            case 15:
                w621 w621Var5 = new w621((b4d1) obj2, lnmVar, (byte) 15);
                w621Var5.c = obj;
                return w621Var5;
            case 16:
                return new w621((faa0) this.c, (p9w0) obj2, lnmVar, (byte) 16);
            case 17:
                return new w621((es41) this.c, (j5c) obj2, lnmVar, (byte) 17);
            case 18:
                w621 w621Var6 = new w621((yqg) obj2, lnmVar, (byte) 18);
                w621Var6.c = obj;
                return w621Var6;
            case 19:
                return new w621((jfe) this.c, (String) obj2, lnmVar, (byte) 19);
            case 20:
                w621 w621Var7 = new w621((c9n) obj2, lnmVar, (byte) 20);
                w621Var7.c = obj;
                return w621Var7;
            case 21:
                return new w621((kjg1) this.c, (String) obj2, lnmVar, (byte) 21);
            case 22:
                return new w621((alg1) this.c, (tv80) obj2, lnmVar, (byte) 22);
            case 23:
                return new w621((n2o) this.c, (a5f1) obj2, lnmVar, (byte) 23);
            case 24:
                return new w621((wok1) obj2, lnmVar, (byte) 24);
            case 25:
                w621 w621Var8 = new w621((bxk1) obj2, lnmVar, (byte) 25);
                w621Var8.c = obj;
                return w621Var8;
            case 26:
                return new w621((g2x0) this.c, (rnh) obj2, lnmVar, (byte) 26);
            case 27:
                w621 w621Var9 = new w621((h5l1) obj2, lnmVar, (byte) 27);
                w621Var9.c = obj;
                return w621Var9;
            case 28:
                return new w621((jkr0) this.c, (ven0) obj2, lnmVar, (byte) 28);
            default:
                w621 w621Var10 = new w621((hil1) obj2, lnmVar, (byte) 29);
                w621Var10.c = obj;
                return w621Var10;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((u091) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:278:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:281:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:284:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:287:0x04fc A[LOOP:5: B:285:0x04f6->B:287:0x04fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:291:0x051e A[LOOP:6: B:289:0x0518->B:291:0x051e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:294:0x0532  */
    /* JADX WARN: Code duplicated, block: B:297:0x0544 A[LOOP:7: B:295:0x053e->B:297:0x0544, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:301:0x0558  */
    /* JADX WARN: Code duplicated, block: B:303:0x0564  */
    /* JADX WARN: Code duplicated, block: B:310:0x05a1 A[LOOP:9: B:307:0x057c->B:310:0x05a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:311:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:315:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:318:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:321:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:327:0x0610  */
    /* JADX WARN: Code duplicated, block: B:329:0x061e  */
    /* JADX WARN: Code duplicated, block: B:330:0x0623  */
    /* JADX WARN: Code duplicated, block: B:335:0x0636  */
    /* JADX WARN: Code duplicated, block: B:338:0x065e A[LOOP:13: B:336:0x0658->B:338:0x065e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:342:0x0685  */
    /* JADX WARN: Code duplicated, block: B:345:0x069e  */
    /* JADX WARN: Code duplicated, block: B:350:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:351:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:353:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:357:0x06de A[LOOP:16: B:357:0x06de->B:617:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:360:0x070e  */
    /* JADX WARN: Code duplicated, block: B:366:0x0725  */
    /* JADX WARN: Code duplicated, block: B:394:0x079b  */
    /* JADX WARN: Code duplicated, block: B:422:0x07ef A[PHI: r1 r2
      0x07ef: PHI (r1v50 p.w621) = (r1v56 p.w621), (r1v59 p.w621) binds: [B:426:0x0816, B:421:0x07e6] A[DONT_GENERATE, DONT_INLINE]
      0x07ef: PHI (r2v16 java.lang.Object) = (r2v19 java.lang.Object), (r2v21 java.lang.Object) binds: [B:426:0x0816, B:421:0x07e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:596:0x056c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x05a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x0600 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x06d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x06ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0698 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:223:0x03bb -> B:216:0x0371). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:429:0x0822 -> B:431:0x0826). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00fb -> B:53:0x00dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0178 -> B:84:0x0157). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:208:0x0358
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 2692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w621.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w621(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
