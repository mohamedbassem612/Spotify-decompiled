package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class xsf {
    public static final Set a = f46.S0(new String[]{"tts-chat-ui:headless", "tts-chat-ui:title-and-play-button"});

    public static rxc0 a(String str) {
        String strZ0 = ihc1.Z0(str, "?");
        if (nhc1.Y(strZ0, "spotify:playlist:", false) || nhc1.Y(strZ0, "spotify:list:", false)) {
            return new rxc0(strZ0);
        }
        return null;
    }

    public static boolean b(q9f q9fVar) {
        LinkedHashMap linkedHashMap = q9fVar != null ? q9fVar.c : null;
        if (linkedHashMap == null) {
            linkedHashMap = b7x.a;
        }
        List list = q9fVar != null ? q9fVar.d : null;
        List list2 = z6x.a;
        if (list == null) {
            list = list2;
        }
        List list3 = q9fVar != null ? q9fVar.e : null;
        if (list3 != null) {
            list2 = list3;
        }
        return c(list, list2, linkedHashMap);
    }

    public static boolean c(List list, List list2, Map map) {
        Set setKeySet = map.keySet();
        boolean z = setKeySet instanceof Collection;
        Set set = a;
        if (!z || !setKeySet.isEmpty()) {
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                if (set.contains((String) it.next())) {
                    return true;
                }
            }
        }
        String str = (String) map.get("tts-chat-ui");
        if (str != null && set.contains("tts-chat-ui:".concat(str))) {
            return true;
        }
        List list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (set.contains(((ll81) it2.next()).a)) {
                    return true;
                }
            }
        }
        List<uod1> list4 = list2;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            return false;
        }
        for (uod1 uod1Var : list4) {
            if (set.contains(uod1Var.a) || set.contains(uod1Var.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String d(String str, String str2, Map map) {
        Object next;
        mf20 mf20Var = new mf20(z561.V(f46.I(new String[]{str, str2, map.get("name"), map.get("sas_list_title")})));
        do {
            if (!mf20Var.hasNext()) {
                next = null;
                break;
            }
            next = mf20Var.next();
        } while (((String) next).length() <= 0);
        String str3 = (String) next;
        return str3 == null ? "" : str3;
    }
}
