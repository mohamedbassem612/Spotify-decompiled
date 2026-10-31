package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g41 implements p41 {
    public static final Parcelable.Creator<g41> CREATOR = new d41((byte) 2);
    public final boolean a;
    public final tn00 b;

    public g41(boolean z, tn00 tn00Var) {
        this.a = z;
        this.b = tn00Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g41)) {
            return false;
        }
        g41 g41Var = (g41) obj;
        return this.a == g41Var.a && u890.j(this.b, g41Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        tn00 tn00Var = this.b;
        return iHashCode + (tn00Var == null ? 0 : tn00Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeParcelable(this.b, i);
    }
}
