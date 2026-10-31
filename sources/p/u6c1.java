package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u6c1 implements Parcelable {
    public static final Parcelable.Creator<u6c1> CREATOR = new yub1(27);
    public final int a;

    public u6c1(int i) {
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
        return (obj instanceof u6c1) && this.a == ((u6c1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "MUTED";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "UNMUTED";
        }
        parcel.writeString(str);
    }
}
