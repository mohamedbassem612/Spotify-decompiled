package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x8m1 implements d9m1 {
    public static final Parcelable.Creator<x8m1> CREATOR = new w8m1(0);
    public final String a;
    public final ual1 b;
    public final sju c;

    public x8m1(String str, ual1 ual1Var, sju sjuVar) {
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
        if (!(obj instanceof x8m1)) {
            return false;
        }
        x8m1 x8m1Var = (x8m1) obj;
        return u890.j(this.a, x8m1Var.a) && u890.j(this.b, x8m1Var.b) && u890.j(this.c, x8m1Var.c);
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
