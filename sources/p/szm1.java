package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class szm1 implements Parcelable {
    public static final Parcelable.Creator<szm1> CREATOR = new ynm1((byte) 14);
    public final String a;
    public final boolean b;

    public szm1(String str, boolean z) {
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
        if (!(obj instanceof szm1)) {
            return false;
        }
        szm1 szm1Var = (szm1) obj;
        return u890.j(this.a, szm1Var.a) && this.b == szm1Var.b;
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
