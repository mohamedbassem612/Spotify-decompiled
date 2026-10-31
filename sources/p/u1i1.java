package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u1i1 implements w1i1 {
    public static final Parcelable.Creator<u1i1> CREATOR = new gwg1((byte) 23);
    public final c1i1 a;

    public u1i1(c1i1 c1i1Var) {
        this.a = c1i1Var;
    }

    public final String J0() {
        return this.a.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1i1) && u890.j(this.a, ((u1i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
