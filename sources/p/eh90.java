package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eh90 implements hi90, Parcelable {
    public static final Parcelable.Creator<eh90> CREATOR = new qg90((byte) 3);
    public final long X;
    public final List Y;
    public final long Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final float e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String t;

    public eh90(String str, String str2, String str3, String str4, float f, String str5, String str6, boolean z, String str7, String str8, long j, List list, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = str7;
        this.t = str8;
        this.X = j;
        this.Y = list;
        this.Z = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh90)) {
            return false;
        }
        eh90 eh90Var = (eh90) obj;
        return u890.j(this.a, eh90Var.a) && u890.j(this.b, eh90Var.b) && u890.j(this.c, eh90Var.c) && u890.j(this.d, eh90Var.d) && Float.compare(this.e, eh90Var.e) == 0 && u890.j(this.f, eh90Var.f) && u890.j(this.g, eh90Var.g) && this.h == eh90Var.h && u890.j(this.i, eh90Var.i) && u890.j(this.t, eh90Var.t) && this.X == eh90Var.X && u890.j(this.Y, eh90Var.Y) && this.Z == eh90Var.Z;
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
        int iG = xcg1.g(cy30.d(cy30.d(x0d.f(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        return Long.hashCode(this.Z) + f4i1.b(cy30.f(cy30.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.t), this.X, 31), 31, this.Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeFloat(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeLong(this.X);
        parcel.writeStringList(this.Y);
        parcel.writeLong(this.Z);
    }
}
