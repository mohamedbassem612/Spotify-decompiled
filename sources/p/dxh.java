package p;

import com.spotify.extendedmetadata.extensions.companioncontentimpl.proto.ColorExtraction;
import com.spotify.extendedmetadata.extensions.companioncontentimpl.proto.CompanionContent;
import com.spotify.extendedmetadata.extensions.companioncontentimpl.proto.Component;
import com.spotify.extendedmetadata.extensions.companioncontentimpl.proto.EntityComponent;
import com.spotify.extendedmetadata.extensions.companioncontentimpl.proto.ExternalLinkComponent;
import com.spotify.extendedmetadata.extensions.companioncontentimpl.proto.Image;
import com.spotify.extendedmetadata.extensions.companioncontentimpl.proto.ImageComponent;
import com.spotify.extendedmetadata.extensions.companioncontentimpl.proto.LoopingVideoComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dxh implements ov00 {
    public final ez00 a(byte[] bArr) {
        Iterator it;
        alb blbVar;
        o8h o8hVar;
        qzs0 qzs0Var;
        qzs0 vkbVar;
        CompanionContent companionContentO = CompanionContent.o(bArr);
        String uri = companionContentO.getUri();
        h290 h290VarN = companionContentO.n();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = h290VarN.iterator();
        while (it2.hasNext()) {
            Component component = (Component) it2.next();
            String rzhVar = null;
            if (component.n() == 5) {
                it = it2;
            } else {
                int iT = component.t();
                Integer numValueOf = component.u() ? Integer.valueOf(component.o()) : null;
                int iN = component.n();
                int i = iN == 0 ? -1 : cxh.a[l1d.C(iN)];
                if (i == 1) {
                    it = it2;
                    ImageComponent imageComponentR = component.r();
                    String imageUrl = imageComponentR.getImageUrl();
                    String strN = imageComponentR.n();
                    String strO = imageComponentR.t() ? imageComponentR.o() : null;
                    int iE = i3a.e(imageComponentR.s().name());
                    if (imageComponentR.u()) {
                        ColorExtraction colorExtractionP = imageComponentR.p();
                        o8hVar = new o8h(colorExtractionP.p(), colorExtractionP.o(), colorExtractionP.n());
                    } else {
                        o8hVar = null;
                    }
                    blbVar = new blb(imageUrl, strN, strO, iE, o8hVar, imageComponentR.v() ? imageComponentR.r() : null);
                } else if (i == 2) {
                    it = it2;
                    LoopingVideoComponent loopingVideoComponentS = component.s();
                    blbVar = new clb(loopingVideoComponentS.q(), loopingVideoComponentS.n(), i3a.e(loopingVideoComponentS.r().name()), loopingVideoComponentS.s() ? loopingVideoComponentS.o() : null);
                } else if (i == 3) {
                    EntityComponent entityComponentP = component.p();
                    String uri2 = entityComponentP.getUri();
                    String title = entityComponentP.getTitle();
                    String subtitle = entityComponentP.getSubtitle();
                    h290<Image> h290VarQ = entityComponentP.q();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarQ, 10));
                    for (Image image : h290VarQ) {
                        arrayList2.add(new lq70(image.getName(), image.getUrl(), image.n(), image.o()));
                        it2 = it2;
                        entityComponentP = entityComponentP;
                    }
                    it = it2;
                    EntityComponent entityComponent = entityComponentP;
                    int iP = entityComponent.p();
                    switch (iP == 0 ? -1 : cxh.b[l1d.C(iP)]) {
                        case 1:
                            qzs0Var = pzs0.Z;
                            vkbVar = qzs0Var;
                            blbVar = new zkb(uri2, title, subtitle, arrayList2, vkbVar);
                            break;
                        case 2:
                            int iD = i3a.d(entityComponent.n().o().name());
                            List<EntityComponent.EntityTitle> artistsList = entityComponent.n().getArtistsList();
                            ArrayList arrayList3 = new ArrayList(q7h.U(artistsList, 10));
                            for (EntityComponent.EntityTitle entityTitle : artistsList) {
                                arrayList3.add(new ykb(entityTitle.getUri(), entityTitle.getTitle()));
                            }
                            vkbVar = new vkb(iD, arrayList3);
                            blbVar = new zkb(uri2, title, subtitle, arrayList2, vkbVar);
                            break;
                        case 3:
                            List<EntityComponent.EntityTitle> artistsList2 = entityComponent.r().getArtistsList();
                            ArrayList arrayList4 = new ArrayList(q7h.U(artistsList2, 10));
                            for (EntityComponent.EntityTitle entityTitle2 : artistsList2) {
                                arrayList4.add(new ykb(entityTitle2.getUri(), entityTitle2.getTitle()));
                            }
                            vkbVar = new wkb(arrayList4, new ykb(entityComponent.r().n().getUri(), entityComponent.r().n().getTitle()));
                            blbVar = new zkb(uri2, title, subtitle, arrayList2, vkbVar);
                            break;
                        case 4:
                            qzs0Var = s321.N0;
                            vkbVar = qzs0Var;
                            blbVar = new zkb(uri2, title, subtitle, arrayList2, vkbVar);
                            break;
                        case 5:
                            qzs0Var = u321.N0;
                            vkbVar = qzs0Var;
                            blbVar = new zkb(uri2, title, subtitle, arrayList2, vkbVar);
                            break;
                        case 6:
                            qzs0Var = rzs0.Z;
                            vkbVar = qzs0Var;
                            blbVar = new zkb(uri2, title, subtitle, arrayList2, vkbVar);
                            break;
                        case 7:
                            qzs0Var = qzs0.N0;
                            vkbVar = qzs0Var;
                            blbVar = new zkb(uri2, title, subtitle, arrayList2, vkbVar);
                            break;
                        default:
                            k220.f("Unsupported entity case: ".concat(rjx.F(entityComponent.p())));
                            return null;
                    }
                } else {
                    if (i != 4) {
                        k220.f("Unsupported case: ".concat(ydh.q(component.n())));
                        return null;
                    }
                    ExternalLinkComponent externalLinkComponentQ = component.q();
                    blbVar = new alb(externalLinkComponentQ.getUrl(), externalLinkComponentQ.o() ? externalLinkComponentQ.getTitle() : null);
                    it = it2;
                }
                rzhVar = new rzh(iT, numValueOf, blbVar);
            }
            if (rzhVar != null) {
                arrayList.add(rzhVar);
            }
            it2 = it;
        }
        return new zvh(uri, arrayList);
    }

    public final int b() {
        return 113;
    }

    public final Class type() {
        return zvh.class;
    }
}
