package p;

import android.net.Uri;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m3n extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3n(dtw dtwVar, t8r0 t8r0Var, ysw yswVar, t8r0 t8r0Var2) {
        super(1);
        this.a = (byte) 23;
        this.b = dtwVar;
        this.c = t8r0Var;
        this.d = yswVar;
    }

    private final Object a(Object obj) {
        ArrayList arrayList = (ArrayList) this.d;
        gmt gmtVar = (gmt) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        if (!arrayList2.isEmpty()) {
            ((twu) gmtVar.b).b(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            ((r2v) gmtVar.c).b(arrayList);
        }
        return rih1.a;
    }

    private final Object d(Object obj) {
        ((ven0) this.c).setValue(((Uri) obj).toString());
        fn31.T((c9n) this.b, (o8n) null, 0, new ett((vpv) this.d, (lnm) null, (byte) 7), 3);
        return rih1.a;
    }

    private final Object e(Object obj) {
        int i;
        du31 du31Var = (du31) obj;
        ven0 ven0Var = (ven0) this.c;
        if (du31Var instanceof bu31) {
            ((iu30) ven0Var.getValue()).invoke(new zrv(Collections.singleton(((bu31) du31Var).a)));
        } else {
            if (!(du31Var instanceof cu31)) {
                eg.o();
                return null;
            }
            c380 c380Var = (c380) ((ven0) this.d).getValue();
            cu31 cu31Var = (cu31) du31Var;
            ftv ftvVar = cu31Var.a;
            int iIndexOf = c380Var.indexOf(ftvVar);
            int iC = l1d.C(cu31Var.b);
            if (iC == 0) {
                i = iIndexOf - 1;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                i = iIndexOf + 1;
            }
            String str = ftvVar.a;
            String str2 = ftvVar.b;
            iu30 iu30Var = (iu30) ven0Var.getValue();
            Set setSingleton = Collections.singleton(ftvVar.a);
            ArrayList arrayList = new ArrayList((Collection) c380Var);
            arrayList.add(i, arrayList.remove(iIndexOf));
            ((vqv) this.b).p(arrayList, str, str2, setSingleton, c380Var, iu30Var);
        }
        return rih1.a;
    }

    private final Object f(Object obj) {
        boolean zBooleanValue;
        nml nmlVarH;
        Boolean boolA;
        int iIntValue;
        laa laaVar = (laa) ((t8r0) this.c).a;
        dtw dtwVar = (dtw) this.b;
        sqw sqwVar = dtwVar.l;
        vik1 vik1Var = dtwVar.d;
        isw iswVar = dtwVar.m;
        Object obj2 = dtwVar.f;
        obj2.getClass();
        boolean z = sqwVar.j;
        try {
            boolean zC = sqwVar.a.a().c(obj2, obj, sqwVar.b());
            sqwVar.j = zC;
            if (!z && zC && (iIntValue = ((Number) sqwVar.g.invoke()).intValue()) > 0 && sqwVar.j) {
                sqwVar.a(iIntValue);
                ztw ztwVarC = sqwVar.c();
                if (ztwVarC != null) {
                    ztwVarC.c(iIntValue, sqwVar.b(), new ssm((Object) sqwVar, obj2, obj, (byte) 27));
                }
                sqwVar.a(iIntValue);
            }
            try {
                String strH = dtwVar.b.h();
                op80 op80VarB = sqwVar.b();
                otu otuVarS = op80VarB != null ? z8p1.s(op80VarB) : null;
                if (otuVarS != null) {
                    otuVarS.i(laaVar.b(), strH);
                }
                iswVar.a(obj, (ysw) this.d);
                if (otuVarS != null) {
                    otuVarS.j(laaVar.b(), strH);
                }
                if (vik1Var.c != null) {
                    vik1Var.a();
                }
                if (dtwVar.w.getParent() != null && vik1Var.c == null) {
                    px20 px20Var = dtwVar.i;
                    op80 op80VarB2 = sqwVar.b();
                    i6r0 i6r0VarY = op80VarB2 != null ? qon1.y(op80VarB2) : null;
                    if (i6r0VarY == null || (boolA = i6r0VarY.a()) == null) {
                        zBooleanValue = i6r0VarY == null;
                    } else {
                        zBooleanValue = boolA.booleanValue();
                    }
                    px20Var.b = zBooleanValue;
                    px20Var.c = false;
                    px20Var.d = 0;
                    px20Var.e = false;
                    px20Var.f = 0;
                    if (i6r0VarY != null) {
                        dtwVar.n.add(i6r0VarY.b(px20Var));
                    }
                    op80 op80VarB3 = sqwVar.b();
                    if (op80VarB3 == null || (nmlVarH = hap1.h(op80VarB3)) == null) {
                        nmlVarH = dtwVar.y;
                    } else {
                        dtwVar.y = nmlVarH;
                    }
                    dtwVar.d(nmlVarH);
                    dtwVar.d.e(iswVar.getView(), new ctw(dtwVar, (byte) 5), (moy0) null, dtwVar.k, dtwVar.j);
                }
                return rih1.a;
            } catch (Exception e) {
                dtw.a(dtwVar, e);
                throw null;
            }
        } catch (Exception e2) {
            sqwVar.c.invoke(e2);
            throw null;
        }
    }

    private final Object g(Object obj) {
        guj gujVar = (guj) this.b;
        return new k6r(gujVar.b.D(new w3w((byte) 5, (q811) this.d, (ven0) this.c)), (byte) 4);
    }

    private final Object h(Object obj) {
        String str = (String) this.d;
        String str2 = ((tyw) obj).c;
        boolean z = ((dxw) this.b).b;
        nxw nxwVar = (nxw) this.c;
        return z ? Next.i(nxw.a(nxwVar, new eyw(str), false, false, 14), Effects.a(new vww[]{new pww(str2), new qww(str2)})) : Next.i(nxw.a(nxwVar, new eyw(str), false, false, 14), Effects.a(new vww[]{new pww(str2)}));
    }

    private final Object i(Object obj) {
        abc0 abc0Var = (abc0) obj;
        bf3 bf3Var = (bf3) this.b;
        o0i o0iVar = (o0i) this.c;
        ven0 ven0Var = (ven0) this.d;
        abc0Var.c = new piu(bf3Var, o0iVar, ven0Var, (lnm) null, (byte) 7);
        abc0Var.a = new l7x(o0iVar, ven0Var, (lnm) null, (byte) 0);
        return rih1.a;
    }

    private final Object j(Object obj) {
        y570 y570Var = (y570) this.c;
        l670 l670Var = (l670) this.b;
        int iOrdinal = ((vo6) obj).ordinal();
        if (iOrdinal == 0) {
            l670Var.c.d(new u570("click", y570Var, gg11.g));
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            l670Var.c.d(new u570("toggleLikeStateClick", y570Var, Collections.singletonMap("shouldAddToLibrary", Boolean.valueOf(!((l811) this.d).a))));
        }
        return rih1.a;
    }

    private final Object k(Object obj) {
        mfx mfxVar;
        scx scxVar;
        xy71 xy71Var = (xy71) obj;
        boolean z = true;
        xy71 xy71Var2 = xy71.a;
        if ((xy71Var != xy71Var2 || (scxVar = (scx) ((q811) this.b).a) == null || !((Boolean) scxVar.a.getValue()).booleanValue()) && (((mfxVar = (mfx) ((q811) this.c).a) != null && !((Boolean) mfxVar.invoke(xy71Var)).booleanValue()) || (u890.j(((q811) this.d).a, Boolean.FALSE) && xy71Var == xy71Var2))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v35 java.lang.Object, still in use, count: 2, list:
          (r8v35 java.lang.Object) from 0x0135: PHI (r8 I:??) = (r8v32 java.lang.Object), (r8v35 java.lang.Object) binds: [B:58:0x0134, B:271:0x0135] A[DONT_GENERATE, DONT_INLINE]
          (r8v35 java.lang.Object) from 0x0127: CHECK_CAST (p.oix) (r8v35 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r59) {
        /*
            Method dump skipped, instruction units count: 3388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m3n.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3n(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
