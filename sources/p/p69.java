package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p69 implements Parcelable {
    public static final Parcelable.Creator<p69> CREATOR = new so8((byte) 11);
    public final List a;
    public final double b;
    public final double c;

    public p69(AbstractList abstractList, double d, double d2) {
        this.a = abstractList;
        this.b = d;
        this.c = d2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p69)) {
            return false;
        }
        p69 p69Var = (p69) obj;
        return this.a.equals(p69Var.a) && Double.compare(this.b, p69Var.b) == 0 && Double.compare(this.c, p69Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + xcg1.e(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((y9v0) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
    }
}
