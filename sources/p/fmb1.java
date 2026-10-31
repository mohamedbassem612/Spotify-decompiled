package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fmb1 implements pnb1 {
    public static final Parcelable.Creator<fmb1> CREATOR = new olb1((byte) 6);
    public final String a;
    public final piz b;
    public final boolean c;
    public final boolean d;

    public fmb1(String str, piz pizVar, boolean z, boolean z2) {
        this.a = str;
        this.b = pizVar;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmb1)) {
            return false;
        }
        fmb1 fmb1Var = (fmb1) obj;
        return u890.j(this.a, fmb1Var.a) && u890.j(this.b, fmb1Var.b) && this.c == fmb1Var.c && this.d == fmb1Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        piz pizVar = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (pizVar == null ? 0 : pizVar.hashCode())) * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
