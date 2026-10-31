package p;

import android.graphics.Color;
import com.google.protobuf.Any;
import com.spotify.watchfeed.component.content.v1.CanvasContent;
import com.spotify.watchfeed.component.content.v1.ImageContent;
import com.spotify.watchfeed.component.content.v1.LinearGradientContent;
import com.spotify.watchfeed.component.content.v1.LottieAnimationContent;
import com.spotify.watchfeed.component.content.v1.ReadAlongContent;
import com.spotify.watchfeed.component.item.v1.AddToCollectionButtonComponent;
import com.spotify.watchfeed.component.item.v1.AnimationHeaderBodyComponent;
import com.spotify.watchfeed.component.item.v1.CallToActionEventsButtonComponent;
import com.spotify.watchfeed.component.item.v1.CallToActionNavigationButtonComponent;
import com.spotify.watchfeed.component.item.v1.ChapterItem;
import com.spotify.watchfeed.component.item.v1.ChapterNavigationListButtonComponent;
import com.spotify.watchfeed.component.item.v1.CommentsButtonComponent;
import com.spotify.watchfeed.component.item.v1.ContextMenuReportItemComponent;
import com.spotify.watchfeed.component.item.v1.EntityShareButtonComponent;
import com.spotify.watchfeed.component.item.v1.EpisodeContextMenuButtonComponent;
import com.spotify.watchfeed.component.item.v1.Event;
import com.spotify.watchfeed.component.item.v1.ExplicitBadgeComponent;
import com.spotify.watchfeed.component.item.v1.Hashtag;
import com.spotify.watchfeed.component.item.v1.HashtagCloudComponent;
import com.spotify.watchfeed.component.item.v1.HashtagRowComponent;
import com.spotify.watchfeed.component.item.v1.ImageHeaderBodyComponent;
import com.spotify.watchfeed.component.item.v1.ImageRowComponent;
import com.spotify.watchfeed.component.item.v1.InFeedNavigationButtonComponent;
import com.spotify.watchfeed.component.item.v1.LabeledAddToCollectionButton;
import com.spotify.watchfeed.component.item.v1.LabeledShareButtonComponent;
import com.spotify.watchfeed.component.item.v1.MediaRowComponent;
import com.spotify.watchfeed.component.item.v1.NavigationButtonComponent;
import com.spotify.watchfeed.component.item.v1.NavigationHeaderBodyComponent;
import com.spotify.watchfeed.component.item.v1.PreReleaseCardComponent;
import com.spotify.watchfeed.component.item.v1.SimpleEntityRowComponent;
import com.spotify.watchfeed.component.item.v1.proto.ContextMenuNavigationItemComponent;
import com.spotify.watchfeed.component.item.v1.proto.ExpandableDescriptionRowComponent;
import com.spotify.watchfeed.component.item.v1.proto.GenericContextMenuButtonComponent;
import com.spotify.watchfeed.component.item.v2.MuteButtonComponent;
import com.spotify.watchfeed.component.model.v1.proto.Artist;
import com.spotify.watchfeed.component.model.v1.proto.MediaItem;
import com.spotify.watchfeed.component.model.v1.proto.Visual;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yk1 implements j0i {
    public final /* synthetic */ byte a;
    public final kly0 b;

    public /* synthetic */ yk1(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x019c  */
    @Override // p.j0i
    public final z0i a(Any any) {
        yxc yxcVar;
        xxc xxcVar;
        int i;
        dhm ehmVar;
        iu50 iu50Var;
        int i2;
        Integer numValueOf;
        int i3;
        Integer numValueOf2;
        Integer numValueOf3;
        switch (this.a) {
            case 0:
                AddToCollectionButtonComponent addToCollectionButtonComponentQ = AddToCollectionButtonComponent.q(any.q());
                return new xk1(addToCollectionButtonComponentQ.getUri(), addToCollectionButtonComponentQ.n(), addToCollectionButtonComponentQ.o(), addToCollectionButtonComponentQ.p());
            case 1:
                AnimationHeaderBodyComponent animationHeaderBodyComponentS = AnimationHeaderBodyComponent.s(any.q());
                return new qd5(animationHeaderBodyComponentS.o(), animationHeaderBodyComponentS.q(), animationHeaderBodyComponentS.getSubtitle(), animationHeaderBodyComponentS.r(), animationHeaderBodyComponentS.p(), animationHeaderBodyComponentS.n());
            case 2:
                CallToActionEventsButtonComponent callToActionEventsButtonComponentQ = CallToActionEventsButtonComponent.q(any.q());
                Artist artistN = callToActionEventsButtonComponentQ.o().n();
                v900 v900Var = new v900(artistN.getName(), artistN.o().getUrl(), artistN.getUri());
                h290<Event> h290VarQ = callToActionEventsButtonComponentQ.o().q();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
                for (Event event : h290VarQ) {
                    arrayList.add(new u900(event.getTitle(), event.n().n(), event.o(), event.getUri()));
                }
                String title = callToActionEventsButtonComponentQ.getTitle();
                String strP = callToActionEventsButtonComponentQ.p();
                hux huxVarN = strP != null ? c0p1.n(strP) : null;
                String strN = callToActionEventsButtonComponentQ.n();
                boolean zR = callToActionEventsButtonComponentQ.o().r();
                String strO = callToActionEventsButtonComponentQ.o().o();
                strO.getClass();
                return new uxc(title, huxVarN, strN, new w900(v900Var, arrayList, zR, !ihc1.y0(strO) ? strO : null, callToActionEventsButtonComponentQ.o().s()));
            case 3:
                CallToActionNavigationButtonComponent callToActionNavigationButtonComponentS = CallToActionNavigationButtonComponent.s(any.q());
                String uri = callToActionNavigationButtonComponentS.getUri();
                String title2 = callToActionNavigationButtonComponentS.getTitle();
                String strP2 = callToActionNavigationButtonComponentS.p();
                String strO2 = callToActionNavigationButtonComponentS.o();
                String strN2 = callToActionNavigationButtonComponentS.n();
                if (callToActionNavigationButtonComponentS.r()) {
                    String strP3 = callToActionNavigationButtonComponentS.q().p();
                    if (strP3.length() == 0) {
                        strP3 = null;
                    }
                    if (callToActionNavigationButtonComponentS.q().r()) {
                        String uri2 = callToActionNavigationButtonComponentS.q().n().getUri();
                        String strName = callToActionNavigationButtonComponentS.q().n().n().name();
                        if (strName != null) {
                            if (strName.equals("DEFAULT")) {
                                i = 1;
                            } else if (strName.equals("ARTIST")) {
                                i = 2;
                            } else if (strName.equals("SHOW")) {
                                i = 3;
                            } else if (strName.equals("USER")) {
                                i = 4;
                            } else {
                                hhg1.n("No enum constant com.spotify.watchfeed.components.calltoactionnavigationbutton.CallToActionNavigationButton.ArtworkType.".concat(strName));
                            }
                            xxcVar = new xxc(uri2, i);
                        } else {
                            bhn0.i("Name is null");
                        }
                        i = 0;
                        xxcVar = new xxc(uri2, i);
                    } else {
                        xxcVar = null;
                    }
                    yxcVar = new yxc(strP3, xxcVar);
                } else {
                    yxcVar = null;
                }
                return new zxc(uri, yxcVar, title2, strP2, strO2, strN2);
            case 4:
                CanvasContent canvasContentW = CanvasContent.w(any.q());
                return new oid(canvasContentW.t(), qmo1.B(canvasContentW.u()), qmo1.A(canvasContentW.n()), qmo1.y(canvasContentW.s()), canvasContentW.r(), canvasContentW.p(), canvasContentW.o(), canvasContentW.v() ? qmo1.z(canvasContentW.q()) : null);
            case 5:
                ChapterNavigationListButtonComponent chapterNavigationListButtonComponentQ = ChapterNavigationListButtonComponent.q(any.q());
                String strN3 = chapterNavigationListButtonComponentQ.n();
                h290<ChapterItem> h290VarO = chapterNavigationListButtonComponentQ.o();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
                for (ChapterItem chapterItem : h290VarO) {
                    arrayList2.add(new khe(chapterItem.getEntityUri(), chapterItem.getTitle(), chapterItem.n(), chapterItem.o()));
                }
                return new oje(strN3, chapterNavigationListButtonComponentQ.p(), arrayList2);
            case 6:
                CommentsButtonComponent commentsButtonComponentP = CommentsButtonComponent.p(any.q());
                return new ljh(commentsButtonComponentP.getEntityUri(), commentsButtonComponentP.getTitle(), commentsButtonComponentP.n(), commentsButtonComponentP.o());
            case 7:
                EntityShareButtonComponent entityShareButtonComponentP = EntityShareButtonComponent.p(any.q());
                return new wvy(entityShareButtonComponentP.getUri(), entityShareButtonComponentP.n(), entityShareButtonComponentP.o());
            case 8:
                EpisodeContextMenuButtonComponent episodeContextMenuButtonComponentO = EpisodeContextMenuButtonComponent.o(any.q());
                return new y2z(episodeContextMenuButtonComponentO.getEntityUri(), episodeContextMenuButtonComponentO.getTitle(), episodeContextMenuButtonComponentO.getSubtitle(), episodeContextMenuButtonComponentO.getImageUrl(), episodeContextMenuButtonComponentO.n());
            case 9:
                ExpandableDescriptionRowComponent expandableDescriptionRowComponentR = ExpandableDescriptionRowComponent.r(any.q());
                return new nq00(expandableDescriptionRowComponentR.n(), expandableDescriptionRowComponentR.p(), expandableDescriptionRowComponentR.o(), expandableDescriptionRowComponentR.q());
            case 10:
                ExplicitBadgeComponent explicitBadgeComponentP = ExplicitBadgeComponent.p(any.q());
                return new mr00(explicitBadgeComponentP.getId(), explicitBadgeComponentP.n(), explicitBadgeComponentP.o());
            case 11:
                GenericContextMenuButtonComponent genericContextMenuButtonComponentO = GenericContextMenuButtonComponent.o(any.q());
                List<Any> itemsList = genericContextMenuButtonComponentO.getItemsList();
                ArrayList arrayList3 = new ArrayList();
                for (Any any2 : itemsList) {
                    String strP4 = any2.p();
                    if (u890.j(strP4, "type.googleapis.com/spotify.watchfeed.component.item.v1.ContextMenuNavigationItemComponent")) {
                        ContextMenuNavigationItemComponent contextMenuNavigationItemComponentP = ContextMenuNavigationItemComponent.p(any2.q());
                        ehmVar = new dhm(contextMenuNavigationItemComponentP.getTitle(), contextMenuNavigationItemComponentP.n(), contextMenuNavigationItemComponentP.o());
                    } else {
                        ehmVar = u890.j(strP4, "type.googleapis.com/spotify.watchfeed.component.item.v1.ContextMenuReportItemComponent") ? new ehm(ContextMenuReportItemComponent.n(any2.q()).getUri()) : null;
                    }
                    if (ehmVar != null) {
                        arrayList3.add(ehmVar);
                    }
                }
                return new rh40(genericContextMenuButtonComponentO.getEntityUri(), genericContextMenuButtonComponentO.getTitle(), genericContextMenuButtonComponentO.getSubtitle(), genericContextMenuButtonComponentO.getImageUrl(), genericContextMenuButtonComponentO.n(), arrayList3);
            case 12:
                HashtagCloudComponent hashtagCloudComponentO = HashtagCloudComponent.o(any.q());
                h290<Hashtag> h290VarN = hashtagCloudComponentO.n();
                String title3 = hashtagCloudComponentO.getTitle();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarN, 10));
                for (Hashtag hashtag : h290VarN) {
                    arrayList4.add(new ku50(hashtag.getId(), hashtag.getTitle(), hashtag.p(), hashtag.o(), hashtag.n(), fg91.b));
                }
                return new lu50(title3, mqo1.F(arrayList4));
            case 13:
                List itemsList2 = HashtagRowComponent.n(any.q()).getItemsList();
                ArrayList arrayList5 = new ArrayList(q7h.U(itemsList2, 10));
                Iterator it = itemsList2.iterator();
                while (it.hasNext()) {
                    Hashtag hashtagR = Hashtag.r(((Any) it.next()).q());
                    String id = hashtagR.getId();
                    String title4 = hashtagR.getTitle();
                    String strP5 = hashtagR.p();
                    String strO3 = hashtagR.o();
                    String strN4 = hashtagR.n();
                    h290<Visual> h290VarQ2 = hashtagR.q();
                    ArrayList arrayList6 = new ArrayList(q7h.U(h290VarQ2, 10));
                    for (Visual visual : h290VarQ2) {
                        hux huxVarN2 = c0p1.n(visual.p());
                        if (visual.r()) {
                            String uri3 = visual.n().getUri();
                            String strName2 = visual.n().n().name();
                            if (strName2 != null) {
                                if (strName2.equals("DEFAULT")) {
                                    i2 = 1;
                                } else if (strName2.equals("ARTIST")) {
                                    i2 = 2;
                                } else if (strName2.equals("SHOW")) {
                                    i2 = 3;
                                } else if (strName2.equals("USER")) {
                                    i2 = 4;
                                } else {
                                    hhg1.n("No enum constant com.spotify.watchfeed.components.shared.Hashtag.ArtworkType.".concat(strName2));
                                }
                                iu50Var = new iu50(uri3, i2);
                            } else {
                                bhn0.i("Name is null");
                            }
                            i2 = 0;
                            iu50Var = new iu50(uri3, i2);
                        } else {
                            iu50Var = null;
                        }
                        arrayList6.add(new ju50(huxVarN2, iu50Var));
                    }
                    arrayList5.add(new ku50(id, title4, strP5, strO3, strN4, mqo1.A(arrayList6)));
                }
                return new pu50(mqo1.A(arrayList5));
            case 14:
                ImageContent imageContentR = ImageContent.r(any.q());
                return new ds70(new dq70(imageContentR.o().getUrl(), imageContentR.o().o()), imageContentR.q() ? qmo1.w(imageContentR.n()) : null, imageContentR.p());
            case 15:
                ImageHeaderBodyComponent imageHeaderBodyComponentQ = ImageHeaderBodyComponent.q(any.q());
                return new ot70(imageHeaderBodyComponentQ.o(), imageHeaderBodyComponentQ.n(), imageHeaderBodyComponentQ.p());
            case 16:
                ImageRowComponent imageRowComponentO = ImageRowComponent.o(any.q());
                return new jz70(new dq70(imageRowComponentO.n().getUrl(), imageRowComponentO.n().o()));
            case 17:
                InFeedNavigationButtonComponent inFeedNavigationButtonComponentS = InFeedNavigationButtonComponent.s(any.q());
                String title5 = inFeedNavigationButtonComponentS.getTitle();
                String strR = inFeedNavigationButtonComponentS.r();
                String strN5 = inFeedNavigationButtonComponentS.n();
                String strQ = inFeedNavigationButtonComponentS.q();
                return new g680(title5, strR, strN5, i1o1.G(inFeedNavigationButtonComponentS.p()), strQ != null ? c0p1.n(strQ) : null, i1o1.F(inFeedNavigationButtonComponentS.o()));
            case 18:
                LabeledAddToCollectionButton labeledAddToCollectionButtonT = LabeledAddToCollectionButton.t(any.q());
                return new x9b0(labeledAddToCollectionButtonT.getEntityUri(), labeledAddToCollectionButtonT.p(), labeledAddToCollectionButtonT.s(), labeledAddToCollectionButtonT.n(), labeledAddToCollectionButtonT.o(), i1o1.F(labeledAddToCollectionButtonT.q()), i1o1.G(labeledAddToCollectionButtonT.r()));
            case 19:
                LabeledShareButtonComponent labeledShareButtonComponentT = LabeledShareButtonComponent.t(any.q());
                return new aab0(labeledShareButtonComponentT.getEntityUri(), labeledShareButtonComponentT.r(), labeledShareButtonComponentT.n(), labeledShareButtonComponentT.s(), labeledShareButtonComponentT.q(), i1o1.F(labeledShareButtonComponentT.o()), i1o1.G(labeledShareButtonComponentT.p()));
            case 20:
                LinearGradientContent linearGradientContentR = LinearGradientContent.r(any.q());
                h290<String> h290VarO2 = linearGradientContentR.o();
                ArrayList arrayList7 = new ArrayList();
                for (String str : h290VarO2) {
                    str.getClass();
                    try {
                        numValueOf = Integer.valueOf(Color.parseColor(str));
                    } catch (IllegalArgumentException unused) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList7.add(numValueOf);
                    }
                    break;
                }
                return new nic0(arrayList7, linearGradientContentR.q() ? qmo1.w(linearGradientContentR.n()) : null, linearGradientContentR.p());
            case 21:
                LottieAnimationContent lottieAnimationContentS = LottieAnimationContent.s(any.q());
                return new obf0(lottieAnimationContentS.n(), lottieAnimationContentS.r() ? qmo1.w(lottieAnimationContentS.o()) : null, lottieAnimationContentS.p(), lottieAnimationContentS.q());
            case 22:
                List<MediaItem> listD1 = o7h.d1(MediaRowComponent.o(any.q()).n(), 3);
                ArrayList arrayList8 = new ArrayList(q7h.U(listD1, 10));
                for (MediaItem mediaItem : listD1) {
                    dq70 dq70VarY = qmo1.y(mediaItem.o());
                    clj1 clj1VarB = qmo1.B(mediaItem.q());
                    int iOrdinal = mediaItem.p().ordinal();
                    if (iOrdinal == 0) {
                        i3 = 1;
                    } else if (iOrdinal == 1) {
                        i3 = 2;
                    } else if (iOrdinal == 2) {
                        i3 = 3;
                    } else if (iOrdinal != 3) {
                        i3 = 2;
                    } else {
                        i3 = 4;
                    }
                    arrayList8.add(new zwh0(dq70VarY, clj1VarB, i3));
                }
                return new axh0(arrayList8);
            case 23:
                MuteButtonComponent muteButtonComponentP = MuteButtonComponent.p(any.q());
                return new ufn0(muteButtonComponentP.n(), muteButtonComponentP.o());
            case 24:
                NavigationButtonComponent navigationButtonComponentS = NavigationButtonComponent.s(any.q());
                String title6 = navigationButtonComponentS.getTitle();
                String strR2 = navigationButtonComponentS.r();
                String strN6 = navigationButtonComponentS.n();
                lfc lfcVarG = i1o1.G(navigationButtonComponentS.p());
                String strQ2 = navigationButtonComponentS.q();
                return new xtn0(title6, strR2, strN6, lfcVarG, strQ2 != null ? c0p1.n(strQ2) : null, i1o1.F(navigationButtonComponentS.o()));
            case 25:
                NavigationHeaderBodyComponent navigationHeaderBodyComponentQ = NavigationHeaderBodyComponent.q(any.q());
                return new lvn0(navigationHeaderBodyComponentQ.getTitle(), navigationHeaderBodyComponentQ.o(), navigationHeaderBodyComponentQ.p(), navigationHeaderBodyComponentQ.n());
            case 26:
                PreReleaseCardComponent preReleaseCardComponentS = PreReleaseCardComponent.s(any.q());
                return new vhv0(preReleaseCardComponentS.getUri(), preReleaseCardComponentS.getTitle(), preReleaseCardComponentS.getSubtitle(), preReleaseCardComponentS.getDescription(), new dq70(preReleaseCardComponentS.o().getUrl(), preReleaseCardComponentS.o().o()), new dq70(preReleaseCardComponentS.p().getUrl(), preReleaseCardComponentS.p().o()), preReleaseCardComponentS.q().q() * 1000, preReleaseCardComponentS.n(), preReleaseCardComponentS.r());
            case 27:
                return kfx0.a;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ReadAlongContent readAlongContentS = ReadAlongContent.s(any.q());
                i701 i701Var = new i701(readAlongContentS.r().p(), readAlongContentS.r().o(), readAlongContentS.r().getUrl());
                iw9 iw9VarW = qmo1.w(readAlongContentS.n());
                try {
                    numValueOf2 = Integer.valueOf(Color.parseColor(readAlongContentS.q()));
                } catch (Exception unused2) {
                    numValueOf2 = null;
                }
                try {
                    numValueOf3 = Integer.valueOf(Color.parseColor(readAlongContentS.o()));
                } catch (Exception unused3) {
                    numValueOf3 = null;
                }
                return new j701(i701Var, iw9VarW, qmo1.y(readAlongContentS.p()), numValueOf3, numValueOf2);
            default:
                SimpleEntityRowComponent simpleEntityRowComponentN = SimpleEntityRowComponent.n(any.q());
                return new vw81(simpleEntityRowComponentN.getTitle(), simpleEntityRowComponentN.getSubtitle());
        }
    }

    @Override // p.j0i
    public final Class b() {
        switch (this.a) {
            case 0:
                return xk1.class;
            case 1:
                return qd5.class;
            case 2:
                return uxc.class;
            case 3:
                return zxc.class;
            case 4:
                return oid.class;
            case 5:
                return oje.class;
            case 6:
                return ljh.class;
            case 7:
                return wvy.class;
            case 8:
                return y2z.class;
            case 9:
                return nq00.class;
            case 10:
                return mr00.class;
            case 11:
                return rh40.class;
            case 12:
                return lu50.class;
            case 13:
                return pu50.class;
            case 14:
                return ds70.class;
            case 15:
                return ot70.class;
            case 16:
                return jz70.class;
            case 17:
                return g680.class;
            case 18:
                return x9b0.class;
            case 19:
                return aab0.class;
            case 20:
                return nic0.class;
            case 21:
                return obf0.class;
            case 22:
                return axh0.class;
            case 23:
                return ufn0.class;
            case 24:
                return xtn0.class;
            case 25:
                return lvn0.class;
            case 26:
                return vhv0.class;
            case 27:
                return kfx0.class;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return j701.class;
            default:
                return vw81.class;
        }
    }

    @Override // p.j0i
    public final o1i c() {
        byte b = this.a;
        kly0 kly0Var = this.b;
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
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                break;
        }
        return (o1i) kly0Var.get();
    }
}
