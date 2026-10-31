package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pxz0 implements Parcelable {
    public static final Parcelable.Creator<pxz0> CREATOR = new erz0((byte) 11);
    public final String a;
    public final int b;

    public pxz0(String str, int i) {
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
        if (!(obj instanceof pxz0)) {
            return false;
        }
        pxz0 pxz0Var = (pxz0) obj;
        return u890.j(this.a, pxz0Var.a) && this.b == pxz0Var.b;
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
