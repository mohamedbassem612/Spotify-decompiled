package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oqz0 implements Parcelable {
    public static final Parcelable.Creator<oqz0> CREATOR = new j1z0((byte) 27);
    public final tr80 a;
    public final tr80 b;
    public final int c;

    public oqz0(tr80 tr80Var, tr80 tr80Var2, int i) {
        this.a = tr80Var;
        this.b = tr80Var2;
        this.c = i;
    }

    public static oqz0 a(oqz0 oqz0Var, tr80 tr80Var, tr80 tr80Var2, int i, int i2) {
        if ((i2 & 1) != 0) {
            tr80Var = oqz0Var.a;
        }
        if ((i2 & 2) != 0) {
            tr80Var2 = oqz0Var.b;
        }
        if ((i2 & 4) != 0) {
            i = oqz0Var.c;
        }
        oqz0Var.getClass();
        return new oqz0(tr80Var, tr80Var2, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqz0)) {
            return false;
        }
        oqz0 oqz0Var = (oqz0) obj;
        return u890.j(this.a, oqz0Var.a) && u890.j(this.b, oqz0Var.b) && this.c == oqz0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + lf51.e(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tr80 tr80Var = this.a;
        parcel.writeInt(((rr80) tr80Var).a);
        parcel.writeInt(((rr80) tr80Var).b);
        tr80 tr80Var2 = this.b;
        parcel.writeInt(((rr80) tr80Var2).a);
        parcel.writeInt(((rr80) tr80Var2).b);
        parcel.writeInt(this.c);
    }
}
