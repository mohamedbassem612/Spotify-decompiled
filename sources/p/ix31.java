package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ix31 implements jx31 {
    public static final Parcelable.Creator<ix31> CREATOR = new xw31((byte) 10);
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public ix31(int i, String str, String str2, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix31)) {
            return false;
        }
        ix31 ix31Var = (ix31) obj;
        return this.a == ix31Var.a && u890.j(this.b, ix31Var.b) && u890.j(this.c, ix31Var.c) && this.d == ix31Var.d && this.e == ix31Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
