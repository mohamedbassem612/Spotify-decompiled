package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class si20 implements ol8 {
    public final mev a;
    public final o241 b;
    public final g3s0 c;
    public final llm d;

    public si20(mev mevVar, o241 o241Var, g3s0 g3s0Var, q8n q8nVar) {
        this.a = mevVar;
        this.b = o241Var;
        this.c = g3s0Var;
        this.d = smo1.e(ilo1.B(q8nVar, new z8n("FirebaseAnalyticsManager")));
    }

    @Override // p.ol8
    public final void a(ck8 ck8Var) {
        c921.y(this.d, (o8n) null, 0, new xd1(this, ck8Var, (lnm) null, (byte) 9), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        qi20 qi20Var;
        if (onmVar instanceof qi20) {
            qi20Var = (qi20) onmVar;
            int i = qi20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qi20Var.c = i - Integer.MIN_VALUE;
            } else {
                qi20Var = new qi20(this, onmVar);
            }
        } else {
            qi20Var = new qi20(this, onmVar);
        }
        Object objI = qi20Var.a;
        int i2 = qi20Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            ezc ezcVarG = yoi1.g(this.b.b("allow-advertising-id-transmission").map(f331.R0));
            qi20Var.c = 1;
            objI = b5p1.i(ezcVarG, qi20Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        return objI;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006b -> B:29:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(long r11, p.onm r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p.ri20
            if (r0 == 0) goto L13
            r0 = r13
            p.ri20 r0 = (p.ri20) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.ri20 r0 = new p.ri20
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            long r10 = r0.a
            p.si20 r12 = r0.b
            p.hm5.M(r13)
            goto L6e
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r4
        L35:
            long r10 = r0.a
            p.si20 r12 = r0.b
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L61
            goto L58
        L3d:
            p.hm5.M(r13)
        L40:
            p.g3s0 r13 = r10.c     // Catch: java.lang.Exception -> L5e
            p.f3s0 r1 = p.f3s0.f     // Catch: java.lang.Exception -> L5e
            io.reactivex.rxjava3.core.Single r13 = r13.a(r1)     // Catch: java.lang.Exception -> L5e
            r0.b = r10     // Catch: java.lang.Exception -> L5e
            r0.a = r11     // Catch: java.lang.Exception -> L5e
            r0.e = r3     // Catch: java.lang.Exception -> L5e
            java.lang.Object r13 = p.fc11.j(r13, r0)     // Catch: java.lang.Exception -> L5e
            if (r13 != r5) goto L55
            goto L6d
        L55:
            r8 = r11
            r12 = r10
            r10 = r8
        L58:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Exception -> L61
        L5a:
            r8 = r10
            r10 = r12
            r11 = r8
            goto L70
        L5e:
            r8 = r11
            r12 = r10
            r10 = r8
        L61:
            r0.b = r12
            r0.a = r10
            r0.e = r2
            java.lang.Object r13 = p.hap1.i(r10, r0)
            if (r13 != r5) goto L6e
        L6d:
            return r5
        L6e:
            r13 = r4
            goto L5a
        L70:
            if (r13 != 0) goto L76
            r6 = 2
            long r11 = r11 * r6
            goto L40
        L76:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.si20.c(long, p.onm):java.lang.Object");
    }
}
