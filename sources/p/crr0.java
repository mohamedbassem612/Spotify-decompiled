package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class crr0 implements Parcelable {
    public static final Parcelable.Creator<crr0> CREATOR = new elr0((byte) 22);
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final Integer e;
    public final int f;

    public crr0(String str, String str2, String str3, List list, Integer num, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = num;
        this.f = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crr0)) {
            return false;
        }
        crr0 crr0Var = (crr0) obj;
        return u890.j(this.a, crr0Var.a) && u890.j(this.b, crr0Var.b) && u890.j(this.c, crr0Var.c) && u890.j(this.d, crr0Var.d) && u890.j(this.e, crr0Var.e) && this.f == crr0Var.f;
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        return l1d.C(this.f) + ((iB + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        int i2 = this.f;
        if (i2 == 1) {
            str = "PLACEHOLDER";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "SHOW";
        }
        parcel.writeString(str);
    }
}
