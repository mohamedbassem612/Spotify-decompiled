package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jqe1 implements mqe1 {
    public static final Parcelable.Creator<jqe1> CREATOR = new pwd1((byte) 23);
    public final ArrayList a;
    public final int b;

    public jqe1(int i, ArrayList arrayList) {
        this.a = arrayList;
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
        if (!(obj instanceof jqe1)) {
            return false;
        }
        jqe1 jqe1Var = (jqe1) obj;
        return this.a.equals(jqe1Var.a) && this.b == jqe1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((cte1) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b);
    }
}
