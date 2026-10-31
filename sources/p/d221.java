package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d221 extends f221 {
    public static final Parcelable.Creator<d221> CREATOR = new e211((byte) 25);
    public final m0u a;
    public final px31 b;

    public d221(m0u m0uVar, px31 px31Var) {
        this.a = m0uVar;
        this.b = px31Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d221)) {
            return false;
        }
        d221 d221Var = (d221) obj;
        return u890.j(this.a, d221Var.a) && u890.j(this.b, d221Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
