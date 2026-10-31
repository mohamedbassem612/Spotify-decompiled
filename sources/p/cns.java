package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cns implements Parcelable {
    public static final Parcelable.Creator<cns> CREATOR = new qms((byte) 1);
    public final Set a;
    public final Set b;
    public final Set c;

    public cns(Set set, Set set2, Set set3) {
        this.a = set;
        this.b = set2;
        this.c = set3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cns)) {
            return false;
        }
        cns cnsVar = (cns) obj;
        return u890.j(this.a, cnsVar.a) && u890.j(this.b, cnsVar.b) && u890.j(this.c, cnsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gvg.c(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itH = k4s0.h(this.a, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        Iterator itH2 = k4s0.h(this.b, parcel);
        while (itH2.hasNext()) {
            parcel.writeString((String) itH2.next());
        }
        Iterator itH3 = k4s0.h(this.c, parcel);
        while (itH3.hasNext()) {
            parcel.writeString((String) itH3.next());
        }
    }
}
