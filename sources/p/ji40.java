package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ji40 extends ei90 {
    public static final Parcelable.Creator<ji40> CREATOR = new fd40((byte) 4);
    public final int a;
    public final boolean b;

    public ji40(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji40)) {
            return false;
        }
        ji40 ji40Var = (ji40) obj;
        return this.a == ji40Var.a && this.b == ji40Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (l1d.C(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "UNKNOWN";
        } else if (i2 == 2) {
            str = "DEFAULT";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "CONTENT";
        }
        parcel.writeString(str);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
