package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bsv0 implements Parcelable {
    public static final Parcelable.Creator<bsv0> CREATOR = new g0v0((byte) 18);
    public final String a;
    public final djw0 b;
    public final boolean c;
    public final String d;

    public /* synthetic */ bsv0(String str, djw0 djw0Var, boolean z, String str2, int i) {
        this(str, (i & 8) != 0 ? null : str2, (i & 2) != 0 ? null : djw0Var, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsv0)) {
            return false;
        }
        bsv0 bsv0Var = (bsv0) obj;
        return u890.j(this.a, bsv0Var.a) && u890.j(this.b, bsv0Var.b) && this.c == bsv0Var.c && u890.j(this.d, bsv0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        djw0 djw0Var = this.b;
        int iG = xcg1.g((iHashCode + (djw0Var == null ? 0 : djw0Var.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
    }

    public bsv0(String str, String str2, djw0 djw0Var, boolean z) {
        this.a = str;
        this.b = djw0Var;
        this.c = z;
        this.d = str2;
    }
}
