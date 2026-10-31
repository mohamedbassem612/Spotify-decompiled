package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z1t0 implements Parcelable {
    public static final Parcelable.Creator<z1t0> CREATOR = new agm0((byte) 7);
    public final String a;
    public final int b;
    public final int c;
    public final yxa0 d;

    public z1t0(int i, int i2, String str, yxa0 yxa0Var) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = yxa0Var;
    }

    public final yxa0 a() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1t0)) {
            return false;
        }
        z1t0 z1t0Var = (z1t0) obj;
        return u890.j(this.a, z1t0Var.a) && this.b == z1t0Var.b && this.c == z1t0Var.c && u890.j(this.d, z1t0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
