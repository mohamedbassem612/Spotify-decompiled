package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oge0 extends rge0 {
    public static final Parcelable.Creator<oge0> CREATOR = new lbe0((byte) 4);
    public final String a;
    public final String b;

    public oge0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oge0)) {
            return false;
        }
        oge0 oge0Var = (oge0) obj;
        return u890.j(this.a, oge0Var.a) && u890.j(this.b, oge0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
