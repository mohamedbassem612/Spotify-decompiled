package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dv1 implements gv1 {
    public static final Parcelable.Creator<dv1> CREATOR = new d41((byte) 29);
    public final String a;
    public final tv80 b;

    public dv1(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv1)) {
            return false;
        }
        dv1 dv1Var = (dv1) obj;
        return u890.j(this.a, dv1Var.a) && u890.j(this.b, dv1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
