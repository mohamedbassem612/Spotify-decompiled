package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ssc1 implements Parcelable {
    public static final Parcelable.Creator<ssc1> CREATOR = new y7c1((byte) 27);
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;

    public ssc1(long j, long j2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssc1)) {
            return false;
        }
        ssc1 ssc1Var = (ssc1) obj;
        return u890.j(this.a, ssc1Var.a) && u890.j(this.b, ssc1Var.b) && u890.j(this.c, ssc1Var.c) && this.d == ssc1Var.d && this.e == ssc1Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }
}
