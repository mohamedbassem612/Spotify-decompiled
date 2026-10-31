package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gqr0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        String string = parcel.readString();
        string.getClass();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        arrayListCreateStringArrayList.getClass();
        ArrayList arrayList = new ArrayList(q7h.U(arrayListCreateStringArrayList, 10));
        for (String str : arrayListCreateStringArrayList) {
            str.getClass();
            arrayList.add(ko90.valueOf(str));
        }
        Set setP1 = o7h.p1(arrayList);
        String string2 = parcel.readString();
        string2.getClass();
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(iqr0.a);
        arrayListCreateTypedArrayList.getClass();
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayListCreateTypedArrayList, 10));
        Iterator it = arrayListCreateTypedArrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((kqr0) it.next()).a);
        }
        yqr0.CREATOR.getClass();
        lp90 lp90Var = xqr0.a(parcel).a;
        ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(iqr0.b);
        arrayListCreateTypedArrayList2.getClass();
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayListCreateTypedArrayList2, 10));
        Iterator it2 = arrayListCreateTypedArrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((sqr0) it2.next()).a);
        }
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z2 = true;
            z = true;
        } else {
            z = true;
        }
        return new hqr0(new qo90(string, setP1, string2, arrayList2, lp90Var, arrayList3, z2, new mo90(parcel.readByte() != 0 ? z : z2, parcel.readByte() != 0 ? z : z2, parcel.readByte() != 0 ? z : z2, parcel.readByte() != 0 ? z : false)));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new hqr0[i];
    }
}
