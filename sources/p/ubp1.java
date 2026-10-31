package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ubp1 extends u9 {
    public static final Parcelable.Creator<ubp1> CREATOR = new hmo1((byte) 26);
    public final int a;
    public final boolean b;

    public ubp1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubp1)) {
            return false;
        }
        ubp1 ubp1Var = (ubp1) obj;
        return this.a == ubp1Var.a && this.b == ubp1Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.z(parcel, 1, this.a);
        j541.s(parcel, 2, this.b);
        j541.n(iJ, parcel);
    }
}
