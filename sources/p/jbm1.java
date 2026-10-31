package p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.v1.WrappedHeaderTrackPlaybackBodyComponent;
import com.spotify.wrapped.v1.proto.AccessibilityDefinition;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jbm1 implements j0i {
    public final kly0 a;

    public jbm1(jly0 jly0Var) {
        this.a = jly0Var;
    }

    @Override // p.j0i
    public final z0i a(Any any) {
        xz7 xz7Var;
        f08 f08Var;
        g08 g08Var;
        dg dgVar;
        WrappedHeaderTrackPlaybackBodyComponent wrappedHeaderTrackPlaybackBodyComponentW = WrappedHeaderTrackPlaybackBodyComponent.w(any.q());
        boolean zQ = wrappedHeaderTrackPlaybackBodyComponentW.q();
        boolean zR = wrappedHeaderTrackPlaybackBodyComponentW.r();
        boolean zS = wrappedHeaderTrackPlaybackBodyComponentW.s();
        WrappedHeaderTrackPlaybackBodyComponent.AudioPreviewCardStyle audioPreviewCardStyleN = wrappedHeaderTrackPlaybackBodyComponentW.n();
        if (!wrappedHeaderTrackPlaybackBodyComponentW.t()) {
            audioPreviewCardStyleN = null;
        }
        if (audioPreviewCardStyleN != null) {
            String strP = audioPreviewCardStyleN.p();
            if (ihc1.y0(strP)) {
                strP = null;
            }
            String strQ = audioPreviewCardStyleN.q();
            if (ihc1.y0(strQ)) {
                strQ = null;
            }
            String strS = audioPreviewCardStyleN.s();
            if (ihc1.y0(strS)) {
                strS = null;
            }
            AccessibilityDefinition accessibilityDefinitionN = audioPreviewCardStyleN.n();
            if (!audioPreviewCardStyleN.t()) {
                accessibilityDefinitionN = null;
            }
            if (accessibilityDefinitionN == null || (dgVar = kuo1.j(accessibilityDefinitionN)) == null) {
                String strO = audioPreviewCardStyleN.o();
                if (ihc1.y0(strO)) {
                    strO = null;
                }
                dgVar = strO != null ? new dg(strO) : null;
            }
            xz7Var = new xz7(strP, strQ, strS, dgVar);
        } else {
            xz7Var = null;
        }
        WrappedHeaderTrackPlaybackBodyComponent.AudioPreviewChipStyle audioPreviewChipStyleO = wrappedHeaderTrackPlaybackBodyComponentW.o();
        if (!wrappedHeaderTrackPlaybackBodyComponentW.u()) {
            audioPreviewChipStyleO = null;
        }
        if (audioPreviewChipStyleO != null) {
            String strO2 = audioPreviewChipStyleO.o();
            if (ihc1.y0(strO2)) {
                strO2 = null;
            }
            String strP2 = audioPreviewChipStyleO.p();
            if (ihc1.y0(strP2)) {
                strP2 = null;
            }
            String strR = audioPreviewChipStyleO.r();
            if (ihc1.y0(strR)) {
                strR = null;
            }
            AccessibilityDefinition accessibilityDefinitionN2 = audioPreviewChipStyleO.n();
            if (!audioPreviewChipStyleO.s()) {
                accessibilityDefinitionN2 = null;
            }
            f08Var = new f08(strO2, strP2, strR, accessibilityDefinitionN2 != null ? kuo1.j(accessibilityDefinitionN2) : null);
        } else {
            f08Var = null;
        }
        WrappedHeaderTrackPlaybackBodyComponent.AudioPreviewLikedSongsAction audioPreviewLikedSongsActionP = wrappedHeaderTrackPlaybackBodyComponentW.p();
        if (!wrappedHeaderTrackPlaybackBodyComponentW.v()) {
            audioPreviewLikedSongsActionP = null;
        }
        if (audioPreviewLikedSongsActionP != null) {
            String strO3 = audioPreviewLikedSongsActionP.o();
            if (ihc1.y0(strO3)) {
                strO3 = null;
            }
            String strQ2 = audioPreviewLikedSongsActionP.q();
            if (ihc1.y0(strQ2)) {
                strQ2 = null;
            }
            AccessibilityDefinition accessibilityDefinitionN3 = audioPreviewLikedSongsActionP.n();
            if (!audioPreviewLikedSongsActionP.r()) {
                accessibilityDefinitionN3 = null;
            }
            g08Var = new g08(strO3, strQ2, accessibilityDefinitionN3 != null ? kuo1.j(accessibilityDefinitionN3) : null);
        } else {
            g08Var = null;
        }
        return new ibm1(null, zQ, zR, zS, xz7Var, f08Var, g08Var);
    }

    @Override // p.j0i
    public final Class b() {
        return ibm1.class;
    }

    @Override // p.j0i
    public final o1i c() {
        return (o1i) this.a.get();
    }
}
