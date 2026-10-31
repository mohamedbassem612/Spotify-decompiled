package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class svr0 implements Parcelable {
    public static final Parcelable.Creator<svr0> CREATOR = new zsr0((byte) 5);
    public final String a;
    public final qdh1 b;
    public final String c;
    public final String d;
    public final boolean e;

    public svr0(String str, qdh1 qdh1Var, String str2, String str3, boolean z) {
        this.a = str;
        this.b = qdh1Var;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public static svr0 a(svr0 svr0Var, qdh1 qdh1Var, String str, int i) {
        String str2 = svr0Var.a;
        if ((i & 2) != 0) {
            qdh1Var = svr0Var.b;
        }
        qdh1 qdh1Var2 = qdh1Var;
        if ((i & 4) != 0) {
            str = svr0Var.c;
        }
        return new svr0(str2, qdh1Var2, str, svr0Var.d, svr0Var.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svr0)) {
            return false;
        }
        svr0 svr0Var = (svr0) obj;
        return u890.j(this.a, svr0Var.a) && u890.j(this.b, svr0Var.b) && u890.j(this.c, svr0Var.c) && u890.j(this.d, svr0Var.d) && this.e == svr0Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ svr0(String str, String str2, boolean z) {
        this(str, odh1.a, null, str2, z);
    }
}
