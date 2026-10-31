package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xo20 implements Parcelable {
    public static final Parcelable.Creator<xo20> CREATOR = new qe20((byte) 12);
    public final String a;
    public final wo20 b;

    public xo20(String str, wo20 wo20Var) {
        this.a = str;
        this.b = wo20Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo20)) {
            return false;
        }
        xo20 xo20Var = (xo20) obj;
        return u890.j(this.a, xo20Var.a) && u890.j(this.b, xo20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
