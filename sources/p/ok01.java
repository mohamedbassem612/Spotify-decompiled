package p;

import com.spotify.wrapped.v1.proto.Gradient;
import com.spotify.wrapped.v1.proto.Paragraph;
import com.spotify.wrapped.v1.proto.Receipt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ok01 {
    public static final wj01 a(Receipt.Component component) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String id = component.t() ? component.getId() : "";
        int iN = component.n();
        switch (iN == 0 ? -1 : nk01.a[l1d.C(iN)]) {
            case -1:
            case 6:
                return null;
            case 0:
            default:
                eg.o();
                return null;
            case 1:
                Receipt.Component.Text textS = component.s();
                id.getClass();
                return new vj01(id, textS.p(), textS.q() ? textS.o() : null);
            case 2:
                id.getClass();
                return new qj01(component.o().p(), id, component.o().n());
            case 3:
                id.getClass();
                return new uj01(id, component.r().o());
            case 4:
                id.getClass();
                return new tj01(id, component.q().p(), component.q().q(), component.q().o());
            case 5:
                Receipt.Component.EntityDataRow entityDataRowP = component.p();
                id.getClass();
                Paragraph paragraphU = entityDataRowP.u();
                String url = entityDataRowP.t().getUrl();
                int iOrdinal = entityDataRowP.t().o().ordinal();
                int i = 3;
                int i2 = 2;
                int i3 = 1;
                int i4 = iOrdinal != 1 ? iOrdinal != 2 ? 1 : 3 : 2;
                Paragraph paragraphW = entityDataRowP.w();
                Paragraph paragraphV = entityDataRowP.x() ? entityDataRowP.v() : null;
                Paragraph paragraphR = entityDataRowP.r();
                String strQ = entityDataRowP.q();
                h290<Receipt.Bar> h290VarO = entityDataRowP.o();
                Paragraph paragraph = paragraphV;
                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarO, 10));
                for (Receipt.Bar bar : h290VarO) {
                    bar.getClass();
                    float fR = bar.r();
                    String strP = bar.n() == i3 ? bar.p() : null;
                    String imageUrl = bar.n() == i2 ? bar.getImageUrl() : null;
                    if (bar.n() == i) {
                        h290 h290VarN = bar.q().n();
                        ArrayList arrayList4 = new ArrayList(q7h.U(h290VarN, 10));
                        Iterator it = h290VarN.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(((Gradient.ColorStop) it.next()).n());
                        }
                        arrayList = arrayList4;
                    } else {
                        arrayList = null;
                    }
                    if (bar.n() == 3) {
                        h290 h290VarN2 = bar.q().n();
                        ArrayList arrayList5 = new ArrayList(q7h.U(h290VarN2, 10));
                        Iterator it2 = h290VarN2.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(Float.valueOf(((Gradient.ColorStop) it2.next()).o()));
                        }
                        arrayList2 = arrayList5;
                    } else {
                        arrayList2 = null;
                    }
                    arrayList3.add(new s8a(fR, strP, imageUrl, arrayList, arrayList2, bar.u() ? bar.s() : null, bar.t() ? bar.o() : null));
                    i = 3;
                    i2 = 2;
                    i3 = 1;
                }
                return new rj01(id, paragraphU, url, i4, paragraphW, paragraph, paragraphR, strQ, arrayList3, entityDataRowP.n(), entityDataRowP.p(), entityDataRowP.getEntityUri());
        }
    }
}
