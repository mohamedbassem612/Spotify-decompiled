package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sq30 extends c871 {
    public static final Parcelable.Creator<sq30> CREATOR = new ix20((byte) 27);
    public final jlw0 a;
    public final jlw0 b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final s171 g;

    public sq30(jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str, String str2, s171 s171Var) {
        this.a = jlw0Var;
        this.b = jlw0Var2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = s171Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq30)) {
            return false;
        }
        sq30 sq30Var = (sq30) obj;
        return u890.j(this.a, sq30Var.a) && u890.j(this.b, sq30Var.b) && this.c == sq30Var.c && this.d == sq30Var.d && u890.j(this.e, sq30Var.e) && u890.j(this.f, sq30Var.f) && u890.j(this.g, sq30Var.g);
    }

    public final int hashCode() {
        jlw0 jlw0Var = this.a;
        return this.g.hashCode() + cy30.d(cy30.d(kaa0.f(this.d, kaa0.f(this.c, (this.b.hashCode() + ((jlw0Var == null ? 0 : jlw0Var.hashCode()) * 31)) * 31, 31), 31), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
    }
}
