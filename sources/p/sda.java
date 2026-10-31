package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sda implements mvd, nvd, Parcelable {
    public static final Parcelable.Creator<sda> CREATOR = new ux9((byte) 23);
    public final ivd a;

    public sda(ivd ivdVar) {
        this.a = ivdVar;
    }

    @Override // p.mvd
    public final Object a(Collection collection) {
        return new sda(this.a.a(collection));
    }

    @Override // p.mvd
    public final Object b(i iVar) {
        return new sda(this.a.b(iVar));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sda) && u890.j(this.a, ((sda) obj).a);
    }

    @Override // p.mvd
    public final Object g(i iVar) {
        return new sda(this.a.k(iVar, z6x.a, false));
    }

    public final List getItems() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
