package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class u150 implements x150 {
    public final boolean a;
    public final String b;
    public static final t150 Companion = new t150();
    public static final Parcelable.Creator<u150> CREATOR = new fd40(19);

    public /* synthetic */ u150(String str, int i, boolean z) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, s150.a.getDescriptor());
            throw null;
        }
        this.a = z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
        if (!(obj instanceof u150)) {
            return false;
        }
        u150 u150Var = (u150) obj;
        return this.a == u150Var.a && u890.j(this.b, u150Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b);
    }

    public u150(boolean z, String str) {
        this.a = z;
        this.b = str;
    }
}
