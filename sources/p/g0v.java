package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g0v implements Parcelable {
    public static final Parcelable.Creator<g0v> CREATOR = new zrt((byte) 26);
    public final long a;
    public final long b;

    public g0v(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        dm5.m(j >= 0);
        dm5.m(j2 >= 0 || j2 == -1);
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0v)) {
            return false;
        }
        g0v g0vVar = (g0v) obj;
        return this.a == g0vVar.a && this.b == g0vVar.b;
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
