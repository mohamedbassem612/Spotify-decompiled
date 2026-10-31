package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xk41 implements Parcelable {
    public static final Parcelable.Creator<xk41> CREATOR = new xw31((byte) 22);
    public final int a;
    public final n7r b;

    public xk41(int i, n7r n7rVar) {
        this.a = i;
        this.b = n7rVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk41)) {
            return false;
        }
        xk41 xk41Var = (xk41) obj;
        return this.a == xk41Var.a && this.b == xk41Var.b;
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        n7r n7rVar = this.b;
        return iC + (n7rVar == null ? 0 : n7rVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "NONE";
        } else if (i2 == 2) {
            str = "DAILY";
        } else if (i2 == 3) {
            str = "WEEKLY";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "MONTHLY";
        }
        parcel.writeString(str);
        n7r n7rVar = this.b;
        if (n7rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(n7rVar.name());
        }
    }
}
