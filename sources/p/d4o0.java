package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d4o0 implements Parcelable {
    public static final Parcelable.Creator<d4o0> CREATOR = new dan0(29);
    public final int a;
    public final String b;
    public final ArrayList c;
    public final boolean d;
    public final y0o0 e;
    public final boolean f;

    public d4o0(int i, String str, ArrayList arrayList, boolean z, y0o0 y0o0Var, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
        this.d = z;
        this.e = y0o0Var;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4o0)) {
            return false;
        }
        d4o0 d4o0Var = (d4o0) obj;
        return this.a == d4o0Var.a && u890.j(this.b, d4o0Var.b) && this.c.equals(d4o0Var.c) && this.d == d4o0Var.d && u890.j(this.e, d4o0Var.e) && this.f == d4o0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + xcg1.g(p3d1.f(this.c, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            ((c4o0) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
