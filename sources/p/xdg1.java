package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xdg1 implements Parcelable {
    public static final Parcelable.Creator<xdg1> CREATOR = new h3g1((byte) 3);
    public final List a;
    public final g061 b;
    public final n5e0 c;

    public xdg1(List list, g061 g061Var, n5e0 n5e0Var) {
        this.a = list;
        this.b = g061Var;
        this.c = n5e0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdg1)) {
            return false;
        }
        xdg1 xdg1Var = (xdg1) obj;
        return u890.j(this.a, xdg1Var.a) && u890.j(this.b, xdg1Var.b) && u890.j(this.c, xdg1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
    }
}
