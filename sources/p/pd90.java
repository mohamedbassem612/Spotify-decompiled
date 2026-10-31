package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pd90 implements rd90 {
    public static final Parcelable.Creator<pd90> CREATOR = new xl80((byte) 17);
    public final piz a;

    public pd90(piz pizVar) {
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
        return (obj instanceof pd90) && u890.j(this.a, ((pd90) obj).a);
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
