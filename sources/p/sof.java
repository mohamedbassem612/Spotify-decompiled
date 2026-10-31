package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sof extends uof {
    public static final Parcelable.Creator<sof> CREATOR = new zbf((byte) 27);
    public final piz a;

    public sof(piz pizVar) {
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
        return (obj instanceof sof) && u890.j(this.a, ((sof) obj).a);
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
