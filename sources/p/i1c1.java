package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i1c1 implements Parcelable {
    public static final Parcelable.Creator<i1c1> CREATOR = new yub1((byte) 14);
    public final List a;
    public final String b;
    public final lax c;
    public final String d;

    public i1c1(List list, String str, lax laxVar, String str2) {
        this.a = list;
        this.b = str;
        this.c = laxVar;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1c1)) {
            return false;
        }
        i1c1 i1c1Var = (i1c1) obj;
        return u890.j(this.a, i1c1Var.a) && u890.j(this.b, i1c1Var.b) && u890.j(this.c, i1c1Var.c) && u890.j(this.d, i1c1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((k1c1) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }
}
