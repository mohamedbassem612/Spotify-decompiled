package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k6h0 implements s6h0 {
    public static final Parcelable.Creator<k6h0> CREATOR = new hug0((byte) 6);
    public final String a;
    public final String b;

    public k6h0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6h0)) {
            return false;
        }
        k6h0 k6h0Var = (k6h0) obj;
        return u890.j(this.a, k6h0Var.a) && u890.j(this.b, k6h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
