package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z2d0 extends g3d0 implements b3d0, d3d0 {
    public static final Parcelable.Creator<z2d0> CREATOR = new bzc0((byte) 15);
    public final String a;
    public final String b;
    public final boolean c;

    public z2d0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2d0)) {
            return false;
        }
        z2d0 z2d0Var = (z2d0) obj;
        return u890.j(this.a, z2d0Var.a) && u890.j(this.b, z2d0Var.b) && this.c == z2d0Var.c;
    }

    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
