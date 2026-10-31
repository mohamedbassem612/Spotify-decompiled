package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xjj1 implements Parcelable {
    public static final Parcelable.Creator<xjj1> CREATOR = new nhj1((byte) 3);
    public final int a;

    public xjj1(int i) {
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
        return (obj instanceof xjj1) && this.a == ((xjj1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(xcg1.o(this.a));
    }
}
