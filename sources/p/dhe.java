package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dhe implements Parcelable {
    public static final Parcelable.Creator<dhe> CREATOR = new zge((byte) 0);
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;

    public dhe(long j, long j2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhe)) {
            return false;
        }
        dhe dheVar = (dhe) obj;
        return u890.j(this.a, dheVar.a) && u890.j(this.b, dheVar.b) && vve1.a(this.c, dheVar.c) && this.d == dheVar.d && u890.j(this.e, dheVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(new vve1(this.c), i);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
    }
}
