package p;

import android.content.res.Resources;
import com.spotify.base.java.logging.Logger;
import com.spotify.campfire.sharelist.impl.proto.SharelistGroup;
import com.spotify.campfire.sharelist.impl.proto.SharelistItem;
import com.spotify.campfire.sharelist.impl.proto.SharelistUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class l971 {
    public static final h6q0 a(SharelistUser sharelistUser, w4i1 w4i1Var) {
        return new h6q0(w4i1Var, pcf.d(6, sharelistUser.o().getHierarchyId(), (String) null), sharelistUser.p(), f(sharelistUser), c(sharelistUser), d(sharelistUser));
    }

    public static final ArrayList b(List list, w4i1 w4i1Var, Map map, Resources resources, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SharelistItem sharelistItem = (SharelistItem) it.next();
            b6q0 b6q0VarE = null;
            if (sharelistItem.hasUser()) {
                if (z && sharelistItem.o().u()) {
                    w4i1 w4i1Var2 = (w4i1) map.get(sharelistItem.o().getAgentUri());
                    if (w4i1Var2 != null) {
                        b6q0VarE = a(sharelistItem.o(), w4i1Var2);
                    }
                } else {
                    w4i1 w4i1Var3 = (w4i1) map.get(sharelistItem.o().getUsername());
                    if (w4i1Var3 != null) {
                        SharelistUser sharelistUserO = sharelistItem.o();
                        b6q0VarE = new h6q0(w4i1Var3, sharelistUserO.o().o() ? pcf.d(6, sharelistUserO.o().getHierarchyId(), (String) null) : pcf.j(sharelistUserO.getUsername()), sharelistUserO.p(), f(sharelistUserO), c(sharelistUserO), d(sharelistUserO));
                    }
                }
            } else if (sharelistItem.hasGroup()) {
                b6q0VarE = e(sharelistItem.n(), w4i1Var, map, resources);
            } else {
                Logger.d("Unknown ShareListItem type: " + sharelistItem, new Object[0]);
            }
            if (b6q0VarE != null) {
                arrayList.add(b6q0VarE);
            }
        }
        return arrayList;
    }

    public static final int c(SharelistUser sharelistUser) {
        if (sharelistUser.q() == 0) {
            return 1;
        }
        pg01 pg01Var = (pg01) o7h.q0(sharelistUser.r());
        switch (pg01Var == null ? -1 : k971.a[pg01Var.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 1;
        }
    }

    public static final int d(SharelistUser sharelistUser) {
        int i = k971.c[sharelistUser.s().ordinal()];
        if (i == -1 || i == 1 || i == 2) {
            return 3;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        eg.o();
        return 0;
    }

    public static final d6q0 e(SharelistGroup sharelistGroup, w4i1 w4i1Var, Map map, Resources resources) {
        String strK;
        String strF;
        h290 h290VarP = sharelistGroup.p();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : h290VarP) {
            if (!u890.j((String) obj, w4i1Var.a)) {
                arrayList.add(obj);
            }
        }
        if (sharelistGroup.r()) {
            strK = pcf.d(6, sharelistGroup.getHierarchyId(), (String) null);
        } else {
            int size = arrayList.size();
            if (size == 0) {
                hhg1.n("At least one username is required to create a chat");
                return null;
            }
            strK = size != 1 ? pcf.k((String) null, arrayList, (String) null) : pcf.g((String) o7h.q0(arrayList));
        }
        String str = strK;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (String str2 : arrayList) {
            w4i1 w4i1Var2 = (w4i1) map.get(str2);
            if (w4i1Var2 == null) {
                str2.getClass();
                w4i1Var2 = new w4i1(str2, str2, 12, (String) null);
            }
            arrayList2.add(w4i1Var2);
        }
        ArrayList arrayListN0 = arrayList2.size() == 1 ? o7h.N0(arrayList2, Collections.singletonList(w4i1Var)) : arrayList2;
        if (sharelistGroup.q() && sharelistGroup.o().length() > 0) {
            strF = sharelistGroup.o();
        } else if (arrayList2.size() > 1) {
            int size2 = arrayList2.size();
            if (size2 > 2) {
                size2 = 2;
            }
            strF = o7h.y0(arrayList2.subList(0, size2), ", ", (String) null, arrayList2.size() > 2 ? f4i1.c(arrayList2.size() - 2, " +") : "", s571.S0, 26);
        } else {
            strF = arrayList2.size() == 1 ? f4i1.f(resources.getString(2131959385, w4i1Var.b), ", ", ((w4i1) o7h.q0(arrayList2)).b) : resources.getString(2131959385, w4i1Var.b);
        }
        String str3 = strF;
        str3.getClass();
        return new d6q0(arrayListN0, str3, sharelistGroup.q() && sharelistGroup.o().length() > 0, str, true, 1, 1, 1);
    }

    public static final int f(SharelistUser sharelistUser) {
        switch (k971.b[sharelistUser.t().ordinal()]) {
            case -1:
            case 1:
            case 2:
                return 1;
            case 0:
            default:
                eg.o();
                return 0;
            case 3:
                return 4;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
        }
    }
}
