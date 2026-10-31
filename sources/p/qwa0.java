package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qwa0 implements Parcelable {
    public static final Parcelable.Creator<qwa0> CREATOR = new jca0((byte) 5);
    public final int a;
    public final int b;
    public final tpw0 c;
    public final yq00 d;

    public qwa0(int i, int i2, tpw0 tpw0Var, yq00 yq00Var) {
        this.a = i;
        this.b = i2;
        this.c = tpw0Var;
        this.d = yq00Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwa0)) {
            return false;
        }
        qwa0 qwa0Var = (qwa0) obj;
        return this.a == qwa0Var.a && this.b == qwa0Var.b && this.c == qwa0Var.c && u890.j(this.d, qwa0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }

    public /* synthetic */ qwa0(int i, tpw0 tpw0Var) {
        this(0, i, tpw0Var, wq00.a);
    }
}
