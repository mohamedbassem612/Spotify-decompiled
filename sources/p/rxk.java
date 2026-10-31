package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rxk implements Parcelable {
    public static final Parcelable.Creator<rxk> CREATOR = new v6h((byte) 28);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public rxk(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
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
        if (!(obj instanceof rxk)) {
            return false;
        }
        rxk rxkVar = (rxk) obj;
        return u890.j(this.a, rxkVar.a) && this.b == rxkVar.b && this.c == rxkVar.c && u890.j(this.d, rxkVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
    }
}
