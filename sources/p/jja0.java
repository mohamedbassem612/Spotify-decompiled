package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jja0 implements zjn0 {
    public static final List d;
    public final String[] a;
    public final Set b;
    public final ArrayList c;

    static {
        String strY0 = o7h.y0(p7h.M(new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", (String) null, (String) null, (iu30) null, 62);
        List listM = p7h.M(new String[]{strY0.concat("/Any"), strY0.concat("/Nothing"), strY0.concat("/Unit"), strY0.concat("/Throwable"), strY0.concat("/Number"), strY0.concat("/Byte"), strY0.concat("/Double"), strY0.concat("/Float"), strY0.concat("/Int"), strY0.concat("/Long"), strY0.concat("/Short"), strY0.concat("/Boolean"), strY0.concat("/Char"), strY0.concat("/CharSequence"), strY0.concat("/String"), strY0.concat("/Comparable"), strY0.concat("/Enum"), strY0.concat("/Array"), strY0.concat("/ByteArray"), strY0.concat("/DoubleArray"), strY0.concat("/FloatArray"), strY0.concat("/IntArray"), strY0.concat("/LongArray"), strY0.concat("/ShortArray"), strY0.concat("/BooleanArray"), strY0.concat("/CharArray"), strY0.concat("/Cloneable"), strY0.concat("/Annotation"), strY0.concat("/collections/Iterable"), strY0.concat("/collections/MutableIterable"), strY0.concat("/collections/Collection"), strY0.concat("/collections/MutableCollection"), strY0.concat("/collections/List"), strY0.concat("/collections/MutableList"), strY0.concat("/collections/Set"), strY0.concat("/collections/MutableSet"), strY0.concat("/collections/Map"), strY0.concat("/collections/MutableMap"), strY0.concat("/collections/Map.Entry"), strY0.concat("/collections/MutableMap.MutableEntry"), strY0.concat("/collections/Iterator"), strY0.concat("/collections/MutableIterator"), strY0.concat("/collections/ListIterator"), strY0.concat("/collections/MutableListIterator")});
        d = listM;
        ba80 ba80VarU1 = o7h.u1(listM);
        int iS = zno1.s(q7h.U(ba80VarU1, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        ca80 it = ba80VarU1.iterator();
        while (true) {
            ca80 ca80Var = it;
            if (!((Iterator) ca80Var.c).hasNext()) {
                return;
            }
            aa80 aa80Var = (aa80) ca80Var.next();
            linkedHashMap.put((String) aa80Var.b, Integer.valueOf(aa80Var.a));
        }
    }

    public jja0(dka0 dka0Var, String[] strArr) {
        List list = dka0Var.c;
        w7x w7xVarP1 = list.isEmpty() ? w7x.a : o7h.p1(list);
        List<cka0> list2 = dka0Var.b;
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (cka0 cka0Var : list2) {
            int i = cka0Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(cka0Var);
            }
        }
        arrayList.trimToSize();
        this.a = strArr;
        this.b = w7xVarP1;
        this.c = arrayList;
    }

    public final boolean a(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    public final String b(int i) {
        return getString(i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    public final String getString(int i) {
        String strReplace;
        cka0 cka0Var = (cka0) this.c.get(i);
        int i2 = cka0Var.b;
        if ((i2 & 4) == 4) {
            Object obj = cka0Var.e;
            if (obj instanceof String) {
                strReplace = (String) obj;
            } else {
                qhc qhcVar = (qhc) obj;
                String strQ = qhcVar.q();
                if (qhcVar.k()) {
                    cka0Var.e = strQ;
                }
                strReplace = strQ;
            }
        } else if ((i2 & 2) == 2) {
            List list = d;
            int size = list.size();
            int i3 = cka0Var.d;
            if (i3 < 0 || i3 >= size) {
                strReplace = this.a[i];
            } else {
                strReplace = (String) list.get(i3);
            }
        } else {
            strReplace = this.a[i];
        }
        if (cka0Var.g.size() >= 2) {
            List list2 = cka0Var.g;
            list2.getClass();
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strReplace.length()) {
                strReplace = strReplace.substring(num.intValue(), num2.intValue());
            }
        }
        if (cka0Var.i.size() >= 2) {
            List list3 = cka0Var.i;
            list3.getClass();
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            strReplace.getClass();
            strReplace = strReplace.replace((char) num3.intValue(), (char) num4.intValue());
        }
        bka0 bka0Var = cka0Var.f;
        if (bka0Var == null) {
            bka0Var = bka0.NONE;
        }
        int iOrdinal = bka0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                strReplace.getClass();
                strReplace = strReplace.replace('$', '.');
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                if (strReplace.length() >= 2) {
                    strReplace = cy30.h(1, 1, strReplace);
                }
                strReplace = strReplace.replace('$', '.');
            }
        }
        strReplace.getClass();
        return strReplace;
    }
}
