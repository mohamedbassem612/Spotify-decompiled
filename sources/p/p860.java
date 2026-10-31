package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p860 implements Parcelable {
    public static final Parcelable.Creator<p860> CREATOR = new xk50((byte) 17);
    public final String a;
    public final int b;
    public final r6h1 c;

    public p860(int i, String str, r6h1 r6h1Var) {
        this.a = str;
        this.b = i;
        this.c = r6h1Var;
    }

    public static p860 a(p860 p860Var, r6h1 r6h1Var) {
        String str = p860Var.a;
        int i = p860Var.b;
        p860Var.getClass();
        return new p860(i, str, r6h1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p860)) {
            return false;
        }
        p860 p860Var = (p860) obj;
        return u890.j(this.a, p860Var.a) && this.b == p860Var.b && u890.j(this.c, p860Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "RECENTS";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "SHORTCUTS";
        }
        parcel.writeString(str);
        parcel.writeSerializable(this.c);
    }

    public /* synthetic */ p860(String str, int i) {
        this(i, str, r6h1.c);
    }
}
