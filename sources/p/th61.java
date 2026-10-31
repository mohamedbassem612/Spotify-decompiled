package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class th61 implements Parcelable {
    public static final Parcelable.Creator<th61> CREATOR = new ge51((byte) 28);
    public final String X;
    public final km Y;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final yg8 f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final zcs0 t;

    public /* synthetic */ th61(String str, boolean z, yg8 yg8Var, String str2, boolean z2, boolean z3, zcs0 zcs0Var, String str3, km kmVar, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, false, false, 0, (i & 32) != 0 ? null : yg8Var, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? new zcs0((String) null) : zcs0Var, (i & 1024) != 0 ? "" : str3, (i & 2048) != 0 ? new km("", "") : kmVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th61)) {
            return false;
        }
        th61 th61Var = (th61) obj;
        return u890.j(this.a, th61Var.a) && this.b == th61Var.b && this.c == th61Var.c && this.d == th61Var.d && this.e == th61Var.e && this.f == th61Var.f && u890.j(this.g, th61Var.g) && this.h == th61Var.h && this.i == th61Var.i && u890.j(this.t, th61Var.t) && u890.j(this.X, th61Var.X) && u890.j(this.Y, th61Var.Y);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        yg8 yg8Var = this.f;
        return this.Y.hashCode() + cy30.d((xcg1.g(xcg1.g(cy30.d((iF + (yg8Var == null ? 0 : yg8Var.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i) + Arrays.hashCode(this.t.a)) * 31, 31, this.X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        yg8 yg8Var = this.f;
        if (yg8Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(yg8Var.name());
        }
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        ppo1.v(this.t, parcel);
        parcel.writeString(this.X);
        this.Y.writeToParcel(parcel, i);
    }

    public th61(String str, boolean z, boolean z2, boolean z3, int i, yg8 yg8Var, String str2, boolean z4, boolean z5, zcs0 zcs0Var, String str3, km kmVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.f = yg8Var;
        this.g = str2;
        this.h = z4;
        this.i = z5;
        this.t = zcs0Var;
        this.X = str3;
        this.Y = kmVar;
    }
}
