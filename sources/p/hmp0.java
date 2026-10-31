package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hmp0 implements Parcelable {
    public static final Parcelable.Creator<hmp0> CREATOR = new b4o0((byte) 29);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ hmp0(int i, String str, String str2, boolean z, boolean z2) {
        this(str, (i & 4) != 0 ? false : z, str2, (i & 8) != 0 ? false : z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmp0)) {
            return false;
        }
        hmp0 hmp0Var = (hmp0) obj;
        return u890.j(this.a, hmp0Var.a) && u890.j(this.b, hmp0Var.b) && this.c == hmp0Var.c && this.d == hmp0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public hmp0(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }
}
