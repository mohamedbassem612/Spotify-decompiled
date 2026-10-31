package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v360 implements Iterable, ola0 {
    public static final v360 b = new v360(new String[0]);
    public final String[] a;

    public v360(String[] strArr) {
        this.a = strArr;
    }

    public final long b() {
        String[] strArr = this.a;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += (long) str.length();
        }
        return length;
    }

    public final String c(String str) {
        String[] strArr = this.a;
        int length = strArr.length - 2;
        int iA = bmq0.A(length, 0, -2);
        if (iA > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iA) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final TreeMap d() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String lowerCase = m5n1.h(this, i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m5n1.j(this, i));
        }
        return treeMap;
    }

    public final List e(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(m5n1.h(this, i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m5n1.j(this, i));
            }
        }
        List listUnmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : null;
        return listUnmodifiableList == null ? z6x.a : listUnmodifiableList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v360) {
            return Arrays.equals(this.a, ((v360) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        mmr0[] mmr0VarArr = new mmr0[size];
        for (int i = 0; i < size; i++) {
            mmr0VarArr[i] = oqn1.n(m5n1.h(this, i), m5n1.j(this, i));
        }
        return new d7(mmr0VarArr, (byte) 1);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strH = m5n1.h(this, i);
            String strJ = m5n1.j(this, i);
            sb.append(strH);
            sb.append(": ");
            if (w4n1.l(strH)) {
                strJ = "██";
            }
            sb.append(strJ);
            sb.append("\n");
        }
        return sb.toString();
    }
}
