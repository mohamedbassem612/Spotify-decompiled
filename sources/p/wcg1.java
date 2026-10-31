package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wcg1 implements Parcelable {
    public static final Parcelable.Creator<wcg1> CREATOR = new h3g1((byte) 2);
    public final List a;
    public final Integer b;
    public final Integer c;
    public final n5e0 d;
    public final int e;
    public final String f;

    public wcg1(List list, Integer num, Integer num2, n5e0 n5e0Var, int i, String str) {
        this.a = list;
        this.b = num;
        this.c = num2;
        this.d = n5e0Var;
        this.e = i;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcg1)) {
            return false;
        }
        wcg1 wcg1Var = (wcg1) obj;
        return u890.j(this.a, wcg1Var.a) && u890.j(this.b, wcg1Var.b) && u890.j(this.c, wcg1Var.c) && u890.j(this.d, wcg1Var.d) && this.e == wcg1Var.e && u890.j(this.f, wcg1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return this.f.hashCode() + ab80.k(this.e, (this.d.hashCode() + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
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
        parcel.writeParcelable(this.d, i);
        int i2 = this.e;
        if (i2 == 1) {
            str = "ReadAlongPage";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "ScrollCard";
        }
        parcel.writeString(str);
        parcel.writeString(this.f);
    }
}
