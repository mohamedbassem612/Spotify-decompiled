package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t771 implements Parcelable {
    public static final Parcelable.Creator<t771> CREATOR = new o471((byte) 27);
    public final wa71 a;
    public final z771 b;

    public t771(wa71 wa71Var, z771 z771Var) {
        this.a = wa71Var;
        this.b = z771Var;
    }

    public static t771 a(t771 t771Var, wa71 wa71Var, z771 z771Var, int i) {
        if ((i & 1) != 0) {
            wa71Var = t771Var.a;
        }
        if ((i & 2) != 0) {
            z771Var = t771Var.b;
        }
        t771Var.getClass();
        return new t771(wa71Var, z771Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t771)) {
            return false;
        }
        t771 t771Var = (t771) obj;
        return u890.j(this.a, t771Var.a) && u890.j(this.b, t771Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
