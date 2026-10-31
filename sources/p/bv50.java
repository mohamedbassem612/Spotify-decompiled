package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bv50 implements pf51, Parcelable {
    public static final Parcelable.Creator<bv50> CREATOR = new xk50((byte) 8);
    public final String a;
    public final String b;

    public bv50(String str, String str2) {
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
        if (!(obj instanceof bv50)) {
            return false;
        }
        bv50 bv50Var = (bv50) obj;
        return u890.j(this.a, bv50Var.a) && u890.j(this.b, bv50Var.b);
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
