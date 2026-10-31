package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l3d0 implements Parcelable {
    public static final Parcelable.Creator<l3d0> CREATOR = new bzc0((byte) 20);
    public final String a;
    public final String b;
    public final qxc0 c;

    public l3d0(String str, String str2, qxc0 qxc0Var) {
        this.a = str;
        this.b = str2;
        this.c = qxc0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3d0)) {
            return false;
        }
        l3d0 l3d0Var = (l3d0) obj;
        return u890.j(this.a, l3d0Var.a) && u890.j(this.b, l3d0Var.b) && u890.j(this.c, l3d0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        qxc0 qxc0Var = this.c;
        return iD + (qxc0Var == null ? 0 : qxc0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
