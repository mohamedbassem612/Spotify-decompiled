package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xvz extends g700 {
    public static final Parcelable.Creator<xvz> CREATOR = new dez((byte) 19);
    public final hwn0 a;

    public xvz(hwn0 hwn0Var) {
        this.a = hwn0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvz) && u890.j(this.a, ((xvz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.g700
    public final String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ltn1.E(this.a, parcel);
    }
}
