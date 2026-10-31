package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class epf0 implements Parcelable {
    public static final Parcelable.Creator<epf0> CREATOR = new j7f0((byte) 27);
    public final String a;
    public final List b;
    public final bff0 c;

    public epf0(String str, List list, bff0 bff0Var) {
        this.a = str;
        this.b = list;
        this.c = bff0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epf0)) {
            return false;
        }
        epf0 epf0Var = (epf0) obj;
        return u890.j(this.a, epf0Var.a) && u890.j(this.b, epf0Var.b) && u890.j(this.c, epf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeInt(((Number) itM.next()).intValue());
        }
        parcel.writeParcelable(this.c, i);
    }
}
