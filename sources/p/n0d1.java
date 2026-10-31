package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n0d1 implements Parcelable {
    public static final Parcelable.Creator<n0d1> CREATOR = new pxc1((byte) 3);
    public final o0d1 a;
    public final List b;

    public n0d1(o0d1 o0d1Var, List list) {
        this.a = o0d1Var;
        this.b = list;
    }

    public final o0d1 a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0d1)) {
            return false;
        }
        n0d1 n0d1Var = (n0d1) obj;
        return u890.j(this.a, n0d1Var.a) && this.b.equals(n0d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }
}
