package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hk51 implements knt, Parcelable {
    public static final Parcelable.Creator<hk51> CREATOR = new ge51((byte) 4);
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public hk51(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk51)) {
            return false;
        }
        hk51 hk51Var = (hk51) obj;
        return u890.j(this.a, hk51Var.a) && u890.j(this.b, hk51Var.b) && u890.j(this.c, hk51Var.c) && this.d == hk51Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
    }
}
