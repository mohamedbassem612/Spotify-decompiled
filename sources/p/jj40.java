package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jj40 implements Parcelable {
    public static final Parcelable.Creator<jj40> CREATOR = new fd40((byte) 8);
    public static final jj40 c = new jj40("", -1);
    public final String a;
    public final int b;

    public jj40(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj40)) {
            return false;
        }
        jj40 jj40Var = (jj40) obj;
        return u890.j(this.a, jj40Var.a) && this.b == jj40Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
