package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vpn implements aqn {
    public static final Parcelable.Creator<vpn> CREATOR = new upn((byte) 0);
    public final List a;
    public final boolean b;

    public vpn(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpn)) {
            return false;
        }
        vpn vpnVar = (vpn) obj;
        return u890.j(this.a, vpnVar.a) && this.b == vpnVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // p.aqn
    public final boolean k0() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
