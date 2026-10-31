package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.metadata.proto.Metadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class cwa implements su30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:119:0x0425  */
    /* JADX WARN: Code duplicated, block: B:123:0x0433  */
    public final Object apply(Object obj) {
        StringBuilder sb;
        char cCharAt;
        bg11 bg11VarG;
        byte b = 24;
        boolean z = true;
        int i = 0;
        switch (this.a) {
            case 0:
                zw70 zw70Var = (zw70) obj;
                return new hq70(zw70Var.a, zw70Var.b, zw70Var.c);
            case 1:
                ec10 ec10Var = (ec10) obj;
                ec10Var.getClass();
                return ec10Var.getClass().getSimpleName();
            case 2:
                return Integer.valueOf(((feo) obj).r);
            case 3:
                long j = ((bfo) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 4:
                qnf1 qnf1Var = (qnf1) obj;
                qnf1Var.getClass();
                Bundle bundle = new Bundle();
                String str = qnf1.e;
                bg11 bg11Var = qnf1Var.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(bg11Var.d);
                w280 w280VarR = bg11Var.r(0);
                while (w280VarR.hasNext()) {
                    arrayList.add(((pnf1) w280VarR.next()).d());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
            case 5:
                return new pfr((rdd1) obj);
            case 6:
                u9b0 u9b0Var = (u9b0) obj;
                return u9b0Var.a + ": " + u9b0Var.b;
            case 7:
                return (ljf1) obj;
            case 8:
                rl60 rl60Var = (rl60) obj;
                rl60Var.z();
                return b380.p(z1p1.D(rl60Var.i1.b, new cwa(b)));
            case 9:
                return (Integer) z470.d().apply((Enum) obj);
            case 10:
                Metadata.Artist artist = (Metadata.Artist) obj;
                if (artist != null) {
                    return artist.getName();
                }
                return null;
            case 11:
                return ((v740) obj).a;
            case 12:
                vdc1 vdc1Var = (vdc1) obj;
                vdc1Var.getClass();
                Bundle bundle2 = new Bundle();
                int i2 = vdc1Var.a;
                if (i2 != 0) {
                    bundle2.putInt(vdc1.d, i2);
                }
                int i3 = vdc1Var.b;
                if (i3 != 0) {
                    bundle2.putInt(vdc1.e, i3);
                }
                int i4 = vdc1Var.c;
                if (i4 != 0) {
                    bundle2.putInt(vdc1.f, i4);
                }
                return bundle2;
            case 13:
                voh0 voh0Var = (voh0) obj;
                voh0Var.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable(voh0.h, voh0Var.a);
                String str2 = voh0Var.b;
                if (str2 != null) {
                    bundle3.putString(voh0.i, str2);
                }
                String str3 = voh0Var.c;
                if (str3 != null) {
                    bundle3.putString(voh0.j, str3);
                }
                int i5 = voh0Var.d;
                if (i5 != 0) {
                    bundle3.putInt(voh0.k, i5);
                }
                int i6 = voh0Var.e;
                if (i6 != 0) {
                    bundle3.putInt(voh0.l, i6);
                }
                String str4 = voh0Var.f;
                if (str4 != null) {
                    bundle3.putString(voh0.m, str4);
                }
                String str5 = voh0Var.g;
                if (str5 != null) {
                    bundle3.putString(voh0.n, str5);
                }
                return bundle3;
            case 14:
                Bundle bundle4 = (Bundle) obj;
                Uri uri = (Uri) bundle4.getParcelable(voh0.h);
                uri.getClass();
                String string = bundle4.getString(voh0.i);
                String string2 = bundle4.getString(voh0.j);
                int i7 = bundle4.getInt(voh0.k, 0);
                int i8 = bundle4.getInt(voh0.l, 0);
                String string3 = bundle4.getString(voh0.m);
                String string4 = bundle4.getString(voh0.n);
                av7 av7Var = new av7();
                av7Var.c = uri;
                av7Var.d = asj0.p(string);
                av7Var.e = string2;
                av7Var.a = i7;
                av7Var.b = i8;
                av7Var.f = string3;
                av7Var.g = string4;
                return new voh0(av7Var);
            case 15:
                int i9 = d1i0.i;
                return Boolean.TRUE;
            case 16:
                String str6 = (String) obj;
                nme nmeVar = n8i0.g;
                nmeVar.getClass();
                for (int length = str6.length() - 1; length >= 0; length--) {
                    if (!nmeVar.d(str6.charAt(length))) {
                        z = false;
                        if (!z && !str6.isEmpty()) {
                            return str6;
                        }
                        sb = new StringBuilder(str6.length() + 16);
                        sb.append('\"');
                        while (i < str6.length()) {
                            cCharAt = str6.charAt(i);
                            if (cCharAt != '\r' || cCharAt == '\\' || cCharAt == '\"') {
                                sb.append('\\');
                            }
                            sb.append(cCharAt);
                            i++;
                        }
                        sb.append('\"');
                        return sb.toString();
                    }
                }
                if (!z) {
                }
                sb = new StringBuilder(str6.length() + 16);
                sb.append('\"');
                while (i < str6.length()) {
                    cCharAt = str6.charAt(i);
                    if (cCharAt != '\r') {
                        sb.append('\\');
                    } else {
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                    i++;
                }
                sb.append('\"');
                return sb.toString();
            case 17:
                q380 q380Var = (Collection) obj;
                int i10 = q380.d;
                if (q380Var instanceof q380) {
                    return q380Var;
                }
                boolean z2 = q380Var instanceof q380;
                int size = z2 ? ((jg11) q380Var).l().size() : 11;
                o380 o380Var = new o380();
                o380Var.b = false;
                gfp0 gfp0Var = new gfp0();
                gfp0Var.d(size);
                o380Var.a = gfp0Var;
                if (z2) {
                    q380 q380Var2 = q380Var;
                    gfp0 gfp0Var2 = q380Var2 instanceof jg11 ? ((jg11) q380Var2).e : null;
                    if (gfp0Var2 != null) {
                        gfp0Var.a(Math.max(gfp0Var.c, gfp0Var2.c));
                        i = gfp0Var2.c == 0 ? -1 : 0;
                        while (i >= 0) {
                            dm5.q(i, gfp0Var2.c);
                            Object obj2 = gfp0Var2.a[i];
                            dm5.q(i, gfp0Var2.c);
                            o380Var.c(gfp0Var2.b[i], obj2);
                            i++;
                            if (i >= gfp0Var2.c) {
                                i = -1;
                            }
                        }
                    } else {
                        t380 t380VarM = q380Var2.m();
                        gfp0 gfp0Var3 = o380Var.a;
                        gfp0Var3.a(Math.max(gfp0Var3.c, t380VarM.size()));
                        for (ffp0 ffp0Var : q380Var2.m()) {
                            o380Var.c(ffp0Var.a(), ffp0Var.a);
                        }
                    }
                } else {
                    Iterator it = q380Var.iterator();
                    while (it.hasNext()) {
                        o380Var.a(it.next());
                    }
                }
                if (o380Var.a.c == 0) {
                    int i11 = q380.d;
                    return jg11.h;
                }
                o380Var.b = true;
                return new jg11(o380Var.a);
            case 18:
                return Long.valueOf(((bfo) obj).b);
            case 19:
                return Long.valueOf(((bfo) obj).c);
            case 20:
                return b380.p(z1p1.D(((arh0) obj).u().b, new cwa(b)));
            case 21:
                return (ljf1) obj;
            case 22:
                String str7 = (String) obj;
                str7.getClass();
                return Uri.decode(str7);
            case 23:
                Bundle bundle5 = (Bundle) obj;
                ie30 ie30Var = ie30.V;
                ge30 ge30Var = new ge30();
                if (bundle5 != null) {
                    ClassLoader classLoader = lcc.class.getClassLoader();
                    String str8 = zoi1.a;
                    bundle5.setClassLoader(classLoader);
                }
                String string5 = bundle5.getString(ie30.W);
                String str9 = ie30Var.a;
                if (string5 == null) {
                    string5 = str9;
                }
                ge30Var.a = string5;
                String string6 = bundle5.getString(ie30.X);
                String str10 = ie30Var.b;
                if (string6 == null) {
                    string6 = str10;
                }
                ge30Var.b = string6;
                ArrayList parcelableArrayList = bundle5.getParcelableArrayList(ie30.B0);
                if (parcelableArrayList == null) {
                    w280 w280Var = b380.b;
                    bg11VarG = bg11.e;
                } else {
                    v280 v280VarM = b380.m();
                    for (int i12 = 0; i12 < parcelableArrayList.size(); i12++) {
                        Bundle bundle6 = (Bundle) parcelableArrayList.get(i12);
                        bundle6.getClass();
                        String string7 = bundle6.getString(u9b0.c);
                        String string8 = bundle6.getString(u9b0.d);
                        string8.getClass();
                        v280VarM.c(new u9b0(string7, string8));
                    }
                    bg11VarG = v280VarM.g();
                }
                ge30Var.c = b380.p(bg11VarG);
                String string9 = bundle5.getString(ie30.Y);
                String str11 = ie30Var.d;
                if (string9 == null) {
                    string9 = str11;
                }
                ge30Var.d = string9;
                ge30Var.e = bundle5.getInt(ie30.Z, ie30Var.e);
                ge30Var.f = bundle5.getInt(ie30.a0, ie30Var.f);
                ge30Var.g = bundle5.getFloat(ie30.K0, ie30Var.g);
                ge30Var.h = bundle5.getInt(ie30.C0, ie30Var.h);
                ge30Var.i = bundle5.getInt(ie30.b0, ie30Var.i);
                ge30Var.j = bundle5.getInt(ie30.c0, ie30Var.j);
                String string10 = bundle5.getString(ie30.d0);
                String str12 = ie30Var.l;
                if (string10 == null) {
                    string10 = str12;
                }
                ge30Var.k = string10;
                String string11 = bundle5.getString(ie30.G0);
                String str13 = ie30Var.n;
                if (string11 == null) {
                    string11 = str13;
                }
                ge30Var.m = string11;
                String string12 = bundle5.getString(ie30.e0);
                String str14 = ie30Var.o;
                if (string12 == null) {
                    string12 = str14;
                }
                ge30Var.n = asj0.p(string12);
                String string13 = bundle5.getString(ie30.f0);
                String str15 = ie30Var.f66p;
                if (string13 == null) {
                    string13 = str15;
                }
                ge30Var.o = asj0.p(string13);
                ge30Var.f52p = bundle5.getInt(ie30.g0, ie30Var.q);
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle5.getByteArray(ie30.h0 + "_" + Integer.toString(i, 36));
                    if (byteArray == null) {
                        float f = bundle5.getFloat(ie30.m0, ie30Var.B);
                        if (f <= 0.0f) {
                            f = -1.0f;
                        }
                        ge30Var.r = arrayList2;
                        ge30Var.s = (x8v) bundle5.getParcelable(ie30.i0);
                        ge30Var.t = bundle5.getLong(ie30.j0, ie30Var.u);
                        ge30Var.v = bundle5.getInt(ie30.k0, ie30Var.w);
                        ge30Var.w = bundle5.getInt(ie30.l0, ie30Var.x);
                        ge30Var.x = bundle5.getInt(ie30.J0, ie30Var.y);
                        ge30Var.y = bundle5.getInt(ie30.E0, ie30Var.z);
                        ge30Var.z = bundle5.getInt(ie30.F0, ie30Var.A);
                        ge30Var.c(f);
                        ge30Var.B = bundle5.getInt(ie30.n0, ie30Var.C);
                        ge30Var.C = bundle5.getBoolean(ie30.I0, ie30Var.D);
                        ge30Var.D = bundle5.getFloat(ie30.o0, ie30Var.E);
                        ge30Var.E = bundle5.getByteArray(ie30.p0);
                        ge30Var.F = bundle5.getInt(ie30.q0, ie30Var.G);
                        ge30Var.H = bundle5.getInt(ie30.D0, ie30Var.I);
                        Bundle bundle7 = bundle5.getBundle(ie30.r0);
                        if (bundle7 != null) {
                            ge30Var.G = new x8h(bundle7.getInt(x8h.j, -1), bundle7.getInt(x8h.k, -1), bundle7.getInt(x8h.l, -1), bundle7.getByteArray(x8h.m), bundle7.getInt(x8h.n, -1), bundle7.getInt(x8h.o, -1));
                        }
                        ge30Var.I = bundle5.getInt(ie30.s0, ie30Var.J);
                        ge30Var.J = bundle5.getInt(ie30.H0, ie30Var.K);
                        ge30Var.K = bundle5.getInt(ie30.t0, ie30Var.L);
                        ge30Var.L = bundle5.getInt(ie30.u0, ie30Var.M);
                        ge30Var.M = bundle5.getInt(ie30.v0, ie30Var.N);
                        ge30Var.N = bundle5.getInt(ie30.w0, ie30Var.O);
                        ge30Var.O = bundle5.getInt(ie30.x0, ie30Var.P);
                        ge30Var.Q = bundle5.getInt(ie30.z0, ie30Var.R);
                        ge30Var.R = bundle5.getInt(ie30.A0, ie30Var.S);
                        ge30Var.S = bundle5.getInt(ie30.y0, ie30Var.T);
                        return new ie30(ge30Var);
                    }
                    arrayList2.add(byteArray);
                    i++;
                }
                break;
            case 24:
                return Integer.valueOf(((pnf1) obj).c);
            case 25:
                n3g1 n3g1Var = (n3g1) obj;
                n3g1Var.getClass();
                Bundle bundle8 = new Bundle();
                bundle8.putBundle(n3g1.f, n3g1Var.b.d());
                bundle8.putIntArray(n3g1.g, n3g1Var.d);
                bundle8.putBooleanArray(n3g1.h, n3g1Var.e);
                bundle8.putBoolean(n3g1.i, n3g1Var.c);
                return bundle8;
            case 26:
                Bundle bundle9 = (Bundle) obj;
                Bundle bundle10 = bundle9.getBundle(n3g1.f);
                bundle10.getClass();
                pnf1 pnf1VarA = pnf1.a(bundle10);
                int[] intArray = bundle9.getIntArray(n3g1.g);
                int i13 = pnf1VarA.a;
                return new n3g1(pnf1VarA, bundle9.getBoolean(n3g1.i, false), (int[]) cwl1.y(intArray, new int[i13]), (boolean[]) cwl1.y(bundle9.getBooleanArray(n3g1.h), new boolean[i13]));
            default:
                return (String) ((Map.Entry) obj).getKey();
        }
    }

    public /* synthetic */ cwa(byte b) {
        this.a = b;
    }
}
