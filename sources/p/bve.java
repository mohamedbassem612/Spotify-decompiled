package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bve implements Parcelable {
    public static final Parcelable.Creator<bve> CREATOR = new zge((byte) 19);
    public final qte a;
    public final boolean b;

    public bve(qte qteVar, boolean z) {
        this.a = qteVar;
        this.b = z;
    }

    public static bve a(bve bveVar, qte qteVar, boolean z, int i) {
        if ((i & 1) != 0) {
            qteVar = bveVar.a;
        }
        if ((i & 2) != 0) {
            z = bveVar.b;
        }
        return new bve(qteVar, z);
    }

    public final qte b() {
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
        if (!(obj instanceof bve)) {
            return false;
        }
        bve bveVar = (bve) obj;
        return u890.j(this.a, bveVar.a) && this.b == bveVar.b;
    }

    public final boolean g() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
