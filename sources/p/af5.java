package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class af5 implements CharSequence {
    public static final /* synthetic */ int e = 0;
    public final List a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    static {
        new o9x0((byte) 28);
        df41 df41Var = jf41.a;
    }

    public af5(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                ze5 ze5Var = (ze5) list.get(i);
                Object obj = ze5Var.a;
                if (obj instanceof zma1) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(ze5Var);
                } else if (obj instanceof cpr0) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(ze5Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listA1 = arrayList2 != null ? o7h.a1(arrayList2, new k0d((byte) 20)) : null;
        List list2 = listA1;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i2 = ((ze5) o7h.q0(listA1)).c;
        edn0 edn0Var = mr80.a;
        edn0 edn0Var2 = new edn0(1);
        edn0Var2.a(i2);
        int size2 = listA1.size();
        for (int i3 = 1; i3 < size2; i3++) {
            ze5 ze5Var2 = (ze5) listA1.get(i3);
            while (edn0Var2.b != 0) {
                int iD = edn0Var2.d();
                if (ze5Var2.b < iD) {
                    int i4 = ze5Var2.c;
                    if (i4 > iD) {
                        rf80.a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iD);
                        break;
                    }
                    break;
                }
                edn0Var2.e(edn0Var2.b - 1);
            }
            edn0Var2.a(ze5Var2.c);
        }
    }

    public final List a(int i) {
        List list = this.a;
        if (list == null) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            ze5 ze5Var = (ze5) obj;
            if ((ze5Var.a instanceof mjc0) && bf5.b(0, i, ze5Var.b, ze5Var.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List b() {
        ArrayList arrayList = this.c;
        return arrayList == null ? z6x.a : arrayList;
    }

    public final List c(int i, int i2, String str) {
        List list = this.a;
        if (list == null) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ze5 ze5Var = (ze5) list.get(i3);
            if ((ze5Var.a instanceof qgc1) && str.equals(ze5Var.d) && bf5.b(i, i2, ze5Var.b, ze5Var.c)) {
                arrayList.add(blo1.w(ze5Var));
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final boolean d(int i) {
        List list = this.a;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ze5 ze5Var = (ze5) list.get(i2);
                if ((ze5Var.a instanceof mjc0) && bf5.b(0, i, ze5Var.b, ze5Var.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final af5 e(af5 af5Var) {
        ye5 ye5Var = new ye5(this);
        ye5Var.h(af5Var);
        return ye5Var.p();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af5)) {
            return false;
        }
        af5 af5Var = (af5) obj;
        return u890.j(this.b, af5Var.b) && u890.j(this.a, af5Var.a);
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final af5 subSequence(int i, int i2) {
        if (!(i <= i2)) {
            rf80.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        af5 af5Var = bf5.a;
        if (i > i2) {
            rf80.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.a;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ze5 ze5Var = (ze5) list.get(i3);
                int i4 = ze5Var.b;
                int i5 = ze5Var.c;
                if (bf5.b(i, i2, i4, i5)) {
                    arrayList2.add(new ze5(Math.max(i, ze5Var.b) - i, Math.min(i2, i5) - i, ze5Var.a, ze5Var.d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new af5(arrayList, strSubstring);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public af5(String str, List list, int i) {
        this(list.isEmpty() ? null : list, str);
        af5 af5Var = bf5.a;
    }

    public /* synthetic */ af5(String str) {
        this(str, (List) z6x.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public af5(String str, List list) {
        List list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
