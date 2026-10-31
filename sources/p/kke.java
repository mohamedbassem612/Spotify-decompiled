package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kke implements pn71 {
    public static final Parcelable.Creator<kke> CREATOR = new zge((byte) 3);
    public final wke a;
    public final int b;

    public kke(wke wkeVar, int i) {
        this.a = wkeVar;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kke)) {
            return false;
        }
        kke kkeVar = (kke) obj;
        return u890.j(this.a, kkeVar.a) && this.b == kkeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
    }
}
