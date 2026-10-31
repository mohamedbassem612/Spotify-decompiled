package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cam1 implements pam1 {
    public static final Parcelable.Creator<cam1> CREATOR = new w8m1((byte) 13);
    public final String a;
    public final ual1 b;
    public final sju c;

    public cam1(String str, ual1 ual1Var, sju sjuVar) {
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
        if (!(obj instanceof cam1)) {
            return false;
        }
        cam1 cam1Var = (cam1) obj;
        return u890.j(this.a, cam1Var.a) && u890.j(this.b, cam1Var.b) && u890.j(this.c, cam1Var.c);
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
