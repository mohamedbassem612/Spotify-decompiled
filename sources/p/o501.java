package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o501 implements Parcelable {
    public static final Parcelable.Creator<o501> CREATOR = new erz0((byte) 20);
    public final boolean a;
    public final String b;
    public final cce0 c;
    public final int d;

    public o501(boolean z, String str, cce0 cce0Var, int i) {
        this.a = z;
        this.b = str;
        this.c = cce0Var;
        this.d = i;
    }

    public static o501 a(o501 o501Var, String str, cce0 cce0Var, int i, int i2) {
        boolean z = o501Var.a;
        if ((i2 & 2) != 0) {
            str = o501Var.b;
        }
        if ((i2 & 4) != 0) {
            cce0Var = o501Var.c;
        }
        if ((i2 & 8) != 0) {
            i = o501Var.d;
        }
        return new o501(z, str, cce0Var, i);
    }

    public final boolean b() {
        return this.c instanceof gbe0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o501)) {
            return false;
        }
        o501 o501Var = (o501) obj;
        return this.a == o501Var.a && u890.j(this.b, o501Var.b) && u890.j(this.c, o501Var.c) && this.d == o501Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
    }

    public o501(boolean z) {
        this(z, "", new qbe0(), 0);
    }
}
