package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a11 implements Parcelable {
    public static final Parcelable.Creator<a11> CREATOR = new gp((byte) 25);
    public final Set a;
    public final w6s b;
    public final mj01 c;

    public a11(Set set, w6s w6sVar, mj01 mj01Var) {
        this.a = set;
        this.b = w6sVar;
        this.c = mj01Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a11)) {
            return false;
        }
        a11 a11Var = (a11) obj;
        return this.a.equals(a11Var.a) && u890.j(this.b, a11Var.b) && u890.j(this.c, a11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itH = k4s0.h(this.a, parcel);
        while (itH.hasNext()) {
            parcel.writeParcelable((Parcelable) itH.next(), i);
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
