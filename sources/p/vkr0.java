package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vkr0 implements vr20 {
    public final /* synthetic */ vr20 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xkr0 d;
    public final /* synthetic */ bpb1 e;

    public vkr0(vr20 vr20Var, long j, int i, xkr0 xkr0Var, bpb1 bpb1Var) {
        this.b = j;
        this.c = i;
        this.d = xkr0Var;
        this.e = bpb1Var;
        this.a = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (p.b5p1.j(r6, r15, r2) == r11) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r14, p.lnm r15) {
        /*
            r13 = this;
            p.xkr0 r0 = r13.d
            p.bpb1 r1 = r0.f
            boolean r2 = r15 instanceof p.ukr0
            if (r2 == 0) goto L17
            r2 = r15
            p.ukr0 r2 = (p.ukr0) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            p.ukr0 r2 = new p.ukr0
            r2.<init>(r13, r15)
        L1c:
            java.lang.Object r15 = r2.a
            int r3 = r2.b
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r13.c
            long r6 = r13.b
            r8 = 1
            r9 = 2
            r10 = 0
            p.d9n r11 = p.d9n.a
            if (r3 == 0) goto L44
            if (r3 == r8) goto L3c
            if (r3 != r9) goto L36
            p.hm5.M(r15)
            goto L90
        L36:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r10
        L3c:
            int r14 = r2.e
            spotify.your_library.esperanto.proto.YourLibraryResponse r3 = r2.d
            p.hm5.M(r15)
            goto L64
        L44:
            p.hm5.M(r15)
            r3 = r14
            spotify.your_library.esperanto.proto.YourLibraryResponse r3 = (spotify.your_library.esperanto.proto.YourLibraryResponse) r3
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r6)
            p.mmr0 r15 = new p.mmr0
            r15.<init>(r3, r14)
            r2.d = r3
            r14 = 0
            r2.e = r14
            r2.b = r8
            p.vr20 r12 = r13.a
            java.lang.Object r15 = r12.emit(r15, r2)
            if (r15 != r11) goto L64
            goto L8f
        L64:
            spotify.your_library.esperanto.proto.YourLibraryResponseHeader r15 = r3.q()
            int r15 = r15.t()
            if (r15 <= 0) goto Lab
            if (r5 == r4) goto Lab
            p.bpb1 r15 = r0.g
            p.skr0 r3 = new p.skr0
            r3.<init>(r6, r10)
            p.x010 r6 = new p.x010
            r6.<init>(r15, r1, r3, r8)
            p.nw5 r15 = new p.nw5
            r3 = 19
            r15.<init>(r9, r10, r3)
            r2.d = r10
            r2.e = r14
            r2.b = r9
            java.lang.Object r14 = p.b5p1.j(r6, r15, r2)
            if (r14 != r11) goto L90
        L8f:
            return r11
        L90:
            java.lang.Long r14 = new java.lang.Long
            r2 = 0
            r14.<init>(r2)
            r1.m(r10, r14)
            boolean r14 = r0.e
            if (r14 == 0) goto L9f
            goto La1
        L9f:
            int r4 = r5 + 50
        La1:
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r4)
            p.bpb1 r13 = r13.e
            r13.m(r10, r14)
        Lab:
            p.rih1 r13 = p.rih1.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vkr0.emit(java.lang.Object, p.lnm):java.lang.Object");
    }
}
