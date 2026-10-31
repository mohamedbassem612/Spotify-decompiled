package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d9h implements Parcelable {
    public static final Parcelable.Creator<d9h> CREATOR = new v6h((byte) 2);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public d9h(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9h)) {
            return false;
        }
        d9h d9hVar = (d9h) obj;
        long j = d9hVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, d9hVar.b) && z4h1.b(this.c, d9hVar.c) && z4h1.b(this.d, d9hVar.d) && z4h1.b(this.e, d9hVar.e);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.e) + cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(z4p1.G(this.a));
        parcel.writeInt(z4p1.G(this.b));
        parcel.writeInt(z4p1.G(this.c));
        parcel.writeInt(z4p1.G(this.d));
        parcel.writeInt(z4p1.G(this.e));
    }
}
