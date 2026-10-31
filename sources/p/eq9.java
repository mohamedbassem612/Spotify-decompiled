package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eq9 extends a8d1 implements xu30 {
    public byte a;
    public /* synthetic */ vr20 b;
    public /* synthetic */ yp9 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ yu3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq9(boolean z, yu3 yu3Var, lnm lnmVar) {
        super(3, lnmVar);
        this.d = z;
        this.e = yu3Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        eq9 eq9Var = new eq9(this.d, this.e, (lnm) obj3);
        eq9Var.b = (vr20) obj;
        eq9Var.c = (yp9) obj2;
        return eq9Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r11 == r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r11 == r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r11 == r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        if (r0.emit(r11, r10) == r9) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            p.vr20 r0 = r10.b
            p.yp9 r1 = r10.c
            byte r2 = r10.a
            r3 = 0
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            p.d9n r9 = p.d9n.a
            if (r2 == 0) goto L2f
            if (r2 == r8) goto L2b
            if (r2 == r7) goto L27
            if (r2 == r6) goto L23
            if (r2 != r5) goto L1d
            p.hm5.M(r11)
            goto Lb4
        L1d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r3
        L23:
            p.hm5.M(r11)
            goto L89
        L27:
            p.hm5.M(r11)
            goto L6f
        L2b:
            p.hm5.M(r11)
            goto L4e
        L2f:
            p.hm5.M(r11)
            boolean r11 = r1 instanceof p.wp9
            p.yu3 r2 = r10.e
            if (r11 == 0) goto L75
            boolean r11 = r10.d
            if (r11 == 0) goto L55
            r11 = r1
            p.wp9 r11 = (p.wp9) r11
            com.spotify.player.model.ContextTrack r11 = r11.a
            r10.b = r0
            r10.c = r1
            r10.a = r8
            java.lang.Object r11 = r2.f(r0, r11, r10)
            if (r11 != r9) goto L4e
            goto Lb3
        L4e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r4 = r11.booleanValue()
            goto L8f
        L55:
            r11 = r1
            p.wp9 r11 = (p.wp9) r11
            boolean r6 = r11.c
            if (r6 == 0) goto L8f
            java.lang.Object r2 = r2.d
            p.ix7 r2 = (p.ix7) r2
            com.spotify.player.model.ContextTrack r11 = r11.a
            r10.b = r0
            r10.c = r1
            r10.a = r7
            java.lang.Enum r11 = r2.F(r11, r4, r10)
            if (r11 != r9) goto L6f
            goto Lb3
        L6f:
            p.tr9 r2 = p.tr9.b
            if (r11 == r2) goto L8f
            r4 = r8
            goto L8f
        L75:
            boolean r11 = r1 instanceof p.xp9
            if (r11 == 0) goto Lb7
            r11 = r1
            p.xp9 r11 = (p.xp9) r11
            r10.b = r0
            r10.c = r1
            r10.a = r6
            java.lang.Object r11 = r2.g(r0, r11, r10)
            if (r11 != r9) goto L89
            goto Lb3
        L89:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r4 = r11.booleanValue()
        L8f:
            if (r4 == 0) goto Lb4
            p.pp9 r11 = new p.pp9
            p.op9 r2 = new p.op9
            java.lang.String r4 = r1.getContextUri()
            com.spotify.player.model.ContextTrack r1 = r1.a()
            java.lang.String r1 = r1.uri()
            r2.<init>(r4, r1)
            r11.<init>(r2)
            r10.b = r3
            r10.c = r3
            r10.a = r5
            java.lang.Object r10 = r0.emit(r11, r10)
            if (r10 != r9) goto Lb4
        Lb3:
            return r9
        Lb4:
            p.rih1 r10 = p.rih1.a
            return r10
        Lb7:
            p.eg.o()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eq9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
