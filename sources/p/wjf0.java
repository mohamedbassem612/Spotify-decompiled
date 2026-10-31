package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wjf0 implements Parcelable {
    public static final Parcelable.Creator<wjf0> CREATOR = new j7f0(16);
    public final boolean a;
    public final ofm0 b;
    public final int c;

    public wjf0(boolean z, ofm0 ofm0Var, int i) {
        this.a = z;
        this.b = ofm0Var;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjf0)) {
            return false;
        }
        wjf0 wjf0Var = (wjf0) obj;
        return this.a == wjf0Var.a && this.b == wjf0Var.b && this.c == wjf0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
    }

    public /* synthetic */ wjf0() {
        this(false, ofm0.a, 0);
    }
}
