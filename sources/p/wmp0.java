package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wmp0 implements xmp0 {
    public static final Parcelable.Creator<wmp0> CREATOR = new ump0(2);
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;

    public wmp0(String str, boolean z, String str2, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = str2;
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
        if (!(obj instanceof wmp0)) {
            return false;
        }
        wmp0 wmp0Var = (wmp0) obj;
        return this.a == wmp0Var.a && u890.j(this.b, wmp0Var.b) && u890.j(this.c, wmp0Var.c) && this.d == wmp0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
