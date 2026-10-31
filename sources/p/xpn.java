package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xpn implements ypn {
    public static final Parcelable.Creator<xpn> CREATOR = new upn((byte) 3);
    public final String a;
    public final g3d0 b;

    public xpn(String str, g3d0 g3d0Var) {
        this.a = str;
        this.b = g3d0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpn)) {
            return false;
        }
        xpn xpnVar = (xpn) obj;
        return u890.j(this.a, xpnVar.a) && u890.j(this.b, xpnVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        g3d0 g3d0Var = this.b;
        return iHashCode + (g3d0Var != null ? g3d0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public /* synthetic */ xpn() {
        this(null, null);
    }
}
