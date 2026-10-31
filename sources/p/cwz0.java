package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cwz0 implements Parcelable {
    public static final Parcelable.Creator<cwz0> CREATOR = new erz0((byte) 6);
    public final ArrayList a;
    public final boolean b;
    public final String c;

    public cwz0(String str, ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwz0)) {
            return false;
        }
        cwz0 cwz0Var = (cwz0) obj;
        return this.a.equals(cwz0Var.a) && this.b == cwz0Var.b && u890.j(this.c, cwz0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
    }
}
