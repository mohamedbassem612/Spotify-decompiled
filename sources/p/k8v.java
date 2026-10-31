package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k8v extends i5 {
    public static final Parcelable.Creator<k8v> CREATOR = new aw91((byte) 6);
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public k8v(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = 0;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    @Override // p.i5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }

    public k8v(Parcelable parcelable) {
        super(parcelable);
        this.c = 0;
    }
}
