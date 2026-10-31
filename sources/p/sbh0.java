package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sbh0 extends i5 {
    public static final Parcelable.Creator<sbh0> CREATOR = new aw91((byte) 12);
    public boolean c;

    public sbh0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            sbh0.class.getClassLoader();
        }
        this.c = parcel.readInt() == 1;
    }

    @Override // p.i5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public sbh0(Parcelable parcelable) {
        super(parcelable);
    }
}
