package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class btr0 implements Parcelable {
    public static final Parcelable.Creator<btr0> CREATOR = new agm0((byte) 5);
    public final List a;
    public final yq01 b;

    public btr0(List list, yq01 yq01Var) {
        this.a = list;
        this.b = yq01Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btr0)) {
            return false;
        }
        btr0 btr0Var = (btr0) obj;
        return this.a.equals(btr0Var.a) && u890.j(this.b, btr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.b, i);
    }
}
