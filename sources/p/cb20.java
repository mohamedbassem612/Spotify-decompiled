package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cb20 implements Parcelable {
    public static final Parcelable.Creator<cb20> CREATOR = new u220((byte) 28);
    public final String a;
    public final Integer b;
    public final String c;
    public final Integer d;

    public cb20(Integer num, Integer num2, String str, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb20)) {
            return false;
        }
        cb20 cb20Var = (cb20) obj;
        return u890.j(this.a, cb20Var.a) && u890.j(this.b, cb20Var.b) && u890.j(this.c, cb20Var.c) && u890.j(this.d, cb20Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iD = cy30.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        Integer num2 = this.d;
        return iD + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeString(this.c);
        Integer num2 = this.d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num2);
        }
    }
}
