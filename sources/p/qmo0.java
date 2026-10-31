package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class qmo0 extends vmo0 {
    public final List b;
    public static final pmo0 Companion = new pmo0();
    public static final Parcelable.Creator<qmo0> CREATOR = new b4o0((byte) 16);
    public static final znb0[] c = {dm5.S(2, fsm0.c1)};

    public /* synthetic */ qmo0(int i, List list) {
        if (1 == (i & 1)) {
            this.b = list;
        } else {
            o6p1.t(i, 1, omo0.a.getDescriptor());
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmo0) && u890.j(this.b, ((qmo0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((ybi1) itM.next()).writeToParcel(parcel, i);
        }
    }

    public qmo0(ArrayList arrayList) {
        this.b = arrayList;
    }
}
