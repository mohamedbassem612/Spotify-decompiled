package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fdq0 implements Parcelable {
    public static final Parcelable.Creator<fdq0> CREATOR = new p7q0((byte) 3);
    public final String a;
    public final String b;
    public final ezy c;
    public final String d;
    public final int e;
    public final String f;

    public /* synthetic */ fdq0(String str, String str2, ezy ezyVar, String str3, int i, String str4, int i2) {
        this(str, str2, ezyVar, str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdq0)) {
            return false;
        }
        fdq0 fdq0Var = (fdq0) obj;
        return u890.j(this.a, fdq0Var.a) && u890.j(this.b, fdq0Var.b) && this.c == fdq0Var.c && u890.j(this.d, fdq0Var.d) && this.e == fdq0Var.e && u890.j(this.f, fdq0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kaa0.f(this.e, cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
    }

    public fdq0(String str, String str2, ezy ezyVar, String str3, int i, String str4) {
        this.a = str;
        this.b = str2;
        this.c = ezyVar;
        this.d = str3;
        this.e = i;
        this.f = str4;
    }
}
