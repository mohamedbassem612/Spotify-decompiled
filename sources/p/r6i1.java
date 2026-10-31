package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r6i1 implements Parcelable {
    public static final Parcelable.Creator<r6i1> CREATOR = new gwg1((byte) 26);
    public final String a;
    public final boolean b;

    public r6i1(String str, boolean z) {
        this.a = str;
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
        if (!(obj instanceof r6i1)) {
            return false;
        }
        r6i1 r6i1Var = (r6i1) obj;
        return u890.j(this.a, r6i1Var.a) && this.b == r6i1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
