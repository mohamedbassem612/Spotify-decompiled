package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class la20 extends pa20 {
    public static final Parcelable.Creator<la20> CREATOR = new u220((byte) 23);
    public final ja20 b;

    public la20(ja20 ja20Var) {
        super("FINISHED");
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
        return (obj instanceof la20) && this.b == ((la20) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
    }

    public /* synthetic */ la20() {
        this(ja20.a);
    }
}
