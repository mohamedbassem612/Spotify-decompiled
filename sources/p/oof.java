package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oof implements pof {
    public static final Parcelable.Creator<oof> CREATOR = new zbf((byte) 23);
    public final String a;
    public final t7q0 b;

    public oof(String str, t7q0 t7q0Var) {
        this.a = str;
        this.b = t7q0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oof)) {
            return false;
        }
        oof oofVar = (oof) obj;
        return u890.j(this.a, oofVar.a) && u890.j(this.b, oofVar.b);
    }

    @Override // p.pof
    public final String getViewUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
