package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class thi1 extends whi1 {
    public static final Parcelable.Creator<thi1> CREATOR = new xbi1((byte) 6);
    public final wsb1 a;
    public final p2f1 b;

    public thi1(wsb1 wsb1Var, p2f1 p2f1Var) {
        this.a = wsb1Var;
        this.b = p2f1Var;
    }

    public final p2f1 a() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thi1)) {
            return false;
        }
        thi1 thi1Var = (thi1) obj;
        return u890.j(this.a, thi1Var.a) && u890.j(this.b, thi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
