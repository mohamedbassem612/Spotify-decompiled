package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hlg1 implements Parcelable {
    public static final Parcelable.Creator<hlg1> CREATOR = new h3g1((byte) 9);
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;

    public hlg1(Set set, Set set2, Set set3, Set set4, Set set5) {
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
        this.e = set5;
    }

    public static hlg1 a(hlg1 hlg1Var, LinkedHashSet linkedHashSet, Set set, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, LinkedHashSet linkedHashSet4, int i) {
        Set set2 = linkedHashSet;
        if ((i & 1) != 0) {
            set2 = hlg1Var.a;
        }
        Set set3 = set2;
        if ((i & 2) != 0) {
            set = hlg1Var.b;
        }
        Set set4 = set;
        Set set5 = linkedHashSet2;
        if ((i & 4) != 0) {
            set5 = hlg1Var.c;
        }
        Set set6 = set5;
        Set set7 = linkedHashSet3;
        if ((i & 8) != 0) {
            set7 = hlg1Var.d;
        }
        Set set8 = set7;
        Set set9 = linkedHashSet4;
        if ((i & 16) != 0) {
            set9 = hlg1Var.e;
        }
        hlg1Var.getClass();
        return new hlg1(set3, set4, set6, set8, set9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlg1)) {
            return false;
        }
        hlg1 hlg1Var = (hlg1) obj;
        return u890.j(this.a, hlg1Var.a) && u890.j(this.b, hlg1Var.b) && u890.j(this.c, hlg1Var.c) && u890.j(this.d, hlg1Var.d) && u890.j(this.e, hlg1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gvg.c(gvg.c(gvg.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itH = k4s0.h(this.a, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        Iterator itH2 = k4s0.h(this.b, parcel);
        while (itH2.hasNext()) {
            ((af41) itH2.next()).writeToParcel(parcel, i);
        }
        Iterator itH3 = k4s0.h(this.c, parcel);
        while (itH3.hasNext()) {
            parcel.writeString((String) itH3.next());
        }
        Iterator itH4 = k4s0.h(this.d, parcel);
        while (itH4.hasNext()) {
            parcel.writeString((String) itH4.next());
        }
        Iterator itH5 = k4s0.h(this.e, parcel);
        while (itH5.hasNext()) {
            parcel.writeString((String) itH5.next());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hlg1() {
        w7x w7xVar = w7x.a;
        this(w7xVar, w7xVar, w7xVar, w7xVar, w7xVar);
    }
}
