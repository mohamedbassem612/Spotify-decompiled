package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h0v implements Parcelable {
    public static final Parcelable.Creator<h0v> CREATOR = new zrt((byte) 27);
    public final long a;
    public final long b;

    public h0v(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        dm5.m(j2 >= 0 || j2 == -9223372036854775807L);
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0v)) {
            return false;
        }
        h0v h0vVar = (h0v) obj;
        return this.a == h0vVar.a && this.b == h0vVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 961) + ((int) this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
