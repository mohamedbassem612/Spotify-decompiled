package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ytr0 implements Parcelable {
    public static final Parcelable.Creator<ytr0> CREATOR = new zsr0((byte) 2);
    public final String a;
    public final int b;
    public final p6r0 c;
    public final lik1 d;

    public ytr0(String str, int i, p6r0 p6r0Var, lik1 lik1Var) {
        this.a = str;
        this.b = i;
        this.c = p6r0Var;
        this.d = lik1Var;
    }

    public final lik1 a() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final p6r0 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytr0)) {
            return false;
        }
        ytr0 ytr0Var = (ytr0) obj;
        return u890.j(this.a, ytr0Var.a) && this.b == ytr0Var.b && u890.j(this.c, ytr0Var.c) && u890.j(this.d, ytr0Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
