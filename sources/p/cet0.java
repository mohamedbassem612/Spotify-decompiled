package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cet0 implements Parcelable {
    public static final Parcelable.Creator<cet0> CREATOR = new r7t0((byte) 12);
    public final boolean a;
    public final egt0 b;
    public final String c;

    public /* synthetic */ cet0(boolean z, egt0 egt0Var, String str, int i) {
        this((i & 1) != 0 ? false : z, egt0Var, (i & 4) != 0 ? null : str);
    }

    public static cet0 a(cet0 cet0Var, egt0 egt0Var, String str, int i) {
        boolean z = cet0Var.a;
        if ((i & 2) != 0) {
            egt0Var = cet0Var.b;
        }
        if ((i & 4) != 0) {
            str = cet0Var.c;
        }
        return new cet0(z, egt0Var, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cet0)) {
            return false;
        }
        cet0 cet0Var = (cet0) obj;
        return this.a == cet0Var.a && u890.j(this.b, cet0Var.b) && u890.j(this.c, cet0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }

    public cet0(boolean z, egt0 egt0Var, String str) {
        this.a = z;
        this.b = egt0Var;
        this.c = str;
    }
}
