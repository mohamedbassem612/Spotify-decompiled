package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class kwu0 {
    public static final List a = p7h.M(new mmr0[]{new mmr0(1000L, "K"), new mmr0(1000000L, "M"), new mmr0(1000000000L, "B")});

    public static final String a(long j) {
        int iNextIndex;
        StringBuilder sb;
        String string;
        long jAbs = Math.abs(j);
        String str = j < 0 ? "-" : "";
        if (jAbs < 1000) {
            string = String.valueOf(jAbs);
        } else {
            List list = a;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                if (jAbs >= ((Number) ((mmr0) listIterator.previous()).a).longValue()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            mmr0 mmr0Var = (mmr0) list.get(iNextIndex);
            long jLongValue = ((Number) mmr0Var.a).longValue();
            String str2 = (String) mmr0Var.b;
            long jA0 = jch0.a0((jAbs / jLongValue) * 10.0d);
            if (jA0 < 10000 || iNextIndex >= p7h.L(list)) {
                long j2 = jA0 / 10;
                long j3 = jA0 % 10;
                if (j3 == 0) {
                    sb = new StringBuilder();
                    sb.append(j2);
                } else {
                    sb = new StringBuilder();
                    sb.append(j2);
                    sb.append(".");
                    sb.append(j3);
                }
                sb.append(str2);
                string = sb.toString();
            } else {
                string = gvg.g(((mmr0) list.get(iNextIndex + 1)).b, "1");
            }
        }
        return l1d.m(str, string);
    }

    public static final lqj0 b(gwu0 gwu0Var, int i, iu30 iu30Var) {
        List list = gwu0Var.a;
        ArrayList<fwu0> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((fwu0) obj).b == i) {
                arrayList.add(obj);
            }
        }
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (fwu0 fwu0Var : arrayList) {
            linkedHashMap.put(fwu0Var.c, Long.valueOf(fwu0Var.a));
        }
        Long l = (Long) linkedHashMap.get(ewu0.a);
        long jLongValue = ((Number) iu30Var.invoke(Long.valueOf(l != null ? l.longValue() : 0L))).longValue();
        Long l2 = (Long) linkedHashMap.get(ewu0.b);
        return new lqj0(jLongValue, ((Number) iu30Var.invoke(Long.valueOf(l2 != null ? l2.longValue() : 0L))).longValue());
    }
}
