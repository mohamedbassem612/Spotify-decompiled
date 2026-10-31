package p;

import com.spotify.eventsender.gabo.EventEnvelope;
import com.spotify.eventsender.gabo.PublishEventsRequest;
import com.spotify.eventsender.gabo.PublishEventsResponse;
import com.spotify.eventsender.gabo.a;
import com.spotify.eventsender.gabo.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ky30 {
    public final zfb0 a;

    public ky30(py30 py30Var, ly30 ly30Var) {
        this.a = py30Var;
    }

    public static Set b(h290 h290Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : h290Var) {
            if (!((PublishEventsResponse.EventError) obj).p()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((PublishEventsResponse.EventError) it.next()).getIndex()));
        }
        return o7h.p1(arrayList2);
    }

    public static LinkedHashSet c(int i, h290 h290Var) {
        SortedSet sortedSetQ1 = o7h.q1(yoi1.Q(0, i));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<E> it = h290Var.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Integer.valueOf(((PublishEventsResponse.EventError) it.next()).getIndex()));
        }
        return o7h.b1(sortedSetQ1, linkedHashSet);
    }

    public final PublishEventsRequest a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n700 n700Var = (n700) it.next();
            a aVarO = EventEnvelope.o();
            aVarO.q(n700Var.b);
            ArrayList<mmr0> arrayList3 = n700Var.e;
            ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
            for (mmr0 mmr0Var : arrayList3) {
                b bVarN = EventEnvelope.EventFragment.n();
                bVarN.q((String) mmr0Var.a);
                bVarN.n((phc) mmr0Var.b);
                arrayList4.add((EventEnvelope.EventFragment) bVarN.build());
            }
            aVarO.n(arrayList4);
            aVarO.r(n700Var.c);
            aVarO.s(n700Var.d);
            arrayList2.add((EventEnvelope) aVarO.build());
        }
        mny0 mny0VarP = PublishEventsRequest.p();
        mny0VarP.n(arrayList2);
        return (PublishEventsRequest) mny0VarP.build();
    }
}
