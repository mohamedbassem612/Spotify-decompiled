package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f470 implements Parcelable {
    public static final Parcelable.Creator<f470> CREATOR = new ij60((byte) 12);
    public final int a;

    public f470(int i) {
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
        return (obj instanceof f470) && this.a == ((f470) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "UNSPECIFIED";
        } else if (i2 == 2) {
            str = "METHOD_STORED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "METHOD_INFERRED";
        }
        parcel.writeString(str);
    }
}
