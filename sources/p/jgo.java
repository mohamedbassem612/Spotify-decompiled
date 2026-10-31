package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jgo extends c871 {
    public static final Parcelable.Creator<jgo> CREATOR = new rco((byte) 4);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final xn10 e;
    public final llw0 f;

    public jgo(String str, String str2, String str3, String str4, xn10 xn10Var, llw0 llw0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = xn10Var;
        this.f = llw0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgo)) {
            return false;
        }
        jgo jgoVar = (jgo) obj;
        return u890.j(this.a, jgoVar.a) && u890.j(this.b, jgoVar.b) && u890.j(this.c, jgoVar.c) && u890.j(this.d, jgoVar.d) && u890.j(this.e, jgoVar.e) && u890.j(this.f, jgoVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }
}
