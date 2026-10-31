package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hfs0 implements ifs0 {
    public static final Parcelable.Creator<hfs0> CREATOR = new ybs0((byte) 19);
    public final String a;
    public final List b;

    public hfs0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfs0)) {
            return false;
        }
        hfs0 hfs0Var = (hfs0) obj;
        return u890.j(this.a, hfs0Var.a) && u890.j(this.b, hfs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // p.ifs0
    public final List l0() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((efs0) itM.next()).writeToParcel(parcel, i);
        }
    }
}
