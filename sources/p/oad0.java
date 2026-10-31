package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oad0 implements pad0 {
    public static final Parcelable.Creator<oad0> CREATOR = new lad0((byte) 2);
    public final String a;
    public final String b;
    public final wad0 c;
    public final String d;
    public final String e;
    public final long f;

    public oad0(String str, String str2, wad0 wad0Var, String str3, String str4, long j) {
        this.a = str;
        this.b = str2;
        this.c = wad0Var;
        this.d = str3;
        this.e = str4;
        this.f = j;
    }

    public final Long C() {
        return Long.valueOf(this.f);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oad0)) {
            return false;
        }
        oad0 oad0Var = (oad0) obj;
        return u890.j(this.a, oad0Var.a) && u890.j(this.b, oad0Var.b) && u890.j(this.c, oad0Var.c) && u890.j(this.d, oad0Var.d) && u890.j(this.e, oad0Var.e) && this.f == oad0Var.f;
    }

    public final String getContextUri() {
        return this.e;
    }

    public final String getEntityUri() {
        return this.d;
    }

    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        wad0 wad0Var = this.c;
        int iD2 = cy30.d((iD + (wad0Var == null ? 0 : wad0Var.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return Long.hashCode(this.f) + ((iD2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean i() {
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        wad0 wad0Var = this.c;
        if (wad0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wad0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
    }
}
