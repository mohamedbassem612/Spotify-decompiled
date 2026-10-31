package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pjn implements Parcelable {
    public static final Parcelable.Creator<pjn> CREATOR = new rtm((byte) 23);
    public final gtr0 a;
    public final wh2 b;
    public final dxr0 c;
    public final yq00 d;
    public final int e;
    public final boolean f;

    public pjn(gtr0 gtr0Var, wh2 wh2Var, dxr0 dxr0Var, yq00 yq00Var, int i, boolean z) {
        this.a = gtr0Var;
        this.b = wh2Var;
        this.c = dxr0Var;
        this.d = yq00Var;
        this.e = i;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjn)) {
            return false;
        }
        pjn pjnVar = (pjn) obj;
        return u890.j(this.a, pjnVar.a) && u890.j(this.b, pjnVar.b) && u890.j(this.c, pjnVar.c) && u890.j(this.d, pjnVar.d) && this.e == pjnVar.e && this.f == pjnVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        int i = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeParcelable(this.d, i);
        int i2 = this.e;
        if (i2 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            if (i2 == 1) {
                str = "MaxChildrenReached";
            } else if (i2 == 2) {
                str = "ParentalAge";
            } else {
                if (i2 != 3) {
                    throw null;
                }
                str = "NotAllowed";
            }
            parcel.writeString(str);
        }
        parcel.writeInt(this.f ? 1 : 0);
    }
}
