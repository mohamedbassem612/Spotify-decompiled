package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v710 implements of51 {
    public static final Parcelable.Creator<v710> CREATOR = new qn00((byte) 5);
    public final int a;
    public final String b;
    public final String c;

    public v710(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v710)) {
            return false;
        }
        v710 v710Var = (v710) obj;
        return this.a == v710Var.a && u890.j(this.b, v710Var.b) && u890.j(this.c, v710Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // p.of51
    public final int p() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
