package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hqe1 implements mqe1 {
    public static final Parcelable.Creator<hqe1> CREATOR = new pwd1((byte) 21);
    public final List a;
    public final ure1 b;
    public final int c;

    public hqe1(List list, ure1 ure1Var, int i) {
        this.a = list;
        this.b = ure1Var;
        this.c = i;
    }

    @Override // p.mqe1
    public final List A0() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqe1)) {
            return false;
        }
        hqe1 hqe1Var = (hqe1) obj;
        return u890.j(this.a, hqe1Var.a) && u890.j(this.b, hqe1Var.b) && this.c == hqe1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((cte1) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
    }
}
