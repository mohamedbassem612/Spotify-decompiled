package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nxb1 implements Parcelable {
    public static final Parcelable.Creator<nxb1> CREATOR = new yub1((byte) 9);
    public final String a;
    public final String b;

    public nxb1(String str, String str2) {
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
        if (!(obj instanceof nxb1)) {
            return false;
        }
        nxb1 nxb1Var = (nxb1) obj;
        return u890.j(this.a, nxb1Var.a) && u890.j(this.b, nxb1Var.b);
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
