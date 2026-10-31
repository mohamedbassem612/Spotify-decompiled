package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zp20 extends g611 implements sp20 {
    public static final Parcelable.Creator<zp20> CREATOR = new qe20((byte) 21);
    public int X;
    public int Y;
    public boolean Z;
    public float e;
    public float f;
    public int g;
    public float h;
    public int i;
    public int t;

    @Override // p.sp20
    public final void D0(int i) {
        this.i = i;
    }

    @Override // p.sp20
    public final int E() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.sp20
    public final int E0() {
        return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.sp20
    public final int F0() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    @Override // p.sp20
    public final float G() {
        return this.f;
    }

    @Override // p.sp20
    public final int J() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.sp20
    public final int R() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin;
    }

    @Override // p.sp20
    public final void V(int i) {
        this.t = i;
    }

    @Override // p.sp20
    public final float X() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.sp20
    public final int X0() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // p.sp20
    public final float Y() {
        return this.h;
    }

    @Override // p.sp20
    public final int Y0() {
        return this.t;
    }

    @Override // p.sp20
    public final int c1() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.sp20
    public final int getHeight() {
        return ((ViewGroup.MarginLayoutParams) this).height;
    }

    @Override // p.sp20
    public final int getOrder() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.sp20
    public final int getWidth() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }

    @Override // p.sp20
    public final boolean h0() {
        return this.Z;
    }

    @Override // p.sp20
    public final int o0() {
        return this.X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeInt(this.g);
        parcel.writeFloat(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.t);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
