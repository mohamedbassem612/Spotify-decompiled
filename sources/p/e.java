package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new scc((byte) 2);
    public final long X;
    public final long Y;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String t;

    public e(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, String str6, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = str5;
        this.t = str6;
        this.X = j;
        this.Y = j2;
    }

    public final String a() {
        return this.d;
    }

    public final boolean b() {
        return this.f;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return u890.j(this.a, eVar.a) && u890.j(this.b, eVar.b) && u890.j(this.c, eVar.c) && u890.j(this.d, eVar.d) && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h && u890.j(this.i, eVar.i) && u890.j(this.t, eVar.t) && this.X == eVar.X && this.Y == eVar.Y;
    }

    public final boolean g() {
        return this.h;
    }

    public final String getImageUri() {
        return this.c;
    }

    public final String getName() {
        return this.b;
    }

    public final String getUri() {
        return this.a;
    }

    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.Y) + cy30.f(cy30.d(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t), this.X, 31);
    }

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
        parcel.writeString(this.t);
        parcel.writeLong(this.X);
        parcel.writeLong(this.Y);
    }
}
