package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d88 implements Parcelable {
    public static final Parcelable.Creator<d88> CREATOR = new bu7((byte) 12);
    public final boolean X;
    public final String a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final String e;
    public final k4m f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public d88(String str, String str2, CharSequence charSequence, String str3, String str4, k4m k4mVar, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = str3;
        this.e = str4;
        this.f = k4mVar;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.t = z3;
        this.X = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d88)) {
            return false;
        }
        d88 d88Var = (d88) obj;
        return u890.j(this.a, d88Var.a) && u890.j(this.b, d88Var.b) && u890.j(this.c, d88Var.c) && u890.j(this.d, d88Var.d) && u890.j(this.e, d88Var.e) && this.f == d88Var.f && u890.j(this.g, d88Var.g) && this.h == d88Var.h && this.i == d88Var.i && this.t == d88Var.t && this.X == d88Var.X;
    }

    public final int hashCode() {
        int iD = cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        int iG = p3d1.g(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.g;
        return Boolean.hashCode(this.X) + xcg1.g(xcg1.g(xcg1.g((iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f.name());
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
    }
}
