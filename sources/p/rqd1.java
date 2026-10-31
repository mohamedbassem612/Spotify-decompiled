package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class rqd1 {
    public static final u9a1 a = new u9a1(3, (lnm) null, (byte) 4);

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(p.i8d1 r5, boolean r6, p.cav0 r7, p.lnm r8) {
        /*
            boolean r0 = r8 instanceof p.iqd1
            if (r0 == 0) goto L13
            r0 = r8
            p.iqd1 r0 = (p.iqd1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.iqd1 r0 = new p.iqd1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.c
            p.cav0 r6 = r0.b
            p.i8d1 r7 = r0.a
            p.hm5.M(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L36:
            p.hm5.M(r8)
        L39:
            r0.a = r5
            r0.b = r7
            r0.c = r6
            r0.e = r2
            java.lang.Object r8 = r5.a(r7, r0)
            p.d9n r1 = p.d9n.a
            if (r8 != r1) goto L4a
            return r1
        L4a:
            p.bav0 r8 = (p.bav0) r8
            boolean r1 = e(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rqd1.a(p.i8d1, boolean, p.cav0, p.lnm):java.lang.Object");
    }

    public static /* synthetic */ Object b(i8d1 i8d1Var, lnm lnmVar, int i) {
        return a(i8d1Var, (i & 1) != 0, (i & 2) != 0 ? cav0.b : cav0.a, lnmVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004f A[LOOP:0: B:19:0x004d->B:20:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[LOOP:1: B:22:0x0064->B:26:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0066
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(p.i8d1 r7, p.onm r8) {
        /*
            boolean r0 = r8 instanceof p.jqd1
            if (r0 == 0) goto L13
            r0 = r8
            p.jqd1 r0 = (p.jqd1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.jqd1 r0 = new p.jqd1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            p.i8d1 r7 = r0.a
            p.hm5.M(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L2e:
            p.hm5.M(r8)
        L31:
            r0.a = r7
            r0.c = r2
            p.cav0 r8 = p.cav0.b
            java.lang.Object r8 = r7.a(r8, r0)
            p.d9n r1 = p.d9n.a
            if (r8 != r1) goto L40
            return r1
        L40:
            p.bav0 r8 = (p.bav0) r8
            java.util.List r1 = r8.a
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
            r5 = r4
        L4d:
            if (r5 >= r3) goto L5b
            java.lang.Object r6 = r1.get(r5)
            p.hav0 r6 = (p.hav0) r6
            r6.a()
            int r5 = r5 + 1
            goto L4d
        L5b:
            java.util.List r8 = r8.a
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
        L64:
            if (r4 >= r1) goto L74
            java.lang.Object r3 = r8.get(r4)
            p.hav0 r3 = (p.hav0) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L71
            goto L31
        L71:
            int r4 = r4 + 1
            goto L64
        L74:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rqd1.c(p.i8d1, p.onm):java.lang.Object");
    }

    public static Object d(nav0 nav0Var, iu30 iu30Var, iu30 iu30Var2, xu30 xu30Var, iu30 iu30Var3, lnm lnmVar, int i) {
        iu30 iu30Var4 = (i & 1) != 0 ? null : iu30Var;
        iu30 iu30Var5 = (i & 2) != 0 ? null : iu30Var2;
        if ((i & 4) != 0) {
            xu30Var = a;
        }
        Object objS = smo1.s(new qt61((byte) 6, nav0Var, iu30Var4, iu30Var5, xu30Var, (i & 8) != 0 ? null : iu30Var3, (lnm) null), lnmVar);
        return objS == d9n.a ? objS : rih1.a;
    }

    public static boolean e(bav0 bav0Var, boolean z) {
        List list = bav0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hav0 hav0Var = (hav0) list.get(i);
            if (!(z ? p8p1.h(hav0Var) : p8p1.i(hav0Var))) {
                return false;
            }
        }
        return true;
    }

    public static xab1 f(c9n c9nVar, faa0 faa0Var, vu30 vu30Var) {
        return fn31.T(c9nVar, null, 4, new q721(faa0Var, vu30Var, (lnm) null, (byte) 16), 1);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03de  */
    /* JADX WARN: Code duplicated, block: B:103:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:105:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:108:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:26:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:27:0x01be  */
    /* JADX WARN: Code duplicated, block: B:29:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x01de  */
    /* JADX WARN: Code duplicated, block: B:34:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0218  */
    /* JADX WARN: Code duplicated, block: B:40:0x0230  */
    /* JADX WARN: Code duplicated, block: B:43:0x0257  */
    /* JADX WARN: Code duplicated, block: B:46:0x0263  */
    /* JADX WARN: Code duplicated, block: B:48:0x0267  */
    /* JADX WARN: Code duplicated, block: B:49:0x026c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0270  */
    /* JADX WARN: Code duplicated, block: B:54:0x027b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0288  */
    /* JADX WARN: Code duplicated, block: B:57:0x0299 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x029b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x029d  */
    /* JADX WARN: Code duplicated, block: B:61:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x02e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:70:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x0300  */
    /* JADX WARN: Code duplicated, block: B:73:0x031a  */
    /* JADX WARN: Code duplicated, block: B:75:0x031f  */
    /* JADX WARN: Code duplicated, block: B:78:0x033c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0347  */
    /* JADX WARN: Code duplicated, block: B:83:0x0363  */
    /* JADX WARN: Code duplicated, block: B:86:0x0375  */
    /* JADX WARN: Code duplicated, block: B:89:0x039c  */
    /* JADX WARN: Code duplicated, block: B:92:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:94:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:95:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:97:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:99:0x03c7  */
    public static final Object g(i8d1 i8d1Var, c9n c9nVar, p9w0 p9w0Var, iu30 iu30Var, iu30 iu30Var2, xu30 xu30Var, iu30 iu30Var3, faa faaVar) {
        oqd1 oqd1Var;
        p9w0 p9w0Var2;
        iu30 iu30Var4;
        iu30 iu30Var5;
        xu30 xu30Var2;
        byte b;
        Object objB;
        c9n c9nVar2;
        iu30 iu30Var6;
        hav0 hav0Var;
        rih1 rih1Var;
        lnm lnmVar;
        p9w0 p9w0Var3;
        faa0 faa0VarT;
        hav0 hav0Var2;
        Object objH;
        i8d1 i8d1Var2;
        faa0 faa0Var;
        iu30 iu30Var7;
        iu30 iu30Var8;
        iu30 iu30Var9;
        xu30 xu30Var3;
        Object objI;
        i8d1 i8d1Var3;
        iu30 iu30Var10;
        iu30 iu30Var11;
        xu30 xu30Var4;
        c9n c9nVar3;
        p9w0 p9w0Var4;
        lnm lnmVar2;
        p9w0 p9w0Var5;
        i8d1 i8d1Var4;
        faa0 faa0VarF;
        xu30 xu30Var5;
        iu30 iu30Var12;
        Object objE;
        lnm lnmVar3;
        i8d1 i8d1Var5;
        c9n c9nVar4;
        iu30 iu30Var13;
        iu30 iu30Var14;
        xu30 xu30Var6;
        g5f0 g5f0Var;
        c9n c9nVar5;
        p9w0 p9w0Var6;
        hav0 hav0Var3;
        faa0 faa0VarT2;
        p9w0 p9w0Var7;
        Object objH2;
        iu30 iu30Var15;
        i8d1 i8d1Var6;
        lnm lnmVar4;
        p9w0 p9w0Var8;
        faa0 faa0Var2;
        hav0 hav0Var4;
        iu30 iu30Var16;
        faa0 faa0Var3;
        lnm lnmVar5;
        iu30 iu30Var17;
        c9n c9nVar6;
        iu30 iu30Var18;
        lnm lnmVar6;
        g5f0 g5f0Var2;
        faa0 faa0Var4;
        c9n c9nVar7;
        i8d1 i8d1Var7 = i8d1Var;
        if (faaVar instanceof oqd1) {
            oqd1Var = (oqd1) faaVar;
            int i = oqd1Var.X;
            if ((i & os00.INVALID_ID) != 0) {
                oqd1Var.X = i - os00.INVALID_ID;
            } else {
                oqd1Var = new oqd1(faaVar);
            }
        } else {
            oqd1Var = new oqd1(faaVar);
        }
        Object objI2 = oqd1Var.t;
        int i2 = oqd1Var.X;
        cav0 cav0Var = cav0.b;
        f5f0 f5f0Var = f5f0.a;
        u9a1 u9a1Var = a;
        rih1 rih1Var2 = rih1.a;
        d9n d9nVar = d9n.a;
        switch (i2) {
            case 0:
                hm5.M(objI2);
                oqd1Var.a = i8d1Var7;
                oqd1Var.b = c9nVar;
                p9w0Var2 = p9w0Var;
                oqd1Var.c = p9w0Var2;
                iu30Var4 = iu30Var;
                oqd1Var.d = iu30Var4;
                iu30Var5 = iu30Var2;
                oqd1Var.e = iu30Var5;
                xu30Var2 = xu30Var;
                oqd1Var.f = xu30Var2;
                oqd1Var.g = iu30Var3;
                b = 1;
                oqd1Var.X = 1;
                objB = b(i8d1Var7, oqd1Var, 3);
                if (objB != d9nVar) {
                    c9nVar2 = c9nVar;
                    iu30Var6 = iu30Var3;
                    hav0Var = (hav0) objB;
                    hav0Var.a();
                    rih1Var = rih1Var2;
                    lnmVar = null;
                    p9w0Var3 = p9w0Var2;
                    faa0VarT = fn31.T(c9nVar2, null, 4, new mqd1(p9w0Var2, lnmVar, b), b);
                    if (xu30Var2 != u9a1Var) {
                        hav0Var2 = hav0Var;
                        f(c9nVar2, faa0VarT, new kqd1(xu30Var2, p9w0Var3, hav0Var, lnmVar, (byte) 1));
                    } else {
                        hav0Var2 = hav0Var;
                    }
                    if (iu30Var5 == null) {
                        oqd1Var.a = i8d1Var7;
                        oqd1Var.b = c9nVar2;
                        oqd1Var.c = p9w0Var3;
                        oqd1Var.d = iu30Var4;
                        oqd1Var.e = iu30Var5;
                        oqd1Var.f = xu30Var2;
                        oqd1Var.g = iu30Var6;
                        oqd1Var.h = faa0VarT;
                        oqd1Var.X = 2;
                        objI = i(i8d1Var7, cav0Var, oqd1Var);
                        if (objI != d9nVar) {
                            i8d1Var3 = i8d1Var7;
                            faa0Var = faa0VarT;
                            iu30Var10 = iu30Var6;
                            objI2 = objI;
                            xu30 xu30Var7 = xu30Var2;
                            iu30Var11 = iu30Var4;
                            xu30Var4 = xu30Var7;
                            c9nVar3 = c9nVar2;
                            p9w0Var4 = p9w0Var3;
                            lnmVar2 = (hav0) objI2;
                            i8d1 i8d1Var8 = i8d1Var3;
                            p9w0Var5 = p9w0Var4;
                            i8d1Var4 = i8d1Var8;
                            if (lnmVar2 == null) {
                                faa0VarF = f(c9nVar3, faa0Var, new lqd1(p9w0Var5, lnmVar, (byte) 3));
                            } else {
                                lnmVar2.a();
                                faa0VarF = f(c9nVar3, faa0Var, new lqd1(p9w0Var5, lnmVar, (byte) 4));
                            }
                            if (lnmVar2 != null) {
                                if (iu30Var11 == null) {
                                    oqd1Var.a = i8d1Var4;
                                    oqd1Var.b = c9nVar3;
                                    oqd1Var.c = p9w0Var5;
                                    oqd1Var.d = iu30Var11;
                                    oqd1Var.e = iu30Var5;
                                    oqd1Var.f = xu30Var4;
                                    oqd1Var.g = iu30Var10;
                                    oqd1Var.h = lnmVar2;
                                    oqd1Var.i = faa0VarF;
                                    oqd1Var.X = 5;
                                    xu30Var5 = xu30Var4;
                                    iu30Var12 = iu30Var5;
                                    objE = i8d1Var4.e(i8d1Var4.c().a(), new mx51(lnmVar2, lnmVar), oqd1Var);
                                    if (objE != d9nVar) {
                                        iu30 iu30Var19 = iu30Var10;
                                        lnmVar3 = lnmVar2;
                                        objI2 = objE;
                                        i8d1Var5 = i8d1Var4;
                                        c9nVar4 = c9nVar3;
                                        iu30Var13 = iu30Var19;
                                        iu30Var14 = iu30Var11;
                                        xu30Var6 = xu30Var5;
                                        hav0Var3 = (hav0) objI2;
                                        if (hav0Var3 != null) {
                                            faa0VarT2 = fn31.T(c9nVar4, lnmVar, 4, new w621(faa0VarF, p9w0Var5, lnmVar, (byte) 16), 1);
                                            if (xu30Var6 != u9a1Var) {
                                                p9w0 p9w0Var9 = p9w0Var5;
                                                p9w0Var7 = p9w0Var9;
                                                f(c9nVar4, faa0VarT2, new kqd1(xu30Var6, p9w0Var9, hav0Var3, lnmVar, (byte) 2));
                                            } else {
                                                p9w0Var7 = p9w0Var5;
                                            }
                                            if (iu30Var12 == null) {
                                                oqd1Var.a = c9nVar4;
                                                oqd1Var.b = p9w0Var7;
                                                oqd1Var.c = iu30Var14;
                                                oqd1Var.d = iu30Var13;
                                                oqd1Var.e = faa0VarT2;
                                                oqd1Var.f = lnmVar3;
                                                oqd1Var.g = lnmVar;
                                                oqd1Var.h = lnmVar;
                                                oqd1Var.i = lnmVar;
                                                oqd1Var.X = 6;
                                                objI2 = i(i8d1Var5, cav0Var, oqd1Var);
                                                if (objI2 != d9nVar) {
                                                    lnm lnmVar7 = lnmVar3;
                                                    faa0Var3 = faa0VarT2;
                                                    lnmVar5 = lnmVar7;
                                                    iu30Var17 = iu30Var14;
                                                    c9nVar6 = c9nVar4;
                                                    iu30Var18 = iu30Var13;
                                                    lnmVar6 = (hav0) objI2;
                                                    if (lnmVar6 != null) {
                                                        lnmVar6.a();
                                                        f(c9nVar6, faa0Var3, new lqd1(p9w0Var7, lnmVar, (byte) 5));
                                                        iu30Var17.invoke(new Offset(lnmVar6.c));
                                                        return rih1Var;
                                                    }
                                                    f(c9nVar6, faa0Var3, new lqd1(p9w0Var7, lnmVar, (byte) 6));
                                                    if (iu30Var18 != null) {
                                                        iu30Var18.invoke(new Offset(lnmVar5.c));
                                                        return rih1Var;
                                                    }
                                                }
                                            } else {
                                                oqd1Var.a = i8d1Var5;
                                                oqd1Var.b = c9nVar4;
                                                oqd1Var.c = p9w0Var7;
                                                oqd1Var.d = iu30Var14;
                                                oqd1Var.e = iu30Var12;
                                                oqd1Var.f = iu30Var13;
                                                oqd1Var.g = faa0VarT2;
                                                oqd1Var.h = lnmVar3;
                                                oqd1Var.i = 
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0357: IPUT (r23v2 ?? I:??[OBJECT, ARRAY]), (r2v2 'oqd1Var' p.oqd1) (LINE:856) p.oqd1.i java.lang.Object in method: p.rqd1.g(p.i8d1, p.c9n, p.p9w0, p.iu30, p.iu30, p.xu30, p.iu30, p.faa):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes3.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v2 ??
                                                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                                    */
                                                /*
                                                    Method dump skipped, instruction units count: 1044
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: p.rqd1.g(p.i8d1, p.c9n, p.p9w0, p.iu30, p.iu30, p.xu30, p.iu30, p.faa):java.lang.Object");
                                            }

                                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                            public static final Object h(i8d1 i8d1Var, cav0 cav0Var, onm onmVar) {
                                                pqd1 pqd1Var;
                                                p811 p811Var;
                                                if (onmVar instanceof pqd1) {
                                                    pqd1Var = (pqd1) onmVar;
                                                    int i = pqd1Var.c;
                                                    if ((i & os00.INVALID_ID) != 0) {
                                                        pqd1Var.c = i - os00.INVALID_ID;
                                                    } else {
                                                        pqd1Var = new pqd1(onmVar);
                                                    }
                                                } else {
                                                    pqd1Var = new pqd1(onmVar);
                                                }
                                                Object obj = pqd1Var.b;
                                                int i2 = pqd1Var.c;
                                                lnm lnmVar = null;
                                                try {
                                                    if (i2 == 0) {
                                                        p811 p811VarU = cy30.u(obj);
                                                        p811VarU.a = d5f0.a;
                                                        long jB = i8d1Var.c().b();
                                                        mi6 mi6Var = new mi6(cav0Var, p811VarU, lnmVar, (byte) 4);
                                                        pqd1Var.a = p811VarU;
                                                        pqd1Var.c = 1;
                                                        Object objD = i8d1Var.d(jB, mi6Var, pqd1Var);
                                                        d9n d9nVar = d9n.a;
                                                        if (objD == d9nVar) {
                                                            return d9nVar;
                                                        }
                                                        p811Var = p811VarU;
                                                    } else {
                                                        if (i2 != 1) {
                                                            eg.m("call to 'resume' before 'invoke' with coroutine");
                                                            return null;
                                                        }
                                                        p811Var = pqd1Var.a;
                                                        hm5.M(obj);
                                                    }
                                                    return p811Var.a;
                                                } catch (PointerEventTimeoutCancellationException unused) {
                                                    return f5f0.a;
                                                }
                                            }

                                            /* JADX WARN: Code duplicated, block: B:24:0x0073  */
                                            /* JADX WARN: Code duplicated, block: B:28:0x0089  */
                                            /* JADX WARN: Code duplicated, block: B:30:0x0095  */
                                            /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[LOOP:1: B:23:0x0071->B:44:0x00d7, LOOP_END] */
                                            /* JADX WARN: Code duplicated, block: B:50:0x007f A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:52:0x00d0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b3 -> B:13:0x0031). Please report as a decompilation issue!!! */
                                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                                */
                                            public static final java.lang.Object i(p.i8d1 r17, p.cav0 r18, p.faa r19) {
                                                /*
                                                    Method dump skipped, instruction units count: 223
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: p.rqd1.i(p.i8d1, p.cav0, p.faa):java.lang.Object");
                                            }
                                        }
