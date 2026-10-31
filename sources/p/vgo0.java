package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vgo0 implements Parcelable {
    public static final Parcelable.Creator<vgo0> CREATOR = new b4o0((byte) 11);
    public final String a;
    public final int b;
    public final int c;

    public vgo0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgo0)) {
            return false;
        }
        vgo0 vgo0Var = (vgo0) obj;
        return u890.j(this.a, vgo0Var.a) && this.b == vgo0Var.b && this.c == vgo0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
