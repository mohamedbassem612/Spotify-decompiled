package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f41 implements p41 {
    public static final Parcelable.Creator<f41> CREATOR = new d41((byte) 1);
    public final w01 a;
    public final boolean b;
    public final n5o c;

    public f41(w01 w01Var, boolean z, n5o n5oVar) {
        this.a = w01Var;
        this.b = z;
        this.c = n5oVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f41)) {
            return false;
        }
        f41 f41Var = (f41) obj;
        return u890.j(this.a, f41Var.a) && this.b == f41Var.b && u890.j(this.c, f41Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        n5o n5oVar = this.c;
        return iG + (n5oVar == null ? 0 : n5oVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }
}
