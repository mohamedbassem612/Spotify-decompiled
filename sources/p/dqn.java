package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dqn implements Parcelable {
    public static final Parcelable.Creator<dqn> CREATOR = new hbn1((byte) 12);
    public final boolean a;
    public final cqn b;

    public dqn(boolean z, cqn cqnVar) {
        this.a = z;
        this.b = cqnVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqn)) {
            return false;
        }
        dqn dqnVar = (dqn) obj;
        return this.a == dqnVar.a && u890.j(this.b, dqnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeParcelable(this.b, i);
    }
}
