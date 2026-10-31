package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uj01 implements wj01 {
    public static final Parcelable.Creator<uj01> CREATOR = new sj01((byte) 1);
    public final String a;
    public final int b;

    public uj01(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj01)) {
            return false;
        }
        uj01 uj01Var = (uj01) obj;
        return u890.j(this.a, uj01Var.a) && this.b == uj01Var.b;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
