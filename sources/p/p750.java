package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p750 implements Parcelable {
    public static final Parcelable.Creator<p750> CREATOR = new n750((byte) 1);
    public final v850 a;
    public final boolean b;
    public final boolean c;

    public p750(v850 v850Var, boolean z, boolean z2) {
        this.a = v850Var;
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
        if (!(obj instanceof p750)) {
            return false;
        }
        p750 p750Var = (p750) obj;
        return this.a == p750Var.a && this.b == p750Var.b && this.c == p750Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
