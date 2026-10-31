package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h960 implements Parcelable {
    public static final Parcelable.Creator<h960> CREATOR = new xk50((byte) 18);
    public final long a;
    public final int b;
    public final int c;

    public h960(int i, long j, int i2) {
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h960)) {
            return false;
        }
        h960 h960Var = (h960) obj;
        return this.a == h960Var.a && this.b == h960Var.b && this.c == h960Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Long.hashCode(this.a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
