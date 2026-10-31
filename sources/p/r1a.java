package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r1a implements Parcelable {
    public static final Parcelable.Creator<r1a> CREATOR = new ux9((byte) 15);
    public int N0;
    public int O0;
    public int P0;
    public int X;
    public int Y;
    public int Z;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f;
    public int g;
    public int h;
    public int i;
    public boolean t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f.toString());
        parcel.writeInt(this.g);
        parcel.writeInt(this.i);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.N0);
        parcel.writeInt(this.O0);
        parcel.writeInt(this.P0);
        parcel.writeInt(this.t ? 1 : 0);
    }
}
