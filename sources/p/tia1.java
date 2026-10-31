package p;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class tia1 {
    public static final Set a = f46.S0(new String[]{"addTime", "publishDate", "number", "rowId", "frecencyScore"});

    public static void a(StringBuilder sb, nia1 nia1Var, int i) {
        nia1 nia1Var2 = nia1Var.c;
        boolean z = nia1Var.b;
        String str = nia1Var.a;
        if (a.contains(str)) {
            z = !z;
        }
        ArrayList arrayList = new ArrayList(ihc1.Q0(str, new String[]{"_"}, 0, 6));
        int size = arrayList.size();
        for (int i2 = 1; i2 < size; i2++) {
            String str2 = (String) arrayList.get(i2);
            arrayList.set(i2, str2.substring(0, 1).toUpperCase(Locale.US).concat(str2.substring(1)));
        }
        String strY0 = o7h.y0(arrayList, "", (String) null, (String) null, (iu30) null, 62);
        sb.append(strY0);
        if (z && strY0.length() > 0) {
            sb.append(" DESC");
        }
        if (5 <= i || nia1Var2 == null) {
            return;
        }
        sb.append(',');
        a(sb, nia1Var2, i + 1);
    }

    public static final String b(nia1 nia1Var) {
        StringBuilder sb = new StringBuilder(50);
        a(sb, nia1Var, 0);
        return sb.toString();
    }
}
