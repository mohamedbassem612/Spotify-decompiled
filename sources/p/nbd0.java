package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nbd0 implements Parcelable {
    public static final Parcelable.Creator<nbd0> CREATOR = new lad0((byte) 8);
    public final String a;
    public final String b;
    public final mbd0 c;

    public nbd0(String str, String str2, mbd0 mbd0Var) {
        this.a = str;
        this.b = str2;
        this.c = mbd0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbd0)) {
            return false;
        }
        nbd0 nbd0Var = (nbd0) obj;
        return u890.j(this.a, nbd0Var.a) && u890.j(this.b, nbd0Var.b) && u890.j(this.c, nbd0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
