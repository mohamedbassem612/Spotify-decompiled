package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class saa extends i5 {
    public static final Parcelable.ClassLoaderCreator<saa> CREATOR = new aw91((byte) 1);
    public boolean c;

    public saa(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt() == 1;
    }

    public final boolean b() {
        return this.c;
    }

    public final void g(boolean z) {
        this.c = z;
    }

    @Override // p.i5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public saa(Parcelable parcelable) {
        super(parcelable);
    }
}
