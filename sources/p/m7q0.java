package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m7q0 implements s7q0 {
    public static final Parcelable.Creator<m7q0> CREATOR = new qxp0((byte) 27);
    public final String a;
    public final long b;
    public final long c;
    public final l7q0 d;

    public m7q0(String str, long j, long j2, l7q0 l7q0Var) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = l7q0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7q0)) {
            return false;
        }
        m7q0 m7q0Var = (m7q0) obj;
        return u890.j(this.a, m7q0Var.a) && this.b == m7q0Var.b && this.c == m7q0Var.c && u890.j(this.d, m7q0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
