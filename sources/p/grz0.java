package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class grz0 implements Parcelable {
    public static final Parcelable.Creator<grz0> CREATOR = new erz0((byte) 1);
    public final frz0 a;

    public grz0(frz0 frz0Var) {
        this.a = frz0Var;
    }

    public final frz0 a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grz0) && u890.j(this.a, ((grz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
