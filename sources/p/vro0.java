package p;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vro0 extends u9 {
    public static final Parcelable.Creator<vro0> CREATOR;
    public static final djo1 i1;
    public static final int[] j1;
    public final int N0;
    public final int O0;
    public final int P0;
    public final int Q0;
    public final int R0;
    public final int S0;
    public final int T0;
    public final int U0;
    public final int V0;
    public final int W0;
    public final int X;
    public final int X0;
    public final int Y;
    public final int Y0;
    public final int Z;
    public final int Z0;
    public final ArrayList a;
    public final int a1;
    public final int[] b;
    public final int b1;
    public final long c;
    public final int c1;
    public final String d;
    public final int d1;
    public final int e;
    public final int e1;
    public final int f;
    public final i2o1 f1;
    public final int g;
    public final boolean g1;
    public final int h;
    public final boolean h1;
    public final int i;
    public final int t;

    static {
        sho1 sho1Var = yho1.g;
        Object[] objArr = {"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"};
        dko1.w(2, objArr);
        i1 = yho1.q(2, objArr);
        j1 = new int[]{0, 1};
        CREATOR = new hmo1((byte) 24);
    }

    public vro0(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder, boolean z, boolean z2) {
        i2o1 i2o1Var;
        this.a = new ArrayList(list);
        this.b = Arrays.copyOf(iArr, iArr.length);
        this.c = j;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.t = i6;
        this.X = i7;
        this.Y = i8;
        this.Z = i9;
        this.N0 = i10;
        this.O0 = i11;
        this.P0 = i12;
        this.Q0 = i13;
        this.R0 = i14;
        this.S0 = i15;
        this.T0 = i16;
        this.U0 = i17;
        this.V0 = i18;
        this.W0 = i19;
        this.X0 = i20;
        this.Y0 = i21;
        this.Z0 = i22;
        this.a1 = i23;
        this.b1 = i24;
        this.c1 = i25;
        this.d1 = i26;
        this.e1 = i27;
        this.g1 = z;
        this.h1 = z2;
        if (iBinder == null) {
            i2o1Var = null;
        } else {
            i2o1 i2o1VarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            i2o1Var = i2o1VarQueryLocalInterface instanceof i2o1 ? i2o1VarQueryLocalInterface : new i2o1(iBinder);
        }
        this.f1 = i2o1Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.H(parcel, 2, this.a);
        int[] iArr = this.b;
        j541.A(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        j541.C(parcel, 4, this.c);
        j541.F(parcel, 5, this.d);
        j541.z(parcel, 6, this.e);
        j541.z(parcel, 7, this.f);
        j541.z(parcel, 8, this.g);
        j541.z(parcel, 9, this.h);
        j541.z(parcel, 10, this.i);
        j541.z(parcel, 11, this.t);
        j541.z(parcel, 12, this.X);
        j541.z(parcel, 13, this.Y);
        j541.z(parcel, 14, this.Z);
        j541.z(parcel, 15, this.N0);
        j541.z(parcel, 16, this.O0);
        j541.z(parcel, 17, this.P0);
        j541.z(parcel, 18, this.Q0);
        j541.z(parcel, 19, this.R0);
        j541.z(parcel, 20, this.S0);
        j541.z(parcel, 21, this.T0);
        j541.z(parcel, 22, this.U0);
        j541.z(parcel, 23, this.V0);
        j541.z(parcel, 24, this.W0);
        j541.z(parcel, 25, this.X0);
        j541.z(parcel, 26, this.Y0);
        j541.z(parcel, 27, this.Z0);
        j541.z(parcel, 28, this.a1);
        j541.z(parcel, 29, this.b1);
        j541.z(parcel, 30, this.c1);
        j541.z(parcel, 31, this.d1);
        j541.z(parcel, 32, this.e1);
        i2o1 i2o1Var = this.f1;
        j541.y(parcel, 33, i2o1Var == null ? null : i2o1Var.asBinder());
        j541.s(parcel, 34, this.g1);
        j541.s(parcel, 35, this.h1);
        j541.n(iJ, parcel);
    }
}
