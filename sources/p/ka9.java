package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ka9 implements Parcelable {
    public static final Parcelable.Creator<ka9> CREATOR = new so8((byte) 25);
    public final int a;
    public final boolean b;

    public ka9(int i, boolean z) {
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
        if (!(obj instanceof ka9)) {
            return false;
        }
        ka9 ka9Var = (ka9) obj;
        return this.a == ka9Var.a && this.b == ka9Var.b;
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
