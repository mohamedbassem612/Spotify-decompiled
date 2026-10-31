package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ahm0 implements Parcelable {
    public static final Parcelable.Creator<ahm0> CREATOR = new w9k0((byte) 25);
    public final mdh1 a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public ahm0(mdh1 mdh1Var, boolean z, String str, boolean z2) {
        this.a = mdh1Var;
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    public static ahm0 a(ahm0 ahm0Var, boolean z) {
        return new ahm0(ahm0Var.a, z, ahm0Var.c, ahm0Var.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahm0)) {
            return false;
        }
        ahm0 ahm0Var = (ahm0) obj;
        return u890.j(this.a, ahm0Var.a) && this.b == ahm0Var.b && u890.j(this.c, ahm0Var.c) && this.d == ahm0Var.d;
    }

    public final int hashCode() {
        this.a.getClass();
        return Boolean.hashCode(this.d) + cy30.d(xcg1.g(-925021861, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
