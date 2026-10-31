package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hic1 implements tic1 {
    public static final Parcelable.Creator<hic1> CREATOR = new y7c1((byte) 10);
    public final String a;
    public final int b;

    public hic1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hic1)) {
            return false;
        }
        hic1 hic1Var = (hic1) obj;
        return u890.j(this.a, hic1Var.a) && this.b == hic1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
