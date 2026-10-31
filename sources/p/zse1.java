package p;

import com.spotify.checkout.proto.model.v1.proto.TimelineV2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class zse1 {
    public static nqe1 a(TimelineV2 timelineV2) {
        TimelineV2 timelineV3 = timelineV2.p() > 0 ? timelineV2 : null;
        if (timelineV3 == null) {
            return null;
        }
        h290 h290VarQ = timelineV3.q();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : h290VarQ) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            TimelineV2.TimelineGroup timelineGroup = (TimelineV2.TimelineGroup) obj;
            List<TimelineV2.TimelineGroup.TimelineItem> itemsList = timelineGroup.getItemsList();
            ArrayList arrayList2 = new ArrayList();
            for (TimelineV2.TimelineGroup.TimelineItem timelineItem : itemsList) {
                boolean z = i == 0;
                boolean z2 = i == 0;
                String title = timelineItem.getTitle();
                String strO = timelineItem.o();
                strO.getClass();
                List listSingletonList = Collections.singletonList(new mse1(title, !ihc1.y0(strO) ? strO : null, z, z2, false));
                h290<TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem> h290VarP = timelineItem.p();
                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarP, 10));
                for (TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem nestedTimelineItem : h290VarP) {
                    boolean z3 = i == 0;
                    boolean z4 = i == 0;
                    String title2 = nestedTimelineItem.getTitle();
                    String strN = nestedTimelineItem.n();
                    strN.getClass();
                    arrayList3.add(new mse1(title2, !ihc1.y0(strN) ? strN : null, z3, z4, true));
                }
                r7h.W(o7h.N0(arrayList3, listSingletonList), arrayList2);
            }
            z6x z6xVarSingletonList = i == timelineV3.q().size() - 1 ? z6x.a : Collections.singletonList(new kse1(i == 0, i == 0));
            boolean zContains = p7h.M(new Integer[]{0, 1}).contains(Integer.valueOf(i));
            boolean z5 = i == 0;
            boolean z6 = i == 0;
            String title3 = timelineGroup.getTitle();
            String strO2 = timelineGroup.o();
            strO2.getClass();
            r7h.W(o7h.N0((Iterable) z6xVarSingletonList, o7h.N0(arrayList2, Collections.singletonList(new nse1(title3, !ihc1.y0(strO2) ? strO2 : null, zContains, z5, z6)))), arrayList);
            i = i2;
        }
        return new nqe1(arrayList);
    }
}
