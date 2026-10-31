package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qnc1 implements Parcelable {
    public static final Parcelable.Creator<qnc1> CREATOR = new y7c1((byte) 23);
    public final String a;
    public final gnp0 b;
    public final gtw0 c;

    public qnc1(String str, gnp0 gnp0Var, gtw0 gtw0Var) {
        this.a = str;
        this.b = gnp0Var;
        this.c = gtw0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnc1)) {
            return false;
        }
        qnc1 qnc1Var = (qnc1) obj;
        return u890.j(this.a, qnc1Var.a) && u890.j(this.b, qnc1Var.b) && u890.j(this.c, qnc1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gnp0 gnp0Var = this.b;
        int iHashCode2 = (iHashCode + (gnp0Var == null ? 0 : gnp0Var.hashCode())) * 31;
        gtw0 gtw0Var = this.c;
        return iHashCode2 + (gtw0Var != null ? gtw0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        gnp0 gnp0Var = this.b;
        if (gnp0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gnp0Var.writeToParcel(parcel, i);
        }
        gtw0 gtw0Var = this.c;
        if (gtw0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gtw0Var.writeToParcel(parcel, i);
        }
    }
}
