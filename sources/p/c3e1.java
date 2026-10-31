package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c3e1 extends c871 {
    public static final Parcelable.Creator<c3e1> CREATOR = new pwd1((byte) 6);
    public final String X;
    public final long a;
    public final fee1 b;
    public final String c;
    public final int d;
    public final int e;
    public final jlw0 f;
    public final String g;
    public final String h;
    public final s171 i;
    public final String t;

    public c3e1(long j, fee1 fee1Var, String str, int i, int i2, jlw0 jlw0Var, String str2, String str3, s171 s171Var, String str4, String str5) {
        this.a = j;
        this.b = fee1Var;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = jlw0Var;
        this.g = str2;
        this.h = str3;
        this.i = s171Var;
        this.t = str4;
        this.X = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3e1)) {
            return false;
        }
        c3e1 c3e1Var = (c3e1) obj;
        return vve1.a(this.a, c3e1Var.a) && u890.j(this.b, c3e1Var.b) && u890.j(this.c, c3e1Var.c) && this.d == c3e1Var.d && this.e == c3e1Var.e && u890.j(this.f, c3e1Var.f) && u890.j(this.g, c3e1Var.g) && u890.j(this.h, c3e1Var.h) && u890.j(this.i, c3e1Var.i) && u890.j(this.t, c3e1Var.t) && u890.j(this.X, c3e1Var.X);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + cy30.d(cy30.d((this.f.hashCode() + kaa0.f(this.e, kaa0.f(this.d, cy30.d((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31)) * 31, 31, this.g), 31, this.h)) * 31;
        String str = this.t;
        return this.X.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new vve1(this.a), i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeString(this.t);
        parcel.writeString(this.X);
    }
}
