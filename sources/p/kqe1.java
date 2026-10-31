package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kqe1 implements mqe1 {
    public static final Parcelable.Creator<kqe1> CREATOR = new pwd1((byte) 24);
    public final List a;
    public final int b;

    public kqe1(List list, int i) {
        this.a = list;
        this.b = i;
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
        if (!(obj instanceof kqe1)) {
            return false;
        }
        kqe1 kqe1Var = (kqe1) obj;
        return u890.j(this.a, kqe1Var.a) && this.b == kqe1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((cte1) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b);
    }
}
