package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sk01 implements xk01 {
    public static final Parcelable.Creator<sk01> CREATOR = new sj01((byte) 7);
    public final ArrayList a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public sk01(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk01)) {
            return false;
        }
        sk01 sk01Var = (sk01) obj;
        return this.a.equals(sk01Var.a) && u890.j(this.b, sk01Var.b) && u890.j(this.c, sk01Var.c) && this.d.equals(sk01Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Iterator itO2 = xvj1.o(this.d, parcel);
        while (itO2.hasNext()) {
            parcel.writeParcelable((Parcelable) itO2.next(), i);
        }
    }
}
