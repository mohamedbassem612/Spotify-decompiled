package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s31 implements Parcelable {
    public static final Parcelable.Creator<s31> CREATOR = new t21((byte) 0);
    public final int a;
    public final String b;
    public final r31 c;
    public final bk8 d;

    public /* synthetic */ s31(int i, String str, r31 r31Var, bk8 bk8Var, int i2) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : str, r31Var, (i2 & 8) != 0 ? null : bk8Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s31)) {
            return false;
        }
        s31 s31Var = (s31) obj;
        return this.a == s31Var.a && u890.j(this.b, s31Var.b) && u890.j(this.c, s31Var.c) && this.d == s31Var.d;
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        String str = this.b;
        int iHashCode = (this.c.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        bk8 bk8Var = this.d;
        return iHashCode + (bk8Var != null ? bk8Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(kk0.v(this.a));
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        bk8 bk8Var = this.d;
        if (bk8Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bk8Var.name());
        }
    }

    public s31(int i, String str, r31 r31Var, bk8 bk8Var) {
        this.a = i;
        this.b = str;
        this.c = r31Var;
        this.d = bk8Var;
    }
}
