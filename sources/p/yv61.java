package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum yv61 implements Parcelable {
    INFO(3),
    WARNING(2),
    ERROR(1);

    public static final Parcelable.Creator<yv61> CREATOR = new hs61((byte) 8);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    yv61(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
