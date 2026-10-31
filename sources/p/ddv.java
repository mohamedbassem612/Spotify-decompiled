package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ddv implements Parcelable {
    public static final Parcelable.Creator<ddv> CREATOR = new s5v((byte) 4);
    public final cns a;
    public final List b;

    public ddv(cns cnsVar, List list) {
        this.a = cnsVar;
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
        if (!(obj instanceof ddv)) {
            return false;
        }
        ddv ddvVar = (ddv) obj;
        return u890.j(this.a, ddvVar.a) && u890.j(this.b, ddvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((qdv) itM.next()).writeToParcel(parcel, i);
        }
    }
}
