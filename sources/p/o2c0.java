package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o2c0 implements Parcelable {
    public static final Parcelable.Creator<o2c0> CREATOR = new cwb0((byte) 3);
    public final yxa0 a;
    public final tpw0 b;
    public final int c;
    public final int d;
    public final yq00 e;

    public o2c0(yxa0 yxa0Var, tpw0 tpw0Var, int i, int i2, yq00 yq00Var) {
        this.a = yxa0Var;
        this.b = tpw0Var;
        this.c = i;
        this.d = i2;
        this.e = yq00Var;
    }

    public final yxa0 a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2c0)) {
            return false;
        }
        o2c0 o2c0Var = (o2c0) obj;
        return u890.j(this.a, o2c0Var.a) && this.b == o2c0Var.b && this.c == o2c0Var.c && this.d == o2c0Var.d && u890.j(this.e, o2c0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
    }
}
