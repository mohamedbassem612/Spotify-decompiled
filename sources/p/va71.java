package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class va71 implements Parcelable {
    public static final Parcelable.Creator<va71> CREATOR = new v871((byte) 8);
    public final cmt a;

    public va71() {
        this(new cmt(c471.a, 3));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va71) && u890.j(this.a, ((va71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }

    public va71(cmt cmtVar) {
        this.a = cmtVar;
    }
}
