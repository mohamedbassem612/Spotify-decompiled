package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ndx0 implements Parcelable {
    public static final Parcelable.Creator<ndx0> CREATOR = new wvw0((byte) 23);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;

    public ndx0(String str, String str2, boolean z, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndx0)) {
            return false;
        }
        ndx0 ndx0Var = (ndx0) obj;
        return u890.j(this.a, ndx0Var.a) && u890.j(this.b, ndx0Var.b) && u890.j(this.c, ndx0Var.c) && this.d == ndx0Var.d && u890.j(this.e, ndx0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + xcg1.g((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            ((gp51) itM.next()).writeToParcel(parcel, i);
        }
    }
}
