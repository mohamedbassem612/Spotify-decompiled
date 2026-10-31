package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s69 implements Parcelable {
    public static final Parcelable.Creator<s69> CREATOR = new so8((byte) 12);
    public final ArrayList a;
    public final double b;
    public final double c;

    public s69(ArrayList arrayList, double d, double d2) {
        this.a = arrayList;
        this.b = d;
        this.c = d2;
    }

    public final String a() {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((p69) it.next()).a.size();
        }
        StringBuilder sbQ = cy30.q(arrayList.size(), size, "AutomationCurves(", " curves, ", " pts, range=[");
        sbQ.append(this.b);
        sbQ.append(",");
        sbQ.append(this.c);
        sbQ.append("])");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s69)) {
            return false;
        }
        s69 s69Var = (s69) obj;
        return this.a.equals(s69Var.a) && Double.compare(this.b, s69Var.b) == 0 && Double.compare(this.c, s69Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + xcg1.e(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((p69) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
    }
}
