package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dof0 extends c871 {
    public static final Parcelable.Creator<dof0> CREATOR = new j7f0((byte) 25);
    public final ay61 a;

    public dof0(ay61 ay61Var) {
        this.a = ay61Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dof0) && u890.j(this.a, ((dof0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
