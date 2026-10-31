package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nbb0 implements Parcelable {
    public static final Parcelable.Creator<nbb0> CREATOR = new jca0((byte) 19);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public nbb0(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbb0)) {
            return false;
        }
        nbb0 nbb0Var = (nbb0) obj;
        return u890.j(this.a, nbb0Var.a) && u890.j(this.b, nbb0Var.b) && this.c == nbb0Var.c && this.d == nbb0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
