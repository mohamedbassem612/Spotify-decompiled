package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sml1 implements Parcelable {
    public static final Parcelable.Creator<sml1> CREATOR = new ylk1((byte) 23);
    public final String a;
    public final p6r0 b;
    public final lik1 c;

    public sml1(String str, p6r0 p6r0Var, lik1 lik1Var) {
        this.a = str;
        this.b = p6r0Var;
        this.c = lik1Var;
    }

    public final lik1 a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final p6r0 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sml1)) {
            return false;
        }
        sml1 sml1Var = (sml1) obj;
        return u890.j(this.a, sml1Var.a) && u890.j(this.b, sml1Var.b) && u890.j(this.c, sml1Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
