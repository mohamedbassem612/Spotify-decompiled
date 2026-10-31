package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class he51 extends ie51 {
    public final String b;
    public static final fe51 Companion = new fe51();
    public static final Parcelable.Creator<he51> CREATOR = new ge51((byte) 0);

    public /* synthetic */ he51(int i, String str) {
        if (1 == (i & 1)) {
            this.b = str;
        } else {
            o6p1.t(i, 1, ee51.a.getDescriptor());
            throw null;
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
        return (obj instanceof he51) && u890.j(this.b, ((he51) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public he51(String str) {
        this.b = str;
    }
}
