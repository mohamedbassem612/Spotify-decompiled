package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cuk1 implements Parcelable {
    public static final Parcelable.Creator<cuk1> CREATOR = new ylk1((byte) 5);
    public final buk1 a;
    public final s69 b;
    public final s69 c;

    public cuk1(buk1 buk1Var, s69 s69Var, s69 s69Var2) {
        this.a = buk1Var;
        this.b = s69Var;
        this.c = s69Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuk1)) {
            return false;
        }
        cuk1 cuk1Var = (cuk1) obj;
        return u890.j(this.a, cuk1Var.a) && u890.j(this.b, cuk1Var.b) && u890.j(this.c, cuk1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v8i0.h(this.b, this.a.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
    }
}
