package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zb60 implements Parcelable {
    public static final Parcelable.Creator<zb60> CREATOR = new xk50((byte) 19);
    public final Long a;
    public final String b;

    public zb60(Long l, String str) {
        this.a = l;
        this.b = str;
    }

    public final Long a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb60)) {
            return false;
        }
        zb60 zb60Var = (zb60) obj;
        return u890.j(this.a, zb60Var.a) && u890.j(this.b, zb60Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        parcel.writeString(this.b);
    }
}
