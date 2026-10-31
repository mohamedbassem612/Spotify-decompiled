package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gqe1 implements mqe1 {
    public static final Parcelable.Creator<gqe1> CREATOR = new pwd1((byte) 20);
    public final List a;

    public gqe1(List list) {
        this.a = list;
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
        return (obj instanceof gqe1) && u890.j(this.a, ((gqe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((cte1) itM.next()).writeToParcel(parcel, i);
        }
    }
}
