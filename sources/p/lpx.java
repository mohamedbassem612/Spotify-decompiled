package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lpx extends hux {
    public static final Parcelable.Creator<lpx> CREATOR;
    public static final lpx c;

    static {
        b180 b180VarB;
        b180 b180VarB2 = eko1.f;
        if (b180VarB2 == null) {
            a180 a180Var = new a180("Encore.Vector.NowPlaying16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(4.25f, 16.0f);
            cwh0Var.i(-2.5f);
            cwh0Var.j(1.75f, 5.5f);
            rjx.v(cwh0Var, 2.5f, 9.25f, 16.0f, -2.5f);
            rjx.r(cwh0Var, 6.75f, 1.5f, 2.5f);
            cwh0Var.l(14.25f, 16.0f);
            cwh0Var.i(-2.5f);
            cwh0Var.j(11.75f, 9.5f);
            cwh0Var.i(2.5f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var.b();
            eko1.f = b180VarB2;
        }
        b180 b180Var = iko1.a;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var2 = new a180("Encore.Vector.NowPlaying24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(6.0f, 24.0f, 2.0f, 24.0f);
            rjx.r(cwh0VarI, 2.0f, 8.0f, 4.0f);
            cwh0VarI.l(14.0f, 24.0f);
            cwh0VarI.i(-4.0f);
            cwh0VarI.j(10.0f, 2.0f);
            cwh0VarI.i(4.0f);
            cwh0VarI.e();
            cwh0VarI.l(22.0f, 24.0f);
            cwh0VarI.i(-4.0f);
            cwh0VarI.j(18.0f, 14.0f);
            cwh0VarI.i(4.0f);
            cwh0VarI.e();
            a180.a(a180Var2, cwh0VarI.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var2.b();
            iko1.a = b180VarB;
        }
        dsx dsxVar = new dsx(b180VarB2, b180VarB);
        b180 b180VarB3 = nko1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.NowPlayingActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(0.999f, 15.0f);
            cwh0Var2.i(2.0f);
            cwh0Var2.j(2.999f, 5.0f);
            rjx.v(cwh0Var2, -2.0f, 4.999f, 15.0f, 2.0f);
            rjx.r(cwh0Var2, 6.999f, 1.0f, -2.0f);
            rjx.z(cwh0Var2, 9.0f, 15.0f, 2.0f, -4.0f);
            rjx.u(cwh0Var2, 9.0f, 11.0f, 13.0f, 8.0f);
            cwh0Var2.v(7.0f);
            cwh0Var2.i(2.0f);
            cwh0Var2.j(15.0f, 8.0f);
            cwh0Var2.e();
            a180.a(a180Var3, cwh0Var2.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            nko1.a = b180VarB3;
        }
        b180 b180VarB4 = zko1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.NowPlayingActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0Var3 = new cwh0();
            cwh0Var3.l(8.0f, 4.0f);
            cwh0Var3.v(18.0f);
            cwh0Var3.i(2.0f);
            rjx.u(cwh0Var3, 10.0f, 4.0f, 2.0f, 22.0f);
            cwh0Var3.j(2.0f, 9.0f);
            cwh0Var3.i(2.0f);
            cwh0Var3.v(13.0f);
            cwh0Var3.e();
            cwh0Var3.l(20.0f, 11.0f);
            cwh0Var3.v(11.0f);
            cwh0Var3.i(2.0f);
            rjx.u(cwh0Var3, 22.0f, 11.0f, 14.0f, 15.0f);
            cwh0Var3.v(7.0f);
            cwh0Var3.i(2.0f);
            cwh0Var3.v(-7.0f);
            cwh0Var3.e();
            a180.a(a180Var4, cwh0Var3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            zko1.b = b180VarB4;
        }
        c = new lpx(dsxVar, new dsx(b180VarB3, b180VarB4));
        CREATOR = new yox((byte) 12);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lpx);
    }

    public final int hashCode() {
        return 764442509;
    }

    public final String toString() {
        return "NowPlaying";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
