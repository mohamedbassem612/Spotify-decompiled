package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z1f1 extends i5 {
    public static final Parcelable.Creator<z1f1> CREATOR = new aw91((byte) 18);
    public int c;
    public boolean d;

    public z1f1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // p.i5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public z1f1(Parcelable parcelable) {
        super(parcelable);
    }
}
