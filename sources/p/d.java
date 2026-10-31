package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new scc((byte) 1);
    public final String N0;
    public final long O0;
    public final List P0;
    public final long Q0;
    public final String X;
    public final String Y;
    public final String Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final float t;

    public d(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, float f, String str6, String str7, String str8, String str9, long j, List list, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = str5;
        this.t = f;
        this.X = str6;
        this.Y = str7;
        this.Z = str8;
        this.N0 = str9;
        this.O0 = j;
        this.P0 = list;
        this.Q0 = j2;
    }

    @Override // p.i
    public final String a() {
        return this.d;
    }

    @Override // p.i
    public final boolean b() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return u890.j(this.a, dVar.a) && u890.j(this.b, dVar.b) && u890.j(this.c, dVar.c) && u890.j(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && u890.j(this.i, dVar.i) && Float.compare(this.t, dVar.t) == 0 && u890.j(this.X, dVar.X) && u890.j(this.Y, dVar.Y) && u890.j(this.Z, dVar.Z) && u890.j(this.N0, dVar.N0) && this.O0 == dVar.O0 && u890.j(this.P0, dVar.P0) && this.Q0 == dVar.Q0;
    }

    @Override // p.i
    public final boolean g() {
        return this.h;
    }

    @Override // p.i
    public final String getImageUri() {
        return this.c;
    }

    @Override // p.i
    public final String getName() {
        return this.b;
    }

    @Override // p.i
    public final String getUri() {
        return this.a;
    }

    @Override // p.i
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(x0d.f(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t), 31, this.X), 31, this.Y);
        String str = this.Z;
        return Long.hashCode(this.Q0) + f4i1.b(cy30.f(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.N0), this.O0, 31), 31, this.P0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        parcel.writeFloat(this.t);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.N0);
        parcel.writeLong(this.O0);
        parcel.writeStringList(this.P0);
        parcel.writeLong(this.Q0);
    }
}
