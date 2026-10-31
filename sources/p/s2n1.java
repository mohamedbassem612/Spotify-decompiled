package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s2n1 implements oim {
    public static final Parcelable.Creator<s2n1> CREATOR = new ynm1((byte) 18);
    public final boolean a;
    public final String b;

    public s2n1(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2n1)) {
            return false;
        }
        s2n1 s2n1Var = (s2n1) obj;
        return this.a == s2n1Var.a && u890.j(this.b, s2n1Var.b);
    }

    public final bjm getTarget() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b);
    }
}
