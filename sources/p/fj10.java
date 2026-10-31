package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.protobuf.Empty;
import com.spotify.familyviewservice.v1.TransitionToManagedAccountResponse;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fj10 implements Function, s2i1, BiFunction, Predicate, Function4 {
    public final /* synthetic */ byte a;
    public static final fj10 b = new fj10(0);
    public static final n511 c = new n511(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final fj10 d = new fj10(2);
    public static final fj10 e = new fj10(3);
    public static final fj10 f = new fj10(4);
    public static final fj10 g = new fj10(5);
    public static final fj10 h = new fj10(6);
    public static final fj10 i = new fj10(7);
    public static final fj10 t = new fj10(8);
    public static final fj10 X = new fj10(9);
    public static final fj10 Y = new fj10(10);
    public static final fj10 Z = new fj10(11);
    public static final fj10 N0 = new fj10(13);
    public static final fj10 O0 = new fj10(14);
    public static final fj10 P0 = new fj10(15);
    public static final fj10 Q0 = new fj10(16);
    public static final fj10 R0 = new fj10(17);
    public static final fj10 S0 = new fj10(18);
    public static final fj10 T0 = new fj10(19);
    public static final fj10 U0 = new fj10(20);
    public static final fj10 V0 = new fj10(21);
    public static final fj10 W0 = new fj10(22);
    public static final fj10 X0 = new fj10(23);
    public static final fj10 Y0 = new fj10(24);
    public static final fj10 Z0 = new fj10(25);
    public static final fj10 a1 = new fj10(26);
    public static final fj10 b1 = new fj10(27);
    public static final fj10 c1 = new fj10(28);
    public static final fj10 d1 = new fj10(29);

    public /* synthetic */ fj10(byte b2) {
        this.a = b2;
    }

    public static qn b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new qn(layoutInflater, viewGroup);
    }

    public static String c(b9g0 b9g0Var, String str) {
        List list = b9g0Var.c;
        ArrayList<ffs0> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(((ifs0) it.next()).l0(), arrayList);
        }
        for (ffs0 ffs0Var : arrayList) {
            if (u890.j(ffs0Var.getRequestId(), str)) {
                if (ffs0Var instanceof efs0) {
                    return ((efs0) ffs0Var).b;
                }
                if (ffs0Var instanceof dfs0) {
                    return ((dfs0) ffs0Var).b;
                }
                eg.o();
                return null;
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }

    public static List d(b9g0 b9g0Var, String str) {
        List list = b9g0Var.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof hfs0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (u890.j(((hfs0) obj2).a, str)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            r7h.W(((hfs0) it.next()).b, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((efs0) it2.next()).a);
        }
        return o7h.j0(arrayList4);
    }

    public static b9g0 e(b9g0 b9g0Var, Set set, iu30 iu30Var) {
        Map map = b9g0Var.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            a9g0 a9g0Var = (a9g0) entry.getValue();
            if (set.contains(str)) {
                a9g0Var = (a9g0) iu30Var.invoke(a9g0Var);
            }
            linkedHashMap.put(key, a9g0Var);
        }
        return b9g0.a(b9g0Var, linkedHashMap, null, false, 55);
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        return new cpt0(((Boolean) obj).booleanValue(), (ContextTrack) obj2, ((Boolean) obj3).booleanValue(), (Restrictions) obj4);
    }

    public void a(b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1525769766);
        int i3 = (x340Var.g(this) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            yah0.i(x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gqw0(this, i2);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                TransitionToManagedAccountResponse transitionToManagedAccountResponse = (TransitionToManagedAccountResponse) obj;
                return new pig1(transitionToManagedAccountResponse.getTimeout().p(), transitionToManagedAccountResponse.getMigrationId());
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 10:
            case 12:
            case 16:
            case 18:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            default:
                kby kbyVar = (kby) obj;
                boolean z = kbyVar.g;
                qp31 qp31VarA = kbyVar.x.a(qp31.class);
                boolean z2 = false;
                boolean z3 = qp31VarA != null && qp31VarA.a;
                boolean z4 = kbyVar.j;
                boolean z5 = !z4 || (z4 && !z);
                if (z3 && z5 && (!kbyVar.w.a || !z)) {
                    z2 = true;
                }
                return new d910(z, z2);
            case 5:
                return new e1n1(((Boolean) obj).booleanValue());
            case 8:
                return new x7c0(q2q0.a, (Boolean) obj);
            case 9:
                return new wxd0(((Boolean) obj).booleanValue());
            case 11:
                return new oaf0(((Boolean) obj).booleanValue());
            case 13:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 14:
                return l4o1.b0((ContextTrack) obj);
            case 15:
                return Boolean.valueOf(yto.j((String) ((Map) obj).get("restrict-branch-data-processing")));
            case 17:
                return (Long) ((spq0) obj).b();
            case 19:
                return ((EsOfflinePlugin.IdentifyResponse) obj).toByteArray();
            case 20:
                return (ObservableSource) ((atq0) obj).a(rfq0.U0, rfq0.V0);
            case 21:
                return ((fs80) obj).a ? yz40.a : yz40.c;
            case 22:
                return new z310((List) obj, (f410) null, (m510) null, (String) null);
            case 24:
                return (Long) ((spq0) obj).b();
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return sqg0.U(((PlayerState) obj).contextMetadata());
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 2:
                return new ea40(str2, str, xkg0Var);
            case 6:
                return new j6a0(xkg0Var, str2, str);
            default:
                String str3 = (String) linkedHashMap.get("playlist_id");
                if (str3 != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str3.charAt(i2);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new rxu0(str3, str2, str, xkg0Var);
                }
                return null;
        }
    }

    public boolean test(Object obj) {
        return ((spq0) obj).c();
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                return new mmr0((ju41) obj, (mmr0) obj2);
            case 7:
                return o7h.N0((List) obj2, (List) obj);
            case 16:
                spq0 spq0Var = (spq0) obj2;
                l0l l0lVar = (l0l) ((spq0) obj).h();
                ya0 ya0Var = null;
                if (l0lVar != null) {
                    String name = l0lVar.getName();
                    String str = l0lVar.G().a;
                    int iP = l0lVar.p();
                    pp90 pp90Var = (pp90) spq0Var.h();
                    ya0Var = new ya0(name, str, iP, pp90Var != null ? pp90Var.a : null);
                }
                return new ruo0(ya0Var);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
        }
    }
}
