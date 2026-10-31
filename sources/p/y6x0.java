package p;

import android.view.View;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y6x0 implements Function, Predicate, BiFunction, g4u, drw, zfa {
    public final /* synthetic */ byte a;
    public static final y6x0 b = new y6x0(1);
    public static final y6x0 c = new y6x0(2);
    public static final y6x0 d = new y6x0(3);
    public static final y6x0 e = new y6x0(4);
    public static final y6x0 f = new y6x0(5);
    public static final y6x0 g = new y6x0(6);
    public static final y6x0 h = new y6x0(7);
    public static final y6x0 i = new y6x0(8);
    public static final y6x0 t = new y6x0(9);
    public static final y6x0 X = new y6x0(10);
    public static final y6x0 Y = new y6x0(11);
    public static final y6x0 Z = new y6x0(12);
    public static final y6x0 N0 = new y6x0(13);
    public static final y6x0 O0 = new y6x0(14);
    public static final y6x0 P0 = new y6x0(15);
    public static final y6x0 Q0 = new y6x0(16);
    public static final y6x0 R0 = new y6x0(17);
    public static final y6x0 S0 = new y6x0(18);
    public static final y6x0 T0 = new y6x0(19);
    public static final y6x0 U0 = new y6x0(20);
    public static final y6x0 V0 = new y6x0(21);
    public static final y6x0 W0 = new y6x0(22);
    public static final y6x0 X0 = new y6x0(23);
    public static final y6x0 Y0 = new y6x0(24);
    public static final y6x0 Z0 = new y6x0(25);
    public static final y6x0 a1 = new y6x0(26);

    public /* synthetic */ y6x0(byte b2) {
        this.a = b2;
    }

    public static w7h1 b(int i2, String str, r6h1 r6h1Var, ArrayList arrayList, String str2) {
        p710 p710Var = (p710) arrayList.remove(0);
        wqk0 wqk0Var = new wqk0(str2, r6h1Var, (byte) 1);
        Integer num = p710Var.d;
        String str3 = p710Var.c;
        srk0 srk0Var = new srk0(wqk0Var, num, str3);
        if (arrayList.size() > 0) {
            return b(i2, str, srk0Var.b(), arrayList, str3);
        }
        if (i2 == 2) {
            return srk0Var.a(str);
        }
        if (!p710Var.a.equals("SHUFFLE_PLAY")) {
            return srk0Var.h(str);
        }
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("shuffle_play_item", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("shuffle_play", 1, Collections.singletonMap("context_to_be_played", str == null ? "" : str)), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
    }

    public static w7h1 c(int i2, String str, y310 y310Var) {
        ArrayList arrayList = new ArrayList(y310Var.a);
        if (arrayList.size() < 2) {
            n57.f("Too few locations", arrayList.toString());
            return null;
        }
        p710 p710Var = (p710) arrayList.remove(0);
        String str2 = p710Var.a;
        String str3 = p710Var.b;
        if (!str2.equals("TAB") || !u890.j(str3, "com.spotify.androidauto.home")) {
            if (p710Var.a.equals("TAB") && u890.j(str3, "com.spotify.browse")) {
                return null;
            }
            n57.f("Invalid root", p710Var.toString());
            return null;
        }
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-android-auto-home";
        x6h1VarI.f = "7.1.0";
        x6h1VarI.g = "22.0.0";
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("home");
        p710 p710Var2 = (p710) arrayList.remove(0);
        String str4 = p710Var2.a;
        int iHashCode = str4.hashCode();
        if (iHashCode != -1606743355) {
            if (iHashCode != -77686849) {
                if (iHashCode == 529365700 && str4.equals("OFFLINE_STATUS_ITEM")) {
                    x6h1 x6h1VarC = y6h1VarA.c();
                    x6h1VarC.i.add(new a7h1("offline_status_item", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC.a();
                    if (arrayList.isEmpty()) {
                        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str == null ? "" : str)), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                    }
                    r6h1 r6h1Var = r6h1.c;
                    return b(i2, str, new r6h1(kk0.l(y6h1VarA2), (u8h1) null), arrayList, null);
                }
            } else if (str4.equals("YOUR_DOWNLOADS")) {
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("your_downloads", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA3 = x6h1VarC2.a();
                r6h1 r6h1Var2 = r6h1.c;
                return b(i2, str, new r6h1(kk0.l(y6h1VarA3), (u8h1) null), arrayList, null);
            }
        } else if (str4.equals("SECTION")) {
            String str5 = p710Var2.b;
            Integer num = p710Var2.d;
            String str6 = p710Var2.c;
            x6h1 x6h1VarC3 = y6h1VarA.c();
            x6h1VarC3.i.add(new a7h1("section", str5, num, str6, (String) null));
            x6h1VarC3.j = false;
            y6h1 y6h1VarA4 = x6h1VarC3.a();
            r6h1 r6h1Var3 = r6h1.c;
            return b(i2, str, new r6h1(kk0.l(y6h1VarA4), (u8h1) null), arrayList, p710Var2.c);
        }
        n57.f("Invalid section", p710Var2.toString());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    public static z6x0 e(z6x0 z6x0Var) {
        z6x0 z6x0VarA;
        int i2;
        boolean z;
        l3x0 l3x0Var;
        wbk1 wbk1Var = z6x0Var.Y;
        wbk1 wbk1Var2 = wbk1.a;
        z6x0 z6x0VarA2 = z6x0.a(z6x0Var, (m3x0) null, wbk1Var == wbk1Var2 && !z6x0Var.a.g, false, false, false, (Boolean) null, (String) null, false, false, false, 0, 2045);
        z6x0 z6x0VarA3 = z6x0.a(z6x0VarA2, (m3x0) null, false, (z6x0VarA2.Y != wbk1Var2 || (l3x0Var = z6x0VarA2.a.X0) == null || l3x0Var.d) ? false : true, false, false, (Boolean) null, (String) null, false, false, false, 0, 2043);
        wbk1 wbk1Var3 = z6x0VarA3.Y;
        wbk1 wbk1Var4 = wbk1.c;
        wbk1 wbk1Var5 = wbk1.b;
        if (wbk1Var3 == wbk1Var4) {
            z6x0VarA = z6x0.a(z6x0VarA3, (m3x0) null, false, false, true, false, (Boolean) null, (String) null, false, false, false, 0, 1895);
        } else {
            m3x0 m3x0Var = z6x0VarA3.a;
            boolean z2 = m3x0Var.Y0;
            q730 q730Var = m3x0Var.X;
            boolean z3 = q730Var.a;
            z6x0VarA = z6x0.a(z6x0VarA3, (m3x0) null, false, false, (wbk1Var3 != wbk1Var5 || q730Var.b || (!m3x0Var.f && m3x0Var.c1 && ((i2 = z6x0VarA3.X) == 1 || i2 == 2 || i2 == 8))) ? false : true, wbk1Var3 == wbk1Var5 && z3, (Boolean) null, (String) null, wbk1Var3 == wbk1Var5 && z2 && !z3 && m3x0Var.b1, false, false, 0, 1895);
        }
        z6x0 z6x0Var2 = z6x0VarA;
        if (z6x0Var2.Y == wbk1Var5) {
            m3x0 m3x0Var2 = z6x0Var2.a;
            if ((m3x0Var2.c1 && z6x0Var2.X != 8) || !m3x0Var2.a1 || m3x0Var2.X.b || m3x0Var2.f || m3x0Var2.h1) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        return g(z6x0.a(z6x0Var2, (m3x0) null, false, false, false, false, (Boolean) null, (String) null, false, z, false, 0, 1791));
    }

    public static myv f(z6x0 z6x0Var) {
        m3x0 m3x0Var = z6x0Var.a;
        return new myv(m3x0Var.a, m3x0Var.S0, m3x0Var.c, m3x0Var.d, m3x0Var.e, m3x0Var.O0, m3x0Var.Q0, m3x0Var.R0, Boolean.valueOf(m3x0Var.W0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0032  */
    public static z6x0 g(z6x0 z6x0Var) {
        boolean z;
        wbk1 wbk1Var = z6x0Var.Y;
        m3x0 m3x0Var = z6x0Var.a;
        if (wbk1Var == wbk1.b && m3x0Var.c1 && u890.j(z6x0Var.f, Boolean.TRUE)) {
            int i2 = z6x0Var.X;
            z = (i2 == 1 || i2 == 2 || i2 == 8 || m3x0Var.X.b || m3x0Var.f || m3x0Var.h1) ? false : true;
        }
        return z6x0.a(z6x0Var, (m3x0) null, false, false, false, false, (Boolean) null, (String) null, false, false, z, 0, 1535);
    }

    public void a(h6t h6tVar, brw brwVar) {
        c9s c9sVar = new c9s(new p811(), new tus(brwVar, (byte) 2), (byte) 17);
        h6tVar.b.add(c9sVar);
        if (h6tVar.a) {
            View view = h6tVar.d;
            view.getClass();
            c9sVar.onViewAttachedToWindow(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0168 A[LOOP:3: B:72:0x0162->B:74:0x0168, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    public Object apply(Object obj) {
        ArrayList arrayList;
        List list;
        String str;
        int i2;
        Object obj2 = null;
        switch (this.a) {
            case 1:
                return crn0.a;
            case 2:
                return ((PlayerState) obj).restrictions();
            case 3:
                return new ftc0((List) obj);
            case 4:
                return oyd0.a;
            case 5:
                sy21 sy21Var = (sy21) obj;
                uxw uxwVar = sy21Var.a.Q0 ? (uxw) sy21Var.b : null;
                if (uxwVar == null) {
                    return zxw.a;
                }
                String str2 = uxwVar.a;
                xxw xxwVar = uxwVar.b;
                if (xxwVar == null || (list = xxwVar.a) == null) {
                    arrayList = z6x.a;
                } else {
                    for (Object obj3 : list) {
                        if ("EMAIL".equalsIgnoreCase((String) obj3)) {
                            obj2 = obj3;
                            str = (String) obj2;
                            if (str != null) {
                                arrayList = new ArrayList(str.length());
                                for (i2 = 0; i2 < str.length(); i2++) {
                                    str.charAt(i2);
                                    arrayList.add(rxw.a);
                                }
                            } else {
                                arrayList = z6x.a;
                            }
                        }
                    }
                    str = (String) obj2;
                    if (str != null) {
                        arrayList = new ArrayList(str.length());
                        while (i2 < str.length()) {
                            str.charAt(i2);
                            arrayList.add(rxw.a);
                        }
                    } else {
                        arrayList = z6x.a;
                    }
                }
                return new yxw(new qxw(str2, arrayList, xxwVar != null ? xxwVar.b : false));
            case 6:
            case 8:
            case 18:
            case 19:
            case 21:
            case 22:
            default:
                List<uf70> list2 = ((if70) obj).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                for (uf70 uf70Var : list2) {
                    String str3 = uf70Var.a;
                    List<of70> list3 = uf70Var.b;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
                    for (of70 of70Var : list3) {
                        String str4 = of70Var.a;
                        String str5 = of70Var.b;
                        String str6 = of70Var.g;
                        String str7 = of70Var.d.a;
                        if (str7 == null) {
                            str7 = "";
                        }
                        String str8 = str7;
                        ff70 ff70Var = of70Var.e;
                        arrayList3.add(new aa51(str5, str6, str8, str4, ff70Var != null ? ff70Var.a : null, of70Var.f));
                    }
                    arrayList2.add(new ba51(str3, arrayList3));
                }
                return arrayList2;
            case 7:
                return new jb41(false);
            case 9:
                n57.e("[Puffin] DisableProcessing failed: " + ((Throwable) obj));
                return Completable.j(o9n.a);
            case 10:
                return new q910(false);
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return Observable.just(new xp81(new njn0(zBooleanValue)), new hp81(zBooleanValue));
            case 12:
                return ((Restrictions) obj).disallowSkippingNextReasons();
            case 13:
                List list4 = (List) obj;
                return list4.isEmpty() ? MaybeEmpty.a : Maybe.e(list4);
            case 14:
                HttpException httpException = (Throwable) obj;
                return ((httpException instanceof HttpException) && httpException.a == 404) ? CompletableEmpty.a : Completable.j(httpException);
            case 15:
                return ((ContextTrack) obj).uri();
            case 16:
                return new dbc1((egi1) obj);
            case 17:
                return Boolean.valueOf(((l62) obj).Z instanceof lsn);
            case 20:
                drx0 drx0Var = (drx0) obj;
                return new mmr0(drx0Var.a, drx0Var.b);
            case 23:
                return new dyo0((val1) obj);
            case 24:
                return new eq3((htc0) obj);
        }
    }

    public vfa d() {
        return new tx((byte) 0);
    }

    public boolean test(Object obj) {
        boolean z;
        switch (this.a) {
            case 6:
                z = ((uv00) obj).f;
                break;
            default:
                z = ((uv00) obj).f;
                break;
        }
        return !z;
    }

    public boolean test(Object obj, Object obj2) {
        return !((bfj1) obj).equals((bfj1) obj2);
    }

    public Object apply(Object obj, Object obj2) {
        return new mmr0((String) obj, (ju41) obj2);
    }
}
