package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vod1 implements otl {
    public static final Parcelable.Creator<vod1> CREATOR = new agm0((byte) 16);
    public final String a;
    public final String b;
    public final int c;

    public vod1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vod1) && u890.j(((vod1) obj).a, this.a);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
