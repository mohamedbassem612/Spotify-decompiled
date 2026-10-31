package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c0k0 implements Parcelable {
    public static final Parcelable.Creator<c0k0> CREATOR = new ohj0((byte) 12);
    public final String a;
    public final String b;
    public final bt31 c;
    public final bt31 d;
    public final String e;
    public final String f;
    public final dbk0 g;
    public final boolean h;

    public /* synthetic */ c0k0(String str, String str2, bt31 bt31Var, bt31 bt31Var2, String str3, String str4, dbk0 dbk0Var, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new bt31("", "") : bt31Var, (i & 8) != 0 ? new bt31("", "") : bt31Var2, (i & 16) != 0 ? null : str3, str4, (i & 64) != 0 ? dbk0.a : dbk0Var, (i & 128) != 0 ? false : z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0k0)) {
            return false;
        }
        c0k0 c0k0Var = (c0k0) obj;
        return u890.j(this.a, c0k0Var.a) && u890.j(this.b, c0k0Var.b) && u890.j(this.c, c0k0Var.c) && u890.j(this.d, c0k0Var.d) && u890.j(this.e, c0k0Var.e) && u890.j(this.f, c0k0Var.f) && this.g == c0k0Var.g && this.h == c0k0Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        this.g.writeToParcel(parcel, i);
        parcel.writeInt(this.h ? 1 : 0);
    }

    public c0k0(String str, String str2, bt31 bt31Var, bt31 bt31Var2, String str3, String str4, dbk0 dbk0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = bt31Var;
        this.d = bt31Var2;
        this.e = str3;
        this.f = str4;
        this.g = dbk0Var;
        this.h = z;
    }
}
