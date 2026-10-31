package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.extendedmetadata.extensions.bannerwithanimationstrait.proto.RiveAnimation;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zb3 implements ov00 {
    public final /* synthetic */ byte a;

    public /* synthetic */ zb3(byte b) {
        this.a = b;
    }

    public static hi31 c(RiveAnimation riveAnimation) {
        return new hi31(riveAnimation.getUrl(), riveAnimation.p() ? new gj31(riveAnimation.o().getPath(), riveAnimation.o().getImageUrl()) : null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static String d(phc phcVar) throws InvalidProtocolBufferException {
        if (phcVar.size() == 16) {
            return g9a.a(phcVar.t());
        }
        throw new InvalidProtocolBufferException("Invalid GID");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static String e(phc phcVar) throws InvalidProtocolBufferException {
        if (phcVar.size() == 16) {
            return g9a.a(phcVar.t());
        }
        throw new InvalidProtocolBufferException("Invalid GID: size=" + phcVar.size() + " contents=\"" + o7h.y0(phcVar, "", (String) null, (String) null, cv6.a1, 30) + "\"");
    }

    /* JADX WARN: Code duplicated, block: B:396:0x0c80  */
    /* JADX WARN: Code duplicated, block: B:400:0x0c8b  */
    /* JADX WARN: Code duplicated, block: B:406:0x0ca4  */
    /* JADX WARN: Code duplicated, block: B:408:0x0caa  */
    /* JADX WARN: Code duplicated, block: B:412:0x0cb5  */
    /* JADX WARN: Code duplicated, block: B:418:0x0cce  */
    /* JADX WARN: Code duplicated, block: B:420:0x0cd4  */
    /* JADX WARN: Code duplicated, block: B:424:0x0cdf  */
    /* JADX WARN: Code duplicated, block: B:429:0x0cf7  */
    /* JADX WARN: Code duplicated, block: B:491:0x0c9f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x0cc9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0cf2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:? A[LOOP:34: B:422:0x0cd9->B:498:?, LOOP_END, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v8 java.lang.Object, still in use, count: 2, list:
          (r8v8 java.lang.Object) from 0x0c74: PHI (r8 I:??) = (r8v2 java.lang.Object), (r8v8 java.lang.Object) binds: [B:391:0x0c73, B:488:0x0c74] A[DONT_GENERATE, DONT_INLINE]
          (r8v8 java.lang.Object) from 0x0c64: CHECK_CAST (com.spotify.prerelease.extension.Image) (r8v8 java.lang.Object)
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
    public final p.ez00 a(byte[] r27) {
        /*
            Method dump skipped, instruction units count: 3488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zb3.a(byte[]):p.ez00");
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 254;
            case 1:
                return 102;
            case 2:
                return 9;
            case 3:
                return 204;
            case 4:
                return 137;
            case 5:
                return 206;
            case 6:
                return 210;
            case 7:
                return 209;
            case 8:
                return 8;
            case 9:
                return 101;
            case 10:
                return 98;
            case 11:
                return 268;
            case 12:
                return 193;
            case 13:
                return 253;
            case 14:
                return 83;
            case 15:
                return 238;
            case 16:
                return 88;
            case 17:
                return 90;
            case 18:
                return 233;
            case 19:
                return 170;
            case 20:
                return 189;
            case 21:
                return 229;
            case 22:
                return 16;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return 245;
            case 24:
                return 221;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return 33;
            case 26:
                return 84;
            case 27:
                return 240;
            case 28:
                return 243;
            default:
                return 242;
        }
    }

    public final Class type() {
        switch (this.a) {
            case 0:
                return yb3.class;
            case 1:
                return zd3.class;
            case 2:
                return gh3.class;
            case 3:
                return yl6.class;
            case 4:
                return zo6.class;
            case 5:
                return iq6.class;
            case 6:
                return mr6.class;
            case 7:
                return us6.class;
            case 8:
                return vy6.class;
            case 9:
                return bz6.class;
            case 10:
                return lo7.class;
            case 11:
                return iw7.class;
            case 12:
                return s78.class;
            case 13:
                return c98.class;
            case 14:
                return l98.class;
            case 15:
                return r98.class;
            case 16:
                return ma8.class;
            case 17:
                return cd8.class;
            case 18:
                return dd8.class;
            case 19:
                return uu8.class;
            case 20:
                return bb9.class;
            case 21:
                return m8a.class;
            case 22:
                return eid.class;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return wjf.class;
            case 24:
                return bpf.class;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return lpg.class;
            case 26:
                return s5k.class;
            case 27:
                return m6k.class;
            case 28:
                return ydk.class;
            default:
                return eek.class;
        }
    }
}
