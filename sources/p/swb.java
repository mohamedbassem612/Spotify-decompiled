package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class swb implements Parcelable {
    public static final Parcelable.Creator<swb> CREATOR = new mra((byte) 20);
    public final String X;
    public final boolean Y;
    public final hux a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean t;

    public swb(hux huxVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, String str8, boolean z3) {
        this.a = huxVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = str7;
        this.t = z2;
        this.X = str8;
        this.Y = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swb)) {
            return false;
        }
        swb swbVar = (swb) obj;
        return u890.j(this.a, swbVar.a) && u890.j(this.b, swbVar.b) && u890.j(this.c, swbVar.c) && u890.j(this.d, swbVar.d) && u890.j(this.e, swbVar.e) && u890.j(this.f, swbVar.f) && u890.j(this.g, swbVar.g) && this.h == swbVar.h && u890.j(this.i, swbVar.i) && this.t == swbVar.t && u890.j(this.X, swbVar.X) && this.Y == swbVar.Y;
    }

    public final int hashCode() {
        hux huxVar = this.a;
        return Boolean.hashCode(this.Y) + cy30.d(xcg1.g(cy30.d(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((huxVar == null ? 0 : huxVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t), 31, this.X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y ? 1 : 0);
    }
}
