package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pwq0 implements qwq0 {
    public static final Parcelable.Creator<pwq0> CREATOR = new p7q0((byte) 20);
    public final Class a;
    public final Bundle b;
    public final xg30 c;

    public pwq0(Class cls, Bundle bundle, xg30 xg30Var) {
        this.a = cls;
        this.b = bundle;
        this.c = xg30Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwq0)) {
            return false;
        }
        pwq0 pwq0Var = (pwq0) obj;
        return u890.j(this.a, pwq0Var.a) && u890.j(this.b, pwq0Var.b) && u890.j(this.c, pwq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeBundle(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
