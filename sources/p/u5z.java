package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u5z implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u5z(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        if (r0.emit(r10, r1) == r7) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b(java.lang.Object r10, p.lnm r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            p.sp00 r0 = (p.sp00) r0
            boolean r1 = r11 instanceof p.gu40
            if (r1 == 0) goto L17
            r1 = r11
            p.gu40 r1 = (p.gu40) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.b = r2
            goto L1c
        L17:
            p.gu40 r1 = new p.gu40
            r1.<init>(r9, r11)
        L1c:
            java.lang.Object r11 = r1.a
            int r2 = r1.b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r2 == 0) goto L55
            if (r2 == r5) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L33
            p.hm5.M(r11)
            goto Lb5
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r6
        L39:
            int r9 = r1.e
            p.vr20 r10 = r1.d
            java.lang.Object r0 = r1.c
            p.hm5.M(r11)
            goto L95
        L43:
            int r9 = r1.g
            int r10 = r1.e
            p.vr20 r2 = r1.d
            java.lang.Object r5 = r1.c
            p.hm5.M(r11)
            r8 = r2
            r2 = r9
            r9 = r10
            r10 = r5
            r5 = r11
            r11 = r8
            goto L78
        L55:
            p.hm5.M(r11)
            java.lang.Object r9 = r9.b
            p.vr20 r9 = (p.vr20) r9
            r11 = r10
            p.qmm1 r11 = (p.qmm1) r11
            java.lang.Object r11 = r0.d
            p.uu40 r11 = (p.uu40) r11
            r1.c = r10
            r1.d = r9
            r2 = 0
            r1.e = r2
            r1.g = r2
            r1.b = r5
            java.lang.Object r11 = r11.c(r1)
            if (r11 != r7) goto L75
            goto Lb4
        L75:
            r5 = r11
            r11 = r9
            r9 = r2
        L78:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L99
            r1.c = r10
            r1.d = r11
            r1.e = r9
            r1.g = r2
            r1.b = r4
            java.lang.Object r0 = r0.b(r1)
            if (r0 != r7) goto L91
            goto Lb4
        L91:
            r8 = r0
            r0 = r10
            r10 = r11
            r11 = r8
        L95:
            r8 = r0
            r0 = r10
            r10 = r8
            goto L9e
        L99:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8 = r0
            r0 = r11
            r11 = r8
        L9e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lb5
            r1.c = r6
            r1.d = r6
            r1.e = r9
            r1.b = r3
            java.lang.Object r9 = r0.emit(r10, r1)
            if (r9 != r7) goto Lb5
        Lb4:
            return r7
        Lb5:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u5z.b(java.lang.Object, p.lnm):java.lang.Object");
    }

    private final Object c(Object obj, lnm lnmVar) {
        List list = (List) obj;
        ((bpb1) ((uu0) this.b).h).m((Object) null, Boolean.valueOf(list.isEmpty()));
        ((ven0) this.c).setValue(list);
        return rih1.a;
    }

    private final Object e(Object obj, lnm lnmVar) {
        int iIntValue = ((Number) obj).intValue();
        err0 err0Var = (hdn0) this.c;
        if (iIntValue != err0Var.s()) {
            ((vu30) this.b).invoke(new Integer(err0Var.s()), new Integer(iIntValue));
            err0Var.t(iIntValue);
        }
        return rih1.a;
    }

    private final Object f(Object obj, lnm lnmVar) {
        ze5 ze5Var;
        zmd zmdVar = (zmd) obj;
        psw0 psw0Var = (nsw0) this.b;
        String str = zmdVar.a;
        wmd wmdVar = (wmd) this.c;
        long j = wmdVar.c;
        tr80 tr80Var = zmdVar.b;
        long j2 = wmdVar.d;
        u7h u7hVar = wmdVar.e;
        ae60 ae60Var = u7hVar != null ? new ae60(u7hVar.a, zmdVar.c) : null;
        ze5 ze5Var2 = new ze5(0, str.length(), new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
        ze5 ze5Var3 = new ze5(((rr80) tr80Var).a, ((rr80) tr80Var).b, new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
        if (ae60Var != null) {
            zma1 zma1Var = new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ae60Var.a, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 63487);
            tr80 tr80Var2 = ae60Var.b;
            ze5Var = new ze5(((rr80) tr80Var2).a, ((rr80) tr80Var2).b, zma1Var);
        } else {
            ze5Var = null;
        }
        psw0Var.setValue(new af5(str, f46.i0(new ze5[]{ze5Var2, ze5Var3, ze5Var}), 0));
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object g(Object obj, lnm lnmVar) {
        gh60 gh60Var;
        if (lnmVar instanceof gh60) {
            gh60Var = (gh60) lnmVar;
            int i = gh60Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gh60Var.b = i - Integer.MIN_VALUE;
            } else {
                gh60Var = new gh60(this, lnmVar);
            }
        } else {
            gh60Var = new gh60(this, lnmVar);
        }
        Object obj2 = gh60Var.a;
        int i2 = gh60Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            Boolean boolValueOf = Boolean.valueOf(((wmu0) ((ih60) this.c).f).a(((cxc0) obj).f.w));
            gh60Var.b = 1;
            Object objEmit = vr20Var.emit(boolValueOf, gh60Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:195:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:213:0x050f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0570  */
    /* JADX WARN: Code duplicated, block: B:261:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:262:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:265:0x060c  */
    /* JADX WARN: Code duplicated, block: B:283:0x0695  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:390:0x0816  */
    /* JADX WARN: Code duplicated, block: B:407:0x0875  */
    /* JADX WARN: Code duplicated, block: B:427:0x08da  */
    /* JADX WARN: Code duplicated, block: B:448:0x092c  */
    /* JADX WARN: Code duplicated, block: B:471:0x098b  */
    /* JADX WARN: Code duplicated, block: B:505:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:544:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:561:0x0b30  */
    /* JADX WARN: Code duplicated, block: B:579:0x0b6d  */
    /* JADX WARN: Code duplicated, block: B:599:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:629:0x0c30  */
    /* JADX WARN: Code duplicated, block: B:75:0x013d  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v51 java.lang.Object, still in use, count: 2, list:
          (r4v51 java.lang.Object) from 0x05f7: PHI (r4 I:??) = (r4v48 java.lang.Object), (r4v51 java.lang.Object) binds: [B:258:0x05f6, B:646:0x05f7] A[DONT_GENERATE, DONT_INLINE]
          (r4v51 java.lang.Object) from 0x05ef: CHECK_CAST (p.uha1) (r4v51 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object emit(java.lang.Object r52, p.lnm r53) {
        /*
            Method dump skipped, instruction units count: 3192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u5z.emit(java.lang.Object, p.lnm):java.lang.Object");
    }
}
