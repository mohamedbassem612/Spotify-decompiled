package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lqr0 implements Parcelable.ClassLoaderCreator {
    public final mqr0 a;

    public lqr0(mqr0 mqr0Var) {
        this.a = mqr0Var;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return this.a.createFromParcel(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return this.a.newArray(i);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.a.createFromParcel(parcel, classLoader);
    }
}
