package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qfj1 implements ci51 {
    public static final Parcelable.Creator<qfj1> CREATOR = new xbi1((byte) 27);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final String t;

    public qfj1(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = z;
        this.i = z2;
        this.t = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfj1)) {
            return false;
        }
        qfj1 qfj1Var = (qfj1) obj;
        return u890.j(this.a, qfj1Var.a) && u890.j(this.b, qfj1Var.b) && u890.j(this.c, qfj1Var.c) && u890.j(this.d, qfj1Var.d) && u890.j(this.e, qfj1Var.e) && this.f == qfj1Var.f && this.g == qfj1Var.g && this.h == qfj1Var.h && this.i == qfj1Var.i && u890.j(this.t, qfj1Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + xcg1.g(xcg1.g(kaa0.f(this.g, kaa0.f(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.t);
    }
}
