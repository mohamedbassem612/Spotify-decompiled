package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hwe1 {
    public static final Pattern a = Pattern.compile("\\b(\\d{1,2}:[0-5]\\d:[0-5]\\d|[0-5]?\\d:[0-5]\\d)(?=$|\\s|[)\\],.!?;:])");

    public static boolean a(int i, String str) {
        ArrayList arrayListB = b(i, str);
        if (arrayListB.isEmpty()) {
            return false;
        }
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            if (((fwe1) it.next()) instanceof ewe1) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList b(int i, String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = a.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                arrayList.add(new gwe1(strGroup, matcher.start(), matcher.end()));
            }
        }
        List<gwe1> listA1 = o7h.a1(arrayList, new be21((byte) 22));
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        int iA = 0;
        for (gwe1 gwe1Var : listA1) {
            if (gwe1Var.b() > iA) {
                arrayList2.add(new dwe1(str.substring(iA, gwe1Var.b())));
                iA = gwe1Var.b();
            }
            int iPow = i2;
            int i3 = iPow;
            for (Object obj : o7h.T0(ihc1.Q0(gwe1Var.c(), new String[]{":"}, i2, 6))) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                double d = iPow;
                Integer numC0 = nhc1.c0((String) obj);
                iPow = (int) ((Math.pow(60.0d, i3) * ((double) (numC0 != null ? numC0.intValue() : i2))) + d);
                i3 = i4;
                iA = iA;
                i2 = 0;
            }
            int i5 = iA;
            if (iPow < i) {
                arrayList2.add(new ewe1(iPow, ab80.n("<", ">", arrayList2.size(), gwe1Var.c()), gwe1Var.c()));
                iA = gwe1Var.a();
            } else {
                iA = i5;
            }
            i2 = 0;
        }
        if (iA < str.length()) {
            arrayList2.add(new dwe1(str.substring(iA)));
        }
        return arrayList2;
    }
}
