package p;

import android.app.PendingIntent;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.spotify.connect.castbasic.CastBasicException;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hxn extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hxn(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (p.wm5.u(r0, r5) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (p.wm5.u(r0, r5) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object A(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            p.t24 r0 = (p.t24) r0
            byte r1 = r5.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 == r4) goto Lf
            if (r1 != r3) goto L13
        Lf:
            p.hm5.M(r6)
            goto L5e
        L13:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            return r2
        L19:
            p.hm5.M(r6)
            p.hrr0 r6 = r0.h
            java.lang.Object r6 = r6.getValue()
            p.w3v r6 = (p.w3v) r6
            int r6 = r6.ordinal()
            p.d9n r1 = p.d9n.a
            if (r6 == 0) goto L49
            if (r6 == r4) goto L5e
            if (r6 != r3) goto L45
            java.lang.Object r6 = r5.e
            p.n9d1 r6 = (p.n9d1) r6
            r6.getClass()
            kotlin.jvm.functions.Function0 r6 = r6.b
            r6.invoke()
            r5.b = r3
            java.lang.Object r5 = p.wm5.u(r0, r5)
            if (r5 != r1) goto L5e
            goto L5d
        L45:
            p.eg.o()
            return r2
        L49:
            java.lang.Object r6 = r5.d
            p.n9d1 r6 = (p.n9d1) r6
            r6.getClass()
            kotlin.jvm.functions.Function0 r6 = r6.b
            r6.invoke()
            r5.b = r4
            java.lang.Object r5 = p.wm5.u(r0, r5)
            if (r5 != r1) goto L5e
        L5d:
            return r1
        L5e:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.A(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        if (r0 == r7) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = r0.c
            p.aas r1 = (p.aas) r1
            java.lang.Object r2 = r0.e
            java.lang.String r2 = (java.lang.String) r2
            byte r3 = r0.b
            r4 = 0
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L29
            if (r3 == r6) goto L23
            if (r3 != r5) goto L1d
            p.hm5.M(r20)
            r0 = r20
            goto L88
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r4
        L23:
            p.hm5.M(r20)
            r3 = r20
            goto L3f
        L29:
            p.hm5.M(r20)
            p.n3d0 r3 = r1.e
            java.lang.Object r8 = r0.d
            java.lang.String r8 = (java.lang.String) r8
            p.r3d0 r3 = r3.a(r8)
            r0.b = r6
            java.lang.Object r3 = r3.a(r2, r0)
            if (r3 != r7) goto L3f
            goto L87
        L3f:
            r10 = r3
            p.g3d0 r10 = (p.g3d0) r10
            p.xrc0 r1 = r1.d
            p.iqz0 r14 = new p.iqz0
            r3 = 1000(0x3e8, float:1.401E-42)
            r8 = 0
            r14.<init>(r8, r3)
            p.orc0[] r3 = new p.orc0[r5]
            p.sqc0 r9 = p.sqc0.a
            r3[r8] = r9
            p.xqc0 r8 = p.xqc0.a
            r3[r6] = r8
            java.util.Set r11 = p.f46.S0(r3)
            p.hru0 r3 = com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy.s()
            p.iou0 r8 = com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy.v()
            r8.D(r6)
            r3.v(r8)
            com.google.protobuf.h r3 = r3.build()
            r9 = r3
            com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy r9 = (com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy) r9
            p.trc0 r8 = new p.trc0
            r17 = 0
            r18 = 472(0x1d8, float:6.61E-43)
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.b = r5
            p.rsc0 r1 = (p.rsc0) r1
            java.lang.Object r0 = r1.f(r2, r8, r0)
            if (r0 != r7) goto L88
        L87:
            return r7
        L88:
            p.py21 r0 = (p.py21) r0
            java.lang.Object r0 = r0.c()
            p.wsc0 r0 = (p.wsc0) r0
            if (r0 == 0) goto Lbc
            java.util.List r0 = r0.e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p.q7h.U(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        La5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lbb
            java.lang.Object r2 = r0.next()
            p.zuc0 r2 = (p.zuc0) r2
            java.lang.String r2 = r2.c
            com.spotify.player.model.ContextTrack r2 = com.spotify.player.model.ContextTrack.create(r2)
            r1.add(r2)
            goto La5
        Lbb:
            return r1
        Lbc:
            java.lang.String r0 = "Failed to resolve list: "
            java.lang.String r0 = r0.concat(r2)
            p.k220.f(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            p.hm5.M(r7)
            goto L45
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L1b:
            p.hm5.M(r7)
            goto L35
        L1f:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.c
            p.mks r7 = (p.mks) r7
            java.lang.Object r1 = r6.e
            java.util.List r1 = (java.util.List) r1
            r6.d = r0
            r6.b = r4
            java.lang.Object r7 = r7.b(r1, r6)
            if (r7 != r5) goto L35
            goto L44
        L35:
            java.util.List r7 = (java.util.List) r7
            java.util.Objects.toString(r7)
            r6.d = r2
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L45
        L44:
            return r5
        L45:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r0.emit(r8, r7) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r7.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r8)
            goto L4f
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L1b:
            java.lang.Object r0 = r7.c
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r8)
            goto L42
        L23:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.e
            p.goq r8 = (p.goq) r8
            r7.d = r4
            r7.c = r0
            r7.b = r3
            java.lang.Object r1 = r8.h
            p.q8n r1 = (p.q8n) r1
            p.bu r3 = new p.bu
            r6 = 11
            r3.<init>(r8, r4, r6)
            java.lang.Object r8 = p.fn31.Y(r1, r3, r7)
            if (r8 != r5) goto L42
            goto L4e
        L42:
            r7.d = r4
            r7.c = r4
            r7.b = r2
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r5) goto L4f
        L4e:
            return r5
        L4f:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r7 == r4) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.b
            r1 = 2
            r2 = 1
            r3 = 0
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L17
            if (r0 != r1) goto L11
            p.hm5.M(r7)
            goto L5d
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r3
        L17:
            java.lang.Object r0 = r6.c
            p.oms r0 = (p.oms) r0
            p.hm5.M(r7)
            goto L49
        L1f:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.d
            p.bns r7 = (p.bns) r7
            p.idd1 r7 = r7.c
            java.lang.Object r7 = r7.getValue()
            p.vap r7 = (p.vap) r7
            p.jly0 r7 = r7.d
            java.lang.Object r7 = r7.get()
            r0 = r7
            p.oms r0 = (p.oms) r0
            java.lang.Object r7 = r6.e
            p.ans r7 = (p.ans) r7
            p.bl3 r7 = r7.a
            r6.c = r0
            r6.b = r2
            r7.getClass()
            p.t0z r7 = p.ak3.e
            if (r7 != r4) goto L49
            goto L5c
        L49:
            java.util.List r7 = (java.util.List) r7
            p.zlo r2 = new p.zlo
            r5 = 17
            r2.<init>(r7, r0, r3, r5)
            r6.c = r3
            r6.b = r1
            java.lang.Object r7 = p.smo1.s(r2, r6)
            if (r7 != r4) goto L5d
        L5c:
            return r4
        L5d:
            java.util.List r7 = (java.util.List) r7
            p.xms r6 = new p.xms
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r9 == r7) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.e
            p.xqs r1 = (p.xqs) r1
            java.lang.Object r2 = r8.d
            java.lang.String r2 = (java.lang.String) r2
            byte r3 = r8.b
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L27
            if (r3 == r5) goto L23
            if (r3 != r4) goto L1d
            p.hm5.M(r9)
            goto L74
        L1d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r6
        L23:
            p.hm5.M(r9)
            goto L48
        L27:
            p.hm5.M(r9)
            java.util.Set r9 = p.s4b1.f
            p.s4b1 r9 = p.uic.x(r0)
            p.blc0 r9 = r9.c
            p.blc0 r3 = p.blc0.ti
            if (r9 != r3) goto L81
            int r9 = r2.length()
            if (r9 != 0) goto L3d
            goto L81
        L3d:
            r8.b = r5
            p.idd1 r9 = p.xqs.e
            java.lang.Object r9 = r1.a(r0, r2, r8)
            if (r9 != r7) goto L48
            goto L73
        L48:
            com.spotify.player.model.PlayerState r9 = (com.spotify.player.model.PlayerState) r9
            if (r9 == 0) goto L53
            p.wm70 r8 = r1.b
            boolean r8 = r8.a(r9)
            goto L7c
        L53:
            java.util.Set r9 = p.s4b1.f
            p.s4b1 r9 = p.uic.x(r2)
            p.v5b1 r9 = r9.d
            if (r9 == 0) goto L61
            p.b3i1 r6 = r9.getType()
        L61:
            p.ixu0 r9 = p.nyu0.e
            boolean r9 = p.u890.j(r6, r9)
            if (r9 == 0) goto L7b
            r8.b = r4
            p.idd1 r9 = p.xqs.e
            java.lang.Object r9 = r1.b(r2, r8)
            if (r9 != r7) goto L74
        L73:
            return r7
        L74:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            goto L7c
        L7b:
            r8 = 0
        L7c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L81:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (p.upb0.i(r0, 0, r9) == r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (p.upb0.f(r0, 0, r9) == r8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            p.upb0 r0 = (p.upb0) r0
            java.lang.Object r1 = r9.e
            p.k1t r1 = (p.k1t) r1
            p.bpb1 r1 = r1.P0
            java.lang.Object r2 = r9.d
            p.os41 r2 = (p.os41) r2
            byte r3 = r9.b
            p.ms41 r4 = p.ms41.a
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L29
            if (r3 == r6) goto L25
            if (r3 != r5) goto L1f
            p.hm5.M(r10)
            goto L58
        L1f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r7
        L25:
            p.hm5.M(r10)
            goto L42
        L29:
            p.hm5.M(r10)
            boolean r10 = r2 instanceof p.ms41
            if (r10 != 0) goto L63
            boolean r10 = r2 instanceof p.ls41
            r3 = 0
            p.d9n r8 = p.d9n.a
            if (r10 == 0) goto L49
            r9.d = r7
            r9.b = r6
            java.lang.Object r9 = p.upb0.i(r0, r3, r9)
            if (r9 != r8) goto L42
            goto L57
        L42:
            r1.getClass()
            r1.m(r7, r4)
            goto L63
        L49:
            boolean r10 = r2 instanceof p.ns41
            if (r10 == 0) goto L5f
            r9.d = r7
            r9.b = r5
            java.lang.Object r9 = p.upb0.f(r0, r3, r9)
            if (r9 != r8) goto L58
        L57:
            return r8
        L58:
            r1.getClass()
            r1.m(r7, r4)
            goto L63
        L5f:
            p.eg.o()
            return r7
        L63:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            p.hm5.M(r7)
            goto L4b
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L1b:
            p.hm5.M(r7)
            p.pvg1 r7 = (p.pvg1) r7
            java.lang.String r7 = r7.a
            goto L35
        L23:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.c
            p.kw5 r7 = (p.kw5) r7
            r6.d = r0
            r6.b = r4
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r5) goto L35
            goto L4a
        L35:
            java.lang.String r7 = (java.lang.String) r7
            p.an41 r7 = new p.an41
            java.lang.Object r1 = r6.e
            p.ssm r1 = (p.ssm) r1
            r7.<init>(r1)
            r6.d = r2
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L4b
        L4a:
            return r5
        L4b:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.o(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[Catch: Exception -> 0x0096, TryCatch #0 {Exception -> 0x0096, blocks: (B:7:0x002b, B:8:0x0030, B:33:0x0081, B:11:0x0037, B:13:0x003c, B:15:0x0044, B:18:0x004d, B:21:0x0057, B:23:0x005b, B:25:0x0063, B:27:0x006e, B:30:0x0077, B:36:0x0090, B:37:0x0095), top: B:43:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        if (p.fn31.Y(r0, r1, r10) == r9) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r11) throws kotlin.NoWhenBranchMatchedException {
        /*
            r10 = this;
            java.lang.Object r0 = r10.c
            r4 = r0
            p.s6t r4 = (p.s6t) r4
            java.lang.Object r0 = r10.e
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r10.d
            r2 = r0
            p.t6t r2 = (p.t6t) r2
            p.q8n r0 = r2.h
            p.bfd r1 = r2.b
            p.add r5 = r2.g
            byte r6 = r10.b
            r7 = 3
            r8 = r5
            r5 = 0
            p.d9n r9 = p.d9n.a
            switch(r6) {
                case 0: goto L34;
                case 1: goto L30;
                case 2: goto L30;
                case 3: goto L30;
                case 4: goto L30;
                case 5: goto L2b;
                case 6: goto L26;
                default: goto L1f;
            }
        L1f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            r10 = 0
            return r10
        L26:
            p.hm5.M(r11)
            goto Lb2
        L2b:
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L96
            goto Lb2
        L30:
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L96
            goto L81
        L34:
            p.hm5.M(r11)
            boolean r11 = r4 instanceof p.q6t     // Catch: java.lang.Exception -> L96
            r6 = 1
            if (r11 == 0) goto L57
            p.qf4 r11 = r8.a     // Catch: java.lang.Exception -> L96
            boolean r11 = r11.i()     // Catch: java.lang.Exception -> L96
            if (r11 == 0) goto L4d
            r10.b = r6     // Catch: java.lang.Exception -> L96
            java.lang.Object r11 = r1.k(r3, r10)     // Catch: java.lang.Exception -> L96
            if (r11 != r9) goto L81
            goto Lb1
        L4d:
            r11 = 2
            r10.b = r11     // Catch: java.lang.Exception -> L96
            java.lang.Object r11 = r1.j(r3, r10)     // Catch: java.lang.Exception -> L96
            if (r11 != r9) goto L81
            goto Lb1
        L57:
            boolean r11 = r4 instanceof p.r6t     // Catch: java.lang.Exception -> L96
            if (r11 == 0) goto L90
            p.qf4 r11 = r8.a     // Catch: java.lang.Exception -> L96
            boolean r11 = r11.i()     // Catch: java.lang.Exception -> L96
            if (r11 == 0) goto L81
            r11 = r4
            p.r6t r11 = (p.r6t) r11     // Catch: java.lang.Exception -> L96
            p.zks0 r11 = r11.a     // Catch: java.lang.Exception -> L96
            boolean r11 = r11.g()     // Catch: java.lang.Exception -> L96
            if (r11 == 0) goto L77
            r10.b = r7     // Catch: java.lang.Exception -> L96
            java.lang.Object r11 = r1.u(r3, r10, r6)     // Catch: java.lang.Exception -> L96
            if (r11 != r9) goto L81
            goto Lb1
        L77:
            r11 = 4
            r10.b = r11     // Catch: java.lang.Exception -> L96
            java.lang.Object r11 = r1.k(r3, r10)     // Catch: java.lang.Exception -> L96
            if (r11 != r9) goto L81
            goto Lb1
        L81:
            p.n3s r11 = new p.n3s     // Catch: java.lang.Exception -> L96
            r11.<init>(r2, r5, r7)     // Catch: java.lang.Exception -> L96
            r1 = 5
            r10.b = r1     // Catch: java.lang.Exception -> L96
            java.lang.Object r10 = p.fn31.Y(r0, r11, r10)     // Catch: java.lang.Exception -> L96
            if (r10 != r9) goto Lb2
            goto Lb1
        L90:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L96
            r11.<init>()     // Catch: java.lang.Exception -> L96
            throw r11     // Catch: java.lang.Exception -> L96
        L96:
            p.dg30 r11 = r2.c
            p.u9c0 r11 = p.cto1.q(r11)
            p.o8n r11 = r11.b
            p.op71.x(r11)
            p.gke r1 = new p.gke
            r6 = 26
            r1.<init>(r2, r3, r4, r5, r6)
            r11 = 6
            r10.b = r11
            java.lang.Object r10 = p.fn31.Y(r0, r1, r10)
            if (r10 != r9) goto Lb2
        Lb1:
            return r9
        Lb2:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.p(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        w7t w7tVar = (w7t) this.c;
        vr20 vr20Var = (vr20) this.d;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            k2b0 k2b0Var = w7tVar.a;
            String str = ((l7t) this.e).c;
            this.d = vr20Var;
            this.b = (byte) 1;
            Object objD = k2b0Var.a.d(str, this);
            if (objD != d9nVar) {
                objD = rih1Var;
            }
            if (objD != d9nVar) {
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
        w7tVar.e.c.a(rih1Var);
        this.d = null;
        this.b = (byte) 2;
        return vr20Var.emit(x7t.a, this) == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r8.invoke(r1, r7) == r6) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object s(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            p.g58 r0 = (p.g58) r0
            java.lang.Object r1 = r7.d
            p.tv80 r1 = (p.tv80) r1
            byte r2 = r7.b
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L23
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L19
            p.hm5.M(r8)
            goto L68
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L1f:
            p.hm5.M(r8)
            goto L37
        L23:
            p.hm5.M(r8)
            p.am30 r8 = r0.g
            p.mr20 r8 = r8.a()
            r7.d = r1
            r7.b = r5
            java.lang.Object r8 = p.b5p1.i(r8, r7)
            if (r8 != r6) goto L37
            goto L67
        L37:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L57
            p.lzn0 r7 = r0.h
            if (r1 == 0) goto L4d
            p.ex20 r8 = p.ex20.d
            java.lang.String r8 = r8.g()
            r7.a(r8, r1, r3)
            goto L68
        L4d:
            p.ex20 r8 = p.ex20.d
            java.lang.String r8 = r8.g()
            r7.h(r8)
            goto L68
        L57:
            java.lang.Object r8 = r7.e
            p.wxm0 r8 = (p.wxm0) r8
            p.vu30 r8 = r8.b
            r7.d = r3
            r7.b = r4
            java.lang.Object r7 = r8.invoke(r1, r7)
            if (r7 != r6) goto L68
        L67:
            return r6
        L68:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r9 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r2.emit(r1, r8) == r7) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object t(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            p.vhv r0 = (p.vhv) r0
            java.util.Map r1 = r0.b
            java.lang.Object r2 = r8.d
            p.vr20 r2 = (p.vr20) r2
            byte r3 = r8.b
            r4 = 0
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L25
            if (r3 == r6) goto L21
            if (r3 != r5) goto L1b
            p.hm5.M(r9)
            goto L56
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L21:
            p.hm5.M(r9)
            goto L40
        L25:
            p.hm5.M(r9)
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L31
            p.b7x r9 = p.b7x.a
            goto L42
        L31:
            java.lang.Object r9 = r8.e
            p.yhv r9 = (p.yhv) r9
            r8.d = r2
            r8.b = r6
            java.lang.Object r9 = r9.e(r1, r8)
            if (r9 != r7) goto L40
            goto L55
        L40:
            java.util.Map r9 = (java.util.Map) r9
        L42:
            p.whv r1 = new p.whv
            java.lang.String r3 = r0.a
            boolean r0 = r0.c
            r1.<init>(r3, r9, r0)
            r8.d = r4
            r8.b = r5
            java.lang.Object r8 = r2.emit(r1, r8)
            if (r8 != r7) goto L56
        L55:
            return r7
        L56:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.t(java.lang.Object):java.lang.Object");
    }

    private final Object u(Object obj) {
        String str = ((zov) this.d).a;
        bfd bfdVar = (bfd) ((res) this.c).f;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            String str2 = ((yov) this.e).a;
            this.b = (byte) 1;
            Object objO = bfdVar.O(false, new os(str, str2, (byte) 8), new wed(bfdVar, str, str2, (lnm) null, (byte) 1), this);
            if (objO != d9nVar) {
                objO = rih1Var;
            }
            if (objO != d9nVar) {
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
        this.b = (byte) 2;
        return bfdVar.C(str, this) == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r10 == r7) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object v(java.lang.Object r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            p.j6w r0 = (p.j6w) r0
            io.reactivex.rxjava3.subjects.CompletableSubject r1 = r0.f
            byte r2 = r9.b
            r3 = 0
            r4 = 2
            r5 = 1
            p.rih1 r6 = p.rih1.a
            p.d9n r7 = p.d9n.a
            if (r2 == 0) goto L25
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L19
            p.hm5.M(r10)
            goto L5d
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r3
        L1f:
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            goto L40
        L23:
            r9 = move-exception
            goto L8b
        L25:
            p.hm5.M(r10)
            p.xrc0 r10 = r0.c     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            java.lang.Object r2 = r9.d     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            r9.b = r5     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            p.rsc0 r10 = (p.rsc0) r10     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            p.q8n r5 = r10.c     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            p.fsc0 r8 = new p.fsc0     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            r8.<init>(r10, r2, r3)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            java.lang.Object r10 = p.c921.H(r5, r8, r9)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            if (r10 != r7) goto L40
            goto L5c
        L40:
            p.py21 r10 = (p.py21) r10     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            boolean r2 = r10 instanceof p.oy21     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            if (r2 == 0) goto L70
            p.oy21 r10 = (p.oy21) r10     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            java.lang.Object r10 = r10.a     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            p.xu30 r2 = r0.e
            java.lang.Object r3 = r9.e
            p.udx0 r3 = (p.udx0) r3
            java.lang.String r3 = r3.a
            r9.b = r4
            java.lang.Object r10 = r2.invoke(r10, r3, r9)
            if (r10 != r7) goto L5d
        L5c:
            return r7
        L5d:
            p.i6w r10 = (p.i6w) r10
            p.qy81 r9 = r0.g
            p.qtw r0 = r10.a
            java.lang.Object r10 = r10.b
            r9.d = r0
            r9.e = r10
            r9.h()
            r1.onComplete()
            return r6
        L70:
            boolean r9 = r10 instanceof p.ly21     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            if (r9 == 0) goto L85
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            p.ly21 r10 = (p.ly21) r10     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            p.jy21 r10 = r10.a     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            r9.<init>(r10)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            r1.onError(r9)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            return r6
        L85:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            r9.<init>()     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
            throw r9     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L8f
        L8b:
            r1.onError(r9)
            return r6
        L8f:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.v(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.connect.castbasic.CastBasicException */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed A[RETURN] */
    private final Object w(Object obj) throws CastBasicException {
        vkr vkrVar = (vkr) this.c;
        ie61 ie61Var = (ie61) this.d;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        boolean z = ie61Var instanceof ge61;
        d9n d9nVar = d9n.a;
        if (z) {
            j4e j4eVar = ((ge61) ie61Var).a;
            this.d = null;
            this.b = (byte) 1;
            if (vkrVar.c(j4eVar, this) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (ie61Var instanceof de61) {
            String str = ((de61) ie61Var).a;
            this.d = null;
            this.b = (byte) 2;
            vkrVar.getClass();
            Object objE = vkrVar.b.e(str, this);
            if (objE != d9nVar) {
                objE = rih1Var;
            }
            if (objE == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (ie61Var instanceof ee61) {
            String str2 = ((ee61) ie61Var).a;
            j4e j4eVar2 = vkrVar.i;
            if (j4eVar2 == null || !j4eVar2.e()) {
                throw new CastBasicException(1, (Exception) null, "Session not found or not connected");
            }
            "Sending authentication message to device: ".concat(str2);
            b4e b4eVarA = j4eVar2.a();
            String str3 = ugl.a;
            zod.n("Must be called from the main thread.");
            arn1 arn1Var = b4eVarA.i;
            if (arn1Var == null) {
                new jub1(Looper.getMainLooper()).g(new Status(17, (String) null, (PendingIntent) null, (lal) null));
                return rih1Var;
            }
            hfp1 hfp1VarP = arn1Var.p(str3, str2);
            jub1 jub1Var = new jub1((j8n1) null, (byte) 2);
            i2i1 i2i1Var = new i2i1(jub1Var, (byte) 15);
            hfp1VarP.getClass();
            hfp1VarP.d(dsd1.a, i2i1Var);
            hfp1VarP.m(new csj1(jub1Var, (byte) 12));
            return rih1Var;
        }
        if (ie61Var instanceof ae61) {
            j4e j4eVar3 = vkrVar.i;
            vkrVar.i = null;
            if (j4eVar3 != null) {
                j4eVar3.f();
                return rih1Var;
            }
        } else {
            if (!(ie61Var instanceof fe61)) {
                n57.e(ie61Var + " not handled");
                return rih1Var;
            }
            qtz qtzVar = (qtz) this.e;
            fe61 fe61Var = (fe61) ie61Var;
            int i = fe61Var.a;
            String str4 = fe61Var.b;
            this.d = null;
            this.b = (byte) 3;
            if (qtzVar.a(i, str4, this) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r0.emit((java.util.List) r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object x(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            p.hm5.M(r7)
            goto L42
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L1b:
            p.hm5.M(r7)
            goto L35
        L1f:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.c
            p.yjq r7 = (p.yjq) r7
            java.lang.Object r1 = r6.e
            java.lang.String r1 = (java.lang.String) r1
            r6.d = r0
            r6.b = r4
            java.lang.Object r7 = r7.E(r1, r6)
            if (r7 != r5) goto L35
            goto L41
        L35:
            java.util.List r7 = (java.util.List) r7
            r6.d = r2
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L42
        L41:
            return r5
        L42:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object y(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r7)
            goto L44
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L1b:
            java.lang.Object r0 = r6.c
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r7)
            goto L37
        L23:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.e
            p.hce1 r7 = (p.hce1) r7
            r6.d = r4
            r6.c = r0
            r6.b = r3
            java.lang.Object r7 = r7.o(r6)
            if (r7 != r5) goto L37
            goto L43
        L37:
            r6.d = r4
            r6.c = r4
            r6.b = r2
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L44
        L43:
            return r5
        L44:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.y(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (p.fn31.Y(r10, r1, r9) == r6) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object z(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            p.b5x r0 = (p.b5x) r0
            byte r1 = r9.b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L18
            p.hm5.M(r10)
            goto L69
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r5
        L1e:
            p.hm5.M(r10)
            goto L57
        L22:
            java.lang.Object r1 = r9.d
            p.faa0 r1 = (p.faa0) r1
            p.hm5.M(r10)
            goto L4c
        L2a:
            p.hm5.M(r10)
            java.lang.Object r10 = r9.d
            p.c9n r10 = (p.c9n) r10
            p.mx r1 = new p.mx
            java.lang.Object r7 = r9.e
            android.content.Context r7 = (android.content.Context) r7
            r8 = 19
            r1.<init>(r7, r5, r8)
            r7 = 0
            p.xab1 r1 = p.fn31.T(r10, r5, r7, r1, r2)
            r9.d = r1
            r9.b = r4
            java.lang.Object r10 = r0.b(r9)
            if (r10 != r6) goto L4c
            goto L68
        L4c:
            r9.d = r5
            r9.b = r3
            java.lang.Object r10 = r1.j(r9)
            if (r10 != r6) goto L57
            goto L68
        L57:
            p.fns r10 = p.igu.a
            p.bs50 r10 = p.pyf0.a
            p.w4x r1 = new p.w4x
            r1.<init>(r0, r5, r4)
            r9.b = r2
            java.lang.Object r9 = p.fn31.Y(r10, r1, r9)
            if (r9 != r6) goto L69
        L68:
            return r6
        L69:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.z(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                hxn hxnVar = new hxn((asn) obj2, lnmVar, (byte) 0);
                hxnVar.d = obj;
                return hxnVar;
            case 1:
                return new hxn((q5o) this.d, (c6o) obj2, lnmVar, (byte) 1);
            case 2:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 2);
            case 3:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 3);
            case 4:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 4);
            case 5:
                return new hxn((xvo) this.d, (x0r) obj2, lnmVar, (byte) 5);
            case 6:
                hxn hxnVar2 = new hxn(this.c, obj2, false, lnmVar, (byte) 6);
                hxnVar2.d = obj;
                return hxnVar2;
            case 7:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 7);
            case 8:
                return new hxn((glr) this.d, (wcr) obj2, lnmVar, (byte) 8);
            case 9:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 9);
            case 10:
                hxn hxnVar3 = new hxn(this.c, obj2, false, lnmVar, (byte) 10);
                hxnVar3.d = obj;
                return hxnVar3;
            case 11:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 11);
            case 12:
                hxn hxnVar4 = new hxn(this.c, obj2, false, lnmVar, (byte) 12);
                hxnVar4.d = obj;
                return hxnVar4;
            case 13:
                hxn hxnVar5 = new hxn((goq) obj2, lnmVar, (byte) 13);
                hxnVar5.d = obj;
                return hxnVar5;
            case 14:
                return new hxn((bns) this.d, (ans) obj2, lnmVar, (byte) 14);
            case 15:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 15);
            case 16:
                hxn hxnVar6 = new hxn(this.c, obj2, false, lnmVar, (byte) 16);
                hxnVar6.d = obj;
                return hxnVar6;
            case 17:
                hxn hxnVar7 = new hxn(this.c, obj2, false, lnmVar, (byte) 17);
                hxnVar7.d = obj;
                return hxnVar7;
            case 18:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 18);
            case 19:
                hxn hxnVar8 = new hxn(this.c, obj2, false, lnmVar, (byte) 19);
                hxnVar8.d = obj;
                return hxnVar8;
            case 20:
                hxn hxnVar9 = new hxn(this.c, obj2, false, lnmVar, (byte) 20);
                hxnVar9.d = obj;
                return hxnVar9;
            case 21:
                hxn hxnVar10 = new hxn(this.c, obj2, false, lnmVar, (byte) 21);
                hxnVar10.d = obj;
                return hxnVar10;
            case 22:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 22);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 23);
            case 24:
                hxn hxnVar11 = new hxn(this.c, obj2, false, lnmVar, (byte) 24);
                hxnVar11.d = obj;
                return hxnVar11;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                hxn hxnVar12 = new hxn(this.c, obj2, false, lnmVar, (byte) 25);
                hxnVar12.d = obj;
                return hxnVar12;
            case 26:
                hxn hxnVar13 = new hxn((hce1) obj2, lnmVar, (byte) 26);
                hxnVar13.d = obj;
                return hxnVar13;
            case 27:
                hxn hxnVar14 = new hxn(this.c, obj2, false, lnmVar, (byte) 27);
                hxnVar14.d = obj;
                return hxnVar14;
            case 28:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 28);
            default:
                return new hxn(this.c, this.d, obj2, lnmVar, (byte) 29);
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
                return create((os41) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((uqo) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((os41) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((tv80) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((ie61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:449:0x085a  */
    /* JADX WARN: Code duplicated, block: B:451:0x0860  */
    /* JADX WARN: Code duplicated, block: B:454:0x0873 A[PHI: r2 r9
      0x0873: PHI (r2v6 java.lang.Object) = (r2v13 java.lang.Object), (r2v14 java.lang.Object) binds: [B:452:0x0870, B:447:0x084f] A[DONT_GENERATE, DONT_INLINE]
      0x0873: PHI (r9v2 p.lnm) = (r9v3 p.lnm), (r9v4 p.lnm) binds: [B:452:0x0870, B:447:0x084f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:457:0x0892 A[PHI: r2
      0x0892: PHI (r2v2 java.util.Set) = (r2v9 java.util.Set), (r2v17 java.util.Set) binds: [B:455:0x088f, B:446:0x0843] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:458:0x08a4 -> B:449:0x085a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 2302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hxn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hxn(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hxn(Object obj, Object obj2, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hxn(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
