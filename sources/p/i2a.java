package p;

import android.app.Activity;
import android.graphics.Color;
import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.v1.BadgeRowComponent;
import com.spotify.watchfeed.component.item.v1.CallToActionRowComponent;
import com.spotify.watchfeed.component.item.v1.CallToActionSheetButtonComponent;
import com.spotify.watchfeed.component.item.v1.PivotingHeaderBodyComponent;
import com.spotify.watchfeed.component.item.v1.SingleColumnBottomSheetComponent;
import com.spotify.watchfeed.component.item.v1.StyledTextRowComponent;
import com.spotify.watchfeed.component.item.v1.TextStyle;
import com.spotify.watchfeed.component.item.v2.FeedHeaderComponent;
import com.spotify.watchfeed.component.layout.v1.StorytellingDefaultLayout;
import com.spotify.watchfeed.component.layout.v1.WatchFeedHashtagEndOfFeedLayout;
import com.spotify.watchfeed.component.layout.v1.Wrapped2025IntroOutroLayoutComponent;
import com.spotify.watchfeed.component.layout.v1.proto.WatchFeedTwoColumnsLayout;
import com.spotify.watchfeed.component.model.v1.proto.SharedAudio;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i2a implements j0i {
    public final /* synthetic */ byte a;
    public final Object b;
    public final kly0 c;

    public /* synthetic */ i2a(byte b, Object obj, jly0 jly0Var) {
        this.a = b;
        this.c = jly0Var;
        this.b = obj;
    }

    @Override // p.j0i
    public final z0i a(Any any) {
        okc1 okc1Var;
        vq71 vq71Var;
        Integer numValueOf;
        int i;
        int iO;
        byte b = this.a;
        int i2 = 4;
        int i3 = 2;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new h2a(mqo1.A(((l6l1) obj).a(BadgeRowComponent.o(any.q()).n())));
            case 1:
                return new dyc(((l6l1) obj).a((h290) CallToActionRowComponent.n(any.q()).getItemsList()));
            case 2:
                CallToActionSheetButtonComponent callToActionSheetButtonComponentR = CallToActionSheetButtonComponent.r(any.q());
                String title = callToActionSheetButtonComponentR.getTitle();
                String strO = callToActionSheetButtonComponentR.o();
                return new eyc(title, strO != null ? c0p1.n(strO) : null, ((l6l1) obj).b(callToActionSheetButtonComponentR.q()), callToActionSheetButtonComponentR.n(), callToActionSheetButtonComponentR.p());
            case 3:
                l6l1 l6l1Var = (l6l1) obj;
                FeedHeaderComponent feedHeaderComponentQ = FeedHeaderComponent.q(any.q());
                return new vp10(l6l1Var.b(feedHeaderComponentQ.o()), feedHeaderComponentQ.p() ? l6l1Var.b(feedHeaderComponentQ.n()) : null);
            case 4:
                return new w3t0(((l6l1) obj).a(PivotingHeaderBodyComponent.o(any.q()).n()));
            case 5:
                SingleColumnBottomSheetComponent singleColumnBottomSheetComponentP = SingleColumnBottomSheetComponent.p(any.q());
                l6l1 l6l1Var2 = (l6l1) obj;
                return new jy81(l6l1Var2.b(singleColumnBottomSheetComponentP.o()), l6l1Var2.a(singleColumnBottomSheetComponentP.n()));
            case 6:
                StorytellingDefaultLayout storytellingDefaultLayoutY = StorytellingDefaultLayout.y(any.q());
                l6l1 l6l1Var3 = (l6l1) obj;
                z0i z0iVarB = l6l1Var3.b(storytellingDefaultLayoutY.p());
                vpl vplVar = z0iVarB instanceof vpl ? (vpl) z0iVarB : null;
                ArrayList arrayListA = l6l1Var3.a(storytellingDefaultLayoutY.u());
                ArrayList arrayListA2 = l6l1Var3.a(storytellingDefaultLayoutY.o());
                ArrayList arrayListA3 = l6l1Var3.a(storytellingDefaultLayoutY.n());
                String strR = storytellingDefaultLayoutY.r();
                String uri = storytellingDefaultLayoutY.getUri();
                r160 r160VarH = storytellingDefaultLayoutY.v() ? i1o1.H(storytellingDefaultLayoutY.q(), l6l1Var3) : null;
                if (storytellingDefaultLayoutY.x()) {
                    h290 h290VarN = storytellingDefaultLayoutY.t().o().n();
                    if (!h290VarN.isEmpty()) {
                        Iterator it = h290VarN.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String str = (String) it.next();
                                str.getClass();
                                try {
                                    numValueOf = Integer.valueOf(Color.parseColor(str));
                                } catch (Exception unused) {
                                    numValueOf = null;
                                }
                                if (numValueOf == null) {
                                    okc1Var = null;
                                }
                            }
                        }
                    }
                    okc1Var = new okc1(new ohc1(storytellingDefaultLayoutY.t().o().n()));
                } else {
                    okc1Var = null;
                }
                if (storytellingDefaultLayoutY.w()) {
                    SharedAudio sharedAudioS = storytellingDefaultLayoutY.s();
                    vq71Var = new vq71(sharedAudioS.p(), qmo1.A(sharedAudioS.n()).a(), sharedAudioS.q(), sharedAudioS.n().q(), (Integer) null, (sju) null, 48);
                } else {
                    vq71Var = null;
                }
                return new ubc1(vplVar, arrayListA, arrayListA2, arrayListA3, r160VarH, okc1Var, strR, uri, vq71Var);
            case 7:
                WatchFeedHashtagEndOfFeedLayout watchFeedHashtagEndOfFeedLayoutS = WatchFeedHashtagEndOfFeedLayout.s(any.q());
                l6l1 l6l1Var4 = (l6l1) obj;
                z0i z0iVarB2 = l6l1Var4.b(watchFeedHashtagEndOfFeedLayoutS.n());
                return new o8l1(z0iVarB2 instanceof vpl ? (vpl) z0iVarB2 : null, l6l1Var4.a(watchFeedHashtagEndOfFeedLayoutS.p()), l6l1Var4.a(watchFeedHashtagEndOfFeedLayoutS.q()), watchFeedHashtagEndOfFeedLayoutS.r() ? i1o1.H(watchFeedHashtagEndOfFeedLayoutS.o(), l6l1Var4) : null, watchFeedHashtagEndOfFeedLayoutS.getUri());
            case 8:
                WatchFeedTwoColumnsLayout watchFeedTwoColumnsLayoutW = WatchFeedTwoColumnsLayout.w(any.q());
                l6l1 l6l1Var5 = (l6l1) obj;
                ArrayList arrayList = new ArrayList(l6l1Var5.a(watchFeedTwoColumnsLayoutW.o()));
                ArrayList arrayList2 = new ArrayList(l6l1Var5.a(watchFeedTwoColumnsLayoutW.t()));
                boolean zA0 = r7h.a0(arrayList, v5l1.W0);
                boolean zA1 = r7h.a0(arrayList2, v5l1.X0);
                if (!zA0 && !zA1) {
                    z = false;
                }
                boolean z2 = z;
                String strR2 = watchFeedTwoColumnsLayoutW.r();
                z0i z0iVarB3 = l6l1Var5.b(watchFeedTwoColumnsLayoutW.p());
                return new ybl1(strR2, z0iVarB3 instanceof vpl ? (vpl) z0iVarB3 : null, mqo1.F(l6l1Var5.a(watchFeedTwoColumnsLayoutW.u())), mqo1.F(l6l1Var5.a(watchFeedTwoColumnsLayoutW.s())), mqo1.F(l6l1Var5.a(watchFeedTwoColumnsLayoutW.n())), mqo1.F(arrayList), mqo1.F(arrayList2), z2, watchFeedTwoColumnsLayoutW.v() ? i1o1.H(watchFeedTwoColumnsLayoutW.q(), l6l1Var5) : null, watchFeedTwoColumnsLayoutW.getUri());
            case 9:
                Wrapped2025IntroOutroLayoutComponent wrapped2025IntroOutroLayoutComponentV = Wrapped2025IntroOutroLayoutComponent.v(any.q());
                String strQ = wrapped2025IntroOutroLayoutComponentV.q();
                String uri2 = wrapped2025IntroOutroLayoutComponentV.getUri();
                r160 r160VarH2 = wrapped2025IntroOutroLayoutComponentV.u() ? i1o1.H(wrapped2025IntroOutroLayoutComponentV.p(), (l6l1) obj) : null;
                String strR3 = wrapped2025IntroOutroLayoutComponentV.r();
                String strN = wrapped2025IntroOutroLayoutComponentV.n();
                String strS = wrapped2025IntroOutroLayoutComponentV.s();
                int iOrdinal = wrapped2025IntroOutroLayoutComponentV.t().ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else if (iOrdinal == 2) {
                    i = 3;
                } else if (iOrdinal != 3) {
                    i = iOrdinal != 4 ? 2 : 5;
                } else {
                    i = 4;
                }
                return new pbm1(strR3, strS, i, strN, wrapped2025IntroOutroLayoutComponentV.o(), uri2, strQ, r160VarH2);
            default:
                StyledTextRowComponent styledTextRowComponentP = StyledTextRowComponent.p(any.q());
                String strN2 = styledTextRowComponentP.n();
                TextStyle textStyleO = styledTextRowComponentP.o();
                try {
                    iO = Color.parseColor(textStyleO.r());
                    break;
                } catch (Exception unused2) {
                    iO = ago1.o((Activity) obj, 2130968787, -1);
                }
                switch (textStyleO.p().ordinal()) {
                    case 1:
                        i2 = 2;
                        break;
                    case 2:
                        i2 = 3;
                        break;
                    case 3:
                        break;
                    case 4:
                        i2 = 5;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 8;
                        break;
                    case 8:
                        i2 = 9;
                        break;
                    default:
                        i2 = 1;
                        break;
                }
                int iQ = textStyleO.q();
                int iOrdinal2 = textStyleO.n().ordinal();
                if (iOrdinal2 == 0) {
                    i3 = 1;
                } else if (iOrdinal2 != 1 && iOrdinal2 == 2) {
                    i3 = 3;
                }
                return new jkc1(strN2, new ikc1(iO, i2, iQ, i3));
        }
    }

    @Override // p.j0i
    public final Class b() {
        switch (this.a) {
            case 0:
                return h2a.class;
            case 1:
                return dyc.class;
            case 2:
                return eyc.class;
            case 3:
                return vp10.class;
            case 4:
                return w3t0.class;
            case 5:
                return jy81.class;
            case 6:
                return ubc1.class;
            case 7:
                return o8l1.class;
            case 8:
                return ybl1.class;
            case 9:
                return pbm1.class;
            default:
                return jkc1.class;
        }
    }

    @Override // p.j0i
    public final o1i c() {
        byte b = this.a;
        kly0 kly0Var = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return (o1i) kly0Var.get();
    }

    public /* synthetic */ i2a(l6l1 l6l1Var, jly0 jly0Var, byte b) {
        this.a = b;
        this.b = l6l1Var;
        this.c = jly0Var;
    }
}
