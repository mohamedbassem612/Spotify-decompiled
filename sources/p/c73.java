package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c73 implements Parcelable {
    public static final Parcelable.Creator<c73> CREATOR = new ue2((byte) 28);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final k4m i;
    public final String t;

    public c73(String str, String str2, String str3, boolean z, String str4, boolean z2, int i, boolean z3, k4m k4mVar, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = z2;
        this.g = i;
        this.h = z3;
        this.i = k4mVar;
        this.t = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c73)) {
            return false;
        }
        c73 c73Var = (c73) obj;
        return u890.j(this.a, c73Var.a) && u890.j(this.b, c73Var.b) && u890.j(this.c, c73Var.c) && this.d == c73Var.d && u890.j(this.e, c73Var.e) && this.f == c73Var.f && this.g == c73Var.g && this.h == c73Var.h && this.i == c73Var.i && u890.j(this.t, c73Var.t);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return this.t.hashCode() + p3d1.g(this.i, xcg1.g(ab80.k(this.g, xcg1.g((iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31), 31, this.h), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(fd21.o(this.g));
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i.name());
        parcel.writeString(this.t);
    }
}
