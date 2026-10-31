package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hzl extends kzl {
    public static final Parcelable.Creator<hzl> CREATOR = new ezl((byte) 2);
    public final String a;
    public final int b;
    public final String c;

    public hzl(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzl)) {
            return false;
        }
        hzl hzlVar = (hzl) obj;
        return u890.j(this.a, hzlVar.a) && this.b == hzlVar.b && u890.j(this.c, hzlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }
}
