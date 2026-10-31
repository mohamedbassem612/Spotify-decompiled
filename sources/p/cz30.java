package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cz30 {
    public final ynb0 a;
    public final q8n b;
    public final idd1 c = new idd1(new f710(this, (byte) 24));
    public r091 d;

    public cz30(ynb0 ynb0Var, q8n q8nVar) {
        this.a = ynb0Var;
        this.b = q8nVar;
    }

    public static lsm0 b(String str, boolean z) {
        return new lsm0(str, new ksm0(fec1.c, (String) null, (String) null, "music-guesser", (String) null, (String) null, 502), z, false, (jsm0) null, 0L, (ism0) null, (String) null, true, 0, 1784);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0080 -> B:28:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(p.onm r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p.zy30
            if (r0 == 0) goto L13
            r0 = r8
            p.zy30 r0 = (p.zy30) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.zy30 r0 = new p.zy30
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            int r1 = r0.b
            int r4 = r0.a
            p.hm5.M(r8)
            goto L83
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L30:
            p.hm5.M(r8)
            p.r091 r8 = r7.d
            if (r8 == 0) goto L4a
            p.g0f1 r8 = r8.e
            p.bpb1 r8 = r8.b
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L4a
            p.r091 r7 = r7.d
            return r7
        L4a:
            r8 = 0
            r1 = 3
            r4 = r1
            r1 = r8
        L4e:
            if (r1 >= r4) goto L85
            p.ynb0 r8 = r7.a
            java.lang.Object r8 = r8.get()
            p.ttm0 r8 = (p.ttm0) r8
            p.idd1 r5 = r7.c
            java.lang.Object r6 = r5.getValue()
            p.zau0 r6 = (p.zau0) r6
            r8.a(r6)
            java.lang.Object r8 = r5.getValue()
            p.zau0 r8 = (p.zau0) r8
            p.r091 r8 = r8.a()
            r7.d = r8
            if (r8 == 0) goto L72
            return r8
        L72:
            r0.a = r4
            r0.b = r1
            r0.e = r3
            r5 = 200(0xc8, double:9.9E-322)
            java.lang.Object r8 = p.hap1.i(r5, r0)
            p.d9n r5 = p.d9n.a
            if (r8 != r5) goto L83
            return r5
        L83:
            int r1 = r1 + r3
            goto L4e
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cz30.a(p.onm):java.lang.Object");
    }

    public final Object c(String str, onm onmVar) {
        Object objY = fn31.Y(this.b, new az30(this, str, null, (byte) 0), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    public final Object d(String str, onm onmVar) {
        Object objY = fn31.Y(this.b, new xtz(this, str, (lnm) null, (byte) 6), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
