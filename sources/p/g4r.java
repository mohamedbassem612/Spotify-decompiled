package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g4r implements fq50, afo {
    public ArrayList a;

    public g4r(byte b) {
        switch (b) {
            case 4:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public static String o(g4r g4rVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = g4rVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((xgz0) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    public Object a(Object obj) {
        return (String) obj;
    }

    public b380 b(long j) {
        int iN = n(j);
        if (iN == 0) {
            w280 w280Var = b380.b;
            return bg11.e;
        }
        bfo bfoVar = (bfo) this.a.get(iN - 1);
        long j2 = bfoVar.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return bfoVar.a;
        }
        w280 w280Var2 = b380.b;
        return bg11.e;
    }

    public long c(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((bfo) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((bfo) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                bfo bfoVar = (bfo) arrayList.get(i - 1);
                long j3 = bfoVar.d;
                return (j3 == -9223372036854775807L || j3 > j) ? bfoVar.b : j3;
            }
        }
        bfo bfoVar2 = (bfo) hr80.r(arrayList);
        long j4 = bfoVar2.d;
        return (j4 == -9223372036854775807L || j < j4) ? bfoVar2.b : j4;
    }

    public void clear() {
        this.a.clear();
    }

    public long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((bfo) arrayList.get(0)).b) {
            return ((bfo) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((bfo) arrayList.get(i)).b;
            if (j < j2) {
                long j3 = ((bfo) arrayList.get(i - 1)).d;
                return (j3 == -9223372036854775807L || j3 <= j || j3 >= j2) ? j2 : j3;
            }
        }
        long j4 = ((bfo) hr80.r(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    public boolean e(bfo bfoVar, long j) {
        boolean z;
        ArrayList arrayList = this.a;
        long j2 = bfoVar.b;
        dm5.m(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = bfoVar.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((bfo) arrayList.get(size)).b) {
                arrayList.add(size + 1, bfoVar);
                return z;
            }
            if (((bfo) arrayList.get(size)).b <= j) {
                z = false;
            }
        }
        arrayList.add(0, bfoVar);
        return z;
    }

    public Iterator f() {
        return this.a.iterator();
    }

    public void g(long j) {
        ArrayList arrayList = this.a;
        int iN = n(j);
        if (iN == 0) {
            return;
        }
        long j2 = ((bfo) arrayList.get(iN - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iN--;
        }
        arrayList.subList(0, iN).clear();
    }

    public void h(List list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.a = arrayList;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.a;
        if (zIsEmpty) {
            arrayList2.addAll(list);
            return;
        }
        int size = arrayList2.size() - 1;
        sla1 sla1Var = (sla1) this.a.get(size);
        sla1 sla1Var2 = (sla1) list.get(0);
        int i = sla1Var.c;
        int i2 = sla1Var.d;
        int i3 = i + i2;
        int i4 = sla1Var2.c;
        ArrayList arrayList3 = this.a;
        if (i3 != i4) {
            arrayList3.addAll(list);
        } else {
            arrayList3.set(size, new sla1(sla1Var.a, sla1Var.b, i, i2 + sla1Var2.d));
            this.a.addAll(list.subList(1, list.size()));
        }
    }

    public void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h(((cdo0) it.next()).c());
        }
    }

    public void j(f4r f4rVar, iu30 iu30Var) {
        this.a.add(new h4r(iu30Var, f4rVar));
    }

    public f4r k() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return i13.j;
        }
        return arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
    }

    public boolean l(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((xgz0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public xgz0 m(Class cls) {
        for (xgz0 xgz0Var : this.a) {
            if (xgz0Var.getClass() == cls) {
                return xgz0Var;
            }
        }
        return null;
    }

    public int n(long j) {
        ArrayList arrayList = this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((bfo) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public g4r(List list) {
        this.a = new ArrayList(list);
    }
}
