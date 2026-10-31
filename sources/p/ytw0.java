package p;

import android.app.Application;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.PinResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ytw0 implements Function, t2n, Predicate, ehc, cee, c290, ah70 {
    public final /* synthetic */ byte a;
    public static final ytw0 b = new ytw0((byte) 0);
    public static final ytw0 c = new ytw0((byte) 1);
    public static final ytw0 d = new ytw0((byte) 2);
    public static final ytw0 e = new ytw0((byte) 3);
    public static final ytw0 f = new ytw0((byte) 4);
    public static final ytw0 g = new ytw0((byte) 5);
    public static final ytw0 h = new ytw0((byte) 6);
    public static final ytw0 i = new ytw0((byte) 7);
    public static final ytw0 t = new ytw0((byte) 8);
    public static final ytw0 X = new ytw0((byte) 9);

    public ytw0(oe4 oe4Var, kn91 kn91Var) {
        this.a = (byte) 19;
        if (oe4Var.b()) {
            kn91Var.a.h(kn91.b, false);
        }
        l0o1.m(oe4Var.a());
    }

    public static void c(Application application) {
        File file = new File(f4i1.e(application.getFilesDir().getParent(), "/shared_prefs/"));
        application.getSharedPreferences("my_secret_shared_pref_data", 0).edit().clear().apply();
        new File(file, "my_secret_shared_pref_data.xml").delete();
    }

    public static ryl1 e(Map map) {
        int iH;
        String str = (String) map.get("workout.type");
        if (str == null || (iH = fdg1.H(str)) == 0) {
            return null;
        }
        String str2 = (String) map.get("workout.cue.voice");
        if (str2 == null) {
            str2 = "voice2";
        }
        String str3 = (String) map.get("workout.cue.provider");
        if (str3 == null) {
            str3 = "sonantic_large";
        }
        return new ryl1(iH, str2, str3);
    }

    public static y5m1 f(Map map) {
        String str;
        String str2 = (String) map.get("workout.segment.id");
        hzl1 hzl1Var = (str2 == null || (str = (String) map.get("workout.segment.name")) == null) ? null : new hzl1(str2, str, (String) map.get("workout.segment.subtitle"));
        smc0 smc0VarN = k4p1.n();
        for (int i2 = 0; i2 < 101; i2++) {
            String str3 = (String) map.get("workout.cue." + i2 + ".ssml");
            if (str3 == null) {
                break;
            }
            String str4 = (String) map.get("workout.cue." + i2 + ".offset_ms");
            Integer numC0 = str4 != null ? nhc1.c0(str4) : null;
            String str5 = (String) map.get("workout.cue." + i2 + ".type");
            smc0VarN.add(new iyl1(str3, numC0, str5 != null ? pwo1.l(str5) : weo.a));
        }
        return new y5m1(hzl1Var, k4p1.k(smc0VarN), (String) map.get("workout.finish_label"));
    }

    public byte[] a(int i2, byte[] bArr, int i3) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                return new xtw0(y7y0.G(map), y7y0.L(map), d9y0.t(map));
            case 1:
                List list = (List) obj;
                list.getClass();
                List<mrz0> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (mrz0 mrz0Var : list2) {
                    arrayList.add(oqn1.n(mrz0Var.a, Integer.valueOf(mrz0Var.b)));
                }
                return sqg0.T(arrayList);
            case 2:
                return new hxg0((Throwable) obj);
            case 3:
            case 4:
            case 5:
            case 7:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return PinResponse.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.PinResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 6:
                return ((re9) obj).a();
            case 8:
                return esk1.a;
        }
    }

    @Override // p.ah70
    public rue0 b(String str) {
        return kin0.b;
    }

    public Object convert(int i2) {
        switch (this.a) {
            case 14:
                moz mozVarA = moz.a(i2);
                return mozVarA == null ? moz.f : mozVarA;
            default:
                hz00 hz00VarB = hz00.b(i2);
                return hz00VarB == null ? hz00.UNRECOGNIZED : hz00VarB;
        }
    }

    public Next d(l790 l790Var, m790 m790Var, h790 h790Var) {
        long j;
        m790 m790Var2 = l790Var.a;
        Set set = l790Var.b;
        xj61 xj61Var = new xj61();
        boolean z = m790Var.c;
        boolean z2 = m790Var.k;
        int i2 = m790Var.d;
        boolean z3 = m790Var.n;
        boolean z4 = m790Var.a;
        long j2 = m790Var.m;
        boolean z5 = m790Var.j;
        if (z && z4) {
            fq7.y(xj61Var, k980.i, set, z5);
        }
        if (m790Var.h && z && !z3) {
            fq7.y(xj61Var, k980.l, set, z5);
        }
        boolean z6 = m790Var2.n;
        boolean z7 = m790Var2.c;
        boolean z8 = m790Var2.k;
        long j3 = m790Var2.m;
        boolean z9 = m790Var2.j;
        if (!z6 || z3) {
            j = j3;
        } else {
            j = j3;
            if (m790Var.o - m790Var2.o < 1000) {
                xj61Var.add(k980.d);
            }
        }
        if (!z5 && z9 && j2 - j < 1000 && (u7n0.x(m790Var) || z4)) {
            xj61Var.add(k980.k);
        }
        if (i2 > 1 && z && u7n0.x(m790Var) && !m790Var.f) {
            fq7.y(xj61Var, k980.e, set, z5);
        }
        if (z2 && u7n0.x(m790Var) && !z && j2 - m790Var.l < 30000) {
            fq7.y(xj61Var, k980.h, set, z5);
        } else if (u7n0.x(m790Var) && !z && !m790Var.b) {
            fq7.y(xj61Var, k980.f, set, z5);
        }
        if (((z2 && !z8) || (!z2 && z8)) && z5 && z9 && z && z7 && j2 - j < 1000) {
            xj61Var.add(k980.g);
        }
        if (z8 && z9 && z5 && m790Var.g - j < 1000 && m790Var2.d < i2) {
            xj61Var.add(k980.j);
        }
        if (z != z7 && (u7n0.x(m790Var2) || u7n0.x(m790Var))) {
            long j4 = m790Var2.p;
            if (j4 != 0 && m790Var.p - j4 < 1000) {
                xj61Var.add(k980.c);
            }
        }
        xj61 xj61VarJ = cwl1.j(xj61Var);
        ArrayList arrayList = new ArrayList();
        g0y it = xj61VarJ.iterator();
        while (it.hasNext()) {
            Object next = ((wkg0) it).next();
            if (!set.contains((k980) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        g0y it2 = xj61VarJ.iterator();
        while (it2.hasNext()) {
            Object next2 = ((wkg0) it2).next();
            if (!((k980) next2).a()) {
                arrayList2.add(next2);
            }
        }
        Set setP1 = o7h.p1(arrayList2);
        l790 l790Var2 = new l790(m790Var, setP1);
        LinkedHashSet linkedHashSetB1 = o7h.b1(set, setP1);
        xj61 xj61Var2 = new xj61();
        ArrayList arrayList3 = new ArrayList(q7h.U(linkedHashSetB1, 10));
        Iterator it3 = linkedHashSetB1.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new b790((k980) it3.next(), h790Var.getName()));
        }
        xj61Var2.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new a790((k980) it4.next(), h790Var.getName()));
        }
        xj61Var2.addAll(arrayList4);
        return Next.i(l790Var2, cwl1.j(xj61Var2));
    }

    @Override // p.t2n
    public Object g(Object obj) {
        return Byte.valueOf(((uz21) obj).f());
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                return ((cma1) obj).b == 1;
            default:
                return ((jdu0) obj).j;
        }
    }

    public ytw0(l7c l7cVar) {
        this.a = (byte) 15;
    }

    public /* synthetic */ ytw0(byte b2) {
        this.a = b2;
    }
}
