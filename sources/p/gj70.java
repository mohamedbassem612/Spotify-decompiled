package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gj70 extends hj70 {
    public static final Parcelable.Creator<gj70> CREATOR = new ai70((byte) 29);
    public final String c;
    public final String d;

    public gj70(String str, String str2) {
        super(3, 1);
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj70)) {
            return false;
        }
        gj70 gj70Var = (gj70) obj;
        return u890.j(this.c, gj70Var.c) && u890.j(this.d, gj70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
