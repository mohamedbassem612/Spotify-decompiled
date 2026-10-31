package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lgm1 implements vgm1 {
    public static final Parcelable.Creator<lgm1> CREATOR = new lfm1((byte) 11);
    public final String a;
    public final ual1 b;
    public final sju c;

    public lgm1(String str, ual1 ual1Var, sju sjuVar) {
        this.a = str;
        this.b = ual1Var;
        this.c = sjuVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgm1)) {
            return false;
        }
        lgm1 lgm1Var = (lgm1) obj;
        return u890.j(this.a, lgm1Var.a) && u890.j(this.b, lgm1Var.b) && u890.j(this.c, lgm1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        sju sjuVar = this.c;
        return iHashCode + (sjuVar == null ? 0 : sjuVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
