package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dy1 implements gy1 {
    public static final Parcelable.Creator<dy1> CREATOR = new ev1((byte) 5);
    public final g3d0 a;

    public dy1(g3d0 g3d0Var) {
        this.a = g3d0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dy1) && u890.j(this.a, ((dy1) obj).a);
    }

    public final int hashCode() {
        g3d0 g3d0Var = this.a;
        if (g3d0Var == null) {
            return 0;
        }
        return g3d0Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
