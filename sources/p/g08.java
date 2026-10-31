package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g08 implements Parcelable {
    public static final Parcelable.Creator<g08> CREATOR = new bu7((byte) 8);
    public final String a;
    public final String b;
    public final dg c;

    public g08(String str, String str2, dg dgVar) {
        this.a = str;
        this.b = str2;
        this.c = dgVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g08)) {
            return false;
        }
        g08 g08Var = (g08) obj;
        return u890.j(this.a, g08Var.a) && u890.j(this.b, g08Var.b) && u890.j(this.c, g08Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        dg dgVar = this.c;
        return iHashCode2 + (dgVar != null ? dgVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        dg dgVar = this.c;
        if (dgVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dgVar.writeToParcel(parcel, i);
        }
    }
}
