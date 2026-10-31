package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class acf implements Parcelable {
    public static final Parcelable.Creator<acf> CREATOR;
    public final List a;
    public final boolean b;
    public final List c;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
        CREATOR = new zbf((byte) 0);
    }

    public /* synthetic */ acf(int i, List list, List list2) {
        this(list, (i & 4) != 0 ? z6x.a : list2, false);
    }

    public static acf a(acf acfVar, ArrayList arrayList, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = acfVar.a;
        }
        boolean z = (i & 2) != 0 ? acfVar.b : true;
        List list2 = (i & 4) != 0 ? acfVar.c : z6x.a;
        acfVar.getClass();
        return new acf(list, list2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acf)) {
            return false;
        }
        acf acfVar = (acf) obj;
        return u890.j(this.a, acfVar.a) && this.b == acfVar.b && u890.j(this.c, acfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.b ? 1 : 0);
        Iterator itM2 = kk0.m(parcel, this.c);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
    }

    public acf(List list, List list2, boolean z) {
        this.a = list;
        this.b = z;
        this.c = list2;
    }
}
