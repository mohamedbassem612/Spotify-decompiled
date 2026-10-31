package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f08 implements Parcelable {
    public static final Parcelable.Creator<f08> CREATOR = new bu7((byte) 7);
    public final String a;
    public final String b;
    public final String c;
    public final dg d;

    public f08(String str, String str2, String str3, dg dgVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dgVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f08)) {
            return false;
        }
        f08 f08Var = (f08) obj;
        return u890.j(this.a, f08Var.a) && u890.j(this.b, f08Var.b) && u890.j(this.c, f08Var.c) && u890.j(this.d, f08Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        dg dgVar = this.d;
        return iHashCode3 + (dgVar != null ? dgVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        dg dgVar = this.d;
        if (dgVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dgVar.writeToParcel(parcel, i);
        }
    }
}
