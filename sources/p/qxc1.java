package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qxc1 implements dtb1 {
    public static final Parcelable.Creator<qxc1> CREATOR = new pxc1((byte) 0);
    public final d761 a;
    public final d761 b;
    public final String c;
    public final String d;
    public final oxc1 e;
    public final Integer f;
    public final String g;

    public /* synthetic */ qxc1(d761 d761Var, d761 d761Var2, String str, String str2, oxc1 oxc1Var, Integer num, int i) {
        this(d761Var, d761Var2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : oxc1Var, (i & 32) != 0 ? null : num);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxc1)) {
            return false;
        }
        qxc1 qxc1Var = (qxc1) obj;
        return u890.j(this.a, qxc1Var.a) && u890.j(this.b, qxc1Var.b) && u890.j(this.c, qxc1Var.c) && u890.j(this.d, qxc1Var.d) && u890.j(this.e, qxc1Var.e) && u890.j(this.f, qxc1Var.f);
    }

    public final String getId() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.a.a) * 31;
        d761 d761Var = this.b;
        int iHashCode2 = (iHashCode + (d761Var == null ? 0 : Arrays.hashCode(d761Var.a))) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        oxc1 oxc1Var = this.e;
        int iHashCode5 = (iHashCode4 + (oxc1Var == null ? 0 : oxc1Var.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        oxc1 oxc1Var = this.e;
        if (oxc1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oxc1Var.writeToParcel(parcel, i);
        }
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }

    public qxc1(d761 d761Var, d761 d761Var2, String str, String str2, oxc1 oxc1Var, Integer num) {
        this.a = d761Var;
        this.b = d761Var2;
        this.c = str;
        this.d = str2;
        this.e = oxc1Var;
        this.f = num;
        this.g = "Summary";
    }
}
