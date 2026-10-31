package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class og5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public Object b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og5(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        if (r3.a(r23) == r8) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.og5.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r14 == r10) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.g
            p.ven0 r0 = (p.ven0) r0
            java.lang.Object r1 = r13.f
            p.ven0 r1 = (p.ven0) r1
            java.lang.Object r2 = r13.b
            p.ven0 r2 = (p.ven0) r2
            java.lang.Object r3 = r13.d
            p.dqy r3 = (p.dqy) r3
            byte r4 = r13.c
            p.rih1 r5 = p.rih1.a
            p.z6x r6 = p.z6x.a
            r7 = 2
            r8 = 1
            r9 = 0
            p.d9n r10 = p.d9n.a
            if (r4 == 0) goto L2f
            if (r4 == r8) goto L2b
            if (r4 != r7) goto L25
            p.hm5.M(r14)
            goto L66
        L25:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r9
        L2b:
            p.hm5.M(r14)
            goto L51
        L2f:
            p.hm5.M(r14)
            java.lang.String r14 = r3.d()
            boolean r14 = p.ihc1.y0(r14)
            if (r14 == 0) goto L46
            r2.setValue(r6)
            r1.setValue(r9)
            r0.setValue(r9)
            return r5
        L46:
            r13.c = r8
            r11 = 250(0xfa, double:1.235E-321)
            java.lang.Object r14 = p.hap1.i(r11, r13)
            if (r14 != r10) goto L51
            goto L65
        L51:
            java.lang.Object r14 = r13.e
            p.yzu r14 = (p.yzu) r14
            java.lang.Object r14 = r14.b
            p.up41 r14 = (p.up41) r14
            java.lang.String r4 = r3.d()
            r13.c = r7
            java.lang.Object r14 = r14.q(r4, r13)
            if (r14 != r10) goto L66
        L65:
            return r10
        L66:
            java.util.List r14 = (java.util.List) r14
            if (r14 != 0) goto L6b
            goto L6c
        L6b:
            r6 = r14
        L6c:
            r2.setValue(r6)
            java.lang.String r13 = r3.d()
            if (r14 == 0) goto L76
            goto L77
        L76:
            r13 = r9
        L77:
            r1.setValue(r13)
            java.lang.String r13 = r3.d()
            if (r14 != 0) goto L81
            r9 = r13
        L81:
            r0.setValue(r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.og5.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0 A[Catch: Exception -> 0x0025, CancellationException -> 0x00ac, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00ac, Exception -> 0x0025, blocks: (B:7:0x0020, B:30:0x0095, B:31:0x0099, B:34:0x00a0, B:14:0x0032, B:24:0x007f, B:26:0x0083, B:17:0x0039, B:19:0x0043, B:21:0x0050), top: B:41:0x0016 }] */
    private final Object h(Object obj) {
        s2t s2tVarQ;
        uv00 uv00Var;
        uv00 uv00Var2;
        yrw yrwVarJ;
        String str = (String) this.g;
        tjq tjqVar = (tjq) this.f;
        c9n c9nVar = (c9n) this.b;
        byte b = this.c;
        rih1 rih1Var = rih1.a;
        Integer num = null;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                s2tVarQ = ((lh4) tjqVar.b).d() ? fn31.q(c9nVar, (o8n) null, 0, new x5z(tjqVar, str, null, (byte) 1), 3) : null;
                ezc ezcVarG = yoi1.g(((uu00) tjqVar.c).b(new oi("predictive-episode-page", false, new kov(str, (byte) 26))));
                afv afvVar = new afv(2, (lnm) null, (byte) 6);
                this.b = null;
                this.d = s2tVarQ;
                this.c = (byte) 1;
                obj = b5p1.j(ezcVarG, afvVar, this);
                if (obj == d9nVar) {
                }
                return d9nVar;
            }
            if (b == 1) {
                s2tVarQ = (s2t) this.d;
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uv00Var2 = (uv00) this.e;
                hm5.M(obj);
            }
            num = (Integer) obj;
            uv00Var = uv00Var2;
            yrwVarJ = tjq.j(str, uv00Var, num);
            if (yrwVarJ == null) {
                return rih1Var;
            }
            ((o3e0) tjqVar.d).m(Collections.singletonList(yrwVarJ));
            return rih1Var;
            uv00Var = (uv00) obj;
            if (s2tVarQ != null) {
                this.b = null;
                this.d = null;
                this.e = uv00Var;
                this.c = (byte) 2;
                Object objE = s2tVarQ.E(this);
                if (objE != d9nVar) {
                    obj = objE;
                    uv00Var2 = uv00Var;
                    num = (Integer) obj;
                    uv00Var = uv00Var2;
                }
                return d9nVar;
            }
            yrwVarJ = tjq.j(str, uv00Var, num);
            if (yrwVarJ == null) {
                return rih1Var;
            }
            ((o3e0) tjqVar.d).m(Collections.singletonList(yrwVarJ));
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Episode media prefetch failed", new Object[0]);
            return rih1Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (((p.mr20) r7).collect(r0, r6) == r3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.c
            r1 = 2
            r2 = 1
            p.d9n r3 = p.d9n.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            p.hm5.M(r7)
            goto L49
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L17:
            p.hm5.M(r7)
            goto L2f
        L1b:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.d
            p.xj00 r7 = (p.xj00) r7
            java.lang.Object r0 = r6.e
            p.dt71 r0 = (p.dt71) r0
            r6.c = r2
            java.lang.Object r7 = r7.invoke(r0, r6)
            if (r7 != r3) goto L2f
            goto L48
        L2f:
            p.mr20 r7 = (p.mr20) r7
            p.e8m r0 = new p.e8m
            java.lang.Object r2 = r6.b
            java.lang.Object r4 = r6.f
            p.l811 r4 = (p.l811) r4
            java.lang.Object r5 = r6.g
            com.spotify.mobius.functions.Consumer r5 = (com.spotify.mobius.functions.Consumer) r5
            r0.<init>(r2, r4, r5, r1)
            r6.c = r1
            java.lang.Object r6 = r7.collect(r0, r6)
            if (r6 != r3) goto L49
        L48:
            return r3
        L49:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.og5.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r0.emit(r3, r8) == r5) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r8.c
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r9)
            goto L65
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L1b:
            java.lang.Object r0 = r8.e
            p.o231 r0 = (p.o231) r0
            java.lang.Object r1 = r8.d
            p.vr20 r1 = (p.vr20) r1
            p.hm5.M(r9)
            r7 = r1
            r1 = r0
            r0 = r7
            goto L4b
        L2a:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.f
            p.o231 r9 = (p.o231) r9
            java.lang.Object r1 = r8.g
            p.hc30 r1 = (p.hc30) r1
            p.owf1 r1 = r1.d
            java.lang.String r6 = r9.b
            r8.b = r4
            r8.d = r0
            r8.e = r9
            r8.c = r3
            java.lang.Object r1 = r1.p(r6, r8)
            if (r1 != r5) goto L48
            goto L64
        L48:
            r7 = r1
            r1 = r9
            r9 = r7
        L4b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            p.fc30 r3 = new p.fc30
            r3.<init>(r1, r9)
            r8.b = r4
            r8.d = r4
            r8.e = r4
            r8.c = r2
            java.lang.Object r8 = r0.emit(r3, r8)
            if (r8 != r5) goto L65
        L64:
            return r5
        L65:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.og5.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0192  */
    /* JADX WARN: Code duplicated, block: B:61:0x0195  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:79:0x020e  */
    /* JADX WARN: Code duplicated, block: B:91:0x022c  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (r0 == r8) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 983
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.og5.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r1.b(r0, r3, r4, r5, r10) == r9) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            r1 = r0
            p.tg80 r1 = (p.tg80) r1
            p.bpb1 r7 = r1.l
            byte r0 = r10.c
            r2 = 2
            r3 = 1
            r8 = 0
            if (r0 == 0) goto L22
            if (r0 == r3) goto L12
            if (r0 != r2) goto L1c
        L12:
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            goto L5a
        L16:
            r0 = move-exception
            r10 = r0
            goto L6a
        L19:
            r0 = move-exception
            r10 = r0
            goto L69
        L1c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r8
        L22:
            p.hm5.M(r11)
            p.di4 r11 = r1.h     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            boolean r11 = r11.l0()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            java.lang.Object r0 = r10.e
            java.lang.String r0 = (java.lang.String) r0
            p.d9n r9 = p.d9n.a
            if (r11 == 0) goto L40
            java.lang.Object r11 = r10.b     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            p.tv80 r11 = (p.tv80) r11     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            r10.c = r3     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            java.lang.Object r10 = r1.c(r0, r11, r10)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            if (r10 != r9) goto L5a
            goto L59
        L40:
            java.lang.Object r11 = r10.f     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            r3 = r11
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            java.lang.Object r11 = r10.g     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            java.lang.Object r11 = r10.b     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            r5 = r11
            p.tv80 r5 = (p.tv80) r5     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            r10.c = r2     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            r6 = r10
            r2 = r0
            java.lang.Object r10 = r1.b(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19 java.lang.Exception -> L60
            if (r10 != r9) goto L5a
        L59:
            return r9
        L5a:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r7.m(r8, r10)
            goto L66
        L60:
            int r10 = p.tg80.n     // Catch: java.lang.Throwable -> L16
            r1.e()     // Catch: java.lang.Throwable -> L16
            goto L5a
        L66:
            p.rih1 r10 = p.rih1.a
            return r10
        L69:
            throw r10     // Catch: java.lang.Throwable -> L16
        L6a:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r7.m(r8, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.og5.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0177, code lost:
    
        if (p.l4p1.s(r1, (p.mr20) r2, r20) == r12) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.og5.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r0.emit(r12, r11) == r10) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.b
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r11.c
            r2 = 2
            r3 = 1
            r8 = 0
            p.d9n r10 = p.d9n.a
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L15
            p.hm5.M(r12)
            goto L57
        L15:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            r11 = 0
            return r11
        L1c:
            java.lang.Object r0 = r11.d
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r12)
            goto L4a
        L24:
            p.hm5.M(r12)
            p.z290 r4 = new p.z290
            java.lang.Object r12 = r11.e
            r5 = r12
            p.ywc0 r5 = (p.ywc0) r5
            java.lang.Object r12 = r11.f
            r6 = r12
            p.hti0 r6 = (p.hti0) r6
            java.lang.Object r12 = r11.g
            r7 = r12
            p.rzq r7 = (p.rzq) r7
            r9 = 11
            r4.<init>(r5, r6, r7, r8, r9)
            r11.b = r8
            r11.d = r0
            r11.c = r3
            java.lang.Object r12 = p.smo1.s(r4, r11)
            if (r12 != r10) goto L4a
            goto L56
        L4a:
            r11.b = r8
            r11.d = r8
            r11.c = r2
            java.lang.Object r11 = r0.emit(r12, r11)
            if (r11 != r10) goto L57
        L56:
            return r10
        L57:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.og5.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r3.emit(p.e3e0.a, r9) == r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r10.a(r3, r4, r5, r6, r9) == r8) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object s(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            p.j3e0 r0 = (p.j3e0) r0
            java.lang.Object r1 = r9.b
            r3 = r1
            p.vr20 r3 = (p.vr20) r3
            byte r1 = r9.c
            r2 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L2f
            if (r1 == r7) goto L2b
            if (r1 == r6) goto L27
            if (r1 == r5) goto L23
            if (r1 != r4) goto L1d
            goto L2b
        L1d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r2
        L23:
            p.hm5.M(r10)
            goto L6f
        L27:
            p.hm5.M(r10)
            goto L62
        L2b:
            p.hm5.M(r10)
            goto L8c
        L2f:
            p.hm5.M(r10)
            boolean r10 = r0 instanceof p.i3e0
            if (r10 == 0) goto L43
            r9.b = r2
            r9.c = r7
            p.e3e0 r10 = p.e3e0.a
            java.lang.Object r9 = r3.emit(r10, r9)
            if (r9 != r8) goto L8c
            goto L8b
        L43:
            boolean r10 = r0 instanceof p.h3e0
            if (r10 == 0) goto L8f
            java.lang.Object r10 = r9.e
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L62
            java.lang.Object r10 = r9.f
            p.f3e0 r10 = (p.f3e0) r10
            if (r10 == 0) goto L62
            p.f3e0 r10 = p.f3e0.a(r10)
            r9.b = r3
            r9.c = r6
            java.lang.Object r10 = r3.emit(r10, r9)
            if (r10 != r8) goto L62
            goto L8b
        L62:
            r9.b = r3
            r9.c = r5
            p.d3e0 r10 = p.d3e0.a
            java.lang.Object r10 = r3.emit(r10, r9)
            if (r10 != r8) goto L6f
            goto L8b
        L6f:
            java.lang.Object r10 = r9.g
            p.m3e0 r10 = (p.m3e0) r10
            p.h3e0 r0 = (p.h3e0) r0
            r1 = r4
            java.lang.String r4 = r0.a
            java.lang.String r5 = r0.b
            java.lang.Object r0 = r9.e
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r9.b = r2
            r9.c = r1
            r7 = r9
            r2 = r10
            java.lang.Object r9 = r2.a(r3, r4, r5, r6, r7)
            if (r9 != r8) goto L8c
        L8b:
            return r8
        L8c:
            p.rih1 r9 = p.rih1.a
            return r9
        L8f:
            p.eg.o()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.og5.s(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.promptedplaylists.artifactpage.playlistconfig.PlaylistGenerationException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075 A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:7:0x001a, B:27:0x006f, B:29:0x0075, B:31:0x007f, B:34:0x0093, B:36:0x0097, B:37:0x00a0, B:38:0x00a1, B:39:0x00a6, B:40:0x00a7), top: B:47:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[Catch: Exception -> 0x0022, TRY_LEAVE, TryCatch #1 {Exception -> 0x0022, blocks: (B:7:0x001a, B:27:0x006f, B:29:0x0075, B:31:0x007f, B:34:0x0093, B:36:0x0097, B:37:0x00a0, B:38:0x00a1, B:39:0x00a6, B:40:0x00a7), top: B:47:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: Exception -> 0x0022, TRY_ENTER, TryCatch #1 {Exception -> 0x0022, blocks: (B:7:0x001a, B:27:0x006f, B:29:0x0075, B:31:0x007f, B:34:0x0093, B:36:0x0097, B:37:0x00a0, B:38:0x00a1, B:39:0x00a6, B:40:0x00a7), top: B:47:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0097 A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:7:0x001a, B:27:0x006f, B:29:0x0075, B:31:0x007f, B:34:0x0093, B:36:0x0097, B:37:0x00a0, B:38:0x00a1, B:39:0x00a6, B:40:0x00a7), top: B:47:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1 A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:7:0x001a, B:27:0x006f, B:29:0x0075, B:31:0x007f, B:34:0x0093, B:36:0x0097, B:37:0x00a0, B:38:0x00a1, B:39:0x00a6, B:40:0x00a7), top: B:47:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7 A[Catch: Exception -> 0x0022, TRY_LEAVE, TryCatch #1 {Exception -> 0x0022, blocks: (B:7:0x001a, B:27:0x006f, B:29:0x0075, B:31:0x007f, B:34:0x0093, B:36:0x0097, B:37:0x00a0, B:38:0x00a1, B:39:0x00a6, B:40:0x00a7), top: B:47:0x001a }] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r9 == r6) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object t(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.b
            p.mie0 r1 = (p.mie0) r1
            p.u6y0 r2 = r1.h
            byte r3 = r8.c
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r3 == 0) goto L30
            if (r3 == r5) goto L2c
            if (r3 != r4) goto L25
            java.lang.Object r8 = r8.d
            p.g6y0 r8 = (p.g6y0) r8
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L22
            p.e331 r9 = (p.e331) r9     // Catch: java.lang.Exception -> L22
            java.lang.Object r9 = r9.a     // Catch: java.lang.Exception -> L22
            goto L6f
        L22:
            r9 = move-exception
            goto Lac
        L25:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L2c:
            p.hm5.M(r9)
            goto L4a
        L30:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.e
            p.fie0 r9 = (p.fie0) r9
            p.die0 r3 = p.die0.a
            boolean r9 = p.u890.j(r9, r3)
            if (r9 == 0) goto L55
            p.gtt r9 = r1.d
            r8.c = r5
            java.lang.Object r9 = p.gtt.c(r9, r8, r5)
            if (r9 != r6) goto L4a
            goto L6b
        L4a:
            p.ctt r9 = (p.ctt) r9
            boolean r9 = r9 instanceof p.att
            if (r9 == 0) goto L55
            p.qjm1 r9 = p.qjm1.a
            r9.toString()
        L55:
            p.u6y0 r9 = r2.i
            p.g6y0 r9 = r9.a(r0)
            java.lang.Object r3 = r8.g     // Catch: java.lang.Exception -> La8
            p.h3y0 r3 = (p.h3y0) r3     // Catch: java.lang.Exception -> La8
            p.o8y0 r5 = p.o8y0.a     // Catch: java.lang.Exception -> La8
            r8.d = r9     // Catch: java.lang.Exception -> La8
            r8.c = r4     // Catch: java.lang.Exception -> La8
            java.lang.Object r8 = r3.e(r0, r5, r8)     // Catch: java.lang.Exception -> La8
            if (r8 != r6) goto L6c
        L6b:
            return r6
        L6c:
            r7 = r9
            r9 = r8
            r8 = r7
        L6f:
            java.lang.Throwable r3 = p.e331.a(r9)     // Catch: java.lang.Exception -> L22
            if (r3 != 0) goto La7
            p.me11 r9 = (p.me11) r9     // Catch: java.lang.Exception -> L22
            p.le11 r3 = p.le11.a     // Catch: java.lang.Exception -> L22
            boolean r3 = p.u890.j(r9, r3)     // Catch: java.lang.Exception -> L22
            if (r3 == 0) goto L93
            p.ags0 r9 = r1.g     // Catch: java.lang.Exception -> L22
            java.util.concurrent.ConcurrentHashMap r1 = r9.b     // Catch: java.lang.Exception -> L22
            p.yqg r9 = r9.a     // Catch: java.lang.Exception -> L22
            long r3 = r9.b()     // Catch: java.lang.Exception -> L22
            java.lang.Long r9 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L22
            r1.put(r0, r9)     // Catch: java.lang.Exception -> L22
            p.rih1 r8 = p.rih1.a
            return r8
        L93:
            boolean r0 = r9 instanceof p.ke11     // Catch: java.lang.Exception -> L22
            if (r0 == 0) goto La1
            com.spotify.promptedplaylists.artifactpage.playlistconfig.PlaylistGenerationException r0 = new com.spotify.promptedplaylists.artifactpage.playlistconfig.PlaylistGenerationException     // Catch: java.lang.Exception -> L22
            p.ke11 r9 = (p.ke11) r9     // Catch: java.lang.Exception -> L22
            java.util.List r9 = r9.a     // Catch: java.lang.Exception -> L22
            r0.<init>(r9)     // Catch: java.lang.Exception -> L22
            throw r0     // Catch: java.lang.Exception -> L22
        La1:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L22
            r9.<init>()     // Catch: java.lang.Exception -> L22
            throw r9     // Catch: java.lang.Exception -> L22
        La7:
            throw r3     // Catch: java.lang.Exception -> L22
        La8:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Lac:
            p.u6y0 r0 = r2.i
            r0.b(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.og5.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x0183 A[EDGE_INSN: B:126:0x0183->B:90:0x0183 BREAK  A[LOOP:1: B:64:0x0110->B:71:0x0131], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0159 A[EDGE_INSN: B:129:0x0159->B:79:0x0159 BREAK  A[LOOP:3: B:75:0x0140->B:92:0x0186], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0183 A[EDGE_INSN: B:130:0x0183->B:90:0x0183 BREAK  A[LOOP:4: B:82:0x015f->B:89:0x0181], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6 A[Catch: all -> 0x00c5, Exception -> 0x00ca, TRY_LEAVE, TryCatch #3 {all -> 0x00c5, blocks: (B:32:0x00ad, B:35:0x00b2, B:37:0x00b6, B:51:0x00e2), top: B:112:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2 A[Catch: all -> 0x00c5, Exception -> 0x00ca, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00c5, blocks: (B:32:0x00ad, B:35:0x00b2, B:37:0x00b6, B:51:0x00e2), top: B:112:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea A[Catch: Exception -> 0x00ca, all -> 0x0134, TRY_ENTER, TryCatch #2 {all -> 0x0134, blocks: (B:48:0x00d2, B:49:0x00d9, B:54:0x00ed, B:59:0x00f8, B:53:0x00ea), top: B:110:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    /* JADX WARN: Code duplicated, block: B:71:0x0131 A[LOOP:1: B:64:0x0110->B:71:0x0131, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x015d  */
    /* JADX WARN: Code duplicated, block: B:84:0x016a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0179  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181 A[LOOP:4: B:82:0x015f->B:89:0x0181, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0186 A[LOOP:3: B:75:0x0140->B:92:0x0186, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0193  */
    private final Object u(Object obj) throws Throwable {
        faa0 faa0VarZ;
        int i;
        Object objInvoke;
        faa0 faa0Var;
        phe0 phe0Var;
        Object objA;
        phe0 phe0Var2;
        xab1 xab1Var;
        int i2;
        Object value;
        Object value2;
        sie0 sie0VarA;
        int i3;
        String strO;
        Object value3;
        sie0 sie0VarA2;
        Object value4;
        sie0 sie0Var;
        rne0 rne0Var;
        rne0 rne0Var2;
        int i4;
        Object value5;
        sie0 sie0VarA3;
        tdi1 tdi1Var;
        oie0 oie0Var = (oie0) this.f;
        bpb1 bpb1Var = oie0Var.i;
        c9n c9nVar = (c9n) this.b;
        byte b = this.c;
        int i5 = 2;
        xab1 xab1Var2 = null;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                faa0VarZ = op71.z(c9nVar.J());
                while (true) {
                    Object value6 = bpb1Var.getValue();
                    i = i5;
                    if (bpb1Var.k(value6, sie0.a((sie0) value6, null, null, i5, null, null, 27))) {
                        try {
                            break;
                        } catch (Exception unused) {
                            op71.x(c9nVar.J());
                            while (true) {
                                value = bpb1Var.getValue();
                                xab1Var = xab1Var2;
                                if (bpb1Var.k(value, sie0.a((sie0) value, null, null, 4, null, null, 27))) {
                                    break;
                                    break;
                                }
                                xab1Var2 = xab1Var;
                            }
                            if (oie0Var.X == faa0VarZ) {
                                oie0Var.X = xab1Var;
                                while (true) {
                                    value2 = bpb1Var.getValue();
                                    sie0VarA = (sie0) value2;
                                    if (sie0VarA.c == i) {
                                        i3 = i;
                                        sie0VarA = sie0.a(sie0VarA, null, null, 3, null, null, 27);
                                    } else {
                                        i3 = i;
                                    }
                                    if (bpb1Var.k(value2, sie0VarA)) {
                                        break;
                                        break;
                                    }
                                    i = i3;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            faa0Var = faa0VarZ;
                            xab1Var = null;
                            i2 = i;
                            if (oie0Var.X == faa0Var) {
                                oie0Var.X = xab1Var;
                                do {
                                    value3 = bpb1Var.getValue();
                                    sie0VarA2 = (sie0) value3;
                                    if (sie0VarA2.c == i2) {
                                        sie0VarA2 = sie0.a(sie0VarA2, null, null, 3, null, null, 27);
                                    }
                                } while (!bpb1Var.k(value3, sie0VarA2));
                            }
                            throw th;
                        }
                    } else {
                        i5 = i;
                    }
                }
                iu30 iu30Var = (iu30) this.g;
                this.b = c9nVar;
                this.d = faa0VarZ;
                this.c = (byte) 1;
                objInvoke = iu30Var.invoke(this);
                if (objInvoke == d9nVar) {
                }
                return d9nVar;
            }
            if (b != 1) {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                phe0Var2 = (phe0) this.e;
                faa0Var = (faa0) this.d;
                try {
                    hm5.M(obj);
                    objA = ((e331) obj).a;
                    i = 2;
                    try {
                        try {
                            if (objA instanceof m231) {
                                objA = null;
                            }
                            tdi1Var = (tdi1) objA;
                            if (tdi1Var != null) {
                                strO = w8p1.o(tdi1Var);
                                if (!ihc1.y0(strO)) {
                                    phe0Var = phe0Var2;
                                }
                                op71.x(c9nVar.J());
                                do {
                                    value4 = bpb1Var.getValue();
                                    sie0Var = (sie0) value4;
                                    if (strO != null) {
                                        rne0Var = new rne0(strO, false);
                                    } else {
                                        rne0Var = sie0Var.a;
                                    }
                                    rne0Var2 = rne0Var;
                                    if (phe0Var == phe0.c && strO == null) {
                                        i4 = 4;
                                    } else {
                                        i4 = 3;
                                    }
                                } while (!bpb1Var.k(value4, sie0.a(sie0Var, rne0Var2, null, i4, null, null, 26)));
                                if (oie0Var.X == faa0Var) {
                                    oie0Var.X = null;
                                    while (true) {
                                        value5 = bpb1Var.getValue();
                                        sie0VarA3 = (sie0) value5;
                                        if (sie0VarA3.c == i) {
                                            sie0VarA3 = sie0.a(sie0VarA3, null, null, 3, null, null, 27);
                                        }
                                        if (bpb1Var.k(value5, sie0VarA3)) {
                                            break;
                                        }
                                        i = i;
                                    }
                                }
                                return rih1.a;
                            }
                            phe0Var = phe0Var2;
                            strO = null;
                            op71.x(c9nVar.J());
                            do {
                                value4 = bpb1Var.getValue();
                                sie0Var = (sie0) value4;
                                if (strO != null) {
                                    rne0Var = new rne0(strO, false);
                                } else {
                                    rne0Var = sie0Var.a;
                                }
                                rne0Var2 = rne0Var;
                                if (phe0Var == phe0.c) {
                                    i4 = 3;
                                } else {
                                    i4 = 3;
                                }
                            } while (!bpb1Var.k(value4, sie0.a(sie0Var, rne0Var2, null, i4, null, null, 26)));
                            if (oie0Var.X == faa0Var) {
                                oie0Var.X = null;
                                while (true) {
                                    value5 = bpb1Var.getValue();
                                    sie0VarA3 = (sie0) value5;
                                    if (sie0VarA3.c == i) {
                                        sie0VarA3 = sie0.a(sie0VarA3, null, null, 3, null, null, 27);
                                    }
                                    if (bpb1Var.k(value5, sie0VarA3)) {
                                        break;
                                        break;
                                    }
                                    i = i;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            xab1Var = null;
                            i2 = i;
                            if (oie0Var.X == faa0Var) {
                                oie0Var.X = xab1Var;
                                do {
                                    value3 = bpb1Var.getValue();
                                    sie0VarA2 = (sie0) value3;
                                    if (sie0VarA2.c == i2) {
                                        sie0VarA2 = sie0.a(sie0VarA2, null, null, 3, null, null, 27);
                                    }
                                } while (!bpb1Var.k(value3, sie0VarA2));
                            }
                            throw th;
                        }
                    } catch (Exception unused2) {
                        faa0VarZ = faa0Var;
                        try {
                            op71.x(c9nVar.J());
                            while (true) {
                                value = bpb1Var.getValue();
                                xab1Var = xab1Var2;
                                try {
                                    if (bpb1Var.k(value, sie0.a((sie0) value, null, null, 4, null, null, 27))) {
                                        break;
                                    }
                                    xab1Var2 = xab1Var;
                                } catch (Throwable th3) {
                                    th = th3;
                                    i2 = i;
                                    faa0Var = faa0VarZ;
                                    if (oie0Var.X == faa0Var) {
                                        oie0Var.X = xab1Var;
                                        do {
                                            value3 = bpb1Var.getValue();
                                            sie0VarA2 = (sie0) value3;
                                            if (sie0VarA2.c == i2) {
                                                sie0VarA2 = sie0.a(sie0VarA2, null, null, 3, null, null, 27);
                                            }
                                        } while (!bpb1Var.k(value3, sie0VarA2));
                                    }
                                    throw th;
                                }
                            }
                            if (oie0Var.X == faa0VarZ) {
                                oie0Var.X = xab1Var;
                                while (true) {
                                    value2 = bpb1Var.getValue();
                                    sie0VarA = (sie0) value2;
                                    if (sie0VarA.c == i) {
                                        i3 = i;
                                        sie0VarA = sie0.a(sie0VarA, null, null, 3, null, null, 27);
                                    } else {
                                        i3 = i;
                                    }
                                    if (bpb1Var.k(value2, sie0VarA)) {
                                        break;
                                    }
                                    i = i3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            xab1Var = xab1Var2;
                        }
                    }
                } catch (Exception unused3) {
                    faa0VarZ = faa0Var;
                    i = 2;
                    op71.x(c9nVar.J());
                    while (true) {
                        value = bpb1Var.getValue();
                        xab1Var = xab1Var2;
                        if (bpb1Var.k(value, sie0.a((sie0) value, null, null, 4, null, null, 27))) {
                            break;
                            break;
                        }
                        xab1Var2 = xab1Var;
                    }
                    if (oie0Var.X == faa0VarZ) {
                        oie0Var.X = xab1Var;
                        while (true) {
                            value2 = bpb1Var.getValue();
                            sie0VarA = (sie0) value2;
                            if (sie0VarA.c == i) {
                                i3 = i;
                                sie0VarA = sie0.a(sie0VarA, null, null, 3, null, null, 27);
                            } else {
                                i3 = i;
                            }
                            if (bpb1Var.k(value2, sie0VarA)) {
                                break;
                                break;
                            }
                            i = i3;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    xab1Var = null;
                    i2 = i5;
                    if (oie0Var.X == faa0Var) {
                        oie0Var.X = xab1Var;
                        do {
                            value3 = bpb1Var.getValue();
                            sie0VarA2 = (sie0) value3;
                            if (sie0VarA2.c == i2) {
                                sie0VarA2 = sie0.a(sie0VarA2, null, null, 3, null, null, 27);
                            }
                        } while (!bpb1Var.k(value3, sie0VarA2));
                    }
                    throw th;
                }
                return rih1.a;
            }
            faa0VarZ = (faa0) this.d;
            try {
                hm5.M(obj);
                objInvoke = obj;
                i = 2;
            } catch (Exception unused4) {
                i = 2;
                op71.x(c9nVar.J());
                while (true) {
                    value = bpb1Var.getValue();
                    xab1Var = xab1Var2;
                    if (bpb1Var.k(value, sie0.a((sie0) value, null, null, 4, null, null, 27))) {
                        break;
                        break;
                    }
                    xab1Var2 = xab1Var;
                }
                if (oie0Var.X == faa0VarZ) {
                    oie0Var.X = xab1Var;
                    while (true) {
                        value2 = bpb1Var.getValue();
                        sie0VarA = (sie0) value2;
                        if (sie0VarA.c == i) {
                            i3 = i;
                            sie0VarA = sie0.a(sie0VarA, null, null, 3, null, null, 27);
                        } else {
                            i3 = i;
                        }
                        if (bpb1Var.k(value2, sie0VarA)) {
                            break;
                            break;
                        }
                        i = i3;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                faa0Var = faa0VarZ;
                xab1Var = null;
                i2 = i5;
                if (oie0Var.X == faa0Var) {
                    oie0Var.X = xab1Var;
                    do {
                        value3 = bpb1Var.getValue();
                        sie0VarA2 = (sie0) value3;
                        if (sie0VarA2.c == i2) {
                            sie0VarA2 = sie0.a(sie0VarA2, null, null, 3, null, null, 27);
                        }
                    } while (!bpb1Var.k(value3, sie0VarA2));
                }
                throw th;
            }
            if (phe0Var == phe0.a) {
                whe0 whe0Var = oie0Var.e;
                this.b = c9nVar;
                this.d = faa0VarZ;
                this.e = phe0Var;
                this.c = (byte) 2;
                objA = whe0Var.a(this);
                if (objA != d9nVar) {
                    faa0Var = faa0VarZ;
                    phe0Var2 = phe0Var;
                    if (objA instanceof m231) {
                        objA = null;
                    }
                    tdi1Var = (tdi1) objA;
                    if (tdi1Var != null) {
                        strO = w8p1.o(tdi1Var);
                        if (!ihc1.y0(strO)) {
                            phe0Var = phe0Var2;
                        }
                        op71.x(c9nVar.J());
                        do {
                            value4 = bpb1Var.getValue();
                            sie0Var = (sie0) value4;
                            if (strO != null) {
                                rne0Var = new rne0(strO, false);
                            } else {
                                rne0Var = sie0Var.a;
                            }
                            rne0Var2 = rne0Var;
                            if (phe0Var == phe0.c) {
                                i4 = 3;
                            } else {
                                i4 = 3;
                            }
                        } while (!bpb1Var.k(value4, sie0.a(sie0Var, rne0Var2, null, i4, null, null, 26)));
                        if (oie0Var.X == faa0Var) {
                            oie0Var.X = null;
                            while (true) {
                                value5 = bpb1Var.getValue();
                                sie0VarA3 = (sie0) value5;
                                if (sie0VarA3.c == i) {
                                    sie0VarA3 = sie0.a(sie0VarA3, null, null, 3, null, null, 27);
                                }
                                if (bpb1Var.k(value5, sie0VarA3)) {
                                    break;
                                    break;
                                }
                                i = i;
                            }
                        }
                        return rih1.a;
                    }
                    phe0Var = phe0Var2;
                }
                return d9nVar;
            }
            faa0Var = faa0VarZ;
            op71.x(c9nVar.J());
            do {
                value4 = bpb1Var.getValue();
                sie0Var = (sie0) value4;
                if (strO != null) {
                    rne0Var = new rne0(strO, false);
                } else {
                    rne0Var = sie0Var.a;
                }
                rne0Var2 = rne0Var;
                if (phe0Var == phe0.c) {
                    i4 = 3;
                } else {
                    i4 = 3;
                }
            } while (!bpb1Var.k(value4, sie0.a(sie0Var, rne0Var2, null, i4, null, null, 26)));
            if (oie0Var.X == faa0Var) {
                oie0Var.X = null;
                while (true) {
                    value5 = bpb1Var.getValue();
                    sie0VarA3 = (sie0) value5;
                    if (sie0VarA3.c == i) {
                        sie0VarA3 = sie0.a(sie0VarA3, null, null, 3, null, null, 27);
                    }
                    if (bpb1Var.k(value5, sie0VarA3)) {
                        break;
                        break;
                    }
                    i = i;
                }
            }
            return rih1.a;
        } catch (Throwable th7) {
            th = th7;
            i5 = i;
            xab1Var = null;
            i2 = i5;
            if (oie0Var.X == faa0Var) {
                oie0Var.X = xab1Var;
                do {
                    value3 = bpb1Var.getValue();
                    sie0VarA2 = (sie0) value3;
                    if (sie0VarA2.c == i2) {
                        sie0VarA2 = sie0.a(sie0VarA2, null, null, 3, null, null, 27);
                    }
                } while (!bpb1Var.k(value3, sie0VarA2));
            }
            throw th;
        }
        phe0Var = (phe0) objInvoke;
        strO = null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[RETURN] */
    private final Object v(Object obj) {
        Intent intentN;
        Object objCollect;
        byp bypVar = (byp) this.e;
        vr20 vr20Var = (vr20) this.b;
        byte b = this.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                String str = (String) this.f;
                this.b = vr20Var;
                this.c = (byte) 1;
                obj = bypVar.q(str, this);
                if (obj == d9nVar) {
                }
                return d9nVar;
            }
            if (b == 1) {
                hm5.M(obj);
            } else if (b == 2) {
                intentN = (Intent) this.d;
                hm5.M(obj);
                this.b = vr20Var;
                this.d = null;
                this.c = (byte) 3;
                objCollect = ((zx60) bypVar.g).collect(new a8d0(bypVar, intentN, (byte) 15), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    return d9nVar;
                }
            } else {
                if (b == 3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                if (b != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1Var;
            intentN = bypVar.n((hwe0) obj);
            String str2 = (String) this.g;
            this.b = vr20Var;
            this.d = intentN;
            this.c = (byte) 2;
            if (bypVar.C(str2, this) != d9nVar) {
                this.b = vr20Var;
                this.d = null;
                this.c = (byte) 3;
                objCollect = ((zx60) bypVar.g).collect(new a8d0(bypVar, intentN, (byte) 15), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    return rih1Var;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            this.b = null;
            this.d = null;
            this.c = (byte) 4;
            if (vr20Var.emit(eze0.a, this) == d9nVar) {
                return d9nVar;
            }
        }
        return d9nVar;
    }

    private final Object w(Object obj) {
        Object objX;
        ou80 ou80Var;
        hwf0 hwf0Var = (hwf0) this.e;
        jwf0 jwf0Var = (jwf0) this.d;
        Context context = jwf0Var.a;
        byte b = this.c;
        String str = null;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            pd71 pd71Var = jwf0Var.e;
            String entityUri = hwf0Var.getEntityUri();
            this.c = (byte) 1;
            objX = j1p1.x(pd71Var, entityUri, this);
            if (objX != d9nVar) {
            }
            return d9nVar;
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        objX = obj;
        md71 md71Var = (nd71) objX;
        if (md71Var instanceof md71) {
            String str2 = md71Var.a;
            r35 r35Var = jwf0Var.b;
            String entityUri2 = hwf0Var.getEntityUri();
            String string = context.getString(hwf0Var.a() ? 2131953660 : 2131953765);
            xkg0 xkg0Var = new xkg0();
            if (str2 != null) {
            }
            xkg0Var.put("feature", "campfire_invite");
            xkg0Var.put("locale", context.getResources().getConfiguration().getLocales().get(0).getLanguage());
            a6j0 a6j0Var = new a6j0(entityUri2, string, (String) null, (String) null, (dqi1) null, xkg0Var.b(), (o371) null, 92);
            String str3 = (String) this.b;
            String str4 = (String) this.f;
            tqw tqwVar = (tqw) this.g;
            if (tqwVar != null && (ou80Var = n3o1.y(tqwVar).a) != null) {
                str = ou80Var.a;
            }
            this.c = (byte) 2;
            if (r35Var.a(context, a6j0Var, str3, str4, "android-libs-inappmessaging", str, this) == d9nVar) {
                return d9nVar;
            }
        } else if (!u890.j(md71Var, kd71.a)) {
            if (u890.j(md71Var, ld71.a)) {
                i1p1.x(jwf0Var.c);
                return rih1Var;
            }
            eg.o();
            return null;
        }
        return rih1Var;
    }

    private final Object x(Object obj) {
        faa0 faa0Var;
        v9i0 v9i0Var;
        String str = (String) this.b;
        w8i0 w8i0Var = (w8i0) this.e;
        byte b = this.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                faa0Var = (faa0) w8i0Var.c.get(str);
                if (faa0Var != null) {
                    this.d = faa0Var;
                    this.c = (byte) 1;
                    if (faa0Var.j(this) != d9nVar) {
                    }
                    return d9nVar;
                }
            } else {
                if (b != 1) {
                    if (b != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                faa0Var = (faa0) this.d;
                hm5.M(obj);
            }
            if ((faa0Var == null || !faa0Var.isCancelled()) && (v9i0Var = (v9i0) w8i0Var.d.remove(str)) != null) {
                geo0 geo0Var = geo0.b;
                ary aryVar = new ary((q9i0) this.f, (String) this.g, (String) this.b, w8i0Var, v9i0Var, (lnm) null);
                this.d = null;
                this.c = (byte) 2;
                if (fn31.Y(geo0Var, aryVar, this) == d9nVar) {
                    return d9nVar;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return rih1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                og5 og5Var = new og5((dt0) this.f, (mg5) this.e, (oab1) obj2, lnmVar);
                og5Var.b = obj;
                return og5Var;
            case 1:
                og5 og5Var2 = new og5(this.f, obj2, lnmVar, (byte) 1);
                og5Var2.e = obj;
                return og5Var2;
            case 2:
                og5 og5Var3 = new og5((zn6) obj2, lnmVar, (byte) 2);
                og5Var3.b = obj;
                return og5Var3;
            case 3:
                og5 og5Var4 = new og5((tq9) this.d, (tm) this.e, (ven0) this.f, (frr0) obj2, lnmVar, (byte) 3);
                og5Var4.b = obj;
                return og5Var4;
            case 4:
                og5 og5Var5 = new og5((String) this.e, (ova) this.f, (ps7) obj2, lnmVar, (byte) 4);
                og5Var5.b = obj;
                return og5Var5;
            case 5:
                og5 og5Var6 = new og5(this.f, obj2, lnmVar, (byte) 5);
                og5Var6.b = obj;
                return og5Var6;
            case 6:
                og5 og5Var7 = new og5(this.f, obj2, lnmVar, (byte) 6);
                og5Var7.b = obj;
                return og5Var7;
            case 7:
                og5 og5Var8 = new og5(this.f, obj2, lnmVar, (byte) 7);
                og5Var8.b = obj;
                return og5Var8;
            case 8:
                og5 og5Var9 = new og5(this.f, obj2, lnmVar, (byte) 8);
                og5Var9.e = obj;
                return og5Var9;
            case 9:
                og5 og5Var10 = new og5((lak) obj2, lnmVar, (byte) 9);
                og5Var10.b = obj;
                return og5Var10;
            case 10:
                og5 og5Var11 = new og5((m4o) this.e, (String) this.f, (String) obj2, lnmVar, (byte) 10);
                og5Var11.b = obj;
                return og5Var11;
            case 11:
                og5 og5Var12 = new og5((Set) this.d, (kb61) this.e, (kly0) this.f, (dn41) obj2, lnmVar, (byte) 11);
                og5Var12.b = obj;
                return og5Var12;
            case 12:
                return new og5(this.f, obj2, lnmVar, (byte) 12);
            case 13:
                og5 og5Var13 = new og5(this.f, obj2, lnmVar, (byte) 13);
                og5Var13.b = obj;
                return og5Var13;
            case 14:
                return new og5((byte) 14, this.d, this.e, this.b, this.f, obj2, lnmVar);
            case 15:
                og5 og5Var14 = new og5(this.f, obj2, lnmVar, (byte) 15);
                og5Var14.b = obj;
                return og5Var14;
            case 16:
                return new og5((byte) 16, this.d, this.e, this.b, this.f, obj2, lnmVar);
            case 17:
                return new og5((byte) 17, this.d, this.e, this.b, this.f, obj2, lnmVar);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                og5 og5Var15 = new og5(this.f, obj2, lnmVar, (byte) 18);
                og5Var15.b = obj;
                return og5Var15;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                og5 og5Var16 = new og5((xb60) obj2, lnmVar, (byte) 19);
                og5Var16.b = obj;
                return og5Var16;
            case 20:
                return new og5((byte) 20, this.d, this.e, this.b, this.f, obj2, lnmVar);
            case 21:
                og5 og5Var17 = new og5(this.f, obj2, lnmVar, (byte) 21);
                og5Var17.b = obj;
                return og5Var17;
            case 22:
                og5 og5Var18 = new og5((ywc0) this.e, (hti0) this.f, (rzq) obj2, lnmVar, (byte) 22);
                og5Var18.b = obj;
                return og5Var18;
            case 23:
                og5 og5Var19 = new og5((j3e0) this.d, (String) this.e, (f3e0) this.f, (m3e0) obj2, lnmVar, (byte) 23);
                og5Var19.b = obj;
                return og5Var19;
            case 24:
                return new og5(this.e, this.b, this.f, obj2, lnmVar, (byte) 24, false);
            case 25:
                og5 og5Var20 = new og5(this.f, obj2, lnmVar, (byte) 25);
                og5Var20.b = obj;
                return og5Var20;
            case 26:
                og5 og5Var21 = new og5((byp) this.e, (String) this.f, (String) obj2, lnmVar, (byte) 26);
                og5Var21.b = obj;
                return og5Var21;
            case 27:
                return new og5((byte) 27, this.d, this.e, this.b, this.f, obj2, lnmVar);
            case 28:
                return new og5(this.e, this.b, this.f, obj2, lnmVar, (byte) 28, false);
            default:
                og5 og5Var22 = new og5((ynb0) this.d, (kly0) this.e, (huz) this.f, (ynb0) obj2, lnmVar, (byte) 29);
                og5Var22.b = obj;
                return og5Var22;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:509:0x0b05 A[Catch: Exception -> 0x0ae2, CancellationException -> 0x0b3c, TryCatch #5 {CancellationException -> 0x0b3c, Exception -> 0x0ae2, blocks: (B:496:0x0ad9, B:513:0x0b21, B:507:0x0aff, B:509:0x0b05, B:520:0x0b32, B:522:0x0b3b, B:501:0x0ae9, B:504:0x0af0), top: B:533:0x0acf }] */
    /* JADX WARN: Code duplicated, block: B:512:0x0b1c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [p.lnm] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [p.faa0] */
    /* JADX WARN: Type inference failed for: r2v26, types: [p.faa0] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:381:0x07b8 -> B:529:0x0788). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:432:0x089c -> B:434:0x08a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:512:0x0b1c -> B:513:0x0b21). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 2950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.og5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og5(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og5(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b, boolean z) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og5(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og5(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og5(dt0 dt0Var, mg5 mg5Var, oab1 oab1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.f = dt0Var;
        this.e = mg5Var;
        this.g = oab1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og5(h0r0 h0r0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.g = h0r0Var;
    }
}
