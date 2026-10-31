package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wh2 implements Parcelable {
    public static final Parcelable.Creator<wh2> CREATOR = new ue2((byte) 10);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public wh2(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh2)) {
            return false;
        }
        wh2 wh2Var = (wh2) obj;
        return u890.j(this.a, wh2Var.a) && u890.j(this.b, wh2Var.b) && this.c == wh2Var.c && this.d == wh2Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
