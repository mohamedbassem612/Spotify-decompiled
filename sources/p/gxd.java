package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gxd extends u9 {
    public static final Parcelable.Creator<gxd> CREATOR = new xud((byte) 6);
    public final String a;
    public final int b;

    public gxd(String str, int i) {
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
        if (!(obj instanceof gxd)) {
            return false;
        }
        gxd gxdVar = (gxd) obj;
        return u890.j(this.a, gxdVar.a) && this.b == gxdVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
