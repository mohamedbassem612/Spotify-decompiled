package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tsw0 extends vsw0 {
    public static final Parcelable.Creator<tsw0> CREATOR = new w7w0((byte) 25);
    public final List c;

    public tsw0(List list) {
        super(1, list);
        this.c = list;
    }

    public final List a() {
        return this.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tsw0) && this.c.equals(((tsw0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.c);
    }
}
