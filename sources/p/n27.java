package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n27 implements Parcelable {
    public static final Parcelable.Creator<n27> CREATOR = new fp5((byte) 26);
    public final String a;
    public final Integer b;
    public final Integer c;

    public n27(Integer num, String str, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n27)) {
            return false;
        }
        n27 n27Var = (n27) obj;
        return u890.j(this.a, n27Var.a) && u890.j(this.b, n27Var.b) && u890.j(this.c, n27Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
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
        Integer num2 = this.c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num2);
        }
    }
}
