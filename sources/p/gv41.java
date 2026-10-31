package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gv41 {
    public static final gv41 a = new gv41();

    public static sgt0 a(String str, String str2, Long l, ijg1 ijg1Var, List list, String str3) {
        String str4 = str2 == null ? str : str2;
        if (str2 == null) {
            str = null;
        }
        kgt0 kgt0Var = new kgt0(l, str4, str);
        if (ijg1Var != ijg1.c || str3 == null || ihc1.y0(str3) || list.size() < 2) {
            return kgt0Var;
        }
        int i = 0;
        Iterator it = list.subList(0, list.size() - 1).iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (u890.j((String) it.next(), str3)) {
                break;
            }
            i++;
        }
        return new ogt0(str4, (String) list.get(i >= 0 ? 1 + i : 1));
    }
}
