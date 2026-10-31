package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class shj1 extends c871 {
    public static final Parcelable.Creator<shj1> CREATOR = new nhj1((byte) 2);
    public final jlw0 a;
    public final jlw0 b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;
    public final boolean g;
    public final String h;
    public final String i;

    public shj1(jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str, long j, boolean z, String str2, String str3) {
        this.a = jlw0Var;
        this.b = jlw0Var2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = j;
        this.g = z;
        this.h = str2;
        this.i = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shj1)) {
            return false;
        }
        shj1 shj1Var = (shj1) obj;
        return u890.j(this.a, shj1Var.a) && u890.j(this.b, shj1Var.b) && this.c == shj1Var.c && this.d == shj1Var.d && u890.j(this.e, shj1Var.e) && vve1.a(this.f, shj1Var.f) && this.g == shj1Var.g && u890.j(this.h, shj1Var.h) && u890.j(this.i, shj1Var.i);
    }

    public final int hashCode() {
        jlw0 jlw0Var = this.a;
        return this.i.hashCode() + cy30.d(xcg1.g(cy30.f(cy30.d(kaa0.f(this.d, kaa0.f(this.c, (this.b.hashCode() + ((jlw0Var == null ? 0 : jlw0Var.hashCode()) * 31)) * 31, 31), 31), 31, this.e), this.f, 31), 31, this.g), 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(new vve1(this.f), i);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
