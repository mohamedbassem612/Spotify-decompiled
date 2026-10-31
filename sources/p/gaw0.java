package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gaw0 implements kaw0 {
    public static final Parcelable.Creator<gaw0> CREATOR = new w7w0((byte) 13);
    public final long a;
    public final w4i1 b;
    public final String c;
    public final kpl d;
    public final vb71 e;

    public gaw0(long j, w4i1 w4i1Var, String str, kpl kplVar, vb71 vb71Var) {
        this.a = j;
        this.b = w4i1Var;
        this.c = str;
        this.d = kplVar;
        this.e = vb71Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaw0)) {
            return false;
        }
        gaw0 gaw0Var = (gaw0) obj;
        return this.a == gaw0Var.a && u890.j(this.b, gaw0Var.b) && u890.j(this.c, gaw0Var.c) && u890.j(this.d, gaw0Var.d) && u890.j(this.e, gaw0Var.e);
    }

    public final w4i1 getUser() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d(ydh.d(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        kpl kplVar = this.d;
        int iHashCode = (iD + (kplVar == null ? 0 : kplVar.hashCode())) * 31;
        vb71 vb71Var = this.e;
        return iHashCode + (vb71Var != null ? vb71Var.hashCode() : 0);
    }

    public final long v0() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }
}
