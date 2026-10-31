package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m6h0 implements s6h0 {
    public static final Parcelable.Creator<m6h0> CREATOR = new hug0((byte) 8);
    public final String a;
    public final l7c1 b;

    public m6h0(String str, l7c1 l7c1Var) {
        this.a = str;
        this.b = l7c1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6h0)) {
            return false;
        }
        m6h0 m6h0Var = (m6h0) obj;
        return u890.j(this.a, m6h0Var.a) && u890.j(this.b, m6h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
