package p;

import com.spotify.corex.readalongtranscript.proto.EntitySection;
import com.spotify.corex.readalongtranscript.proto.ExternalLinkSection;
import com.spotify.corex.readalongtranscript.proto.Image;
import com.spotify.corex.readalongtranscript.proto.ImageSection;
import com.spotify.corex.readalongtranscript.proto.LoopingVideoSection;
import com.spotify.corex.readalongtranscript.proto.MusicClosedCaption;
import com.spotify.corex.readalongtranscript.proto.NavigableTitle;
import com.spotify.corex.readalongtranscript.proto.ReadAlongTranscript;
import com.spotify.corex.readalongtranscript.proto.Section;
import com.spotify.corex.readalongtranscript.proto.TextRange;
import com.spotify.corex.readalongtranscript.proto.TextSentence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ecg1 {
    public final k8g1 a(String str, ReadAlongTranscript readAlongTranscript) {
        qpe1 qpe1Var;
        String str2;
        li10 kye1Var;
        li10 kz70Var;
        String strV = readAlongTranscript.v();
        String strQ = readAlongTranscript.q();
        String strT = readAlongTranscript.t();
        String language = readAlongTranscript.getLanguage();
        int iQ = (int) (((long) readAlongTranscript.o().q()) | 4278190080L);
        int iP = (int) (((long) readAlongTranscript.o().p()) | 4278190080L);
        int iN = (int) (4278190080L | ((long) readAlongTranscript.o().n()));
        h290<Section> h290VarS = readAlongTranscript.s();
        ArrayList arrayList = new ArrayList();
        for (Section section : h290VarS) {
            section.getClass();
            int iN2 = section.n();
            switch (iN2 == 0 ? -1 : dcg1.a[l1d.C(iN2)]) {
                case 1:
                    iQ = iQ;
                    iP = iP;
                    str2 = strV;
                    kye1Var = new kye1(section.t(), section.v().getTitle());
                    arrayList.add(kye1Var);
                    strV = str2;
                    iQ = iQ;
                    iP = iP;
                    break;
                case 2:
                    iQ = iQ;
                    iP = iP;
                    TextSentence textSentenceU = section.u();
                    int iP2 = textSentenceU.o().p();
                    String strQ2 = textSentenceU.o().q();
                    h290<TextRange> h290VarO = textSentenceU.o().o();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
                    for (TextRange textRange : h290VarO) {
                        textRange.getClass();
                        arrayList2.add(new mbe1(textRange.o(), textRange.n(), 0));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : arrayList2) {
                        Integer numValueOf = Integer.valueOf(((mbe1) obj).a);
                        Object arrayList3 = linkedHashMap.get(numValueOf);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap.put(numValueOf, arrayList3);
                        }
                        ((List) arrayList3).add(obj);
                    }
                    ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Iterator it2 = ((Iterable) entry.getValue()).iterator();
                        if (!it2.hasNext()) {
                            hhg1.h("Empty collection can't be reduced.");
                            return null;
                        }
                        Object next = it2.next();
                        while (it2.hasNext()) {
                            next = new mbe1(((Number) entry.getKey()).intValue(), ((mbe1) next).b + ((mbe1) it2.next()).b, 0);
                            it = it;
                        }
                        arrayList4.add((mbe1) next);
                    }
                    List listA1 = o7h.a1(arrayList4, new be21((byte) 24));
                    if (!listA1.isEmpty()) {
                        ArrayList arrayListH = p7h.H(new mbe1[]{mbe1.a((mbe1) o7h.q0(listA1), 0, ((mbe1) o7h.q0(listA1)).b, 3)});
                        int size = listA1.size();
                        int i = 1;
                        while (i < size) {
                            arrayListH.add(new mbe1(((mbe1) listA1.get(i)).a, ((mbe1) listA1.get(i)).b + ((mbe1) arrayListH.get(i - 1)).b, ((mbe1) listA1.get(i)).b));
                            i++;
                            strV = strV;
                        }
                        listA1 = arrayListH;
                    }
                    str2 = strV;
                    kye1Var = new yde1(strQ2, listA1, iP2);
                    arrayList.add(kye1Var);
                    strV = str2;
                    iQ = iQ;
                    iP = iP;
                    break;
                case 3:
                    MusicClosedCaption musicClosedCaptionS = section.s();
                    kye1Var = new j2n0(musicClosedCaptionS.q(), section.t(), musicClosedCaptionS.o(), musicClosedCaptionS.p());
                    str2 = strV;
                    arrayList.add(kye1Var);
                    strV = str2;
                    iQ = iQ;
                    iP = iP;
                    break;
                case 4:
                    ImageSection imageSectionQ = section.q();
                    kz70Var = new kz70(section.t(), imageSectionQ.getImageUrl(), imageSectionQ.n(), imageSectionQ.u() ? imageSectionQ.p() : null, imageSectionQ.w() ? imageSectionQ.s() : null, imageSectionQ.t() ? Double.valueOf(imageSectionQ.o()) : null, imageSectionQ.v() ? imageSectionQ.r() : null);
                    str2 = strV;
                    kye1Var = kz70Var;
                    arrayList.add(kye1Var);
                    strV = str2;
                    iQ = iQ;
                    iP = iP;
                    break;
                case 5:
                    LoopingVideoSection loopingVideoSectionR = section.r();
                    kz70Var = new r7f0(section.t(), loopingVideoSectionR.r(), loopingVideoSectionR.n(), loopingVideoSectionR.t() ? loopingVideoSectionR.p() : null, loopingVideoSectionR.s() ? Double.valueOf(loopingVideoSectionR.o()) : null);
                    str2 = strV;
                    kye1Var = kz70Var;
                    arrayList.add(kye1Var);
                    strV = str2;
                    iQ = iQ;
                    iP = iP;
                    break;
                case 6:
                    EntitySection entitySectionO = section.o();
                    int iT = section.t();
                    String uri = entitySectionO.getUri();
                    String title = entitySectionO.getTitle();
                    String strN = entitySectionO.n();
                    EntitySection.Subtitle subtitleS = entitySectionO.s();
                    String strO = subtitleS.o();
                    h290<NavigableTitle> h290VarP = subtitleS.p();
                    ArrayList arrayList5 = new ArrayList(q7h.U(h290VarP, 10));
                    for (NavigableTitle navigableTitle : h290VarP) {
                        arrayList5.add(new arn0(navigableTitle.n(), navigableTitle.getTitle()));
                    }
                    rpy rpyVar = new rpy(strO, arrayList5);
                    h290<Image> h290VarP2 = entitySectionO.p();
                    ArrayList arrayList6 = new ArrayList(q7h.U(h290VarP2, 10));
                    for (Image image : h290VarP2) {
                        image.getClass();
                        arrayList6.add(new cq70(image.getName(), image.getUrl(), image.n(), image.o()));
                        iQ = iQ;
                        iP = iP;
                    }
                    iQ = iQ;
                    iP = iP;
                    str2 = strV;
                    kye1Var = new spy(iT, uri, title, strN, rpyVar, arrayList6, entitySectionO.u() ? entitySectionO.r() : entitySectionO.getUri(), entitySectionO.t() ? entitySectionO.q() : entitySectionO.getUri());
                    arrayList.add(kye1Var);
                    strV = str2;
                    iQ = iQ;
                    iP = iP;
                    break;
                case 7:
                    ExternalLinkSection externalLinkSectionP = section.p();
                    iQ = iQ;
                    iP = iP;
                    str2 = strV;
                    kye1Var = new v710(section.t(), externalLinkSectionP.getUrl(), externalLinkSectionP.o() ? externalLinkSectionP.getTitle() : null);
                    arrayList.add(kye1Var);
                    strV = str2;
                    iQ = iQ;
                    iP = iP;
                    break;
                default:
                    kye1Var = new li10(section.t());
                    str2 = strV;
                    arrayList.add(kye1Var);
                    strV = str2;
                    iQ = iQ;
                    iP = iP;
                    break;
            }
        }
        int i2 = iQ;
        int i3 = iP;
        String str3 = strV;
        boolean zR = readAlongTranscript.r();
        int iOrdinal = readAlongTranscript.u().ordinal();
        if (iOrdinal == 1) {
            qpe1Var = qpe1.b;
        } else if (iOrdinal != 2) {
            qpe1Var = iOrdinal != 3 ? qpe1.a : qpe1.d;
        } else {
            qpe1Var = qpe1.c;
        }
        return new k8g1(str, str3, strT, strQ, language, i2, i3, iN, arrayList, zR, qpe1Var, readAlongTranscript.n(), readAlongTranscript.p());
    }
}
