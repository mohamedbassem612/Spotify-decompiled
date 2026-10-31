package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gez implements Parcelable {
    public static final Parcelable.Creator<gez> CREATOR = new dez((byte) 1);
    public final s69 a;
    public final s69 b;
    public final s69 c;

    public gez(s69 s69Var, s69 s69Var2, s69 s69Var3) {
        this.a = s69Var;
        this.b = s69Var2;
        this.c = s69Var3;
    }

    public final String a() {
        s69 s69Var = this.a;
        String strA = s69Var != null ? s69Var.a() : null;
        s69 s69Var2 = this.b;
        String strA2 = s69Var2 != null ? s69Var2.a() : null;
        s69 s69Var3 = this.c;
        return l1d.n(s69Var3 != null ? s69Var3.a() : null, ")", gvg.n("EqCurves(low=", strA, ", mid=", strA2, ", high="));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gez)) {
            return false;
        }
        gez gezVar = (gez) obj;
        return u890.j(this.a, gezVar.a) && u890.j(this.b, gezVar.b) && u890.j(this.c, gezVar.c);
    }

    public final int hashCode() {
        s69 s69Var = this.a;
        int iHashCode = (s69Var == null ? 0 : s69Var.hashCode()) * 31;
        s69 s69Var2 = this.b;
        int iHashCode2 = (iHashCode + (s69Var2 == null ? 0 : s69Var2.hashCode())) * 31;
        s69 s69Var3 = this.c;
        return iHashCode2 + (s69Var3 != null ? s69Var3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        s69 s69Var = this.a;
        if (s69Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s69Var.writeToParcel(parcel, i);
        }
        s69 s69Var2 = this.b;
        if (s69Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s69Var2.writeToParcel(parcel, i);
        }
        s69 s69Var3 = this.c;
        if (s69Var3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s69Var3.writeToParcel(parcel, i);
        }
    }
}
