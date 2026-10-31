package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class exe1 extends mxe1 {
    public final String b;
    public static final dxe1 Companion = new dxe1();
    public static final Parcelable.Creator<exe1> CREATOR = new lse1(11);

    public /* synthetic */ exe1(int i, String str) {
        if (1 == (i & 1)) {
            this.b = str;
        } else {
            o6p1.t(i, 1, cxe1.a.getDescriptor());
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
        return (obj instanceof exe1) && u890.j(this.b, ((exe1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public exe1(String str) {
        this.b = str;
    }
}
