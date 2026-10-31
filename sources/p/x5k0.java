package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x5k0 implements Parcelable {
    public static final Parcelable.Creator<x5k0> CREATOR = new ohj0((byte) 14);
    public final String a;
    public final String b;

    public x5k0(String str, String str2) {
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
        if (!(obj instanceof x5k0)) {
            return false;
        }
        x5k0 x5k0Var = (x5k0) obj;
        return u890.j(this.a, x5k0Var.a) && u890.j(this.b, x5k0Var.b);
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
