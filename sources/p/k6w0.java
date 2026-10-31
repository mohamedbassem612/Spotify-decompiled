package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k6w0 implements Parcelable {
    public static final Parcelable.Creator<k6w0> CREATOR = new g0v0((byte) 27);
    public final q4j0 a;
    public final d3j0 b;
    public final iu30 c;

    public k6w0(q4j0 q4j0Var, d3j0 d3j0Var, iu30 iu30Var) {
        this.a = q4j0Var;
        this.b = d3j0Var;
        this.c = iu30Var;
    }

    public final d3j0 a() {
        return this.b;
    }

    public final iu30 b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6w0)) {
            return false;
        }
        k6w0 k6w0Var = (k6w0) obj;
        return u890.j(this.a, k6w0Var.a) && u890.j(this.b, k6w0Var.b) && u890.j(this.c, k6w0Var.c);
    }

    public final q4j0 g() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
        parcel.writeSerializable((Serializable) this.c);
    }
}
