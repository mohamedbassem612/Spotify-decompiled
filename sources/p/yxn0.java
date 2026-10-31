package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.player.model.ContextTrack$Metadata;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yxn0 {
    public final dg30 a;
    public final th30 b;
    public String c = "";

    public yxn0(dg30 dg30Var) {
        this.a = dg30Var;
        this.b = dg30Var.e0();
    }

    public static xg30 a(Bundle bundle) {
        String string = bundle.getString(ContextTrack$Metadata.KEY_TITLE);
        String string2 = bundle.getString("spotify_uri_key");
        if (string2 != null) {
            return new xg30(string, string2, bundle.getString("tag"), bundle.getParcelable("presentation_mode"), (ee5) null);
        }
        hhg1.n("SpotifyUri can't be null!");
        return null;
    }

    public static String e(String str) {
        try {
            Set set = s4b1.f;
            return uic.x(str).c.name();
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static void g(Bundle bundle, ArrayDeque arrayDeque, String str) {
        int iU = nho1.u(bundle);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (iU < 262144) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                q0a q0aVar = (q0a) it.next();
                Bundle bundle2 = new Bundle();
                try {
                    ti30 ti30Var = q0aVar.a;
                    xg30 xg30Var = q0aVar.b;
                    nmr0 nmr0VarB = ti30Var.b();
                    Integer num = (Integer) nmr0VarB.b;
                    arrayList2.add(new mmr0(e(xg30Var.b), num));
                    num.getClass();
                    iU += num.intValue();
                    if (iU >= 262144) {
                        break;
                    }
                    bundle2.putParcelable("fragment_snapshot", (Parcelable) nmr0VarB.a);
                    i(xg30Var, bundle2);
                    arrayList.add(0, bundle2);
                } catch (RuntimeException e) {
                    k220.p(l1d.m("Failed to save state for ", q0aVar.b.b), e);
                    return;
                }
            }
        }
        bundle.putParcelableArray(str, (Parcelable[]) arrayList.toArray(new Bundle[0]));
        if (arrayList2.isEmpty()) {
            return;
        }
        o7h.y0(o7h.a1(arrayList2, new ktg0((byte) 3)), (CharSequence) null, (String) null, (String) null, htn0.i, 31);
        arrayList2.size();
    }

    public static void i(xg30 xg30Var, Bundle bundle) {
        String str = xg30Var.a;
        if (str != null) {
            bundle.putString(ContextTrack$Metadata.KEY_TITLE, str);
        }
        bundle.putString("spotify_uri_key", xg30Var.b);
        bundle.putString("tag", xg30Var.c);
        bundle.putParcelable("presentation_mode", xg30Var.d);
    }

    public final ArrayDeque b(Bundle bundle, String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        ClassLoader classLoader = this.a.getClassLoader();
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (parcelableArray == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        for (Parcelable parcelable : parcelableArray) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(classLoader);
            Parcelable parcelable2 = bundle2.getParcelable("fragment_snapshot");
            if (parcelable2 == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            Field field = ti30.e;
            Bundle bundle3 = (Bundle) parcelable2;
            bundle3.setClassLoader(yf30.class.getClassLoader());
            yf30 parcelable3 = bundle3.getParcelable("saved_state");
            if (parcelable3 != null) {
                try {
                    ((Bundle) ti30.e.get(parcelable3)).setClassLoader(classLoader);
                } catch (IllegalAccessException e) {
                    eg.f(e);
                    return null;
                } catch (IllegalArgumentException e2) {
                    eg.f(e2);
                    return null;
                }
            }
            Class cls = (Class) bundle3.getSerializable("class");
            if (cls == null) {
                eg.m("Required value was null.");
                return null;
            }
            arrayDeque.push(new q0a(new ti30(cls, parcelable3, (Bundle) bundle3.getParcelable("arguments"), bundle3.getInt("size")), a(bundle2)));
        }
        return arrayDeque;
    }

    public final xun0 c(Bundle bundle, String str, String str2, String str3) {
        Parcelable parcelable;
        zf30 zf30VarM;
        Parcelable parcelable2 = bundle.getParcelable(str);
        if (parcelable2 != null) {
            Bundle bundle2 = (Bundle) parcelable2;
            if (bundle2.containsKey(str2)) {
                String string = bundle2.getString(str2);
                if (string == null) {
                    zf30VarM = null;
                } else {
                    th30 th30Var = this.b;
                    zf30VarM = th30Var.c.m(string);
                    if (zf30VarM == null) {
                        th30Var.o0(new IllegalStateException(gvg.h("Fragment no longer exists for key ", str2, ": unique id ", string)));
                        throw null;
                    }
                }
                if (zf30VarM != null) {
                    return new vun0(zf30VarM, a(bundle2));
                }
            } else if (bundle2.containsKey(str3) && (parcelable = bundle2.getParcelable(str3)) != null) {
                return new wun0(parcelable, a(bundle2), null);
            }
        }
        return null;
    }

    public final xxn0 d(Bundle bundle) {
        return new xxn0(c(bundle, "active", "fragment", "target"), c(bundle, "active_previous_fragment_key", "previous_fragment_key", "previous_target_key"), b(bundle, "entries"), b(bundle, "overlay_entries"));
    }

    public final Bundle f(xxn0 xxn0Var) {
        xg30 xg30VarA;
        String str;
        xg30 xg30VarA2;
        String str2;
        xg30 xg30VarA3;
        String str3;
        xg30 xg30VarA4;
        String str4;
        Bundle bundleH;
        Bundle bundleH2;
        ArrayDeque arrayDeque = xxn0Var.d;
        ArrayDeque arrayDeque2 = xxn0Var.c;
        Bundle bundle = new Bundle();
        xun0 xun0Var = xxn0Var.a;
        xun0 xun0Var2 = xxn0Var.b;
        if (xun0Var != null && (bundleH = h(xun0Var, "fragment", "target")) != null) {
            bundle.putParcelable("active", bundleH);
            if (xun0Var2 != null && (bundleH2 = h(xun0Var2, "previous_fragment_key", "previous_target_key")) != null) {
                bundle.putParcelable("active_previous_fragment_key", bundleH2);
            }
        }
        g(bundle, arrayDeque2, "entries");
        g(bundle, arrayDeque, "overlay_entries");
        smc0 smc0VarN = k4p1.n();
        if (xun0Var != null && (xg30VarA4 = xun0Var.a()) != null && (str4 = xg30VarA4.b) != null) {
            smc0VarN.add("current=" + e(str4));
        }
        if (xun0Var2 != null && (xg30VarA3 = xun0Var2.a()) != null && (str3 = xg30VarA3.b) != null) {
            smc0VarN.add("previous=" + e(str3));
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        if (!smc0VarK.isEmpty()) {
            nho1.u(bundle);
            o7h.y0(smc0VarK, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
        }
        smc0 smc0VarN2 = k4p1.n();
        if (xun0Var != null && (xg30VarA2 = xun0Var.a()) != null && (str2 = xg30VarA2.b) != null) {
            smc0VarN2.add("current=" + e(str2));
        }
        if (xun0Var2 != null && (xg30VarA = xun0Var2.a()) != null && (str = xg30VarA.b) != null) {
            smc0VarN2.add("previous=" + e(str));
        }
        smc0 smc0VarK2 = k4p1.k(smc0VarN2);
        int iU = nho1.u(bundle);
        ArrayList arrayListN0 = o7h.N0(arrayDeque, arrayDeque2);
        ArrayList arrayList = new ArrayList(q7h.U(arrayListN0, 10));
        Iterator it = arrayListN0.iterator();
        while (it.hasNext()) {
            arrayList.add(e(((q0a) it.next()).b.b));
        }
        StringBuilder sbS = l1d.s(iU, "active=[", o7h.y0(smc0VarK2, (CharSequence) null, (String) null, (String) null, (iu30) null, 63), "], navTotal=", "b, backstack=");
        sbS.append(arrayList);
        this.c = sbS.toString();
        return bundle;
    }

    public final Bundle h(xun0 xun0Var, String str, String str2) {
        if (!(xun0Var instanceof vun0)) {
            if (!(xun0Var instanceof wun0)) {
                eg.o();
                return null;
            }
            wun0 wun0Var = (wun0) xun0Var;
            Parcelable parcelable = wun0Var.a;
            xg30 xg30Var = wun0Var.b;
            Bundle bundle = new Bundle();
            bundle.putParcelable(str2, parcelable);
            i(xg30Var, bundle);
            return bundle;
        }
        vun0 vun0Var = (vun0) xun0Var;
        zf30 zf30Var = vun0Var.a;
        xg30 xg30Var2 = vun0Var.b;
        if (zf30Var.q0()) {
            th30 th30Var = this.b;
            if (!th30Var.L) {
                Bundle bundle2 = new Bundle();
                if (zf30Var.U0 != th30Var) {
                    th30Var.o0(new IllegalStateException(gvg.i("Fragment ", zf30Var, " is not currently in the FragmentManager")));
                    throw null;
                }
                bundle2.putString(str, zf30Var.e);
                i(xg30Var2, bundle2);
                return bundle2;
            }
        }
        return null;
    }
}
