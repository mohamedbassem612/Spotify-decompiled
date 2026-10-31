package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lxa0 implements Parcelable {
    public static final Parcelable.Creator<lxa0> CREATOR = new jca0((byte) 8);
    public final dxr0 a;
    public final int b;
    public final int c;
    public final yxa0 d;
    public final yq00 e;

    public lxa0(dxr0 dxr0Var, int i, int i2, yxa0 yxa0Var, yq00 yq00Var) {
        this.a = dxr0Var;
        this.b = i;
        this.c = i2;
        this.d = yxa0Var;
        this.e = yq00Var;
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
        if (!(obj instanceof lxa0)) {
            return false;
        }
        lxa0 lxa0Var = (lxa0) obj;
        return u890.j(this.a, lxa0Var.a) && this.b == lxa0Var.b && this.c == lxa0Var.c && u890.j(this.d, lxa0Var.d) && u890.j(this.e, lxa0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }
}
