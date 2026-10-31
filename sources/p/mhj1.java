package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mhj1 implements phj1 {
    public static final Parcelable.Creator<mhj1> CREATOR = new xbi1((byte) 29);
    public final String a;
    public final s171 b;
    public final String c;

    public mhj1(String str, String str2, s171 s171Var) {
        this.a = str;
        this.b = s171Var;
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
        if (!(obj instanceof mhj1)) {
            return false;
        }
        mhj1 mhj1Var = (mhj1) obj;
        return u890.j(this.a, mhj1Var.a) && u890.j(this.b, mhj1Var.b) && u890.j(this.c, mhj1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}
