package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ufm1 implements Parcelable {
    public static final Parcelable.Creator<ufm1> CREATOR = new lfm1(2);
    public final ela1 a;
    public final z771 b;
    public final nfm1 c;
    public final int d;

    public ufm1(int i, z771 z771Var, ela1 ela1Var, nfm1 nfm1Var) {
        this.a = ela1Var;
        this.b = z771Var;
        this.c = nfm1Var;
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public final z771 b() {
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
        if (!(obj instanceof ufm1)) {
            return false;
        }
        ufm1 ufm1Var = (ufm1) obj;
        return u890.j(this.a, ufm1Var.a) && u890.j(this.b, ufm1Var.b) && u890.j(this.c, ufm1Var.c) && this.d == ufm1Var.d;
    }

    public final nfm1 g() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + xvj1.j(this.b.a, this.a.hashCode() * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeInt(this.d);
    }
}
