package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hxd extends u9 {
    public static final Parcelable.Creator<hxd> CREATOR = new xud((byte) 7);
    public final String a;
    public final int b;
    public final int c;

    public hxd(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxd)) {
            return false;
        }
        hxd hxdVar = (hxd) obj;
        return u890.j(this.a, hxdVar.a) && this.b == hxdVar.b && this.c == hxdVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
