package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t2c0 implements Parcelable {
    public static final Parcelable.Creator<t2c0> CREATOR = new cwb0((byte) 6);
    public final boolean a;
    public final cqs0 b;

    public t2c0(boolean z, cqs0 cqs0Var) {
        this.a = z;
        this.b = cqs0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2c0)) {
            return false;
        }
        t2c0 t2c0Var = (t2c0) obj;
        return this.a == t2c0Var.a && u890.j(this.b, t2c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        m7 m7Var = this.b;
        parcel.writeInt(m7Var.c());
        for (Map.Entry entry : m7Var.a()) {
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
    }
}
