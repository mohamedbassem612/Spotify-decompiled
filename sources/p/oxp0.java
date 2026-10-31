package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oxp0 implements Parcelable {
    public static final Parcelable.Creator<oxp0> CREATOR = new ump0((byte) 27);
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final rxp0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public oxp0(String str, String str2, String str3, ArrayList arrayList, rxp0 rxp0Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = rxp0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxp0)) {
            return false;
        }
        oxp0 oxp0Var = (oxp0) obj;
        return u890.j(this.a, oxp0Var.a) && u890.j(this.b, oxp0Var.b) && u890.j(this.c, oxp0Var.c) && this.d.equals(oxp0Var.d) && u890.j(this.e, oxp0Var.e) && this.f == oxp0Var.f && this.g == oxp0Var.g && this.h == oxp0Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = p3d1.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        rxp0 rxp0Var = this.e;
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g((iF + (rxp0Var != null ? rxp0Var.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Iterator itO = xvj1.o(this.d, parcel);
        while (itO.hasNext()) {
            ((txp0) itO.next()).writeToParcel(parcel, i);
        }
        rxp0 rxp0Var = this.e;
        if (rxp0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rxp0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
