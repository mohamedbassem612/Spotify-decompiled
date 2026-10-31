package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.listuxplatform.datasourceimpl.ListDataSourceImpl$UnknownErrorException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z8b0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8b0() {
        super(1);
        this.a = (byte) 24;
    }

    public final Object invoke(Object obj) {
        List list;
        ArrayList arrayList;
        qmh0 qmh0Var;
        qmh0 qmh0Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qmh0 qmh0Var3 = null;
        switch (b) {
            case 0:
                return d9b0.a((lm01) obj);
            case 1:
                return d9b0.a((lm01) obj);
            case 2:
                return d9b0.a((lm01) obj);
            case 3:
                return d9b0.a((lm01) obj);
            case 4:
                return d9b0.a((lm01) obj);
            case 5:
                return d9b0.a((lm01) obj);
            case 6:
                return d9b0.a((lm01) obj);
            case 7:
                return d9b0.a((lm01) obj);
            case 8:
                return d9b0.a((lm01) obj);
            case 9:
                return d9b0.a((lm01) obj);
            case 10:
                throw td6.k(obj);
            case 11:
                jy21 jy21Var = (jy21) obj;
                if (roc0.b(jy21Var)) {
                    return new huz(new otl1(), (byte) 10);
                }
                throw new ListDataSourceImpl$UnknownErrorException(jy21Var.b());
            case 12:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    String str = ((pvc0) it.next()).c;
                    if (ihc1.y0(str)) {
                        str = null;
                    }
                    if (str != null) {
                        return str;
                    }
                }
                return null;
            case 13:
                String str2 = (String) ((qxc0) obj).X.get("artistUris");
                if (str2 != null) {
                    return (String) o7h.s0(o7h.j0(ihc1.Q0(str2, new String[]{","}, 0, 6)));
                }
                return null;
            case 14:
                return mno1.h(new mmr0[]{new mmr0("share.asset", (Parcelable) obj)});
            case 15:
                return (Parcelable) jhc1.t((Bundle) obj, "share.asset", rnf0.class);
            case 16:
                throw null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                pmh0 pmh0Var = (pmh0) obj;
                boolean z = pmh0Var.d;
                ppl pplVar = pmh0Var.c;
                boolean z2 = pplVar.c;
                List<opl> list2 = pplVar.b;
                String str3 = pmh0Var.e.b;
                if (wmh0.e(pmh0Var)) {
                    arrayList = new ArrayList();
                    for (opl oplVar : list2) {
                        mg31 mg31Var = oplVar.c;
                        if (mg31Var != null) {
                            String str4 = mg31Var.b;
                            String str5 = mg31Var.a;
                            if (str5.length() == 0) {
                                str5 = mg31Var.b;
                            }
                            qmh0Var = qmh0Var3;
                            qmh0Var2 = new qmh0(str4, str5, oplVar.b, mg31Var.c, mg31Var.d, mg31Var.f, mg31Var.g);
                        } else {
                            qmh0Var = qmh0Var3;
                            qmh0Var2 = qmh0Var;
                        }
                        if (qmh0Var2 != null) {
                            arrayList.add(qmh0Var2);
                        }
                        qmh0Var3 = qmh0Var;
                        list2 = list2;
                    }
                    list = list2;
                } else {
                    list = list2;
                    arrayList = z6x.a;
                }
                return new smh0(z, z2, !pplVar.c ? list.size() : 0, str3, arrayList, wmh0.e(pmh0Var) ? rmh0.d : rmh0.a);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((View) obj).setTag(2131427776, Boolean.TRUE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ubw0 ubw0Var = (ubw0) obj;
                return new et90(ubw0Var, ubw0Var, ubw0Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return null;
            case 22:
                return null;
            case 23:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                d441 d441VarG1 = ((y341) obj).g1("DELETE FROM messages");
                try {
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 25:
                return Collections.singletonMap(rih1Var, Collections.singleton((String) obj));
            case 26:
                return new gmj0(lmj0.f(new gd91(true, (fy50) null, false, (afv0) null, false, false, (d2k1) null, (k4m) null, (jfv) null, (Long) null, false, false, false, (String) null, "", "", false), (fmj0) obj));
            case 27:
                List listSingletonList = Collections.singletonList(((fmj0) obj).a);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listSingletonList) {
                    if (!lmj0.g((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            case 28:
                List listSingletonList2 = Collections.singletonList(((fmj0) obj).a);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listSingletonList2) {
                    if (lmj0.g((String) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            default:
                String str6 = (String) obj;
                Set set = s4b1.f;
                if (uic.g(str6, blc0.M3)) {
                    return str6;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8b0(int i, byte b) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8b0(Object obj, byte b) {
        super(1);
        this.a = b;
    }
}
