package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hcf extends mcf {
    public static final Parcelable.Creator<hcf> CREATOR = new zbf((byte) 7);
    public final gcf a;
    public final boolean b;
    public final rqn c;

    public hcf(gcf gcfVar, boolean z, rqn rqnVar) {
        this.a = gcfVar;
        this.b = z;
        this.c = rqnVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcf)) {
            return false;
        }
        hcf hcfVar = (hcf) obj;
        return u890.j(this.a, hcfVar.a) && this.b == hcfVar.b && u890.j(this.c, hcfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }
}
