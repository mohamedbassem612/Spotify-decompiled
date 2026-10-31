package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gpr0 implements Parcelable {
    public static final Parcelable.Creator<gpr0> CREATOR = new elr0((byte) 9);
    public final ipr0 a;
    public final List b;

    public gpr0(ipr0 ipr0Var, List list) {
        this.a = ipr0Var;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpr0)) {
            return false;
        }
        gpr0 gpr0Var = (gpr0) obj;
        return u890.j(this.a, gpr0Var.a) && this.b.equals(gpr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((ipr0) itM.next()).writeToParcel(parcel, i);
        }
    }
}
