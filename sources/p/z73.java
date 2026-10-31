package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z73 implements oim {
    public static final Parcelable.Creator<z73> CREATOR = new ue2((byte) 29);
    public final String a;
    public final lik1 b;
    public final String c;
    public final mb3 d;
    public final bjm e;

    public z73(String str, lik1 lik1Var, String str2, mb3 mb3Var) {
        this.a = str;
        this.b = lik1Var;
        this.c = str2;
        this.d = mb3Var;
        this.e = new bjm(4, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z73)) {
            return false;
        }
        z73 z73Var = (z73) obj;
        return u890.j(this.a, z73Var.a) && u890.j(this.b, z73Var.b) && u890.j(this.c, z73Var.c) && u890.j(this.d, z73Var.d);
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

    public /* synthetic */ z73(String str, lik1 lik1Var, mb3 mb3Var) {
        this(str, lik1Var, null, mb3Var);
    }
}
