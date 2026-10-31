package p;

import android.util.SparseIntArray;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oxo1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public oxo1(b4e b4eVar) {
        this.a = (byte) 1;
        Objects.requireNonNull(b4eVar);
        this.b = b4eVar;
    }

    public void e(String str, long j, int i, long j2, long j3) {
        switch (this.a) {
            case 1:
                utw0 utw0Var = ((b4e) this.b).l;
                if (utw0Var != null) {
                    nbn1 nbn1VarA = ((e821) utw0Var.a).A();
                    vvn1 vvn1Var = new vvn1(str);
                    vvn1Var.b = j;
                    vvn1Var.c = i;
                    vvn1Var.d = j2;
                    vvn1Var.e = j3;
                    zvn1 zvn1Var = new zvn1(vvn1Var);
                    zvn1Var.f = nbn1VarA.h;
                    nbn1VarA.d.add(zvn1Var);
                }
                break;
        }
    }

    public void g(int[] iArr) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                koh0 koh0Var = (koh0) this.b;
                ArrayList arrayListE = o4e.e(iArr);
                if (!((ArrayList) koh0Var.d).equals(arrayListE)) {
                    koh0Var.h();
                    ((xoa) koh0Var.f).evictAll();
                    ((ArrayList) koh0Var.g).clear();
                    koh0Var.d = arrayListE;
                    koh0Var.f();
                    koh0Var.j();
                    koh0Var.i();
                    break;
                }
                break;
        }
    }

    public void i(int[] iArr, int i) {
        int size;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                koh0 koh0Var = (koh0) this.b;
                if (i == 0) {
                    size = ((ArrayList) koh0Var.d).size();
                } else {
                    size = ((SparseIntArray) koh0Var.e).get(i, -1);
                    if (size == -1) {
                        koh0Var.e();
                        return;
                    }
                }
                koh0 koh0Var2 = (koh0) this.b;
                koh0Var2.h();
                ((ArrayList) koh0Var2.d).addAll(size, o4e.e(iArr));
                koh0Var2.f();
                Set set = (Set) koh0Var2.m;
                synchronized (set) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                koh0Var2.i();
                return;
            default:
                return;
        }
    }

    public void k(int[] iArr) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                koh0 koh0Var = (koh0) this.b;
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    ((xoa) koh0Var.f).remove(Integer.valueOf(i));
                    int i2 = ((SparseIntArray) koh0Var.e).get(i, -1);
                    if (i2 == -1) {
                        koh0Var.e();
                    } else {
                        arrayList.add(Integer.valueOf(i2));
                    }
                    break;
                }
                Collections.sort(arrayList);
                koh0Var.h();
                o4e.d(arrayList);
                koh0Var.k();
                koh0Var.i();
                break;
        }
    }

    public void m(int[] iArr) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    koh0 koh0Var = (koh0) this.b;
                    ((xoa) koh0Var.f).remove(Integer.valueOf(i));
                    SparseIntArray sparseIntArray = (SparseIntArray) koh0Var.e;
                    int i2 = sparseIntArray.get(i, -1);
                    if (i2 == -1) {
                        koh0Var.e();
                        return;
                    } else {
                        sparseIntArray.delete(i);
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                koh0 koh0Var2 = (koh0) this.b;
                koh0Var2.h();
                ((ArrayList) koh0Var2.d).removeAll(o4e.e(iArr));
                koh0Var2.f();
                o4e.d(arrayList);
                Set set = (Set) koh0Var2.m;
                synchronized (set) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                koh0Var2.i();
                return;
            default:
                return;
        }
    }

    public void o(quh0[] quh0VarArr) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                HashSet hashSet = new HashSet();
                koh0 koh0Var = (koh0) this.b;
                ArrayList arrayList = (ArrayList) koh0Var.g;
                SparseIntArray sparseIntArray = (SparseIntArray) koh0Var.e;
                arrayList.clear();
                for (quh0 quh0Var : quh0VarArr) {
                    int i = quh0Var.b;
                    ((xoa) koh0Var.f).put(Integer.valueOf(i), quh0Var);
                    int i2 = sparseIntArray.get(i, -1);
                    if (i2 == -1) {
                        koh0Var.e();
                    } else {
                        hashSet.add(Integer.valueOf(i2));
                    }
                    break;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i3 = sparseIntArray.get(((Integer) it.next()).intValue(), -1);
                    if (i3 != -1) {
                        hashSet.add(Integer.valueOf(i3));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                koh0Var.h();
                o4e.d(arrayList2);
                koh0Var.k();
                koh0Var.i();
                break;
        }
    }

    public void q(ArrayList arrayList, ArrayList arrayList2, int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ArrayList arrayList3 = new ArrayList();
                if (i == 0) {
                    ((ArrayList) ((koh0) this.b).d).size();
                } else {
                    boolean zIsEmpty = arrayList2.isEmpty();
                    koh0 koh0Var = (koh0) this.b;
                    if (zIsEmpty) {
                        ((pue0) koh0Var.b).c("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
                    } else {
                        SparseIntArray sparseIntArray = (SparseIntArray) koh0Var.e;
                        if (sparseIntArray.get(i, -1) == -1) {
                            sparseIntArray.get(((Integer) arrayList2.get(0)).intValue(), -1);
                        }
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    koh0 koh0Var2 = (koh0) this.b;
                    int i2 = ((SparseIntArray) koh0Var2.e).get(iIntValue, -1);
                    if (i2 == -1) {
                        koh0Var2.e();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i2));
                }
                koh0 koh0Var3 = (koh0) this.b;
                koh0Var3.h();
                koh0Var3.d = arrayList;
                koh0Var3.f();
                Set set = (Set) koh0Var3.m;
                synchronized (set) {
                    Iterator it2 = set.iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                koh0Var3.i();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ oxo1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void s() {
    }

    public final void h(int[] iArr) {
    }

    public final void l(int[] iArr) {
    }

    public final void n(int[] iArr) {
    }

    public final void p(quh0[] quh0VarArr) {
    }

    public final void j(int i, int[] iArr) {
    }

    public final void r(ArrayList arrayList, ArrayList arrayList2, int i) {
    }

    public final void f(String str, long j, int i, long j2, long j3) {
    }
}
