package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t6q0 extends u6q0 {
    public static final Parcelable.Creator<t6q0> CREATOR = new qxp0((byte) 19);
    public final String a;
    public final String b;

    public t6q0(String str, String str2) {
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
        if (!(obj instanceof t6q0)) {
            return false;
        }
        t6q0 t6q0Var = (t6q0) obj;
        return u890.j(this.a, t6q0Var.a) && u890.j(this.b, t6q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
