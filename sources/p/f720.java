package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f720 implements Parcelable {
    public static final Parcelable.Creator<f720> CREATOR = new u220((byte) 12);
    public final uha1 a;
    public final List b;

    public f720(List list, uha1 uha1Var) {
        this.a = uha1Var;
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
        if (!(obj instanceof f720)) {
            return false;
        }
        f720 f720Var = (f720) obj;
        return u890.j(this.a, f720Var.a) && this.b.equals(f720Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((qa20) itM.next()).writeToParcel(parcel, i);
        }
    }
}
