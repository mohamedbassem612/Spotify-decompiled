package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bzn implements Parcelable {
    public static final Parcelable.Creator<bzn> CREATOR = new upn((byte) 16);
    public final String a;
    public final td10 b;
    public final boolean c;

    public bzn(String str, td10 td10Var, int i) {
        this(str, (i & 2) != 0 ? new td10(null, str, null, null) : td10Var, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzn)) {
            return false;
        }
        bzn bznVar = (bzn) obj;
        return u890.j(this.a, bznVar.a) && u890.j(this.b, bznVar.b) && this.c == bznVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        td10 td10Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (td10Var == null ? 0 : td10Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public bzn(String str, td10 td10Var, boolean z) {
        this.a = str;
        this.b = td10Var;
        this.c = z;
    }
}
