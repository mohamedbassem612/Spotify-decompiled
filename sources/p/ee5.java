package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ee5 implements Parcelable {
    public static final Parcelable.Creator<ee5> CREATOR = new hbn1((byte) 3);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public ee5(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        if (i == 0 && i2 == 0) {
            this.d = 2130772008;
            this.e = 2130772011;
        } else {
            this.d = i;
            this.e = i2;
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
        if (!(obj instanceof ee5)) {
            return false;
        }
        ee5 ee5Var = (ee5) obj;
        return this.a == ee5Var.a && this.d == ee5Var.d && this.e == ee5Var.e;
    }

    public final int hashCode() {
        return ((((this.a ? 1 : 0) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationSpec{crossfade=");
        sb.append(this.a);
        sb.append(", enterAnim=");
        sb.append(this.d);
        sb.append(", exitAnim=");
        return gvg.j(sb, this.e, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
