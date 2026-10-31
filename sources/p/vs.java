package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vs implements xs {
    public static final Parcelable.Creator<vs> CREATOR = new gp((byte) 2);
    public final c380 a;
    public final boolean b;
    public final ev c;
    public final boolean d;

    public vs(c380 c380Var, boolean z, ev evVar, boolean z2) {
        this.a = c380Var;
        this.b = z;
        this.c = evVar;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs)) {
            return false;
        }
        vs vsVar = (vs) obj;
        return u890.j(this.a, vsVar.a) && this.b == vsVar.b && u890.j(this.c, vsVar.c) && this.d == vsVar.d;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        ev evVar = this.c;
        return Boolean.hashCode(this.d) + ((iG + (evVar == null ? 0 : evVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itL = x0d.l(this.a, parcel);
        while (itL.hasNext()) {
            parcel.writeParcelable((Parcelable) itL.next(), i);
        }
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
