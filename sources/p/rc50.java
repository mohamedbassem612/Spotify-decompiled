package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rc50 implements Parcelable {
    public static final Parcelable.Creator<rc50> CREATOR = new n750((byte) 19);
    public final List a;
    public final List b;

    public rc50(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc50)) {
            return false;
        }
        rc50 rc50Var = (rc50) obj;
        return u890.j(this.a, rc50Var.a) && u890.j(this.b, rc50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeString(((wls0) itM.next()).name());
        }
        Iterator itM2 = kk0.m(parcel, this.b);
        while (itM2.hasNext()) {
            parcel.writeString(((wls0) itM2.next()).name());
        }
    }
}
