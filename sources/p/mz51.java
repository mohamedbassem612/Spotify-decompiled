package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mz51 implements Parcelable {
    public static final Parcelable.Creator<mz51> CREATOR = new ge51((byte) 17);
    public final ly31 a;
    public final List b;

    public mz51(ly31 ly31Var, List list) {
        this.a = ly31Var;
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
        if (!(obj instanceof mz51)) {
            return false;
        }
        mz51 mz51Var = (mz51) obj;
        return u890.j(this.a, mz51Var.a) && u890.j(this.b, mz51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeInt(((Number) itM.next()).intValue());
        }
    }
}
