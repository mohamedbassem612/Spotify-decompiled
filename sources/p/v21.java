package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v21 extends r31 {
    public static final Parcelable.Creator<v21> CREATOR = new t21((byte) 1);
    public final int a;
    public final int b;

    public v21(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v21)) {
            return false;
        }
        v21 v21Var = (v21) obj;
        return this.a == v21Var.a && this.b == v21Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(kk0.A(this.a));
        parcel.writeString(kk0.y(this.b));
    }
}
