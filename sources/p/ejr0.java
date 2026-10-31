package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ejr0 implements mvd, nvd, Parcelable {
    public static final Parcelable.Creator<ejr0> CREATOR = new p7q0((byte) 28);
    public final ivd a;
    public final int b;

    public ejr0(ivd ivdVar, int i) {
        this.a = ivdVar;
        this.b = i;
    }

    public static ejr0 h(ejr0 ejr0Var, ivd ivdVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            ivdVar = ejr0Var.a;
        }
        if ((i2 & 2) != 0) {
            i = ejr0Var.b;
        }
        return new ejr0(ivdVar, i);
    }

    @Override // p.mvd
    public final Object a(Collection collection) {
        return h(this, this.a.a(collection), 0, 2);
    }

    @Override // p.mvd
    public final Object b(i iVar) {
        return h(this, this.a.b(iVar), 0, 2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejr0)) {
            return false;
        }
        ejr0 ejr0Var = (ejr0) obj;
        return u890.j(this.a, ejr0Var.a) && this.b == ejr0Var.b;
    }

    @Override // p.mvd
    public final Object g(i iVar) {
        return h(this, this.a.k(iVar, z6x.a, false), 0, 2);
    }

    public final List getItems() {
        return this.a.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
    }
}
