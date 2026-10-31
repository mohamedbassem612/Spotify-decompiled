package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z21 extends r31 {
    public static final Parcelable.Creator<z21> CREATOR = new t21((byte) 5);
    public final String a;
    public final List b;
    public final List c;

    public z21(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z21)) {
            return false;
        }
        z21 z21Var = (z21) obj;
        return u890.j(this.a, z21Var.a) && this.b.equals(z21Var.b) && this.c.equals(z21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        parcel.writeStringList(this.c);
    }
}
