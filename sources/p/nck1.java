package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nck1 extends a8d1 implements vu30 {
    public final /* synthetic */ boolean X;
    public s2t a;
    public WidgetState b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pck1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ qol1 h;
    public final /* synthetic */ t45 i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nck1(pck1 pck1Var, int i, String str, qol1 qol1Var, t45 t45Var, String str2, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.e = pck1Var;
        this.f = i;
        this.g = str;
        this.h = qol1Var;
        this.i = t45Var;
        this.t = str2;
        this.X = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        nck1 nck1Var = new nck1(this.e, this.f, this.g, this.h, this.i, this.t, this.X, lnmVar);
        nck1Var.d = obj;
        return nck1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r1 == r10) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r18
            java.lang.Object r0 = r7.d
            p.c9n r0 = (p.c9n) r0
            byte r1 = r7.c
            r8 = 2
            r2 = 1
            r9 = 0
            p.d9n r10 = p.d9n.a
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L22
            if (r1 != r8) goto L1c
            com.spotify.widgets.widgetstate.WidgetState r0 = r7.b
            p.hm5.M(r19)
            r1 = r19
        L1a:
            r15 = r0
            goto L68
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r9
        L22:
            p.s2t r0 = r7.a
            p.hm5.M(r19)
            r11 = r0
            r0 = r19
            goto L57
        L2b:
            p.hm5.M(r19)
            p.gqj1 r1 = new p.gqj1
            r3 = 5
            p.pck1 r4 = r7.e
            java.lang.String r5 = r7.g
            r1.<init>(r4, r5, r9, r3)
            r3 = 3
            r6 = 0
            p.s2t r11 = p.fn31.q(r0, r9, r6, r1, r3)
            r7.d = r9
            r7.a = r11
            r7.c = r2
            int r1 = r7.f
            p.qol1 r3 = r7.h
            r0 = r4
            p.t45 r4 = r7.i
            r2 = r5
            java.lang.String r5 = r7.t
            boolean r6 = r7.X
            java.lang.Object r0 = r0.d(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r10) goto L57
            goto L67
        L57:
            com.spotify.widgets.widgetstate.WidgetState r0 = (com.spotify.widgets.widgetstate.WidgetState) r0
            r7.d = r9
            r7.a = r9
            r7.b = r0
            r7.c = r8
            java.lang.Object r1 = r11.E(r7)
            if (r1 != r10) goto L1a
        L67:
            return r10
        L68:
            com.spotify.widgets.widgetstate.WidgetState r1 = (com.spotify.widgets.widgetstate.WidgetState) r1
            boolean r0 = r1 instanceof com.spotify.widgets.widgetstate.WidgetState.WrappedStory
            if (r0 == 0) goto L86
            r2 = r1
            com.spotify.widgets.widgetstate.WidgetState$WrappedStory r2 = (com.spotify.widgets.widgetstate.WidgetState.WrappedStory) r2
            r16 = 4095(0xfff, float:5.738E-42)
            r17 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.spotify.widgets.widgetstate.WidgetState$WrappedStory r0 = com.spotify.widgets.widgetstate.WidgetState.WrappedStory.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        L86:
            boolean r0 = r1 instanceof com.spotify.widgets.widgetstate.WidgetState.WrappedPlaylist
            if (r0 == 0) goto L9f
            r2 = r1
            com.spotify.widgets.widgetstate.WidgetState$WrappedPlaylist r2 = (com.spotify.widgets.widgetstate.WidgetState.WrappedPlaylist) r2
            r13 = 511(0x1ff, float:7.16E-43)
            r14 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = r15
            com.spotify.widgets.widgetstate.WidgetState$WrappedPlaylist r0 = com.spotify.widgets.widgetstate.WidgetState.WrappedPlaylist.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L9f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nck1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
