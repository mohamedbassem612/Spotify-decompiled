package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t31 implements c41 {
    public static final Parcelable.Creator<t31> CREATOR = new t21((byte) 22);
    public final w01 a;
    public final boolean b;
    public final String c;
    public final l3f0 d;
    public final ri8 e;
    public final di8 f;
    public final n5o g;

    public t31(w01 w01Var, boolean z, String str, l3f0 l3f0Var, ri8 ri8Var, di8 di8Var, n5o n5oVar) {
        this.a = w01Var;
        this.b = z;
        this.c = str;
        this.d = l3f0Var;
        this.e = ri8Var;
        this.f = di8Var;
        this.g = n5oVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t31)) {
            return false;
        }
        t31 t31Var = (t31) obj;
        return u890.j(this.a, t31Var.a) && this.b == t31Var.b && u890.j(this.c, t31Var.c) && u890.j(this.d, t31Var.d) && u890.j(this.e, t31Var.e) && u890.j(this.f, t31Var.f) && u890.j(this.g, t31Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        ri8 ri8Var = this.e;
        int iHashCode2 = (iHashCode + (ri8Var == null ? 0 : Arrays.hashCode(ri8Var.a))) * 31;
        di8 di8Var = this.f;
        int iHashCode3 = (iHashCode2 + (di8Var == null ? 0 : di8Var.hashCode())) * 31;
        n5o n5oVar = this.g;
        return iHashCode3 + (n5oVar != null ? n5oVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        ri8 ri8Var = this.e;
        if (ri8Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ri8Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
    }
}
