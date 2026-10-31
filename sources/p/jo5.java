package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jo5 implements Parcelable {
    public static final Parcelable.Creator<jo5> CREATOR = new i93((byte) 29);
    public final do5 a;

    public jo5(do5 do5Var) {
        this.a = do5Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jo5) && u890.j(this.a, ((jo5) obj).a);
    }

    public final int hashCode() {
        do5 do5Var = this.a;
        if (do5Var == null) {
            return 0;
        }
        return do5Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
    }
}
