package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class trc implements vrc {
    public static final Parcelable.Creator<trc> CREATOR = new yyb((byte) 9);
    public final List a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public trc(int i, List list, boolean z, boolean z2) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trc)) {
            return false;
        }
        trc trcVar = (trc) obj;
        return this.a.equals(trcVar.a) && this.b == trcVar.b && this.c == trcVar.c && this.d == trcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeDouble(((Number) itM.next()).doubleValue());
        }
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
