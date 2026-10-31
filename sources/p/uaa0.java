package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uaa0 implements Parcelable {
    public static final Parcelable.Creator<uaa0> CREATOR = new qg90((byte) 29);
    public final taa0 a;
    public final x6b b;
    public final x6b c;

    public uaa0(taa0 taa0Var, x6b x6bVar, x6b x6bVar2) {
        this.a = taa0Var;
        this.b = x6bVar;
        this.c = x6bVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaa0)) {
            return false;
        }
        uaa0 uaa0Var = (uaa0) obj;
        return u890.j(this.a, uaa0Var.a) && u890.j(this.b, uaa0Var.b) && u890.j(this.c, uaa0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.a.hashCode() * 31;
        x6b x6bVar = this.b;
        int iHashCode2 = (iHashCode + (x6bVar == null ? 0 : x6bVar.a.hashCode())) * 31;
        x6b x6bVar2 = this.c;
        return iHashCode2 + (x6bVar2 != null ? x6bVar2.a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        x6b x6bVar = this.b;
        if (x6bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            x6bVar.writeToParcel(parcel, i);
        }
        x6b x6bVar2 = this.c;
        if (x6bVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            x6bVar2.writeToParcel(parcel, i);
        }
    }
}
