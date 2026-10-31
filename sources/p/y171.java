package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y171 implements Parcelable {
    public static final Parcelable.Creator<y171> CREATOR = new hs61(20);
    public final tka0 a;

    public y171(tka0 tka0Var) {
        this.a = tka0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y171) && u890.j(this.a, ((y171) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        wdg wdgVar = this.a;
        parcel.writeString(wdgVar != null ? wdgVar.n().getName() : null);
    }
}
