package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k31 extends r31 {
    public static final Parcelable.Creator<k31> CREATOR = new t21((byte) 15);
    public final int a;

    public k31(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k31) && this.a == ((k31) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "CREDENTIAL_NOT_FOUND";
        } else if (i2 == 2) {
            str = "CONNECTION";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "UNKNOWN";
        }
        parcel.writeString(str);
    }
}
