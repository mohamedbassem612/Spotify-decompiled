package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bb71 implements Parcelable {
    public static final Parcelable.Creator<bb71> CREATOR = new v871((byte) 10);
    public final u771 a;
    public final int b;
    public final int c;

    public bb71(u771 u771Var, int i, int i2) {
        this.a = u771Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean a() {
        return this.c == 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb71)) {
            return false;
        }
        bb71 bb71Var = (bb71) obj;
        return u890.j(this.a, bb71Var.a) && this.b == bb71Var.b && this.c == bb71Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
        parcel.writeString(lf51.q(this.c));
    }
}
