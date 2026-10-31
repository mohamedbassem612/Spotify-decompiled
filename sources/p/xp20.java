package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xp20 extends ViewGroup.MarginLayoutParams implements sp20 {
    public static final Parcelable.Creator<xp20> CREATOR = new qe20((byte) 20);
    public int a;
    public float b;
    public float c;
    public int d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean t;

    @Override // p.sp20
    public final void D0(int i) {
        this.f = i;
    }

    @Override // p.sp20
    public final int E() {
        return this.d;
    }

    @Override // p.sp20
    public final int E0() {
        return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    @Override // p.sp20
    public final int F0() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    @Override // p.sp20
    public final float G() {
        return this.c;
    }

    @Override // p.sp20
    public final int J() {
        return this.f;
    }

    @Override // p.sp20
    public final int R() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin;
    }

    @Override // p.sp20
    public final void V(int i) {
        this.g = i;
    }

    @Override // p.sp20
    public final float X() {
        return this.b;
    }

    @Override // p.sp20
    public final int X0() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // p.sp20
    public final float Y() {
        return this.e;
    }

    @Override // p.sp20
    public final int Y0() {
        return this.g;
    }

    @Override // p.sp20
    public final int c1() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.sp20
    public final int getHeight() {
        return ((ViewGroup.MarginLayoutParams) this).height;
    }

    @Override // p.sp20
    public final int getOrder() {
        return this.a;
    }

    @Override // p.sp20
    public final int getWidth() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }

    @Override // p.sp20
    public final boolean h0() {
        return this.t;
    }

    @Override // p.sp20
    public final int o0() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
