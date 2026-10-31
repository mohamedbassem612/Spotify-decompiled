package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pnf1 {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final ie30[] d;
    public int e;

    static {
        String str = zoi1.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public pnf1(String str, ie30... ie30VarArr) {
        dm5.m(ie30VarArr.length > 0);
        this.b = str;
        this.d = ie30VarArr;
        this.a = ie30VarArr.length;
        String str2 = ie30VarArr[0].f66p;
        this.c = TextUtils.isEmpty(str2) ? asj0.i(ie30VarArr[0].o) : asj0.i(str2);
        String str3 = ie30VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = ie30VarArr[0].f | TlsSocketProvider.READ_BUFFER_SIZE;
        for (int i2 = 1; i2 < ie30VarArr.length; i2++) {
            String str4 = ie30VarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                c("languages", ie30VarArr[0].d, i2, ie30VarArr[i2].d);
                return;
            } else {
                if (i != (ie30VarArr[i2].f | TlsSocketProvider.READ_BUFFER_SIZE)) {
                    c("role flags", Integer.toBinaryString(ie30VarArr[0].f), i2, Integer.toBinaryString(ie30VarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static pnf1 a(Bundle bundle) {
        bg11 bg11VarC;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        if (parcelableArrayList == null) {
            w280 w280Var = b380.b;
            bg11VarC = bg11.e;
        } else {
            bg11VarC = lcc.C(parcelableArrayList, new cwa((byte) 23));
        }
        return new pnf1(bundle.getString(g, ""), (ie30[]) bg11VarC.toArray(new ie30[0]));
    }

    public static void c(String str, String str2, int i, String str3) {
        StringBuilder sbN = gvg.n("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbN.append(str3);
        sbN.append("' (track ");
        sbN.append(i);
        sbN.append(")");
        oon1.w("", new IllegalStateException(sbN.toString()));
    }

    public final int b(ie30 ie30Var) {
        int i = 0;
        while (true) {
            ie30[] ie30VarArr = this.d;
            if (i >= ie30VarArr.length) {
                return -1;
            }
            if (ie30Var == ie30VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        ie30[] ie30VarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(ie30VarArr.length);
        for (ie30 ie30Var : ie30VarArr) {
            List list = ie30Var.s;
            Bundle bundle2 = new Bundle();
            bundle2.putString(ie30.W, ie30Var.a);
            bundle2.putString(ie30.X, ie30Var.b);
            String str = ie30.B0;
            b380<u9b0> b380Var = ie30Var.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(b380Var.size());
            for (u9b0 u9b0Var : b380Var) {
                u9b0Var.getClass();
                Bundle bundle3 = new Bundle();
                String str2 = u9b0Var.a;
                if (str2 != null) {
                    bundle3.putString(u9b0.c, str2);
                }
                bundle3.putString(u9b0.d, u9b0Var.b);
                arrayList2.add(bundle3);
            }
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(ie30.Y, ie30Var.d);
            bundle2.putInt(ie30.Z, ie30Var.e);
            bundle2.putInt(ie30.a0, ie30Var.f);
            bundle2.putFloat(ie30.K0, ie30Var.g);
            int i = ie30Var.h;
            if (i != ie30.V.h) {
                bundle2.putInt(ie30.C0, i);
            }
            bundle2.putInt(ie30.b0, ie30Var.i);
            bundle2.putInt(ie30.c0, ie30Var.j);
            bundle2.putString(ie30.d0, ie30Var.l);
            String str3 = ie30Var.n;
            if (str3 != null) {
                bundle2.putString(ie30.G0, str3);
            }
            bundle2.putString(ie30.e0, ie30Var.o);
            bundle2.putString(ie30.f0, ie30Var.f66p);
            bundle2.putInt(ie30.g0, ie30Var.q);
            for (int i2 = 0; i2 < list.size(); i2++) {
                bundle2.putByteArray(ie30.h0 + "_" + Integer.toString(i2, 36), (byte[]) list.get(i2));
            }
            bundle2.putParcelable(ie30.i0, ie30Var.t);
            bundle2.putLong(ie30.j0, ie30Var.u);
            bundle2.putInt(ie30.k0, ie30Var.w);
            bundle2.putInt(ie30.l0, ie30Var.x);
            bundle2.putInt(ie30.J0, ie30Var.y);
            bundle2.putInt(ie30.E0, ie30Var.z);
            bundle2.putInt(ie30.F0, ie30Var.A);
            bundle2.putFloat(ie30.m0, ie30Var.B);
            bundle2.putInt(ie30.n0, ie30Var.C);
            bundle2.putBoolean(ie30.I0, ie30Var.D);
            bundle2.putFloat(ie30.o0, ie30Var.E);
            bundle2.putByteArray(ie30.p0, ie30Var.F);
            bundle2.putInt(ie30.q0, ie30Var.G);
            x8h x8hVar = ie30Var.H;
            if (x8hVar != null) {
                String str4 = ie30.r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(x8h.j, x8hVar.a);
                bundle4.putInt(x8h.k, x8hVar.b);
                bundle4.putInt(x8h.l, x8hVar.c);
                bundle4.putByteArray(x8h.m, x8hVar.d);
                bundle4.putInt(x8h.n, x8hVar.e);
                bundle4.putInt(x8h.o, x8hVar.f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(ie30.D0, ie30Var.I);
            bundle2.putInt(ie30.s0, ie30Var.J);
            bundle2.putInt(ie30.H0, ie30Var.K);
            bundle2.putInt(ie30.t0, ie30Var.L);
            bundle2.putInt(ie30.u0, ie30Var.M);
            bundle2.putInt(ie30.v0, ie30Var.N);
            bundle2.putInt(ie30.w0, ie30Var.O);
            bundle2.putInt(ie30.x0, ie30Var.P);
            bundle2.putInt(ie30.z0, ie30Var.R);
            bundle2.putInt(ie30.A0, ie30Var.S);
            bundle2.putInt(ie30.y0, ie30Var.T);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pnf1.class == obj.getClass()) {
            pnf1 pnf1Var = (pnf1) obj;
            if (this.b.equals(pnf1Var.b) && Arrays.equals(this.d, pnf1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.d) + cy30.d(527, 31, this.b);
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
