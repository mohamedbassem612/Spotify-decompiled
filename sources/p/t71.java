package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t71 implements Parcelable {
    public static final Parcelable.Creator<t71> CREATOR = new d41((byte) 10);
    public final List a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final Integer f;
    public final String g;

    public t71(List list, boolean z, int i, boolean z2, boolean z3, Integer num, String str) {
        this.a = list;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = z3;
        this.f = num;
        this.g = str;
    }

    public static t71 a(t71 t71Var, int i) {
        return new t71(t71Var.a, t71Var.b, i, t71Var.d, t71Var.e, t71Var.f, t71Var.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t71)) {
            return false;
        }
        t71 t71Var = (t71) obj;
        return this.a.equals(t71Var.a) && this.b == t71Var.b && this.c == t71Var.c && this.d == t71Var.d && this.e == t71Var.e && u890.j(this.f, t71Var.f) && u890.j(this.g, t71Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(ab80.k(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        Integer num = this.f;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((y8t0) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b ? 1 : 0);
        int i2 = this.c;
        if (i2 == 1) {
            str = "READY";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "LOADING";
        }
        parcel.writeString(str);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeString(this.g);
    }
}
