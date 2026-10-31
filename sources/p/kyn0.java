package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kyn0 implements Parcelable {
    public static final Parcelable.Creator<kyn0> CREATOR = new dan0((byte) 17);
    public final nsn0 a;
    public final int b;
    public final boolean c;
    public final List d;

    public kyn0(nsn0 nsn0Var, int i, boolean z, List list) {
        this.a = nsn0Var;
        this.b = i;
        this.c = z;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyn0)) {
            return false;
        }
        kyn0 kyn0Var = (kyn0) obj;
        return u890.j(this.a, kyn0Var.a) && this.b == kyn0Var.b && this.c == kyn0Var.c && u890.j(this.d, kyn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qqn1.a0(this.a, parcel);
        parcel.writeString(cfm0.q(this.b));
        parcel.writeInt(this.c ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            prn1.z((wvn0) itM.next(), parcel);
        }
    }

    public /* synthetic */ kyn0(nsn0 nsn0Var, int i, List list, int i2) {
        this(nsn0Var, i, false, (i2 & 8) != 0 ? z6x.a : list);
    }
}
