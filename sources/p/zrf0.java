package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zrf0 implements csf0 {
    public static final Parcelable.Creator<zrf0> CREATOR = new ipf0((byte) 22);
    public final yrf0 a;
    public final boolean b;
    public final boolean c;

    public zrf0(yrf0 yrf0Var, boolean z, boolean z2) {
        this.a = yrf0Var;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrf0)) {
            return false;
        }
        zrf0 zrf0Var = (zrf0) obj;
        return u890.j(this.a, zrf0Var.a) && this.b == zrf0Var.b && this.c == zrf0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
