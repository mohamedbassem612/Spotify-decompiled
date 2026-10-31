package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class co8 implements oim {
    public static final Parcelable.Creator<co8> CREATOR = new bu7((byte) 28);
    public final String a;
    public final lik1 b;
    public final String c;
    public final wn8 d;
    public final bjm e;

    public co8(String str, lik1 lik1Var, String str2, wn8 wn8Var) {
        this.a = str;
        this.b = lik1Var;
        this.c = str2;
        this.d = wn8Var;
        this.e = new bjm(4, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co8)) {
            return false;
        }
        co8 co8Var = (co8) obj;
        return u890.j(this.a, co8Var.a) && u890.j(this.b, co8Var.b) && u890.j(this.c, co8Var.c) && u890.j(this.d, co8Var.d);
    }

    public final bjm getTarget() {
        return this.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b.a);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
    }
}
