package p;

import com.spotify.playlist.policy.proto.AvailableConcepts;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class stk {
    public static final PlaylistRequestDecorationPolicy e;
    public final xv51 a;
    public final qia1 b;
    public final bpb1 c;
    public final ve01 d;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        l89 l89VarO = AvailableConcepts.o();
        l89VarO.q();
        l89VarO.n(0.7f);
        sku0VarP.s(l89VarO.build());
        hru0VarS.w(sku0VarP.build());
        e = hru0VarS.build();
    }

    public stk(xrc0 xrc0Var, kly0 kly0Var, h35 h35Var, c9n c9nVar, xv51 xv51Var, qia1 qia1Var) {
        this.a = xv51Var;
        this.b = qia1Var;
        bpb1 bpb1VarB = gio1.b(new ztc(Integer.valueOf(h35Var.a()), 203));
        this.c = bpb1VarB;
        ((upp0) kly0Var.get()).getClass();
        this.d = d5p1.r(new lt20(new fu20(rqt0.u(new x010(new ht20(bpb1VarB, new awe(this, (lnm) null, (byte) 11)), d5p1.r(rqt0.u(new nwd(((rsc0) xrc0Var).k(upp0.a(), new trc0(e, (g3d0) null, (Set) null, false, (src0) null, (mqz0) null, (prc0) null, 0, (List) null, 510)), (byte) 20)), c9nVar, new alb1(5000L, Long.MAX_VALUE), 1), new l2(3, (lnm) null, (byte) 26), (byte) 1)), new bag(this, (lnm) null, (byte) 29), (byte) 1), new ew0(this, (lnm) null, (byte) 12), (byte) 0), c9nVar, new alb1(5000L, Long.MAX_VALUE), 1);
    }

    public final Observable a() {
        return yoi1.i(this.d, o6x.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r6.c(r8, r0) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r6.a(r0) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.qtk
            if (r0 == 0) goto L13
            r0 = r9
            p.qtk r0 = (p.qtk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.qtk r0 = new p.qtk
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L34
            if (r1 == r3) goto L2c
            if (r1 != r2) goto L26
            goto L2c
        L26:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L2c:
            java.util.List r8 = r0.a
            java.util.List r8 = (java.util.List) r8
            p.hm5.M(r9)
            goto L6c
        L34:
            p.hm5.M(r9)
            int r9 = r8.length()
            if (r9 != 0) goto L40
            p.z6x r9 = p.z6x.a
            goto L44
        L40:
            java.util.List r9 = java.util.Collections.singletonList(r8)
        L44:
            int r1 = r8.length()
            p.d9n r5 = p.d9n.a
            p.xv51 r6 = r7.a
            if (r1 <= 0) goto L5e
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            r0.a = r1
            r0.d = r3
            java.lang.Object r8 = r6.c(r8, r0)
            if (r8 != r5) goto L5c
            goto L6b
        L5c:
            r8 = r9
            goto L6c
        L5e:
            r8 = r9
            java.util.List r8 = (java.util.List) r8
            r0.a = r8
            r0.d = r2
            java.lang.Object r8 = r6.a(r0)
            if (r8 != r5) goto L5c
        L6b:
            return r5
        L6c:
            p.bpb1 r7 = r7.c
            java.lang.Object r9 = r7.getValue()
            p.ztc r9 = (p.ztc) r9
            r0 = 0
            r1 = 251(0xfb, float:3.52E-43)
            p.ztc r8 = p.ztc.a(r9, r4, r8, r0, r1)
            r7.getClass()
            r7.m(r4, r8)
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.stk.b(java.lang.String, p.onm):java.lang.Object");
    }
}
