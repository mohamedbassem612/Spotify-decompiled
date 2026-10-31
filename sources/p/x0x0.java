package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x0x0 implements Parcelable {
    public static final Parcelable.Creator<x0x0> CREATOR = new wvw0((byte) 5);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public x0x0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0x0)) {
            return false;
        }
        x0x0 x0x0Var = (x0x0) obj;
        return u890.j(this.a, x0x0Var.a) && u890.j(this.b, x0x0Var.b) && u890.j(this.c, x0x0Var.c) && this.d == x0x0Var.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
