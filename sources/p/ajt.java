package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ajt implements cjt {
    public static final Parcelable.Creator<ajt> CREATOR = new qms((byte) 12);
    public final hm a;
    public final n5o b;

    public ajt(hm hmVar, n5o n5oVar) {
        this.a = hmVar;
        this.b = n5oVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajt)) {
            return false;
        }
        ajt ajtVar = (ajt) obj;
        return u890.j(this.a, ajtVar.a) && u890.j(this.b, ajtVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        n5o n5oVar = this.b;
        return iHashCode + (n5oVar == null ? 0 : n5oVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        n5o n5oVar = this.b;
        if (n5oVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            n5oVar.writeToParcel(parcel, i);
        }
    }
}
