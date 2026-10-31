package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s950 implements Parcelable {
    public static final Parcelable.Creator<s950> CREATOR = new n750((byte) 11);
    public final v850 a;
    public final boolean b;

    public s950(v850 v850Var, boolean z) {
        this.a = v850Var;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s950)) {
            return false;
        }
        s950 s950Var = (s950) obj;
        return this.a == s950Var.a && this.b == s950Var.b;
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
