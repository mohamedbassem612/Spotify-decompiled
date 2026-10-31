package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jnn0 implements Parcelable {
    public static final Parcelable.Creator<jnn0> CREATOR = new dan0((byte) 10);
    public final String a;
    public final int b;
    public final Bundle c;
    public final Bundle d;

    public jnn0(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        this.a = string;
        this.b = parcel.readInt();
        this.c = parcel.readBundle(jnn0.class.getClassLoader());
        Bundle bundle = parcel.readBundle(jnn0.class.getClassLoader());
        bundle.getClass();
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeBundle(this.c);
        parcel.writeBundle(this.d);
    }

    public jnn0(hnn0 hnn0Var) {
        this.a = hnn0Var.f;
        this.b = hnn0Var.b.h;
        this.c = hnn0Var.a();
        Bundle bundle = new Bundle();
        this.d = bundle;
        hnn0Var.i.o(bundle);
    }
}
