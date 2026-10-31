package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vmp0 implements xmp0 {
    public static final Parcelable.Creator<vmp0> CREATOR = new ump0((byte) 1);
    public final piz a;

    public vmp0(piz pizVar) {
        this.a = pizVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vmp0) && u890.j(this.a, ((vmp0) obj).a);
    }

    public final int hashCode() {
        piz pizVar = this.a;
        if (pizVar == null) {
            return 0;
        }
        return pizVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
