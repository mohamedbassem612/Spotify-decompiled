package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rw21 implements Parcelable {
    public static final Parcelable.Creator<rw21> CREATOR = new agm0((byte) 12);
    public final int a;
    public final int b;

    public rw21(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw21)) {
            return false;
        }
        rw21 rw21Var = (rw21) obj;
        return this.a == rw21Var.a && this.b == rw21Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.a);
        switch (this.b) {
            case 1:
                str = "UNSPECIFIED";
                break;
            case 2:
                str = "REQUESTED";
                break;
            case 3:
                str = "PENDING";
                break;
            case 4:
                str = "DOWNLOADING";
                break;
            case 5:
                str = "DOWNLOADED";
                break;
            case 6:
                str = "FAILURE";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
    }
}
