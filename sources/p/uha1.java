package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uha1 implements Parcelable {
    public static final Parcelable.Creator<uha1> CREATOR = new yx81((byte) 23);
    public final String a;
    public final sha1 b;
    public final boolean c;
    public final qha1 d;

    public uha1(String str, sha1 sha1Var, boolean z, qha1 qha1Var) {
        this.a = str;
        this.b = sha1Var;
        this.c = z;
        this.d = qha1Var;
    }

    public static uha1 a(uha1 uha1Var, boolean z, qha1 qha1Var, int i) {
        String str = uha1Var.a;
        sha1 sha1Var = uha1Var.b;
        if ((i & 4) != 0) {
            z = uha1Var.c;
        }
        if ((i & 8) != 0) {
            qha1Var = uha1Var.d;
        }
        uha1Var.getClass();
        return new uha1(str, sha1Var, z, qha1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uha1)) {
            return false;
        }
        uha1 uha1Var = (uha1) obj;
        return u890.j(this.a, uha1Var.a) && this.b == uha1Var.b && this.c == uha1Var.c && u890.j(this.d, uha1Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        qha1 qha1Var = this.d;
        return iG + (qha1Var == null ? 0 : qha1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
        qha1 qha1Var = this.d;
        if (qha1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qha1Var.writeToParcel(parcel, i);
        }
    }
}
