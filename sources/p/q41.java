package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q41 implements Parcelable {
    public static final Parcelable.Creator<q41> CREATOR = new gp((byte) 29);
    public final p41 a;
    public final s31 b;
    public final a11 c;

    public q41(p41 p41Var, s31 s31Var, a11 a11Var) {
        this.a = p41Var;
        this.b = s31Var;
        this.c = a11Var;
    }

    public static q41 a(q41 q41Var, p41 p41Var, s31 s31Var, int i) {
        if ((i & 1) != 0) {
            p41Var = q41Var.a;
        }
        if ((i & 2) != 0) {
            s31Var = q41Var.b;
        }
        a11 a11Var = q41Var.c;
        q41Var.getClass();
        return new q41(p41Var, s31Var, a11Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q41)) {
            return false;
        }
        q41 q41Var = (q41) obj;
        return u890.j(this.a, q41Var.a) && u890.j(this.b, q41Var.b) && u890.j(this.c, q41Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        s31 s31Var = this.b;
        return this.c.hashCode() + ((iHashCode + (s31Var == null ? 0 : s31Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        s31 s31Var = this.b;
        if (s31Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s31Var.writeToParcel(parcel, i);
        }
        this.c.writeToParcel(parcel, i);
    }
}
