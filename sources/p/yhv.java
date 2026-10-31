package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yhv implements xpw {
    public final gw70 a;
    public final boolean b;
    public final js20 c = x3p1.n(new nit(this, (byte) 21), o6v.d1, fdv.e, (o8n) null, (iu30) null, 24);
    public final eih1 d = new eih1();
    public final psw e;

    public yhv(gw70 gw70Var, boolean z) {
        this.a = gw70Var;
        this.b = z;
        j2i j2iVar = new j2i(1686392479, new ent(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0087 -> B:24:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.util.Map r11, p.onm r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p.xhv
            if (r0 == 0) goto L13
            r0 = r12
            p.xhv r0 = (p.xhv) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            p.xhv r0 = new p.xhv
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.g
            int r1 = r0.i
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L35
            int r11 = r0.f
            int r1 = r0.e
            int r5 = r0.d
            java.lang.String r6 = r0.c
            java.util.Iterator r7 = r0.b
            java.util.Collection r8 = r0.a
            java.util.Collection r8 = (java.util.Collection) r8
            p.hm5.M(r12)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            goto L8a
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r4
        L3b:
            java.util.ArrayList r12 = p.hrt.j(r12)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r8 = r12
            r11 = r3
            r1 = r11
            r5 = r1
        L4c:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L99
            java.lang.Object r12 = r7.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r6 = r12.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            p.gw70 r9 = r10.a     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            p.ixg r12 = r9.f(r12)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            r12.g = r3     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            io.reactivex.rxjava3.core.Single r12 = r12.i()     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            r0.a = r9     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            r0.b = r7     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            r0.c = r6     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            r0.d = r5     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            r0.e = r1     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            r0.f = r11     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            r0.i = r2     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            java.lang.Object r12 = p.fc11.j(r12, r0)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            p.d9n r9 = p.d9n.a
            if (r12 != r9) goto L8a
            return r9
        L8a:
            p.mmr0 r9 = new p.mmr0     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            r9.<init>(r6, r12)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L97
            goto L91
        L90:
            r9 = r4
        L91:
            if (r9 == 0) goto L4c
            r8.add(r9)
            goto L4c
        L97:
            r10 = move-exception
            throw r10
        L99:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Map r10 = p.sqg0.T(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yhv.e(java.util.Map, p.onm):java.lang.Object");
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
