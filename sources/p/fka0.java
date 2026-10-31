package p;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fka0 {
    public static final vz00 a;

    static {
        vz00 vz00Var = new vz00();
        vz00Var.a(eka0.a);
        vz00Var.a(eka0.b);
        vz00Var.a(eka0.c);
        vz00Var.a(eka0.d);
        vz00Var.a(eka0.e);
        vz00Var.a(eka0.f);
        vz00Var.a(eka0.g);
        vz00Var.a(eka0.h);
        vz00Var.a(eka0.i);
        vz00Var.a(eka0.j);
        vz00Var.a(eka0.k);
        vz00Var.a(eka0.l);
        vz00Var.a(q661.a);
        a = vz00Var;
    }

    public static fja0 a(kfy0 kfy0Var, zjn0 zjn0Var, l141 l141Var) {
        String strY0;
        wja0 wja0Var = (wja0) z0o1.l(kfy0Var, eka0.a);
        String string = (wja0Var == null || !wja0Var.j()) ? "<init>" : zjn0Var.getString(wja0Var.c);
        if (wja0Var == null || !wja0Var.i()) {
            List<zgy0> list = kfy0Var.e;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (zgy0 zgy0Var : list) {
                zgy0Var.getClass();
                String strF = f(p2o1.J(zgy0Var, l141Var), zjn0Var);
                if (strF == null) {
                    return null;
                }
                arrayList.add(strF);
            }
            strY0 = o7h.y0(arrayList, "", "(", ")V", (iu30) null, 56);
        } else {
            strY0 = zjn0Var.getString(wja0Var.d);
        }
        return new fja0(string, strY0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x003e: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0040 A[HIDDEN] (LINE:63)
          (r4v2 java.lang.String) from 0x0041: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x003e, B:20:0x002f] A[DONT_GENERATE, DONT_INLINE]
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
    public static p.eja0 b(p.ggy0 r4, p.zjn0 r5, p.l141 r6, boolean r7) {
        /*
            p.hf40 r0 = p.eka0.d
            java.lang.Object r0 = p.z0o1.l(r4, r0)
            p.yja0 r0 = (p.yja0) r0
            r1 = 0
            if (r0 != 0) goto Lc
            goto L40
        Lc:
            int r2 = r0.b
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L15
            p.vja0 r0 = r0.c
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 != 0) goto L1b
            if (r7 == 0) goto L1b
            goto L40
        L1b:
            if (r0 == 0) goto L25
            int r7 = r0.b
            r7 = r7 & r3
            if (r7 != r3) goto L25
            int r7 = r0.c
            goto L27
        L25:
            int r7 = r4.f
        L27:
            if (r0 == 0) goto L36
            int r2 = r0.b
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L36
            int r4 = r0.d
            java.lang.String r4 = r5.getString(r4)
            goto L41
        L36:
            p.rgy0 r4 = p.p2o1.F(r4, r6)
            java.lang.String r4 = f(r4, r5)
            if (r4 != 0) goto L41
        L40:
            return r1
        L41:
            p.eja0 r6 = new p.eja0
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fka0.b(p.ggy0, p.zjn0, p.l141, boolean):p.eja0");
    }

    public static fja0 d(yfy0 yfy0Var, zjn0 zjn0Var, l141 l141Var) {
        String strConcat;
        wja0 wja0Var = (wja0) z0o1.l(yfy0Var, eka0.b);
        int i = (wja0Var == null || !wja0Var.j()) ? yfy0Var.f : wja0Var.c;
        if (wja0Var == null || !wja0Var.i()) {
            List listN = p7h.N(p2o1.B(yfy0Var, l141Var));
            List<zgy0> list = yfy0Var.P0;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (zgy0 zgy0Var : list) {
                zgy0Var.getClass();
                arrayList.add(p2o1.J(zgy0Var, l141Var));
            }
            ArrayList arrayListN0 = o7h.N0(arrayList, listN);
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayListN0, 10));
            Iterator it = arrayListN0.iterator();
            while (it.hasNext()) {
                String strF = f((rgy0) it.next(), zjn0Var);
                if (strF == null) {
                    return null;
                }
                arrayList2.add(strF);
            }
            String strF2 = f(p2o1.E(yfy0Var, l141Var), zjn0Var);
            if (strF2 == null) {
                return null;
            }
            strConcat = o7h.y0(arrayList2, "", "(", ")", (iu30) null, 56).concat(strF2);
        } else {
            strConcat = zjn0Var.getString(wja0Var.d);
        }
        return new fja0(zjn0Var.getString(i), strConcat);
    }

    public static final boolean e(ggy0 ggy0Var) {
        lo20 lo20Var = xia0.a;
        return xia0.a.d(((Number) ggy0Var.i(eka0.e)).intValue()).booleanValue();
    }

    public static String f(rgy0 rgy0Var, zjn0 zjn0Var) {
        if (rgy0Var.n()) {
            return keg.b(zjn0Var.b(rgy0Var.i));
        }
        return null;
    }

    public static final mmr0 g(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(pwa.a(strArr));
        tja0 tja0Var = dka0.h;
        vz00 vz00Var = a;
        jja0 jja0Var = new jja0((dka0) tja0Var.a(byteArrayInputStream, vz00Var), strArr2);
        tja0 tja0Var2 = cgy0.Y;
        tja0Var2.getClass();
        mwg mwgVar = new mwg(byteArrayInputStream);
        t8 t8Var = (t8) tja0Var2.b(mwgVar, vz00Var);
        try {
            mwgVar.a(0);
            if (t8Var.isInitialized()) {
                return new mmr0(jja0Var, (cgy0) t8Var);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.a = t8Var;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e) {
            e.a = t8Var;
            throw e;
        }
    }
}
