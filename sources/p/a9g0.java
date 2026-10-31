package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a9g0 implements Parcelable {
    public static final Parcelable.Creator<a9g0> CREATOR = new isf0((byte) 20);
    public final ox3 a;
    public final boolean b;

    public a9g0(ox3 ox3Var, boolean z) {
        this.a = ox3Var;
        this.b = z;
    }

    public static a9g0 a(a9g0 a9g0Var, boolean z) {
        ox3 ox3Var = a9g0Var.a;
        a9g0Var.getClass();
        return new a9g0(ox3Var, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9g0)) {
            return false;
        }
        a9g0 a9g0Var = (a9g0) obj;
        return this.a == a9g0Var.a && this.b == a9g0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b ? 1 : 0);
    }
}
