package p;

import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yi20 implements v0i, Function, Predicate, s0z, luo, mog0, BiFunction, np80, Init, s2i1 {
    public final /* synthetic */ byte a;
    public static final yi20 b = new yi20(0);
    public static final yi20 c = new yi20(1);
    public static final yi20 d = new yi20(2);
    public static final yi20 e = new yi20(3);
    public static final yi20 f = new yi20(4);
    public static final yi20 g = new yi20(5);
    public static final yi20 h = new yi20(6);
    public static final yi20 i = new yi20(7);
    public static final yi20 t = new yi20(9);
    public static final yi20 X = new yi20(10);
    public static final yi20 Y = new yi20(11);
    public static final yi20 Z = new yi20(12);
    public static final yi20 N0 = new yi20(13);
    public static final yi20 O0 = new yi20(14);
    public static final yi20 P0 = new yi20(15);
    public static final yi20 Q0 = new yi20(16);
    public static final yi20 R0 = new yi20(17);
    public static final yi20 S0 = new yi20(18);
    public static final yi20 T0 = new yi20(19);
    public static final yi20 U0 = new yi20(20);
    public static final yi20 V0 = new yi20(21);
    public static final yi20 W0 = new yi20(22);
    public static final yi20 X0 = new yi20(23);
    public static final yi20 Y0 = new yi20(24);
    public static final yi20 Z0 = new yi20(25);
    public static final yi20 a1 = new yi20(26);
    public static final yi20 b1 = new yi20(27);
    public static final yi20 c1 = new yi20(28);
    public static final yi20 d1 = new yi20(29);

    public /* synthetic */ yi20(byte b2) {
        this.a = b2;
    }

    public static Next j(d5d0 d5d0Var) {
        Set set = d5d0Var.e;
        Set setP1 = o7h.p1(o7h.d1(set, d5d0Var.f));
        return Next.i(d5d0.a(d5d0Var, true, true, (Set) null, dm61.v0(set, setP1), 105), Effects.a(new l4d0[]{new k4d0(d5d0Var.a, setP1), new j4d0(d5d0Var.g.a)}));
    }

    @Override // p.mog0
    public void a(nog0 nog0Var, log0 log0Var, Object obj) {
        cpg0 cpg0Var = (cpg0) log0Var;
        fpg0 fpg0Var = cpg0Var.b;
        cpg0Var.b = new gpg0(((dpg0) nog0Var).i, obj, cpg0Var);
        fpg0Var.clear();
    }

    public Object apply(Object obj) {
        vwp0 vwp0Var;
        switch (this.a) {
            case 2:
                List<zvt> list = ((zm40) obj).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (zvt zvtVar : list) {
                    arrayList.add(new fpt(zvtVar.a, zvtVar.b, zvtVar.c, zvtVar.d, zvtVar.f, zvtVar.e));
                }
                return arrayList;
            case 3:
                vo50 vo50Var = (vo50) obj;
                return new n7z0(vo50Var.b, vo50Var.a, vo50Var.c);
            case 4:
            case 6:
            case 7:
            case 8:
            case grn1.d /* 12 */:
            case 13:
            case 14:
            case 17:
            case 22:
            default:
                return new mww0((Integer) null);
            case 5:
                return crn0.a;
            case 9:
                return new dd7("");
            case 10:
                return new b200(((u1f0) obj).b);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return tng1.a;
            case 15:
                return ((th61) obj).a;
            case 16:
                return Boolean.valueOf(((twj1) obj) instanceof rwj1);
            case 18:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline.ContextsProgressResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.ContextsProgressResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 19:
                h290<EsOffline.ContextInfo> h290VarP = ((EsOffline.GetContextsResponse) obj).p();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP, 10));
                for (EsOffline.ContextInfo contextInfo : h290VarP) {
                    int iP = (int) contextInfo.o().p();
                    String uri = contextInfo.o().getUri();
                    int iOrdinal = contextInfo.o().q().ordinal();
                    if (iOrdinal != 0) {
                        vwp0Var = lwp0.a;
                        if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                vwp0Var = new vwp0(1, iP);
                            } else if (iOrdinal == 3) {
                                vwp0Var = hwp0.a;
                            } else if (iOrdinal == 4) {
                                vwp0Var = new jwp0(iP);
                            } else if (iOrdinal != 5) {
                                n57.e("Invalid Context.State state: " + contextInfo.o().q());
                            } else {
                                vwp0Var = new vwp0(1, iP);
                            }
                        }
                    } else {
                        vwp0Var = rwp0.a;
                    }
                    arrayList2.add(new axp0(uri, vwp0Var));
                }
                return new cxp0(arrayList2);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return z6x.a;
            case 21:
                wew wewVar = (wew) obj;
                return new x200(wewVar.a, wewVar.b);
            case 23:
                if (((c6u0) obj).equals(c6u0.a)) {
                    return Flowable.I(j5.a);
                }
                eg.o();
                return null;
            case 24:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                String strB0 = contextTrack != null ? l4o1.b0(contextTrack) : null;
                return strB0 == null ? "" : strB0;
        }
    }

    @Override // p.mog0
    public rog0 b() {
        return rog0.b;
    }

    @Override // p.mog0
    public log0 c(nog0 nog0Var, Object obj, int i2, log0 log0Var) {
        dpg0 dpg0Var = (dpg0) nog0Var;
        cpg0 cpg0Var = (cpg0) log0Var;
        return cpg0Var == null ? new cpg0(dpg0Var.h, obj, i2) : new bpg0(dpg0Var.h, obj, i2, cpg0Var);
    }

    @Override // p.mog0
    public log0 d(nog0 nog0Var, log0 log0Var, log0 log0Var2) {
        dpg0 dpg0Var = (dpg0) nog0Var;
        cpg0 cpg0Var = (cpg0) log0Var;
        cpg0 cpg0Var2 = (cpg0) log0Var2;
        T t2 = cpg0Var.get();
        if (t2 == 0) {
            return null;
        }
        int i2 = nog0.g;
        if (cpg0Var.b.get() == null) {
            return null;
        }
        int i3 = cpg0Var.a;
        cpg0 cpg0Var3 = cpg0Var2 == null ? new cpg0(dpg0Var.h, t2, i3) : new bpg0(dpg0Var.h, t2, i3, cpg0Var2);
        cpg0Var3.b = cpg0Var.b.b(dpg0Var.i, cpg0Var3);
        return cpg0Var3;
    }

    public Iterable e(Object obj) {
        int i2 = brb0.p;
        return new h46(z561.f0(zqb0.b, new i46(((beg) obj).g().d(), (byte) 1)), (byte) 2);
    }

    public First e0(Object obj) {
        return First.c((b1t0) obj, f46.S0(new vzs0[]{szs0.a, qzs0.b}));
    }

    @Override // p.mog0
    public rog0 f() {
        return rog0.b;
    }

    public Boolean g() {
        return Boolean.TRUE;
    }

    @Override // p.mog0
    public nog0 h(ipg0 ipg0Var, int i2) {
        return new dpg0(ipg0Var, i2);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("namespace");
        if (str4 == null || (str3 = (String) linkedHashMap.get("list_id")) == null) {
            return null;
        }
        return new jxu0(str4, str3, str2, str, xkg0Var);
    }

    public Object m(dxy dxyVar) {
        return qgo1.q((Executor) dxyVar.d(new lzy0(tbc0.class, Executor.class)));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                return ((String) obj).length() > 0;
            case 13:
                return !((uv00) obj).f;
            default:
                return ((spq0) obj).c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                return new mmr0((o4p0) obj, (ufm0) obj2);
            case 27:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return new mmr0((Boolean) obj, bool);
            default:
                return (vov0) obj;
        }
    }
}
