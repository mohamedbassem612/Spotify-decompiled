package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eee1 extends fee1 {
    public static final Parcelable.Creator<eee1> CREATOR = new pwd1((byte) 13);
    public final vve1 a;

    public eee1(vve1 vve1Var) {
        this.a = vve1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eee1) && u890.j(this.a, ((eee1) obj).a);
    }

    public final int hashCode() {
        vve1 vve1Var = this.a;
        if (vve1Var == null) {
            return 0;
        }
        return Long.hashCode(vve1Var.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
