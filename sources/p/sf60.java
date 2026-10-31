package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sf60 extends vf60 {
    public static final Parcelable.Creator<sf60> CREATOR = new xk50((byte) 21);
    public final String a;
    public final int b;

    public sf60(String str, int i) {
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
        if (!(obj instanceof sf60)) {
            return false;
        }
        sf60 sf60Var = (sf60) obj;
        return u890.j(this.a, sf60Var.a) && this.b == sf60Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
