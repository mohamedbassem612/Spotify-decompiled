package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gf2 implements Parcelable {
    public static final Parcelable.Creator<gf2> CREATOR = new ue2((byte) 1);
    public final h8b a;
    public final Integer b;

    public gf2(h8b h8bVar, Integer num) {
        this.a = h8bVar;
        this.b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf2)) {
            return false;
        }
        gf2 gf2Var = (gf2) obj;
        return this.a == gf2Var.a && u890.j(this.b, gf2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
