package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s5k0 implements Parcelable {
    public static final Parcelable.Creator<s5k0> CREATOR = new ohj0((byte) 13);
    public final List a;
    public final String b;
    public final gub1 c;

    public s5k0(List list, String str, gub1 gub1Var) {
        this.a = list;
        this.b = str;
        this.c = gub1Var;
    }

    public static s5k0 a(s5k0 s5k0Var, ArrayList arrayList, gub1 gub1Var, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = s5k0Var.a;
        }
        String str = s5k0Var.b;
        if ((i & 4) != 0) {
            gub1Var = s5k0Var.c;
        }
        return new s5k0(list, str, gub1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5k0)) {
            return false;
        }
        s5k0 s5k0Var = (s5k0) obj;
        return u890.j(this.a, s5k0Var.a) && u890.j(this.b, s5k0Var.b) && u890.j(this.c, s5k0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((fy00) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
