package p;

import com.spotify.encoreconsumermobile.elements.chipbutton.ChipButtonView;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lcb0 extends emc0 {
    public static final kn5 h = new kn5((byte) 20);
    public static final kn5 i = new kn5((byte) 25);
    public final /* synthetic */ byte e = 2;
    public final Object f;
    public Object g;

    public lcb0(List list, Executor executor) {
        super(new ow3(executor, new kn5((byte) 11), (byte) 18));
        this.f = list;
        x(true);
        this.g = c37.f;
    }

    public void C(List list) {
        switch (this.e) {
            case 0:
                if (((emc0) this).d.f.isEmpty() && list != null) {
                    int i2 = 0;
                    for (Object obj : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        o3n0 o3n0Var = (o3n0) this.f;
                        String str = ((kcb0) obj).a.a;
                        i8h1 i8h1Var = o3n0Var.a;
                        zbl0 zbl0Var = o3n0Var.b;
                        Integer numValueOf = Integer.valueOf(i2);
                        zbl0Var.getClass();
                        x6h1 x6h1VarC = zbl0Var.a.c();
                        x6h1VarC.i.add(new a7h1("language_row", str, numValueOf, (String) null, (String) null));
                        x6h1VarC.j = true;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA;
                        ((xjn) k7h1Var).b = r6h1.c;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        i8h1Var.f(k7h1Var.a(), (Set) null);
                        i2 = i3;
                    }
                }
                super.C(list);
                return;
            default:
                super.C(list);
                return;
        }
    }

    public void D(ocb0 ocb0Var) {
        this.g = ocb0Var;
    }

    public long f(int i2) {
        switch (this.e) {
            case 2:
                return ((bw31) ((emc0) this).d.f.get(i2)).getId().hashCode();
            default:
                return super/*p.z511*/.f(i2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 java.lang.Object, still in use, count: 2, list:
          (r0v7 java.lang.Object) from 0x003b: PHI (r0 I:??) = (r0v4 java.lang.Object), (r0v7 java.lang.Object) binds: [B:12:0x003a, B:21:0x003b] A[DONT_GENERATE, DONT_INLINE]
          (r0v7 java.lang.Object) from 0x002d: CHECK_CAST (p.ey31) (r0v7 java.lang.Object)
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
    public int g(int r3) {
        /*
            r2 = this;
            byte r0 = r2.e
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            int r2 = super/*p.z511*/.g(r3)
            return r2
        La:
            p.wi7 r0 = r2.d
            java.util.List r0 = r0.f
            java.lang.Object r3 = r0.get(r3)
            p.bw31 r3 = (p.bw31) r3
            java.lang.Object r2 = r2.f
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r3 = r3.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r2.next()
            r1 = r0
            p.ey31 r1 = (p.ey31) r1
            java.lang.Class r1 = r1.b()
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L22
            goto L3b
        L3a:
            r0 = 0
        L3b:
            p.ey31 r0 = (p.ey31) r0
            if (r0 == 0) goto L4a
            int r2 = r0.c()
            if (r2 == 0) goto L4a
            int r2 = p.l1d.C(r2)
            goto L50
        L4a:
            java.lang.String r2 = "Invalid view type"
            p.eg.m(r2)
            r2 = 0
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lcb0.g(int):int");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e8 A[PHI: r15
      0x00e8: PHI (r15v18 java.lang.String) = (r15v14 java.lang.String), (r15v19 java.lang.String) binds: [B:52:0x00f2, B:48:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    public final void n(int i2, w611 w611Var) {
        k4m k4mVar;
        String str;
        String string;
        String string2;
        String str2 = null;
        switch (this.e) {
            case 0:
                edb0 edb0Var = (edb0) w611Var;
                kcb0 kcb0Var = (kcb0) A(i2);
                kcb0Var.getClass();
                ym ymVar = new ym(this, i2, (byte) 16);
                edb0Var.U0.setValue(kcb0Var);
                edb0Var.V0.setValue(ymVar);
                break;
            case 1:
                xod1 xod1Var = (xod1) w611Var;
                txs0 txs0Var = (txs0) A(i2);
                ChipButtonView chipButtonView = xod1Var.W0;
                vu30 vu30Var = xod1Var.V0;
                if (vu30Var != null) {
                    vu30Var.invoke(Integer.valueOf(xod1Var.n()), txs0Var.b);
                }
                String str3 = txs0Var.a;
                chipButtonView.setSelected(txs0Var.c);
                chipButtonView.setText(str3);
                chipButtonView.setTextAppearance(chipButtonView.isSelected() ? 2132018007 : 2132018006);
                chipButtonView.setContentDescription(chipButtonView.isSelected() ? chipButtonView.getResources().getString(2131953881, str3) : chipButtonView.getResources().getString(2131953883, str3));
                chipButtonView.setOnClickListener(new wa21(xod1Var, txs0Var, (byte) 19));
                break;
            case 2:
                ((fy31) w611Var).E((bw31) ((emc0) this).d.f.get(i2), z6x.a, new ym(this, i2, (byte) 4));
                break;
            case 3:
                irg0 irg0Var = (irg0) A(i2);
                l6s l6sVar = ((pdz) w611Var).U0;
                qzh qzhVar = (qzh) l6sVar.b;
                String str4 = irg0Var.a;
                String str5 = irg0Var.b;
                String str6 = irg0Var.c;
                boolean z = irg0Var.d;
                if (irg0Var.g) {
                    k4mVar = k4m.a;
                } else {
                    k4mVar = irg0Var.f ? k4m.b : k4m.d;
                }
                qzhVar.f(new raz(str4, str5, str6, k4mVar, z));
                qzhVar.n(new y0o(irg0Var, l6sVar, (byte) 23));
                break;
            case 4:
                syb0 syb0Var = (syb0) w611Var;
                ji0 ji0Var = (ji0) A(i2);
                int iE = e();
                qzh qzhVar2 = syb0Var.U0;
                syb0Var.V0 = ji0Var;
                String str7 = ji0Var.c;
                String str8 = ji0Var.S0;
                String str9 = str8 == null ? "" : str8;
                String str10 = ji0Var.T0;
                String str11 = str10 == null ? "" : str10;
                String str12 = ji0Var.R0;
                String str13 = str12 == null ? "" : str12;
                String strR = ji0Var.V0;
                if (strR == null) {
                    strR = ila0.r(ji0Var.g.a);
                    if (strR == null) {
                        str = "";
                    } else {
                        str = strR;
                    }
                } else {
                    if (strR.length() == 0) {
                        strR = null;
                    }
                    if (strR == null) {
                        strR = ila0.r(ji0Var.g.a);
                        if (strR == null) {
                            str = "";
                        } else {
                            str = strR;
                        }
                    } else {
                        str = strR;
                    }
                }
                qzhVar2.f(new wco(str7, str9, str11, str13, str, ji0Var.b(), (Integer) null, 64));
                String string3 = qzhVar2.getView().getContext().getString(2131957208, Integer.valueOf(i2 + 1), Integer.valueOf(iE));
                CharSequence contentDescription = qzhVar2.getView().getContentDescription();
                if (contentDescription != null && (string = contentDescription.toString()) != null && !ihc1.y0(string)) {
                    str2 = string;
                }
                qzhVar2.getView().setContentDescription(o7h.y0(f46.i0(new String[]{str2, string3}), ", ", (String) null, (String) null, (iu30) null, 62));
                break;
            case 5:
                jdc1 jdc1Var = (jdc1) w611Var;
                ji0 ji0Var2 = (ji0) A(i2);
                int iE2 = e();
                qzh qzhVar3 = jdc1Var.U0;
                String str14 = ji0Var2.c;
                String str15 = ji0Var2.S0;
                String str16 = str15 == null ? "" : str15;
                String str17 = ji0Var2.T0;
                String str18 = str17 == null ? "" : str17;
                String str19 = ji0Var2.U0;
                String str20 = str19 == null ? "" : str19;
                String str21 = ji0Var2.R0;
                qzhVar3.f(new wco(str14, str16, str18, str21 == null ? "" : str21, str20, ji0Var2.b(), (Integer) null, 64));
                qzhVar3.n(new ccb1(jdc1Var, ji0Var2, (byte) 14));
                String string4 = jdc1Var.V0.getContext().getString(2131962948, Integer.valueOf(i2 + 1), Integer.valueOf(iE2));
                CharSequence contentDescription2 = qzhVar3.getView().getContentDescription();
                if (contentDescription2 != null && (string2 = contentDescription2.toString()) != null && !ihc1.y0(string2)) {
                    str2 = string2;
                }
                qzhVar3.getView().setContentDescription(o7h.y0(f46.i0(new String[]{str2, string4}), ", ", (String) null, (String) null, (iu30) null, 62));
                break;
            default:
                t0d1 t0d1Var = (t0d1) A(i2);
                u0d1 u0d1Var = (u0d1) w611Var;
                t0d1Var.getClass();
                qzh qzhVar4 = u0d1Var.U0;
                qzhVar4.f(t0d1Var);
                qzhVar4.n(new ccb1(u0d1Var, i2, t0d1Var));
                break;
        }
    }

    public void o(w611 w611Var, int i2, List list) {
        switch (this.e) {
            case 2:
                ((fy31) w611Var).E((bw31) ((emc0) this).d.f.get(i2), list, new ym(this, i2, (byte) 4));
                break;
            default:
                super/*p.z511*/.o(w611Var, i2, list);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:30:0x0104  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 java.lang.Object, still in use, count: 2, list:
          (r1v6 java.lang.Object) from 0x00fb: PHI (r1 I:??) = (r1v3 java.lang.Object), (r1v6 java.lang.Object) binds: [B:26:0x00fa, B:37:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          (r1v6 java.lang.Object) from 0x00f1: CHECK_CAST (p.ey31) (r1v6 java.lang.Object)
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
    public final p.w611 p(int r7, android.view.ViewGroup r8) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lcb0.p(int, android.view.ViewGroup):p.w611");
    }

    public lcb0(hgx hgxVar, l0d1 l0d1Var) {
        super(kn5.k);
        this.f = hgxVar;
        this.g = l0d1Var;
    }

    public lcb0(c0m c0mVar, d0m d0mVar) {
        super(i);
        this.f = c0mVar;
        this.g = d0mVar;
    }

    public lcb0(jly0 jly0Var) {
        super(new kn5((byte) 21));
        this.f = jly0Var;
    }

    public lcb0(hjc hjcVar) {
        super(new kn5((byte) 14));
        this.f = hjcVar;
    }

    public lcb0(hur hurVar, d7s d7sVar, kn5 kn5Var) {
        super(kn5Var);
        this.f = hurVar;
        this.g = d7sVar;
    }

    public lcb0(o3n0 o3n0Var, Executor executor) {
        super(new ow3(executor, h, (byte) 18));
        this.f = o3n0Var;
    }
}
