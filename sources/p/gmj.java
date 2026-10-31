package p;

import android.content.Context;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gmj extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gmj(byte b, Object obj, iu30 iu30Var) {
        super(0);
        this.a = b;
        this.c = obj;
        this.b = iu30Var;
    }

    public final Object invoke() {
        String str;
        boolean z = false;
        gbk gbkVar = null;
        switch (this.a) {
            case 0:
                ((iu30) this.b).invoke(new b9d1(((c9d1) this.c).b));
                return rih1.a;
            case 1:
                ((iu30) this.b).invoke(((bgh1) this.c).b ? agh1.b : agh1.a);
                return rih1.a;
            case 2:
                ((iu30) this.b).invoke(new fth1(((jth1) this.c).d));
                return rih1.a;
            case 3:
                if (((o2k1) ((q2k1) this.c)).b) {
                    ((iu30) this.b).invoke(m2k1.a);
                }
                return rih1.a;
            case 4:
                aom1 aom1Var = (aom1) this.c;
                gbk gbkVar2 = mnm1.a;
                if (aom1Var instanceof rnm1) {
                    gbkVar = nnm1.a;
                } else if (aom1Var instanceof unm1) {
                    gbkVar = onm1.a;
                } else if ((aom1Var instanceof snm1) || (aom1Var instanceof tnm1) || (aom1Var instanceof vnm1)) {
                    gbkVar = gbkVar2;
                }
                if (gbkVar != null) {
                    ((iu30) this.b).invoke(gbkVar);
                }
                return rih1.a;
            case 5:
                ((fad0) this.b).j(st80.f);
                ((ven0) this.c).setValue((Object) null);
                return rih1.a;
            case 6:
                ((iu30) this.b).invoke(new y8k(((a9k) this.c).a));
                return rih1.a;
            case 7:
                k9k k9kVar = (k9k) this.b;
                fn31.T(cto1.q((iac0) k9kVar.f), (o8n) null, 0, new bag(k9kVar, (nak) this.c, (lnm) null, (byte) 24), 3);
                return rih1.a;
            case 8:
                iu30 iu30Var = (iu30) this.b;
                if (iu30Var != null) {
                    iu30Var.invoke((gbk) this.c);
                }
                return rih1.a;
            case 9:
                rak rakVar = (rak) this.b;
                tob1 tob1Var = (tob1) this.c;
                xbk xbkVar = (xbk) tob1Var.getValue();
                boolean z2 = ((xbk) tob1Var.getValue()).q;
                puh puhVar = new puh(rakVar, tob1Var, (byte) 27);
                x9r x9rVar = xbkVar.m;
                gbk gbkVar3 = x9rVar != null ? new gbk(x9rVar.a, x9rVar.b) : null;
                dtw dtwVar = rakVar.Z;
                nbk nbkVar = xbkVar.b;
                dtwVar.f(new nbk(nbkVar.a, nbkVar.b, nbkVar.c, nbkVar.d, nbkVar.e, gbkVar3, rakVar.X, new d1c(xbkVar, rakVar, gbkVar3, (byte) 25), puhVar, false, z2));
                return rih1.a;
            case 10:
                ((iu30) this.b).invoke(new kbk(((obk) this.c).e));
                return rih1.a;
            case 11:
                iu30 iu30Var2 = ((nbk) this.b).g;
                if (iu30Var2 != null) {
                    iu30Var2.invoke((gbk) this.c);
                }
                return rih1.a;
            case 12:
                ((iu30) this.b).invoke(new aek(((yqg) ((qj0) this.c).e).b()));
                return rih1.a;
            case 13:
                ((iu30) this.b).invoke(new qnk(((gok) this.c).b));
                return rih1.a;
            case 14:
                if (((List) this.b).size() > 1) {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            case 15:
                return new kpg0((cx0) this.b, new ork((Context) this.c, (byte) 0));
            case 16:
                if (((wtk) this.c).b != xtk.b) {
                    ((iu30) this.b).invoke(vtk.a);
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((iu30) this.b).invoke(Boolean.valueOf(!((cdl) this.c).a));
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                hnl hnlVar = (hnl) this.c;
                if (((pqq0) this.b) == pqq0.b && !hnlVar.h() && !hnlVar.e.isInMultiWindowMode()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hnl hnlVar2 = (hnl) this.c;
                if (((pqq0) this.b) == pqq0.b && !hnlVar2.i() && !hnlVar2.e.isInMultiWindowMode()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hnl hnlVar3 = (hnl) this.c;
                if (((pqq0) this.b) == pqq0.b && !hnlVar3.g() && !hnlVar3.e.isInMultiWindowMode()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((iu30) this.b).invoke(new n0m((wol) this.c));
                return rih1.a;
            case 22:
                bpb1 bpb1Var = ((p1m) this.b).d;
                ro41 ro41Var = (ro41) this.c;
                ro41Var.getClass();
                bpb1Var.m((Object) null, ro41Var);
                return rih1.a;
            case 23:
                ((iu30) this.b).invoke(new g2m((hby) this.c));
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ks3 ks3Var = ((s3m) this.b).b;
                ks3Var.k = (ro41) ((tob1) this.c).getValue();
                ks3Var.l = ((ls3) ks3Var.d.getValue()).b.a;
                return rih1.a;
            case 25:
                ((ven0) this.c).setValue((Object) null);
                ((s3m) this.b).c.a(yzl.a);
                return rih1.a;
            case 26:
                return (l7c1) o7h.t0(((err0) ((jkr0) ((kes) this.c)).d.c).s(), (List) this.b);
            case 27:
                Function0 function0 = ((j8m) this.c).i;
                if (function0 != null) {
                    function0.invoke();
                }
                ((iu30) this.b).invoke(i8m.a);
                return rih1.a;
            case 28:
                vrv0 vrv0Var = ((ohm) this.c).c;
                if (vrv0Var != null) {
                    vrv0Var.m();
                }
                ((iu30) this.b).invoke(mhm.a);
                return rih1.a;
            default:
                List list = (List) this.c;
                xhm xhmVar = (xhm) this.b;
                kng1 kng1Var = (kng1) xhmVar.k.b.a.getValue();
                if (kng1Var instanceof ing1) {
                    str = ((ing1) kng1Var).a;
                } else {
                    if (!(kng1Var instanceof jng1)) {
                        eg.o();
                        return null;
                    }
                    str = (String) xhmVar.j.e.getValue();
                }
                if (str == null) {
                    return null;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((cdz) it.next()).b);
                }
                String strR = a6o1.r(str, arrayList);
                if (strR == null) {
                    return null;
                }
                cdz cdzVar = (cdz) o7h.s0(list);
                if (strR.equalsIgnoreCase(cdzVar != null ? cdzVar.b : null)) {
                    return null;
                }
                return strR;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gmj(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
