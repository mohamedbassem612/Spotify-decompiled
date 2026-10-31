package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o5i0 implements Parcelable {
    public static final Parcelable.Creator<o5i0> CREATOR = new cyh0((byte) 10);
    public final uvg1 a;
    public final u5v b;

    public o5i0(uvg1 uvg1Var, u5v u5vVar) {
        this.a = uvg1Var;
        this.b = u5vVar;
    }

    public static o5i0 a(o5i0 o5i0Var, uvg1 uvg1Var, u5v u5vVar, int i) {
        if ((i & 1) != 0) {
            uvg1Var = o5i0Var.a;
        }
        if ((i & 2) != 0) {
            u5vVar = o5i0Var.b;
        }
        o5i0Var.getClass();
        return new o5i0(uvg1Var, u5vVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5i0)) {
            return false;
        }
        o5i0 o5i0Var = (o5i0) obj;
        return u890.j(this.a, o5i0Var.a) && u890.j(this.b, o5i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public /* synthetic */ o5i0(uvg1 uvg1Var) {
        this(uvg1Var, t5v.a);
    }
}
