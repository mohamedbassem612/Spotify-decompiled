package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i260 implements Parcelable {
    public static final Parcelable.Creator<i260> CREATOR = new xk50((byte) 11);
    public final String a;
    public final String b;
    public final String c;
    public final c380 d;
    public final String e;
    public final String f;
    public final c380 g;
    public final String h;
    public final String i;

    public i260(String str, String str2, String str3, c380 c380Var, String str4, String str5, c380 c380Var2, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c380Var;
        this.e = str4;
        this.f = str5;
        this.g = c380Var2;
        this.h = str6;
        this.i = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i260)) {
            return false;
        }
        i260 i260Var = (i260) obj;
        return u890.j(this.a, i260Var.a) && u890.j(this.b, i260Var.b) && u890.j(this.c, i260Var.c) && u890.j(this.d, i260Var.d) && u890.j(this.e, i260Var.e) && u890.j(this.f, i260Var.f) && u890.j(this.g, i260Var.g) && u890.j(this.h, i260Var.h) && u890.j(this.i, i260Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(kk0.f(this.g, cy30.d(cy30.d(kk0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeStringList(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
