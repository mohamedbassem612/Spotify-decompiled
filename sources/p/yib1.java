package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yib1 implements Parcelable {
    public static final Parcelable.Creator<yib1> CREATOR = new nja1((byte) 27);
    public final xe10 a;
    public final ArrayList b;

    public yib1(xe10 xe10Var, ArrayList arrayList) {
        this.a = xe10Var;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yib1)) {
            return false;
        }
        yib1 yib1Var = (yib1) obj;
        return u890.j(this.a, yib1Var.a) && this.b.equals(yib1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            ((xe10) itO.next()).writeToParcel(parcel, i);
        }
    }
}
