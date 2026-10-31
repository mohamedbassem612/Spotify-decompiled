package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a2s0 implements Parcelable {
    public static final Parcelable.Creator<a2s0> CREATOR = new zsr0((byte) 12);
    public final boolean a;
    public final l2s0 b;
    public final lax c;

    public a2s0(boolean z, l2s0 l2s0Var, lax laxVar) {
        this.a = z;
        this.b = l2s0Var;
        this.c = laxVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2s0)) {
            return false;
        }
        a2s0 a2s0Var = (a2s0) obj;
        return this.a == a2s0Var.a && u890.j(this.b, a2s0Var.b) && u890.j(this.c, a2s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
