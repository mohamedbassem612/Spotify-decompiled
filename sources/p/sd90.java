package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sd90 implements ud90 {
    public static final Parcelable.Creator<sd90> CREATOR = new xl80((byte) 20);
    public final piz a;

    public sd90(piz pizVar) {
        this.a = pizVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd90) && u890.j(this.a, ((sd90) obj).a);
    }

    public final int hashCode() {
        piz pizVar = this.a;
        if (pizVar == null) {
            return 0;
        }
        return pizVar.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
