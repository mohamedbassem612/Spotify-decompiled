package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ora implements Parcelable {
    public static final Parcelable.Creator<ora> CREATOR = new mra((byte) 1);
    public final String a;
    public final boolean b;

    public ora(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public static ora a(ora oraVar, boolean z) {
        String str = oraVar.a;
        oraVar.getClass();
        return new ora(str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ora)) {
            return false;
        }
        ora oraVar = (ora) obj;
        return u890.j(this.a, oraVar.a) && this.b == oraVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
