package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v1i1 implements w1i1 {
    public static final Parcelable.Creator<v1i1> CREATOR = new gwg1((byte) 24);
    public final z740 a;
    public final fyl b;

    public v1i1(z740 z740Var, fyl fylVar) {
        this.a = z740Var;
        this.b = fylVar;
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
        if (!(obj instanceof v1i1)) {
            return false;
        }
        v1i1 v1i1Var = (v1i1) obj;
        return u890.j(this.a, v1i1Var.a) && u890.j(this.b, v1i1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fyl fylVar = this.b;
        return iHashCode + (fylVar == null ? 0 : fylVar.a.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        fyl fylVar = this.b;
        parcel.writeString(fylVar != null ? fylVar.a : null);
    }
}
