package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ewz0 extends fwz0 {
    public static final Parcelable.Creator<ewz0> CREATOR = new erz0((byte) 8);
    public final String a;
    public final String b;
    public final g4a c;
    public final dwz0 d;

    public ewz0(String str, String str2, g4a g4aVar, dwz0 dwz0Var) {
        this.a = str;
        this.b = str2;
        this.c = g4aVar;
        this.d = dwz0Var;
    }

    @Override // p.fwz0
    public final g4a a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewz0)) {
            return false;
        }
        ewz0 ewz0Var = (ewz0) obj;
        return u890.j(this.a, ewz0Var.a) && u890.j(this.b, ewz0Var.b) && this.c == ewz0Var.c && u890.j(this.d, ewz0Var.d);
    }

    @Override // p.fwz0
    public final String getUri() {
        return this.b;
    }

    @Override // p.fwz0
    public final String getUuid() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        dwz0 dwz0Var = this.d;
        return iHashCode + (dwz0Var == null ? 0 : dwz0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        dwz0 dwz0Var = this.d;
        if (dwz0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dwz0Var.writeToParcel(parcel, i);
        }
    }
}
