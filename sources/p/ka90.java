package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ka90 implements Parcelable {
    public static final Parcelable.Creator<ka90> CREATOR = new xl80((byte) 9);
    public final String a;
    public final String b;

    public ka90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka90)) {
            return false;
        }
        ka90 ka90Var = (ka90) obj;
        return u890.j(this.a, ka90Var.a) && u890.j(this.b, ka90Var.b);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
