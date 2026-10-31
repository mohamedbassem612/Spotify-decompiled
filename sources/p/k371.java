package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k371 implements Parcelable {
    public static final Parcelable.Creator<k371> CREATOR = new hs61(26);
    public final wa71 a;
    public final Bundle b;
    public final xm71 c;
    public final List d;

    public k371(wa71 wa71Var, Bundle bundle, xm71 xm71Var, List list) {
        this.a = wa71Var;
        this.b = bundle;
        this.c = xm71Var;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k371)) {
            return false;
        }
        k371 k371Var = (k371) obj;
        return u890.j(this.a, k371Var.a) && u890.j(this.b, k371Var.b) && u890.j(this.c, k371Var.c) && u890.j(this.d, k371Var.d);
    }

    public final int hashCode() {
        wa71 wa71Var = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((wa71Var == null ? 0 : wa71Var.hashCode()) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        wa71 wa71Var = this.a;
        if (wa71Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wa71Var.writeToParcel(parcel, i);
        }
        parcel.writeBundle(this.b);
        parcel.writeParcelable(this.c, i);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }
}
