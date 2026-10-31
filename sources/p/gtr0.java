package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gtr0 implements Parcelable {
    public static final Parcelable.Creator<gtr0> CREATOR = new zsr0((byte) 1);
    public final boolean a;
    public final tpw0 b;
    public final boolean c;
    public final ArrayList d;

    public gtr0(boolean z, tpw0 tpw0Var, boolean z2, ArrayList arrayList) {
        this.a = z;
        this.b = tpw0Var;
        this.c = z2;
        this.d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtr0)) {
            return false;
        }
        gtr0 gtr0Var = (gtr0) obj;
        return this.a == gtr0Var.a && this.b == gtr0Var.b && this.c == gtr0Var.c && this.d.equals(gtr0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        this.b.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
        Iterator itO = xvj1.o(this.d, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
    }
}
