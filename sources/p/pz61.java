package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pz61 implements Parcelable {
    public static final Parcelable.Creator<pz61> CREATOR = new hs61(18);
    public final y171 a;
    public final c871 b;
    public final ez61 c;
    public final boolean d;

    public pz61(y171 y171Var, c871 c871Var, ez61 ez61Var, boolean z) {
        this.a = y171Var;
        this.b = c871Var;
        this.c = ez61Var;
        this.d = z;
    }

    public final c871 a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz61)) {
            return false;
        }
        pz61 pz61Var = (pz61) obj;
        return u890.j(this.a, pz61Var.a) && u890.j(this.b, pz61Var.b) && u890.j(this.c, pz61Var.c) && this.d == pz61Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.a.hashCode() * 31;
        c871 c871Var = this.b;
        return Boolean.hashCode(this.d) + pze0.f(this.c, (iHashCode + (c871Var == null ? 0 : c871Var.hashCode())) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
