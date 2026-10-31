package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ka61 implements mvd, nvd, Parcelable {
    public static final Parcelable.Creator<ka61> CREATOR = new ge51((byte) 24);
    public final ivd a;
    public final long b;

    public ka61(ivd ivdVar, long j) {
        this.a = ivdVar;
        this.b = j;
    }

    public static ka61 h(ka61 ka61Var, ivd ivdVar) {
        long j = ka61Var.b;
        ka61Var.getClass();
        return new ka61(ivdVar, j);
    }

    @Override // p.mvd
    public final Object a(Collection collection) {
        return h(this, this.a.a(collection));
    }

    @Override // p.mvd
    public final Object b(i iVar) {
        return h(this, this.a.b(iVar));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka61)) {
            return false;
        }
        ka61 ka61Var = (ka61) obj;
        return u890.j(this.a, ka61Var.a) && this.b == ka61Var.b;
    }

    @Override // p.mvd
    public final Object g(i iVar) {
        return h(this, this.a.k(iVar, z6x.a, false));
    }

    public final List getItems() {
        return this.a.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }
}
