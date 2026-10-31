package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xtz extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xtz(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r1.emit((java.lang.Object) null, r12) == r7) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.d
            p.qwc r0 = (p.qwc) r0
            java.lang.Object r1 = r12.c
            p.vr20 r1 = (p.vr20) r1
            byte r2 = r12.b
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r2 == 0) goto L2a
            if (r2 == r6) goto L26
            if (r2 == r5) goto L22
            if (r2 != r4) goto L1c
            p.hm5.M(r13)
            goto L61
        L1c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r3
        L22:
            p.hm5.M(r13)
            goto L56
        L26:
            p.hm5.M(r13)
            goto L3a
        L2a:
            p.hm5.M(r13)
            java.lang.String r13 = r0.a
            r12.c = r1
            r12.b = r6
            java.lang.Object r13 = r1.emit(r13, r12)
            if (r13 != r7) goto L3a
            goto L60
        L3a:
            java.lang.Object r13 = r12.e
            p.t290 r13 = (p.t290) r13
            p.yqg r13 = r13.a
            long r8 = r13.b()
            long r10 = r0.b
            long r8 = r8 - r10
            r10 = 60000(0xea60, double:2.9644E-319)
            long r10 = r10 - r8
            r12.c = r1
            r12.b = r5
            java.lang.Object r13 = p.hap1.i(r10, r12)
            if (r13 != r7) goto L56
            goto L60
        L56:
            r12.c = r3
            r12.b = r4
            java.lang.Object r12 = r1.emit(r3, r12)
            if (r12 != r7) goto L61
        L60:
            return r7
        L61:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xtz.e(java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj) {
        ye90 ye90Var = (ye90) this.e;
        Set set = (Set) this.d;
        vr20 vr20Var = (vr20) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            Set set2 = set;
            int iS = zno1.s(q7h.U(set2, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj2 : set2) {
                linkedHashMap.put(obj2, yl90.a);
            }
            this.c = vr20Var;
            this.b = (byte) 1;
            if (vr20Var.emit(linkedHashMap, this) != d9nVar) {
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
        jn7 jn7Var = (jn7) ye90Var.b;
        o831 o831VarO = ResumptionProgressEsperanto.GetProgressRequest.o();
        o831VarO.n(set);
        o831VarO.q(((p6r0) ye90Var.c).c);
        mr20 mr20VarCallStream = jn7Var.callStream("spotify.resumption_progress_esperanto.proto.ResumptionProgress", "SubProgress", o831VarO.build());
        this.c = null;
        this.b = (byte) 2;
        u4p1.S(vr20Var);
        Object objCollect = mr20VarCallStream.collect(new ml21(new nw9(vr20Var, ye90Var, set), (byte) 6), this);
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        if (r1.emit(r11, r10) == r7) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r11) throws java.util.concurrent.TimeoutException {
        /*
            r10 = this;
            java.lang.Object r0 = r10.e
            p.p5a0 r0 = (p.p5a0) r0
            java.lang.Object r1 = r10.c
            p.vr20 r1 = (p.vr20) r1
            byte r2 = r10.b
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 3
            p.d9n r7 = p.d9n.a
            if (r2 == 0) goto L30
            if (r2 == r4) goto L2c
            if (r2 == r3) goto L23
            if (r2 != r6) goto L1d
            p.hm5.M(r11)
            goto Lab
        L1d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r5
        L23:
            java.lang.Object r0 = r10.d
            r1 = r0
            p.vr20 r1 = (p.vr20) r1
            p.hm5.M(r11)
            goto L9a
        L2c:
            p.hm5.M(r11)
            goto L3e
        L30:
            p.hm5.M(r11)
            r10.c = r1
            r10.b = r4
            java.lang.Object r11 = r0.b(r6, r10)
            if (r11 != r7) goto L3e
            goto Laa
        L3e:
            p.g0l r11 = r0.a
            p.inr r11 = (p.inr) r11
            io.reactivex.rxjava3.core.Observable r0 = r11.m()
            p.y580 r2 = p.y580.f1
            io.reactivex.rxjava3.core.Observable r0 = r0.filter(r2)
            p.dp5 r2 = new p.dp5
            r8 = 21
            r2.<init>(r11, r8)
            io.reactivex.rxjava3.core.Observable r11 = r0.switchMap(r2)
            p.ezc r11 = p.yoi1.g(r11)
            p.zx60 r0 = new p.zx60
            r2 = 7
            r0.<init>(r11, r2)
            p.huz r11 = new p.huz
            r2 = 18
            r11.<init>(r0, r2)
            p.huz r0 = new p.huz
            r2 = 19
            r0.<init>(r11, r2)
            p.ytw0 r11 = p.jfv.b
            r8 = 5000(0x1388, double:2.4703E-320)
            p.ngv r11 = p.ngv.d
            long r8 = p.fdg1.l0(r8, r11)
            p.huz r11 = p.r4p1.w(r0, r8)
            p.ob00 r0 = new p.ob00
            r2 = 5
            r0.<init>(r6, r5, r2)
            p.lt20 r2 = new p.lt20
            r8 = 0
            r2.<init>(r11, r0, r8)
            p.wt20 r11 = p.z4p1.F(r2, r4)
            r10.c = r5
            r10.d = r1
            r10.b = r3
            java.lang.Object r11 = p.b5p1.k(r11, r10)
            if (r11 != r7) goto L9a
            goto Laa
        L9a:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto Lae
            r10.c = r5
            r10.d = r5
            r10.b = r6
            java.lang.Object r10 = r1.emit(r11, r10)
            if (r10 != r7) goto Lab
        Laa:
            return r7
        Lab:
            p.rih1 r10 = p.rih1.a
            return r10
        Lae:
            java.util.concurrent.TimeoutException r10 = new java.util.concurrent.TimeoutException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xtz.h(java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj) {
        nib0 nib0Var;
        nib0 nib0Var2 = (nib0) this.e;
        ynb0 ynb0Var = nib0Var2.b;
        c9n c9nVar = (c9n) this.c;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                nib0Var2.f = c9nVar;
                this.c = null;
                this.b = (byte) 1;
                if (xpn1.H(this) == d9nVar) {
                }
                return d9nVar;
            }
            if (b == 1) {
                hm5.M(obj);
            } else {
                if (b != 2) {
                    if (b != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    throw new KotlinNothingValueException();
                }
                nib0Var = (nib0) this.d;
                hm5.M(obj);
            }
            nib0Var.d((r091) obj);
            this.c = null;
            this.d = null;
            this.b = (byte) 3;
            hap1.f(this);
            return d9nVar;
            ttm0 ttm0Var = (ttm0) ynb0Var.get();
            this.c = null;
            this.d = nib0Var2;
            this.b = (byte) 2;
            obj = nib0Var2.a(ttm0Var, this);
            if (obj != d9nVar) {
                nib0Var = nib0Var2;
                nib0Var.d((r091) obj);
                this.c = null;
                this.d = null;
                this.b = (byte) 3;
                hap1.f(this);
                return d9nVar;
            }
            return d9nVar;
        } catch (Throwable th) {
            nib0Var2.e();
            nib0Var2.d((r091) null);
            ((ttm0) ynb0Var.get()).b((zau0) nib0Var2.d.getValue());
            nib0Var2.f = null;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (p.fn31.Y(r0, r13, r12) == r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (p.fn31.Y(r0, r1, r12) == r11) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.e
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r12.d
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r12.c
            r2 = r0
            p.jyb0 r2 = (p.jyb0) r2
            p.q8n r0 = r2.h
            byte r1 = r12.b
            r5 = 0
            r7 = 4
            r6 = 3
            r8 = 2
            r9 = 1
            r10 = r5
            r5 = 0
            p.d9n r11 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r9) goto L35
            if (r1 == r8) goto L35
            if (r1 == r6) goto L31
            if (r1 != r7) goto L2a
            p.hm5.M(r13)
            goto L82
        L2a:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            r12 = 0
            return r12
        L31:
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L68
            goto L82
        L35:
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L68
            goto L5a
        L39:
            p.hm5.M(r13)
            p.add r13 = r2.f     // Catch: java.lang.Exception -> L68
            p.qf4 r13 = r13.a     // Catch: java.lang.Exception -> L68
            boolean r13 = r13.i()     // Catch: java.lang.Exception -> L68
            p.bfd r1 = r2.b
            if (r13 == 0) goto L51
            r12.b = r9     // Catch: java.lang.Exception -> L68
            java.lang.Object r13 = r1.u(r3, r12, r10)     // Catch: java.lang.Exception -> L68
            if (r13 != r11) goto L5a
            goto L81
        L51:
            r12.b = r8     // Catch: java.lang.Exception -> L68
            java.lang.Object r13 = r1.E(r3, r4, r12)     // Catch: java.lang.Exception -> L68
            if (r13 != r11) goto L5a
            goto L81
        L5a:
            p.iyb0 r13 = new p.iyb0     // Catch: java.lang.Exception -> L68
            r13.<init>(r2, r5, r10)     // Catch: java.lang.Exception -> L68
            r12.b = r6     // Catch: java.lang.Exception -> L68
            java.lang.Object r12 = p.fn31.Y(r0, r13, r12)     // Catch: java.lang.Exception -> L68
            if (r12 != r11) goto L82
            goto L81
        L68:
            p.dg30 r13 = r2.c
            p.u9c0 r13 = p.cto1.q(r13)
            p.o8n r13 = r13.b
            p.op71.x(r13)
            p.az80 r1 = new p.az80
            r6 = 6
            r1.<init>(r2, r3, r4, r5, r6)
            r12.b = r7
            java.lang.Object r12 = p.fn31.Y(r0, r1, r12)
            if (r12 != r11) goto L82
        L81:
            return r11
        L82:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xtz.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0050 A[RETURN] */
    private final Object m(Object obj) {
        String str = (String) this.e;
        zxu zxuVar = ((h0c0) this.d).c;
        byte b = this.b;
        d9n d9nVar = rih1.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
                return d9nVar;
            }
            if (b == 2) {
                hm5.M(obj);
                return d9nVar;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        int iOrdinal = ((j10) ((mmr0) this.c).b).ordinal();
        d9n d9nVar2 = d9n.a;
        if (iOrdinal == 0) {
            this.b = (byte) 1;
            zxuVar.b(str, "");
            if (d9nVar == d9nVar2) {
                return d9nVar2;
            }
            return d9nVar;
        }
        if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        this.b = (byte) 2;
        zxuVar.a(str, "");
        if (d9nVar == d9nVar2) {
            return d9nVar2;
        }
        return d9nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r2.k(r8, r7) == r6) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r7.c
            p.mdd0 r1 = (p.mdd0) r1
            byte r2 = r7.b
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L25
            if (r2 == r5) goto L21
            if (r2 != r4) goto L1b
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L19
            goto L7b
        L19:
            r7 = move-exception
            goto L6f
        L1b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L21:
            p.hm5.M(r8)
            goto L3d
        L25:
            p.hm5.M(r8)
            p.kly0 r8 = r1.c
            java.lang.Object r8 = r8.get()
            p.hgd0 r8 = (p.hgd0) r8
            io.reactivex.rxjava3.core.Observable r8 = r8.p()
            r7.b = r5
            java.lang.Object r8 = p.fc11.l(r8, r5, r3, r7)
            if (r8 != r6) goto L3d
            goto L6e
        L3d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L80
            java.lang.Object r8 = r7.d
            p.p811 r8 = (p.p811) r8
            java.lang.Object r8 = r8.a
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L7b
            java.util.List r2 = java.util.Collections.singletonList(r0)
            java.util.ArrayList r8 = p.mdd0.a(r8, r2)
            p.eoi1 r2 = com.spotify.listeningactivity.v1.UsersUnsubscriptionRequest.p()
            r2.n(r8)
            com.google.protobuf.h r8 = r2.build()
            com.spotify.listeningactivity.v1.UsersUnsubscriptionRequest r8 = (com.spotify.listeningactivity.v1.UsersUnsubscriptionRequest) r8
            p.bed0 r2 = r1.b     // Catch: java.lang.Exception -> L19
            r7.b = r4     // Catch: java.lang.Exception -> L19
            java.lang.Object r7 = r2.k(r8, r7)     // Catch: java.lang.Exception -> L19
            if (r7 != r6) goto L7b
        L6e:
            return r6
        L6f:
            java.lang.String r8 = "BUZZ: ListeningActivityDataLoader.unsubscribe failure with exception: "
            java.lang.String r7 = p.ktd.i(r8, r7)
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            com.spotify.base.java.logging.Logger.d(r7, r8)
        L7b:
            java.util.concurrent.ConcurrentHashMap r7 = r1.f
            r7.remove(r0)
        L80:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xtz.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r1.emit(r8, r7) == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.emit((java.lang.Object) null, r7) == r6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r7.b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1e
            java.lang.Object r7 = r7.d
            p.vr20 r7 = (p.vr20) r7
            java.lang.Exception r7 = (java.lang.Exception) r7
            p.hm5.M(r8)
            goto L75
        L1e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L24:
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            goto L75
        L28:
            r8 = move-exception
            goto L60
        L2a:
            java.lang.Object r1 = r7.d
            p.vr20 r1 = (p.vr20) r1
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            goto L51
        L32:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.e     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            p.ur00 r8 = (p.ur00) r8     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            java.lang.Object r1 = r8.d     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            p.vcd0 r1 = (p.vcd0) r1     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            java.lang.Object r8 = r8.b     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            r7.c = r0     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            r7.d = r0     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            r7.b = r4     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            p.mdd0 r1 = (p.mdd0) r1     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            java.lang.Object r8 = r1.c(r8, r7)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            if (r8 != r6) goto L50
            goto L74
        L50:
            r1 = r0
        L51:
            r7.c = r0     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            r7.d = r5     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            r7.b = r3     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            java.lang.Object r7 = r1.emit(r8, r7)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L5e
            if (r7 != r6) goto L75
            goto L74
        L5e:
            r7 = move-exception
            goto L78
        L60:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "Failed to load audience user for listening activity toggle"
            com.spotify.base.java.logging.Logger.e(r8, r3, r1)
            r7.c = r5
            r7.d = r5
            r7.b = r2
            java.lang.Object r7 = r0.emit(r5, r7)
            if (r7 != r6) goto L75
        L74:
            return r6
        L75:
            p.rih1 r7 = p.rih1.a
            return r7
        L78:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xtz.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    private final Object r(Object obj) {
        Object next;
        tcd0 tcd0Var;
        xsf1 xsf1Var;
        String str;
        m5b0 m5b0Var = (m5b0) this.d;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            vcd0 vcd0Var = (vcd0) m5b0Var.f;
            List listSingletonList = Collections.singletonList((String) this.e);
            this.b = (byte) 1;
            obj = ((mdd0) vcd0Var).f(listSingletonList, this);
            if (obj != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            hm5.M(obj);
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tcd0Var = (tcd0) this.c;
            hm5.M(obj);
        }
        xsf1Var = (xsf1) ((zlj0) obj).a();
        if (xsf1Var != null) {
            str = xsf1Var.a;
        } else {
            str = null;
        }
        return new ped0(str, tcd0Var.a, tcd0Var.c, xsf1Var != null ? xsf1Var.b : null);
        Iterator it = ((Iterable) obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ucd0) next).b == null);
        ucd0 ucd0Var = (ucd0) next;
        tcd0 tcd0Var2 = ucd0Var != null ? ucd0Var.b : null;
        if (tcd0Var2 != null) {
            String str2 = tcd0Var2.a;
            if (str2.length() > 0) {
                btf1 btf1Var = m5b0Var.d;
                this.c = tcd0Var2;
                this.b = (byte) 2;
                Object objA = btf1Var.a(str2, "listening-activity-indicator", this, false);
                if (objA != d9nVar) {
                    tcd0 tcd0Var3 = tcd0Var2;
                    obj = objA;
                    tcd0Var = tcd0Var3;
                    xsf1Var = (xsf1) ((zlj0) obj).a();
                    if (xsf1Var != null) {
                        str = xsf1Var.a;
                    } else {
                        str = null;
                    }
                    return new ped0(str, tcd0Var.a, tcd0Var.c, xsf1Var != null ? xsf1Var.b : null);
                }
                return d9nVar;
            }
        }
        return qed0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r1.emit(r8, r7) == r6) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object s(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            p.lfd0 r0 = (p.lfd0) r0
            java.lang.Object r1 = r7.c
            p.vr20 r1 = (p.vr20) r1
            byte r2 = r7.b
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L24
            if (r2 == r4) goto L20
            if (r2 != r3) goto L1a
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            goto L91
        L1a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L20:
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            goto L42
        L24:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.e     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r0.getClass()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            com.spotify.listeningactivity.v1.SubscribePresenceRequest r8 = p.lfd0.a(r8)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            p.bed0 r2 = r0.b     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r8.getClass()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r7.c = r1     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r7.b = r4     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            java.lang.Object r8 = r2.f(r8, r7)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            if (r8 != r6) goto L42
            goto L80
        L42:
            com.spotify.listeningactivity.v1.PresenceResponse r8 = (com.spotify.listeningactivity.v1.PresenceResponse) r8     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            p.h290 r8 = r8.n()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r4 = 10
            int r4 = p.q7h.U(r8, r4)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r2.<init>(r4)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
        L57:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            if (r4 == 0) goto L71
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            com.spotify.listeningactivity.v1.UserActivity r4 = (com.spotify.listeningactivity.v1.UserActivity) r4     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r4.getClass()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r0.getClass()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            p.ucd0 r4 = p.lfd0.b(r4)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r2.add(r4)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            goto L57
        L71:
            p.z4w0 r8 = new p.z4w0     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r8.<init>(r2)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r7.c = r5     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            r7.b = r3     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            java.lang.Object r7 = r1.emit(r8, r7)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L83
            if (r7 != r6) goto L91
        L80:
            return r6
        L81:
            r7 = move-exception
            goto L85
        L83:
            r7 = move-exception
            goto L94
        L85:
            java.lang.String r8 = "PresenceListener subscribe failure: "
            java.lang.String r7 = p.ktd.i(r8, r7)
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            com.spotify.base.java.logging.Logger.k(r7, r8)
        L91:
            p.rih1 r7 = p.rih1.a
            return r7
        L94:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xtz.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj) {
        String str = (String) this.e;
        vld0 vld0Var = (vld0) this.d;
        vr20 vr20Var = (vr20) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            this.c = vr20Var;
            this.b = (byte) 1;
            obj = vld0Var.a(str, this);
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
        qld0 qld0Var = (qld0) obj;
        if (qld0Var != null) {
            kge kgeVarD = hu20.d(new mr20[]{new lt20(new b8d0(new m441(new tld0(qld0Var, str, null, (byte) 0)), vld0Var, (byte) 7), new kn1("Listening party lifecycle event stream failed", (lnm) null, (byte) 3), (byte) 0), new lt20(new yc2(new m441(new tld0(qld0Var, str, null, (byte) 1)), (byte) 15), new kn1("Listening party occupancy event stream failed", (lnm) null, (byte) 3), (byte) 0)});
            this.c = null;
            this.b = (byte) 2;
            if (l4p1.s(vr20Var, kgeVarD, this) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r12 == r10) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object u(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.e
            r5 = r0
            p.wmy r5 = (p.wmy) r5
            java.lang.Object r0 = r11.d
            p.ahj1 r0 = (p.ahj1) r0
            java.lang.Object r1 = r11.c
            r2 = r1
            p.il71 r2 = (p.il71) r2
            byte r1 = r11.b
            java.lang.String r7 = "failure"
            java.lang.String r8 = "result"
            r3 = 0
            r9 = 2
            r4 = 1
            p.d9n r10 = p.d9n.a
            if (r1 == 0) goto L30
            if (r1 == r4) goto L2c
            if (r1 != r9) goto L26
            p.hm5.M(r12)     // Catch: java.lang.Throwable -> L23
            goto L73
        L23:
            r0 = move-exception
            r11 = r0
            goto L76
        L26:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r3
        L2c:
            p.hm5.M(r12)
            goto L52
        L30:
            p.hm5.M(r12)
            p.u771 r12 = r0.c
            p.t771 r12 = r12.a
            p.wa71 r12 = r12.a
            java.lang.String r12 = r12.a
            java.lang.String r1 = "entity_uri"
            r2.setAttribute(r1, r12)
            p.e1e0 r12 = new p.e1e0
            r12.<init>(r5, r0, r3, r4)
            r11.c = r2
            r11.b = r4
            java.lang.String r0 = "resolving_chapter"
            java.lang.Object r12 = r2.a(r0, r12, r11)
            if (r12 != r10) goto L52
            goto L72
        L52:
            r4 = r12
            p.dhe r4 = (p.dhe) r4
            if (r4 != 0) goto L5d
            r2.setAttribute(r8, r7)
            p.dhj1 r11 = p.dhj1.a
            return r11
        L5d:
            p.s73 r1 = new p.s73     // Catch: java.lang.Throwable -> L23
            java.lang.Object r12 = r11.d     // Catch: java.lang.Throwable -> L23
            r3 = r12
            p.ahj1 r3 = (p.ahj1) r3     // Catch: java.lang.Throwable -> L23
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L23
            r11.c = r2     // Catch: java.lang.Throwable -> L23
            r11.b = r9     // Catch: java.lang.Throwable -> L23
            java.lang.Object r12 = p.smo1.s(r1, r11)     // Catch: java.lang.Throwable -> L23
            if (r12 != r10) goto L73
        L72:
            return r10
        L73:
            p.ehj1 r12 = (p.ehj1) r12     // Catch: java.lang.Throwable -> L23
            return r12
        L76:
            r2.setAttribute(r8, r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xtz.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r11 == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object v(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.e
            p.a4e0 r0 = (p.a4e0) r0
            java.lang.Object r1 = r10.d
            p.j8u r1 = (p.j8u) r1
            java.lang.Object r2 = r10.c
            p.c9n r2 = (p.c9n) r2
            byte r3 = r10.b
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L25
            if (r3 == r6) goto L21
            if (r3 != r5) goto L1b
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L6c
            goto L64
        L1b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r4
        L21:
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L6c
            goto L48
        L25:
            p.hm5.M(r11)
            boolean r11 = r1.c     // Catch: java.lang.Exception -> L6c
            p.d9n r3 = p.d9n.a
            if (r11 == 0) goto L4b
            p.l6d0 r11 = new p.l6d0     // Catch: java.lang.Exception -> L6c
            r5 = 17
            r11.<init>(r0, r5)     // Catch: java.lang.Exception -> L6c
            p.q4d0 r5 = new p.q4d0     // Catch: java.lang.Exception -> L6c
            r7 = 19
            r5.<init>(r0, r1, r4, r7)     // Catch: java.lang.Exception -> L6c
            r10.c = r2     // Catch: java.lang.Exception -> L6c
            r10.b = r6     // Catch: java.lang.Exception -> L6c
            r0 = 3
            java.lang.Object r11 = p.dzo1.g(r0, r11, r5, r10)     // Catch: java.lang.Exception -> L6c
            if (r11 != r3) goto L48
            goto L63
        L48:
            p.s9l1 r11 = (p.s9l1) r11     // Catch: java.lang.Exception -> L6c
            goto L66
        L4b:
            p.ytp0 r4 = r0.b     // Catch: java.lang.Exception -> L6c
            r11 = r5
            p.abu r5 = r1.a     // Catch: java.lang.Exception -> L6c
            java.lang.String r6 = r5.a()     // Catch: java.lang.Exception -> L6c
            java.lang.String r7 = r1.b     // Catch: java.lang.Exception -> L6c
            r10.c = r2     // Catch: java.lang.Exception -> L6c
            r10.b = r11     // Catch: java.lang.Exception -> L6c
            p.w0q0 r8 = p.w0q0.Y     // Catch: java.lang.Exception -> L6c
            r9 = r10
            java.lang.Object r11 = r4.A(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L6c
            if (r11 != r3) goto L64
        L63:
            return r3
        L64:
            p.s9l1 r11 = (p.s9l1) r11     // Catch: java.lang.Exception -> L6c
        L66:
            p.t9u r10 = new p.t9u     // Catch: java.lang.Exception -> L6c
            r10.<init>(r11)     // Catch: java.lang.Exception -> L6c
            return r10
        L6c:
            p.smo1.t(r2)
            p.r9u r10 = new p.r9u
            p.i9u r11 = new p.i9u
            java.lang.String r0 = r1.b
            r11.<init>(r0)
            r10.<init>(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xtz.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r11 == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object w(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.e
            p.a4e0 r0 = (p.a4e0) r0
            java.lang.Object r1 = r10.d
            p.k8u r1 = (p.k8u) r1
            java.lang.Object r2 = r10.c
            p.c9n r2 = (p.c9n) r2
            byte r3 = r10.b
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L25
            if (r3 == r6) goto L21
            if (r3 != r5) goto L1b
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L6c
            goto L64
        L1b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r4
        L21:
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L6c
            goto L48
        L25:
            p.hm5.M(r11)
            boolean r11 = r1.c     // Catch: java.lang.Exception -> L6c
            p.d9n r3 = p.d9n.a
            if (r11 == 0) goto L4b
            p.l6d0 r11 = new p.l6d0     // Catch: java.lang.Exception -> L6c
            r5 = 18
            r11.<init>(r0, r5)     // Catch: java.lang.Exception -> L6c
            p.q4d0 r5 = new p.q4d0     // Catch: java.lang.Exception -> L6c
            r7 = 21
            r5.<init>(r0, r1, r4, r7)     // Catch: java.lang.Exception -> L6c
            r10.c = r2     // Catch: java.lang.Exception -> L6c
            r10.b = r6     // Catch: java.lang.Exception -> L6c
            r0 = 3
            java.lang.Object r11 = p.dzo1.g(r0, r11, r5, r10)     // Catch: java.lang.Exception -> L6c
            if (r11 != r3) goto L48
            goto L63
        L48:
            p.s9l1 r11 = (p.s9l1) r11     // Catch: java.lang.Exception -> L6c
            goto L66
        L4b:
            p.ytp0 r4 = r0.b     // Catch: java.lang.Exception -> L6c
            r11 = r5
            p.abu r5 = r1.a     // Catch: java.lang.Exception -> L6c
            java.lang.String r6 = r5.a()     // Catch: java.lang.Exception -> L6c
            java.lang.String r7 = r1.b     // Catch: java.lang.Exception -> L6c
            r10.c = r2     // Catch: java.lang.Exception -> L6c
            r10.b = r11     // Catch: java.lang.Exception -> L6c
            p.w0q0 r8 = p.w0q0.Z     // Catch: java.lang.Exception -> L6c
            r9 = r10
            java.lang.Object r11 = r4.A(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L6c
            if (r11 != r3) goto L64
        L63:
            return r3
        L64:
            p.s9l1 r11 = (p.s9l1) r11     // Catch: java.lang.Exception -> L6c
        L66:
            p.w9u r10 = new p.w9u     // Catch: java.lang.Exception -> L6c
            r10.<init>(r11)     // Catch: java.lang.Exception -> L6c
            return r10
        L6c:
            p.smo1.t(r2)
            p.r9u r10 = new p.r9u
            p.j9u r11 = new p.j9u
            java.lang.String r0 = r1.b
            r11.<init>(r0)
            r10.<init>(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xtz.w(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                xtz xtzVar = new xtz((lmw) this.d, (ArrayList) this.e, lnmVar, (byte) 0);
                xtzVar.c = obj;
                return xtzVar;
            case 1:
                return new xtz((krh) this.c, (fu00) this.d, (String) this.e, lnmVar, (byte) 1);
            case 2:
                return new xtz((tob1) this.c, (j5c) this.d, (icr0) this.e, lnmVar, (byte) 2);
            case 3:
                return new xtz((rj20) this.c, (o8n) this.d, (tf61) this.e, lnmVar, (byte) 3);
            case 4:
                return new xtz((ne) this.d, (String) this.e, lnmVar, (byte) 4);
            case 5:
                xtz xtzVar2 = new xtz((wn30) this.d, (bo30) this.e, lnmVar, (byte) 5);
                xtzVar2.c = obj;
                return xtzVar2;
            case 6:
                return new xtz((cz30) this.d, (String) this.e, lnmVar, (byte) 6);
            case 7:
                xtz xtzVar3 = new xtz((k740) this.e, lnmVar, (byte) 7);
                xtzVar3.c = obj;
                return xtzVar3;
            case 8:
                xtz xtzVar4 = new xtz((s940) this.d, (omd) this.e, lnmVar, (byte) 8);
                xtzVar4.c = obj;
                return xtzVar4;
            case 9:
                return new xtz((add) this.c, (bfd) this.d, (dbw) this.e, lnmVar, (byte) 9);
            case 10:
                xtz xtzVar5 = new xtz((pbq) this.d, lnmVar);
                xtzVar5.c = obj;
                return xtzVar5;
            case 11:
                return new xtz((zsc) this.d, (vf60) this.e, lnmVar, (byte) 11);
            case 12:
                return new xtz((ii60) this.c, (ki60) this.d, (ssw0) this.e, lnmVar, (byte) 12);
            case 13:
                xtz xtzVar6 = new xtz((ky70) this.d, (py70) this.e, lnmVar, (byte) 13);
                xtzVar6.c = obj;
                return xtzVar6;
            case 14:
                xtz xtzVar7 = new xtz(this.d, (mr20) this.e, lnmVar, (byte) 14);
                xtzVar7.c = obj;
                return xtzVar7;
            case 15:
                xtz xtzVar8 = new xtz((qwc) this.d, (t290) this.e, lnmVar, (byte) 15);
                xtzVar8.c = obj;
                return xtzVar8;
            case 16:
                xtz xtzVar9 = new xtz((Set) this.d, (ye90) this.e, lnmVar, (byte) 16);
                xtzVar9.c = obj;
                return xtzVar9;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                xtz xtzVar10 = new xtz((p5a0) this.e, lnmVar, (byte) 17);
                xtzVar10.c = obj;
                return xtzVar10;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                xtz xtzVar11 = new xtz((nib0) this.e, lnmVar, (byte) 18);
                xtzVar11.c = obj;
                return xtzVar11;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new xtz((jyb0) this.c, (String) this.d, (String) this.e, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new xtz((mmr0) this.c, (h0c0) this.d, (String) this.e, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new xtz((mdd0) this.c, (p811) this.d, (String) this.e, lnmVar, (byte) 21);
            case 22:
                xtz xtzVar12 = new xtz((ur00) this.e, lnmVar, (byte) 22);
                xtzVar12.c = obj;
                return xtzVar12;
            case 23:
                return new xtz((m5b0) this.d, (String) this.e, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                xtz xtzVar13 = new xtz((lfd0) this.d, (String) this.e, lnmVar, (byte) 24);
                xtzVar13.c = obj;
                return xtzVar13;
            case 25:
                xtz xtzVar14 = new xtz((vld0) this.d, (String) this.e, lnmVar, (byte) 25);
                xtzVar14.c = obj;
                return xtzVar14;
            case 26:
                xtz xtzVar15 = new xtz((ahj1) this.d, (wmy) this.e, lnmVar, (byte) 26);
                xtzVar15.c = obj;
                return xtzVar15;
            case 27:
                xtz xtzVar16 = new xtz((j8u) this.d, (a4e0) this.e, lnmVar, (byte) 27);
                xtzVar16.c = obj;
                return xtzVar16;
            case 28:
                xtz xtzVar17 = new xtz((k8u) this.d, (a4e0) this.e, lnmVar, (byte) 28);
                xtzVar17.c = obj;
                return xtzVar17;
            default:
                return new xtz((rde0) this.d, (String) this.e, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((il71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.lnm */
    /* JADX WARN: Code duplicated, block: B:134:0x0283  */
    /* JADX WARN: Code duplicated, block: B:185:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:187:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:189:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:193:0x040d A[LOOP:1: B:191:0x0407->B:193:0x040d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x0449  */
    /* JADX WARN: Code duplicated, block: B:197:0x0453  */
    /* JADX WARN: Code duplicated, block: B:199:0x0465  */
    /* JADX WARN: Code duplicated, block: B:200:0x0467  */
    /* JADX WARN: Code duplicated, block: B:202:0x0471  */
    /* JADX WARN: Code duplicated, block: B:204:0x0474  */
    /* JADX WARN: Code duplicated, block: B:209:0x047f  */
    /* JADX WARN: Code duplicated, block: B:210:0x048a  */
    /* JADX WARN: Code duplicated, block: B:212:0x0498  */
    /* JADX WARN: Code duplicated, block: B:216:0x049e  */
    /* JADX WARN: Code duplicated, block: B:220:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:223:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:226:0x04db  */
    /* JADX WARN: Code duplicated, block: B:237:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:239:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:240:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:242:0x0500  */
    /* JADX WARN: Code duplicated, block: B:244:0x050c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0510  */
    /* JADX WARN: Code duplicated, block: B:252:0x0521  */
    /* JADX WARN: Code duplicated, block: B:254:0x0529  */
    /* JADX WARN: Code duplicated, block: B:256:0x052d  */
    /* JADX WARN: Code duplicated, block: B:257:0x0533  */
    /* JADX WARN: Code duplicated, block: B:259:0x0537  */
    /* JADX WARN: Code duplicated, block: B:260:0x053d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0541  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8 A[PHI: r2 r3
      0x00b8: PHI (r2v144 com.spotify.localfiles.localfilesmonorepo.AddedLocalFile) = 
      (r2v143 com.spotify.localfiles.localfilesmonorepo.AddedLocalFile)
      (r2v152 com.spotify.localfiles.localfilesmonorepo.AddedLocalFile)
     binds: [B:33:0x00b4, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r3v86 java.lang.Object) = (r3v85 java.lang.Object), (r3v91 java.lang.Object) binds: [B:33:0x00b4, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:567:0x0567 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x056c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x0478 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x08fc, code lost:
    
        if (r2.b(r1) == r10) goto L455;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xtz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xtz(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xtz(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtz(pbq pbqVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.d = pbqVar;
    }
}
