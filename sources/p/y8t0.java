package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y8t0 implements Parcelable {
    public static final Parcelable.Creator<y8t0> CREATOR = new r7t0((byte) 2);
    public final x8t0 a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public y8t0(String str, String str2, String str3, x8t0 x8t0Var, boolean z) {
        this.a = x8t0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8t0)) {
            return false;
        }
        y8t0 y8t0Var = (y8t0) obj;
        return u890.j(this.a, y8t0Var.a) && u890.j(this.b, y8t0Var.b) && u890.j(this.c, y8t0Var.c) && u890.j(this.d, y8t0Var.d) && this.e == y8t0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
