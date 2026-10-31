package p;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kv1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public boolean c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv1(wmy wmyVar, boolean z, tv80 tv80Var, km61 km61Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 14;
        this.d = wmyVar;
        this.c = z;
        this.e = tv80Var;
        this.f = km61Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b A[Catch: Exception -> 0x001b, CancellationException -> 0x008a, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x008a, Exception -> 0x001b, blocks: (B:7:0x0017, B:14:0x0026, B:27:0x0060, B:30:0x006b, B:15:0x002a, B:21:0x0040, B:24:0x0049, B:18:0x0031), top: B:38:0x000f }] */
    private final Object e(Object obj) throws AbortFlowException {
        boolean zBooleanValue;
        sl01 sl01Var;
        bfd bfdVar;
        String str;
        g8u0 g8u0Var = (g8u0) this.d;
        kly0 kly0Var = g8u0Var.b;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                lt20 lt20VarA = g8u0Var.c.a();
                this.b = (byte) 1;
                obj = b5p1.i(lt20VarA, this);
                if (obj == d9nVar) {
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
                zBooleanValue = this.c;
                hm5.M(obj);
            }
            sl01Var = sl01.a;
            if (((List) obj).contains(sl01Var)) {
                bfdVar = (bfd) kly0Var.get();
                str = (String) this.f;
                this.c = zBooleanValue;
                this.b = (byte) 3;
                if (bfdVar.J(str, sl01Var, this) == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                bfd bfdVar2 = (bfd) kly0Var.get();
                String str2 = (String) this.e;
                this.c = zBooleanValue;
                this.b = (byte) 2;
                obj = bfdVar2.b.t(str2, this);
                if (obj != d9nVar) {
                    sl01Var = sl01.a;
                    if (((List) obj).contains(sl01Var)) {
                        bfdVar = (bfd) kly0Var.get();
                        str = (String) this.f;
                        this.c = zBooleanValue;
                        this.b = (byte) 3;
                        if (bfdVar.J(str, sl01Var, this) == d9nVar) {
                        }
                    }
                }
                return d9nVar;
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "PlayedReceiptTracker: failed to send receipt", new Object[0]);
            return rih1Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r11 == r9) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r11 == r9) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.b
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 == r2) goto L15
            if (r0 != r1) goto Le
            p.hm5.M(r11)
            goto L54
        Le:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            r10 = 0
            return r10
        L15:
            p.hm5.M(r11)
            goto L3e
        L19:
            p.hm5.M(r11)
            boolean r11 = r10.c
            java.lang.Object r0 = r10.d
            p.s4w0 r0 = (p.s4w0) r0
            p.ccc0 r3 = r0.b
            java.lang.Object r0 = r10.f
            p.d9n r9 = p.d9n.a
            if (r11 == 0) goto L44
            java.lang.Object r11 = r10.e
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            r6 = r0
            p.ubc0 r6 = (p.ubc0) r6
            r10.b = r2
            r5 = 0
            r8 = 2
            r7 = r10
            java.lang.Object r11 = p.ccc0.b(r3, r4, r5, r6, r7, r8)
            if (r11 != r9) goto L3e
            goto L53
        L3e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r11.getClass()
            goto L59
        L44:
            r7 = r10
            java.lang.Object r10 = r7.e
            java.lang.String r10 = (java.lang.String) r10
            p.ubc0 r0 = (p.ubc0) r0
            r7.b = r1
            java.lang.Object r11 = p.ccc0.h(r3, r10, r0, r7, r1)
            if (r11 != r9) goto L54
        L53:
            return r9
        L54:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r11.getClass()
        L59:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kv1.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r7 == r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r7 == r5) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f
            p.ubc0 r0 = (p.ubc0) r0
            java.lang.Object r1 = r6.e
            java.lang.String r1 = (java.lang.String) r1
            byte r2 = r6.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L16
            p.hm5.M(r7)
            goto L48
        L16:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L1d:
            p.hm5.M(r7)
            goto L39
        L21:
            p.hm5.M(r7)
            boolean r7 = r6.c
            java.lang.Object r2 = r6.d
            p.fze1 r2 = (p.fze1) r2
            p.ccc0 r2 = r2.b
            p.d9n r5 = p.d9n.a
            if (r7 == 0) goto L3f
            r6.b = r4
            java.lang.Object r7 = p.ccc0.c(r2, r1, r4, r0, r6)
            if (r7 != r5) goto L39
            goto L47
        L39:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.getClass()
            goto L4d
        L3f:
            r6.b = r3
            java.lang.Object r7 = p.ccc0.i(r2, r1, r4, r0, r6)
            if (r7 != r5) goto L48
        L47:
            return r5
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.getClass()
        L4d:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kv1.h(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new kv1(this.d, this.e, this.c, obj2, lnmVar, (byte) 0);
            case 1:
                return new kv1(this.c, this.d, this.e, obj2, lnmVar, (byte) 1);
            case 2:
                kv1 kv1Var = new kv1(this.c, (pz50) this.e, (qd5) obj2, lnmVar);
                kv1Var.d = obj;
                return kv1Var;
            case 3:
                return new kv1(this.c, this.d, this.e, obj2, lnmVar, (byte) 3);
            case 4:
                return new kv1(this.d, this.e, obj2, lnmVar, (byte) 4);
            case 5:
                kv1 kv1Var2 = new kv1((bfd) obj2, this.c, lnmVar);
                kv1Var2.e = obj;
                return kv1Var2;
            case 6:
                return new kv1(this.c, this.d, obj2, (ven0) this.e, lnmVar, (byte) 6);
            case 7:
                return new kv1(this.d, this.e, this.c, obj2, lnmVar, (byte) 7);
            case 8:
                return new kv1(this.c, (idn0) obj2, lnmVar);
            case 9:
                return new kv1(this.c, this.d, this.e, obj2, lnmVar, (byte) 9);
            case 10:
                return new kv1(this.c, this.d, this.e, obj2, lnmVar, (byte) 10);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new kv1(this.c, this.d, this.e, obj2, lnmVar, (byte) 11);
            case grn1.d /* 12 */:
                kv1 kv1Var3 = new kv1((RecyclerView) this.e, this.c, (p1d0) obj2, lnmVar);
                kv1Var3.d = obj;
                return kv1Var3;
            case 13:
                kv1 kv1Var4 = new kv1((p410) this.e, (tv80) obj2, lnmVar);
                kv1Var4.d = obj;
                return kv1Var4;
            case 14:
                return new kv1((wmy) this.d, this.c, (tv80) this.e, (km61) obj2, lnmVar);
            case 15:
                return new kv1(this.c, this.d, obj2, (ven0) this.e, lnmVar, (byte) 15);
            case 16:
                return new kv1(this.d, this.e, obj2, lnmVar, (byte) 16);
            case 17:
                return new kv1(this.c, this.d, this.e, obj2, lnmVar, (byte) 17);
            case 18:
                return new kv1(this.c, this.d, this.e, obj2, lnmVar, (byte) 18);
            default:
                return new kv1(this.d, this.e, this.c, obj2, lnmVar, (byte) 19);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                return create((rnc0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:327:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:329:0x0600  */
    /* JADX WARN: Code duplicated, block: B:332:0x0615 A[LOOP:1: B:330:0x060f->B:332:0x0615, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:337:0x0638  */
    /* JADX WARN: Code duplicated, block: B:339:0x063b  */
    /* JADX WARN: Code duplicated, block: B:341:0x0645  */
    /* JADX WARN: Code duplicated, block: B:344:0x0652  */
    /* JADX WARN: Code duplicated, block: B:347:0x0663  */
    /* JADX WARN: Code duplicated, block: B:487:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x032a, code lost:
    
        if (r0 == r12) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03ec, code lost:
    
        if (r0 == r12) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0400, code lost:
    
        if (r0 == r12) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04ff, code lost:
    
        if (r1.l(r3, r0, r23) == r12) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0584, code lost:
    
        if (p.lvx.y((p.kbf0) r23.d, (p.fcf0) r15, 1.0f, r23, 12) == r12) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0742, code lost:
    
        if (p.o95.b(r0, r2, r1, (java.lang.Float) null, (p.iu30) null, r23, 12) == r12) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x076b, code lost:
    
        if (r0.g(r1, r23) == r12) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0816, code lost:
    
        if (r0 == r12) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x082a, code lost:
    
        if (r0 == r12) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x088f, code lost:
    
        if (p.s110.h(getContext()).D(r0, r23) == r12) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0175, code lost:
    
        if (r2 == r12) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:392:0x0742 -> B:394:0x0745). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kv1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv1(Object obj, Object obj2, boolean z, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = z;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv1(bfd bfdVar, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 5;
        this.f = bfdVar;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv1(RecyclerView recyclerView, boolean z, p1d0 p1d0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.e = recyclerView;
        this.c = z;
        this.f = p1d0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv1(p410 p410Var, tv80 tv80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.e = p410Var;
        this.f = tv80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv1(boolean z, Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv1(boolean z, Object obj, Object obj2, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = obj;
        this.f = obj2;
        this.e = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv1(boolean z, pz50 pz50Var, qd5 qd5Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.c = z;
        this.e = pz50Var;
        this.f = qd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv1(boolean z, idn0 idn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.c = z;
        this.f = idn0Var;
    }
}
