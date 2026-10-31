package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yoh0 {
    public static final yoh0 g = new koh0().a();
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public static final String m = Integer.toString(5, 36);
    public final String a;
    public final soh0 b;
    public final roh0 c;
    public final tqh0 d;
    public final noh0 e;
    public final toh0 f;

    public yoh0(String str, noh0 noh0Var, soh0 soh0Var, roh0 roh0Var, tqh0 tqh0Var, toh0 toh0Var) {
        this.a = str;
        this.b = soh0Var;
        this.c = roh0Var;
        this.d = tqh0Var;
        this.e = noh0Var;
        this.f = toh0Var;
    }

    public static yoh0 b(int i2, Bundle bundle) {
        noh0 noh0Var;
        toh0 toh0Var;
        gg11 gg11VarC;
        poh0 poh0Var;
        joh0 joh0Var;
        bg11 bg11VarG;
        bg11 bg11VarC;
        soh0 soh0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        roh0 roh0VarB = bundle2 == null ? roh0.f : roh0.b(bundle2);
        Bundle bundle3 = bundle.getBundle(j);
        tqh0 tqh0VarB = bundle3 == null ? tqh0.M : tqh0.b(i2, bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            noh0Var = noh0.r;
        } else {
            loh0 loh0Var = new loh0();
            String str = moh0.j;
            moh0 moh0Var = moh0.i;
            long j2 = moh0Var.a;
            long j3 = moh0Var.d;
            long j4 = moh0Var.b;
            loh0Var.b(zoi1.W(bundle4.getLong(str, j2)));
            loh0Var.a(zoi1.W(bundle4.getLong(moh0.k, moh0Var.c)));
            loh0Var.c = bundle4.getBoolean(moh0.l, moh0Var.e);
            loh0Var.d = bundle4.getBoolean(moh0.m, moh0Var.f);
            loh0Var.e = bundle4.getBoolean(moh0.n, moh0Var.g);
            loh0Var.f = bundle4.getBoolean(moh0.q, moh0Var.h);
            long j5 = bundle4.getLong(moh0.o, j4);
            if (j5 != j4) {
                loh0Var.b(j5);
            }
            long j6 = bundle4.getLong(moh0.f91p, j3);
            if (j6 != j3) {
                loh0Var.a(j6);
            }
            noh0Var = new noh0(loh0Var);
        }
        noh0 noh0Var2 = noh0Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            toh0Var = toh0.d;
        } else {
            o3e0 o3e0Var = new o3e0();
            o3e0Var.b = (Uri) bundle5.getParcelable(toh0.e);
            o3e0Var.c = bundle5.getString(toh0.f);
            o3e0Var.d = zoi1.p(bundle5.getBundle(toh0.g));
            toh0Var = new toh0(o3e0Var);
        }
        toh0 toh0Var2 = toh0Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            soh0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(soh0.k);
            if (bundle7 == null) {
                poh0Var = null;
            } else {
                String string2 = bundle7.getString(poh0.i);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(poh0.j);
                String str2 = poh0.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    gg11VarC = gg11.g;
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    gg11VarC = j380.c(map);
                }
                boolean z = bundle7.getBoolean(poh0.l, false);
                boolean z2 = bundle7.getBoolean(poh0.m, false);
                boolean z3 = bundle7.getBoolean(poh0.n, false);
                String str4 = poh0.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                b380 b380VarP = b380.p(arrayList);
                byte[] byteArray = bundle7.getByteArray(poh0.f114p);
                ooh0 ooh0Var = new ooh0();
                ooh0Var.d = uuidFromString;
                ooh0Var.e = uri;
                ooh0Var.f = j380.c(gg11VarC);
                ooh0Var.a = z;
                ooh0Var.c = z3;
                ooh0Var.b = z2;
                ooh0Var.g = b380.p(b380VarP);
                ooh0Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                poh0Var = new poh0(ooh0Var);
            }
            Bundle bundle10 = bundle6.getBundle(soh0.l);
            if (bundle10 == null) {
                joh0Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(joh0.b);
                uri2.getClass();
                eea0 eea0Var = new eea0();
                eea0Var.b = uri2;
                joh0Var = new joh0(eea0Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(soh0.m);
            if (parcelableArrayList == null) {
                w280 w280Var = b380.b;
                bg11VarG = bg11.e;
            } else {
                v280 v280VarM = b380.m();
                int i3 = 0;
                while (i3 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i3);
                    bundle11.getClass();
                    v280VarM.c(new vdc1(bundle11.getInt(vdc1.d, 0), bundle11.getInt(vdc1.e, 0), bundle11.getInt(vdc1.f, 0)));
                    i3++;
                    parcelableArrayList = parcelableArrayList;
                }
                bg11VarG = v280VarM.g();
            }
            bg11 bg11Var = bg11VarG;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(soh0.o);
            if (parcelableArrayList2 == null) {
                w280 w280Var2 = b380.b;
                bg11VarC = bg11.e;
            } else {
                bg11VarC = lcc.C(parcelableArrayList2, new cwa((byte) 14));
            }
            bg11 bg11Var2 = bg11VarC;
            long j7 = bundle6.getLong(soh0.f136p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(soh0.i);
            uri3.getClass();
            soh0Var = new soh0(uri3, bundle6.getString(soh0.j), poh0Var, joh0Var, bg11Var, bundle6.getString(soh0.n), bg11Var2, j7);
        }
        return new yoh0(string, noh0Var2, soh0Var, roh0VarB, tqh0VarB, toh0Var2);
    }

    public static yoh0 c(Uri uri) {
        koh0 koh0Var = new koh0();
        koh0Var.e = uri;
        return koh0Var.a();
    }

    public static yoh0 d(String str) {
        koh0 koh0Var = new koh0();
        koh0Var.c(str);
        return koh0Var.a();
    }

    public final koh0 a() {
        ooh0 ooh0Var;
        koh0 koh0Var = new koh0();
        koh0Var.f = this.e.a();
        koh0Var.b = this.a;
        koh0Var.k = this.d;
        koh0Var.l = this.c.a();
        koh0Var.m = this.f;
        soh0 soh0Var = this.b;
        if (soh0Var != null) {
            koh0Var.d = soh0Var.f;
            koh0Var.c = soh0Var.b;
            koh0Var.e = soh0Var.a;
            koh0Var.h = soh0Var.e;
            koh0Var.i = soh0Var.g;
            poh0 poh0Var = soh0Var.c;
            if (poh0Var != null) {
                ooh0Var = new ooh0();
                ooh0Var.d = poh0Var.a;
                ooh0Var.e = poh0Var.b;
                ooh0Var.f = poh0Var.c;
                ooh0Var.a = poh0Var.d;
                ooh0Var.b = poh0Var.e;
                ooh0Var.c = poh0Var.f;
                ooh0Var.g = poh0Var.g;
                ooh0Var.h = poh0Var.h;
            } else {
                ooh0Var = new ooh0();
            }
            koh0Var.g = ooh0Var;
            koh0Var.j = soh0Var.d;
            koh0Var.a = soh0Var.h;
        }
        return koh0Var;
    }

    public final Bundle e(int i2, boolean z) {
        soh0 soh0Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        roh0 roh0Var = roh0.f;
        roh0 roh0Var2 = this.c;
        if (!roh0Var2.equals(roh0Var)) {
            bundle.putBundle(i, roh0Var2.c());
        }
        tqh0 tqh0Var = tqh0.M;
        tqh0 tqh0Var2 = this.d;
        if (!tqh0Var2.equals(tqh0Var)) {
            bundle.putBundle(j, tqh0Var2.c(i2));
        }
        moh0 moh0Var = moh0.i;
        noh0 noh0Var = this.e;
        if (!noh0Var.equals(moh0Var)) {
            Bundle bundle2 = new Bundle();
            long j2 = noh0Var.a;
            if (j2 != moh0Var.a) {
                bundle2.putLong(moh0.j, j2);
            }
            long j3 = noh0Var.c;
            if (j3 != moh0Var.c) {
                bundle2.putLong(moh0.k, j3);
            }
            long j4 = noh0Var.b;
            if (j4 != moh0Var.b) {
                bundle2.putLong(moh0.o, j4);
            }
            long j5 = noh0Var.d;
            if (j5 != moh0Var.d) {
                bundle2.putLong(moh0.f91p, j5);
            }
            boolean z2 = noh0Var.e;
            if (z2 != moh0Var.e) {
                bundle2.putBoolean(moh0.l, z2);
            }
            boolean z3 = noh0Var.f;
            if (z3 != moh0Var.f) {
                bundle2.putBoolean(moh0.m, z3);
            }
            boolean z4 = noh0Var.g;
            if (z4 != moh0Var.g) {
                bundle2.putBoolean(moh0.n, z4);
            }
            boolean z5 = noh0Var.h;
            if (z5 != moh0Var.h) {
                bundle2.putBoolean(moh0.q, z5);
            }
            bundle.putBundle(k, bundle2);
        }
        toh0 toh0Var = toh0.d;
        toh0 toh0Var2 = this.f;
        if (!toh0Var2.equals(toh0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = toh0Var2.a;
            if (uri != null) {
                bundle3.putParcelable(toh0.e, uri);
            }
            String str2 = toh0Var2.b;
            if (str2 != null) {
                bundle3.putString(toh0.f, str2);
            }
            Bundle bundle4 = toh0Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(toh0.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (soh0Var = this.b) != null) {
            b380 b380Var = soh0Var.g;
            List list = soh0Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(soh0.i, soh0Var.a);
            String str3 = soh0Var.b;
            if (str3 != null) {
                bundle5.putString(soh0.j, str3);
            }
            poh0 poh0Var = soh0Var.c;
            if (poh0Var != null) {
                String str4 = soh0.k;
                b380 b380Var2 = poh0Var.g;
                j380 j380Var = poh0Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(poh0.i, poh0Var.a.toString());
                Uri uri2 = poh0Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(poh0.j, uri2);
                }
                if (!j380Var.isEmpty()) {
                    String str5 = poh0.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : j380Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = poh0Var.d;
                if (z6) {
                    bundle6.putBoolean(poh0.l, z6);
                }
                boolean z7 = poh0Var.e;
                if (z7) {
                    bundle6.putBoolean(poh0.m, z7);
                }
                boolean z8 = poh0Var.f;
                if (z8) {
                    bundle6.putBoolean(poh0.n, z8);
                }
                if (!b380Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(poh0.o, new ArrayList<>((Collection) b380Var2));
                }
                byte[] bArr = poh0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(poh0.f114p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            joh0 joh0Var = soh0Var.d;
            if (joh0Var != null) {
                String str6 = soh0.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(joh0.b, joh0Var.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(soh0.m, lcc.E(list, new cwa((byte) 12)));
            }
            String str7 = soh0Var.f;
            if (str7 != null) {
                bundle5.putString(soh0.n, str7);
            }
            if (!b380Var.isEmpty()) {
                bundle5.putParcelableArrayList(soh0.o, lcc.E(b380Var, new cwa((byte) 13)));
            }
            long j6 = soh0Var.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(soh0.f136p, j6);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoh0)) {
            return false;
        }
        yoh0 yoh0Var = (yoh0) obj;
        return Objects.equals(this.a, yoh0Var.a) && this.e.equals(yoh0Var.e) && Objects.equals(this.b, yoh0Var.b) && this.c.equals(yoh0Var.c) && Objects.equals(this.d, yoh0Var.d) && Objects.equals(this.f, yoh0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        soh0 soh0Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (soh0Var != null ? soh0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
