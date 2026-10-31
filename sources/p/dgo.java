package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dgo implements Parcelable {
    public static final Parcelable.Creator<dgo> CREATOR = new rco((byte) 3);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final llw0 e;
    public final int f;
    public final xn10 g;
    public final z771 h;

    public dgo(String str, String str2, String str3, String str4, llw0 llw0Var, int i, xn10 xn10Var, z771 z771Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = llw0Var;
        this.f = i;
        this.g = xn10Var;
        this.h = z771Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgo)) {
            return false;
        }
        dgo dgoVar = (dgo) obj;
        return u890.j(this.a, dgoVar.a) && u890.j(this.b, dgoVar.b) && u890.j(this.c, dgoVar.c) && u890.j(this.d, dgoVar.d) && u890.j(this.e, dgoVar.e) && this.f == dgoVar.f && u890.j(this.g, dgoVar.g) && u890.j(this.h, dgoVar.h);
    }

    public final int hashCode() {
        return this.h.a.hashCode() + ((this.g.hashCode() + ab80.k(this.f, (this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(lf51.q(this.f));
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
    }
}
