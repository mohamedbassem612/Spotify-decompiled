package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class o711 implements Parcelable {
    public final j65 a;
    public static final n711 Companion = new n711();
    public static final Parcelable.Creator<o711> CREATOR = new e211((byte) 4);

    public /* synthetic */ o711(int i, j65 j65Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = j65Var;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o711) && u890.j(this.a, ((o711) obj).a);
    }

    public final int hashCode() {
        j65 j65Var = this.a;
        if (j65Var == null) {
            return 0;
        }
        return j65Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j65 j65Var = this.a;
        if (j65Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            j65Var.writeToParcel(parcel, i);
        }
    }

    public o711(j65 j65Var) {
        this.a = j65Var;
    }
}
