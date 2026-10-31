package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p1r extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1r(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (p.b5p1.i(r2, r10) == r6) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            p.s640 r0 = (p.s640) r0
            java.lang.Object r1 = r10.c
            p.k740 r1 = (p.k740) r1
            byte r2 = r10.b
            r3 = 2
            p.t640 r4 = p.t640.a
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L29
            if (r2 == r5) goto L25
            if (r2 != r3) goto L1e
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            goto L61
        L1a:
            r10 = move-exception
            goto L6f
        L1c:
            r10 = move-exception
            goto L6e
        L1e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            r10 = 0
            return r10
        L25:
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            goto L4f
        L29:
            p.hm5.M(r11)
            p.u640 r11 = p.u640.a     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            r1.b(r0, r11)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            p.kly0 r11 = r1.c     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            java.lang.Object r11 = r11.get()     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            p.o78 r11 = (p.o78) r11     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            p.bxf r2 = new p.bxf     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            java.lang.String r7 = r0.a     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            r8 = 0
            r2.<init>(r7, r8)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            io.reactivex.rxjava3.core.Single r11 = r11.a(r2)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            r10.b = r5     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            java.lang.Object r11 = p.fc11.j(r11, r10)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            if (r11 != r6) goto L4f
            goto L60
        L4f:
            p.bpb1 r11 = r1.g     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            p.evz r2 = new p.evz     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            r7 = 22
            r2.<init>(r11, r0, r7)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            r10.b = r3     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            java.lang.Object r10 = p.b5p1.i(r2, r10)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L65
            if (r10 != r6) goto L61
        L60:
            return r6
        L61:
            r1.b(r0, r4)
            goto L69
        L65:
            r1.b(r0, r4)
            r5 = 0
        L69:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            return r10
        L6e:
            throw r10     // Catch: java.lang.Throwable -> L1a
        L6f:
            r1.b(r0, r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p1r.e(java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj) {
        Object objA;
        vr20 vr20Var = (vr20) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                dh30 dh30Var = (dh30) this.d;
                go71 go71Var = new go71(((hni1) dh30Var.c).b, (String) null, new cqi1((String) null, "users-nearby", "qr", (String) null, (String) null), (Map) null, (String) null, 58);
                bo71 bo71Var = (bo71) dh30Var.b;
                this.c = vr20Var;
                this.b = (byte) 1;
                objA = bo71Var.a(go71Var, this);
                if (objA == d9nVar) {
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
            objA = obj;
            umi1 umi1Var = new umi1(((yn71) objA).a);
            this.c = null;
            this.b = (byte) 2;
            return vr20Var.emit(umi1Var, this) == d9nVar ? d9nVar : rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "UsersNearby: share link could not be generated", new Object[0]);
            return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r2.emit(r11, r10) == r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r2.emit(r11, r10) == r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (r11.collect(r0, r10) == r9) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            p.j7s r0 = (p.j7s) r0
            java.lang.Object r1 = r0.c
            p.ov20 r1 = (p.ov20) r1
            java.lang.Object r2 = r10.c
            p.vr20 r2 = (p.vr20) r2
            byte r3 = r10.b
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 4
            r8 = 0
            p.d9n r9 = p.d9n.a
            if (r3 == 0) goto L2f
            if (r3 == r6) goto L2a
            if (r3 == r5) goto L26
            if (r3 == r4) goto L2a
            if (r3 != r7) goto L20
            goto L2a
        L20:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r8
        L26:
            p.hm5.M(r11)
            goto L60
        L2a:
            p.hm5.M(r11)
            goto Lbd
        L2f:
            p.hm5.M(r11)
            java.lang.Object r11 = r0.f
            p.jkp0 r11 = (p.jkp0) r11
            java.lang.Object r11 = r11.b
            p.qh4 r11 = (p.qh4) r11
            boolean r11 = r11.a()
            if (r11 == 0) goto L4d
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.c = r8
            r10.b = r6
            java.lang.Object r10 = r2.emit(r11, r10)
            if (r10 != r9) goto Lbd
            goto Lbc
        L4d:
            java.lang.Object r11 = r0.e
            p.fzm0 r11 = (p.fzm0) r11
            io.reactivex.rxjava3.core.Single r11 = r11.a()
            r10.c = r2
            r10.b = r5
            java.lang.Object r11 = p.fc11.j(r11, r10)
            if (r11 != r9) goto L60
            goto Lbc
        L60:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L75
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.c = r8
            r10.b = r4
            java.lang.Object r10 = r2.emit(r11, r10)
            if (r10 != r9) goto Lbd
            goto Lbc
        L75:
            java.lang.String r11 = "payment-state"
            r0 = r1
            p.bw20 r0 = (p.bw20) r0
            java.lang.String r3 = ""
            p.mr20 r11 = r0.c(r11, r3)
            java.lang.String r0 = "type"
            r4 = r1
            p.bw20 r4 = (p.bw20) r4
            p.mr20 r0 = r4.c(r0, r3)
            p.any r3 = new p.any
            r4 = 19
            r3.<init>(r0, r4)
            p.mr20 r0 = p.rqt0.u(r3)
            p.any r3 = new p.any
            r4 = 20
            r3.<init>(r0, r4)
            java.lang.String r0 = "is-standalone-audiobooks"
            p.bw20 r1 = (p.bw20) r1
            r4 = 0
            p.mr20 r0 = r1.a(r0, r4)
            p.py40 r1 = new p.py40
            r1.<init>(r7, r8, r4)
            p.evz r11 = p.h5p1.s(r11, r3, r0, r1)
            p.vu0 r0 = new p.vu0
            r0.<init>(r2, r5)
            r10.c = r8
            r10.b = r7
            java.lang.Object r10 = r11.collect(r0, r10)
            if (r10 != r9) goto Lbd
        Lbc:
            return r9
        Lbd:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p1r.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005e -> B:15:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object i(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            p.py70 r0 = (p.py70) r0
            p.yqg r0 = r0.a
            java.lang.Object r1 = r9.c
            p.vr20 r1 = (p.vr20) r1
            byte r2 = r9.b
            r3 = 3
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L29
            if (r2 == r5) goto L25
            if (r2 == r4) goto L21
            if (r2 != r3) goto L1a
            goto L25
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            r9 = 0
            return r9
        L21:
            p.hm5.M(r10)
            goto L4d
        L25:
            p.hm5.M(r10)
            goto L40
        L29:
            p.hm5.M(r10)
            long r7 = r0.b()
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r7)
            r9.c = r1
            r9.b = r5
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r6) goto L40
            goto L60
        L40:
            r9.c = r1
            r9.b = r4
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = p.hap1.i(r7, r9)
            if (r10 != r6) goto L4d
            goto L60
        L4d:
            long r7 = r0.b()
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r7)
            r9.c = r1
            r9.b = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r6) goto L40
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p1r.i(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r11.collect(r1, r10) == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r11) throws androidx.lifecycle.LifecycleDestroyedException {
        /*
            r10 = this;
            java.lang.Object r0 = r10.c
            p.gx80 r0 = (p.gx80) r0
            p.tac0 r1 = r0.b
            byte r2 = r10.b
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            p.hm5.M(r11)
            goto L7c
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r3
        L1d:
            p.hm5.M(r11)
            goto L63
        L21:
            p.hm5.M(r11)
            java.lang.Object r11 = r10.d
            p.ex80 r11 = (p.ex80) r11
            p.fns r2 = p.igu.a
            p.bs50 r2 = p.pyf0.a
            p.bs50 r2 = r2.f
            p.o8n r7 = r10.getContext()
            boolean r7 = r2.J(r7)
            if (r7 != 0) goto L53
            p.w8c0 r8 = r1.i
            p.w8c0 r9 = p.w8c0.a
            if (r8 == r9) goto L4d
            p.w8c0 r9 = p.w8c0.c
            int r8 = r8.compareTo(r9)
            if (r8 < 0) goto L53
            com.spotify.mobius.MobiusLoop r11 = r11.a()
            r0.Y = r11
            goto L63
        L4d:
            androidx.lifecycle.LifecycleDestroyedException r10 = new androidx.lifecycle.LifecycleDestroyedException
            r10.<init>()
            throw r10
        L53:
            p.na r8 = new p.na
            r9 = 18
            r8.<init>(r0, r11, r9)
            r10.b = r5
            java.lang.Object r11 = p.fn31.W(r1, r7, r2, r8, r10)
            if (r11 != r6) goto L63
            goto L7b
        L63:
            com.spotify.mobius.MobiusLoop r11 = r0.Y
            if (r11 == 0) goto L7f
            r2 = 6
            p.mr20 r11 = p.mym.i(r11, r1, r2)
            p.xp10 r1 = new p.xp10
            r2 = 23
            r1.<init>(r0, r2)
            r10.b = r4
            java.lang.Object r10 = r11.collect(r1, r10)
            if (r10 != r6) goto L7c
        L7b:
            return r6
        L7c:
            p.rih1 r10 = p.rih1.a
            return r10
        L7f:
            java.lang.String r10 = "mobiusLoop"
            p.u890.C(r10)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p1r.j(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new p1r((s1r) obj2, lnmVar, (byte) 0);
            case 1:
                return new p1r((cfr) this.c, (dg30) obj2, lnmVar, (byte) 1);
            case 2:
                return new p1r((uu0) this.c, (jz5) obj2, lnmVar, (byte) 2);
            case 3:
                return new p1r((yfr) this.c, (String) obj2, lnmVar, (byte) 3);
            case 4:
                p1r p1rVar = new p1r((zmr) obj2, lnmVar, (byte) 4);
                p1rVar.c = obj;
                return p1rVar;
            case 5:
                return new p1r((otr) this.c, (String) obj2, lnmVar, (byte) 5);
            case 6:
                p1r p1rVar2 = new p1r((e4s) obj2, lnmVar, (byte) 6);
                p1rVar2.c = obj;
                return p1rVar2;
            case 7:
                return new p1r((tos) this.c, (String) obj2, lnmVar, (byte) 7);
            case 8:
                return new p1r((grt) this.c, (ssw0) obj2, lnmVar, (byte) 8);
            case 9:
                return new p1r((bvt) this.c, (out) obj2, lnmVar, (byte) 9);
            case 10:
                return new p1r((Function0) this.c, (iu30) obj2, lnmVar, (byte) 10);
            case 11:
                return new p1r((zeu) this.c, (Uri) obj2, lnmVar, (byte) 11);
            case 12:
                return new p1r((vpv) this.c, (jwq) obj2, lnmVar, (byte) 12);
            case 13:
                return new p1r((yjq) this.c, (String) obj2, lnmVar, (byte) 13);
            case 14:
                p1r p1rVar3 = new p1r((veu) obj2, lnmVar, (byte) 14);
                p1rVar3.c = obj;
                return p1rVar3;
            case 15:
                p1r p1rVar4 = new p1r((gju) obj2, lnmVar, (byte) 15);
                p1rVar4.c = obj;
                return p1rVar4;
            case 16:
                return new p1r((Context) this.c, (b5x) obj2, lnmVar, (byte) 16);
            case 17:
                return new p1r((je4) this.c, (k6y) obj2, lnmVar, (byte) 17);
            case 18:
                return new p1r((ke4) this.c, (ofb) obj2, lnmVar, (byte) 18);
            case 19:
                p1r p1rVar5 = new p1r((cwy) obj2, lnmVar, (byte) 19);
                p1rVar5.c = obj;
                return p1rVar5;
            case 20:
                p1r p1rVar6 = new p1r((euz) obj2, lnmVar, (byte) 20);
                p1rVar6.c = obj;
                return p1rVar6;
            case 21:
                return new p1r((q410) this.c, (String) obj2, lnmVar, (byte) 21);
            case 22:
                p1r p1rVar7 = new p1r((ymd0) obj2, lnmVar, (byte) 22);
                p1rVar7.c = obj;
                return p1rVar7;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new p1r((k740) this.c, (s640) obj2, lnmVar, (byte) 23);
            case 24:
                p1r p1rVar8 = new p1r((dh30) obj2, lnmVar, (byte) 24);
                p1rVar8.c = obj;
                return p1rVar8;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                p1r p1rVar9 = new p1r((j7s) obj2, lnmVar, (byte) 25);
                p1rVar9.c = obj;
                return p1rVar9;
            case 26:
                return new p1r((ty60) obj2, lnmVar, (byte) 26);
            case 27:
                p1r p1rVar10 = new p1r((py70) obj2, lnmVar, (byte) 27);
                p1rVar10.c = obj;
                return p1rVar10;
            case 28:
                return new p1r((gx80) this.c, (ex80) obj2, lnmVar, (byte) 28);
            default:
                p1r p1rVar11 = new p1r((a0a0) obj2, lnmVar, (byte) 29);
                p1rVar11.c = obj;
                return p1rVar11;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 27:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:484:0x09d4 A[PHI: r2
      0x09d4: PHI (r2v3 p.uac) = (r2v1 p.uac), (r2v2 p.uac), (r2v2 p.uac), (r2v5 p.uac) binds: [B:483:0x09c7, B:495:0x0a06, B:492:0x09fb, B:481:0x09b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:487:0x09df A[PHI: r0 r2
      0x09df: PHI (r0v3 java.lang.Object) = (r0v11 java.lang.Object), (r0v14 java.lang.Object) binds: [B:485:0x09dc, B:482:0x09bc] A[DONT_GENERATE, DONT_INLINE]
      0x09df: PHI (r2v2 p.uac) = (r2v3 p.uac), (r2v4 p.uac) binds: [B:485:0x09dc, B:482:0x09bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:489:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:491:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:589:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0062 -> B:12:0x0036). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:492:0x09fb -> B:484:0x09d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:495:0x0a06 -> B:484:0x09d4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p1r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1r(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
