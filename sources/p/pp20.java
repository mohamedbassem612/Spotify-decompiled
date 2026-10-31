package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pp20 implements Parcelable {
    public static final Parcelable.Creator<pp20> CREATOR = new qe20((byte) 18);
    public final Integer a;
    public final qp20 b;

    public pp20(Integer num, qp20 qp20Var) {
        this.a = num;
        this.b = qp20Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp20)) {
            return false;
        }
        pp20 pp20Var = (pp20) obj;
        return u890.j(this.a, pp20Var.a) && u890.j(this.b, pp20Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        qp20 qp20Var = this.b;
        return iHashCode + (qp20Var != null ? qp20Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        qp20 qp20Var = this.b;
        if (qp20Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qp20Var.writeToParcel(parcel, i);
        }
    }
}
