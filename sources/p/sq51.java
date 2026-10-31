package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sq51 implements Parcelable {
    public static final Parcelable.Creator<sq51> CREATOR = new ge51((byte) 13);
    public final long a;
    public final boolean b;

    public sq51(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final long a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq51)) {
            return false;
        }
        sq51 sq51Var = (sq51) obj;
        return this.a == sq51Var.a && this.b == sq51Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
