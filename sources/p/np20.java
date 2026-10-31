package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class np20 implements Parcelable {
    public static final Parcelable.Creator<np20> CREATOR = new qe20((byte) 17);
    public final int a;
    public final qp20 b;

    public np20(int i, qp20 qp20Var) {
        this.a = i;
        this.b = qp20Var;
    }

    public final qp20 a() {
        return this.b;
    }

    public final int b() {
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
        if (!(obj instanceof np20)) {
            return false;
        }
        np20 np20Var = (np20) obj;
        return this.a == np20Var.a && u890.j(this.b, np20Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        qp20 qp20Var = this.b;
        return iHashCode + (qp20Var == null ? 0 : qp20Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        qp20 qp20Var = this.b;
        if (qp20Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qp20Var.writeToParcel(parcel, i);
        }
    }
}
