package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sb71 extends ac71 {
    public static final Parcelable.Creator<sb71> CREATOR = new v871((byte) 19);
    public final qz61 a;
    public final zb71 b;

    public sb71(qz61 qz61Var, zb71 zb71Var) {
        this.a = qz61Var;
        this.b = zb71Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb71)) {
            return false;
        }
        sb71 sb71Var = (sb71) obj;
        return u890.j(this.a, sb71Var.a) && u890.j(this.b, sb71Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zb71 zb71Var = this.b;
        return iHashCode + (zb71Var == null ? 0 : zb71Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
