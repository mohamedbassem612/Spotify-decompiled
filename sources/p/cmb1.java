package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cmb1 implements pnb1 {
    public static final Parcelable.Creator<cmb1> CREATOR = new olb1((byte) 4);
    public final String a;
    public final boolean b;

    public cmb1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmb1)) {
            return false;
        }
        cmb1 cmb1Var = (cmb1) obj;
        return u890.j(this.a, cmb1Var.a) && this.b == cmb1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
