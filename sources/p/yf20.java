package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yf20 implements Parcelable {
    public static final Parcelable.Creator<yf20> CREATOR = new qe20((byte) 5);
    public final xf20 a;
    public final c380 b;

    public yf20(xf20 xf20Var, c9 c9Var) {
        this.a = xf20Var;
        this.b = c9Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf20)) {
            return false;
        }
        yf20 yf20Var = (yf20) obj;
        return u890.j(this.a, yf20Var.a) && this.b.equals(yf20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        Iterator itL = x0d.l(this.b, parcel);
        while (itL.hasNext()) {
            ((wf20) itL.next()).writeToParcel(parcel, i);
        }
    }
}
