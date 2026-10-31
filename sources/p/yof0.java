package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yof0 implements Parcelable {
    public static final Parcelable.Creator<yof0> CREATOR = new j7f0((byte) 26);
    public final String a;
    public final ArrayList b;
    public final bff0 c;

    public yof0(String str, ArrayList arrayList, bff0 bff0Var) {
        this.a = str;
        this.b = arrayList;
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
        if (!(obj instanceof yof0)) {
            return false;
        }
        yof0 yof0Var = (yof0) obj;
        return u890.j(this.a, yof0Var.a) && this.b.equals(yof0Var.b) && u890.j(this.c, yof0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            parcel.writeInt(((Number) itO.next()).intValue());
        }
        parcel.writeParcelable(this.c, i);
    }
}
