package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jh90 implements hi90, Parcelable {
    public static final Parcelable.Creator<jh90> CREATOR = new qg90((byte) 6);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final long t;

    public jh90(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
        this.i = j;
        this.t = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh90)) {
            return false;
        }
        jh90 jh90Var = (jh90) obj;
        return u890.j(this.a, jh90Var.a) && u890.j(this.b, jh90Var.b) && u890.j(this.c, jh90Var.c) && u890.j(this.d, jh90Var.d) && u890.j(this.e, jh90Var.e) && u890.j(this.f, jh90Var.f) && this.g == jh90Var.g && this.h == jh90Var.h && this.i == jh90Var.i && this.t == jh90Var.t;
    }

    @Override // p.hi90
    public final String getImageUri() {
        return this.c;
    }

    @Override // p.hi90
    public final String getName() {
        return this.b;
    }

    @Override // p.hi90
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.t) + cy30.f(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), this.i, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeLong(this.i);
        parcel.writeLong(this.t);
    }
}
