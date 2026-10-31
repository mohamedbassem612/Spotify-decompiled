package p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.model.v1.HeaderOverrides;
import com.spotify.watchfeed.component.model.v1.HighlightedButtonStyle;
import com.spotify.wrapped.v1.proto.AudioPreview;
import com.spotify.wrapped.v1.proto.StoryCard;
import com.spotify.wrapped.v1.proto.WrappedLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e8m1 implements j0i {
    public final l6l1 a;
    public final kly0 b;
    public final py7 c;

    public e8m1(l6l1 l6l1Var, jly0 jly0Var, py7 py7Var) {
        this.a = l6l1Var;
        this.b = jly0Var;
        this.c = py7Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00f8  */
    @Override // p.j0i
    public final z0i a(Any any) {
        r160 r160Var;
        z0i z0iVar;
        ew50 ew50Var;
        WrappedLayout wrappedLayoutU = WrappedLayout.u(any.q());
        wrappedLayoutU.getClass();
        String id = wrappedLayoutU.r().getId();
        String url = wrappedLayoutU.n().getUrl();
        py7 py7Var = this.c;
        py7Var.a.put(id, url);
        AudioPreview audioPreviewN = wrappedLayoutU.n();
        if (audioPreviewN.u() && (!audioPreviewN.o().n().isEmpty() || audioPreviewN.o().o() > 0.0f)) {
            py7Var.b.put(wrappedLayoutU.r().getId(), ria.a(wrappedLayoutU.n().o()));
        }
        String id2 = wrappedLayoutU.getId();
        vq71 vq71Var = new vq71(wrappedLayoutU.n().r(), wrappedLayoutU.n().getUrl(), !wrappedLayoutU.n().s(), (String) null, Integer.valueOf((int) wrappedLayoutU.n().n()), u3k.j(wrappedLayoutU.n()), 8);
        StoryCard storyCardR = wrappedLayoutU.r();
        String strQ = wrappedLayoutU.q();
        boolean zT = wrappedLayoutU.t();
        l6l1 l6l1Var = this.a;
        if (zT) {
            z0i z0iVarB = l6l1Var.b(wrappedLayoutU.p().n());
            if (z0iVarB != null) {
                if (z0iVarB instanceof ibm1) {
                    z0iVarB = ibm1.c((ibm1) z0iVarB, wrappedLayoutU.r().getId(), null, null, null, 126);
                }
                z0iVar = z0iVarB;
            } else {
                z0iVar = null;
            }
            Integer numQ = nmn1.q(wrappedLayoutU.p().r());
            boolean zQ = wrappedLayoutU.p().q();
            HeaderOverrides headerOverridesP = wrappedLayoutU.p();
            if (headerOverridesP.s()) {
                int iP = headerOverridesP.o().p();
                int i = iP == 0 ? -1 : d8m1.a[l1d.C(iP)];
                if (i == -1) {
                    ew50Var = null;
                } else if (i != 1) {
                    if (i != 2 && i != 3) {
                        eg.o();
                        return null;
                    }
                    ew50Var = null;
                } else {
                    HighlightedButtonStyle highlightedButtonStyleO = headerOverridesP.o().o();
                    ew50Var = new ew50(nmn1.q(highlightedButtonStyleO.n()), nmn1.q(highlightedButtonStyleO.p()));
                }
            } else {
                ew50Var = null;
            }
            r160Var = new r160(z0iVar, numQ, zQ, ew50Var, false);
        } else {
            r160Var = null;
        }
        return new c8m1(id2, vq71Var, storyCardR, strQ, r160Var, wrappedLayoutU.s() ? l6l1Var.b(wrappedLayoutU.o()) : null);
    }

    @Override // p.j0i
    public final Class b() {
        return c8m1.class;
    }

    @Override // p.j0i
    public final o1i c() {
        return (o1i) this.b.get();
    }
}
