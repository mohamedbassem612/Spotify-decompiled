package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fxf0 implements Parcelable {
    public static final Parcelable.Creator<fxf0> CREATOR = new isf0((byte) 5);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final exf0 e;

    public fxf0(String str, String str2, boolean z, boolean z2, exf0 exf0Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = exf0Var;
    }

    public static fxf0 a(fxf0 fxf0Var, String str, exf0 exf0Var, int i) {
        if ((i & 1) != 0) {
            str = fxf0Var.a;
        }
        return new fxf0(str, fxf0Var.b, fxf0Var.c, fxf0Var.d, exf0Var);
    }

    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxf0)) {
            return false;
        }
        fxf0 fxf0Var = (fxf0) obj;
        return u890.j(this.a, fxf0Var.a) && u890.j(this.b, fxf0Var.b) && this.c == fxf0Var.c && this.d == fxf0Var.d && u890.j(this.e, fxf0Var.e);
    }

    public final boolean g() {
        String str = this.a;
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = u890.q(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        if (ihc1.h0(string, "@", false)) {
            return v9s0.c.matcher(string).matches();
        }
        return string.length() > 0;
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
    }

    public /* synthetic */ fxf0(String str, boolean z, String str2, boolean z2) {
        this(str, str2, z, z2, axf0.a);
    }
}
