package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cc21 implements Parcelable, jik1 {
    public static final Parcelable.Creator<cc21> CREATOR = new g321((byte) 1);
    public final String a;

    public cc21(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc21) && u890.j(this.a, ((cc21) obj).a);
    }

    public final lik1 getViewUri() {
        Parcelable.Creator creator = lik1.CREATOR;
        String str = null;
        b7x b7xVar = (14 & 2) != 0 ? b7x.a : null;
        if ((14 & 8) != 0) {
            b7xVar.getClass();
            str = "spotify:internal:parental-control:remove-teen:" + this.a + "";
        }
        return new lik1(str);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
