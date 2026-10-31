package p;

import android.util.Base64;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.playlistreaction.v1.ListReactionsResponse;
import com.spotify.playlistreaction.v1.ReactionListDisplay;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tou0 implements sxz0 {
    public static final PlaylistRequestDecorationPolicy h;
    public final ahu0 a;
    public final uqv0 b;
    public final xrc0 c;
    public final fum0 d;
    public final xnu0 e;
    public final boolean f;
    public final List g = dyz0.a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.v();
        hru0VarS.u(iou0VarV.build());
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.B();
        hru0VarS.y(vwu0VarR.build());
        llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
        llu0VarR.A();
        hru0VarS.s(llu0VarR.build());
        h = hru0VarS.build();
    }

    public tou0(ahu0 ahu0Var, pvc pvcVar, uqv0 uqv0Var, xrc0 xrc0Var, fum0 fum0Var, xnu0 xnu0Var) {
        this.a = ahu0Var;
        this.b = uqv0Var;
        this.c = xrc0Var;
        this.d = fum0Var;
        this.e = xnu0Var;
        this.f = ahu0Var.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        if (r13 == r5) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.frd1 r10, java.lang.String r11, java.lang.String r12, p.onm r13) {
        /*
            r9 = this;
            boolean r12 = r13 instanceof p.pou0
            if (r12 == 0) goto L13
            r12 = r13
            p.pou0 r12 = (p.pou0) r12
            int r0 = r12.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r12.d = r0
            goto L18
        L13:
            p.pou0 r12 = new p.pou0
            r12.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r12.b
            int r0 = r12.d
            r1 = 2
            java.lang.String r2 = ""
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r0 == 0) goto L3a
            if (r0 == r3) goto L34
            if (r0 != r1) goto L2e
            p.hm5.M(r13)
            goto Lbb
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r4
        L34:
            java.lang.String r11 = r12.a
            p.hm5.M(r13)
            goto L49
        L3a:
            p.hm5.M(r13)
            r12.a = r11
            r12.d = r3
            java.io.Serializable r13 = r9.j(r10, r12)
            if (r13 != r5) goto L49
            goto Lba
        L49:
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L4f
            p.z6x r13 = p.z6x.a
        L4f:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r13 = r13.iterator()
        L5a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r13.next()
            r6 = r0
            p.vxz0 r6 = (p.vxz0) r6
            if (r11 == 0) goto L70
            java.lang.String r6 = r6.a
            boolean r6 = r6.equals(r11)
            goto L71
        L70:
            r6 = r3
        L71:
            if (r6 == 0) goto L5a
            r10.add(r0)
            goto L5a
        L77:
            java.util.ArrayList r11 = new java.util.ArrayList
            r13 = 10
            int r13 = p.q7h.U(r10, r13)
            r11.<init>(r13)
            java.util.Iterator r10 = r10.iterator()
        L86:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto Lae
            java.lang.Object r13 = r10.next()
            p.vxz0 r13 = (p.vxz0) r13
            p.lfi1 r0 = new p.lfi1
            p.ifi1 r3 = new p.ifi1
            p.uxz0 r6 = r13.c
            java.lang.String r6 = r6.a
            java.lang.String r7 = "spotify:user:"
            java.lang.String r6 = p.ihc1.H0(r6, r7)
            r3.<init>(r2, r6, r2)
            java.lang.String r6 = r13.a
            long r7 = r13.b
            r0.<init>(r3, r6, r7)
            r11.add(r0)
            goto L86
        Lae:
            r12.a = r4
            r12.d = r1
            p.fum0 r9 = r9.d
            java.lang.Object r13 = r9.a(r11, r12)
            if (r13 != r5) goto Lbb
        Lba:
            return r5
        Lbb:
            java.util.List r13 = (java.util.List) r13
            p.blr0 r9 = new p.blr0
            r9.<init>(r13, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tou0.a(p.frd1, java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    public final Object b(frd1 frd1Var, String str, a8d1 a8d1Var) {
        Object objC = this.b.c(frd1Var.b, frd1Var.a, str, a8d1Var);
        return objC == d9n.a ? objC : rih1.a;
    }

    public final boolean c() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r6.b.h(r1, r7, r8, r0) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(p.frd1 r7, p.lnm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.sou0
            if (r0 == 0) goto L13
            r0 = r8
            p.sou0 r0 = (p.sou0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            p.sou0 r0 = new p.sou0
            p.onm r8 = (p.onm) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            p.hm5.M(r8)
            goto L5c
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L33:
            p.frd1 r7 = r0.a
            p.hm5.M(r8)
            goto L47
        L39:
            p.hm5.M(r8)
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r6.i(r7, r0)
            if (r8 != r5) goto L47
            goto L5b
        L47:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L5c
            java.lang.String r1 = r7.b
            java.lang.String r7 = r7.a
            r0.a = r2
            r0.d = r3
            p.uqv0 r6 = r6.b
            java.lang.Object r6 = r6.h(r1, r7, r8, r0)
            if (r6 != r5) goto L5c
        L5b:
            return r5
        L5c:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tou0.d(p.frd1, p.lnm):java.lang.Object");
    }

    public final List e() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable f(frd1 frd1Var, onm onmVar) {
        qou0 qou0Var;
        if (onmVar instanceof qou0) {
            qou0Var = (qou0) onmVar;
            int i = qou0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qou0Var.c = i - Integer.MIN_VALUE;
            } else {
                qou0Var = new qou0(this, onmVar);
            }
        } else {
            qou0Var = new qou0(this, onmVar);
        }
        Object objJ = qou0Var.a;
        int i2 = qou0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            qou0Var.c = 1;
            objJ = j(frd1Var, qou0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        z6x z6xVar = (List) objJ;
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        Map mapO = xyn1.o(new vgq0((Iterable) z6xVar, (byte) 12));
        ArrayList arrayList = new ArrayList(mapO.size());
        for (Map.Entry entry : mapO.entrySet()) {
            arrayList.add(new pxz0((String) entry.getKey(), ((Number) entry.getValue()).intValue()));
        }
        return arrayList;
    }

    public final v060 g(frd1 frd1Var, a601 a601Var) {
        return new v060(new ynu0(frd1Var.b, frd1Var.a, a601Var), this.e.a());
    }

    public final boolean h(frd1 frd1Var) {
        if (!this.a.b) {
            return false;
        }
        Set set = s4b1.f;
        v5b1 v5b1Var = uic.x(frd1Var.b).d;
        return u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(frd1 frd1Var, onm onmVar) {
        oou0 oou0Var;
        zuc0 zuc0Var;
        wyz0 wyz0VarI;
        if (onmVar instanceof oou0) {
            oou0Var = (oou0) onmVar;
            int i = oou0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oou0Var.c = i - Integer.MIN_VALUE;
            } else {
                oou0Var = new oou0(this, onmVar);
            }
        } else {
            oou0Var = new oou0(this, onmVar);
        }
        Object objH = oou0Var.a;
        int i2 = oou0Var.c;
        if (i2 == 0) {
            hm5.M(objH);
            String str = frd1Var.b;
            String str2 = frd1Var.a;
            oou0Var.c = 1;
            objH = this.c.h(str, str2, h, oou0Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objH);
        }
        py21 py21Var = (py21) objH;
        if (py21Var == null || (zuc0Var = (zuc0) py21Var.c()) == null || (wyz0VarI = pvc.i(zuc0Var.g)) == null) {
            return null;
        }
        return wyz0VarI.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable j(frd1 frd1Var, onm onmVar) {
        rou0 rou0Var;
        zuc0 zuc0Var;
        if (onmVar instanceof rou0) {
            rou0Var = (rou0) onmVar;
            int i = rou0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rou0Var.c = i - Integer.MIN_VALUE;
            } else {
                rou0Var = new rou0(this, onmVar);
            }
        } else {
            rou0Var = new rou0(this, onmVar);
        }
        Object objH = rou0Var.a;
        int i2 = rou0Var.c;
        ArrayList arrayList = null;
        if (i2 == 0) {
            hm5.M(objH);
            String str = frd1Var.b;
            String str2 = frd1Var.a;
            rou0Var.c = 1;
            objH = this.c.h(str, str2, h, rou0Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objH);
        }
        py21 py21Var = (py21) objH;
        if (py21Var == null || (zuc0Var = (zuc0) py21Var.c()) == null) {
            return null;
        }
        String str3 = (String) zuc0Var.g.get("reactions_detail");
        if (str3 != null) {
            try {
                h290<ReactionListDisplay> h290VarN = ListReactionsResponse.o(Base64.decode(str3, 0)).n();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
                for (ReactionListDisplay reactionListDisplay : h290VarN) {
                    arrayList2.add(new vxz0(reactionListDisplay.o(), reactionListDisplay.n(), new uxz0(reactionListDisplay.p().getUsername())));
                }
                arrayList = arrayList2;
            } catch (IllegalArgumentException | InvalidProtocolBufferException unused) {
                arrayList = z6x.a;
            }
        }
        return arrayList;
    }
}
