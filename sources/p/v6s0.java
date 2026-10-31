package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v6s0 implements Parcelable {
    public static final Parcelable.Creator<v6s0> CREATOR = new zsr0((byte) 17);
    public final u6s0 a;
    public final boolean b;
    public final boolean c;

    public v6s0(u6s0 u6s0Var, boolean z, boolean z2) {
        this.a = u6s0Var;
        this.b = z;
        this.c = z2;
    }

    public static v6s0 a(v6s0 v6s0Var, u6s0 u6s0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            u6s0Var = v6s0Var.a;
        }
        boolean z2 = (i & 2) != 0 ? v6s0Var.b : true;
        if ((i & 4) != 0) {
            z = v6s0Var.c;
        }
        return new v6s0(u6s0Var, z2, z);
    }

    public final String b() {
        String strA = this.a.a();
        return strA == null ? "" : strA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6s0)) {
            return false;
        }
        v6s0 v6s0Var = (v6s0) obj;
        return u890.j(this.a, v6s0Var.a) && this.b == v6s0Var.b && this.c == v6s0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String strR = rc11.a.b(this.a.getClass()).r();
        StringBuilder sb = new StringBuilder("PasswordModel(passwordState=");
        sb.append(strR);
        sb.append(", displayHints=");
        sb.append(this.b);
        sb.append(", wasAutofillUsed=");
        return l1d.r(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
