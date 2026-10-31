package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ipr0 implements Parcelable {
    public static final Parcelable.Creator<ipr0> CREATOR = new elr0((byte) 10);
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final fpr0 e;
    public final fpr0 f;
    public final Integer g;

    public ipr0(String str, int i, int i2, int i3, fpr0 fpr0Var, fpr0 fpr0Var2, Integer num) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = fpr0Var;
        this.f = fpr0Var2;
        this.g = num;
    }

    public static ipr0 a(ipr0 ipr0Var, String str) {
        int i = ipr0Var.b;
        int i2 = ipr0Var.c;
        int i3 = ipr0Var.d;
        fpr0 fpr0Var = ipr0Var.e;
        fpr0 fpr0Var2 = ipr0Var.f;
        Integer num = ipr0Var.g;
        ipr0Var.getClass();
        return new ipr0(str, i, i2, i3, fpr0Var, fpr0Var2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipr0)) {
            return false;
        }
        ipr0 ipr0Var = (ipr0) obj;
        return u890.j(this.a, ipr0Var.a) && this.b == ipr0Var.b && this.c == ipr0Var.c && this.d == ipr0Var.d && u890.j(this.e, ipr0Var.e) && u890.j(this.f, ipr0Var.f) && u890.j(this.g, ipr0Var.g);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
        fpr0 fpr0Var = this.e;
        int iHashCode = (iF + (fpr0Var == null ? 0 : fpr0Var.hashCode())) * 31;
        fpr0 fpr0Var2 = this.f;
        int iHashCode2 = (iHashCode + (fpr0Var2 == null ? 0 : fpr0Var2.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        fpr0 fpr0Var = this.e;
        if (fpr0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fpr0Var.writeToParcel(parcel, i);
        }
        fpr0 fpr0Var2 = this.f;
        if (fpr0Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fpr0Var2.writeToParcel(parcel, i);
        }
        Integer num = this.g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }

    public /* synthetic */ ipr0(String str, int i, int i2) {
        this(str, i, i2, 0, null, null, null);
    }
}
