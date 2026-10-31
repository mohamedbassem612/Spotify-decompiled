package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class av1 implements Parcelable {
    public static final Parcelable.Creator<av1> CREATOR = new d41(25);
    public final Set X;
    public final String a;
    public final zu1 b;
    public final String c;
    public final List d;
    public final String e;
    public final Set f;
    public final boolean g;
    public final Set h;
    public final gy1 i;
    public final boolean t;

    public av1(String str, zu1 zu1Var, String str2, List list, String str3, Set set, boolean z, Set set2, gy1 gy1Var, boolean z2, Set set3) {
        this.a = str;
        this.b = zu1Var;
        this.c = str2;
        this.d = list;
        this.e = str3;
        this.f = set;
        this.g = z;
        this.h = set2;
        this.i = gy1Var;
        this.t = z2;
        this.X = set3;
    }

    public final zu1 a() {
        return this.b;
    }

    public final List b() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av1)) {
            return false;
        }
        av1 av1Var = (av1) obj;
        return u890.j(this.a, av1Var.a) && u890.j(this.b, av1Var.b) && u890.j(this.c, av1Var.c) && u890.j(this.d, av1Var.d) && u890.j(this.e, av1Var.e) && u890.j(this.f, av1Var.f) && this.g == av1Var.g && u890.j(this.h, av1Var.h) && u890.j(this.i, av1Var.i) && this.t == av1Var.t && u890.j(this.X, av1Var.X);
    }

    public final String g() {
        return this.e;
    }

    public final String getUsername() {
        return this.a;
    }

    public final gy1 h() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zu1 zu1Var = this.b;
        return this.X.hashCode() + xcg1.g((this.i.hashCode() + gvg.c(xcg1.g(gvg.c(cy30.d(f4i1.b(cy30.d((iHashCode + (zu1Var == null ? 0 : zu1Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        zu1 zu1Var = this.b;
        if (zu1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zu1Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        parcel.writeString(this.e);
        Iterator itH = k4s0.h(this.f, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        parcel.writeInt(this.g ? 1 : 0);
        Iterator itH2 = k4s0.h(this.h, parcel);
        while (itH2.hasNext()) {
            parcel.writeString((String) itH2.next());
        }
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.t ? 1 : 0);
        Iterator itH3 = k4s0.h(this.X, parcel);
        while (itH3.hasNext()) {
            parcel.writeString((String) itH3.next());
        }
    }
}
