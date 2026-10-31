package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qqr0 implements Parcelable {
    public static final Parcelable.Creator<qqr0> CREATOR = new elr0((byte) 15);
    public final String a;
    public final String b;
    public final ArrayList c;

    public qqr0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqr0)) {
            return false;
        }
        qqr0 qqr0Var = (qqr0) obj;
        return u890.j(this.a, qqr0Var.a) && u890.j(this.b, qqr0Var.b) && this.c.equals(qqr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            ((irr0) itO.next()).writeToParcel(parcel, i);
        }
    }
}
