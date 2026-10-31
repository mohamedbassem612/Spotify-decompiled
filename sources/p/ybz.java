package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ybz implements Parcelable {
    public static final Parcelable.Creator<ybz> CREATOR = new jhy(28);
    public final h281 a;
    public final j1z b;
    public final dhe c;
    public final llg d;
    public final jlw0 e;
    public final so71 f;
    public final String g;

    public ybz(h281 h281Var, j1z j1zVar, dhe dheVar, llg llgVar, jlw0 jlw0Var, so71 so71Var, String str) {
        this.a = h281Var;
        this.b = j1zVar;
        this.c = dheVar;
        this.d = llgVar;
        this.e = jlw0Var;
        this.f = so71Var;
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybz)) {
            return false;
        }
        ybz ybzVar = (ybz) obj;
        return u890.j(this.a, ybzVar.a) && u890.j(this.b, ybzVar.b) && u890.j(this.c, ybzVar.c) && u890.j(this.d, ybzVar.d) && u890.j(this.e, ybzVar.e) && u890.j(this.f, ybzVar.f) && u890.j(this.g, ybzVar.g);
    }

    public final int hashCode() {
        h281 h281Var = this.a;
        int iHashCode = (this.b.hashCode() + ((h281Var == null ? 0 : h281Var.hashCode()) * 31)) * 31;
        dhe dheVar = this.c;
        int iHashCode2 = (iHashCode + (dheVar == null ? 0 : dheVar.hashCode())) * 31;
        llg llgVar = this.d;
        int iHashCode3 = (iHashCode2 + (llgVar == null ? 0 : llgVar.hashCode())) * 31;
        jlw0 jlw0Var = this.e;
        int iHashCode4 = (this.f.hashCode() + ((iHashCode3 + (jlw0Var == null ? 0 : jlw0Var.hashCode())) * 31)) * 31;
        String str = this.g;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        h281 h281Var = this.a;
        if (h281Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            h281Var.writeToParcel(parcel, i);
        }
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        this.f.writeToParcel(parcel, i);
        parcel.writeString(this.g);
    }
}
