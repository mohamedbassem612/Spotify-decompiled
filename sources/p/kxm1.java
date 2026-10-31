package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kxm1 implements Parcelable {
    public static final Parcelable.Creator<kxm1> CREATOR = new ynm1((byte) 10);
    public final int a;
    public final boolean b;

    public kxm1(int i, boolean z) {
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
        if (!(obj instanceof kxm1)) {
            return false;
        }
        kxm1 kxm1Var = (kxm1) obj;
        return this.a == kxm1Var.a && this.b == kxm1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
