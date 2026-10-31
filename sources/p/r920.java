package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r920 implements Parcelable {
    public static final Parcelable.Creator<r920> CREATOR = new u220((byte) 18);
    public final s69 a;
    public final s69 b;
    public final s69 c;

    public r920(s69 s69Var, s69 s69Var2, s69 s69Var3) {
        this.a = s69Var;
        this.b = s69Var2;
        this.c = s69Var3;
    }

    public static r920 a(r920 r920Var, s69 s69Var, s69 s69Var2, int i) {
        if ((i & 1) != 0) {
            s69Var = r920Var.a;
        }
        s69 s69Var3 = r920Var.b;
        if ((i & 4) != 0) {
            s69Var2 = r920Var.c;
        }
        return new r920(s69Var, s69Var3, s69Var2);
    }

    public final String b() {
        s69 s69Var = this.a;
        String strA = s69Var != null ? s69Var.a() : null;
        s69 s69Var2 = this.b;
        String strA2 = s69Var2 != null ? s69Var2.a() : null;
        s69 s69Var3 = this.c;
        return l1d.n(s69Var3 != null ? s69Var3.a() : null, ")", gvg.n("FilterCurves(cutoff=", strA, ", resonance=", strA2, ", noiseColor="));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r920)) {
            return false;
        }
        r920 r920Var = (r920) obj;
        return u890.j(this.a, r920Var.a) && u890.j(this.b, r920Var.b) && u890.j(this.c, r920Var.c);
    }

    public final int hashCode() {
        s69 s69Var = this.a;
        int iHashCode = (s69Var == null ? 0 : s69Var.hashCode()) * 31;
        s69 s69Var2 = this.b;
        int iHashCode2 = (iHashCode + (s69Var2 == null ? 0 : s69Var2.hashCode())) * 31;
        s69 s69Var3 = this.c;
        return iHashCode2 + (s69Var3 != null ? s69Var3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        s69 s69Var = this.a;
        if (s69Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s69Var.writeToParcel(parcel, i);
        }
        s69 s69Var2 = this.b;
        if (s69Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s69Var2.writeToParcel(parcel, i);
        }
        s69 s69Var3 = this.c;
        if (s69Var3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s69Var3.writeToParcel(parcel, i);
        }
    }
}
