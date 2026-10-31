package p;

import androidx.lifecycle.LifecycleDestroyedException;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import j$.time.Instant;
import j$.time.ZoneId;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bu extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r10.collect(r1, r9) == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r10) throws androidx.lifecycle.LifecycleDestroyedException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            p.ed10 r0 = (p.ed10) r0
            p.tac0 r1 = r0.b
            byte r2 = r9.b
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            p.hm5.M(r10)
            goto L79
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r3
        L1d:
            p.hm5.M(r10)
            goto L60
        L21:
            p.hm5.M(r10)
            p.fns r10 = p.igu.a
            p.bs50 r10 = p.pyf0.a
            p.bs50 r10 = r10.f
            p.o8n r2 = r9.getContext()
            boolean r2 = r10.J(r2)
            if (r2 != 0) goto L51
            p.w8c0 r7 = r1.i
            p.w8c0 r8 = p.w8c0.a
            if (r7 == r8) goto L4b
            p.w8c0 r8 = p.w8c0.c
            int r7 = r7.compareTo(r8)
            if (r7 < 0) goto L51
            p.md10 r10 = r0.Z
            com.spotify.mobius.MobiusLoop r10 = p.md10.a(r10)
            r0.P0 = r10
            goto L60
        L4b:
            androidx.lifecycle.LifecycleDestroyedException r9 = new androidx.lifecycle.LifecycleDestroyedException
            r9.<init>()
            throw r9
        L51:
            p.x5u r7 = new p.x5u
            r8 = 5
            r7.<init>(r0, r8)
            r9.b = r5
            java.lang.Object r10 = p.fn31.W(r1, r2, r10, r7, r9)
            if (r10 != r6) goto L60
            goto L78
        L60:
            com.spotify.mobius.MobiusLoop r10 = r0.P0
            if (r10 == 0) goto L7c
            r2 = 6
            p.mr20 r10 = p.mym.i(r10, r1, r2)
            p.skr r1 = new p.skr
            r2 = 29
            r1.<init>(r0, r2)
            r9.b = r4
            java.lang.Object r9 = r10.collect(r1, r9)
            if (r9 != r6) goto L79
        L78:
            return r6
        L79:
            p.rih1 r9 = p.rih1.a
            return r9
        L7c:
            java.lang.String r9 = "fabLoop"
            p.u890.C(r9)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bu.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        if (r8.collect(r1, r7) == r6) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            p.wr60 r0 = (p.wr60) r0
            p.c9c0 r1 = r0.b
            byte r2 = r7.b
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            p.hm5.M(r8)
            goto L72
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L1d:
            p.hm5.M(r8)
            goto L2d
        L21:
            p.hm5.M(r8)
            r7.b = r5
            java.lang.Object r8 = p.kr90.c(r1, r7)
            if (r8 != r6) goto L2d
            goto L71
        L2d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L72
            p.g0l r8 = r0.a
            java.util.List r2 = p.fs60.a
            p.omo r1 = r1.b
            p.zob1 r1 = r1.current()
            p.any r2 = new p.any
            r5 = 18
            r2.<init>(r1, r5)
            p.x72 r1 = new p.x72
            r5 = 22
            r1.<init>(r2, r5)
            p.oq50 r2 = p.oq50.c1
            p.plu r1 = p.rqt0.t(r1, r2)
            p.uls r2 = new p.uls
            r5 = 23
            r2.<init>(r3, r8, r5)
            p.jge r8 = p.hu20.e(r1, r2)
            p.mr20 r8 = p.rqt0.u(r8)
            p.xp10 r1 = new p.xp10
            r2 = 16
            r1.<init>(r0, r2)
            r7.b = r4
            java.lang.Object r7 = r8.collect(r1, r7)
            if (r7 != r6) goto L72
        L71:
            return r6
        L72:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bu.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (p.jkr0.s(r0, 0, r9) == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (p.jkr0.g(r0, r10, (p.n8b1) null, r9, 6) == r6) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            p.kes r0 = (p.kes) r0
            byte r1 = r9.b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            goto L1b
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r2
        L1b:
            p.hm5.M(r10)
            goto L51
        L1f:
            p.hm5.M(r10)
            goto L31
        L23:
            p.hm5.M(r10)
            r9.b = r5
            r7 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r10 = p.hap1.i(r7, r9)
            if (r10 != r6) goto L31
            goto L50
        L31:
            int r10 = r0.o()
            int r10 = r10 + r5
            int r1 = r0.l()
            int r10 = r10 % r1
            if (r10 != 0) goto L47
            r9.b = r4
            r10 = 0
            java.lang.Object r9 = p.jkr0.s(r0, r10, r9)
            if (r9 != r6) goto L51
            goto L50
        L47:
            r9.b = r3
            r1 = 6
            java.lang.Object r9 = p.jkr0.g(r0, r10, r2, r9, r1)
            if (r9 != r6) goto L51
        L50:
            return r6
        L51:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bu.h(java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj) {
        wx90 wx90Var = (wx90) this.c;
        c9c0 c9c0Var = wx90Var.b;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            this.b = (byte) 1;
            obj = kr90.c(c9c0Var, this);
            if (obj != d9nVar) {
            }
            return d9nVar;
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
        if (((Boolean) obj).booleanValue()) {
            neh0 neh0Var = wx90Var.a;
            zob1 zob1VarB = c9c0Var.d.b();
            this.b = (byte) 2;
            neh0Var.getClass();
            p811 p811Var = new p811();
            p811Var.a = new hy90((vo90) null, gbl.e, (jeh0) null, 0);
            Object objCollect = hu20.d(new mr20[]{rqt0.u(new f8f0(zob1VarB, (byte) 12)), new zx60(yoi1.g(neh0Var.a.c()), (byte) 20), new zx60(yoi1.g((Observable) neh0Var.b.a.g), (byte) 21)}).collect(new a8d0(p811Var, neh0Var, (byte) 27), this);
            if (objCollect != d9nVar) {
                objCollect = rih1Var;
            }
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r10.collect(r1, r9) == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r10) throws androidx.lifecycle.LifecycleDestroyedException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            p.xz90 r0 = (p.xz90) r0
            p.tac0 r1 = r0.b
            byte r2 = r9.b
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            p.hm5.M(r10)
            goto L7a
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r3
        L1d:
            p.hm5.M(r10)
            goto L61
        L21:
            p.hm5.M(r10)
            p.fns r10 = p.igu.a
            p.bs50 r10 = p.pyf0.a
            p.bs50 r10 = r10.f
            p.o8n r2 = r9.getContext()
            boolean r2 = r10.J(r2)
            if (r2 != 0) goto L51
            p.w8c0 r7 = r1.i
            p.w8c0 r8 = p.w8c0.a
            if (r7 == r8) goto L4b
            p.w8c0 r8 = p.w8c0.c
            int r7 = r7.compareTo(r8)
            if (r7 < 0) goto L51
            p.vz90 r10 = r0.X
            com.spotify.mobius.MobiusLoop r10 = r10.a()
            r0.O0 = r10
            goto L61
        L4b:
            androidx.lifecycle.LifecycleDestroyedException r9 = new androidx.lifecycle.LifecycleDestroyedException
            r9.<init>()
            throw r9
        L51:
            p.x5u r7 = new p.x5u
            r8 = 13
            r7.<init>(r0, r8)
            r9.b = r5
            java.lang.Object r10 = p.fn31.W(r1, r2, r10, r7, r9)
            if (r10 != r6) goto L61
            goto L79
        L61:
            com.spotify.mobius.MobiusLoop r10 = r0.O0
            if (r10 == 0) goto L7d
            r2 = 6
            p.mr20 r10 = p.mym.i(r10, r1, r2)
            p.xp10 r1 = new p.xp10
            r2 = 26
            r1.<init>(r0, r2)
            r9.b = r4
            java.lang.Object r9 = r10.collect(r1, r9)
            if (r9 != r6) goto L7a
        L79:
            return r6
        L7a:
            p.rih1 r9 = p.rih1.a
            return r9
        L7d:
            java.lang.String r9 = "mobiusLoop"
            p.u890.C(r9)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bu.j(java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj) {
        y2a0 y2a0Var = (y2a0) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            this.b = (byte) 1;
            obj = ((no4) y2a0Var.e.a.get()).Q() ? kr90.c(y2a0Var.c, this) : Boolean.FALSE;
            if (obj != d9nVar) {
            }
            return d9nVar;
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
        if (((Boolean) obj).booleanValue()) {
            mr20 mr20VarU = rqt0.u(new x010(new x880(y2a0Var.b.b(), y2a0Var, (byte) 8), y2a0Var.d.c(), new x2a0(3, null, (byte) 0), (byte) 1));
            vi viVar = new vi(y2a0Var, (byte) 8);
            this.b = (byte) 2;
            if (mr20VarU.collect(viVar, this) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0031 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:21:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            p.qxf0 r0 = (p.qxf0) r0
            byte r1 = r5.b
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L14
            p.hm5.M(r6)
            goto L41
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L1b:
            p.hm5.M(r6)
            goto L2f
        L1f:
            p.hm5.M(r6)
        L22:
            p.bbc r6 = r0.e1
            if (r6 == 0) goto L2f
            r5.b = r3
            java.lang.Object r6 = r6.r(r5)
            if (r6 != r4) goto L2f
            goto L40
        L2f:
            p.vct0 r6 = r0.Z0
            if (r6 == 0) goto L22
            p.g6f0 r6 = new p.g6f0
            r6.<init>(r3)
            r5.b = r2
            java.lang.Object r6 = p.s110.q(r6, r5)
            if (r6 != r4) goto L41
        L40:
            return r4
        L41:
            p.vct0 r6 = r0.Z0
            if (r6 == 0) goto L22
            p.xct0 r6 = (p.xct0) r6
            r6.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bu.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) {
        fjk0 fjk0Var = (fjk0) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            mr20 mr20Var = ((mnk0) fjk0Var.f).a;
            this.b = (byte) 1;
            obj = b5p1.i(mr20Var, this);
            if (obj != d9nVar) {
            }
            return d9nVar;
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
        if (((ibk0) obj).b()) {
            mr20 mr20VarU = rqt0.u(new x010(((koc0) fjk0Var.b).d(), (p1e0) fjk0Var.g, new dwf0(fjk0Var, (lnm) null, (byte) 5), (byte) 1));
            p5b0 p5b0Var = new p5b0(fjk0Var, (byte) 23);
            this.b = (byte) 2;
            Object objCollect = mr20VarU.collect(new dgk0(p5b0Var, (byte) 1), this);
            if (objCollect != d9nVar) {
                objCollect = rih1Var;
            }
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (p.b0o1.k(r6, p.s0o0.a, r8, r9, r12, 4) == r5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            p.a1o0 r0 = (p.a1o0) r0
            byte r1 = r12.b
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            p.hm5.M(r13)
            goto L55
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r2
        L1b:
            p.hm5.M(r13)
            goto L2f
        L1f:
            p.hm5.M(r13)
            java.lang.Object r13 = r0.c
            p.poj0 r13 = (p.poj0) r13
            r12.b = r4
            java.lang.Object r13 = r13.H(r12)
            if (r13 != r5) goto L2f
            goto L54
        L2f:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L55
            java.lang.Object r13 = r0.e
            r6 = r13
            p.v4o0 r6 = (p.v4o0) r6
            java.lang.Object r13 = r0.f
            r8 = r13
            android.content.Context r8 = (android.content.Context) r8
            p.oxa0 r9 = new p.oxa0
            r13 = 19
            r9.<init>(r0, r2, r13)
            r12.b = r3
            p.s0o0 r7 = p.s0o0.a
            r11 = 4
            r10 = r12
            java.lang.Object r12 = p.b0o1.k(r6, r7, r8, r9, r10, r11)
            if (r12 != r5) goto L55
        L54:
            return r5
        L55:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bu.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[RETURN] */
    private final Object s(Object obj) {
        g4q0 g4q0Var = (g4q0) this.c;
        u4q0 u4q0Var = g4q0Var.a;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            this.b = (byte) 1;
            Object objI = u4q0Var.b.i(Instant.ofEpochMilli(u4q0Var.c.b()).atZone(ZoneId.systemDefault()).toLocalDate().toEpochDay(), this);
            if (objI != d9nVar) {
                objI = rih1Var;
            }
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            hm5.M(obj);
        } else {
            if (b != 2) {
                if (b == 3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        this.b = (byte) 3;
        if (g4q0Var.h(this) != d9nVar) {
            return d9nVar;
        }
        return rih1Var;
        this.b = (byte) 2;
        if (u4q0Var.c(this) != d9nVar) {
            this.b = (byte) 3;
            if (g4q0Var.h(this) != d9nVar) {
                return rih1Var;
            }
        }
        return d9nVar;
    }

    private final Object t(Object obj) {
        p410 p410Var = (p410) this.c;
        AtomicBoolean atomicBoolean = (AtomicBoolean) p410Var.h;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) p410Var.f;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                this.b = (byte) 1;
                if (hap1.i(300L, this) == d9nVar) {
                }
                return d9nVar;
            }
            if (b != 1 && b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            while (!concurrentHashMap.isEmpty()) {
                p410Var.n();
                if (concurrentHashMap.isEmpty()) {
                    break;
                }
                this.b = (byte) 2;
                if (hap1.i(250L, this) == d9nVar) {
                    return d9nVar;
                }
            }
            atomicBoolean.set(false);
            return rih1.a;
        } catch (Throwable th) {
            atomicBoolean.set(false);
            throw th;
        }
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new bu((gu) obj2, lnmVar, (byte) 0);
            case 1:
                return new bu((nt0) obj2, lnmVar, (byte) 1);
            case 2:
                return new bu((d78) obj2, lnmVar, (byte) 2);
            case 3:
                return new bu((va9) obj2, lnmVar, (byte) 3);
            case 4:
                return new bu((q2a) obj2, lnmVar, (byte) 4);
            case 5:
                return new bu((ktc) obj2, lnmVar, (byte) 5);
            case 6:
                return new bu((xvc) obj2, lnmVar, (byte) 6);
            case 7:
                return new bu((sie) obj2, lnmVar, (byte) 7);
            case 8:
                return new bu((drg) obj2, lnmVar, (byte) 8);
            case 9:
                return new bu((lz20) obj2, lnmVar, (byte) 9);
            case 10:
                return new bu((yfr) obj2, lnmVar, (byte) 10);
            case 11:
                return new bu((goq) obj2, lnmVar, (byte) 11);
            case 12:
                return new bu((ezt) obj2, lnmVar, (byte) 12);
            case 13:
                return new bu((k6y) obj2, lnmVar, (byte) 13);
            case 14:
                return new bu((ofb) obj2, lnmVar, (byte) 14);
            case 15:
                return new bu((qpy) obj2, lnmVar, (byte) 15);
            case 16:
                return new bu((iuz) obj2, lnmVar, (byte) 16);
            case 17:
                return new bu((ed10) obj2, lnmVar, (byte) 17);
            case 18:
                return new bu((wr60) obj2, lnmVar, (byte) 18);
            case 19:
                return new bu((kes) obj2, lnmVar, (byte) 19);
            case 20:
                return new bu((rx90) obj2, lnmVar, (byte) 20);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return new bu((wx90) obj2, lnmVar, (byte) 21);
            case 22:
                return new bu((xz90) obj2, lnmVar, (byte) 22);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return new bu((y2a0) obj2, lnmVar, (byte) 23);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new bu((qxf0) obj2, lnmVar, (byte) 24);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new bu((fjk0) obj2, lnmVar, (byte) 25);
            case 26:
                return new bu((a1o0) obj2, lnmVar, (byte) 26);
            case 27:
                return new bu((g4q0) obj2, lnmVar, (byte) 27);
            case 28:
                return new bu((p410) obj2, lnmVar, (byte) 28);
            default:
                return new bu((bjr0) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    public final Object invoke(Object obj, Object obj2) throws LifecycleDestroyedException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((uqo) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX WARN: Code duplicated, block: B:113:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:196:0x0546  */
    /* JADX WARN: Code duplicated, block: B:197:0x0548  */
    /* JADX WARN: Code duplicated, block: B:298:0x0703  */
    /* JADX WARN: Code duplicated, block: B:299:0x0706  */
    /* JADX WARN: Code duplicated, block: B:320:0x075d  */
    /* JADX WARN: Code duplicated, block: B:349:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:457:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:76:0x011d A[Catch: all -> 0x00fe, CancellationException -> 0x010e, Exception -> 0x0169, TryCatch #5 {CancellationException -> 0x010e, Exception -> 0x0169, blocks: (B:69:0x0108, B:79:0x0151, B:81:0x0155, B:83:0x0159, B:85:0x015d, B:74:0x0113, B:76:0x011d), top: B:489:0x0108, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0150  */
    /* JADX WARN: Code duplicated, block: B:81:0x0155 A[Catch: all -> 0x00fe, CancellationException -> 0x010e, Exception -> 0x0169, TryCatch #5 {CancellationException -> 0x010e, Exception -> 0x0169, blocks: (B:69:0x0108, B:79:0x0151, B:81:0x0155, B:83:0x0159, B:85:0x015d, B:74:0x0113, B:76:0x011d), top: B:489:0x0108, outer: #4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:398:0x08b4 -> B:401:0x08b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x014e -> B:79:0x0151). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws androidx.lifecycle.LifecycleDestroyedException {
        /*
            Method dump skipped, instruction units count: 2834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
