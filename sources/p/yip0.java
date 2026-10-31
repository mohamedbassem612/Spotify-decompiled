package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class yip0 implements Parcelable {
    public final String a;
    public static final xip0 Companion = new xip0();
    public static final Parcelable.Creator<yip0> CREATOR = new b4o0((byte) 28);

    public /* synthetic */ yip0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, wip0.a.getDescriptor());
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
        return (obj instanceof yip0) && u890.j(this.a, ((yip0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public yip0(String str) {
        this.a = str;
    }
}
