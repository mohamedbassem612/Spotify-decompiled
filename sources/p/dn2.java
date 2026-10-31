package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dn2 implements Parcelable {
    public static final Parcelable.Creator<dn2> CREATOR = new ue2((byte) 19);
    public final int a;
    public final int b;
    public final List c;
    public final int d;

    public dn2(int i, int i2, int i3, List list) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn2)) {
            return false;
        }
        dn2 dn2Var = (dn2) obj;
        return this.a == dn2Var.a && this.b == dn2Var.b && this.c.equals(dn2Var.c) && this.d == dn2Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f4i1.b(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.d);
    }
}
