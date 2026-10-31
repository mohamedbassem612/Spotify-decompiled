package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s3i0 implements t3i0 {
    public static final Parcelable.Creator<s3i0> CREATOR = new cyh0((byte) 9);
    public final xve1 a;

    public s3i0(xve1 xve1Var) {
        this.a = xve1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3i0) && u890.j(this.a, ((s3i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.t3i0
    public final xve1 m() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
