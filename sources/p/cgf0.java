package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cgf0 implements pn71 {
    public static final Parcelable.Creator<cgf0> CREATOR = new j7f0((byte) 13);
    public final int a;
    public final String b;
    public final ArrayList c;
    public final bff0 d;
    public final String e;

    public cgf0(int i, String str, ArrayList arrayList, bff0 bff0Var, String str2) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
        this.d = bff0Var;
        this.e = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgf0)) {
            return false;
        }
        cgf0 cgf0Var = (cgf0) obj;
        return this.a == cgf0Var.a && u890.j(this.b, cgf0Var.b) && this.c.equals(cgf0Var.c) && u890.j(this.d, cgf0Var.d) && u890.j(this.e, cgf0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p3d1.f(this.c, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            parcel.writeInt(((Number) itO.next()).intValue());
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }
}
