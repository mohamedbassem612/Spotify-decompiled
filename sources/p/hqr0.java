package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hqr0 implements Parcelable {
    public static final gqr0 CREATOR = new gqr0();
    public final qo90 a;

    public hqr0(qo90 qo90Var) {
        this.a = qo90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qo90 qo90Var = this.a;
        String str = qo90Var.a;
        mo90 mo90Var = qo90Var.i;
        parcel.writeString(str);
        Set set = qo90Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((ko90) it.next()).name());
        }
        parcel.writeStringList(arrayList);
        parcel.writeString(qo90Var.c);
        List list = qo90Var.d;
        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new kqr0((po90) it2.next()));
        }
        parcel.writeTypedList(arrayList2);
        lp90 lp90Var = qo90Var.e;
        jp90 jp90Var = lp90Var.g;
        parcel.writeString(lp90Var.a);
        parcel.writeString(lp90Var.b);
        parcel.writeString(ab80.s(lp90Var.c));
        parcel.writeString(ab80.t(lp90Var.d));
        parcel.writeByte(lp90Var.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(jp90Var.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(jp90Var.b ? (byte) 1 : (byte) 0);
        kp90 kp90Var = jp90Var.c;
        parcel.writeString(kp90Var != null ? kp90Var.a : null);
        List list2 = qo90Var.f;
        ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new sqr0((no90) it3.next()));
        }
        parcel.writeTypedList(arrayList3);
        parcel.writeByte(qo90Var.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(mo90Var.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(mo90Var.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(mo90Var.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(mo90Var.d ? (byte) 1 : (byte) 0);
    }
}
