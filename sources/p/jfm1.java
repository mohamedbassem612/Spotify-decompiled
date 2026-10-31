package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jfm1 implements Parcelable {
    public static final Parcelable.Creator<jfm1> CREATOR;
    public final String a;
    public final boolean b;
    public final List c;

    static {
        idd1 idd1Var = o571.c;
        CREATOR = new w8m1((byte) 29);
    }

    public jfm1(String str, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = z;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfm1)) {
            return false;
        }
        jfm1 jfm1Var = (jfm1) obj;
        return u890.j(this.a, jfm1Var.a) && this.b == jfm1Var.b && u890.j(this.c, jfm1Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return iG + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        List list = this.c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ffm1) it.next()).writeToParcel(parcel, i);
        }
    }
}
