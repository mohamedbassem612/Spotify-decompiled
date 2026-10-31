package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w4i1 implements Parcelable {
    public static final Parcelable.Creator<w4i1> CREATOR = new gwg1((byte) 25);
    public static final w4i1 f;
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;

    static {
        String str = "";
        f = new w4i1(str, str, 12, (String) null);
    }

    public w4i1(String str, String str2, Integer num, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = pcf.j(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4i1)) {
            return false;
        }
        w4i1 w4i1Var = (w4i1) obj;
        return u890.j(this.a, w4i1Var.a) && u890.j(this.b, w4i1Var.b) && u890.j(this.c, w4i1Var.c) && u890.j(this.d, w4i1Var.d);
    }

    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }

    public /* synthetic */ w4i1(String str, String str2, int i, String str3) {
        this(str, str2, (Integer) null, (i & 4) != 0 ? null : str3);
    }
}
