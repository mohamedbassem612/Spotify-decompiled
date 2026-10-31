package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lhg1 implements Parcelable {
    public static final Parcelable.Creator<lhg1> CREATOR = new h3g1((byte) 4);
    public final q6w0 a;
    public final ruq0 b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ lhg1(q6w0 q6w0Var, ruq0 ruq0Var, int i) {
        this((i & 1) != 0 ? new q6w0(null, 65535) : q6w0Var, (i & 2) != 0 ? new ruq0("", "", "", "", "", "", "", "", 0, 0, 0, null, null, null, false, 0.0f, 0.0f, 0.0d, 0.0d) : ruq0Var, false, false);
    }

    public static lhg1 a(lhg1 lhg1Var, q6w0 q6w0Var, ruq0 ruq0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            q6w0Var = lhg1Var.a;
        }
        if ((i & 2) != 0) {
            ruq0Var = lhg1Var.b;
        }
        if ((i & 4) != 0) {
            z = lhg1Var.c;
        }
        if ((i & 8) != 0) {
            z2 = lhg1Var.d;
        }
        lhg1Var.getClass();
        return new lhg1(q6w0Var, ruq0Var, z, z2);
    }

    public final String b() {
        b8w0 b8w0Var = this.a.a;
        ruq0 ruq0Var = this.b;
        return "Transition(preset=" + b8w0Var + ", overlap=" + ruq0Var.X + "ms/" + ruq0Var.N0 + "bars, beatmatched=" + ruq0Var.O0 + ", overlapOverride=" + this.c + ", presetOverride=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhg1)) {
            return false;
        }
        lhg1 lhg1Var = (lhg1) obj;
        return u890.j(this.a, lhg1Var.a) && u890.j(this.b, lhg1Var.b) && this.c == lhg1Var.c && this.d == lhg1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public lhg1(q6w0 q6w0Var, ruq0 ruq0Var, boolean z, boolean z2) {
        this.a = q6w0Var;
        this.b = ruq0Var;
        this.c = z;
        this.d = z2;
    }
}
