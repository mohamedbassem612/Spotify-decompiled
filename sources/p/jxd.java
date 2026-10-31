package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jxd extends u9 {
    public static final Parcelable.Creator<jxd> CREATOR = new xud((byte) 9);
    public final String a;
    public final int b;
    public final String c;

    public jxd(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxd)) {
            return false;
        }
        jxd jxdVar = (jxd) obj;
        return u890.j(this.a, jxdVar.a) && this.b == jxdVar.b && u890.j(this.c, jxdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }
}
