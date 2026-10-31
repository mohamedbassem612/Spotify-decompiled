package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rn71 implements Parcelable {
    public static final Parcelable.Creator<rn71> CREATOR = new ff71(29);
    public final tka0 a;

    public rn71(tka0 tka0Var) {
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
        return (obj instanceof rn71) && u890.j(this.a, ((rn71) obj).a);
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
