package p;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p611 extends i5 {
    public static final Parcelable.Creator<p611> CREATOR = new aw91((byte) 13);
    public Parcelable c;

    public p611(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? a.class.getClassLoader() : classLoader);
    }

    public final void b(p611 p611Var) {
        this.c = p611Var.c;
    }

    @Override // p.i5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, 0);
    }

    public p611(Parcelable parcelable) {
        super(parcelable);
    }
}
