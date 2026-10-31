package p;

import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.martini.martinidata.model.Mode;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t2m implements Update {
    public final /* synthetic */ byte a;
    public static final t2m b = new t2m(0);
    public static final t2m c = new t2m(1);
    public static final t2m d = new t2m(2);
    public static final t2m e = new t2m(3);
    public static final t2m f = new t2m(4);
    public static final t2m g = new t2m(5);
    public static final t2m h = new t2m(6);
    public static final t2m i = new t2m(7);
    public static final t2m j = new t2m(8);
    public static final t2m k = new t2m(9);
    public static final t2m l = new t2m(10);
    public static final t2m m = new t2m(11);
    public static final t2m n = new t2m(12);
    public static final t2m o = new t2m(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t2m f64p = new t2m(14);
    public static final t2m q = new t2m(15);
    public static final t2m r = new t2m(16);
    public static final t2m s = new t2m(17);
    public static final t2m t = new t2m(18);
    public static final t2m u = new t2m(19);
    public static final t2m v = new t2m(20);
    public static final t2m w = new t2m(21);
    public static final t2m x = new t2m(22);
    public static final t2m y = new t2m(23);
    public static final t2m z = new t2m(24);
    public static final t2m A = new t2m(25);
    public static final t2m B = new t2m(26);
    public static final t2m C = new t2m(27);
    public static final t2m D = new t2m(28);
    public static final t2m E = new t2m(29);

    public /* synthetic */ t2m(byte b2) {
        this.a = b2;
    }

    private final Next e(Object obj, Object obj2) {
        ou80 ou80Var;
        ou80 ou80Var2;
        rx00 rx00Var = (tx00) obj;
        tq80 tq80Var = (tq80) obj2;
        Object obj3 = tq80Var.a;
        boolean z2 = rx00Var instanceof sx00;
        ox00 mx00Var = nx00.a;
        if (z2) {
            sx00 sx00Var = (sx00) rx00Var;
            dx00 dx00Var = sx00Var.c;
            gw00 gw00Var = (ww00) obj3;
            if (gw00Var instanceof hw00) {
                long j2 = sx00Var.a;
                String str = sx00Var.b;
                boolean z3 = sx00Var.d;
                boolean z4 = sx00Var.e;
                jx00 jx00Var = sx00Var.f;
                hw00 hw00Var = (hw00) gw00Var;
                String str2 = hw00Var.a;
                String str3 = hw00Var.b;
                String str4 = hw00Var.c;
                List list = hw00Var.d;
                String str5 = hw00Var.f;
                String str6 = hw00Var.e;
                if (str6 != null) {
                    mx00Var = new mx00(str6);
                }
                return Next.h(new rx00(j2, str, dx00Var, z3, mx00Var, z4, jx00Var, str2, str3, str4, list, sx00Var.g, str5));
            }
            if (gw00Var instanceof gw00) {
                Logger.d("ExtendedUserActivityRowElement", new Object[]{"Metadata loading failed: ".concat(gw00Var.a)});
                return Next.h(new qx00(sx00Var.a, sx00Var.b, sx00Var.c, sx00Var.d));
            }
            if (gw00Var instanceof aw00) {
                return dx00Var instanceof dx00 ? Next.h(sx00.b(sx00Var, 0L, null, new yw00(dx00Var.getUri(), ((aw00) gw00Var).a), false, false, null, false, 123)) : Next.j();
            }
            if (gw00Var instanceof zv00) {
                Logger.d("ExtendedUserActivityRowElement", new Object[]{"Context data loading failed: ".concat(((zv00) gw00Var).a)});
                return dx00Var instanceof zw00 ? Next.h(sx00.b(sx00Var, 0L, null, new xw00(((zw00) dx00Var).a), false, false, null, false, 123)) : Next.j();
            }
            if (gw00Var instanceof bw00) {
                return dx00Var instanceof dx00 ? Next.h(sx00.b(sx00Var, 0L, null, new bx00(dx00Var.getUri()), false, false, null, false, 123)) : Next.j();
            }
            if (gw00Var instanceof ew00) {
                return Next.h(sx00.b(sx00Var, 0L, null, null, false, false, ((ew00) gw00Var).a, false, 95));
            }
            if (gw00Var instanceof tw00) {
                return Next.h(sx00.b(sx00Var, 0L, null, null, false, ((tw00) gw00Var).a, null, false, 111));
            }
            return gw00Var instanceof fw00 ? Next.h(sx00.b(sx00Var, 0L, null, null, false, false, null, ((fw00) gw00Var).a, 63)) : Next.j();
        }
        mst0 kst0Var = null;
        if (!(rx00Var instanceof rx00)) {
            if (rx00Var instanceof qx00) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        rx00 rx00Var2 = rx00Var;
        yw00 yw00Var = rx00Var2.c;
        ox00 ox00Var = rx00Var2.e;
        String str7 = rx00Var2.b;
        tqw tqwVar = tq80Var.b;
        pw00 pw00Var = (ww00) obj3;
        boolean z5 = pw00Var instanceof vw00;
        o9w o9wVar = o9w.a;
        if (z5) {
            if (wm5.C(rx00Var2)) {
                return Next.a(Collections.singleton(new gfw(str7)));
            }
            tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
            String str8 = (tv80VarY == null || (ou80Var2 = tv80VarY.a) == null) ? null : ou80Var2.a;
            if (str8 == null) {
                str8 = "";
            }
            boolean z6 = yw00Var instanceof yw00;
            cx00 cx00Var = cx00.a;
            ax00 ax00Var = ax00.a;
            if (!z6 && !(yw00Var instanceof zw00) && !(yw00Var instanceof xw00) && !(yw00Var instanceof bx00) && !u890.j(yw00Var, ax00Var)) {
                if (u890.j(yw00Var, cx00Var)) {
                    return Next.a(f46.S0(new hiw[]{new zdw(str7, str8), o9wVar}));
                }
                eg.o();
                return null;
            }
            String str9 = rx00Var2.m;
            if (z6) {
                kst0Var = new kst0(yw00Var.a);
            } else if ((yw00Var instanceof zw00) || (yw00Var instanceof xw00)) {
                kst0Var = new kst0(yw00Var.getUri());
            } else if ((yw00Var instanceof bx00) || u890.j(yw00Var, ax00Var)) {
                if (str9 != null) {
                    kst0Var = new ist0(str9);
                }
            } else if (!u890.j(yw00Var, cx00Var)) {
                eg.o();
                return null;
            }
            return Next.a(Collections.singleton(new bew(str7, kst0Var, tv80VarY)));
        }
        boolean z7 = pw00Var instanceof jw00;
        tew tewVar = tew.a;
        pfw pfwVar = pfw.a;
        if (z7) {
            if (wm5.C(rx00Var2)) {
                return Next.a(Collections.singleton(new gfw(str7)));
            }
            int iOrdinal = rx00Var2.g.ordinal();
            if (iOrdinal == 0) {
                String str10 = (tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null) ? null : ou80Var.a;
                if (str10 == null) {
                    str10 = "";
                }
                xj61 xj61Var = new xj61();
                xj61Var.add(new zdw(str7, str10));
                if (ox00Var instanceof kx00) {
                    xj61Var.add(pfwVar);
                }
                return Next.a(cwl1.j(xj61Var));
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return ox00Var instanceof kx00 ? Next.a(Collections.singleton(pfwVar)) : Next.a(Collections.singleton(xdw.a));
                }
                eg.o();
                return null;
            }
            xj61 xj61Var2 = new xj61();
            xj61Var2.add(tewVar);
            if (ox00Var instanceof kx00) {
                xj61Var2.add(pfwVar);
            }
            return Next.a(cwl1.j(xj61Var2));
        }
        if (pw00Var instanceof iw00) {
            tv80 tv80VarY2 = tqwVar != null ? n3o1.y(tqwVar) : null;
            return tv80VarY2 != null ? Next.a(Collections.singleton(new dfw(str7, tv80VarY2))) : Next.j();
        }
        if (pw00Var instanceof cw00) {
            return Next.a(Collections.singleton(o9wVar));
        }
        if (pw00Var instanceof mw00) {
            if (wm5.C(rx00Var2)) {
                return Next.a(Collections.singleton(new gfw(str7)));
            }
            tv80 tv80VarY3 = tqwVar != null ? n3o1.y(tqwVar) : null;
            if (ox00Var instanceof kx00) {
                return Next.a(Collections.singleton(pfwVar));
            }
            if (ox00Var instanceof mx00) {
                return Next.a(Collections.singleton(new dew(((mx00) ox00Var).a, str7, tv80VarY3)));
            }
            if (ox00Var.equals(mx00Var)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (pw00Var instanceof pw00) {
            pw00 pw00Var2 = pw00Var;
            lx00 lx00Var = ox00Var instanceof lx00 ? (lx00) ox00Var : null;
            String strA = lx00Var != null ? lx00Var.a() : null;
            if (strA != null) {
                return Next.h(rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, new kx00(strA, pw00Var2.a), false, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8175));
            }
            Logger.d("ExtendedUserActivityRowElement", new Object[]{l1d.m("PreviewStarted with no preview URL for ", str7)});
            return Next.j();
        }
        if (pw00Var instanceof qw00) {
            rx00 rx00VarB = rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, wm5.D(rx00Var2), false, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8175);
            return rx00VarB.g == jx00.c ? Next.i(rx00VarB, Collections.singleton(tewVar)) : Next.h(rx00VarB);
        }
        if (pw00Var instanceof ow00) {
            return Next.h(rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, wm5.D(rx00Var2), false, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8175));
        }
        if (pw00Var instanceof nw00) {
            Logger.d("ExtendedUserActivityRowElement", new Object[]{gvg.h("Preview failed for ", str7, ": ", ((nw00) pw00Var).a)});
            return Next.i(rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, wm5.D(rx00Var2), false, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8175), Collections.singleton(pfwVar));
        }
        if (pw00Var instanceof lw00) {
            return Next.h(rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, wm5.D(rx00Var2), false, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8175));
        }
        if (pw00Var instanceof kw00) {
            Logger.d("ExtendedUserActivityRowElement", new Object[]{gvg.h("Playback failed for ", str7, ": ", ((kw00) pw00Var).a)});
            return Next.j();
        }
        if (pw00Var instanceof ew00) {
            return Next.h(rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, (ox00) null, false, ((ew00) pw00Var).a, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8127));
        }
        if (pw00Var instanceof dw00) {
            return ox00Var instanceof kx00 ? Next.a(Collections.singleton(bbw.a)) : Next.j();
        }
        if (pw00Var instanceof hw00) {
            hw00 hw00Var2 = (hw00) pw00Var;
            String str11 = hw00Var2.a;
            String str12 = hw00Var2.b;
            String str13 = hw00Var2.c;
            List list2 = hw00Var2.d;
            String str14 = hw00Var2.f;
            String str15 = hw00Var2.e;
            if (ox00Var instanceof kx00) {
                if (str15 != null) {
                    mx00Var = new kx00(str15, ((kx00) ox00Var).b);
                }
            } else if (str15 != null) {
                mx00Var = new mx00(str15);
            }
            return Next.h(rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, mx00Var, false, (jx00) null, str11, str12, str13, list2, false, str14, 2159));
        }
        if (pw00Var instanceof gw00) {
            Logger.d("ExtendedUserActivityRowElement", new Object[]{"Metadata loading failed: ".concat(((gw00) pw00Var).a)});
            return Next.j();
        }
        if (pw00Var instanceof aw00) {
            return yw00Var instanceof dx00 ? Next.h(rx00.b(rx00Var2, 0L, (String) null, new yw00(yw00Var.getUri(), ((aw00) pw00Var).a), false, (ox00) null, false, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8187)) : Next.j();
        }
        if (pw00Var instanceof zv00) {
            Logger.d("ExtendedUserActivityRowElement", new Object[]{"Context data loading failed: ".concat(((zv00) pw00Var).a)});
            return yw00Var instanceof zw00 ? Next.h(rx00.b(rx00Var2, 0L, (String) null, new xw00(((zw00) yw00Var).a), false, (ox00) null, false, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8187)) : Next.j();
        }
        if (pw00Var instanceof bw00) {
            return yw00Var instanceof dx00 ? Next.h(rx00.b(rx00Var2, 0L, (String) null, new bx00(yw00Var.getUri()), false, (ox00) null, false, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8187)) : Next.j();
        }
        if (pw00Var instanceof rw00) {
            if (wm5.C(rx00Var2)) {
                return Next.a(Collections.singleton(new gfw(str7)));
            }
            ou80 ou80Var3 = tqwVar != null ? n3o1.y(tqwVar).a : null;
            if (rx00Var2.f) {
                return Next.a(Collections.singleton(new tdw(ou80Var3)));
            }
            rx00 rx00VarB2 = rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, (ox00) null, true, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8159);
            String str16 = ou80Var3 != null ? ou80Var3.a : null;
            if (str16 == null) {
                str16 = "";
            }
            return Next.i(rx00VarB2, Collections.singleton(new g9w(str7, str16)));
        }
        if (pw00Var instanceof uw00) {
            return Next.h(rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, (ox00) null, true, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8159));
        }
        if (pw00Var instanceof sw00) {
            Logger.d("ExtendedUserActivityRowElement", new Object[]{gvg.h("Queue failed for ", str7, ": ", ((sw00) pw00Var).a)});
            return Next.h(rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, (ox00) null, false, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8159));
        }
        if (pw00Var instanceof tw00) {
            return Next.h(rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, (ox00) null, ((tw00) pw00Var).a, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8159));
        }
        if (pw00Var instanceof fw00) {
            return Next.h(rx00.b(rx00Var2, 0L, (String) null, (ex00) null, false, (ox00) null, false, (jx00) null, (String) null, (String) null, (String) null, (List) null, ((fw00) pw00Var).a, (String) null, 6143));
        }
        eg.o();
        return null;
    }

    private final Next f(Object obj, Object obj2) {
        Long l2;
        uo10 uo10Var = (vo10) obj;
        tq80 tq80Var = (tq80) obj2;
        ho10 ho10Var = (jo10) tq80Var.a;
        if (ho10Var instanceof io10) {
            if (uo10Var instanceof uo10) {
                io10 io10Var = (io10) ho10Var;
                uo10 uo10Var2 = uo10Var;
                return Next.h(new so10(io10Var.d, io10Var.a, io10Var.b, io10Var.e, io10Var.f, io10Var.g, io10Var.h, io10Var.j, io10Var.i, io10Var.c, uo10Var2.e, uo10Var2.f));
            }
            if (!(uo10Var instanceof so10)) {
                return Next.j();
            }
            io10 io10Var2 = (io10) ho10Var;
            so10 so10Var = (so10) uo10Var;
            return Next.h(new so10(io10Var2.d, io10Var2.a, io10Var2.b, io10Var2.e, io10Var2.f, io10Var2.g, io10Var2.h, io10Var2.j, io10Var2.i, io10Var2.c, so10Var.X, so10Var.Y));
        }
        if (ho10Var instanceof ho10) {
            Logger.d(l1d.m("FeedActivityCarouselItem: Metadata loading failed: ", ho10Var.a.getMessage()), new Object[0]);
            return Next.h(to10.a);
        }
        if (!(ho10Var instanceof go10)) {
            eg.o();
            return null;
        }
        if (!(uo10Var instanceof so10)) {
            return Next.j();
        }
        so10 so10Var2 = (so10) uo10Var;
        mo10 mo10Var = so10Var2.X;
        String str = so10Var2.a;
        String str2 = so10Var2.b;
        String str3 = so10Var2.c;
        oo10 oo10Var = so10Var2.t;
        boolean z2 = oo10Var instanceof po10;
        oo10 oo10Var2 = oo10Var instanceof oo10 ? oo10Var : null;
        long jLongValue = (oo10Var2 == null || (l2 = oo10Var2.a) == null) ? 0L : l2.longValue();
        tqw tqwVar = tq80Var.b;
        return Next.a(Collections.singleton(new efw(str, str2, str3, z2, jLongValue, mo10Var, tqwVar != null ? n3o1.y(tqwVar) : null)));
    }

    private final Next g(Object obj, Object obj2) {
        hr10 hr10Var = (hr10) obj;
        dr10 dr10Var = (er10) obj2;
        boolean z2 = hr10Var.b;
        fr10 fr10Var = hr10Var.a;
        Mode mode = fr10Var.e;
        cy10 cy10Var = fr10Var.d;
        String str = fr10Var.a;
        if (dr10Var instanceof vq10) {
            return Next.a(Collections.singleton(new hq10(((vq10) dr10Var).b)));
        }
        if (dr10Var instanceof wq10) {
            return Next.h(hr10.a(hr10Var, (fr10) null, false, true, 3));
        }
        if (dr10Var instanceof xq10) {
            return Next.h(hr10.a(hr10Var, (fr10) null, false, false, 3));
        }
        if (dr10Var instanceof zq10) {
            return Next.i(hr10.a(hr10Var, (fr10) null, false, false, 3), Collections.singleton(jq10.a));
        }
        boolean z3 = dr10Var instanceof dr10;
        cy10 cy10Var2 = cy10.a;
        if (z3) {
            if (z2) {
                return Next.j();
            }
            return cy10Var == cy10Var2 ? Next.i(hr10.a(hr10Var, fr10.a(fr10Var, (cy10) null), false, false, 6), Collections.singleton(new lq10(str, mode))) : Next.i(hr10.a(hr10Var, (fr10) null, true, false, 5), Collections.singleton(new kq10(dr10Var.a, mode)));
        }
        boolean z4 = dr10Var instanceof ar10;
        cy10 cy10Var3 = cy10.b;
        if (z4) {
            if (z2) {
                return Next.j();
            }
            return cy10Var == cy10Var3 ? Next.i(hr10.a(hr10Var, fr10.a(fr10Var, (cy10) null), false, false, 6), Collections.singleton(new lq10(str, mode))) : Next.a(Collections.singleton(new iq10(((ar10) dr10Var).a, mode)));
        }
        if (dr10Var instanceof cr10) {
            return Next.i(hr10.a(hr10Var, fr10.a(fr10Var, cy10Var2), false, false, 4), Collections.singleton(new mq10(true)));
        }
        if (dr10Var instanceof br10) {
            return Next.h(hr10.a(hr10Var, (fr10) null, false, false, 5));
        }
        if (!(dr10Var instanceof yq10)) {
            eg.o();
            return null;
        }
        yq10 yq10Var = (yq10) dr10Var;
        cy10 cy10Var4 = yq10Var.b;
        if (u890.j(yq10Var.a, str)) {
            return Next.i(hr10.a(hr10Var, fr10.a(fr10Var, cy10Var4), false, false, 6), (yq10Var.c && cy10Var4 == cy10Var3) ? Collections.singleton(new mq10(false)) : w7x.a);
        }
        return Next.j();
    }

    private final Next h(Object obj, Object obj2) {
        String str;
        String string;
        String str2;
        wv10 wv10Var = (wv10) obj;
        yu10 yu10Var = (rv10) obj2;
        String str3 = wv10Var.b;
        nho0 nho0Var = wv10Var.e;
        tv10 tv10Var = wv10Var.a;
        nho0 nho0Var2 = null;
        if (yu10Var instanceof kv10) {
            if (tv10Var instanceof tv10) {
                return Next.i(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, true, false, 0, 0, null, false, null, null, false, false, false, 1047615), Collections.singleton(new dt10(tv10Var.a, ((kv10) yu10Var).a)));
            }
            if (tv10Var instanceof sv10) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (yu10Var instanceof jv10) {
            if (nho0Var == null) {
                return Next.j();
            }
            if (tv10Var instanceof sv10) {
                sv10 sv10Var = (sv10) tv10Var;
                return Next.i(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, true, false, 0, 0, null, false, null, null, false, false, false, 1047615), Collections.singleton(new rt10(sv10Var.a, nho0Var.a, sv10Var.b, str3)));
            }
            if (tv10Var instanceof tv10) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (yu10Var instanceof lv10) {
            boolean z2 = wv10Var.r && wv10Var.m == 0 && ((lv10) yu10Var).b;
            Set setW0 = dm61.w0(new st10[]{new it10(tv10Var, false)});
            if (!z2 && (str2 = ((lv10) yu10Var).a) != null) {
                setW0.add(new nt10(str2));
            }
            return Next.i(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, true, 0, 0, null, false, null, null, false, z2, false, 768063), setW0);
        }
        if (yu10Var instanceof nv10) {
            return Next.i(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1047599), Collections.singleton(new ot10(tv10Var)));
        }
        if (yu10Var instanceof mv10) {
            return Next.i(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1047599), Collections.singleton(new ot10(tv10Var)));
        }
        if (yu10Var instanceof zu10) {
            zu10 zu10Var = (zu10) yu10Var;
            return Next.h(wv10.a(wv10Var, null, null, null, false, null, false, true, zu10Var.a, zu10Var.b, false, false, 0, 0, null, false, null, null, false, false, false, 1047615));
        }
        if (yu10Var instanceof ru10) {
            return Next.h(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1046591));
        }
        if (yu10Var instanceof qu10) {
            return wv10Var.g ? Next.h(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1048127)) : Next.j();
        }
        if (yu10Var instanceof iv10) {
            return Next.a(Collections.singleton(new jt10(tv10Var, ((iv10) yu10Var).a)));
        }
        if (yu10Var instanceof xu10) {
            return Next.a(Collections.singleton(new jt10(tv10Var, ((xu10) yu10Var).a)));
        }
        if (yu10Var instanceof yu10) {
            if (tv10Var instanceof tv10) {
                return Next.j();
            }
            if (tv10Var instanceof sv10) {
                String str4 = yu10Var.a;
                return Next.h(wv10.a(wv10Var, null, null, null, false, new nho0(str4, str4), false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1048559));
            }
            eg.o();
            return null;
        }
        String str5 = "";
        if (yu10Var instanceof pv10) {
            if (nho0Var != null && (str = nho0Var.b) != null && (string = ihc1.e1(str).toString()) != null) {
                str5 = string;
            }
            String str6 = ((pv10) yu10Var).a;
            return Next.i(wv10.a(wv10Var, null, null, null, false, nho0Var != null ? new nho0(str6, nho0Var.b) : null, false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1048111), f46.S0(new st10[]{new qt10(str6), new it10(tv10Var, !u890.j(ihc1.e1(str6).toString(), str5))}));
        }
        if (yu10Var instanceof fv10) {
            if (nho0Var != null) {
                String str7 = nho0Var.b;
                nho0Var2 = new nho0(str7, str7);
            }
            return Next.i(wv10.a(wv10Var, null, null, null, false, nho0Var2, false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1048111), f46.S0(new st10[]{kt10.a, new it10(tv10Var, false)}));
        }
        if (yu10Var instanceof pu10) {
            return Next.i(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1047599), Collections.singleton(new ot10(tv10Var)));
        }
        if (yu10Var instanceof hv10) {
            return Next.h(wv10.a(wv10Var, null, null, null, false, null, true, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1048543));
        }
        if (yu10Var instanceof cv10) {
            return Next.h(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1048543));
        }
        if (yu10Var instanceof su10) {
            if (tv10Var instanceof sv10) {
                return Next.a(Collections.singleton(new et10(((sv10) tv10Var).a)));
            }
            if (tv10Var instanceof tv10) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (yu10Var instanceof dv10) {
            return ((dv10) yu10Var).a ? Next.a(Collections.singleton(new jt10(tv10Var, ""))) : Next.j();
        }
        if (yu10Var instanceof ev10) {
            ev10 ev10Var = (ev10) yu10Var;
            return Next.i(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, false, 0, 0, null, ev10Var.a, null, null, false, false, false, 1032191), Collections.singleton(new it10(tv10Var, ev10Var.a)));
        }
        if (yu10Var instanceof nu10) {
            uv10 uv10Var = ((nu10) yu10Var).a;
            if (tv10Var instanceof tv10) {
                return (uv10Var == null || uv10Var.equals(tv10Var) || !wv10Var.o) ? Next.j() : Next.h(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, true, 0, 0, null, false, null, null, false, false, false, 1046591));
            }
            if (!(tv10Var instanceof sv10)) {
                eg.o();
                return null;
            }
            boolean zJ = u890.j(uv10Var, tv10Var);
            if (uv10Var == null || zJ) {
                return (zJ && nho0Var == null) ? Next.i(wv10.a(wv10Var, null, null, null, false, new nho0(str3, str3), false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1048559), Collections.singleton(new mt10(new dw10(tv10Var, str3, str3)))) : Next.j();
            }
            return Next.h(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1047567));
        }
        if (yu10Var instanceof gv10) {
            String str8 = ((gv10) yu10Var).a;
            return Next.i(wv10.a(wv10Var, null, null, null, false, new nho0(str8, str3), false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 1048559), Collections.singleton(new lt10(tv10Var, str8, str3)));
        }
        if (yu10Var instanceof ov10) {
            ov10 ov10Var = (ov10) yu10Var;
            return Next.a(Collections.singleton(new pt10(ov10Var.a, ov10Var.b)));
        }
        if (yu10Var instanceof uu10) {
            return Next.a(Collections.singleton(new ht10(((uu10) yu10Var).a)));
        }
        if (yu10Var instanceof wu10) {
            return Next.h(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 786431));
        }
        if (yu10Var instanceof av10) {
            return Next.h(wv10.a(wv10Var, null, null, null, false, null, false, false, false, null, false, false, 0, 0, null, false, null, null, false, false, false, 786431));
        }
        if (yu10Var instanceof bv10) {
            return Next.a(Collections.singleton(ft10.a));
        }
        if ((yu10Var instanceof tu10) || (yu10Var instanceof ou10) || (yu10Var instanceof qv10) || (yu10Var instanceof vu10)) {
            return Next.j();
        }
        eg.o();
        return null;
    }

    private final Next i(Object obj, Object obj2) {
        yt30 yt30Var = (au30) obj;
        tt30 tt30Var = (ut30) obj2;
        if (tt30Var instanceof qt30) {
            if (yt30Var instanceof yt30) {
                yt30 yt30Var2 = yt30Var;
                cuu0 cuu0Var = yt30Var2.N0;
                qt30 qt30Var = (qt30) tt30Var;
                yt30 yt30VarN = yt30.n(yt30Var2, 0, (wkt) null, qt30Var.a, qt30Var.b, qt30Var.c, qt30Var.d, qt30Var.e, qt30Var.f, r2p1.l(cuu0Var, qt30Var.g), 127);
                boolean z2 = cuu0Var instanceof auu0;
                cuu0 cuu0Var2 = yt30VarN.N0;
                return Next.i(yt30VarN, z2 != (cuu0Var2 instanceof auu0) ? r2p1.o(cuu0Var2, fu30.a, (on71) null) : w7x.a);
            }
            int iJ = yt30Var.j();
            z771 z771VarH = yt30Var.h();
            ez61 ez61VarA = yt30Var.a();
            wa71 wa71VarK = yt30Var.k();
            wkt wktVarL = yt30Var.l();
            String strG = yt30Var.g();
            String strB = yt30Var.b();
            qt30 qt30Var2 = (qt30) tt30Var;
            String str = qt30Var2.a;
            String str2 = qt30Var2.b;
            String str3 = qt30Var2.c;
            int i2 = qt30Var2.d;
            llw0 llw0Var = qt30Var2.e;
            List list = qt30Var2.f;
            cuu0 cuu0Var3 = qt30Var2.g;
            cuu0 cuu0VarJ = cuu0Var3 != null ? cuu0Var3.j(yt30Var.k().g.getBoolean("playlist.share.is_inviting_contributors", false)) : null;
            return Next.i(new yt30(iJ, z771VarH, ez61VarA, wa71VarK, wktVarL, strG, strB, str, str2, str3, i2, llw0Var, list, cuu0VarJ), r2p1.o(cuu0VarJ, gu30.a, (on71) null));
        }
        if (tt30Var instanceof tt30) {
            if (yt30Var instanceof zt30) {
                return Next.h(zt30.n((zt30) yt30Var, 0, tt30Var.a, 111));
            }
            if (yt30Var instanceof wt30) {
                return Next.h(wt30.n((wt30) yt30Var, 0, tt30Var.a, 111));
            }
            if (yt30Var instanceof yt30) {
                return Next.h(yt30.n(yt30Var, 0, tt30Var.a, (String) null, (String) null, (String) null, 0, (llw0) null, (List) null, (cuu0) null, 16367));
            }
            eg.o();
            return null;
        }
        if (tt30Var instanceof rt30) {
            if (!(yt30Var instanceof yt30)) {
                return Next.j();
            }
            yt30 yt30Var3 = yt30Var;
            rt30 rt30Var = (rt30) tt30Var;
            return Next.i(yt30.n(yt30Var3, 0, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (List) null, (cuu0) null, 16367), Collections.singleton(new nt30(yt30Var3, rt30Var.a, rt30Var.b)));
        }
        if (tt30Var instanceof ot30) {
            if (!(yt30Var instanceof yt30)) {
                return Next.j();
            }
            yt30 yt30Var4 = yt30Var;
            cuu0 cuu0Var4 = yt30Var4.N0;
            return Next.h(yt30.n(yt30Var4, 0, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (List) null, cuu0Var4 != null ? cuu0Var4.j(((ot30) tt30Var).a) : null, 8191));
        }
        if (tt30Var instanceof pt30) {
            return yt30Var instanceof yt30 ? Next.j() : Next.h(new wt30(yt30Var.j(), yt30Var.h(), yt30Var.a(), yt30Var.k(), (wkt) null, yt30Var.g(), yt30Var.b()));
        }
        if (tt30Var instanceof st30) {
            return Next.h(new zt30(yt30Var.j(), yt30Var.h(), yt30Var.a(), yt30Var.k(), null, yt30Var.g(), yt30Var.b()));
        }
        eg.o();
        return null;
    }

    private final Next j(Object obj, Object obj2) {
        ou80 ou80Var;
        zd40 zd40Var = (zd40) obj;
        tq80 tq80Var = (tq80) obj2;
        String str = zd40Var.b;
        xd40 xd40Var = (xd40) tq80Var.a;
        String str2 = null;
        if (!(xd40Var instanceof ud40)) {
            if (xd40Var instanceof wd40) {
                return Next.h(zd40.a(zd40Var, false, null, null, false, 14));
            }
            if (xd40Var instanceof vd40) {
                return Next.i(zd40.a(zd40Var, false, null, null, false, 14), Collections.singleton(new rd40(((vd40) xd40Var).a)));
            }
            if (xd40Var instanceof td40) {
                return Next.h(zd40.a(zd40Var, false, null, null, ((td40) xd40Var).a, 7));
            }
            eg.o();
            return null;
        }
        if (zd40Var.d) {
            return Next.a(Collections.singleton(sd40.a));
        }
        if (str == null || str.length() == 0) {
            return Next.h(zd40Var);
        }
        tqw tqwVar = tq80Var.b;
        if (tqwVar != null && (ou80Var = n3o1.y(tqwVar).a) != null) {
            str2 = ou80Var.a;
        }
        return Next.i(zd40.a(zd40Var, true, null, null, false, 14), Collections.singleton(new qd40(str, str2)));
    }

    private final Next k(Object obj, Object obj2) {
        nl50 nl50Var = (nl50) obj;
        tq80 tq80Var = (tq80) obj2;
        bl50 bl50Var = (dl50) tq80Var.a;
        if (bl50Var instanceof cl50) {
            mmr0 mmr0VarQ = lm5.q(nl50Var, new kl50(nl50Var.U(), nl50Var.i1(), null, null, ((cl50) bl50Var).a));
            return Next.i((nl50) mmr0VarQ.a, (Set) mmr0VarQ.b);
        }
        boolean z2 = false;
        if (bl50Var instanceof bl50) {
            Logger.d(l1d.m("GroupFeedActivityCarouselItem: metadata load failed: ", bl50Var.a.getMessage()), new Object[0]);
            mmr0 mmr0VarQ2 = lm5.q(nl50Var, new ll50(nl50Var.U(), nl50Var.i1()));
            return Next.i((nl50) mmr0VarQ2.a, (Set) mmr0VarQ2.b);
        }
        if (bl50Var instanceof al50) {
            if (!(nl50Var instanceof kl50)) {
                return Next.j();
            }
            al50 al50Var = (al50) bl50Var;
            return Next.h(kl50.a((kl50) nl50Var, null, null, al50Var.a, al50Var.b, 7));
        }
        Long lA = null;
        if (!(bl50Var instanceof zk50)) {
            eg.o();
            return null;
        }
        tqw tqwVar = tq80Var.b;
        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        kl50 kl50Var = nl50Var instanceof kl50 ? (kl50) nl50Var : null;
        if (kl50Var != null) {
            Iterator it = kl50Var.c.iterator();
            Object obj3 = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z2) {
                        break;
                    }
                    break;
                }
                Object next = it.next();
                if (((jl50) next).e != null) {
                    if (!z2) {
                        z2 = true;
                        obj3 = next;
                    }
                }
                obj3 = null;
                break;
            }
            jl50 jl50Var = (jl50) obj3;
            if (jl50Var != null) {
                yk50 yk50Var = jl50Var.e;
                if (yk50Var != null) {
                    String str = jl50Var.a;
                    String str2 = yk50Var.a;
                    String str3 = yk50Var.b;
                    hl50 hl50Var = yk50Var.c;
                    boolean z3 = hl50Var instanceof gl50;
                    fl50 fl50Var = hl50Var instanceof fl50 ? (fl50) hl50Var : null;
                    lA = Next.a(Collections.singleton(new ddw(fl50Var != null ? fl50Var.a : null, str, str2, str3, ((kl50) nl50Var).b, tv80VarY, z3)));
                }
                if (lA != null) {
                    return lA;
                }
            }
        }
        return Next.a(Collections.singleton(new bdw(nl50Var.i1(), tv80VarY)));
    }

    private final Next l(Object obj, Object obj2) {
        ou80 ou80Var;
        cm50 cm50Var = (cm50) obj;
        tq80 tq80Var = (tq80) obj2;
        tqw tqwVar = tq80Var.b;
        String str = (tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null) ? null : ou80Var.a;
        am50 am50Var = (am50) tq80Var.a;
        if (am50Var instanceof wl50) {
            return Next.i(cm50.a(cm50Var, true), Collections.singleton(new vl50(cm50Var.e, cm50Var.a, cm50Var.c, cm50Var.b, str)));
        }
        if (am50Var instanceof yl50) {
            return Next.h(cm50.a(cm50Var, false));
        }
        if (am50Var instanceof zl50) {
            return Next.h(cm50.a(cm50Var, false));
        }
        if (am50Var instanceof xl50) {
            return Next.h(cm50.a(cm50Var, false));
        }
        eg.o();
        return null;
    }

    private final Next m(Object obj, Object obj2) {
        r070 r070Var = (r070) obj;
        j070 j070Var = (q070) obj2;
        boolean z2 = r070Var.c;
        f070 f070Var = r070Var.a;
        if (j070Var instanceof m070) {
            return buo1.t(r070.a(r070Var, 0, 13), dm61.w0(new oz60[]{hz60.a, new cz60(f070Var.a.a)}));
        }
        if (j070Var instanceof o070) {
            tr80 tr80Var = new tr80(50, 100, 1);
            tr80 tr80VarQ = yoi1.Q(0, 50);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = ((o070) j070Var).a;
            r070 r070VarA = r070.a(r070Var, i2, 7);
            if (z2) {
                int i3 = ((rr80) tr80VarQ).a;
                int i4 = ((rr80) tr80VarQ).b;
                int i5 = r070Var.d;
                int i6 = ((rr80) tr80Var).b;
                if (i3 <= i5 && i5 <= i4 && 50 <= i2 && i2 <= i6) {
                    linkedHashSet.add(new mz60(f070Var.a.a));
                } else if (50 <= i5 && i5 <= i6 && i3 <= i2 && i2 <= i4) {
                    linkedHashSet.add(new nz60(f070Var.a.a));
                }
            }
            return buo1.t(r070VarA, linkedHashSet);
        }
        if (j070Var instanceof n070) {
            if (z2) {
                return Next.j();
            }
            ji0 ji0Var = f070Var.a;
            return Next.a(f46.S0(new oz60[]{new kz60(ji0Var), new ez60(ji0Var, w7x.a)}));
        }
        if (j070Var instanceof i070) {
            ji0 ji0Var2 = f070Var.a;
            String str = ji0Var2.c;
            i070 i070Var = (i070) j070Var;
            String str2 = i070Var.a;
            return Next.a(Effects.a(new oz60[]{new fz60(new az60(ji0Var2, str, str2)), new gz60(ji0Var2, ji0Var2.i, str2, 1, 0, i070Var.b, i070Var.c, i070Var.d, i070Var.e)}));
        }
        if (!(j070Var instanceof k070)) {
            if (j070Var instanceof p070) {
                p070 p070Var = (p070) j070Var;
                return Next.a(Collections.singleton(new jz60(f070Var.a, "html_ad_safe_browsing_hit", ab80.n("Safe browsing threat detected: type=", ", url=", p070Var.b, p070Var.a), (String) null)));
            }
            if (j070Var instanceof j070) {
                return Next.a(Collections.singleton(new jz60(f070Var.a, "html_ad_csp_violation", j070Var.a, (String) null)));
            }
            if (!(j070Var instanceof l070)) {
                eg.o();
                return null;
            }
            ji0 ji0Var3 = f070Var.a;
            l070 l070Var = (l070) j070Var;
            String str3 = l070Var.a;
            return Next.a(f46.S0(new oz60[]{new jz60(ji0Var3, "html_ad_navigation_blocked", "Navigation without user gesture", str3), new gz60(ji0Var3, ji0Var3.i, str3, 2, l070Var.b, l070Var.c, l070Var.d, l070Var.e, l070Var.f)}));
        }
        xx10 xx10Var = ((k070) j070Var).a;
        if ((xx10Var instanceof sx10) || (xx10Var instanceof vx10) || (xx10Var instanceof wx10)) {
            Set setW0 = dm61.w0(new co0[]{co0.g});
            if (z2) {
                setW0.add(co0.f1);
            }
            return Next.a(Collections.singleton(new ez60(f070Var.a, setW0)));
        }
        if ((xx10Var instanceof tx10) || (xx10Var instanceof ux10) || (xx10Var instanceof rx10)) {
            return Next.j();
        }
        eg.o();
        return null;
    }

    private final Next n(Object obj, Object obj2) {
        bn80 bn80Var = (bn80) obj;
        tq80 tq80Var = (tq80) obj2;
        bn80Var.getClass();
        an80 an80Var = (an80) tq80Var.a;
        tqw tqwVar = tq80Var.b;
        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        Set set = bn80Var.g;
        List list = bn80Var.h;
        if (an80Var instanceof wm80) {
            wm80 wm80Var = (wm80) an80Var;
            List listT = n8p1.t(bn80Var.c, wm80Var.a, bn80Var.b);
            List listK0 = o7h.k0(listT, 1);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listK0.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((pl80) it.next()).a);
            }
            pl80 pl80Var = (pl80) o7h.s0(list);
            return Next.h(bn80.a(bn80Var, null, null, null, wm80Var.a, false, false, o7h.v0(dm61.y0(set, p7h.N(pl80Var != null ? pl80Var.a : null)), linkedHashSet), listT, 7));
        }
        if (an80Var.equals(vm80.a)) {
            z6x z6xVar = z6x.a;
            return Next.h(bn80.a(bn80Var, null, null, null, z6xVar, false, true, null, z6xVar, 71));
        }
        if (an80Var.equals(ym80.a)) {
            return Next.i(bn80.a(bn80Var, null, null, null, null, true, false, null, null, 207), Collections.singleton(new jm80(bn80Var.a)));
        }
        if (an80Var instanceof um80) {
            return Next.a(Collections.singleton(new km80(((um80) an80Var).a, tv80VarY)));
        }
        if (an80Var instanceof xm80) {
            return Next.j();
        }
        if (!(an80Var instanceof zm80)) {
            eg.o();
            return null;
        }
        String str = ((zm80) an80Var).a;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (u890.j(((pl80) it2.next()).a, str)) {
                    if (u890.j(((pl80) o7h.q0(list)).a, str)) {
                        return Next.j();
                    }
                    return set.contains(str) ? Next.h(bn80.a(bn80Var, null, null, null, null, false, false, dm61.u0(str, set), null, 191)) : Next.h(bn80.a(bn80Var, null, null, null, null, false, false, dm61.x0(str, set), null, 191));
                }
            }
        }
        return Next.j();
    }

    public final Next a(Object obj, Object obj2) {
        vy30 vy30Var;
        uhj0 uhj0VarA;
        boolean z2 = false;
        tv80 tv80Var = null;
        switch (this.a) {
            case 0:
                s2m s2mVar = (s2m) obj;
                s2mVar.getClass();
                r2m r2mVar = (r2m) ((tq80) obj2).a;
                String str = s2mVar.b;
                boolean z3 = r2mVar instanceof k2m;
                fg91 fg91Var = fg91.b;
                if (z3) {
                    String string = ihc1.e1(((k2m) r2mVar).a).toString();
                    return string.length() == 0 ? Next.h(s2m.a(s2mVar, "", fg91Var, null, null, null, null, false, null, 377)) : Next.i(s2m.a(s2mVar, string, null, null, null, null, null, true, null, 381), Effects.a(new a2m[]{new a2m(string, s2mVar.g)}));
                }
                if (r2mVar instanceof l2m) {
                    return Next.h(s2m.a(s2mVar, "", fg91Var, null, null, null, null, false, null, 1017));
                }
                if (r2mVar instanceof q2m) {
                    return Next.h(s2m.a(s2mVar, null, ((q2m) r2mVar).a, null, null, null, null, false, null, 891));
                }
                if (r2mVar instanceof o2m) {
                    return Next.h(s2m.a(s2mVar, null, null, ((o2m) r2mVar).a, null, null, null, false, null, 759));
                }
                if (r2mVar instanceof i2m) {
                    if (str.length() <= 0) {
                        return Next.h(s2m.a(s2mVar, null, null, null, null, null, ((i2m) r2mVar).a, false, null, 447));
                    }
                    k620 k620Var = ((i2m) r2mVar).a;
                    return Next.i(s2m.a(s2mVar, null, null, null, null, null, k620Var, true, null, 319), Effects.a(new a2m[]{new a2m(str, k620Var)}));
                }
                if (r2mVar instanceof g2m) {
                    hby hbyVar = ((g2m) r2mVar).a;
                    return Next.a(Effects.a(new c2m[]{new b2m(hbyVar), new z1m(hbyVar)}));
                }
                if (r2mVar instanceof n2m) {
                    return Next.h(s2m.a(s2mVar, null, null, null, ((n2m) r2mVar).a, null, null, false, null, 1007));
                }
                if (r2mVar instanceof h2m) {
                    return Next.a(Effects.a(new v1m[]{v1m.a}));
                }
                if (r2mVar instanceof p2m) {
                    String message = ((p2m) r2mVar).a.getMessage();
                    return Next.h(s2m.a(s2mVar, null, null, null, null, null, null, false, new e2m(message != null ? message : ""), 383));
                }
                if (r2mVar instanceof m2m) {
                    String message2 = ((m2m) r2mVar).a.getMessage();
                    return Next.h(s2m.a(s2mVar, null, null, null, null, null, null, false, new d2m(message2 != null ? message2 : ""), 511));
                }
                if (r2mVar instanceof j2m) {
                    return Next.h(s2m.a(s2mVar, null, null, null, null, ((j2m) r2mVar).a, null, false, null, 991));
                }
                eg.o();
                return null;
            case 1:
                m7m m7mVar = (m7m) obj;
                d7m d7mVar = (g7m) ((tq80) obj2).a;
                if (d7mVar instanceof d7m) {
                    c380 c380Var = d7mVar.a;
                    if (c380Var.isEmpty()) {
                        return Next.h(m7m.a(m7mVar, null, new h7m(), 1));
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c380Var.iterator();
                    while (it.hasNext()) {
                        r7h.W(((l7c1) it.next()).c, arrayList);
                    }
                    Set setP1 = o7h.p1(arrayList);
                    return Next.i(m7m.a(m7mVar, null, new i7m(c380Var), 1), setP1.isEmpty() ? w7x.a : Collections.singleton(new w6m(setP1)));
                }
                if (u890.j(d7mVar, y6m.a)) {
                    return Next.h(m7m.a(m7mVar, null, new h7m(), 1));
                }
                if (u890.j(d7mVar, b7m.a)) {
                    return Next.i(m7m.a(m7mVar, null, j7m.a, 1), Collections.singleton(new x6m(m7mVar.a)));
                }
                if (u890.j(d7mVar, z6m.a)) {
                    return Next.j();
                }
                if (u890.j(d7mVar, a7m.a)) {
                    return Next.j();
                }
                if (u890.j(d7mVar, e7m.a)) {
                    return Next.j();
                }
                if (u890.j(d7mVar, f7m.a)) {
                    return Next.j();
                }
                if (u890.j(d7mVar, c7m.a)) {
                    return Next.j();
                }
                eg.o();
                return null;
            case 2:
                boh0 boh0Var = (boh0) obj;
                wnh0 wnh0Var = (wnh0) obj2;
                List list = boh0Var.a;
                tv80 tv80Var2 = boh0Var.b;
                if (wnh0Var instanceof snh0) {
                    return Next.h(boh0.a(boh0Var, new ynh0(((snh0) wnh0Var).a)));
                }
                if (wnh0Var instanceof qnh0) {
                    return Next.h(boh0.a(boh0Var, new xnh0(list)));
                }
                boolean z4 = wnh0Var instanceof rnh0;
                nnh0 nnh0Var = nnh0.a;
                if (z4) {
                    return Next.a(Collections.singleton(nnh0Var));
                }
                if (wnh0Var instanceof pnh0) {
                    if (tv80Var2 instanceof ynh0) {
                        return Next.h(boh0.a(boh0Var, new xnh0(list)));
                    }
                    if ((tv80Var2 instanceof xnh0) || (tv80Var2 instanceof znh0)) {
                        return Next.a(Collections.singleton(nnh0Var));
                    }
                    eg.o();
                    return null;
                }
                if (wnh0Var instanceof tnh0) {
                    if (tv80Var2 instanceof ynh0) {
                        vy30Var = ((ynh0) tv80Var2).a;
                    } else {
                        if (!(tv80Var2 instanceof znh0)) {
                            if (tv80Var2 instanceof xnh0) {
                                return Next.j();
                            }
                            eg.o();
                            return null;
                        }
                        vy30Var = ((znh0) tv80Var2).a;
                    }
                    return Next.a(Collections.singleton(new onh0(vy30Var.b, vy30Var.c, vy30Var.d, vy30Var.a)));
                }
                if (wnh0Var instanceof unh0) {
                    tv80Var = tv80Var2 instanceof ynh0 ? (ynh0) tv80Var2 : null;
                    if (tv80Var == null) {
                        return Next.j();
                    }
                    int iIndexOf = list.indexOf(tv80Var.a);
                    return (iIndexOf < 0 || iIndexOf >= list.size() - 1) ? Next.j() : Next.h(boh0.a(boh0Var, new ynh0((vy30) list.get(iIndexOf + 1))));
                }
                if (!(wnh0Var instanceof vnh0)) {
                    eg.o();
                    return null;
                }
                tv80Var = tv80Var2 instanceof ynh0 ? (ynh0) tv80Var2 : null;
                if (tv80Var == null) {
                    return Next.j();
                }
                int iIndexOf2 = list.indexOf(tv80Var.a);
                return iIndexOf2 <= 0 ? Next.j() : Next.h(boh0.a(boh0Var, new ynh0((vy30) list.get(iIndexOf2 - 1))));
            case 3:
                bln blnVar = (bln) obj;
                tq80 tq80Var = (tq80) obj2;
                blnVar.getClass();
                tq80Var.getClass();
                if (!(blnVar instanceof zkn)) {
                    return Next.j();
                }
                ukn uknVar = (xkn) tq80Var.a;
                if (u890.j(uknVar, tkn.a)) {
                    zkn zknVar = (zkn) blnVar;
                    return Next.i(zkn.d(zknVar, null, null, null, null, 1, null, false, false, 1919), Effects.a(new okn[]{new mkn(zknVar.c.getUri())}));
                }
                if (uknVar instanceof skn) {
                    zkn zknVar2 = (zkn) blnVar;
                    skn sknVar = (skn) uknVar;
                    ArrayList arrayList2 = new ArrayList();
                    for (d6q0 d6q0Var : sknVar.c) {
                        if (d6q0Var instanceof h6q0) {
                            arrayList2.add(((h6q0) d6q0Var).a.a);
                        } else if (d6q0Var instanceof d6q0) {
                            Iterator it2 = d6q0Var.a.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((w4i1) it2.next()).a);
                            }
                        }
                    }
                    Map map = zknVar2.g;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (arrayList2.contains((String) entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    return Next.h(zkn.d(zknVar2, sknVar.c, sknVar.a, sknVar.b, linkedHashMap, 2, sknVar.d, sknVar.e, false, 1037));
                }
                if (u890.j(uknVar, rkn.a)) {
                    return Next.h(zkn.d((zkn) blnVar, null, null, null, null, 3, null, false, false, 1919));
                }
                if (uknVar instanceof pkn) {
                    return Next.a(Effects.a(new nkn[]{nkn.a}));
                }
                if (uknVar instanceof qkn) {
                    zkn zknVar3 = (zkn) blnVar;
                    qkn qknVar = (qkn) uknVar;
                    tqw tqwVar = tq80Var.b;
                    return zknVar3.k ? Next.j() : Next.i(zkn.d(zknVar3, null, null, null, null, 0, null, false, true, 1023), Effects.a(new lkn[]{new lkn(qknVar.a, pcf.k(zknVar3.c(), o7h.l1(zknVar3.a().keySet()), zknVar3.b()), tqwVar != null ? n3o1.y(tqwVar) : null, zknVar3.c, o7h.l1(zknVar3.g.values()))}));
                }
                if (u890.j(uknVar, vkn.a)) {
                    return Next.h(zkn.d((zkn) blnVar, null, null, null, null, 0, null, false, false, 1023));
                }
                if (uknVar instanceof ukn) {
                    zkn zknVar4 = (zkn) blnVar;
                    return Next.h(zkn.d(zknVar4, null, null, null, sqg0.K(uknVar.b.a, zknVar4.g), 0, null, false, false, 1983));
                }
                if (!(uknVar instanceof wkn)) {
                    eg.o();
                    return null;
                }
                zkn zknVar5 = (zkn) blnVar;
                wkn wknVar = (wkn) uknVar;
                boolean z5 = wknVar.c;
                w4i1 w4i1Var = wknVar.b;
                Map map2 = zknVar5.g;
                return Next.h(zkn.d(zknVar5, null, null, null, z5 ? sqg0.P(map2, new mmr0(w4i1Var.a, w4i1Var)) : sqg0.K(w4i1Var.a, map2), 0, null, false, false, 1983));
            case 4:
                mio mioVar = (mio) obj2;
                if (mioVar != null) {
                    return Next.h(new jko(mioVar.a));
                }
                eg.o();
                return null;
            case 5:
                jfj0 jfj0Var = (jfj0) obj;
                gfj0 gfj0Var = (hfj0) obj2;
                if (gfj0Var instanceof cfj0) {
                    if (!jfj0Var.c) {
                        return Next.j();
                    }
                    MessageResponseToken messageResponseToken = jfj0Var.a;
                    return messageResponseToken == null ? Next.j() : Next.a(Collections.singleton(new yej0(messageResponseToken)));
                }
                if (gfj0Var instanceof dfj0) {
                    jfj0Var.getClass();
                    return Next.h(jfj0.a(jfj0Var, null, false, null, 11));
                }
                if (gfj0Var instanceof gfj0) {
                    jfj0Var.getClass();
                    return Next.h(jfj0.a(jfj0Var, null, false, gfj0Var.a, 7));
                }
                if (gfj0Var instanceof efj0) {
                    MessageResponseToken messageResponseToken2 = jfj0Var.a;
                    return messageResponseToken2 == null ? Next.j() : Next.a(Collections.singleton(new zej0(messageResponseToken2)));
                }
                if (gfj0Var instanceof ffj0) {
                    MessageResponseToken messageResponseToken3 = jfj0Var.a;
                    return messageResponseToken3 == null ? Next.j() : Next.a(Collections.singleton(new afj0(messageResponseToken3)));
                }
                eg.o();
                return null;
            case 6:
                uhj0 uhj0Var = (uhj0) obj;
                lhj0 lhj0Var = (lhj0) ((tq80) obj2).a;
                uhj0Var.getClass();
                MessageResponseToken messageResponseToken4 = uhj0Var.a;
                if (lhj0Var instanceof chj0) {
                    if (messageResponseToken4 != null) {
                        return Next.a(Collections.singleton(new wgj0(messageResponseToken4, DismissReason.WebViewCloseBarButtonItemTapped.INSTANCE)));
                    }
                    eg.m("Required value was null.");
                    return null;
                }
                if (lhj0Var instanceof ahj0) {
                    if (messageResponseToken4 != null) {
                        return Next.a(Collections.singleton(new wgj0(messageResponseToken4, DismissReason.BackButtonTapped.INSTANCE)));
                    }
                    eg.m("Required value was null.");
                    return null;
                }
                if (lhj0Var instanceof jhj0) {
                    if (messageResponseToken4 != null) {
                        return Next.a(Collections.singleton(new wgj0(messageResponseToken4, new DismissReason.WebViewMessageNavigatedToCloseUrl(((jhj0) lhj0Var).a))));
                    }
                    eg.m("Required value was null.");
                    return null;
                }
                if (lhj0Var instanceof ihj0) {
                    return Next.h(uhj0.a(uhj0Var, (MessageResponseToken) null, (iwq) null, (String) null, false, false, (yhj0) null, false, qhj0.a, (Bundle) null, 383));
                }
                if (lhj0Var instanceof ehj0) {
                    return Next.h(uhj0.a(uhj0Var, (MessageResponseToken) null, (iwq) null, (String) null, false, false, (yhj0) null, false, phj0.a, (Bundle) null, 383));
                }
                if (lhj0Var instanceof dhj0) {
                    if (uhj0Var.e) {
                        uhj0VarA = uhj0.a(uhj0Var, (MessageResponseToken) null, (iwq) null, (String) null, false, false, (yhj0) null, false, (shj0) null, (Bundle) null, 487);
                    } else {
                        shj0 shj0Var = uhj0Var.h;
                        shj0Var.getClass();
                        uhj0VarA = uhj0.a(uhj0Var, (MessageResponseToken) null, (iwq) null, ((dhj0) lhj0Var).a, false, false, (yhj0) null, false, zhj0.a.contains(shj0Var) ? nhj0.a : mhj0.a, (Bundle) null, 371);
                    }
                    return Next.i(uhj0VarA, Collections.singleton(vgj0.c));
                }
                boolean z6 = lhj0Var instanceof hhj0;
                rhj0 rhj0Var = rhj0.a;
                if (z6) {
                    hhj0 hhj0Var = (hhj0) lhj0Var;
                    return Next.h(uhj0.a(uhj0Var, (MessageResponseToken) null, (iwq) null, (String) null, false, false, new vhj0(hhj0Var.a), hhj0Var.b, rhj0Var, (Bundle) null, 287));
                }
                if (lhj0Var instanceof bhj0) {
                    if (messageResponseToken4 != null) {
                        return Next.a(Collections.singleton(new wgj0(messageResponseToken4, DismissReason.ProgrammaticDismissal.INSTANCE)));
                    }
                    eg.m("Required value was null.");
                    return null;
                }
                if (!(lhj0Var instanceof ghj0)) {
                    if (lhj0Var instanceof fhj0) {
                        return Next.h(uhj0.a(uhj0Var, (MessageResponseToken) null, (iwq) null, (String) null, false, true, (yhj0) null, false, rhj0Var, (Bundle) null, 367));
                    }
                    if (lhj0Var instanceof khj0) {
                        return Next.h(uhj0.a(uhj0Var, (MessageResponseToken) null, (iwq) null, (String) null, false, false, (yhj0) null, false, (shj0) null, (Bundle) null, 255));
                    }
                    eg.o();
                    return null;
                }
                uhj0 uhj0VarA2 = uhj0.a(uhj0Var, (MessageResponseToken) null, (iwq) null, (String) null, true, false, xhj0.a, false, rhj0Var, (Bundle) null, 343);
                iwq iwqVar = uhj0Var.b;
                String str2 = iwqVar != null ? iwqVar.a : null;
                if (str2 != null) {
                    return Next.i(uhj0VarA2, f46.S0(new nyo1[]{new ygj0(str2), zgj0.c}));
                }
                eg.m("Required value was null.");
                return null;
            case 7:
                d8t d8tVar = (d8t) obj;
                c8t c8tVar = (c8t) obj2;
                boolean z7 = d8tVar.d;
                boolean z8 = c8tVar instanceof z7t;
                k7t k7tVar = k7t.c;
                if (z8) {
                    return Next.a(Collections.singleton(k7tVar));
                }
                if (c8tVar instanceof b8t) {
                    return z7 ? Next.j() : Next.i(d8t.a(d8tVar, true), Collections.singleton(new l7t(d8tVar.a)));
                }
                if (c8tVar instanceof a8t) {
                    return z7 ? Next.j() : Next.a(Collections.singleton(k7tVar));
                }
                if (c8tVar instanceof x7t) {
                    return Next.i(d8t.a(d8tVar, false), f46.S0(new cbp1[]{o7t.c, m7t.c}));
                }
                if (c8tVar instanceof y7t) {
                    return Next.i(d8t.a(d8tVar, false), Collections.singleton(n7t.c));
                }
                eg.o();
                return null;
            case 8:
                hcu hcuVar = (hcu) obj;
                zbu zbuVar = (dcu) obj2;
                long j2 = hcuVar.b;
                boolean z9 = hcuVar.d;
                Map map3 = hcuVar.e;
                gcu gcuVar = hcuVar.c;
                if (zbuVar instanceof acu) {
                    boolean z10 = ((acu) zbuVar).a;
                    return z10 == z9 ? Next.j() : Next.h(hcu.a(hcuVar, null, z10, null, 23));
                }
                if (zbuVar instanceof ccu) {
                    ccu ccuVar = (ccu) zbuVar;
                    String str3 = ccuVar.a;
                    if (!z9) {
                        return Next.j();
                    }
                    long j3 = ccuVar.b;
                    Long l2 = (Long) map3.get(str3);
                    if (l2 != null && l2.longValue() == j3) {
                        return Next.j();
                    }
                    Map mapP = sqg0.P(map3, new mmr0(str3, Long.valueOf(j3)));
                    xj61 xj61Var = new xj61();
                    xj61Var.add(new nbu(mapP.keySet()));
                    if (map3.isEmpty()) {
                        xj61Var.add(new pbu(j2));
                    }
                    return Next.i(hcu.a(hcuVar, null, false, mapP, 15), cwl1.j(xj61Var));
                }
                if (zbuVar instanceof zbu) {
                    zbu zbuVar2 = zbuVar;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : map3.entrySet()) {
                        if (zbuVar2.a - ((Number) entry2.getValue()).longValue() < hcuVar.a) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    if (linkedHashMap2.size() == map3.size()) {
                        return !linkedHashMap2.isEmpty() ? Next.a(Collections.singleton(new pbu(j2))) : Next.j();
                    }
                    xj61 xj61Var2 = new xj61();
                    xj61Var2.add(new nbu(linkedHashMap2.keySet()));
                    if (!linkedHashMap2.isEmpty()) {
                        xj61Var2.add(new pbu(j2));
                    }
                    return Next.i(hcu.a(hcuVar, null, false, linkedHashMap2, 15), cwl1.j(xj61Var2));
                }
                boolean z11 = zbuVar instanceof ybu;
                qbu qbuVar = qbu.a;
                qbu qbuVar2 = obu.a;
                if (z11) {
                    boolean z12 = ((ybu) zbuVar).a;
                    if (z12 == gcuVar.a) {
                        return Next.j();
                    }
                    gcu gcuVarA = gcu.a(gcuVar, z12, false, 14);
                    hcu hcuVarA = hcu.a(hcuVar, gcuVarA, false, null, 27);
                    if (s110.i(gcuVarA) == s110.i(gcuVar)) {
                        return Next.h(hcuVarA);
                    }
                    if (s110.i(gcuVarA)) {
                        qbuVar = qbuVar2;
                    }
                    return Next.i(hcuVarA, Collections.singleton(qbuVar));
                }
                if (!(zbuVar instanceof bcu)) {
                    eg.o();
                    return null;
                }
                boolean z13 = ((bcu) zbuVar).a;
                if (z13 == gcuVar.b) {
                    return Next.j();
                }
                gcu gcuVarA2 = gcu.a(gcuVar, false, z13, 13);
                hcu hcuVarA2 = hcu.a(hcuVar, gcuVarA2, false, null, 27);
                if (s110.i(gcuVarA2) == s110.i(gcuVar)) {
                    return Next.h(hcuVarA2);
                }
                if (s110.i(gcuVarA2)) {
                    qbuVar = qbuVar2;
                }
                return Next.i(hcuVarA2, Collections.singleton(qbuVar));
            case 9:
                knv knvVar = (knv) obj;
                tq80 tq80Var2 = (tq80) obj2;
                tv80 tv80Var3 = knvVar.c;
                tv80 tv80Var4 = knvVar.d;
                String str4 = knvVar.a;
                String str5 = knvVar.b;
                jnv jnvVar = knvVar.g;
                vmv vmvVar = (ymv) tq80Var2.a;
                if (vmvVar instanceof qmv) {
                    String str6 = ((qmv) vmvVar).a;
                    if (jnvVar instanceof gnv) {
                        jnvVar = hnv.a;
                    }
                    return Next.h(knv.a(knvVar, str6, null, false, jnvVar, 61));
                }
                if (vmvVar instanceof xmv) {
                    return Next.h(knv.a(knvVar, null, ((xmv) vmvVar).a, false, null, 119));
                }
                if (vmvVar instanceof umv) {
                    if (jnvVar instanceof inv) {
                        return Next.j();
                    }
                    knv knvVarA = knv.a(knvVar, null, null, false, inv.a, 63);
                    if (u890.j(str5, str4)) {
                        str5 = null;
                    }
                    if (tv80Var4 != tv80Var3 && knvVar.e.size() > 1) {
                        tv80Var = tv80Var4;
                    }
                    return Next.i(knvVarA, Collections.singleton(new omv(str5, tv80Var)));
                }
                boolean z14 = vmvVar instanceof wmv;
                mmv mmvVar = mmv.a;
                if (z14) {
                    return Next.a(Collections.singleton(mmvVar));
                }
                if (vmvVar instanceof vmv) {
                    return Next.h(knv.a(knvVar, null, null, false, new gnv(vmvVar.a), 63));
                }
                if (vmvVar instanceof tmv) {
                    tqw tqwVar2 = tq80Var2.b;
                    return Next.a(Collections.singleton(new nmv(tqwVar2 != null ? n3o1.y(tqwVar2) : null)));
                }
                if (vmvVar instanceof pmv) {
                    return (u890.j(str5, str4) && tv80Var4 == tv80Var3) ? Next.a(Collections.singleton(mmvVar)) : Next.h(knv.a(knvVar, null, null, true, null, 95));
                }
                if (vmvVar instanceof rmv) {
                    return Next.a(Collections.singleton(mmvVar));
                }
                if (vmvVar instanceof smv) {
                    return Next.h(knv.a(knvVar, null, null, false, null, 95));
                }
                eg.o();
                return null;
            case 10:
                return b((dny) obj, (xfy) obj2);
            case 11:
                loy loyVar = (loy) obj;
                tq80 tq80Var3 = (tq80) obj2;
                o3r o3rVar = zoy.a;
                joy joyVar = (joy) tq80Var3.a;
                if (!(joyVar instanceof hoy)) {
                    if (joyVar instanceof ioy) {
                        ioy ioyVar = (ioy) joyVar;
                        return !u890.j(ioyVar.a, loyVar.a) ? Next.j() : Next.h(loy.a(loyVar, ioyVar.b, ioyVar.c, ioyVar.d, ioyVar.e, ioyVar.f, ioyVar.g, ioyVar.h, ioyVar.i, ioyVar.j, (String) null, 6147));
                    }
                    eg.o();
                    return null;
                }
                int iC = l1d.C(loyVar.b);
                if (iC != 0) {
                    if (iC == 1) {
                        tqw tqwVar3 = tq80Var3.b;
                        tv80 tv80VarY = tqwVar3 != null ? n3o1.y(tqwVar3) : null;
                        return tv80VarY != null ? Next.a(Collections.singleton(new boy(loyVar.a, loyVar.j, loyVar.h, loyVar.i, tv80VarY))) : Next.j();
                    }
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                }
                return Next.a(Collections.singleton(new zny(joyVar)));
            case 12:
                cot0 cot0Var = (cot0) obj;
                ljt0 ljt0Var = (ljt0) obj2;
                if (ljt0Var instanceof bjt0) {
                    return Next.a(Collections.singleton(new fht0(((bjt0) ljt0Var).a)));
                }
                if (ljt0Var instanceof djt0) {
                    p1p1 p1p1Var = cot0Var.c;
                    yqt0 yqt0Var = yqt0.c;
                    if (p1p1Var.equals(yqt0Var)) {
                        return Next.j();
                    }
                    cot0 cot0VarA = cot0.a(cot0Var, null, 0L, yqt0Var, 27);
                    r4z r4zVar = cot0Var.a;
                    return Next.i(cot0VarA, Collections.singleton(new ght0(r4zVar.c, r4zVar.i, ((djt0) ljt0Var).a)));
                }
                if (ljt0Var instanceof cjt0) {
                    r4z r4zVar2 = cot0Var.a;
                    cjt0 cjt0Var = (cjt0) ljt0Var;
                    return Next.a(Collections.singleton(new iht0(r4zVar2.c, r4zVar2.i, cjt0Var.b, cjt0Var.a)));
                }
                if (ljt0Var instanceof ejt0) {
                    a8z a8zVar = ((ejt0) ljt0Var).a;
                    if (!(a8zVar instanceof y7z) && !(a8zVar instanceof z7z)) {
                        if (!(a8zVar instanceof a8z)) {
                            eg.o();
                            return null;
                        }
                        z2 = a8zVar.b;
                    }
                    cot0Var.getClass();
                    return Next.h(cot0.a(cot0Var, null, 0L, cpn1.m(z2, cot0Var.c instanceof zqt0, cot0Var.a), 27));
                }
                if (ljt0Var instanceof zit0) {
                    cot0Var.getClass();
                    boolean z15 = cot0Var.c instanceof qrt0;
                    zit0 zit0Var = (zit0) ljt0Var;
                    r4z r4zVar3 = zit0Var.a;
                    return Next.h(cot0.a(cot0Var, r4zVar3, zit0Var.c, cpn1.m(z15, zit0Var.b, r4zVar3), 24));
                }
                if (u890.j(ljt0Var, wit0.a)) {
                    cot0Var.getClass();
                    return Next.i(cot0.a(cot0Var, null, 0L, null, 15), Collections.singleton(jht0.a));
                }
                if (ljt0Var instanceof yit0) {
                    cot0Var.getClass();
                    cot0 cot0VarA2 = cot0.a(cot0Var, null, 0L, null, 15);
                    r4z r4zVar4 = cot0Var.a;
                    yit0 yit0Var = (yit0) ljt0Var;
                    return Next.i(cot0VarA2, Collections.singleton(new bht0(r4zVar4.c, r4zVar4.i, yit0Var.a, yit0Var.b)));
                }
                if (!(ljt0Var instanceof xit0)) {
                    eg.o();
                    return null;
                }
                cot0Var.getClass();
                cot0 cot0VarA3 = cot0.a(cot0Var, null, 0L, null, 15);
                r4z r4zVar5 = cot0Var.a;
                return Next.i(cot0VarA3, Collections.singleton(new hht0(r4zVar5.c, r4zVar5.i, ((xit0) ljt0Var).a)));
            case 13:
                return e(obj, obj2);
            case 14:
                return c((kd10) obj2);
            case 15:
                return f(obj, obj2);
            case 16:
                return g(obj, obj2);
            case 17:
                return h(obj, obj2);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return u890.j((e530) obj2, c530.a) ? Next.a(Collections.singleton(slo0.a)) : Next.j();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                e530 e530Var = (e530) obj2;
                if (e530Var instanceof d530) {
                    return Next.h(((d530) e530Var).a);
                }
                if (e530Var instanceof b530) {
                    return Next.a(Collections.singleton(m430.a));
                }
                if (e530Var instanceof c530) {
                    return Next.a(Collections.singleton(n430.a));
                }
                eg.o();
                return null;
            case 20:
                oq30 oq30Var = (oq30) obj;
                mq30 mq30Var = (mq30) obj2;
                if (mq30Var instanceof lq30) {
                    return Next.h(oq30.a(oq30Var, ((lq30) mq30Var).a));
                }
                if (mq30Var instanceof kq30) {
                    kq30 kq30Var = (kq30) mq30Var;
                    return Next.i(oq30.a(oq30Var, (wkt) null), Collections.singleton(new jq30(oq30Var, kq30Var.b, kq30Var.a)));
                }
                eg.o();
                return null;
            case 21:
                return i(obj, obj2);
            case 22:
                return j(obj, obj2);
            case 23:
                return k(obj, obj2);
            case 24:
                return l(obj, obj2);
            case 25:
                List list2 = ((n4g) obj2).a;
                ((p4g) obj).getClass();
                return Next.h(new p4g(list2));
            case 26:
                nb60 nb60Var = (nb60) obj;
                lb60 lb60Var = (lb60) obj2;
                if (lb60Var != null) {
                    rb60 rb60Var = (rb60) o7h.t0(lb60Var.b, nb60Var.a.a());
                    return Next.h(new nb60(nb60Var.a, rb60Var != null ? rb60Var.getId() : null));
                }
                eg.o();
                return null;
            case 27:
                return m(obj, obj2);
            case 28:
                return n(obj, obj2);
            default:
                return d((l2a0) obj, (j2a0) obj2);
        }
    }

    public Next b(dny dnyVar, xfy xfyVar) {
        List list = dnyVar.e;
        if (xfyVar instanceof pfy) {
            return Next.h(dny.b(dnyVar, (String) null, 1, (List) null, (List) null, false, false, (jf81) null, (tqb1) null, 1015));
        }
        if (xfyVar instanceof mfy) {
            bpd bpdVar = ((mfy) xfyVar).a;
            String str = bpdVar.a;
            if (str == null) {
                str = dnyVar.c;
            }
            return Next.h(dny.b(dnyVar, str, 2, bpdVar.b, bpdVar.c, false, false, (jf81) null, (tqb1) null, 965));
        }
        if (xfyVar instanceof ufy) {
            return Next.h(dny.b(dnyVar, (String) null, 0, (List) null, (List) null, ((ufy) xfyVar).a, false, (jf81) null, (tqb1) null, 959));
        }
        if (xfyVar instanceof nfy) {
            return Next.h(dny.b(dnyVar, (String) null, 0, (List) null, (List) null, false, ((nfy) xfyVar).a, (jf81) null, (tqb1) null, 895));
        }
        if (xfyVar instanceof wfy) {
            return Next.h(dny.b(dnyVar, (String) null, 0, (List) null, (List) null, false, false, ((wfy) xfyVar).a, (tqb1) null, 767));
        }
        if (xfyVar instanceof rfy) {
            tqb1 tqb1Var = dnyVar.j;
            return Next.h(dny.b(dnyVar, (String) null, 0, (List) null, (List) null, false, false, (jf81) null, tqb1Var != null ? new tqb1(tqb1Var.a, ((rfy) xfyVar).a) : null, 511));
        }
        if (xfyVar instanceof ofy) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add((ccy) it.next());
            }
            return Next.h(dny.b(dnyVar, (String) null, 0, arrayList, (List) null, false, false, (jf81) null, (tqb1) null, 1007));
        }
        if (xfyVar instanceof tfy) {
            tfy tfyVar = (tfy) xfyVar;
            tv80 tv80Var = tfyVar.c;
            ou80 ou80Var = tv80Var.a;
            j80 j80Var = tfyVar.a;
            return (j80Var.b == null && dnyVar.h) ? Next.a(f46.S0(new zey[]{new wey(tv80Var), new tey(ou80Var, fqn0.a)})) : Next.a(f46.S0(new zey[]{new vey(j80Var, tfyVar.b, tv80Var), new tey(ou80Var, fqn0.a)}));
        }
        if (xfyVar instanceof sfy) {
            return Next.a(Collections.singleton(new uey(((sfy) xfyVar).a)));
        }
        if (xfyVar instanceof vfy) {
            vfy vfyVar = (vfy) xfyVar;
            k80 k80Var = vfyVar.a;
            String str2 = vfyVar.b;
            tv80 tv80Var2 = vfyVar.c;
            return Next.a(f46.S0(new zey[]{new xey(k80Var, str2, tv80Var2), new tey(tv80Var2.a, fqn0.a)}));
        }
        if (xfyVar instanceof lfy) {
            lfy lfyVar = (lfy) xfyVar;
            return Next.a(Collections.singleton(new tey(lfyVar.b, lfyVar.a.a)));
        }
        if (!(xfyVar instanceof qfy)) {
            eg.o();
            return null;
        }
        qfy qfyVar = (qfy) xfyVar;
        tv80 tv80Var3 = qfyVar.c;
        bcy bcyVar = qfyVar.a;
        if (bcyVar instanceof acy) {
            return Next.a(Collections.singleton(new uey(tv80Var3)));
        }
        if (bcyVar instanceof bcy) {
            return Next.a(f46.S0(new zey[]{new xey(bcyVar.d, qfyVar.b, tv80Var3), new tey(tv80Var3.a, fqn0.a)}));
        }
        eg.o();
        return null;
    }

    public Next c(kd10 kd10Var) {
        if (kd10Var instanceof hd10) {
            smc0 smc0VarN = k4p1.n();
            if (((hd10) kd10Var).a) {
                smc0VarN.add(ad10.c);
            }
            smc0VarN.add(bd10.c);
            return Next.h(new nd10(k4p1.k(smc0VarN)));
        }
        if (kd10Var instanceof id10) {
            return Next.a(Collections.singleton(new fd10(((id10) kd10Var).a, fqn0.a)));
        }
        if (kd10Var instanceof jd10) {
            return Next.a(Collections.singleton(new fd10(((jd10) kd10Var).a, new mqn0())));
        }
        eg.o();
        return null;
    }

    public Next d(l2a0 l2a0Var, j2a0 j2a0Var) {
        if (j2a0Var instanceof h2a0) {
            return Next.a(Collections.singleton(new p1a0(((h2a0) j2a0Var).a)));
        }
        if (j2a0Var instanceof f2a0) {
            nq90 nq90Var = ((f2a0) j2a0Var).a;
            return nq90Var.b.length() == 0 ? Next.h(l2a0.b(l2a0Var, new x4a0(), false, 2)) : Next.h(l2a0.b(l2a0Var, new z4a0(nq90Var), false, 2));
        }
        if (j2a0Var instanceof d2a0) {
            return Next.a(Collections.singleton(new n1a0(((d2a0) j2a0Var).a)));
        }
        if (j2a0Var instanceof i2a0) {
            return Next.a(Collections.singleton(new q1a0(((i2a0) j2a0Var).a)));
        }
        if (j2a0Var instanceof g2a0) {
            return Next.h(l2a0.b(l2a0Var, (a5a0) null, ((g2a0) j2a0Var).a, 1));
        }
        if (j2a0Var instanceof e2a0) {
            return Next.h(l2a0.b(l2a0Var, new x4a0(), false, 2));
        }
        eg.o();
        return null;
    }
}
