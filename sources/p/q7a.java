package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q7a extends s7a {
    public static final Parcelable.Creator<q7a> CREATOR = new ux9((byte) 21);
    public final int a;
    public final int b;

    public q7a(int i, int i2) {
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
        if (!(obj instanceof q7a)) {
            return false;
        }
        q7a q7aVar = (q7a) obj;
        return this.a == q7aVar.a && this.b == q7aVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
