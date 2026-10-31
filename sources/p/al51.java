package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class al51 extends i5 {
    public static final Parcelable.ClassLoaderCreator<al51> CREATOR = new aw91((byte) 15);
    public xk51 c;

    public al51(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = (xk51) f46.n0(parcel.readInt(), xk51.values());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(((i5) this).a, i);
        xk51 xk51Var = this.c;
        if (xk51Var != null) {
            parcel.writeInt(xk51Var.ordinal());
        }
    }
}
