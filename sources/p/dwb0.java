package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dwb0 implements Parcelable {
    public static final Parcelable.Creator<dwb0> CREATOR = new cwb0((byte) 0);
    public final String a;
    public final String b;
    public final String c;
    public final xxh d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final int t;

    public dwb0(String str, String str2, String str3, xxh xxhVar, String str4, String str5, String str6, boolean z, String str7, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xxhVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = str7;
        this.t = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwb0)) {
            return false;
        }
        dwb0 dwb0Var = (dwb0) obj;
        return u890.j(this.a, dwb0Var.a) && u890.j(this.b, dwb0Var.b) && u890.j(this.c, dwb0Var.c) && u890.j(this.d, dwb0Var.d) && u890.j(this.e, dwb0Var.e) && u890.j(this.f, dwb0Var.f) && u890.j(this.g, dwb0Var.g) && this.h == dwb0Var.h && u890.j(this.i, dwb0Var.i) && this.t == dwb0Var.t;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return l1d.C(this.t) + cy30.d(xcg1.g(cy30.d(cy30.d(cy30.d((this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        parcel.writeString(us71.q(this.t));
    }
}
