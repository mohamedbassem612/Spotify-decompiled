package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tu1 implements Parcelable {
    public static final Parcelable.Creator<tu1> CREATOR = new d41(21);
    public final List a;
    public final long b;
    public final boolean c;

    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[LOOP:0: B:20:0x005f->B:22:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public tu1(long j, List list) {
        boolean z;
        ArrayList arrayList;
        Iterator it;
        List list2;
        Iterator it2;
        long j2;
        this.a = list;
        this.b = j;
        su1 su1Var = (su1) o7h.s0(list);
        vo1 vo1Var = su1Var != null ? su1Var.b : null;
        qn31 qn31Var = qn31.a;
        if (u890.j(vo1Var, qn31Var)) {
            z = true;
            List listK0 = o7h.k0(list, 1);
            if ((listK0 instanceof Collection) && listK0.isEmpty()) {
                List list3 = this.a;
                arrayList = new ArrayList(q7h.U(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((su1) it.next()).a));
                }
                if (o7h.j0(arrayList).size() == this.a.size()) {
                    list2 = this.a;
                    if (list2 instanceof Collection) {
                        it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                j2 = ((su1) it2.next()).a;
                                if (j2 >= 0) {
                                }
                            } else if (this.b >= Long.MAX_VALUE) {
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                j2 = ((su1) it2.next()).a;
                                if (j2 >= 0) {
                                }
                            } else if (this.b >= Long.MAX_VALUE) {
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
            } else {
                Iterator it3 = listK0.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        List list4 = this.a;
                        arrayList = new ArrayList(q7h.U(list4, 10));
                        it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Long.valueOf(((su1) it.next()).a));
                        }
                        if (o7h.j0(arrayList).size() == this.a.size()) {
                            list2 = this.a;
                            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        j2 = ((su1) it2.next()).a;
                                        if (j2 >= 0 || j2 >= this.b) {
                                        }
                                    } else if (this.b >= Long.MAX_VALUE) {
                                    }
                                }
                            } else if (this.b >= Long.MAX_VALUE) {
                            }
                        }
                    } else if (u890.j(((su1) it3.next()).b, qn31Var)) {
                    }
                    z = false;
                }
            }
        } else {
            z = false;
        }
        this.c = z;
    }

    public final su1 a() {
        return (su1) o7h.A0(b());
    }

    public final List b() {
        return this.c ? this.a : Collections.singletonList(new su1(0L, qn31.a));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu1)) {
            return false;
        }
        tu1 tu1Var = (tu1) obj;
        return u890.j(this.a, tu1Var.a) && this.b == tu1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((su1) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeLong(this.b);
    }

    public tu1() {
        this(1L, Collections.singletonList(new su1(0L, qn31.a)));
    }
}
