package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a3d0 extends g3d0 implements b3d0 {
    public static final Parcelable.Creator<a3d0> CREATOR = new bzc0((byte) 16);
    public final String a;
    public final String b;

    public a3d0(String str, String str2) {
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof a3d0)) {
            return false;
        }
        a3d0 a3d0Var = (a3d0) obj;
        return u890.j(this.a, a3d0Var.a) && u890.j(this.b, a3d0Var.b);
    }

    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
