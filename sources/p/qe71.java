package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qe71 extends te71 {
    public static final Parcelable.Creator<qe71> CREATOR = new v871((byte) 27);
    public final o571 a;
    public final s4b1 b;

    public qe71(o571 o571Var, s4b1 s4b1Var) {
        this.a = o571Var;
        this.b = s4b1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe71)) {
            return false;
        }
        qe71 qe71Var = (qe71) obj;
        return u890.j(this.a, qe71Var.a) && u890.j(this.b, qe71Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        s4b1 s4b1Var = this.b;
        return iHashCode + (s4b1Var == null ? 0 : s4b1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        s4b1 s4b1Var = this.b;
        parcel.writeString(s4b1Var != null ? s4b1Var.z() : null);
    }
}
