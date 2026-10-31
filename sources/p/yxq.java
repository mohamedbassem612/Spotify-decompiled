package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionStatus;
import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class yxq implements Update {
    public final Next a(Object obj, Object obj2) {
        ayq ayqVar = (ayq) obj;
        txq txqVar = (uxq) obj2;
        if (txqVar instanceof txq) {
            return Next.a(Collections.singleton(new bxq(txqVar.a)));
        }
        if (txqVar instanceof rxq) {
            List<b2r> list = ayqVar.a;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (b2r b2rVar : list) {
                DataSectionType dataSectionType = b2rVar.a;
                DataSectionType dataSectionType2 = b2rVar.a;
                if (dataSectionType == ((rxq) txqVar).a) {
                    DataSectionStatus dataSectionStatus = b2rVar.b;
                    e2r e2rVar = e2r.a;
                    if (u890.j(dataSectionStatus, e2rVar)) {
                        b2rVar = new b2r(dataSectionType2, f2r.a);
                    } else {
                        if (!u890.j(dataSectionStatus, f2r.a)) {
                            hhg1.o(ayqVar, "Unexpected event for state: ");
                            return null;
                        }
                        b2rVar = new b2r(dataSectionType2, e2rVar);
                    }
                }
                arrayList.add(b2rVar);
            }
            return Next.h(ayq.a(ayqVar, arrayList, false, false, false, false, false, 62));
        }
        if (txqVar.equals(oxq.d)) {
            return p9w.o(ayqVar);
        }
        if (txqVar.equals(oxq.f)) {
            return Next.h(ayq.a(ayqVar, (List) null, false, false, false, false, true, 23));
        }
        if (txqVar.equals(oxq.e)) {
            return Next.h(ayq.a(ayqVar, (List) null, false, false, false, true, false, 39));
        }
        if (txqVar.equals(oxq.i)) {
            return p9w.o(ayqVar);
        }
        if (txqVar.equals(oxq.j)) {
            return Next.h(ayq.a(ayqVar, (List) null, false, false, false, false, false, 39));
        }
        if (txqVar.equals(oxq.a)) {
            return p9w.m(ayqVar);
        }
        if (txqVar instanceof qxq) {
            return Next.a(Collections.singleton(new axq(((qxq) txqVar).a)));
        }
        if (txqVar instanceof pxq) {
            return Next.a(Collections.singleton(new zwq(((pxq) txqVar).a)));
        }
        if (txqVar.equals(oxq.c)) {
            return Next.h(ayq.a(ayqVar, (List) null, false, true, false, false, false, 57));
        }
        if (txqVar instanceof sxq) {
            return Next.h(ayq.a(ayqVar, ((sxq) txqVar).a, false, false, false, false, false, 56));
        }
        if (txqVar.equals(oxq.g)) {
            return p9w.m(ayqVar);
        }
        if (txqVar.equals(oxq.h)) {
            return Next.h(ayq.a(ayqVar, (List) null, false, false, false, false, false, 57));
        }
        if (txqVar.equals(oxq.b)) {
            return p9w.m(ayqVar);
        }
        eg.o();
        return null;
    }
}
