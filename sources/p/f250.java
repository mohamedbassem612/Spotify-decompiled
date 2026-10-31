package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f250 extends g250 {
    public static final Parcelable.Creator<f250> CREATOR = new fd40((byte) 27);
    public final String a;
    public final uuy0 b;

    public f250(String str, uuy0 uuy0Var) {
        this.a = str;
        this.b = uuy0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f250)) {
            return false;
        }
        f250 f250Var = (f250) obj;
        return u890.j(this.a, f250Var.a) && u890.j(this.b, f250Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        uuy0 uuy0Var = this.b;
        return iHashCode + (uuy0Var == null ? 0 : uuy0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
