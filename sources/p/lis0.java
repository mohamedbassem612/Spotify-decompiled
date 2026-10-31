package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lis0 implements dtb1 {
    public static final Parcelable.Creator<lis0> CREATOR = new bis0((byte) 2);
    public final dis0 a;
    public final ArrayList b;
    public final String c;

    public lis0(dis0 dis0Var, ArrayList arrayList, String str) {
        this.a = dis0Var;
        this.b = arrayList;
        this.c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lis0)) {
            return false;
        }
        lis0 lis0Var = (lis0) obj;
        return u890.j(this.a, lis0Var.a) && u890.j(this.b, lis0Var.b) && u890.j(this.c, lis0Var.c);
    }

    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            ((kis0) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
    }

    public /* synthetic */ lis0(dis0 dis0Var, ArrayList arrayList) {
        this(dis0Var, arrayList, "PeopleBottomSheet");
    }
}
