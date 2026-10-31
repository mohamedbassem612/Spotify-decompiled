package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ee30 implements tqw0 {
    public static final Parcelable.Creator<ee30> CREATOR = new ix20((byte) 18);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final c380 e;
    public final boolean f;

    public ee30(String str, String str2, String str3, boolean z, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = c380Var;
        this.f = z;
    }

    public static ee30 a(ee30 ee30Var, boolean z, c380 c380Var, int i) {
        String str = ee30Var.a;
        String str2 = ee30Var.b;
        String str3 = ee30Var.c;
        if ((i & 8) != 0) {
            z = ee30Var.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            c380Var = ee30Var.e;
        }
        ee30Var.getClass();
        return new ee30(str, str2, str3, z2, c380Var);
    }

    @Override // p.tqw0
    public final boolean b0() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee30)) {
            return false;
        }
        ee30 ee30Var = (ee30) obj;
        return u890.j(this.a, ee30Var.a) && u890.j(this.b, ee30Var.b) && u890.j(this.c, ee30Var.c) && this.d == ee30Var.d && u890.j(this.e, ee30Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + xcg1.g((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Iterator itL = x0d.l(this.e, parcel);
        while (itL.hasNext()) {
            parcel.writeParcelable((Parcelable) itL.next(), i);
        }
    }
}
