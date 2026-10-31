package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oa20 extends pa20 {
    public static final Parcelable.Creator<oa20> CREATOR = new u220((byte) 26);
    public final ja20 b;

    public oa20(ja20 ja20Var) {
        super("VIDEO");
        this.b = ja20Var;
    }

    @Override // p.pa20
    public final ja20 a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oa20) && this.b == ((oa20) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
    }

    public /* synthetic */ oa20() {
        this(ja20.b);
    }
}
