package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mim implements Parcelable {
    public static final Parcelable.Creator<mim> CREATOR = new ezl((byte) 12);
    public final String a;
    public final oim b;
    public final lik1 c;

    public mim(String str, oim oimVar, lik1 lik1Var) {
        this.a = str;
        this.b = oimVar;
        this.c = lik1Var;
    }

    public final oim a() {
        return this.b;
    }

    public final lik1 b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mim)) {
            return false;
        }
        mim mimVar = (mim) obj;
        return u890.j(this.a, mimVar.a) && u890.j(this.b, mimVar.b) && u890.j(this.c, mimVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        lik1 lik1Var = this.c;
        return iHashCode + (lik1Var == null ? 0 : lik1Var.a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
