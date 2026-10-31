package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wf1 implements acr0 {
    public final /* synthetic */ byte a;
    public final wpv0 b;
    public final Set c;

    public wf1(wpv0 wpv0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = wpv0Var;
                this.c = Collections.singleton(blc0.Ad);
                break;
            case 2:
                this.b = wpv0Var;
                this.c = Collections.singleton(blc0.h2);
                break;
            case 3:
                this.b = wpv0Var;
                this.c = Collections.singleton(blc0.Bd);
                break;
            case 4:
                this.b = wpv0Var;
                this.c = Collections.singleton(blc0.Sd);
                break;
            default:
                this.b = wpv0Var;
                this.c = Collections.singleton(blc0.Z);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.c;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return nf1.class;
            case 1:
                return bh1.class;
            case 2:
                return q88.class;
            case 3:
                return ca9.class;
            default:
                return qzm1.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v10 java.lang.Object, still in use, count: 2, list:
          (r4v10 java.lang.Object) from 0x005c: PHI (r4 I:??) = (r4v5 java.lang.Object), (r4v10 java.lang.Object) binds: [B:25:0x005b, B:46:0x005c] A[DONT_GENERATE, DONT_INLINE]
          (r4v10 java.lang.Object) from 0x0050: CHECK_CAST (p.ph1) (r4v10 java.lang.Object)
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
    public final android.os.Parcelable c(android.content.Intent r2, p.s4b1 r3, p.th61 r4) {
        /*
            r1 = this;
            byte r1 = r1.a
            java.lang.String r2 = "type"
            java.lang.String r4 = ""
            switch(r1) {
                case 0: goto L76;
                case 1: goto L6c;
                case 2: goto L3b;
                case 3: goto L1b;
                default: goto L9;
            }
        L9:
            boolean r1 = p.oon1.q(r3)
            p.szm1 r2 = new p.szm1
            java.lang.String r3 = r3.z()
            if (r3 != 0) goto L16
            goto L17
        L16:
            r4 = r3
        L17:
            r2.<init>(r4, r1)
            return r2
        L1b:
            java.lang.String r1 = "tab"
            java.lang.String r1 = r3.n(r1)
            if (r1 != 0) goto L25
            java.lang.String r1 = "0"
        L25:
            java.lang.Integer r1 = p.nhc1.c0(r1)
            if (r1 == 0) goto L30
            int r1 = r1.intValue()
            goto L31
        L30:
            r1 = 0
        L31:
            boolean r2 = p.oon1.q(r3)
            p.ka9 r3 = new p.ka9
            r3.<init>(r1, r2)
            return r3
        L3b:
            java.lang.String r1 = r3.n(r2)
            p.t0z r2 = p.ph1.d
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r2.next()
            r0 = r4
            p.ph1 r0 = (p.ph1) r0
            java.lang.String r0 = r0.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L45
            goto L5c
        L5b:
            r4 = 0
        L5c:
            p.ph1 r4 = (p.ph1) r4
            if (r4 != 0) goto L62
            p.ph1 r4 = p.ph1.Invalid
        L62:
            boolean r1 = p.oon1.q(r3)
            p.v88 r2 = new p.v88
            r2.<init>(r4, r1)
            return r2
        L6c:
            p.kh1 r1 = new p.kh1
            java.lang.String r2 = r3.n(r2)
            r1.<init>(r2)
            return r1
        L76:
            int r1 = r3.p()
            int r1 = r1 + (-2)
            java.lang.String r1 = r3.o(r1)
            if (r1 != 0) goto L83
            r1 = r4
        L83:
            int r2 = r3.p()
            int r2 = r2 + (-1)
            java.lang.String r2 = r3.o(r2)
            if (r2 != 0) goto L90
            r2 = r4
        L90:
            java.lang.String r0 = "reason"
            java.lang.String r0 = r3.n(r0)
            if (r0 != 0) goto L99
            goto L9a
        L99:
            r4 = r0
        L9a:
            boolean r3 = p.oon1.q(r3)
            p.vf1 r0 = new p.vf1
            r0.<init>(r1, r2, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wf1.c(android.content.Intent, p.s4b1, p.th61):android.os.Parcelable");
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Add-ons Consideration Page";
            case 1:
                return "Manage Add-ons Page";
            case 2:
                return "Manage Add-ons Page";
            case 3:
                return "Available Plans offered to Premium users from PAM.";
            default:
                return "YourPremium Page";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        wpv0 wpv0Var = this.b;
        switch (b) {
            case 0:
                return wpv0Var.b.a();
            case 1:
                return wpv0Var.b.h();
            case 2:
                return wpv0Var.b.h();
            case 3:
                return !wpv0Var.b.d();
            default:
                return wpv0Var.b.m() && !wpv0Var.b.t();
        }
    }
}
