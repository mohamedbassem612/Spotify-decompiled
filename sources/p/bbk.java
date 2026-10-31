package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bbk implements nb10 {
    public static final Parcelable.Creator<bbk> CREATOR = new v6h((byte) 18);
    public final int a;
    public final Long b;
    public final Long c;

    public bbk(int i, Long l, Long l2) {
        this.a = i;
        this.b = l;
        this.c = l2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbk)) {
            return false;
        }
        bbk bbkVar = (bbk) obj;
        return this.a == bbkVar.a && u890.j(this.b, bbkVar.b) && u890.j(this.c, bbkVar.c);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        Long l = this.b;
        int iHashCode = (iC + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.a) {
            case 1:
                str = "UNSPECIFIED";
                break;
            case 2:
                str = "RESERVED";
                break;
            case 3:
                str = "FCFS";
                break;
            case 4:
                str = "WAITLISTED";
                break;
            case 5:
                str = "PURCHASED";
                break;
            case 6:
                str = "INELIGIBLE";
                break;
            case 7:
                str = "SOLD_OUT";
                break;
            case 8:
                str = "CANCELLED";
                break;
            case 9:
                str = "SALE_ENDED";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        Long l2 = this.c;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l2);
        }
    }
}
