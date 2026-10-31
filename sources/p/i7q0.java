package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i7q0 implements s7q0 {
    public static final Parcelable.Creator<i7q0> CREATOR = new qxp0((byte) 24);
    public final String a;
    public final String b;

    public i7q0(String str, String str2) {
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
        if (!(obj instanceof i7q0)) {
            return false;
        }
        i7q0 i7q0Var = (i7q0) obj;
        return u890.j(this.a, i7q0Var.a) && u890.j(this.b, i7q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
