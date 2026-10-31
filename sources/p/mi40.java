package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mi40 implements mvd, nvd, Parcelable {
    public static final Parcelable.Creator<mi40> CREATOR = new fd40((byte) 6);
    public final ki40 a;
    public final ivd b;

    public mi40(ki40 ki40Var, ivd ivdVar) {
        this.a = ki40Var;
        this.b = ivdVar;
    }

    @Override // p.mvd
    public final Object a(Collection collection) {
        return new mi40(this.a, this.b.a(collection));
    }

    @Override // p.mvd
    public final Object b(i iVar) {
        return new mi40(this.a, this.b.b(iVar));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi40)) {
            return false;
        }
        mi40 mi40Var = (mi40) obj;
        return u890.j(this.a, mi40Var.a) && u890.j(this.b, mi40Var.b);
    }

    @Override // p.mvd
    public final Object g(i iVar) {
        return new mi40(this.a, this.b.k(iVar, z6x.a, false));
    }

    public final List getItems() {
        return this.b.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
