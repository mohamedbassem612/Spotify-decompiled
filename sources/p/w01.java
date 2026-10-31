package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w01 implements Parcelable {
    public static final Parcelable.Creator<w01> CREATOR = new hbn1((byte) 2);
    public final bk8 a;
    public final String b;
    public final String c;

    public w01(String str, String str2, bk8 bk8Var) {
        this.a = bk8Var;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w01)) {
            return false;
        }
        w01 w01Var = (w01) obj;
        return this.a == w01Var.a && u890.j(this.b, w01Var.b) && u890.j(this.c, w01Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
