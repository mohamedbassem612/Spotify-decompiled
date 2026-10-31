package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kbn implements Parcelable {
    public static final Parcelable.Creator<kbn> CREATOR = new rtm((byte) 19);
    public final tan a;
    public final boolean b;

    public kbn(tan tanVar, boolean z) {
        this.a = tanVar;
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
        if (!(obj instanceof kbn)) {
            return false;
        }
        kbn kbnVar = (kbn) obj;
        return u890.j(this.a, kbnVar.a) && this.b == kbnVar.b;
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
