package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.home.slotloading.SlotEffect;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wam0 implements Update {
    public final /* synthetic */ byte a;

    public /* synthetic */ wam0(byte b) {
        this.a = b;
    }

    public static Next b(a651 a651Var, String str, boolean z) {
        String str2;
        a651 a651VarB;
        boolean z2 = (ihc1.y0(str) || str.equals(a651Var.d)) ? false : true;
        boolean z3 = a651Var.c instanceof eb51;
        if (z && !z3 && !z2) {
            return Next.j();
        }
        if (ihc1.y0(str)) {
            a651VarB = a651.b(a651Var, z6x.a, (List) null, eb51.c, "", 2);
            str2 = str;
        } else {
            str2 = str;
            a651VarB = a651.b(a651Var, (List) null, (List) null, gb51.c, str2, 3);
        }
        return Next.i(a651VarB, Collections.singleton(new yx41(str2, z)));
    }

    private final Next d(Object obj, Object obj2) {
        o5e0 m5e0Var;
        qgp0 qgp0Var = (qgp0) obj;
        pgp0 pgp0Var = (pgp0) obj2;
        boolean z = qgp0Var.b;
        h4p1 h4p1Var = qgp0Var.c;
        if (!(pgp0Var instanceof ngp0)) {
            if (!(pgp0Var instanceof ogp0)) {
                eg.o();
                return null;
            }
            Emitter emitter = ((ogp0) pgp0Var).a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (h4p1Var != null) {
                boolean z2 = h4p1Var instanceof n8e0;
                kgp0 kgp0Var = kgp0.a;
                if (z2) {
                    if (!z) {
                        linkedHashSet.add(kgp0Var);
                    }
                    linkedHashSet.add(new jgp0(emitter, Notification.b(((n8e0) h4p1Var).c)));
                } else if (h4p1Var instanceof m8e0) {
                    if (!z) {
                        linkedHashSet.add(kgp0Var);
                    }
                    m8e0 m8e0Var = (m8e0) h4p1Var;
                    linkedHashSet.add(new jgp0(emitter, Notification.b(m8e0Var.c), Notification.a(m8e0Var.d)));
                } else {
                    if (!(h4p1Var instanceof l8e0)) {
                        eg.o();
                        return null;
                    }
                    linkedHashSet.add(new jgp0(emitter, Notification.b(((l8e0) h4p1Var).c), Notification.b));
                }
            }
            return Next.i(qgp0.a(qgp0Var, null, true, null, 5), linkedHashSet);
        }
        Notification notification = ((ngp0) pgp0Var).a;
        Object obj3 = notification.a;
        vbe vbeVar = qgp0Var.a;
        if (!(vbeVar instanceof r490)) {
            if (!(vbeVar instanceof q490)) {
                return Next.j();
            }
            if (notification.e()) {
                Object objD = notification.d();
                objD.getClass();
                return Next.i(qgp0.a(qgp0Var, null, false, new n8e0(objD), 3), Effects.a(new igp0[]{new igp0(notification)}));
            }
            if (obj3 == null) {
                if (h4p1Var instanceof n8e0) {
                    return Next.i(qgp0.a(qgp0Var, null, false, new l8e0(((n8e0) h4p1Var).c), 1), Effects.a(new igp0[]{new igp0(notification)}));
                }
                bhn0.f(jhc1.J("\n                        Invalid state: In Loaded state, the Observable should have emitted at least one OnNext event.\n                        Notification: " + notification + "\n                        Model: " + qgp0Var + "\n                    "));
                return null;
            }
            if (h4p1Var instanceof n8e0) {
                Object obj4 = ((n8e0) h4p1Var).c;
                Throwable thC = notification.c();
                thC.getClass();
                return Next.i(qgp0.a(qgp0Var, null, false, new m8e0(obj4, thC), 1), Effects.a(new igp0[]{new igp0(notification)}));
            }
            bhn0.f(jhc1.J("\n                        Invalid state: In Loaded state, the Observable should have emitted at least one OnNext event.\n                        Notification: " + notification + "\n                        Model: " + qgp0Var + "\n                    "));
            return null;
        }
        boolean zE = notification.e();
        vbe w490Var = q490.e;
        if (zE) {
            Object objD2 = notification.d();
            objD2.getClass();
            return Next.i(qgp0.a(qgp0Var, w490Var, false, new n8e0(objD2), 2), Effects.a(new hgp0[]{new hgp0(notification)}));
        }
        if (NotificationLite.h(obj3)) {
            Throwable thC2 = notification.c();
            thC2.getClass();
            m5e0Var = q3p1.o(thC2);
        } else {
            m5e0Var = new m5e0(new NoSuchElementException("source completed without emitting anything"));
        }
        if (m5e0Var instanceof k5e0) {
            w490Var = u490.e;
        } else if (m5e0Var instanceof h5e0) {
            w490Var = r490.e;
        } else if (!(m5e0Var instanceof f5e0)) {
            if (m5e0Var instanceof j5e0) {
                w490Var = t490.e;
            } else if (m5e0Var instanceof c5e0) {
                w490Var = p490.e;
            } else if (m5e0Var instanceof i5e0) {
                i5e0 i5e0Var = (i5e0) m5e0Var;
                w490Var = new s490(i5e0Var.a, i5e0Var.b);
            } else if (m5e0Var instanceof l5e0) {
                l5e0 l5e0Var = (l5e0) m5e0Var;
                w490Var = new v490(l5e0Var.a, l5e0Var.b);
            } else {
                if (!(m5e0Var instanceof m5e0)) {
                    eg.o();
                    return null;
                }
                w490Var = new w490(((m5e0) m5e0Var).a);
            }
        }
        return Next.i(qgp0.a(qgp0Var, w490Var, false, null, 4), Effects.a(new ggp0[]{new ggp0(w490Var)}));
    }

    private final Next e(Object obj, Object obj2) {
        wlp0 wlp0Var = (wlp0) obj;
        tq80 tq80Var = (tq80) obj2;
        plp0 plp0Var = (ulp0) tq80Var.a;
        if (plp0Var instanceof plp0) {
            wlp0Var.getClass();
            return Next.h(wlp0.a(wlp0Var, 0, (String) null, 0, (String) null, plp0Var.a, 15));
        }
        if (u890.j(plp0Var, tlp0.a)) {
            return wlp0Var.e ? Next.h(wlp0.a(wlp0Var, 0, (String) null, 1, (String) null, false, 26)) : Next.i(wlp0.a(wlp0Var, 0, (String) null, 0, (String) null, false, 26), Effects.a(new a9w[]{new a9w(wlp0Var.b)}));
        }
        if (u890.j(plp0Var, rlp0.a)) {
            return Next.a(Effects.a(new aaw[]{aaw.c}));
        }
        if (u890.j(plp0Var, nlp0.a)) {
            wlp0Var.getClass();
            return Next.i(wlp0.a(wlp0Var, 0, (String) null, 0, (String) null, false, 26), Effects.a(new a9w[]{new a9w(wlp0Var.b)}));
        }
        if (u890.j(plp0Var, olp0.a)) {
            wlp0Var.getClass();
            return Next.h(wlp0.a(wlp0Var, 0, (String) null, 0, (String) null, false, 26));
        }
        if (plp0Var instanceof slp0) {
            wlp0Var.getClass();
            return Next.h(wlp0.a(wlp0Var, 1, (String) null, 0, (String) null, false, 30));
        }
        if (u890.j(plp0Var, qlp0.a)) {
            tqw tqwVar = tq80Var.b;
            return Next.a(Effects.a(new kdw[]{new kdw(tqwVar != null ? n3o1.y(tqwVar) : null)}));
        }
        eg.o();
        return null;
    }

    private final Next f(Object obj, Object obj2) {
        moq0 moq0Var = (toq0) obj;
        xnq0 xnq0Var = (hoq0) obj2;
        joq0 joq0Var = joq0.b;
        joq0 joq0Var2 = joq0.f;
        if (xnq0Var instanceof snq0) {
            snq0 snq0Var = (snq0) xnq0Var;
            return Next.h(new koq0(snq0Var.a, snq0Var.b));
        }
        if (xnq0Var instanceof unq0) {
            unq0 unq0Var = (unq0) xnq0Var;
            dam damVar = unq0Var.b;
            String str = unq0Var.c;
            boolean zEquals = damVar.equals(y9m.a);
            c560 c560Var = unq0Var.a;
            return zEquals ? Next.h(new moq0(c560Var, false, false, str)) : Next.h(new moq0(c560Var, damVar.a(), damVar.b(), str));
        }
        if (xnq0Var instanceof tnq0) {
            tnq0 tnq0Var = (tnq0) xnq0Var;
            return Next.h(new loq0(tnq0Var.a, tnq0Var.b));
        }
        if (xnq0Var instanceof vnq0) {
            vnq0 vnq0Var = (vnq0) xnq0Var;
            return Next.h(new noq0(vnq0Var.a, vnq0Var.b));
        }
        if (xnq0Var instanceof xnq0) {
            return Next.h(new ooq0(xnq0Var.a));
        }
        if (xnq0Var instanceof goq0) {
            return Next.h(soq0.a);
        }
        if (xnq0Var.equals(pnq0.g)) {
            return Next.h(joq0Var2);
        }
        if (xnq0Var.equals(foq0.a)) {
            return Next.h(roq0.a);
        }
        if (xnq0Var.equals(pnq0.a)) {
            return Next.h(joq0.a);
        }
        if (xnq0Var instanceof ynq0) {
            return Next.h(poq0.a);
        }
        if (xnq0Var.equals(pnq0.d)) {
            return Next.h(joq0.d);
        }
        if (xnq0Var instanceof eoq0) {
            if (moq0Var instanceof koq0) {
                c560 c560Var2 = ((koq0) moq0Var).a;
                return Next.a(Collections.singleton(new lnq0(me20.a(c560Var2.b(), false, !c560Var2.b().f, 95))));
            }
            if (moq0Var instanceof moq0) {
                c560 c560Var3 = moq0Var.a;
                return Next.a(Collections.singleton(new lnq0(me20.a(c560Var3.b(), false, !c560Var3.b().f, 95))));
            }
            hhg1.o(moq0Var, "Unexpected model state: ");
            return null;
        }
        if (xnq0Var instanceof qnq0) {
            if (moq0Var instanceof koq0) {
                c560 c560Var4 = ((koq0) moq0Var).a;
                return Next.a(Collections.singleton(new lnq0(me20.a(c560Var4.b(), !c560Var4.b().c, false, 123))));
            }
            hhg1.o(moq0Var, "Unexpected model state: ");
            return null;
        }
        if (xnq0Var instanceof rnq0) {
            return Next.j();
        }
        if (xnq0Var.equals(doq0.a)) {
            return (((moq0Var instanceof koq0) && (((koq0) moq0Var).a.a() instanceof l560)) || (moq0Var instanceof soq0)) ? Next.a(Collections.singleton(inq0.b)) : Next.a(Collections.singleton(hnq0.b));
        }
        if (xnq0Var.equals(pnq0.c)) {
            return Next.h(joq0Var);
        }
        if (xnq0Var.equals(pnq0.b)) {
            return Next.h(joq0Var);
        }
        if (xnq0Var instanceof wnq0) {
            return Next.h(qoq0.a);
        }
        if (xnq0Var.equals(pnq0.e)) {
            return Next.h(joq0.e);
        }
        if (xnq0Var.equals(pnq0.f)) {
            if (moq0Var instanceof ooq0) {
                return Next.i(joq0Var2, Collections.singleton(new jnq0(((ooq0) moq0Var).a)));
            }
            hhg1.o(moq0Var, "Unexpected model state: ");
            return null;
        }
        if (!xnq0Var.equals(aoq0.a)) {
            if (xnq0Var.equals(znq0.a) || xnq0Var.equals(boq0.a)) {
                return Next.j();
            }
            if (xnq0Var.equals(coq0.a)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (moq0Var instanceof koq0) {
            return Next.a(Collections.singleton(new knq0(((koq0) moq0Var).a)));
        }
        if (moq0Var instanceof loq0) {
            return Next.a(Collections.singleton(new knq0(((loq0) moq0Var).a)));
        }
        if (moq0Var instanceof moq0) {
            return Next.a(Collections.singleton(new knq0(moq0Var.a)));
        }
        if (moq0Var instanceof noq0) {
            return Next.a(Collections.singleton(new knq0(((noq0) moq0Var).a)));
        }
        eg.m("Unexpected puffin state - should be FiltersSetup to remove optimizations");
        return null;
    }

    private final Next g(Object obj, Object obj2) {
        bot0 bot0Var = (bot0) obj;
        jjt0 jjt0Var = (mjt0) obj2;
        List list = bot0Var.i;
        String str = bot0Var.a;
        int i = bot0Var.c;
        boolean z = jjt0Var instanceof jjt0;
        abe0 abe0Var = abe0.a;
        if (z) {
            vp31 vp31Var = jjt0Var.a;
            return vp31Var.g.isEmpty() ? Next.h(bot0.a(bot0Var, 0, new art0(abe0Var), null, null, 447)) : Next.h(bot0.a(bot0Var, 0, new art0(new uae0(vp31Var)), null, null, 447));
        }
        if (jjt0Var instanceof kjt0) {
            vrt0 vrt0Var = bot0Var.g;
            if (!(vrt0Var instanceof art0)) {
                return Next.j();
            }
            zbe0 zbe0Var = ((art0) vrt0Var).a;
            return zbe0Var instanceof uae0 ? Next.h(bot0.a(bot0Var, 0, new prt0(((uae0) zbe0Var).a), null, null, 447)) : Next.j();
        }
        if (jjt0Var instanceof ijt0) {
            return i == ((ijt0) jjt0Var).a ? Next.h(bot0.a(bot0Var, 0, new art0(abe0Var), null, null, 447)) : Next.j();
        }
        boolean z2 = jjt0Var instanceof gjt0;
        cbe0 cbe0Var = cbe0.a;
        if (z2) {
            return Next.i(bot0.a(bot0Var, 0, new art0(cbe0Var), null, null, 447), Collections.singleton(new dht0(str, i)));
        }
        if (jjt0Var instanceof hjt0) {
            int i2 = i + 1;
            return Next.i(bot0.a(bot0Var, i2, new art0(cbe0Var), null, o7h.O0(((hjt0) jjt0Var).a, list), 187), Collections.singleton(new dht0(str, i2)));
        }
        if (!(jjt0Var instanceof ajt0)) {
            if (jjt0Var instanceof fjt0) {
                ghz0 ghz0Var = ((fjt0) jjt0Var).a;
                return ghz0Var instanceof ghz0 ? Next.i(bot0.a(bot0Var, 0, null, khz0.a, null, 383), Collections.singleton(new eht0(ghz0Var.c))) : Next.i(bot0.a(bot0Var, 0, null, ihz0.a, null, 383), Collections.singleton(new kht0()));
            }
            eg.o();
            return null;
        }
        ajt0 ajt0Var = (ajt0) jjt0Var;
        if (bot0Var.h instanceof jhz0) {
            return Next.j();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(((yq31) it.next()).a, arrayList);
        }
        return Next.i(bot0.a(bot0Var, 0, null, jhz0.a, null, 383), Collections.singleton(new cht0(str, bot0Var.b, o7h.N0(ajt0Var.a, arrayList))));
    }

    private final Next h(Object obj, Object obj2) {
        p3z0 p3z0Var = (p3z0) obj;
        o3z0 o3z0Var = (o3z0) obj2;
        String str = p3z0Var.a;
        String str2 = p3z0Var.c;
        x1z0 x1z0Var = p3z0Var.h;
        if (o3z0Var instanceof n3z0) {
            if (x1z0Var instanceof z1z0) {
                return Next.i(p3z0.a(p3z0Var, (oho1) null), Collections.singleton(new n2z0(new y1z0(str, str2))));
            }
            z1z0 z1z0Var = new z1z0(str, str2);
            Set setW0 = dm61.w0(new o2z0[]{new n2z0(z1z0Var)});
            if (x1z0Var != null) {
                setW0.add(new n2z0(new y1z0(str, str2)));
            }
            return Next.i(p3z0.a(p3z0Var, z1z0Var), setW0);
        }
        if (o3z0Var instanceof m3z0) {
            if ((x1z0Var instanceof x1z0 ? x1z0Var : null) != null) {
                return Next.i(p3z0.a(p3z0Var, (oho1) null), Collections.singleton(new n2z0(new y1z0(str, str2))));
            }
            Set setW1 = dm61.w0(new o2z0[]{new k2z0(str, str2)});
            if (x1z0Var != null) {
                setW1.add(new n2z0(new y1z0(str, str2)));
            }
            return Next.i(p3z0.a(p3z0Var, (oho1) null), setW1);
        }
        if (o3z0Var instanceof h3z0) {
            return Next.a(Collections.singleton(new l2z0(p3z0Var.b)));
        }
        if (o3z0Var instanceof g3z0) {
            x1z0 x1z0Var2 = ((g3z0) o3z0Var).a;
            return x1z0Var2 != null ? Next.i(p3z0.a(p3z0Var, x1z0Var2), Collections.singleton(new n2z0(x1z0Var2))) : Next.j();
        }
        if (o3z0Var.equals(l3z0.a)) {
            return Next.a(Collections.singleton(new m2z0(2131959029)));
        }
        if (o3z0Var.equals(k3z0.a)) {
            return Next.a(Collections.singleton(new m2z0(2131959028)));
        }
        if (o3z0Var instanceof j3z0) {
            return Next.a(Collections.singleton(j2z0.a));
        }
        if (o3z0Var instanceof i3z0) {
            return Next.a(Collections.singleton(i2z0.a));
        }
        eg.o();
        return null;
    }

    private final Next i(Object obj, Object obj2) {
        fiz0 fiz0Var = (fiz0) obj;
        biz0 biz0Var = (eiz0) obj2;
        if (biz0Var instanceof diz0) {
            return Next.h(fiz0.a(fiz0Var, null, null, null, null, null, null, null, false, 15359));
        }
        if (!(biz0Var instanceof ciz0)) {
            if (biz0Var instanceof biz0) {
                String message = biz0Var.a.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                return Next.h(fiz0.a(fiz0Var, null, null, null, null, null, new vae0(message), null, false, 14335));
            }
            if (biz0Var.equals(aiz0.a)) {
                return Next.a(Collections.singleton(shz0.c));
            }
            eg.o();
            return null;
        }
        ciz0 ciz0Var = (ciz0) biz0Var;
        String str = ciz0Var.b;
        ljz0 ljz0Var = ciz0Var.a;
        ArrayList arrayList = ljz0Var.a;
        List list = ciz0Var.c;
        List list2 = ciz0Var.d;
        return Next.h(fiz0.a(fiz0Var, str, arrayList, ljz0Var.b, list, list2, dbe0.a, ljz0Var.c, ljz0Var.e, 1805));
    }

    private final Next j(Object obj, Object obj2) {
        String str;
        g211 g211Var = (g211) obj;
        d211 d211Var = (d211) obj2;
        f211 f211Var = g211Var.a;
        if (d211Var.equals(c211.a)) {
            return Next.a(Collections.singleton(new t111(f211Var.e)));
        }
        if (d211Var.equals(y111.a)) {
            return Next.a(Collections.singleton(new w111(f211Var.e, g211Var.b)));
        }
        boolean z = d211Var instanceof z111;
        int i = 2;
        srt0 mrt0Var = ert0.a;
        if (z) {
            String str2 = f211Var.e;
            int i2 = g211Var.c;
            String str3 = ((z111) d211Var).a;
            int iC = l1d.C(i2);
            if (iC == 0) {
                mrt0Var = new mrt0(str3);
            } else if (iC == 1) {
                mrt0Var = new krt0(str3);
            } else if (iC != 2) {
                eg.o();
                return null;
            }
            return Next.a(Collections.singleton(new v111(str2, mrt0Var)));
        }
        if (d211Var instanceof b211) {
            return Next.h(g211.a(g211Var, null, ((b211) d211Var).a, 0, 5));
        }
        if (!(d211Var instanceof a211)) {
            eg.o();
            return null;
        }
        srt0 srt0Var = ((a211) d211Var).a;
        if (srt0Var.equals(mrt0Var)) {
            str = null;
        } else if (srt0Var instanceof krt0) {
            str = ((krt0) srt0Var).a;
        } else {
            if (!(srt0Var instanceof mrt0)) {
                eg.o();
                return null;
            }
            str = ((mrt0) srt0Var).a;
        }
        if (!u890.j(str, f211Var.e)) {
            return Next.j();
        }
        if (srt0Var instanceof mrt0) {
            i = 1;
        } else if (!(srt0Var instanceof krt0)) {
            if (!(srt0Var instanceof ert0)) {
                eg.o();
                return null;
            }
            i = 3;
        }
        return Next.h(g211.a(g211Var, null, 0, i, 3));
    }

    private final Next k(Object obj, Object obj2) {
        rq31 rq31Var = (rq31) obj;
        pq31 pq31Var = (qq31) obj2;
        vp31 vp31Var = rq31Var.a;
        uq31 uq31Var = rq31Var.c;
        List list = rq31Var.b;
        aq31 aq31Var = null;
        if (pq31Var instanceof kq31) {
            sq31 sq31Var = uq31Var instanceof sq31 ? (sq31) uq31Var : null;
            if (sq31Var == null) {
                return Next.j();
            }
            kq31 kq31Var = (kq31) pq31Var;
            return Next.h(rq31.a(rq31Var, o7h.O0(kq31Var.a, list), sq31.a(sq31Var, null, Long.valueOf(kq31Var.b), 11), false, 57));
        }
        if (pq31Var instanceof mq31) {
            sq31 sq31Var2 = uq31Var instanceof sq31 ? (sq31) uq31Var : null;
            return sq31Var2 != null ? Next.h(rq31.a(rq31Var, null, new tq31(sq31Var2.a), false, 59)) : Next.j();
        }
        if (pq31Var instanceof oq31) {
            return list.size() == vp31Var.g.size() ? Next.i(rq31Var, Collections.singleton(new zp31(new yq31(list)))) : Next.h(rq31.a(rq31Var, null, new sq31((k1z0) vp31Var.g.get(list.size()), null, null, false), false, 59));
        }
        if (pq31Var instanceof lq31) {
            return Next.i(rq31Var, Collections.singleton(new yp31(list)));
        }
        if (pq31Var instanceof pq31) {
            sq31 sq31Var3 = uq31Var instanceof sq31 ? (sq31) uq31Var : null;
            if (sq31Var3 == null) {
                return Next.j();
            }
            k1z0 k1z0Var = sq31Var3.a;
            if (!u890.j(k1z0Var.a, pq31Var.a)) {
                return Next.j();
            }
            if (sq31Var3.b == null || sq31Var3.c != null || sq31Var3.d) {
                return Next.j();
            }
            return Next.h(rq31.a(rq31Var, o7h.O0(new om21(k1z0Var.e, 4, k1z0Var.a), list), sq31.a(sq31Var3, null, null, 7), false, 57));
        }
        if (!(pq31Var instanceof nq31)) {
            eg.o();
            return null;
        }
        sq31 sq31Var4 = uq31Var instanceof sq31 ? (sq31) uq31Var : null;
        if (sq31Var4 == null) {
            return Next.j();
        }
        nq31 nq31Var = (nq31) pq31Var;
        if (!u890.j(sq31Var4.a.a, nq31Var.a)) {
            return Next.j();
        }
        if (sq31Var4.b != null) {
            return Next.j();
        }
        sq31 sq31VarA = sq31.a(sq31Var4, Long.valueOf(nq31Var.b), null, 13);
        rq31 rq31VarA = rq31.a(rq31Var, null, sq31VarA, false, 59);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Long l = sq31VarA.b;
        if (l != null && sq31VarA.c == null && !sq31VarA.d) {
            long jLongValue = l.longValue();
            k1z0 k1z0Var2 = sq31VarA.a;
            aq31Var = new aq31(k1z0Var2.a, jLongValue + k1z0Var2.e);
        }
        if (aq31Var != null) {
            linkedHashSet.add(aq31Var);
        }
        return Next.i(rq31VarA, linkedHashSet);
    }

    private final Next l(Object obj, Object obj2) {
        a651 a651Var = (a651) obj;
        qz41 qz41Var = (o151) obj2;
        String str = a651Var.d;
        boolean z = qz41Var instanceof qz41;
        z6x z6xVar = z6x.a;
        if (z) {
            qz41 qz41Var2 = qz41Var;
            return !u890.j(qz41Var2.a, str) ? Next.j() : Next.h(a651.b(a651Var, z6xVar, (List) null, new fb51(4), qz41Var2.a, 2));
        }
        if (qz41Var instanceof vz41) {
            vz41 vz41Var = (vz41) qz41Var;
            ArrayList arrayList = vz41Var.b;
            String str2 = vz41Var.a;
            if (!u890.j(str2, str)) {
                return Next.j();
            }
            i3o1 i3o1Var = a651Var.c;
            if ((i3o1Var instanceof fb51) && ((fb51) i3o1Var).c == 3) {
                return Next.j();
            }
            return arrayList.isEmpty() ? Next.h(new a651(z6xVar, z6xVar, new fb51(1), str2)) : Next.h(a651.b(a651Var, arrayList, (List) null, new fb51(2), vz41Var.a, 2));
        }
        if (qz41Var instanceof wz41) {
            wz41 wz41Var = (wz41) qz41Var;
            List list = wz41Var.b;
            String str3 = wz41Var.a;
            if (u890.j(str3, str)) {
                return list.isEmpty() ? Next.h(new a651(z6xVar, z6xVar, new fb51(1), str3)) : Next.h(a651.b(a651Var, (List) null, list, new fb51(3), wz41Var.a, 1));
            }
            return Next.j();
        }
        if (qz41Var instanceof h051) {
            h051 h051Var = (h051) qz41Var;
            return Next.a(Collections.singleton(new tx41(h051Var.a, h051Var.b)));
        }
        if (qz41Var instanceof g051) {
            fqn0 fqn0Var = fqn0.a;
            return Next.a(Collections.singleton(new kx41(((g051) qz41Var).a.a)));
        }
        if (qz41Var instanceof k151) {
            return b(a651Var, ((k151) qz41Var).a, true);
        }
        if (qz41Var instanceof l151) {
            return b(a651Var, ((l151) qz41Var).a, false);
        }
        eg.o();
        return null;
    }

    private final Next m(Object obj, Object obj2) {
        th2 th2Var = (th2) obj;
        qh2 qh2Var = (sh2) obj2;
        int i = th2Var.a;
        int i2 = th2Var.b;
        int i3 = th2Var.c;
        yj2 yj2Var = th2Var.d;
        boolean z = qh2Var instanceof oh2;
        xj2 xj2Var = xj2.a;
        yf2 yf2Var = yf2.a;
        if (z) {
            if (yj2Var instanceof wj2) {
                return Next.a(Collections.singleton(yf2Var));
            }
            if ((yj2Var instanceof vj2) || (yj2Var instanceof xj2) || (yj2Var instanceof uj2)) {
                return Next.i(th2.a(th2Var, 0, 0, 0, xj2Var, false, false, 55), Collections.singleton(new bg2(i3, i2, i)));
            }
            eg.o();
            return null;
        }
        boolean z2 = qh2Var instanceof qh2;
        vj2 vj2Var = vj2.a;
        if (z2) {
            jm5 jm5Var = qh2Var.a;
            if (jm5Var instanceof bi2) {
                bi2 bi2Var = (bi2) jm5Var;
                return Next.h(th2.a(th2Var, bi2Var.f, bi2Var.e, bi2Var.d, vj2Var, false, false, 48));
            }
            if (!(jm5Var instanceof ai2)) {
                eg.o();
                return null;
            }
            if ((yj2Var instanceof wj2) || (yj2Var instanceof vj2) || (yj2Var instanceof xj2) || (yj2Var instanceof uj2)) {
                ai2 ai2Var = (ai2) jm5Var;
                return Next.i(th2.a(th2Var, ai2Var.f, ai2Var.e, ai2Var.d, xj2Var, false, false, 48), Collections.singleton(new bg2(ai2Var.d, ai2Var.e, ai2Var.f)));
            }
            eg.o();
            return null;
        }
        boolean z3 = qh2Var instanceof ph2;
        xf2 xf2Var = xf2.a;
        if (!z3) {
            if (qh2Var instanceof nh2) {
                return Next.i(th2.a(th2Var, 0, 0, 0, vj2Var, false, false, 55), Collections.singleton(xf2Var));
            }
            if (qh2Var.equals(rh2.a)) {
                return Next.h(th2.a(th2Var, 0, 0, 0, vj2Var, false, false, 55));
            }
            eg.o();
            return null;
        }
        ph2 ph2Var = (ph2) qh2Var;
        if (i3 != ph2Var.a || i2 != ph2Var.b || i != ph2Var.c) {
            return Next.j();
        }
        q2j1 q2j1Var = ph2Var.d;
        if (q2j1Var instanceof r2j1) {
            return Next.i(th2.a(th2Var, 0, 0, 0, wj2.a, false, false, 55), yj2Var instanceof xj2 ? Collections.singleton(yf2Var) : w7x.a);
        }
        if (!(q2j1Var instanceof q2j1)) {
            eg.o();
            return null;
        }
        zb90 zb90Var = q2j1Var.c;
        boolean z4 = zb90Var instanceof xb90;
        if (z4 && th2Var.f) {
            return Next.i(th2.a(th2Var, 0, 0, 0, new uj2(zb90Var), false, false, 55), Collections.singleton(xf2Var));
        }
        return (z4 && th2Var.e) ? Next.i(th2.a(th2Var, 0, 0, 0, new uj2(zb90Var), false, false, 55), Collections.singleton(new ag2(i3, i2, i))) : Next.h(th2.a(th2Var, 0, 0, 0, new uj2(zb90Var), false, false, 55));
    }

    private final Next n(Object obj, Object obj2) {
        v6s0 v6s0Var = (v6s0) obj;
        e6s0 e6s0Var = (j6s0) obj2;
        boolean z = e6s0Var instanceof e6s0;
        l6s0 l6s0Var = l6s0.b;
        if (z) {
            e6s0 e6s0Var2 = e6s0Var;
            String str = e6s0Var2.a;
            if (!v6s0Var.b().equals(str)) {
                return Next.j();
            }
            int iC = l1d.C(e6s0Var2.b);
            if (iC == 0) {
                return Next.h(v6s0.a(v6s0Var, new p6s0(str), false, 4));
            }
            if (iC == 1) {
                return Next.h(v6s0.a(v6s0Var, new s6s0(str), false, 6));
            }
            if (iC == 2) {
                return Next.h(v6s0.a(v6s0Var, new t6s0(str), false, 4));
            }
            if (iC == 3) {
                return Next.h(v6s0.a(v6s0Var, l6s0Var, false, 6));
            }
            if (iC == 4) {
                return Next.h(v6s0.a(v6s0Var, new o6s0(str), false, 6));
            }
            eg.o();
            return null;
        }
        if (e6s0Var instanceof f6s0) {
            f6s0 f6s0Var = (f6s0) e6s0Var;
            String str2 = f6s0Var.a;
            if (v6s0Var.b().equals(str2)) {
                return Next.j();
            }
            return str2.length() == 0 ? Next.h(v6s0.a(v6s0Var, l6s0Var, false, 6)) : Next.i(v6s0.a(v6s0Var, new o6s0(str2), f6s0Var.b, 2), Effects.a(new z5s0[]{new z5s0(str2)}));
        }
        boolean z2 = e6s0Var instanceof i6s0;
        a6s0 a6s0Var = a6s0.a;
        if (z2) {
            i6s0 i6s0Var = (i6s0) e6s0Var;
            r0c0 r0c0Var = i6s0Var.b;
            String str3 = i6s0Var.a;
            if (r0c0Var.a) {
                return Next.i(v6s0.a(v6s0Var, new r6s0(str3), false, 6), Effects.a(new a6s0[]{a6s0Var}));
            }
            if (r0c0Var.b) {
                return Next.h(v6s0.a(v6s0Var, new k6s0(str3), false, 6));
            }
            return r0c0Var.c ? Next.h(v6s0.a(v6s0Var, new n6s0(str3), false, 6)) : Next.h(v6s0.a(v6s0Var, new m6s0(str3, (String) r0c0Var.d), false, 6));
        }
        if (e6s0Var.equals(h6s0.a)) {
            u6s0 u6s0Var = v6s0Var.a;
            if (u6s0Var instanceof r6s0) {
                return Next.a(Effects.a(new a6s0[]{a6s0Var}));
            }
            return ((u6s0Var instanceof p6s0) || (u6s0Var instanceof k6s0)) ? Next.i(v6s0.a(v6s0Var, new q6s0(v6s0Var.b()), false, 6), Effects.a(new b6s0[]{new b6s0(v6s0Var.b())})) : Next.h(v6s0.a(v6s0Var, (u6s0) null, false, 5));
        }
        if (e6s0Var.equals(g6s0.a)) {
            return Next.j();
        }
        eg.o();
        return null;
    }

    private final Next o(Object obj, Object obj2) {
        Next nextJ;
        od91 od91Var;
        qe91 qe91Var = (qe91) obj;
        le91 le91Var = (le91) obj2;
        String str = qe91Var.e;
        Map map = qe91Var.b;
        boolean z = le91Var instanceof ge91;
        sd91 sd91Var = sd91.a;
        if (z) {
            ge91 ge91Var = (ge91) le91Var;
            ArrayList<ef91> arrayList = ge91Var.a;
            int iS = zno1.s(q7h.U(arrayList, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj3 : arrayList) {
                linkedHashMap.put(obj3, sd91Var);
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (ef91 ef91Var : arrayList) {
                Object obj4 = ge91Var.b.get(ef91Var);
                if (obj4 == null) {
                    bhn0.s(ef91Var, "No strategy for slot ");
                    return null;
                }
                arrayList2.add(new SlotEffect.LoadSlotContent(ef91Var, (ice0) obj4, str));
            }
            nextJ = Next.i(new qe91(arrayList, linkedHashMap, ge91Var.c, false, qe91Var.e), o7h.p1(arrayList2));
        } else {
            boolean z2 = le91Var instanceof he91;
            od91 od91Var2 = pd91.a;
            ice0 ice0Var = ice0.a;
            ice0 ice0Var2 = ice0.c;
            if (z2) {
                he91 he91Var = (he91) le91Var;
                x4e0 x4e0Var = he91Var.d;
                ef91 ef91Var2 = he91Var.a;
                td91 td91Var = (td91) map.get(ef91Var2);
                if (td91Var instanceof pd91) {
                    nextJ = Next.j();
                } else {
                    boolean z3 = he91Var.c == ice0Var;
                    List list = he91Var.b;
                    if (z3) {
                        od91Var = new rd91(list, he91Var.f, he91Var.g, he91Var.d, he91Var.i);
                    } else if (!list.isEmpty()) {
                        od91Var = new od91(he91Var.b, he91Var.f, he91Var.g, he91Var.d, he91Var.i);
                    } else if (((td91Var instanceof rd91) && !(td91Var instanceof od91)) || !u890.j(td91Var, od91Var2)) {
                        Map mapP = sqg0.P(map, new mmr0(ef91Var2, od91Var2));
                        xj61 xj61Var = new xj61();
                        if (z3) {
                            xj61Var.add(new SlotEffect.LoadSlotContent(ef91Var2, ice0Var2, str));
                        }
                        if (ef91Var2 == ef91.d && x4e0Var == x4e0.a) {
                            xj61Var.add(new SlotEffect.UpdateOnDemandSet(x4e0Var, he91Var.e, he91Var.h));
                        }
                        nextJ = Next.i(qe91.b(qe91Var, mapP, x4e0Var, (String) null, 25), cwl1.j(xj61Var));
                    }
                    od91Var2 = od91Var;
                    nextJ = td91Var instanceof rd91 ? Next.j() : Next.j();
                }
            } else if (le91Var instanceof ke91) {
                ke91 ke91Var = (ke91) le91Var;
                ef91 ef91Var3 = ke91Var.a;
                td91 td91Var2 = (td91) map.get(ef91Var3);
                if (td91Var2 instanceof rd91) {
                    rd91 rd91Var = (rd91) td91Var2;
                    nextJ = rd91Var.a.isEmpty() ? Next.h(qe91.b(qe91Var, sqg0.P(map, new mmr0(ef91Var3, od91Var2)), (x4e0) null, (String) null, 29)) : Next.h(qe91.b(qe91Var, sqg0.P(map, new mmr0(ef91Var3, new od91(rd91Var.a, rd91Var.b, rd91Var.c, rd91Var.d, rd91Var.e))), (x4e0) null, (String) null, 29));
                } else if ((td91Var2 instanceof od91) || (td91Var2 instanceof pd91)) {
                    nextJ = Next.j();
                } else {
                    nextJ = (ke91Var.c == ice0Var && (td91Var2 instanceof sd91)) ? Next.a(Collections.singleton(new SlotEffect.LoadSlotContent(ef91Var3, ice0Var2, str))) : Next.h(qe91.b(qe91Var, sqg0.P(map, new mmr0(ef91Var3, new qd91(ke91Var.b))), (x4e0) null, (String) null, 29));
                }
            } else if (le91Var instanceof ie91) {
                nextJ = Next.h(qe91.b(qe91Var, (Map) null, (x4e0) null, (String) null, 23));
            } else {
                if (!(le91Var instanceof je91)) {
                    eg.o();
                    return null;
                }
                je91 je91Var = (je91) le91Var;
                String str2 = je91Var.b;
                ef91 ef91Var4 = je91Var.a;
                nextJ = !(((td91) map.get(ef91Var4)) instanceof qd91) ? Next.j() : Next.i(qe91.b(qe91Var, sqg0.P(map, new mmr0(ef91Var4, sd91Var)), (x4e0) null, str2, 13), Collections.singleton(new SlotEffect.LoadSlotContent(ef91Var4, ice0Var2, str2)));
            }
        }
        Logger.b("SlotLoop :: event: %s, oldState: %s, newState: %s", new Object[]{le91Var.breadcrumb(), qe91Var.a(), nextJ.d() ? ((qe91) nextJ.g()).a() : "empty"});
        return nextJ;
    }

    private final Next p(Object obj, Object obj2) {
        vga1 vga1Var = (vga1) obj;
        pga1 pga1Var = (rga1) obj2;
        if (pga1Var instanceof nga1) {
            vga1Var.getClass();
            return Next.h(vga1.a(vga1Var, true));
        }
        if (pga1Var instanceof mga1) {
            vga1Var.getClass();
            return Next.h(vga1.a(vga1Var, false));
        }
        if (pga1Var instanceof pga1) {
            return Next.h(vga1.a(pga1Var.a, vga1Var.c));
        }
        if (pga1Var instanceof qga1) {
            vga1Var.getClass();
            return Next.a(Collections.singleton(new lga1(yga1.a(ug3.h(vga1Var), ((qga1) pga1Var).a, (bb20) null, 6), 1, vga1Var.d)));
        }
        if (!(pga1Var instanceof oga1)) {
            return Next.j();
        }
        vga1Var.getClass();
        return Next.a(Collections.singleton(new lga1(yga1.a(ug3.h(vga1Var), (eia1) null, ((oga1) pga1Var).a, 5), 2, vga1Var.d)));
    }

    private final Next q(Object obj, Object obj2) {
        yfc1 yfc1VarA;
        yfc1 yfc1VarA2;
        yfc1 yfc1Var = (yfc1) obj;
        sfc1 sfc1Var = (tfc1) obj2;
        if (sfc1Var instanceof sfc1) {
            return Next.h(yfc1.a(yfc1Var, 0, sfc1Var.a, 0, 5));
        }
        if (sfc1Var.equals(pfc1.a)) {
            return Next.a(Collections.singleton(lfc1.b));
        }
        if (sfc1Var.equals(rfc1.a)) {
            return Next.a(Collections.singleton(kfc1.b));
        }
        if (sfc1Var instanceof qfc1) {
            int iC = l1d.C(((qfc1) sfc1Var).a);
            if (iC == 0) {
                yfc1VarA2 = yfc1.a(yfc1Var, 1, null, 0, 6);
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                yfc1VarA2 = yfc1.a(yfc1Var, 2, null, 0, 6);
            }
            return Next.h(yfc1VarA2);
        }
        if (!(sfc1Var instanceof ofc1)) {
            eg.o();
            return null;
        }
        int iC2 = l1d.C(((ofc1) sfc1Var).a);
        if (iC2 == 0) {
            yfc1VarA = yfc1.a(yfc1Var, 0, null, 1, 3);
        } else {
            if (iC2 != 1) {
                eg.o();
                return null;
            }
            yfc1VarA = yfc1.a(yfc1Var, 0, null, 2, 3);
        }
        return Next.h(yfc1VarA);
    }

    private final Next r(Object obj, Object obj2) {
        m5g1 m5g1Var = (m5g1) obj2;
        if (u890.j(m5g1Var, l5g1.a)) {
            return Next.h(v5g1.b);
        }
        if (m5g1Var instanceof k5g1) {
            return Next.h(new w5g1(((k5g1) m5g1Var).a));
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    private final Next s(Object obj, Object obj2) {
        ou80 ou80Var;
        luh1 luh1Var = (luh1) obj;
        tq80 tq80Var = (tq80) obj2;
        boolean z = luh1Var.g;
        String str = luh1Var.a;
        boolean z2 = luh1Var.f;
        boolean z3 = luh1Var.b;
        z740 z740Var = luh1Var.k;
        z740 z740Var2 = luh1Var.l;
        boolean z4 = luh1Var.j;
        tqw tqwVar = tq80Var.b;
        String str2 = (tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null) ? null : ou80Var.a;
        huh1 huh1Var = (juh1) tq80Var.a;
        if (huh1Var instanceof duh1) {
            boolean z5 = luh1Var.i;
            boolean z6 = luh1Var.h;
            if (z4) {
                if (z5) {
                    z740Var = z740Var2;
                } else {
                    z740Var = null;
                }
            } else if (!z6) {
                z740Var = null;
            }
            if (z3 || z2) {
                return Next.j();
            }
            if (z740Var != null) {
                return Next.a(Collections.singleton(new buh1(z740Var)));
            }
            return (luh1Var.c || luh1Var.d) ? Next.h(luh1.a(luh1Var, null, false, false, false, true, false, false, false, false, false, null, null, 4079)) : Next.i(luh1.a(luh1Var, null, true, false, false, false, false, false, false, false, false, null, null, 4093), Collections.singleton(new auh1(str, str2, z)));
        }
        if (u890.j(huh1Var, euh1.a)) {
            return Next.h(luh1.a(luh1Var, null, false, false, false, false, false, false, false, false, false, null, null, 4079));
        }
        if (u890.j(huh1Var, fuh1.a)) {
            return (z3 || z2) ? Next.h(luh1.a(luh1Var, null, false, false, false, false, false, false, false, false, false, null, null, 4079)) : Next.i(luh1.a(luh1Var, null, true, false, false, false, false, false, false, false, false, null, null, 4077), Collections.singleton(new auh1(str, str2, z)));
        }
        if (u890.j(huh1Var, guh1.a)) {
            return Next.h(luh1.a(luh1Var, null, false, false, false, false, false, false, false, false, false, null, null, 4093));
        }
        if (!(huh1Var instanceof huh1)) {
            if (huh1Var instanceof cuh1) {
                return Next.h(luh1.a(luh1Var, null, false, false, false, false, false, false, ((cuh1) huh1Var).a, false, false, null, null, 3967));
            }
            if (huh1Var instanceof iuh1) {
                return Next.h(luh1.a(luh1Var, null, false, false, false, false, false, false, false, ((iuh1) huh1Var).a, false, null, null, 3839));
            }
            eg.o();
            return null;
        }
        List list = huh1Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof h4y0) {
                arrayList.add(obj3);
            }
        }
        if (arrayList.isEmpty()) {
            return Next.h(luh1.a(luh1Var, null, false, false, false, false, false, false, false, false, false, null, null, 4093));
        }
        z740 z740Var3 = z4 ? z740Var2 : z740Var;
        return z740Var3 != null ? Next.i(luh1.a(luh1Var, null, false, false, false, false, false, false, false, false, false, null, null, 4093), Collections.singleton(new buh1(z740Var3))) : Next.h(luh1.a(luh1Var, null, false, false, false, false, false, false, false, false, false, null, null, 4093));
    }

    /* JADX WARN: Code duplicated, block: B:202:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:345:0x0712  */
    /* JADX WARN: Code duplicated, block: B:347:0x074a  */
    /* JADX WARN: Code duplicated, block: B:349:0x074e  */
    /* JADX WARN: Code duplicated, block: B:350:0x077d  */
    /* JADX WARN: Code duplicated, block: B:352:0x0785  */
    /* JADX WARN: Code duplicated, block: B:353:0x0787  */
    /* JADX WARN: Code duplicated, block: B:372:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:376:0x082d  */
    /* JADX WARN: Code duplicated, block: B:377:0x0835  */
    /* JADX WARN: Code duplicated, block: B:379:0x0839  */
    /* JADX WARN: Code duplicated, block: B:381:0x083f  */
    /* JADX WARN: Code duplicated, block: B:383:0x0880  */
    /* JADX WARN: Code duplicated, block: B:386:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:387:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:390:0x08d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:393:0x0914 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:397:0x0951 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:417:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:420:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:424:0x0a0b  */
    public final Next a(Object obj, Object obj2) {
        s1m1 s1m1Var;
        String str;
        List list;
        Object leoVar;
        List list2;
        List list3;
        s1m1 s1m1VarA;
        int i;
        v7q0 v7q0Var;
        wa0 wa0Var;
        int i2;
        int iMax;
        int iMax2;
        int iMax3;
        s1m1 s1m1Var2;
        i5u0 i5u0Var;
        boolean z;
        int i3;
        v7q0 v7q0Var2;
        String str2;
        String str3;
        int i4;
        Object next;
        keo keoVar;
        Object next2;
        int i5 = 2;
        jeo jeoVar = null;
        switch (this.a) {
            case 0:
                s1m1 s1m1Var3 = (s1m1) obj;
                r1m1 r1m1Var = (r1m1) obj2;
                int i6 = s1m1Var3.b;
                if (r1m1Var instanceof o1m1) {
                    return p2o1.j(s1m1Var3, ((o1m1) r1m1Var).a);
                }
                if (r1m1Var instanceof p1m1) {
                    long j = ((p1m1) r1m1Var).a;
                    int iC = l1d.C(i6);
                    if (iC != 0) {
                        if (iC == 1) {
                            Long l = s1m1Var3.d;
                            if (l != null) {
                                long jLongValue = j - l.longValue();
                                if (jLongValue < 0) {
                                    jLongValue = 0;
                                }
                                i4 = (int) jLongValue;
                            } else {
                                i4 = 0;
                            }
                            s1m1 s1m1VarA2 = s1m1.a(s1m1Var3, 0, s1m1Var3.c + i4, Long.valueOf(j), null, null, null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388595);
                            List list4 = s1m1VarA2.n;
                            if (!s1m1VarA2.m) {
                                return Next.h(s1m1VarA2);
                            }
                            i5u0 i5u0Var2 = s1m1VarA2.e;
                            int i7 = i5u0Var2.a;
                            int i8 = i5u0Var2.c;
                            if (i7 != 1) {
                                return Next.h(s1m1VarA2);
                            }
                            if (!s1m1VarA2.r) {
                                return Next.h(s1m1VarA2);
                            }
                            int iMax4 = i5u0Var2.b;
                            if (i7 == 1) {
                                iMax4 += Math.max(0, (int) (j - i5u0Var2.d));
                            }
                            int iMin = Math.min(iMax4, i8);
                            List list5 = s1m1VarA2.f38p;
                            ca80 it = o7h.u1(list5).iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                if (it.hasNext()) {
                                    int i9 = ((x1e) ((aa80) next).b).b;
                                    do {
                                        Object next3 = it.next();
                                        int i10 = ((x1e) ((aa80) next3).b).b;
                                        if (i9 > i10) {
                                            next = next3;
                                            i9 = i10;
                                        }
                                    } while (it.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            aa80 aa80Var = (aa80) next;
                            if (aa80Var == null) {
                                keoVar = null;
                            } else {
                                x1e x1eVar = (x1e) aa80Var.b;
                                if (iMin < x1eVar.b) {
                                    keoVar = null;
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    int i11 = 0;
                                    for (Object obj3 : list5) {
                                        int i12 = i11 + 1;
                                        if (i11 < 0) {
                                            p7h.T();
                                            throw null;
                                        }
                                        if (i11 != aa80Var.a) {
                                            arrayList.add(obj3);
                                        }
                                        i11 = i12;
                                    }
                                    keoVar = new keo(x1eVar, arrayList);
                                }
                            }
                            if (keoVar != null) {
                                s1m1 s1m1VarA3 = s1m1.a(s1m1VarA2, 0, 0, null, null, null, null, null, 0, null, false, null, false, null, 0, keoVar.b, null, false, 0, 8355839);
                                x1e x1eVar2 = keoVar.a;
                                return c710.c(s1m1VarA3, new ua0(x1eVar2.a, x1eVar2.b), list4);
                            }
                            int i13 = s1m1VarA2.o;
                            List<peo> listP = vhc.p(i8, list4);
                            ArrayList arrayList2 = new ArrayList(q7h.U(listP, 10));
                            for (peo peoVar : listP) {
                                arrayList2.add(new oeo(peoVar.a, peoVar.c + (peoVar.b >= 0 ? i13 : 0)));
                            }
                            Iterator it2 = arrayList2.iterator();
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (it2.hasNext()) {
                                    int i14 = ((oeo) next2).b;
                                    do {
                                        Object next4 = it2.next();
                                        int i15 = ((oeo) next4).b;
                                        if (i14 > i15) {
                                            next2 = next4;
                                            i14 = i15;
                                        }
                                    } while (it2.hasNext());
                                }
                            } else {
                                next2 = null;
                            }
                            oeo oeoVar = (oeo) next2;
                            if (oeoVar != null) {
                                iyl1 iyl1Var = oeoVar.a;
                                if (iMin >= oeoVar.b) {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj4 : list4) {
                                        if (!u890.j((iyl1) obj4, iyl1Var)) {
                                            arrayList3.add(obj4);
                                        }
                                    }
                                    jeoVar = new jeo(iyl1Var, arrayList3);
                                }
                            }
                            return jeoVar != null ? c710.c(s1m1VarA2, new va0(jeoVar.a), jeoVar.b) : Next.h(s1m1VarA2);
                        }
                        if (iC != 2) {
                            if (iC == 3) {
                                return Next.h(s1m1.a(s1m1Var3, 0, 0, Long.valueOf(j), null, null, null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388599));
                            }
                            if (iC != 4) {
                                eg.o();
                                return null;
                            }
                        }
                    }
                    return Next.j();
                }
                if (r1m1Var instanceof n1m1) {
                    n1m1 n1m1Var = (n1m1) r1m1Var;
                    i5u0 i5u0Var3 = n1m1Var.a;
                    s1m1 s1m1VarA4 = s1m1.a(s1m1Var3, 0, 0, null, i5u0Var3, null, null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388591);
                    String str4 = s1m1VarA4.l;
                    ylf1 ylf1Var = n1m1Var.b;
                    String str5 = ylf1Var.b;
                    Map map = ylf1Var.c;
                    String str6 = ylf1Var.a;
                    li20 li20Var = li20.c;
                    if (str5 != null && !str5.equals(s1m1Var3.u)) {
                        return p2o1.j(s1m1VarA4, li20Var);
                    }
                    int i16 = i5u0Var3.a;
                    int i17 = i5u0Var3.b;
                    if (i16 == 3) {
                        return p2o1.j(s1m1VarA4, li20Var);
                    }
                    i5u0 i5u0Var4 = s1m1Var3.e;
                    int i18 = s1m1VarA4.o;
                    boolean zJ = u890.j(str6, str4);
                    boolean z2 = zJ && str6 != null && (!((str2 = i5u0Var4.e) == null || (str3 = i5u0Var3.e) == null || u890.j(str2, str3)) || (i5u0Var4.a == 1 && i16 == 1 && i17 < 1000 && i5u0Var4.b > 1000));
                    if (!zJ || z2) {
                        List list6 = ytw0.f(map).b;
                        String str7 = (String) map.get("audio.fade_in_start_time");
                        Integer numC0 = str7 != null ? nhc1.c0(str7) : null;
                        String str8 = (String) map.get("duration");
                        Integer numC1 = str8 != null ? nhc1.c0(str8) : null;
                        boolean z3 = numC0 != null;
                        neo neoVar = neo.a;
                        if (zJ) {
                            s1m1Var = s1m1VarA4;
                        } else {
                            Integer num = s1m1VarA4.q;
                            List list7 = s1m1VarA4.n;
                            List list8 = s1m1VarA4.f38p;
                            Integer num2 = numC0;
                            long j2 = i5u0Var3.d;
                            s1m1Var = s1m1VarA4;
                            int i19 = i5u0Var4.c;
                            if (i19 > 0) {
                                str = str4;
                                int i20 = i5u0Var4.b;
                                list = list6;
                                int iMax5 = i5u0Var4.a != 1 ? i20 : Math.max(0, (int) (j2 - i5u0Var4.d)) + i20;
                                if (i19 - iMax5 <= 2500) {
                                    int iMin2 = Math.min(Math.max(i19, iMax5), num != null ? num.intValue() : Integer.MAX_VALUE);
                                    int iMax6 = Math.max(0, i17);
                                    List<x1e> list9 = list8;
                                    ArrayList arrayList4 = new ArrayList(q7h.U(list9, 10));
                                    for (x1e x1eVar3 : list9) {
                                        arrayList4.add(new x1e(x1eVar3.a, Math.max(0, x1eVar3.b - iMin2) + iMax6));
                                        iMin2 = iMin2;
                                    }
                                    int i21 = iMin2;
                                    List listP2 = vhc.p(i19, list7);
                                    ArrayList<peo> arrayList5 = new ArrayList();
                                    for (Object obj5 : listP2) {
                                        if (((peo) obj5).b >= 0) {
                                            arrayList5.add(obj5);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                                    for (peo peoVar2 : arrayList5) {
                                        arrayList6.add(new x1e(peoVar2.a, Math.max(0, (peoVar2.c + i18) - i21) + iMax6));
                                    }
                                    ArrayList arrayListN0 = o7h.N0(arrayList6, arrayList4);
                                    if (z3) {
                                        if (num != null) {
                                            i2 = 0;
                                            iMax = Math.max(0, num.intValue() - i21);
                                        } else {
                                            i2 = 0;
                                            iMax = 0;
                                        }
                                        if (num2 != null) {
                                            iMax2 = Math.max(i2, num2.intValue());
                                            iMax3 = Math.max(i2, -num2.intValue());
                                        } else {
                                            iMax2 = Math.max(i2, i17);
                                            iMax3 = 0;
                                        }
                                        leoVar = new leo((iMax + iMax2) - iMax3, arrayListN0);
                                    } else {
                                        leoVar = new meo(arrayListN0);
                                    }
                                }
                                if (leoVar instanceof leo) {
                                    leo leoVar2 = (leo) leoVar;
                                    s1m1VarA = s1m1.a(s1m1Var, 0, 0, null, null, null, null, null, 0, null, false, ylf1Var.a, false, list, Math.max(0, i18 + leoVar2.a), leoVar2.b, numC1, false, 0, 8263679);
                                } else if (leoVar instanceof meo) {
                                    s1m1VarA = s1m1.a(s1m1Var, 0, 0, null, null, null, null, null, 0, null, false, ylf1Var.a, false, list, 0, ((meo) leoVar).a, numC1, false, 0, 8280063);
                                } else {
                                    list2 = list;
                                    if (leoVar.equals(neoVar)) {
                                        if (str == null || i17 <= 1000) {
                                            list3 = list2;
                                        } else {
                                            List listP3 = vhc.p(i5u0Var3.c, list2);
                                            ArrayList arrayList7 = new ArrayList();
                                            for (Object obj6 : listP3) {
                                                if (((peo) obj6).c <= i17) {
                                                    arrayList7.add(obj6);
                                                }
                                            }
                                            ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
                                            Iterator it3 = arrayList7.iterator();
                                            while (it3.hasNext()) {
                                                arrayList8.add(((peo) it3.next()).a);
                                            }
                                            Set setP1 = o7h.p1(arrayList8);
                                            ArrayList arrayList9 = new ArrayList();
                                            for (Object obj7 : list2) {
                                                if (!setP1.contains((iyl1) obj7)) {
                                                    arrayList9.add(obj7);
                                                }
                                            }
                                            list3 = arrayList9;
                                        }
                                        s1m1VarA = s1m1.a(s1m1Var, 0, 0, null, null, null, null, null, 0, null, false, ylf1Var.a, false, list3, 0, z6x.a, numC1, false, 0, 8263679);
                                    } else {
                                        eg.o();
                                    }
                                }
                                if (s1m1Var.b == 4) {
                                    if (leoVar instanceof neo) {
                                        mmr0 mmr0VarK = p2o1.k(s1m1VarA, 2);
                                        i = 2;
                                        v7q0Var = new v7q0(s1m1.a((s1m1) mmr0VarK.a, 2, 0, null, null, null, null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388605), dm61.x0(new a0m1(2), (Set) mmr0VarK.b));
                                    } else {
                                        wa0Var = s1m1VarA.f;
                                        if (wa0Var != null) {
                                            s1m1VarA = s1m1.a(s1m1VarA, 0, 0, null, null, new ua0(wa0Var.a(), Math.max(0, i17)), null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388575);
                                        }
                                        v7q0Var = new v7q0(s1m1VarA);
                                    }
                                    s1m1Var2 = v7q0Var.a;
                                    i5u0Var = s1m1Var2.e;
                                    wa0 wa0Var2 = s1m1Var2.f;
                                    if (i5u0Var.a == 2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    i3 = s1m1Var2.b;
                                    if (i3 != i && z) {
                                        v7q0Var2 = new v7q0(s1m1.a(s1m1Var2, 3, 0, null, null, null, null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388597), Collections.singleton(new a0m1(3)));
                                    } else if (i3 != 3 && !z) {
                                        v7q0Var2 = new v7q0(s1m1.a(s1m1Var2, i, 0, null, null, null, null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388605), Collections.singleton(new a0m1(i)));
                                    } else if (i3 == 4 || !z) {
                                        v7q0Var2 = new v7q0(s1m1Var2);
                                    } else {
                                        List listN0 = s1m1Var2.n;
                                        List listO0 = s1m1Var2.f38p;
                                        boolean z4 = wa0Var2 instanceof ua0;
                                        if (z4) {
                                            ua0 ua0Var = (ua0) wa0Var2;
                                            listO0 = o7h.O0(new x1e(ua0Var.a, ua0Var.b), listO0);
                                        } else if (!(wa0Var2 instanceof va0) && wa0Var2 != null) {
                                            eg.o();
                                        }
                                        List list10 = listO0;
                                        if (wa0Var2 instanceof va0) {
                                            listN0 = o7h.N0(listN0, Collections.singletonList(((va0) wa0Var2).a));
                                        } else if (!z4 && wa0Var2 != null) {
                                            eg.o();
                                        }
                                        List list11 = listN0;
                                        mmr0 mmr0VarK2 = p2o1.k(s1m1Var2, 4);
                                        v7q0Var2 = new v7q0(s1m1.a((s1m1) mmr0VarK2.a, 3, 0, null, null, null, null, null, 0, null, false, null, false, list11, 0, list10, null, false, 0, 8347637), dm61.x0(new a0m1(3), (Set) mmr0VarK2.b));
                                    }
                                    LinkedHashSet linkedHashSetY0 = dm61.y0(v7q0Var.b, v7q0Var2.b);
                                    boolean zIsEmpty = linkedHashSetY0.isEmpty();
                                    s1m1 s1m1Var4 = v7q0Var2.a;
                                    return (zIsEmpty || !u890.j(s1m1Var4, s1m1Var3)) ? Next.i(s1m1Var4, linkedHashSetY0) : Next.j();
                                }
                                v7q0Var = new v7q0(s1m1VarA);
                            }
                            leoVar = neoVar;
                            if (leoVar instanceof leo) {
                                leo leoVar3 = (leo) leoVar;
                                s1m1VarA = s1m1.a(s1m1Var, 0, 0, null, null, null, null, null, 0, null, false, ylf1Var.a, false, list, Math.max(0, i18 + leoVar3.a), leoVar3.b, numC1, false, 0, 8263679);
                            } else if (leoVar instanceof meo) {
                                s1m1VarA = s1m1.a(s1m1Var, 0, 0, null, null, null, null, null, 0, null, false, ylf1Var.a, false, list, 0, ((meo) leoVar).a, numC1, false, 0, 8280063);
                            } else {
                                list2 = list;
                                if (leoVar.equals(neoVar)) {
                                    if (str == null) {
                                        list3 = list2;
                                    } else {
                                        list3 = list2;
                                    }
                                    s1m1VarA = s1m1.a(s1m1Var, 0, 0, null, null, null, null, null, 0, null, false, ylf1Var.a, false, list3, 0, z6x.a, numC1, false, 0, 8263679);
                                } else {
                                    eg.o();
                                }
                            }
                            if (s1m1Var.b == 4) {
                                if (leoVar instanceof neo) {
                                    wa0Var = s1m1VarA.f;
                                    if (wa0Var != null) {
                                        s1m1VarA = s1m1.a(s1m1VarA, 0, 0, null, null, new ua0(wa0Var.a(), Math.max(0, i17)), null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388575);
                                    }
                                    v7q0Var = new v7q0(s1m1VarA);
                                } else {
                                    mmr0 mmr0VarK3 = p2o1.k(s1m1VarA, 2);
                                    i = 2;
                                    v7q0Var = new v7q0(s1m1.a((s1m1) mmr0VarK3.a, 2, 0, null, null, null, null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388605), dm61.x0(new a0m1(2), (Set) mmr0VarK3.b));
                                }
                                s1m1Var2 = v7q0Var.a;
                                i5u0Var = s1m1Var2.e;
                                wa0 wa0Var3 = s1m1Var2.f;
                                if (i5u0Var.a == 2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                i3 = s1m1Var2.b;
                                if (i3 != i) {
                                }
                                if (i3 != 3) {
                                }
                                if (i3 == 4) {
                                    v7q0Var2 = new v7q0(s1m1Var2);
                                } else {
                                    v7q0Var2 = new v7q0(s1m1Var2);
                                }
                                LinkedHashSet linkedHashSetY1 = dm61.y0(v7q0Var.b, v7q0Var2.b);
                                boolean zIsEmpty2 = linkedHashSetY1.isEmpty();
                                s1m1 s1m1Var5 = v7q0Var2.a;
                                if (zIsEmpty2) {
                                }
                            }
                            v7q0Var = new v7q0(s1m1VarA);
                        }
                        str = str4;
                        list = list6;
                        leoVar = neoVar;
                        if (leoVar instanceof leo) {
                            leo leoVar4 = (leo) leoVar;
                            s1m1VarA = s1m1.a(s1m1Var, 0, 0, null, null, null, null, null, 0, null, false, ylf1Var.a, false, list, Math.max(0, i18 + leoVar4.a), leoVar4.b, numC1, false, 0, 8263679);
                        } else if (leoVar instanceof meo) {
                            s1m1VarA = s1m1.a(s1m1Var, 0, 0, null, null, null, null, null, 0, null, false, ylf1Var.a, false, list, 0, ((meo) leoVar).a, numC1, false, 0, 8280063);
                        } else {
                            list2 = list;
                            if (leoVar.equals(neoVar)) {
                                if (str == null) {
                                    list3 = list2;
                                } else {
                                    list3 = list2;
                                }
                                s1m1VarA = s1m1.a(s1m1Var, 0, 0, null, null, null, null, null, 0, null, false, ylf1Var.a, false, list3, 0, z6x.a, numC1, false, 0, 8263679);
                            } else {
                                eg.o();
                            }
                        }
                        if (s1m1Var.b == 4) {
                            if (leoVar instanceof neo) {
                                wa0Var = s1m1VarA.f;
                                if (wa0Var != null) {
                                    s1m1VarA = s1m1.a(s1m1VarA, 0, 0, null, null, new ua0(wa0Var.a(), Math.max(0, i17)), null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388575);
                                }
                                v7q0Var = new v7q0(s1m1VarA);
                            } else {
                                mmr0 mmr0VarK4 = p2o1.k(s1m1VarA, 2);
                                i = 2;
                                v7q0Var = new v7q0(s1m1.a((s1m1) mmr0VarK4.a, 2, 0, null, null, null, null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388605), dm61.x0(new a0m1(2), (Set) mmr0VarK4.b));
                            }
                            s1m1Var2 = v7q0Var.a;
                            i5u0Var = s1m1Var2.e;
                            wa0 wa0Var4 = s1m1Var2.f;
                            if (i5u0Var.a == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            i3 = s1m1Var2.b;
                            if (i3 != i) {
                            }
                            if (i3 != 3) {
                            }
                            if (i3 == 4) {
                                v7q0Var2 = new v7q0(s1m1Var2);
                            } else {
                                v7q0Var2 = new v7q0(s1m1Var2);
                            }
                            LinkedHashSet linkedHashSetY2 = dm61.y0(v7q0Var.b, v7q0Var2.b);
                            boolean zIsEmpty3 = linkedHashSetY2.isEmpty();
                            s1m1 s1m1Var6 = v7q0Var2.a;
                            if (zIsEmpty3) {
                            }
                        }
                        v7q0Var = new v7q0(s1m1VarA);
                    } else {
                        v7q0Var = new v7q0(s1m1VarA4);
                    }
                    i = 2;
                    s1m1Var2 = v7q0Var.a;
                    i5u0Var = s1m1Var2.e;
                    wa0 wa0Var5 = s1m1Var2.f;
                    if (i5u0Var.a == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i3 = s1m1Var2.b;
                    if (i3 != i) {
                    }
                    if (i3 != 3) {
                    }
                    if (i3 == 4) {
                        v7q0Var2 = new v7q0(s1m1Var2);
                    } else {
                        v7q0Var2 = new v7q0(s1m1Var2);
                    }
                    LinkedHashSet linkedHashSetY3 = dm61.y0(v7q0Var.b, v7q0Var2.b);
                    boolean zIsEmpty4 = linkedHashSetY3.isEmpty();
                    s1m1 s1m1Var7 = v7q0Var2.a;
                    if (zIsEmpty4) {
                    }
                }
                if (r1m1Var instanceof h1m1) {
                    Boolean bool = ((h1m1) r1m1Var).a;
                    if (bool == null) {
                        return Next.j();
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    return s1m1Var3.m == zBooleanValue ? Next.j() : Next.h(s1m1.a(s1m1Var3, 0, 0, null, null, null, null, null, 0, null, false, null, zBooleanValue, null, 0, null, null, false, 0, 8384511));
                }
                if (r1m1Var instanceof g1m1) {
                    g1m1 g1m1Var = (g1m1) r1m1Var;
                    boolean z5 = s1m1Var3.r;
                    boolean z6 = g1m1Var.a;
                    if (z5 == z6) {
                        return Next.j();
                    }
                    s1m1 s1m1VarA5 = s1m1.a(s1m1Var3, 0, 0, null, null, null, null, null, 0, null, false, null, false, null, 0, null, null, z6, 0, 8257535);
                    if (g1m1Var.a || i6 != 4) {
                        return Next.h(s1m1VarA5);
                    }
                    mmr0 mmr0VarK5 = p2o1.k(s1m1VarA5, 3);
                    return Next.i(s1m1.a((s1m1) mmr0VarK5.a, 2, 0, null, null, null, null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388605), dm61.x0(new a0m1(2), (Set) mmr0VarK5.b));
                }
                if (r1m1Var instanceof f1m1) {
                    f1m1 f1m1Var = (f1m1) r1m1Var;
                    String str9 = f1m1Var.b;
                    if (!p2o1.u(s1m1Var3, str9, 2)) {
                        return Next.j();
                    }
                    e58 e58Var = f1m1Var.a;
                    if (e58Var instanceof a58) {
                        return Next.i(s1m1.a(s1m1Var3, 0, 0, null, null, null, e58Var, null, 4, null, false, null, false, null, 0, null, null, false, 0, 8388287), f46.S0(new g0m1[]{new uzl1(str9), p2o1.y(s1m1Var3, 2)}));
                    }
                    if (e58Var instanceof d58) {
                        s1m1 s1m1VarA6 = s1m1.a(s1m1Var3, 0, 0, null, null, null, null, null, 3, null, false, null, false, null, 0, null, null, false, 0, 8388351);
                        d58 d58Var = (d58) e58Var;
                        String str10 = d58Var.a;
                        String str11 = d58Var.b;
                        String str12 = d58Var.c;
                        String str13 = s1m1Var3.l;
                        if (str13 == null) {
                            str13 = "";
                        }
                        return Next.i(s1m1VarA6, f46.S0(new g0m1[]{new e0m1(new seo(str10, str11, str12, str13, str9)), p2o1.y(s1m1Var3, 3)}));
                    }
                    eg.o();
                } else {
                    if (r1m1Var instanceof j1m1) {
                        j1m1 j1m1Var = (j1m1) r1m1Var;
                        String str14 = j1m1Var.b;
                        return !p2o1.u(s1m1Var3, str14, 3) ? Next.j() : Next.i(s1m1.a(s1m1Var3, 0, 0, null, null, null, null, j1m1Var.a, 4, null, false, null, false, null, 0, null, null, false, 0, 8388223), f46.S0(new g0m1[]{new uzl1(str14), p2o1.y(s1m1Var3, 4)}));
                    }
                    if (r1m1Var instanceof i1m1) {
                        i1m1 i1m1Var = (i1m1) r1m1Var;
                        return o610.d(s1m1Var3, 3, i1m1Var.a, i1m1Var.c, i1m1Var.b, i1m1Var.d);
                    }
                    if (r1m1Var instanceof m1m1) {
                        String str15 = ((m1m1) r1m1Var).a;
                        if (!p2o1.u(s1m1Var3, str15, 4)) {
                            return Next.j();
                        }
                        s1m1 s1m1VarA7 = s1m1.a(s1m1Var3, 0, 0, null, null, null, null, null, 0, null, true, null, false, null, 0, null, null, false, 0, 8387583);
                        vzl1 vzl1VarY = p2o1.y(s1m1Var3, 6);
                        e58 e58Var2 = s1m1Var3.g;
                        a58 a58Var = e58Var2 instanceof a58 ? (a58) e58Var2 : null;
                        if (a58Var != null) {
                            return Next.i(s1m1.a(s1m1VarA7, 0, 0, null, null, null, null, null, 6, null, false, null, false, null, 0, null, null, false, 0, 8388351), f46.S0(new g0m1[]{new c0m1(str15, a58Var.a), vzl1VarY}));
                        }
                        String str16 = s1m1Var3.h;
                        return str16 != null ? Next.i(s1m1.a(s1m1VarA7, 0, 0, null, null, null, null, null, 5, null, false, null, false, null, 0, null, null, false, 0, 8388351), f46.S0(new g0m1[]{new tzl1(str16, str15), vzl1VarY})) : o610.d(s1m1VarA7, 4, "no audio source", 3, str15, null);
                    }
                    if (r1m1Var instanceof k1m1) {
                        k1m1 k1m1Var = (k1m1) r1m1Var;
                        String str17 = k1m1Var.b;
                        if (!p2o1.u(s1m1Var3, str17, 5)) {
                            return Next.j();
                        }
                        s1m1 s1m1VarA8 = s1m1.a(s1m1Var3, 0, 0, null, null, null, null, null, 6, null, false, null, false, null, 0, null, null, false, 0, 8388351);
                        byte[] bArr = k1m1Var.a;
                        return Next.i(s1m1VarA8, f46.S0(new g0m1[]{new c0m1(str17, bArr), p2o1.x(s1m1Var3, 7, new veo(0, null, Integer.valueOf(bArr.length), 0, 0, 27))}));
                    }
                    if (r1m1Var instanceof l1m1) {
                        l1m1 l1m1Var = (l1m1) r1m1Var;
                        return o610.d(s1m1Var3, 5, l1m1Var.a, l1m1Var.c, l1m1Var.b, l1m1Var.d);
                    }
                    if (r1m1Var instanceof e1m1) {
                        String str18 = ((e1m1) r1m1Var).a;
                        return !p2o1.u(s1m1Var3, str18, 6) ? Next.j() : Next.i(s1m1.a(s1m1Var3, 0, 0, null, null, null, null, null, 7, null, false, null, false, null, 0, null, null, false, 0, 8388351), f46.S0(new g0m1[]{new f0m1(str18), p2o1.y(s1m1Var3, 9)}));
                    }
                    if (r1m1Var instanceof d1m1) {
                        d1m1 d1m1Var = (d1m1) r1m1Var;
                        return o610.d(s1m1Var3, 6, d1m1Var.a, d1m1Var.c, d1m1Var.b, null);
                    }
                    if (r1m1Var instanceof c1m1) {
                        return Next.j();
                    }
                    if (r1m1Var instanceof q1m1) {
                        return o810.a(s1m1Var3, (q1m1) r1m1Var);
                    }
                    eg.o();
                }
                return null;
            case 1:
                ehm0 ehm0Var = (ehm0) obj;
                u600 u600Var = (u600) obj2;
                if (u600Var instanceof dxz) {
                    return (ehm0Var.b.isEmpty() && ehm0Var.c == 4) ? Next.i(ehm0.a(ehm0Var, null, null, 3, 3), Effects.a(new uaw[]{new uaw(ehm0Var.a)})) : Next.j();
                }
                if (u600Var instanceof fzz) {
                    List list12 = ((fzz) u600Var).a;
                    return !list12.isEmpty() ? Next.h(ehm0.a(ehm0Var, null, list12, 2, 1)) : Next.h(ehm0.a(ehm0Var, null, null, 1, 3));
                }
                if (u600Var instanceof syz) {
                    return Next.h(ehm0.a(ehm0Var, null, null, 1, 3));
                }
                eg.o();
                return null;
            case 2:
                return xxb0.E.b((q4p0) obj, (q3p0) obj2);
            case 3:
                return d(obj, obj2);
            case 4:
                return e(obj, obj2);
            case 5:
                return f(obj, obj2);
            case 6:
                return g(obj, obj2);
            case 7:
                return (Next) j8y0.e.invoke(obj, obj2);
            case 8:
                return h(obj, obj2);
            case 9:
                return c((iaz0) obj, (a9z0) obj2);
            case 10:
                return i(obj, obj2);
            case 11:
                return j(obj, obj2);
            case 12:
                return k(obj, obj2);
            case 13:
                return l(obj, obj2);
            case 14:
                return m(obj, obj2);
            case 15:
                zc40 zc40Var = (zc40) obj2;
                u830 u830Var = new u830((id40) obj, (byte) 16);
                if (zc40Var instanceof zc40) {
                    return (Next) u830Var.invoke(zc40Var);
                }
                eg.o();
                return null;
            case 16:
                return n(obj, obj2);
            case 17:
                return o(obj, obj2);
            case 18:
                return p(obj, obj2);
            case 19:
                return q(obj, obj2);
            case 20:
                inc1 inc1Var = (inc1) obj2;
                if (inc1Var == null) {
                    eg.o();
                    return null;
                }
                List list13 = inc1Var.b;
                if (list13.contains(v281.e)) {
                    i5 = 3;
                } else if (list13.contains(v281.c)) {
                    i5 = 1;
                } else if (!list13.contains(v281.b) && !list13.contains(v281.d)) {
                    i5 = 0;
                }
                return Next.h((inc1Var.a || i5 == 3) ? new nnc1(i5) : mnc1.a);
            case 21:
                return gp71.m.d((khd1) obj, (tgd1) obj2);
            case 22:
                return r(obj, obj2);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return f4x0.v((hcz0) obj, (z8z0) obj2);
            case 24:
                return s(obj, obj2);
            default:
                fdj1 fdj1Var = (fdj1) obj;
                ji0 ji0Var = fdj1Var.a;
                vr10 vr10Var = (ybj1) ((tq80) obj2).a;
                if (u890.j(vr10Var, ey0.a)) {
                    return e4x0.w0(fdj1Var, "ad_tag");
                }
                if (u890.j(vr10Var, sxc.a)) {
                    return e4x0.w0(fdj1Var, "cta_button");
                }
                if (u890.j(vr10Var, sw50.a)) {
                    return e4x0.w0(fdj1Var, "header");
                }
                if (u890.j(vr10Var, bpd1.a)) {
                    return e4x0.w0(fdj1Var, "tagline");
                }
                if (vr10Var instanceof vr10) {
                    return vr10Var.a.b() ? Next.a(Effects.a(new heu[]{new heu(ji0Var)})) : Next.j();
                }
                if (u890.j(vr10Var, hgn0.a)) {
                    return Next.h(fdj1.a(fdj1Var, (ji0) null, (o2u0) null, true, false, false, false, false, 123));
                }
                if (u890.j(vr10Var, sjh1.a)) {
                    return Next.i(fdj1.a(fdj1Var, (ji0) null, (o2u0) null, false, false, false, false, false, 123), Effects.a(new x9s0[]{x9s0.a}));
                }
                if (vr10Var instanceof l7u0) {
                    dv0 dv0Var = ((l7u0) vr10Var).a;
                    fdj1 fdj1VarA = fdj1.a(fdj1Var, (ji0) null, (o2u0) null, false, false, false, dv0Var.a, fdj1Var.g || dv0Var.c(), 31);
                    if (dv0Var.b()) {
                        return Next.i(fdj1VarA, Effects.a(new heu[]{new heu(ji0Var)}));
                    }
                    return fdj1VarA.equals(fdj1Var) ? Next.j() : Next.h(fdj1VarA);
                }
                if (u890.j(vr10Var, lv7.a)) {
                    return Next.h(fdj1.a(fdj1Var, (ji0) null, (o2u0) null, true, false, false, false, false, 123));
                }
                if (vr10Var instanceof yjk1) {
                    boolean z7 = ((yjk1) vr10Var).a >= 50;
                    return fdj1Var.d == z7 ? Next.j() : Next.h(fdj1.a(fdj1Var, (ji0) null, (o2u0) null, false, z7, false, false, false, 119));
                }
                if (!(vr10Var instanceof zql1)) {
                    eg.o();
                    return null;
                }
                boolean z8 = fdj1Var.e;
                boolean z9 = ((zql1) vr10Var).a;
                return z8 == z9 ? Next.j() : Next.h(fdj1.a(fdj1Var, (ji0) null, (o2u0) null, false, false, z9, false, false, 111));
        }
    }

    public Next c(iaz0 iaz0Var, a9z0 a9z0Var) {
        if (a9z0Var.equals(k7z0.a)) {
            return Next.h(iaz0.b(iaz0Var, 1, (lwc) null, (kwc) null, (List) null, 14));
        }
        lwc kwcVar = null;
        if (a9z0Var instanceof b8z0) {
            bpd bpdVar = ((b8z0) a9z0Var).a;
            String str = bpdVar.a;
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    kwcVar = new lwc(str);
                }
            }
            return Next.h(iaz0.b(iaz0Var, 2, kwcVar, (kwc) null, bpdVar.c, 4));
        }
        if (a9z0Var instanceof o7z0) {
            o7z0 o7z0Var = (o7z0) a9z0Var;
            return Next.a(Collections.singleton(new s5z0(o7z0Var.a, o7z0Var.b)));
        }
        if (a9z0Var instanceof k8z0) {
            return Next.a(Collections.singleton(new g5z0(new ezn0(((k8z0) a9z0Var).a.a))));
        }
        if (a9z0Var instanceof y8z0) {
            if (!((y8z0) a9z0Var).a) {
                return Next.a(Collections.singleton(new g5z0(dzn0.b)));
            }
            xj61 xj61Var = new xj61();
            xj61Var.add(c5z0.a);
            xj61Var.add(a5z0.a);
            return Next.a(cwl1.j(xj61Var));
        }
        if (!(a9z0Var instanceof p7z0)) {
            eg.o();
            return null;
        }
        String str2 = ((p7z0) a9z0Var).a;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                kwcVar = new kwc(2131960788, Collections.singletonList(str2));
            }
        }
        lwc lwcVar = kwcVar;
        return !u890.j(iaz0Var.c, lwcVar) ? Next.h(iaz0.b(iaz0Var, 0, (lwc) null, lwcVar, (List) null, 11)) : Next.j();
    }
}
