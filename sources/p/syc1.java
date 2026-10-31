package p;

import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.Paragraph;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class syc1 {
    public static final ArrayList a(SceneTemplate.SummaryShare.HeroImage heroImage, x660 x660Var) {
        h290 h290VarR;
        int iOrdinal = x660Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            h290 h290VarR2 = heroImage.r();
            h290 arrayList = new ArrayList();
            for (Object obj : h290VarR2) {
                if (!ihc1.y0(((Image) obj).getUrl())) {
                    arrayList.add(obj);
                }
            }
            h290VarR = arrayList;
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return null;
            }
            h290VarR = heroImage.r();
        }
        h290VarR.getClass();
        Iterable iterable = (Iterable) h290VarR;
        ArrayList arrayList2 = new ArrayList(q7h.U(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Image) it.next()).getUrl());
        }
        return arrayList2;
    }

    public static final zud b(SceneTemplate.SummaryShare.Section section) {
        Paragraph paragraphQ = section.s() ? section.q() : null;
        Paragraph paragraphP = section.r() ? section.p() : null;
        h290 h290VarO = section.o();
        ArrayList<SceneTemplate.SummaryShare.RankedItem> arrayList = new ArrayList();
        for (Object obj : h290VarO) {
            SceneTemplate.SummaryShare.RankedItem rankedItem = (SceneTemplate.SummaryShare.RankedItem) obj;
            if (rankedItem.p() && rankedItem.n().u() != 4) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (SceneTemplate.SummaryShare.RankedItem rankedItem2 : arrayList) {
            arrayList2.add(new sud((!rankedItem2.q() || rankedItem2.o().u() == 4) ? null : rankedItem2.o(), rankedItem2.n()));
        }
        return new zud(paragraphQ, paragraphP, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final w660 c(SceneTemplate.SummaryShare.HeroImage heroImage) {
        String strQ = heroImage.o().q();
        if (heroImage.s()) {
            strQ.getClass();
            if (ihc1.y0(strQ)) {
                strQ = null;
            }
        } else {
            strQ = null;
        }
        if (strQ == null) {
            return null;
        }
        String strN = heroImage.o().n();
        uwr uwrVar = cbx.a;
        zsc zscVar = zex.a;
        return new w660(strQ, z4p1.G(ror0.e(z4p1.e(z4p1.G(((wex) ((gmt) zscVar.c).c).k)), strN)), z4p1.G(ror0.e(z4p1.e(z4p1.G(((vex) zscVar.b).c)), heroImage.o().p())));
    }
}
