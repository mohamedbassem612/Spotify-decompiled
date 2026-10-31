package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class da91 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public da91(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(blc0.yh);
                break;
            case 2:
                this.b = Collections.singleton(blc0.Bh);
                break;
            case 3:
            default:
                this.b = Collections.singleton(blc0.th);
                break;
            case 4:
                this.b = Collections.singleton(blc0.Rh);
                break;
            case 5:
                this.b = Collections.singleton(blc0.tj);
                break;
            case 6:
                this.b = Collections.singleton(blc0.uc);
                break;
            case 7:
                this.b = Collections.singleton(blc0.rf);
                break;
            case 8:
                this.b = Collections.singleton(blc0.uf);
                break;
            case 9:
                this.b = Collections.singleton(blc0.z9);
                break;
            case 10:
                this.b = hsg1.b;
                break;
            case 11:
                this.b = Collections.singleton(blc0.X5);
                break;
            case 12:
                this.b = Collections.singleton(blc0.Mi);
                break;
            case 13:
                this.b = f46.S0(new blc0[]{blc0.n9, blc0.A9});
                break;
            case 14:
                this.b = Collections.singleton(blc0.Db);
                break;
            case 15:
                this.b = Collections.singleton(blc0.Eb);
                break;
            case 16:
                this.b = Collections.singleton(blc0.Fb);
                break;
            case 17:
                this.b = Collections.singleton(blc0.mj);
                break;
            case 18:
                this.b = Collections.singleton(blc0.sj);
                break;
            case 19:
                this.b = Collections.singleton(blc0.nf);
                break;
            case 20:
                this.b = f46.S0(new blc0[]{blc0.qj, blc0.Uc});
                break;
            case 21:
                this.b = f46.S0(new blc0[]{blc0.o9, blc0.B9});
                break;
            case 22:
                this.b = Collections.singleton(blc0.bk);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.b;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return aa91.class;
            case 1:
                return fn91.class;
            case 2:
                return vw91.class;
            case 3:
                return efa1.class;
            case 4:
                return xib1.class;
            case 5:
                return urc1.class;
            case 6:
                return hsc1.class;
            case 7:
                return ble1.class;
            case 8:
                return mle1.class;
            case 9:
                return jlg1.class;
            case 10:
                return dug1.class;
            case 11:
                return n0i1.class;
            case 12:
                return s1i1.class;
            case 13:
                return bdi1.class;
            case 14:
                return a0j1.class;
            case 15:
                return a1j1.class;
            case 16:
                return z1j1.class;
            case 17:
                return wjj1.class;
            case 18:
                return lwj1.class;
            case 19:
                return b1k1.class;
            case 20:
                return c1k1.class;
            case 21:
                return qml1.class;
            default:
                return fum1.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0177  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a6  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v12 java.lang.Object, still in use, count: 2, list:
          (r3v12 java.lang.Object) from 0x0240: PHI (r3 I:??) = (r3v9 java.lang.Object), (r3v12 java.lang.Object) binds: [B:147:0x023f, B:239:0x0240] A[DONT_GENERATE, DONT_INLINE]
          (r3v12 java.lang.Object) from 0x0234: CHECK_CAST (p.vur0) (r3v12 java.lang.Object)
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
    public final android.os.Parcelable c(android.content.Intent r20, p.s4b1 r21, p.th61 r22) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.da91.c(android.content.Intent, p.s4b1, p.th61):android.os.Parcelable");
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(false);
            case 1:
                return new c6w0(3, true, (hd5) null, 12);
            case 2:
                return new b6w0(false);
            case 3:
                return new b6w0(true);
            case 4:
                return new b6w0(false);
            case 5:
                return new b6w0(true);
            case 6:
                return a6w0.a;
            case 7:
                return new b6w0(false);
            case 8:
                return new b6w0(false);
            case 9:
                return new c6w0(1, false, (hd5) null, 14);
            case 10:
                return new b6w0(false);
            case 11:
                return new b6w0(false);
            case 12:
                return new b6w0(false);
            case 13:
                return new c6w0(1, true, (hd5) null, 12);
            case 14:
                return new c6w0(1, false, (hd5) null, 14);
            case 15:
                return new c6w0(1, false, (hd5) null, 14);
            case 16:
                return new c6w0(1, false, (hd5) null, 14);
            case 17:
                return new b6w0(true);
            case 18:
                return new b6w0(true);
            case 19:
                return new c6w0(1, true, (hd5) null, 12);
            case 20:
                return new b6w0(true);
            case 21:
                return new c6w0(1, true, (hd5) null, 12);
            default:
                return new b6w0(false);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Sleep timer menu";
            case 1:
                return "Slate overlay to learn more about smart shuffle";
            case 2:
                return "Snooze Recommendation Page";
            case 3:
                return "Song DNA unavailable bottom sheet";
            case 4:
                return "Page corresponding to the Cancel Join Request sheet";
            case 5:
                return "Subtitles Selection Bottom Sheet";
            case 6:
                return "Page Match success page when match is found";
            case 7:
                return "Time Cap Music Video upsell for MFT+";
            case 8:
                return "A bottom sheet upsell shown when user tries to pick a track once they are capped.";
            case 9:
                return "Final page in the self managed account downgrade transition flow";
            case 10:
                return "Page for Opt-In BottomSheet";
            case 11:
                return "Page for cultural-moments premium upsell flow";
            case 12:
                return "A component dedicated to show upsells in sheet format as a page";
            case 13:
                return "User info page (name + date of birth) in the kid account creation flow";
            case 14:
                return "Page that shows the verification QR code onboarding flow";
            case 15:
                return "Page that shows the verification QR code";
            case 16:
                return "Page that shows the result of the verification of the QR code";
            case 17:
                return "Video disabled info bottom sheet";
            case 18:
                return "Video quality selection bottom sheet page";
            case 19:
                return "Video types parental controls page for regular member sub-accounts";
            case 20:
                return "Video settings page";
            case 21:
                return "Welcome page within the parental consent flow";
            default:
                return "Your Library Messaging Page";
        }
    }

    public da91(a7a1 a7a1Var) {
        Set setS0;
        this.a = (byte) 3;
        if (!a7a1Var.a) {
            setS0 = f46.S0(new blc0[]{blc0.Kh, blc0.Eh, blc0.v1, blc0.t2});
        } else {
            setS0 = w7x.a;
        }
        this.b = setS0;
    }
}
