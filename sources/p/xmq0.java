package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class xmq0 implements Parcelable {
    public final String a;
    public final String b;
    public final boolean c;
    public static final wmq0 Companion = new wmq0();
    public static final Parcelable.Creator<xmq0> CREATOR = new p7q0((byte) 14);

    public /* synthetic */ xmq0(int i, String str, String str2, boolean z) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, vmq0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmq0)) {
            return false;
        }
        xmq0 xmq0Var = (xmq0) obj;
        return u890.j(this.a, xmq0Var.a) && u890.j(this.b, xmq0Var.b) && this.c == xmq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public xmq0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
