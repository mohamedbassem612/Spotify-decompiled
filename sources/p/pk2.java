package p;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@o661
public final class pk2 implements Parcelable {
    public final int a;
    public final String b;
    public static final ok2 Companion = new ok2();
    public static final Parcelable.Creator<pk2> CREATOR = new ue2((byte) 16);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ pk2(int i, int i2, String str) throws MissingFieldException {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, nk2.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk2)) {
            return false;
        }
        pk2 pk2Var = (pk2) obj;
        return this.a == pk2Var.a && u890.j(this.b, pk2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
    }

    public pk2(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
