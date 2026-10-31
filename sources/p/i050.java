package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i050 implements Parcelable {
    public static final Parcelable.Creator<i050> CREATOR = new fd40(10);
    public final vsw0 a;
    public final String b;
    public final ata c;
    public final aih1 d;
    public final String e;

    public i050(vsw0 vsw0Var, String str, ata ataVar, aih1 aih1Var, String str2) {
        this.a = vsw0Var;
        this.b = str;
        this.c = ataVar;
        this.d = aih1Var;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i050)) {
            return false;
        }
        i050 i050Var = (i050) obj;
        return u890.j(this.a, i050Var.a) && u890.j(this.b, i050Var.b) && u890.j(this.c, i050Var.c) && u890.j(this.d, i050Var.d) && u890.j(this.e, i050Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        ata ataVar = this.c;
        int iHashCode = (iD + (ataVar == null ? 0 : ataVar.hashCode())) * 31;
        aih1 aih1Var = this.d;
        int iHashCode2 = (iHashCode + (aih1Var == null ? 0 : aih1Var.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        ata ataVar = this.c;
        if (ataVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ataVar.writeToParcel(parcel, i);
        }
        aih1 aih1Var = this.d;
        if (aih1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aih1Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.e);
    }
}
