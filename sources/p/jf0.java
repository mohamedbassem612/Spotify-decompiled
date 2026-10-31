package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jf0 implements lf0 {
    public static final Parcelable.Creator<jf0> CREATOR = new gp((byte) 19);
    public final hcx a;
    public final boolean b;

    public jf0(hcx hcxVar, boolean z) {
        this.a = hcxVar;
        this.b = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf0)) {
            return false;
        }
        jf0 jf0Var = (jf0) obj;
        return this.a == jf0Var.a && this.b == jf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b ? 1 : 0);
    }
}
