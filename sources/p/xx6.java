package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xx6 implements Parcelable {
    public static final Parcelable.Creator<xx6> CREATOR = new fp5(24);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final List i;

    public xx6(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx6)) {
            return false;
        }
        xx6 xx6Var = (xx6) obj;
        return u890.j(this.a, xx6Var.a) && u890.j(this.b, xx6Var.b) && u890.j(this.c, xx6Var.c) && this.d == xx6Var.d && this.e == xx6Var.e && this.f == xx6Var.f && this.g == xx6Var.g && this.h == xx6Var.h && this.i.equals(xx6Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.i);
        while (itM.hasNext()) {
            ((gp51) itM.next()).writeToParcel(parcel, i);
        }
    }
}
