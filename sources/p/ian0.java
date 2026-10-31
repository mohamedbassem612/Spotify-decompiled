package p;

import androidx.lifecycle.LifecycleDestroyedException;
import com.spotify.serviceapi.android.quasarworker.QuasarWorker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ian0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ian0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.f(r12, r11) == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r0.g(r12, r11) == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r0.f(r12, r11) == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (r0.g(r12, r11) == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.d
            p.xix0 r0 = (p.xix0) r0
            boolean r1 = r0.c
            p.zxl r2 = r0.a
            java.lang.Object r3 = r11.c
            p.mmr0 r3 = (p.mmr0) r3
            byte r4 = r11.b
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L29
            if (r4 == r8) goto L24
            if (r4 == r7) goto L24
            if (r4 == r6) goto L24
            if (r4 != r5) goto L1e
            goto L24
        L1e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r9
        L24:
            p.hm5.M(r12)
            goto Lbf
        L29:
            p.hm5.M(r12)
            java.lang.Object r12 = r3.a
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r3 = r3.b
            p.d10 r3 = (p.d10) r3
            p.qz r4 = p.qz.a
            boolean r4 = p.u890.j(r3, r4)
            p.d9n r10 = p.d9n.a
            if (r4 == 0) goto L58
            java.lang.String[] r3 = new java.lang.String[]{r12}
            p.dn3 r2 = r2.a
            r2.j(r3, r8)
            if (r1 == 0) goto Lbf
            java.util.List r12 = java.util.Collections.singletonList(r12)
            r11.c = r9
            r11.b = r8
            java.lang.Object r11 = r0.f(r12, r11)
            if (r11 != r10) goto Lbf
            goto Lbe
        L58:
            p.rz r4 = p.rz.a
            boolean r4 = p.u890.j(r3, r4)
            if (r4 == 0) goto L74
            r2.a(r12)
            if (r1 == 0) goto Lbf
            java.util.List r12 = java.util.Collections.singletonList(r12)
            r11.c = r9
            r11.b = r7
            java.lang.Object r11 = r0.g(r12, r11)
            if (r11 != r10) goto Lbf
            goto Lbe
        L74:
            boolean r12 = r3 instanceof p.sz
            r4 = 0
            if (r12 == 0) goto L9a
            p.sz r3 = (p.sz) r3
            java.util.List r12 = r3.a
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            p.dn3 r2 = r2.a
            r2.j(r3, r8)
            if (r1 == 0) goto Lbf
            r11.c = r9
            r11.b = r6
            java.lang.Object r11 = r0.f(r12, r11)
            if (r11 != r10) goto Lbf
            goto Lbe
        L9a:
            boolean r12 = r3 instanceof p.tz
            if (r12 == 0) goto Lc2
            p.tz r3 = (p.tz) r3
            java.util.List r12 = r3.a
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r6)
            java.lang.String[] r3 = (java.lang.String[]) r3
            p.dn3 r2 = r2.a
            r2.j(r3, r4)
            if (r1 == 0) goto Lbf
            r11.c = r9
            r11.b = r5
            java.lang.Object r11 = r0.g(r12, r11)
            if (r11 != r10) goto Lbf
        Lbe:
            return r10
        Lbf:
            p.rih1 r11 = p.rih1.a
            return r11
        Lc2:
            p.eg.o()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ian0.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x014b  */
    /* JADX WARN: Code duplicated, block: B:45:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        if (r2 == r9) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ian0.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r7.emit(r0, r6) == r3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.b
            r1 = 2
            r2 = 1
            p.d9n r3 = p.d9n.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            p.hm5.M(r7)
            goto L41
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L17:
            p.hm5.M(r7)
            goto L29
        L1b:
            p.hm5.M(r7)
            r6.b = r2
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = p.hap1.i(r4, r6)
            if (r7 != r3) goto L29
            goto L40
        L29:
            java.lang.Object r7 = r6.c
            p.ydz0 r7 = (p.ydz0) r7
            p.dt71 r7 = r7.f
            p.qdz0 r0 = new p.qdz0
            java.lang.Object r2 = r6.d
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r2)
            r6.b = r1
            java.lang.Object r6 = r7.emit(r0, r6)
            if (r6 != r3) goto L41
        L40:
            return r3
        L41:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ian0.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r6.a(r5) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r3.n(r0, r6, r5) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r6) {
        /*
            r5 = this;
            byte r0 = r5.b
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L12
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L12:
            p.hm5.M(r6)
            goto L41
        L16:
            p.hm5.M(r6)
            java.lang.Object r6 = r5.c
            p.lyz0 r6 = (p.lyz0) r6
            boolean r0 = r6.d
            java.lang.Object r3 = r5.d
            p.cm0 r3 = (p.cm0) r3
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L34
            java.lang.Object r6 = r3.e
            p.f1n0 r6 = (p.f1n0) r6
            r5.b = r2
            java.lang.Object r5 = r6.a(r5)
            if (r5 != r4) goto L41
            goto L40
        L34:
            java.lang.String r0 = r6.b
            java.lang.String r6 = r6.e
            r5.b = r1
            java.lang.Object r5 = r3.n(r0, r6, r5)
            if (r5 != r4) goto L41
        L40:
            return r4
        L41:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ian0.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r7 == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            p.r801 r0 = (p.r801) r0
            java.lang.Object r1 = r6.c
            p.c9n r1 = (p.c9n) r1
            byte r1 = r6.b
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            p.hm5.M(r7)     // Catch: java.lang.Throwable -> L17
            goto L4c
        L17:
            r6 = move-exception
            goto L4f
        L19:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L1f:
            p.hm5.M(r7)     // Catch: java.lang.Throwable -> L17
            goto L3b
        L23:
            p.hm5.M(r7)
            boolean r7 = r0.g     // Catch: java.lang.Throwable -> L17
            p.p901 r1 = r0.e
            java.lang.String r1 = r1.a
            p.d9n r5 = p.d9n.a
            if (r7 == 0) goto L3e
            r6.c = r4     // Catch: java.lang.Throwable -> L17
            r6.b = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r7 = r0.k(r1, r6)     // Catch: java.lang.Throwable -> L17
            if (r7 != r5) goto L3b
            goto L4b
        L3b:
            p.k8g1 r7 = (p.k8g1) r7     // Catch: java.lang.Throwable -> L17
            goto L54
        L3e:
            p.w701 r7 = r0.d     // Catch: java.lang.Throwable -> L17
            r6.c = r4     // Catch: java.lang.Throwable -> L17
            r6.b = r2     // Catch: java.lang.Throwable -> L17
            r2 = 6
            java.lang.Object r7 = p.w701.a(r7, r1, r6, r2)     // Catch: java.lang.Throwable -> L17
            if (r7 != r5) goto L4c
        L4b:
            return r5
        L4c:
            p.k8g1 r7 = (p.k8g1) r7     // Catch: java.lang.Throwable -> L17
            goto L54
        L4f:
            p.m231 r7 = new p.m231
            r7.<init>(r6)
        L54:
            boolean r6 = r7 instanceof p.m231
            if (r6 != 0) goto L60
            r6 = r7
            p.k8g1 r6 = (p.k8g1) r6
            r0.X = r6
            r0.i()
        L60:
            java.lang.Throwable r6 = p.e331.a(r7)
            if (r6 == 0) goto L6f
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L6e
            r0.h(r6)
            goto L6f
        L6e:
            throw r6
        L6f:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ian0.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f A[PHI: r0
      0x002f: PHI (r0v3 p.uac) = (r0v1 p.uac), (r0v2 p.uac), (r0v7 p.uac) binds: [B:10:0x0023, B:17:0x0050, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x003a A[PHI: r0 r5
      0x003a: PHI (r0v2 p.uac) = (r0v3 p.uac), (r0v5 p.uac) binds: [B:12:0x0037, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r5v3 java.lang.Object) = (r5v9 java.lang.Object), (r5v0 java.lang.Object) binds: [B:12:0x0037, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object m(java.lang.Object r5) {
        /*
            r4 = this;
            byte r0 = r4.b
            r1 = 2
            r2 = 1
            p.d9n r3 = p.d9n.a
            if (r0 == 0) goto L23
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L14
            java.lang.Object r0 = r4.c
            p.uac r0 = (p.uac) r0
            p.hm5.M(r5)
            goto L2f
        L14:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            r4 = 0
            return r4
        L1b:
            java.lang.Object r0 = r4.c
            p.uac r0 = (p.uac) r0
            p.hm5.M(r5)
            goto L3a
        L23:
            p.hm5.M(r5)
            java.lang.Object r5 = r4.d
            p.bbc r5 = (p.bbc) r5
            p.uac r0 = new p.uac
            r0.<init>(r5)
        L2f:
            r4.c = r0
            r4.b = r2
            java.lang.Object r5 = r0.a(r4)
            if (r5 != r3) goto L3a
            goto L52
        L3a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r0.c()
            p.iu30 r5 = (p.iu30) r5
            r4.c = r0
            r4.b = r1
            java.lang.Object r5 = r5.invoke(r4)
            if (r5 != r3) goto L2f
        L52:
            return r3
        L53:
            p.rih1 r4 = p.rih1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ian0.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (p.l4p1.s(r2, r1, r8) == r7) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            p.phi0 r0 = (p.phi0) r0
            java.lang.Object r1 = r0.f
            p.bpb1 r1 = (p.bpb1) r1
            java.lang.Object r2 = r8.c
            p.vr20 r2 = (p.vr20) r2
            byte r3 = r8.b
            r4 = 0
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L29
            if (r3 == r6) goto L23
            if (r3 != r5) goto L1d
            p.hm5.M(r9)
            goto L69
        L1d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L23:
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            goto L41
        L27:
            r9 = move-exception
            goto L56
        L29:
            p.hm5.M(r9)
            java.lang.Object r9 = r0.e     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            p.bfd r9 = (p.bfd) r9     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            java.lang.Object r3 = r0.b     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            r8.c = r2     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            r8.b = r6     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            p.nad r9 = r9.b     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            java.io.Serializable r9 = r9.t(r3, r8)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            if (r9 != r7) goto L41
            goto L68
        L41:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            java.lang.Object r0 = r0.c     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            p.sl01 r0 = (p.sl01) r0     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            boolean r9 = r9.contains(r0)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            r9 = r9 ^ r6
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            r1.m(r4, r9)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L54
            goto L5e
        L54:
            r8 = move-exception
            goto L6c
        L56:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "Failed to load disabled receipt types"
            com.spotify.base.java.logging.Logger.e(r9, r3, r0)
        L5e:
            r8.c = r4
            r8.b = r5
            java.lang.Object r8 = p.l4p1.s(r2, r1, r8)
            if (r8 != r7) goto L69
        L68:
            return r7
        L69:
            p.rih1 r8 = p.rih1.a
            return r8
        L6c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ian0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0047 -> B:11:0x001f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object p(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r7.b
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L11
            goto L1c
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L18:
            p.hm5.M(r8)
            goto L3d
        L1c:
            p.hm5.M(r8)
        L1f:
            java.lang.Object r8 = r7.d
            p.xl01 r8 = (p.xl01) r8
            p.b0a0 r8 = r8.b
            p.ynb0 r8 = r8.a
            java.lang.Object r8 = r8.get()
            p.no4 r8 = (p.no4) r8
            int r8 = r8.Y()
            long r5 = (long) r8
            r7.c = r0
            r7.b = r3
            java.lang.Object r8 = p.hap1.i(r5, r7)
            if (r8 != r4) goto L3d
            goto L49
        L3d:
            r7.c = r0
            r7.b = r2
            p.rih1 r8 = p.rih1.a
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r4) goto L1f
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ian0.p(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        vr20 vr20Var = (vr20) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            n5f0 n5f0Var = new n5f0(2000L, 5000L);
            cqz0 cqz0Var = dqz0.a;
            long jI = yoi1.I(n5f0Var);
            this.c = vr20Var;
            this.b = (byte) 1;
            if (hap1.i(jI, this) != d9nVar) {
            }
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
        lt20 lt20Var = (lt20) this.d;
        nw5 nw5Var = new nw5(2, (lnm) null, (byte) 24);
        this.c = null;
        this.b = (byte) 2;
        u4p1.S(vr20Var);
        Object objCollect = lt20Var.collect(new eu20(vr20Var, nw5Var, (byte) 1), this);
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ian0 ian0Var = new ian0((kqi0) obj2, lnmVar, (byte) 0);
                ian0Var.c = obj;
                return ian0Var;
            case 1:
                return new ian0((syn0) obj2, lnmVar, (byte) 1);
            case 2:
                return new ian0((j5o0) this.c, (s880) obj2, lnmVar, (byte) 2);
            case 3:
                ian0 ian0Var2 = new ian0((g2z) obj2, lnmVar, (byte) 3);
                ian0Var2.c = obj;
                return ian0Var2;
            case 4:
                return new ian0((e6p0) this.c, (l4p0) obj2, lnmVar, (byte) 4);
            case 5:
                return new ian0((tfp0) obj2, lnmVar, (byte) 5);
            case 6:
                return new ian0((AtomicBoolean) this.c, (ssw0) obj2, lnmVar, (byte) 6);
            case 7:
                return new ian0((ojq0) this.c, (String) obj2, lnmVar, (byte) 7);
            case 8:
                return new ian0((vx61) this.c, (ojq0) obj2, lnmVar, (byte) 8);
            case 9:
                ian0 ian0Var3 = new ian0((czr0) obj2, lnmVar, (byte) 9);
                ian0Var3.c = obj;
                return ian0Var3;
            case 10:
                ian0 ian0Var4 = new ian0((n2s0) obj2, lnmVar, (byte) 10);
                ian0Var4.c = obj;
                return ian0Var4;
            case 11:
                return new ian0((vss0) this.c, (r9c) obj2, lnmVar, (byte) 11);
            case 12:
                ian0 ian0Var5 = new ian0((hju0) obj2, lnmVar, (byte) 12);
                ian0Var5.c = obj;
                return ian0Var5;
            case 13:
                return new ian0((hlu0) this.c, (String) obj2, lnmVar, (byte) 13);
            case 14:
                ian0 ian0Var6 = new ian0((j7s) obj2, lnmVar, (byte) 14);
                ian0Var6.c = obj;
                return ian0Var6;
            case 15:
                ian0 ian0Var7 = new ian0((ytp0) obj2, lnmVar, (byte) 15);
                ian0Var7.c = obj;
                return ian0Var7;
            case 16:
                ian0 ian0Var8 = new ian0((wvv0) obj2, lnmVar, (byte) 16);
                ian0Var8.c = obj;
                return ian0Var8;
            case 17:
                ian0 ian0Var9 = new ian0((kcw0) obj2, lnmVar, (byte) 17);
                ian0Var9.c = obj;
                return ian0Var9;
            case 18:
                ian0 ian0Var10 = new ian0((xix0) obj2, lnmVar, (byte) 18);
                ian0Var10.c = obj;
                return ian0Var10;
            case 19:
                return new ian0((p7y0) obj2, lnmVar, (byte) 19);
            case 20:
                ian0 ian0Var11 = new ian0((QuasarWorker) obj2, lnmVar, (byte) 20);
                ian0Var11.c = obj;
                return ian0Var11;
            case 21:
                return new ian0((nl9) this.c, (gaz0) obj2, lnmVar, (byte) 21);
            case 22:
                return new ian0((ydz0) this.c, (String) obj2, lnmVar, (byte) 22);
            case 23:
                return new ian0((lyz0) this.c, (cm0) obj2, lnmVar, (byte) 23);
            case 24:
                ian0 ian0Var12 = new ian0((r801) obj2, lnmVar, (byte) 24);
                ian0Var12.c = obj;
                return ian0Var12;
            case 25:
                return new ian0((bbc) obj2, lnmVar, (byte) 25);
            case 26:
                ian0 ian0Var13 = new ian0((phi0) obj2, lnmVar, (byte) 26);
                ian0Var13.c = obj;
                return ian0Var13;
            case 27:
                ian0 ian0Var14 = new ian0((xl01) obj2, lnmVar, (byte) 27);
                ian0Var14.c = obj;
                return ian0Var14;
            case 28:
                ian0 ian0Var15 = new ian0((lt20) obj2, lnmVar, (byte) 28);
                ian0Var15.c = obj;
                return ian0Var15;
            default:
                return new ian0((az11) this.c, (x020) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    public final Object invoke(Object obj, Object obj2) throws LifecycleDestroyedException {
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                create((jnd0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 15:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 28:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX WARN: Code duplicated, block: B:465:0x093c A[PHI: r1
      0x093c: PHI (r1v10 p.uac) = (r1v8 p.uac), (r1v9 p.uac), (r1v12 p.uac) binds: [B:464:0x0932, B:471:0x0960, B:461:0x0919] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:468:0x0948 A[PHI: r0 r1
      0x0948: PHI (r0v6 java.lang.Object) = (r0v12 java.lang.Object), (r0v15 java.lang.Object) binds: [B:466:0x0945, B:463:0x0927] A[DONT_GENERATE, DONT_INLINE]
      0x0948: PHI (r1v9 p.uac) = (r1v10 p.uac), (r1v11 p.uac) binds: [B:466:0x0945, B:463:0x0927] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:470:0x0950  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:267:0x056c -> B:258:0x052f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:382:0x07d2 -> B:376:0x07b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:471:0x0960 -> B:465:0x093c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws androidx.lifecycle.LifecycleDestroyedException {
        /*
            Method dump skipped, instruction units count: 2654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ian0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ian0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
