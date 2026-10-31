package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m6s0 extends u6s0 {
    public static final Parcelable.Creator<m6s0> CREATOR = new zsr0((byte) 20);
    public final String b;
    public final String c;

    public m6s0(String str, String str2) {
        super(str);
        this.b = str;
        this.c = str2;
    }

    @Override // p.u6s0
    public final String a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6s0)) {
            return false;
        }
        m6s0 m6s0Var = (m6s0) obj;
        return u890.j(this.b, m6s0Var.b) && u890.j(this.c, m6s0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
