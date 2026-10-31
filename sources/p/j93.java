package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j93 implements nb10 {
    public static final Parcelable.Creator<j93> CREATOR = new i93((byte) 0);
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public j93(String str, int i, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
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
        if (!(obj instanceof j93)) {
            return false;
        }
        j93 j93Var = (j93) obj;
        return this.a == j93Var.a && u890.j(this.b, j93Var.b) && this.c == j93Var.c && this.d == j93Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "EP";
        } else if (i2 == 2) {
            str = "ALBUM";
        } else if (i2 == 3) {
            str = "SINGLE";
        } else if (i2 == 4) {
            str = "COMPILATION";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "UNRECOGNIZED";
        }
        parcel.writeString(str);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
