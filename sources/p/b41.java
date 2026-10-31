package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b41 implements c41 {
    public static final Parcelable.Creator<b41> CREATOR = new t21((byte) 26);
    public final String a;
    public final boolean b;
    public final a41 c;

    public b41(String str, boolean z, a41 a41Var) {
        this.a = str;
        this.b = z;
        this.c = a41Var;
    }

    public static b41 a(b41 b41Var, a41 a41Var) {
        String str = b41Var.a;
        boolean z = b41Var.b;
        b41Var.getClass();
        return new b41(str, z, a41Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b41)) {
            return false;
        }
        b41 b41Var = (b41) obj;
        return u890.j(this.a, b41Var.a) && this.b == b41Var.b && u890.j(this.c, b41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }

    public /* synthetic */ b41(String str, boolean z) {
        this(str, z, z31.a);
    }
}
