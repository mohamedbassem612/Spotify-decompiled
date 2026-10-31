package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zu implements Parcelable {
    public static final Parcelable.Creator<zu> CREATOR = new gp((byte) 4);
    public static final zu b = new zu(1);
    public final int a;

    public zu(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu) && this.a == ((zu) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "NOT_STARTED";
        } else if (i2 == 2) {
            str = "IN_PROGRESS";
        } else if (i2 == 3) {
            str = "CANCELLED";
        } else if (i2 == 4) {
            str = "FAILED";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "SUCCESS";
        }
        parcel.writeString(str);
    }
}
