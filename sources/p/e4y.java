package p;

import android.graphics.Color;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e4y implements Predicate, Function, s2i1, BiFunction, usi1, Init, av30, sh {
    public final /* synthetic */ byte a;
    public static final e4y b = new e4y(0);
    public static final e4y c = new e4y(1);
    public static final e4y d = new e4y(2);
    public static final e4y e = new e4y(3);
    public static final e4y f = new e4y(4);
    public static final e4y g = new e4y(5);
    public static final e4y h = new e4y(6);
    public static final e4y i = new e4y(7);
    public static final e4y t = new e4y(8);
    public static final e4y X = new e4y(9);
    public static final e4y Y = new e4y(10);
    public static final e4y Z = new e4y(11);
    public static final e4y N0 = new e4y(12);
    public static final e4y O0 = new e4y(13);
    public static final e4y P0 = new e4y(14);
    public static final e4y Q0 = new e4y(15);
    public static final e4y R0 = new e4y(16);
    public static final e4y S0 = new e4y(17);
    public static final e4y T0 = new e4y(18);
    public static final e4y U0 = new e4y(19);
    public static final e4y V0 = new e4y(20);
    public static final e4y W0 = new e4y(21);
    public static final e4y X0 = new e4y(22);
    public static final e4y Y0 = new e4y(23);
    public static final e4y Z0 = new e4y(24);
    public static final e4y a1 = new e4y(25);
    public static final e4y b1 = new e4y(26);
    public static final e4y c1 = new e4y(27);
    public static final e4y d1 = new e4y(29);

    public /* synthetic */ e4y(byte b2) {
        this.a = b2;
    }

    public static jqk0 a(int i2, String str, r6h1 r6h1Var) {
        return new jqk0(Integer.valueOf(i2), str, r6h1Var);
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((i1z) obj).b;
            if (str == null || str.length() == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList d(lik1 lik1Var, i1z[] i1zVarArr) {
        String str;
        String str2;
        if (nik1.X.a(lik1Var.a)) {
            List<i1z> listA1 = o7h.a1(c(f46.Q0(i1zVarArr)), new cvt((byte) 5));
            ArrayList arrayList = new ArrayList(q7h.U(listA1, 10));
            for (i1z i1zVar : listA1) {
                String str3 = i1zVar.a;
                g281 g281Var = i1zVar.z;
                if (g281Var == null || (str2 = g281Var.d) == null) {
                    str2 = "";
                }
                arrayList.add(new n7z(str3, str2));
            }
            return arrayList;
        }
        ArrayList<i1z> arrayListC = c(f46.Q0(i1zVarArr));
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayListC, 10));
        for (i1z i1zVar2 : arrayListC) {
            String str4 = i1zVar2.a;
            g281 g281Var2 = i1zVar2.z;
            if (g281Var2 == null || (str = g281Var2.d) == null) {
                str = "";
            }
            arrayList2.add(new n7z(str4, str));
        }
        return arrayList2;
    }

    public static lys e(String str, String str2, String str3, int i2, r6h1 r6h1Var) {
        return new lys(new n3m0(str, Integer.valueOf(i2), str2, str3, r6h1Var));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    public Object apply(Object obj) {
        boolean z;
        switch (this.a) {
            case 2:
                nwq0 nwq0Var = (nwq0) obj;
                int i2 = nwq0Var == null ? -1 : lq0.a[nwq0Var.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return i280.a;
                }
                if (i2 == 3) {
                    return i280.b;
                }
                eg.o();
                return null;
            case 3:
                return (List) ((mmr0) obj).b;
            case 4:
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                return rih1.a;
            case 5:
                return Boolean.valueOf(((b44) obj).a);
            case 6:
                return Boolean.valueOf(((yw4) obj).b);
            case 7:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof yh90) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return AudioSinkChainWrapperEsperanto.EofResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto.EofResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 10:
                return new q49(((Boolean) obj).booleanValue());
            case 12:
                return new hfn(((Boolean) obj).booleanValue());
            case 14:
                return new g5e();
            case 19:
                return ((eww0) obj).b;
            case 20:
                return b7x.a;
            case 21:
                xik xikVar = (xik) obj;
                wik wikVar = xikVar.t;
                String str = xikVar.b;
                String str2 = xikVar.l;
                String str3 = xikVar.m;
                if (xikVar.f171p.isEmpty()) {
                    z = false;
                } else {
                    wik wikVar2 = xikVar.t;
                    if ((wikVar2 != null ? wikVar2.e : 0) != 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                boolean z2 = xikVar.o;
                String str4 = xikVar.g;
                return new k160(wikVar, str, str2, str3, z, z2, !(str4 == null || str4.length() == 0), xikVar.u, xikVar.v);
            case 22:
                return CompletableEmpty.a;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((GetEntityResponse) obj).n().o().getName();
        }
    }

    public void b(wax waxVar) {
        qr8 qr8Var = qr8.a;
        aga0 aga0Var = (aga0) waxVar;
        aga0Var.c(pha.class, qr8Var);
        aga0Var.c(hy8.class, qr8Var);
        xr8 xr8Var = xr8.a;
        aga0Var.c(use0.class, xr8Var);
        aga0Var.c(k19.class, xr8Var);
        rr8 rr8Var = rr8.a;
        aga0Var.c(bjg.class, rr8Var);
        aga0Var.c(oy8.class, rr8Var);
        pr8 pr8Var = pr8.a;
        aga0Var.c(c94.class, pr8Var);
        aga0Var.c(dy8.class, pr8Var);
        wr8 wr8Var = wr8.a;
        aga0Var.c(bse0.class, wr8Var);
        aga0Var.c(j19.class, wr8Var);
        sr8 sr8Var = sr8.a;
        aga0Var.c(vyh.class, sr8Var);
        aga0Var.c(ry8.class, sr8Var);
        vr8 vr8Var = vr8.a;
        aga0Var.c(d810.class, vr8Var);
        aga0Var.c(w09.class, vr8Var);
        ur8 ur8Var = ur8.a;
        aga0Var.c(c810.class, ur8Var);
        aga0Var.c(v09.class, ur8Var);
        yr8 yr8Var = yr8.a;
        aga0Var.c(d7o0.class, yr8Var);
        aga0Var.c(n19.class, yr8Var);
        tr8 tr8Var = tr8.a;
        aga0Var.c(fr00.class, tr8Var);
        aga0Var.c(u09.class, tr8Var);
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 17:
                return First.b((oxk) obj);
            default:
                ro41 ro41Var = (ro41) obj;
                ro41Var.getClass();
                return First.b(ro41Var);
        }
    }

    public Object h(eha0 eha0Var, float f2) {
        boolean z = eha0Var.o() == 1;
        if (z) {
            eha0Var.a();
        }
        double dI = eha0Var.i();
        double dI2 = eha0Var.i();
        double dI3 = eha0Var.i();
        double dI4 = eha0Var.o() == 7 ? eha0Var.i() : 1.0d;
        if (z) {
            eha0Var.d();
        }
        if (dI <= 1.0d && dI2 <= 1.0d && dI3 <= 1.0d) {
            dI *= 255.0d;
            dI2 *= 255.0d;
            dI3 *= 255.0d;
            if (dI4 <= 1.0d) {
                dI4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dI4, (int) dI, (int) dI2, (int) dI3));
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new i03(xkg0Var, str2, str);
    }

    public boolean r(View view) {
        return view.callOnClick();
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((hi) obj).a() != null;
            case 11:
                return !((Boolean) obj).booleanValue();
            case 15:
                return !((uv00) obj).f;
            case 25:
                return ((vpu) obj) != vpu.a;
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    public Object apply(Object obj, Object obj2) {
        return (String) obj2;
    }
}
