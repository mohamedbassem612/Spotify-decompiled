package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dn21 implements Parcelable {
    public static final Parcelable.Creator<dn21> CREATOR = new g321((byte) 14);
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;
    public final List e;

    public dn21(List list, List list2, List list3, boolean z, List list4) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = z;
        this.e = list4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn21)) {
            return false;
        }
        dn21 dn21Var = (dn21) obj;
        return u890.j(this.a, dn21Var.a) && this.b.equals(dn21Var.b) && u890.j(this.c, dn21Var.c) && this.d == dn21Var.d && u890.j(this.e, dn21Var.e);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return this.e.hashCode() + xcg1.g((iB + (list == null ? 0 : list.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeInt(((Number) itM.next()).intValue());
        }
        parcel.writeStringList(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeStringList(this.e);
    }
}
