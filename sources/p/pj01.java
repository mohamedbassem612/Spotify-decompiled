package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pj01 implements Parcelable {
    public static final Parcelable.Creator<pj01> CREATOR = new erz0((byte) 27);
    public final String a;
    public final sl01 b;
    public final w4i1 c;

    public pj01(String str, sl01 sl01Var, w4i1 w4i1Var) {
        this.a = str;
        this.b = sl01Var;
        this.c = w4i1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj01)) {
            return false;
        }
        pj01 pj01Var = (pj01) obj;
        return u890.j(this.a, pj01Var.a) && this.b == pj01Var.b && u890.j(this.c, pj01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        this.c.writeToParcel(parcel, i);
    }
}
