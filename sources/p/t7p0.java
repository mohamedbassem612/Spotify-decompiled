package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import com.spotify.music.podcastinteractivity.polls.proto.PollOption;
import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.Entity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class t7p0 implements Update {
    public final /* synthetic */ byte a;
    public static final t7p0 b = new t7p0(0);
    public static final t7p0 c = new t7p0(1);
    public static final t7p0 d = new t7p0(2);
    public static final t7p0 e = new t7p0(3);
    public static final t7p0 f = new t7p0(4);
    public static final t7p0 g = new t7p0(5);
    public static final t7p0 h = new t7p0(6);
    public static final t7p0 i = new t7p0(7);
    public static final t7p0 j = new t7p0(8);
    public static final t7p0 k = new t7p0(9);
    public static final t7p0 l = new t7p0(10);
    public static final t7p0 m = new t7p0(11);
    public static final t7p0 n = new t7p0(12);
    public static final t7p0 o = new t7p0(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t7p0 f37p = new t7p0(14);
    public static final t7p0 q = new t7p0(15);
    public static final t7p0 r = new t7p0(16);
    public static final t7p0 s = new t7p0(17);
    public static final t7p0 t = new t7p0(18);
    public static final t7p0 u = new t7p0(19);
    public static final t7p0 v = new t7p0(20);
    public static final t7p0 w = new t7p0(21);
    public static final t7p0 x = new t7p0(22);
    public static final t7p0 y = new t7p0(23);
    public static final t7p0 z = new t7p0(24);
    public static final t7p0 A = new t7p0(25);
    public static final t7p0 B = new t7p0(26);
    public static final t7p0 C = new t7p0(27);
    public static final t7p0 D = new t7p0(28);
    public static final t7p0 E = new t7p0(29);

    public /* synthetic */ t7p0(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0161  */
    /* JADX WARN: Code duplicated, block: B:68:0x0195  */
    private final Next c(Object obj, Object obj2) {
        long jLongValue;
        long jLongValue2;
        qfw0 qfw0Var = (qfw0) obj;
        rdw0 rdw0Var = (kew0) obj2;
        i091 i091Var = qfw0Var.e;
        boolean z2 = qfw0Var.l;
        zkm zkmVar = qfw0Var.i;
        xii1 xii1Var = qfw0Var.n;
        boolean z3 = qfw0Var.d;
        boolean z4 = qfw0Var.c;
        sz20 sz20Var = qfw0Var.g;
        boolean z5 = sz20Var.a;
        boolean z6 = qfw0Var.j;
        sbw0 sbw0Var = qfw0Var.a;
        if (rdw0Var instanceof rdw0) {
            rdw0 rdw0Var2 = rdw0Var;
            return u890.j(rdw0Var2.a, sbw0Var) ? Next.j() : Next.h(qfw0.a(qfw0Var, rdw0Var2.a, false, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16382));
        }
        if (rdw0Var instanceof qdw0) {
            return mp10.q(qfw0Var, qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, new sz20(((qdw0) rdw0Var).a, sz20Var.b), (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16319));
        }
        if (rdw0Var instanceof ydw0) {
            return mp10.q(qfw0Var, qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, new sz20(z5, ((ydw0) rdw0Var).a), (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16319));
        }
        if (rdw0Var instanceof tdw0) {
            return Next.h(qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, ((tdw0) rdw0Var).a, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16255));
        }
        if (rdw0Var instanceof bew0) {
            if (!((bew0) rdw0Var).a) {
                return Next.h(qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 1993));
            }
            if (z6) {
                return Next.j();
            }
            if (xii1Var != null && !z4 && !z2) {
                return Next.i(qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, true, xii1Var, (xii1) null, Entity.SERP_METADATA_FIELD_NUMBER), mp10.t(qfw0Var, 0L, xii1Var.a));
            }
            if ((sbw0Var.g && z3) || !sbw0Var.i) {
                return Next.j();
            }
            if (!fqo1.C(qfw0Var.h) || (sbw0Var.g && z3)) {
                qfw0 qfw0VarA = qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, true, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16351);
                Long l2 = sbw0Var.k;
                if (l2 == null) {
                    jLongValue = sbw0Var.e;
                } else {
                    if (!z3) {
                        l2 = null;
                    }
                    if (l2 != null) {
                        jLongValue = l2.longValue();
                    } else {
                        jLongValue = sbw0Var.e;
                    }
                }
                return Next.i(qfw0VarA, Collections.singleton(new kcw0(jLongValue)));
            }
            qfw0 qfw0VarA2 = qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, true, (xii1) null, (xii1) null, 14335);
            Long l3 = sbw0Var.k;
            if (l3 == null) {
                jLongValue2 = sbw0Var.e;
            } else {
                if (!z3) {
                    l3 = null;
                }
                if (l3 != null) {
                    jLongValue2 = l3.longValue();
                } else {
                    jLongValue2 = sbw0Var.e;
                }
            }
            return Next.i(qfw0VarA2, mp10.t(qfw0Var, jLongValue2, (tv80) null));
        }
        boolean z7 = rdw0Var instanceof xdw0;
        acw0 acw0Var = acw0.a;
        if (z7) {
            boolean z8 = ((xdw0) rdw0Var).a;
            boolean z9 = qfw0Var.k && !z8;
            xii1 xii1Var2 = qfw0Var.m;
            if (z8) {
                xii1Var2 = null;
            }
            if (z8) {
                xii1Var = null;
            }
            qfw0 qfw0VarA3 = qfw0.a(qfw0Var, (sbw0) null, false, false, z8, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, z9, false, xii1Var2, xii1Var, 3063);
            if (!sz20Var.a() || z6) {
                return Next.h(qfw0VarA3);
            }
            if (qfw0VarA3.b()) {
                return Next.i(qfw0.a(qfw0VarA3, (sbw0) null, false, false, true, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16375), Collections.singleton(acw0Var));
            }
            xj61 xj61Var = new xj61();
            if (z4) {
                xj61Var.add(new jcw0(z8));
            }
            if (!z8 && zkmVar.d && zkmVar.c && z5) {
                xj61Var.add(bcw0.a);
            }
            return Next.i(qfw0VarA3, cwl1.j(xj61Var));
        }
        if (rdw0Var instanceof sdw0) {
            zkm zkmVar2 = ((sdw0) rdw0Var).a;
            qfw0 qfw0VarA4 = qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, (hwt) null, zkmVar2, false, false, false, (xii1) null, (xii1) null, 16127);
            xj61 xj61Var2 = new xj61();
            boolean z10 = zkmVar2.d;
            boolean z11 = zkmVar2.c;
            if (z10 && z11 && z5 && mp10.v(zkmVar2, sbw0Var)) {
                xj61Var2.add(ccw0.a);
            }
            if (i091Var != null) {
                o091 o091Var = i091Var.h;
                boolean z12 = (i091Var.a == null || u890.j(o091Var, l091.a) || (o091Var instanceof k091)) ? false : true;
                if (!z10 && zkmVar.d && z5 && z12 && mp10.v(zkmVar2, sbw0Var)) {
                    xj61Var2.add(hcw0.a);
                }
            }
            if (z5 && z10 && z11 && !z3) {
                xj61Var2.add(acw0Var);
            }
            xj61 xj61VarJ = cwl1.j(xj61Var2);
            if (sbw0Var.g && z5 && !z6 && z10 && z11 && mp10.v(zkmVar2, sbw0Var)) {
                qfw0VarA4 = qfw0.a(qfw0VarA4, (sbw0) null, true, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16381);
            } else if (!z4) {
                qfw0VarA4 = qfw0.a(qfw0VarA4, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16381);
            }
            qfw0 qfw0Var2 = qfw0VarA4;
            return !qfw0Var2.equals(qfw0Var) ? Next.i(qfw0Var2, xj61VarJ) : Next.j();
        }
        if (rdw0Var instanceof iew0) {
            return Next.h(qfw0.a(qfw0Var, (sbw0) null, false, false, false, ((iew0) rdw0Var).a, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16367));
        }
        if (rdw0Var instanceof few0) {
            few0 few0Var = (few0) rdw0Var;
            if (!sz20Var.a() || z6) {
                return Next.j();
            }
            return Next.a(Collections.singleton(new zbw0(sbw0Var.d, sbw0Var.a, sbw0Var.c, few0Var.b, few0Var.a, few0Var.c, (zkmVar.d && zkmVar.c && mp10.v(zkmVar, sbw0Var)) ? false : true, 128)));
        }
        boolean zEquals = rdw0Var.equals(wdw0.a);
        vbw0 vbw0Var = vbw0.a;
        wbw0 wbw0Var = wbw0.a;
        mcw0 mcw0Var = mcw0.a;
        if (zEquals) {
            if (z3) {
                return Next.j();
            }
            xj61 xj61Var3 = new xj61();
            xj61Var3.add(acw0Var);
            if (sbw0Var.g) {
                xj61Var3.add(mcw0Var);
                xj61Var3.add(wbw0Var);
                xj61Var3.add(vbw0Var);
            }
            xj61 xj61VarJ2 = cwl1.j(xj61Var3);
            return sbw0Var.g ? Next.i(qfw0.a(qfw0Var, (sbw0) null, false, false, true, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 993), xj61VarJ2) : Next.i(qfw0.a(qfw0Var, (sbw0) null, false, false, true, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 3063), xj61VarJ2);
        }
        if (rdw0Var instanceof jew0) {
            jew0 jew0Var = (jew0) rdw0Var;
            if (z6 || (!z3 && z4)) {
                return Next.j();
            }
            boolean z13 = (z4 || z2) ? false : true;
            xj61 xj61Var4 = new xj61();
            tv80 tv80Var = jew0Var.a;
            xj61Var4.add(new ocw0(tv80Var));
            if (z2) {
                xj61Var4.add(new xbw0(tv80Var));
            } else if (z13) {
                xj61Var4.addAll(mp10.t(qfw0Var, 0L, tv80Var));
            }
            return Next.i(qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, true, z2 || z13, new xii1(tv80Var), (xii1) null, 1015), cwl1.j(xj61Var4));
        }
        if (rdw0Var instanceof dew0) {
            dew0 dew0Var = (dew0) rdw0Var;
            if (!z4) {
                return Next.j();
            }
            if (i091Var == null) {
                return Next.j();
            }
            return !(i091Var.h instanceof k091) ? Next.j() : Next.a(Collections.singleton(new gcw0(sbw0Var.d, dew0Var.a)));
        }
        if (rdw0Var instanceof gew0) {
            long j2 = ((gew0) rdw0Var).a;
            if (!z4) {
                return Next.j();
            }
            xj61 xj61Var5 = new xj61();
            xj61Var5.add(new icw0(j2));
            if (sbw0Var.f) {
                xj61Var5.add(new dcw0(mp10.n(sbw0Var), j2));
            }
            return Next.a(cwl1.j(xj61Var5));
        }
        if (rdw0Var.equals(vdw0.a)) {
            return (qfw0Var.f && sz20Var.a() && !z6) ? Next.h(qfw0.a(qfw0Var, (sbw0) null, true, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16349)) : Next.j();
        }
        if (rdw0Var.equals(aew0.a)) {
            if (!sz20Var.a() || z6) {
                return Next.j();
            }
            xj61 xj61Var6 = new xj61();
            if (sbw0Var.f) {
                xj61Var6.add(new lcw0(mp10.n(sbw0Var)));
            }
            return Next.i(qfw0.a(qfw0Var, (sbw0) null, true, true, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 2009), cwl1.j(xj61Var6));
        }
        if (rdw0Var.equals(zdw0.a)) {
            return Next.h(qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, qfw0Var.m, Entity.SERP_METADATA_FIELD_NUMBER));
        }
        if (rdw0Var.equals(hew0.a)) {
            return Next.h(qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16363));
        }
        if (rdw0Var.equals(cew0.a)) {
            return Next.i(qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, new sz20(false, true), (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 1929), Collections.singleton(ecw0.a));
        }
        if (!rdw0Var.equals(udw0.a)) {
            if (!rdw0Var.equals(eew0.a)) {
                eg.o();
                return null;
            }
            if (!z6) {
                return Next.j();
            }
            qfw0 qfw0VarA5 = qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 15871);
            return (qfw0VarA5.g.a() && !qfw0VarA5.j && qfw0VarA5.a.h) ? Next.i(qfw0VarA5, Collections.singleton(vbw0Var)) : Next.h(qfw0VarA5);
        }
        if (z6) {
            return Next.j();
        }
        xj61 xj61Var7 = new xj61();
        xj61Var7.add(wbw0Var);
        xj61Var7.add(mcw0Var);
        if (qfw0Var.c()) {
            xj61Var7.add(acw0Var);
        }
        if (sbw0Var.f) {
            xj61Var7.add(ncw0.a);
            xj61Var7.add(new fcw0(mp10.n(sbw0Var)));
        }
        return Next.i(qfw0.a(qfw0Var, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, true, false, false, (xii1) null, (xii1) null, 1481), cwl1.j(xj61Var7));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[LOOP:1: B:38:0x00a9->B:81:?, LOOP_END, SYNTHETIC] */
    private final Next d(Object obj, Object obj2) {
        w5y0 y5y0Var;
        Object next;
        Set setSingleton;
        Iterator it;
        ou80 ou80Var;
        a6y0 a6y0Var = (a6y0) obj;
        tq80 tq80Var = (tq80) obj2;
        r5y0 r5y0Var = (u5y0) tq80Var.a;
        String str = null;
        if (r5y0Var instanceof r5y0) {
            if (a6y0Var instanceof x5y0) {
                return Next.j();
            }
            if (a6y0Var.a()) {
                return Next.a(Collections.singleton(new o5y0("", "")));
            }
            String str2 = r5y0Var.a;
            x5y0 x5y0Var = new x5y0(str2, a6y0Var.b(), a6y0Var.a());
            tqw tqwVar = tq80Var.b;
            if (tqwVar != null && (ou80Var = n3o1.y(tqwVar).a) != null) {
                str = ou80Var.a;
            }
            return Next.i(x5y0Var, Collections.singleton(new p5y0(str2, str, a6y0Var.b())));
        }
        if (!(r5y0Var instanceof s5y0)) {
            if (u890.j(r5y0Var, t5y0.a)) {
                return Next.j();
            }
            if (r5y0Var instanceof q5y0) {
                return Next.h(z47.w(a6y0Var, ((q5y0) r5y0Var).a));
            }
            eg.o();
            return null;
        }
        List list = ((s5y0) r5y0Var).a;
        String uri = a6y0Var.getUri();
        boolean zB = a6y0Var.b();
        List list2 = list;
        boolean z2 = list2 instanceof Collection;
        if (!z2 || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    if (z2 && list2.isEmpty()) {
                        y5y0Var = new w5y0(uri, zB, false);
                        break;
                    }
                    it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            y5y0Var = new w5y0(uri, zB, false);
                            break;
                        }
                        if (((n4y0) it.next()) instanceof l4y0) {
                            y5y0Var = new z5y0(uri, zB, false);
                            break;
                        }
                    }
                } else if (((n4y0) it2.next()) instanceof g4y0) {
                    y5y0Var = new y5y0(uri, 4, zB);
                }
            }
        } else if (z2) {
            it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    y5y0Var = new w5y0(uri, zB, false);
                    break;
                }
                if (((n4y0) it.next()) instanceof l4y0) {
                    y5y0Var = new z5y0(uri, zB, false);
                    break;
                }
            }
        } else {
            it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    y5y0Var = new w5y0(uri, zB, false);
                    break;
                }
                if (((n4y0) it.next()) instanceof l4y0) {
                    y5y0Var = new z5y0(uri, zB, false);
                    break;
                }
            }
        }
        a6y0 a6y0VarW = z47.w(y5y0Var, a6y0Var.a());
        Iterator it3 = list2.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!(((n4y0) next) instanceof h4y0));
        n4y0 n4y0Var = (n4y0) next;
        if (n4y0Var != null) {
            String strA = n4y0Var.a();
            h4y0 h4y0Var = n4y0Var instanceof h4y0 ? (h4y0) n4y0Var : null;
            str = h4y0Var != null ? h4y0Var.b : null;
            setSingleton = Collections.singleton(new o5y0(strA, str != null ? str : ""));
        } else {
            setSingleton = w7x.a;
        }
        return Next.i(a6y0VarW, setSingleton);
    }

    private final Next e(Object obj, Object obj2) {
        qay0 qay0Var = (qay0) obj;
        kay0 kay0Var = (kay0) obj2;
        if (kay0Var instanceof fay0) {
            fay0 fay0Var = (fay0) kay0Var;
            return Next.h(qay0.a(qay0Var, new may0(fay0Var.a, fay0Var.d, fay0Var.b, fay0Var.c), (wkt) null, 13));
        }
        if (kay0Var instanceof eay0) {
            return Next.h(qay0.a(qay0Var, lay0.a, (wkt) null, 13));
        }
        if (kay0Var instanceof hay0) {
            return Next.i(qay0.a(qay0Var, nay0.a, (wkt) null, 13), Collections.singleton(new cay0(qay0Var.a)));
        }
        if (kay0Var instanceof jay0) {
            return Next.h(qay0.a(qay0Var, (oay0) null, ((jay0) kay0Var).a, 7));
        }
        if (!(kay0Var instanceof gay0)) {
            if (kay0Var instanceof iay0) {
                iay0 iay0Var = (iay0) kay0Var;
                return Next.i(qay0Var, Collections.singleton(new bay0(iay0Var.b, iay0Var.c, iay0Var.d)));
            }
            eg.o();
            return null;
        }
        if (!(qay0Var.b instanceof may0)) {
            return Next.j();
        }
        gay0 gay0Var = (gay0) kay0Var;
        return Next.i(qay0.a(qay0Var, (oay0) null, (wkt) null, 7), Collections.singleton(new day0(qay0Var.c, gay0Var.a, gay0Var.b, gay0Var.c)));
    }

    private final Next f(Object obj, Object obj2) {
        kby0 kby0Var = (mby0) obj;
        hby0 hby0Var = (hby0) obj2;
        if (hby0Var instanceof cby0) {
            cby0 cby0Var = (cby0) hby0Var;
            List list = cby0Var.d;
            x8d1 x8d1Var = (x8d1) o7h.t0(0, list);
            return x8d1Var == null ? Next.h(new jby0(kby0Var.b(), kby0Var.a(), kby0Var.g(), null)) : Next.i(new kby0(kby0Var.b(), kby0Var.a(), kby0Var.g(), (wkt) null, cby0Var.a, cby0Var.b, cby0Var.c, x8d1Var.a(), list, 0), Collections.singleton(new yay0(list, 0)));
        }
        if (hby0Var instanceof fby0) {
            if (kby0Var instanceof lby0) {
                return Next.h(lby0.h((lby0) kby0Var, 0, ((fby0) hby0Var).a, 7));
            }
            if (kby0Var instanceof jby0) {
                return Next.h(jby0.h((jby0) kby0Var, 0, ((fby0) hby0Var).a, 7));
            }
            if (kby0Var instanceof kby0) {
                return Next.h(kby0.h(kby0Var, 0, ((fby0) hby0Var).a, (llw0) null, 0, 1015));
            }
            eg.o();
            return null;
        }
        if (hby0Var instanceof dby0) {
            if (!(kby0Var instanceof kby0)) {
                return Next.j();
            }
            kby0 kby0Var2 = kby0Var;
            dby0 dby0Var = (dby0) hby0Var;
            return Next.i(kby0.h(kby0Var2, 0, (wkt) null, (llw0) null, 0, 1015), Collections.singleton(new aby0(kby0Var2, dby0Var.a, dby0Var.b, dby0Var.c)));
        }
        if (hby0Var instanceof gby0) {
            gby0 gby0Var = (gby0) hby0Var;
            if (!(kby0Var instanceof kby0)) {
                return Next.j();
            }
            kby0 kby0Var3 = kby0Var;
            x8d1 x8d1Var2 = (x8d1) o7h.t0(gby0Var.a, kby0Var3.i);
            return x8d1Var2 == null ? Next.j() : Next.h(kby0.h(kby0Var3, 0, (wkt) null, x8d1Var2.a(), gby0Var.a, 383));
        }
        if (hby0Var instanceof bby0) {
            return Next.h(new jby0(kby0Var.b(), kby0Var.a(), kby0Var.g(), null));
        }
        if (hby0Var instanceof eby0) {
            return Next.i(new lby0(kby0Var.b(), kby0Var.a(), kby0Var.g(), null), Collections.singleton(new zay0(kby0Var.g(), kby0Var.a())));
        }
        eg.o();
        return null;
    }

    private final Next g(Object obj, Object obj2) {
        a401 a401Var = (a401) obj;
        w301 w301Var = (y301) obj2;
        z301 z301Var = a401Var.a;
        if (w301Var.equals(l301.a)) {
            return Next.h(a401.a(a401Var, (z301) null, false, true, 3));
        }
        if (w301Var.equals(n301.a)) {
            return Next.h(a401.a(a401Var, (z301) null, false, true, 3));
        }
        if (w301Var instanceof m301) {
            m301 m301Var = (m301) w301Var;
            return Next.a(Collections.singleton(new f301(new b301(m301Var.a, m301Var.b, m301Var.c), l1d.m("Failed to add reaction: ", m301Var.d.getMessage()))));
        }
        if (w301Var instanceof q301) {
            int length = z301Var.d.length();
            int i2 = z301Var.c;
            if (length > 0) {
                i2--;
            }
            return Next.i(a401.a(a401Var, z301.a(z301Var, i2, ""), true, false, 4), Collections.singleton(new c301(z301Var.e, z301Var.a, z301Var.d)));
        }
        if (w301Var instanceof s301) {
            String str = ((s301) w301Var).a;
            int length2 = z301Var.d.length();
            int i3 = z301Var.c;
            if (length2 == 0) {
                i3++;
            }
            return Next.i(a401.a(a401Var, z301.a(z301Var, i3, str), true, false, 4), Collections.singleton(new b301(z301Var.e, z301Var.a, str)));
        }
        if (w301Var.equals(t301.a)) {
            String str2 = z301Var.e;
            String str3 = z301Var.a;
            return Next.i(a401Var, Collections.singleton(new e301(str2, str3, new lik1(str3))));
        }
        if (w301Var.equals(u301.a)) {
            return Next.h(a401.a(a401Var, (z301) null, false, true, 3));
        }
        if (w301Var instanceof v301) {
            v301 v301Var = (v301) w301Var;
            return Next.a(Collections.singleton(new f301(new c301(v301Var.a, v301Var.b, v301Var.c), l1d.m("Failed to add reaction: ", v301Var.d.getMessage()))));
        }
        if (w301Var instanceof w301) {
            d301 d301Var = w301Var.a;
            if ((d301Var instanceof b301) || (d301Var instanceof c301)) {
                return Next.a(Collections.singleton(d301Var));
            }
            eg.o();
            return null;
        }
        if (w301Var instanceof x301) {
            c301 c301Var = ((x301) w301Var).a;
            if (c301Var instanceof b301) {
                return Next.h(a401.a(a401Var, z301.a(z301Var, z301Var.c - 1, ""), false, false, 6));
            }
            if (c301Var instanceof c301) {
                return Next.h(a401.a(a401Var, z301.a(z301Var, z301Var.c + 1, c301Var.c), false, false, 6));
            }
            eg.o();
            return null;
        }
        if (w301Var.equals(o301.a)) {
            return Next.h(a401.a(a401Var, (z301) null, false, false, 3));
        }
        if ((w301Var instanceof p301) || (w301Var instanceof r301)) {
            return Next.j();
        }
        eg.o();
        return null;
    }

    private final Next h(Object obj, Object obj2) {
        Object next;
        String str;
        Optional optionalEmpty;
        yq01 yq01Var;
        zu01 zu01Var = (zu01) obj;
        ns01 ns01Var = (vs01) obj2;
        List list = zu01Var.d;
        int i2 = zu01Var.b;
        lsg lsgVar = zu01Var.g;
        Logger.b("Recents :: event -> ".concat(ns01Var.getClass().getSimpleName()), new Object[0]);
        if (ns01Var instanceof ns01) {
            mv01 mv01Var = ns01Var.a;
            ArrayList arrayList = mv01Var.a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof tt01) {
                    arrayList2.add(obj3);
                }
            }
            zu01 zu01VarA = zu01.a(zu01Var, arrayList, arrayList2.size(), mv01Var.b, null, null, null, mv01Var.c, false, mv01Var.d, true, 440);
            return Next.i(zu01VarA, Collections.singleton(new gs01(zu01VarA)));
        }
        if (ns01Var instanceof os01) {
            lv01 lv01Var = ((os01) ns01Var).a;
            return Next.i(zu01.a(zu01Var, null, 0, 0, null, lv01Var.c, lv01Var.d, new tr80(0, lv01Var.a, 1), false, null, false, 1935), Collections.singleton(new ds01(lv01Var)));
        }
        Integer num = null;
        if (ns01Var instanceof ks01) {
            if ((lsgVar != null ? (Integer) lsgVar.n() : null) == null || ((Number) lsgVar.n()).intValue() > i2 || i2 >= zu01Var.c) {
                return Next.j();
            }
            int iIntValue = ((Number) lsgVar.n()).intValue();
            if (iIntValue <= i2) {
                iIntValue += 15;
            }
            zu01 zu01VarA2 = zu01.a(zu01Var, null, 0, 0, null, null, null, new tr80(0, iIntValue, 1), false, null, false, 1983);
            return Next.i(zu01VarA2, Collections.singleton(new ds01(gyo1.T(zu01VarA2))));
        }
        if (ns01Var instanceof ls01) {
            ls01 ls01Var = (ls01) ns01Var;
            zu01 zu01VarA3 = zu01.a(zu01Var, z6x.a, 0, 0, null, ls01Var.a, ls01Var.b, null, false, null, false, 1994);
            return Next.i(zu01VarA3, f46.S0(new vxo1[]{new gs01(zu01VarA3), new ds01(gyo1.T(zu01VarA3))}));
        }
        if (ns01Var instanceof rs01) {
            zu01 zu01VarA4 = zu01.a(zu01Var, null, 0, 0, null, ((rs01) ns01Var).a, null, null, false, null, false, 2031);
            return Next.i(zu01VarA4, Collections.singleton(new ds01(gyo1.T(zu01VarA4))));
        }
        if (ns01Var instanceof us01) {
            String str2 = ((us01) ns01Var).a;
            zu01 zu01VarA5 = zu01.a(zu01Var, null, 0, 0, list.contains(str2) ? o7h.J0(list, str2) : o7h.O0(str2, list), null, null, null, false, null, false, 2039);
            return Next.i(zu01VarA5, Collections.singleton(new ds01(gyo1.T(zu01VarA5))));
        }
        if (ns01Var instanceof ms01) {
            ms01 ms01Var = (ms01) ns01Var;
            return Next.i(zu01Var, Collections.singleton(new zr01(ms01Var.a, ms01Var.b)));
        }
        if (!(ns01Var instanceof ps01)) {
            if (ns01Var instanceof is01) {
                is01 is01Var = (is01) ns01Var;
                return Next.i(zu01Var, Collections.singleton(new as01(is01Var.a, is01Var.b)));
            }
            if (ns01Var instanceof qs01) {
                return Next.i(zu01Var, f46.S0(new vxo1[]{new fs01(((qs01) ns01Var).a), new ds01(gyo1.T(zu01Var))}));
            }
            if (ns01Var instanceof ts01) {
                return Next.i(zu01Var, Collections.singleton(new es01(((ts01) ns01Var).a)));
            }
            if (ns01Var instanceof js01) {
                zu01 zu01VarA6 = zu01.a(zu01Var, null, 0, 0, ((js01) ns01Var).a, null, null, null, false, null, false, 2039);
                return Next.i(zu01VarA6, Collections.singleton(new ds01(gyo1.T(zu01VarA6))));
            }
            if (ns01Var instanceof ss01) {
                ss01 ss01Var = (ss01) ns01Var;
                return Next.i(zu01Var, Collections.singleton(new bs01(ss01Var.a, ss01Var.b)));
            }
            if (ns01Var instanceof hs01) {
                hs01 hs01Var = (hs01) ns01Var;
                return Next.i(zu01Var, Collections.singleton(new yr01(hs01Var.a, hs01Var.b, hs01Var.c)));
            }
            eg.o();
            return null;
        }
        ps01 ps01Var = (ps01) ns01Var;
        String str3 = ps01Var.b;
        if (!ps01Var.e) {
            return Next.i(zu01Var, Collections.singleton(new fs01(str3)));
        }
        String str4 = ps01Var.c;
        List list2 = zu01Var.a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list2) {
            if (obj4 instanceof tt01) {
                arrayList3.add(obj4);
            }
        }
        Iterator it = arrayList3.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            yq01Var = ((tt01) next).a.m;
        } while (!u890.j(yq01Var != null ? yq01Var.a : null, str4));
        tt01 tt01Var = (tt01) next;
        if (tt01Var != null && (str = tt01Var.a.b) != null) {
            try {
                optionalEmpty = Optional.of(new y6b1(str, true));
            } catch (SpotifyUriParserException unused) {
                optionalEmpty = Optional.empty();
            }
            num = (y6b1) optionalEmpty.orElse(null);
        }
        return Next.i(zu01Var, Collections.singleton(new cs01(ps01Var.a, str3, num, ps01Var.d)));
    }

    private final Next i(Object obj, Object obj2) {
        hh11 hh11Var = (hh11) obj;
        ah11 ah11Var = (gh11) obj2;
        if (ah11Var instanceof bh11) {
            hh11Var.getClass();
            boolean z2 = ((bh11) ah11Var).a;
            return Next.i(hh11.a(hh11Var, z2), Collections.singleton(new rg11(hh11Var.a, z2)));
        }
        if (ah11Var instanceof ah11) {
            hh11Var.getClass();
            return Next.h(hh11.a(hh11Var, ah11Var.a));
        }
        if (ah11Var instanceof ch11) {
            hh11Var.getClass();
            return Next.i(hh11.a(hh11Var, ((ch11) ah11Var).a), Collections.singleton(qg11.c));
        }
        if (ah11Var instanceof fh11) {
            hh11Var.getClass();
            return !hh11Var.h ? Next.j() : Next.a(Collections.singleton(new pg11(hh11Var.a)));
        }
        if (ah11Var instanceof eh11) {
            return Next.h(((eh11) ah11Var).a);
        }
        if (ah11Var instanceof dh11) {
            return Next.a(Collections.singleton(og11.c));
        }
        eg.o();
        return null;
    }

    private final Next j(Object obj, Object obj2) {
        x821 x821Var = (x821) obj;
        v821 v821Var = (v821) obj2;
        String str = x821Var.a;
        String str2 = x821Var.b;
        if (v821Var instanceof u821) {
            return x821Var.h != null ? Next.h(x821.a(x821Var, false, true, 223)) : Next.i(x821.a(x821Var, true, false, 239), Collections.singleton(new n821(str, str2)));
        }
        if (v821Var instanceof r821) {
            return Next.i(x821.a(x821Var, true, false, 207), Collections.singleton(new n821(str, str2)));
        }
        if (v821Var instanceof q821) {
            return Next.h(x821.a(x821Var, false, false, 223));
        }
        if (v821Var instanceof s821) {
            return Next.i(x821.a(x821Var, false, false, 239), Collections.singleton(p821.a));
        }
        if (v821Var instanceof t821) {
            return Next.i(x821.a(x821Var, false, false, 239), Collections.singleton(new o821(str2)));
        }
        eg.o();
        return null;
    }

    private final Next k(Object obj, Object obj2) {
        qh21 qh21Var = (qh21) obj;
        bh21 bh21Var = (lh21) obj2;
        oh21 oh21Var = qh21Var.c;
        if (bh21Var instanceof fh21) {
            fh21 fh21Var = (fh21) bh21Var;
            if (oh21Var instanceof nh21) {
                return Next.i(qh21.a(qh21Var, true, false, (ph21) null, 6), d9p1.u((nh21) oh21Var, Collections.singletonList(new ng21(fh21Var.a))));
            }
            if ((oh21Var instanceof oh21) || oh21Var == null) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (bh21Var instanceof hh21) {
            hh21 hh21Var = (hh21) bh21Var;
            if (oh21Var instanceof nh21) {
                h7q0 h7q0Var = hh21Var.a;
                return Next.i(qh21.a(qh21Var, true, false, (ph21) null, 6), d9p1.u((nh21) oh21Var, Collections.singletonList(h7q0Var instanceof h7q0 ? new lg21(h7q0Var.a) : new mg21(h7q0Var))));
            }
            if ((oh21Var instanceof oh21) || oh21Var == null) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (bh21Var instanceof gh21) {
            gh21 gh21Var = (gh21) bh21Var;
            if (oh21Var instanceof nh21) {
                pg21 ng21Var = new ng21(gh21Var.a);
                h7q0 h7q0Var2 = gh21Var.b;
                return Next.i(qh21.a(qh21Var, true, false, (ph21) null, 6), d9p1.u((nh21) oh21Var, p7h.M(new pg21[]{ng21Var, h7q0Var2 instanceof h7q0 ? new lg21(h7q0Var2.a) : new mg21(h7q0Var2)})));
            }
            if ((oh21Var instanceof oh21) || oh21Var == null) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (bh21Var instanceof ih21) {
            nh21 nh21Var = oh21Var instanceof nh21 ? (nh21) oh21Var : null;
            return nh21Var != null ? Next.i(qh21.a(qh21Var, false, false, (ph21) null, 6), Collections.singleton(new jg21(nh21Var.a.a, nh21Var.b.h))) : Next.h(qh21.a(qh21Var, false, false, (ph21) null, 6));
        }
        if (bh21Var instanceof eh21) {
            nh21 nh21Var2 = oh21Var instanceof nh21 ? (nh21) oh21Var : null;
            return nh21Var2 != null ? Next.i(qh21.a(qh21Var, false, false, nh21.a(nh21Var2, null), 2), Collections.singleton(new ig21(nh21Var2.a.a))) : Next.h(qh21.a(qh21Var, false, false, (ph21) null, 6));
        }
        if (bh21Var instanceof yg21) {
            yg21 yg21Var = (yg21) bh21Var;
            if (oh21Var instanceof nh21) {
                return Next.h(qh21.a(qh21Var, false, false, nh21.a((nh21) oh21Var, yg21Var.a), 3));
            }
            if ((oh21Var instanceof oh21) || oh21Var == null) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (bh21Var instanceof jh21) {
            if (oh21Var instanceof nh21) {
                return Next.h(qh21.a(qh21Var, false, false, nh21.a((nh21) oh21Var, null), 3));
            }
            if ((oh21Var instanceof oh21) || oh21Var == null) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (bh21Var instanceof kh21) {
            kh21 kh21Var = (kh21) bh21Var;
            if (oh21Var instanceof nh21) {
                return Next.i(qh21.a(qh21Var, true, false, (ph21) null, 6), d9p1.u((nh21) oh21Var, Collections.singletonList(new lg21(kh21Var.a))));
            }
            if ((oh21Var instanceof oh21) || oh21Var == null) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (bh21Var instanceof ah21) {
            ah21 ah21Var = (ah21) bh21Var;
            if (oh21Var instanceof nh21) {
                return Next.h(qh21.a(qh21Var, false, false, nh21.a((nh21) oh21Var, new h7q0(ah21Var.a)), 3));
            }
            if ((oh21Var instanceof oh21) || oh21Var == null) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (bh21Var.equals(dh21.a)) {
            return Next.j();
        }
        if (bh21Var instanceof bh21) {
            bh21 bh21Var2 = bh21Var;
            oh21 oh21Var2 = oh21Var instanceof oh21 ? oh21Var : null;
            return oh21Var2 == null ? Next.j() : Next.h(qh21.a(qh21Var, false, false, new nh21(bh21Var2.b, bh21Var2.a, bh21Var2.c, null, oh21Var2.a, oh21Var2.b, oh21Var2.c), 1));
        }
        if (bh21Var.equals(ch21.a)) {
            return Next.h(qh21.a(qh21Var, false, false, (ph21) null, 3));
        }
        if (bh21Var.equals(zg21.a)) {
            return Next.h(qh21.a(qh21Var, false, false, (ph21) null, 3));
        }
        eg.o();
        return null;
    }

    private final Next l(Object obj, Object obj2) {
        int iC;
        ou80 ou80Var;
        xl41 xl41Var = (xl41) obj;
        tq80 tq80Var = (tq80) obj2;
        hm41 hm41Var = xl41Var.b;
        String str = xl41Var.a;
        boolean z2 = xl41Var.c;
        ql41 ql41Var = (ul41) tq80Var.a;
        if (ql41Var instanceof ql41) {
            ql41 ql41Var2 = ql41Var;
            if (u890.j(ql41Var2.a, str)) {
                return z2 ? Next.j() : Next.h(xl41.a(xl41Var, ql41Var2.b, false, 5));
            }
            return Next.j();
        }
        if (ql41Var instanceof pl41) {
            return Next.j();
        }
        if (u890.j(ql41Var, ol41.a)) {
            if (hm41Var == null) {
                return Next.j();
            }
            boolean z3 = hm41Var.e;
            if (z2) {
                return Next.j();
            }
            tqw tqwVar = tq80Var.b;
            String str2 = (tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null) ? null : ou80Var.a;
            xk41 xk41Var = hm41Var.b;
            ivh1 kvh1Var = jvh1.a;
            if (z3 && (iC = l1d.C(xk41Var.a)) != 0) {
                if (iC == 1) {
                    kvh1Var = hvh1.a;
                } else if (iC == 2) {
                    n7r n7rVar = xk41Var.b;
                    kvh1Var = new kvh1(n7rVar != null ? n7rVar.a() : 1);
                } else {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    kvh1Var = ivh1.a;
                }
            }
            return Next.i(xl41Var, Collections.singleton(new al41(kvh1Var, str2, !z3)));
        }
        if (!(ql41Var instanceof rl41)) {
            if (ql41Var instanceof tl41) {
                if (!z2) {
                    return Next.j();
                }
                hm41 hm41Var2 = ((tl41) ql41Var).a;
                return Next.i(xl41.a(xl41Var, hm41Var2, false, 1), Collections.singleton(new cl41(hm41Var2)));
            }
            if (u890.j(ql41Var, sl41.a)) {
                return !z2 ? Next.j() : Next.h(xl41.a(xl41Var, (hm41) null, false, 3));
            }
            eg.o();
            return null;
        }
        if (hm41Var == null) {
            return Next.j();
        }
        String str3 = hm41Var.a;
        boolean zBooleanValue = hm41Var.e;
        xk41 xk41Var2 = hm41Var.b;
        gm41 gm41VarM0 = yon1.m0(((rl41) ql41Var).a, xk41Var2, zBooleanValue);
        if (gm41VarM0.equals(new gm41(3, (Boolean) null))) {
            return Next.j();
        }
        xk41 xk41Var3 = gm41VarM0.a;
        xk41 xk41Var4 = xk41Var3 == null ? xk41Var2 : xk41Var3;
        Boolean bool = gm41VarM0.b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Next.i(xl41.a(xl41Var, (hm41) null, true, 3), Collections.singleton(new bl41(str, str3, gm41VarM0, new hm41(str3, xk41Var4, hm41Var.c, hm41Var.d, zBooleanValue, hm41Var.f, hm41Var.g, hm41Var.h, hm41Var.i))));
    }

    private final Next m(Object obj, Object obj2) {
        qs51 qs51Var = (qs51) obj;
        ls51 ls51Var = (ns51) obj2;
        qs51Var.getClass();
        ls51Var.getClass();
        List list = qs51Var.j;
        String str = qs51Var.a;
        if (ls51Var instanceof hs51) {
            hs51 hs51Var = (hs51) ls51Var;
            String str2 = hs51Var.a;
            return Next.h(qs51.a(qs51Var, str2, 0L, 0L, hs51Var.b, false, false, false, hs51Var.d, false, !str2.equals(str) ? z6x.a : list, hs51Var.c, 0L, false, (agv) null, 14708));
        }
        if (ls51Var instanceof ls51) {
            ls51 ls51Var2 = ls51Var;
            return Next.h(qs51.a(qs51Var, ls51Var2.a, 0L, 0L, 0L, false, false, false, false, false, ls51Var2.b, 0L, 0L, false, (agv) null, 15870));
        }
        if (ls51Var instanceof ms51) {
            ms51 ms51Var = (ms51) ls51Var;
            String str3 = ms51Var.a;
            if (!u890.j(str, str3)) {
                return Next.h(new qs51(str3, ms51Var.d, qs51Var.i, qs51Var.m, qs51Var.n, 3822));
            }
            if (qs51Var.f) {
                return Next.j();
            }
            return Next.h(qs51.a(qs51Var, str3, ms51Var.b, 0L, 0L, ms51Var.d, false, false, false, false, (List) null, 0L, ms51Var.c, false, (agv) null, 14316));
        }
        if (ls51Var instanceof ks51) {
            return Next.i(qs51.a(qs51Var, (String) null, 0L, qs51Var.b, 0L, false, true, false, false, false, (List) null, 0L, 0L, false, (agv) null, 16347), Collections.singleton(ds51.a));
        }
        if (!(ls51Var instanceof js51)) {
            if (ls51Var instanceof is51) {
                return Next.i(qs51.a(qs51Var, (String) null, 0L, 0L, 0L, false, false, false, false, false, (List) null, 0L, 0L, false, (agv) null, 16287), Collections.singleton(new cs51(str, qs51Var.b)));
            }
            if (ls51Var instanceof gs51) {
                return Next.a(Collections.singleton(es51.a));
            }
            if (ls51Var instanceof fs51) {
                return Next.h(qs51.a(qs51Var, (String) null, 0L, 0L, 0L, false, false, false, false, false, (List) null, 0L, 0L, false, ((fs51) ls51Var).a, 8191));
            }
            eg.o();
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ps51) it.next()).getClass();
        }
        js51 js51Var = (js51) ls51Var;
        qs51 qs51VarA = qs51.a(qs51Var, (String) null, js51Var.a, 0L, 0L, false, true, false, false, false, qs51Var.j, 0L, 0L, false, (agv) null, 15837);
        Iterator it2 = qs51VarA.j.iterator();
        while (it2.hasNext()) {
            ((ps51) it2.next()).getClass();
        }
        return Next.i(qs51.a(qs51VarA, (String) null, 0L, 0L, 0L, false, false, false, false, false, (List) null, 0L, 0L, false, (agv) null, 16319), Collections.singleton(new as51(js51Var.a)));
    }

    private final Next n(Object obj, Object obj2) {
        Integer numValueOf;
        ly51 ly51Var = (ly51) obj;
        ky51 ky51Var = (ky51) obj2;
        Integer numValueOf2 = null;
        if (!(ky51Var instanceof iy51)) {
            if (ky51Var instanceof jy51) {
                return Next.h(ly51.a(ly51Var, null, 0, 0, null, null, null, hxo1.o(ly51Var.d, ((jy51) ky51Var).a, zx51.b), 447));
            }
            eg.o();
            return null;
        }
        iy51 iy51Var = (iy51) ky51Var;
        List list = ly51Var.e;
        Set set = ly51Var.f;
        List list2 = list;
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((Number) it.next()).intValue());
            while (it.hasNext()) {
                Integer numValueOf3 = Integer.valueOf(((Number) it.next()).intValue());
                if (numValueOf.compareTo(numValueOf3) > 0) {
                    numValueOf = numValueOf3;
                }
            }
        } else {
            numValueOf = null;
        }
        Iterator it2 = list2.iterator();
        if (it2.hasNext()) {
            numValueOf2 = Integer.valueOf(((Number) it2.next()).intValue());
            while (it2.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(((Number) it2.next()).intValue());
                if (numValueOf2.compareTo(numValueOf4) < 0) {
                    numValueOf2 = numValueOf4;
                }
            }
        }
        Set setS0 = f46.S0(new Integer[]{numValueOf, numValueOf2});
        ArrayList arrayList = new ArrayList(list);
        int i2 = iy51Var.a;
        if (!set.contains(Integer.valueOf(i2)) && !setS0.contains(Integer.valueOf(i2))) {
            arrayList.clear();
        }
        if (list.isEmpty() || set.contains(Integer.valueOf(i2)) || !setS0.contains(Integer.valueOf(i2))) {
            arrayList.add(Integer.valueOf(i2));
        }
        if (setS0.contains(Integer.valueOf(i2))) {
            arrayList.remove(Integer.valueOf(i2));
        }
        ly51 ly51VarA = ly51.a(ly51Var, null, 0, 0, null, arrayList, w7x.a, 0, 463);
        ly51 ly51VarA2 = ly51.a(ly51VarA, null, 0, 0, null, null, ijo1.u(ly51VarA), 0, 479);
        List list3 = ly51VarA2.e;
        HashSet hashSet = new HashSet();
        hashSet.add(new gy51(o7h.p1(list3), ly51VarA2.f));
        hashSet.add(new fy51(list3, ijo1.v(ly51VarA2)));
        return Next.i(ly51VarA2, hashSet);
    }

    private final Next o(Object obj, Object obj2) {
        ou80 ou80Var;
        t361 t361Var = (t361) obj;
        tq80 tq80Var = (tq80) obj2;
        tqw tqwVar = tq80Var.b;
        String str = (tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null) ? null : ou80Var.a;
        k361 k361Var = (m361) tq80Var.a;
        if (k361Var instanceof l361) {
            return Next.i(t361.a(t361Var, true), Collections.singleton(new f361(t361Var.a, t361Var.d, str)));
        }
        if (k361Var instanceof j361) {
            return Next.i(t361.a(t361Var, false), Collections.singleton(h361.a));
        }
        if (k361Var instanceof i361) {
            return Next.h(t361.a(t361Var, false));
        }
        if (k361Var instanceof k361) {
            k361 k361Var2 = k361Var;
            return Next.i(t361.a(t361Var, false), Collections.singleton(new g361(k361Var2.b, k361Var2.a, t361Var.f, k361Var2.c)));
        }
        eg.o();
        return null;
    }

    private final Next p(Object obj, Object obj2) {
        aa71 aa71Var = (aa71) obj;
        v971 v971Var = (v971) obj2;
        if (u890.j(v971Var, u971.a)) {
            aa71Var.getClass();
            return Next.h(new aa71(aa71Var.a, aa71Var.b, x971.a));
        }
        if (u890.j(v971Var, t971.a)) {
            aa71Var.getClass();
            return Next.h(new aa71(aa71Var.a, aa71Var.b, w971.a));
        }
        eg.o();
        return null;
    }

    private final Next q(Object obj, Object obj2) {
        qk71 qk71Var = (qk71) obj;
        ck71 ck71Var = (jk71) obj2;
        if (!(qk71Var instanceof ok71)) {
            return Next.j();
        }
        if (ck71Var instanceof dk71) {
            dk71 dk71Var = (dk71) ck71Var;
            int i2 = dk71Var.a;
            return Next.h(b2p1.x((ok71) qk71Var, i2, new lk71(c2p1.B(i2), dk71Var.b, new q1f1(dk71Var.c))));
        }
        if (ck71Var instanceof gk71) {
            gk71 gk71Var = (gk71) ck71Var;
            int i3 = gk71Var.a;
            return Next.h(b2p1.x((ok71) qk71Var, i3, new lk71(c2p1.B(i3), gk71Var.b, p1f1.a)));
        }
        if (ck71Var instanceof ik71) {
            ik71 ik71Var = (ik71) ck71Var;
            int i4 = ik71Var.a;
            return Next.h(b2p1.x((ok71) qk71Var, i4, new lk71(c2p1.B(i4), ik71Var.b, r1f1.a)));
        }
        if (ck71Var instanceof hk71) {
            int i5 = ((hk71) ck71Var).a;
            return Next.h(b2p1.x((ok71) qk71Var, i5, new mk71(c2p1.B(i5))));
        }
        if (ck71Var instanceof ck71) {
            ck71 ck71Var2 = ck71Var;
            return Next.a(Collections.singleton(new wj71(ck71Var2.a, ck71Var2.b)));
        }
        if (ck71Var instanceof fk71) {
            return Next.h(ok71.a((ok71) qk71Var, null, null, null, Boolean.valueOf(((fk71) ck71Var).a), 31));
        }
        if (ck71Var instanceof ek71) {
            return Next.i(ok71.a((ok71) qk71Var, null, null, null, Boolean.TRUE, 31), Collections.singleton(vj71.c));
        }
        eg.o();
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:476:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:478:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:480:0x0af5  */
    /* JADX WARN: Code duplicated, block: B:482:0x0b01  */
    /* JADX WARN: Code duplicated, block: B:485:0x0b20  */
    /* JADX WARN: Code duplicated, block: B:486:0x0b32  */
    /* JADX WARN: Code duplicated, block: B:488:0x0b38  */
    /* JADX WARN: Code duplicated, block: B:490:0x0b59  */
    /* JADX WARN: Code duplicated, block: B:491:0x0b6c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Next a(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        gwn gwnVarH;
        gwn gwnVarH2;
        gwn gwnVarH3;
        gwn gwnVarH4;
        bwn bwnVar;
        bwn bwnVar2;
        fq11 eq11Var;
        List listD;
        bwn bwnVar3;
        bwn bwnVar4;
        ou80 ou80Var;
        Boolean boolValueOf;
        boolean z2;
        String str;
        String strS;
        lhw0 lhw0Var;
        String str2 = "";
        int i2 = 2;
        boolean z3 = true;
        tv80 tv80Var = null;
        switch (this.a) {
            case 0:
                return yoo1.C((w9p0) obj, (gmm1) obj2);
            case 1:
                q9q0 q9q0Var = (q9q0) obj;
                tq80 tq80Var = (tq80) obj2;
                q9q0Var.getClass();
                g9q0 g9q0Var = (p9q0) tq80Var.a;
                tqw tqwVar = tq80Var.b;
                tv80 tv80Var2 = tqwVar != null ? (tv80) tqwVar.a(rc11.a.b(tv80.class)) : null;
                if (g9q0Var instanceof g9q0) {
                    return Next.i(q9q0.a(q9q0Var, null, Boolean.TRUE, 1), Collections.singleton(new y9q0(g9q0Var.a)));
                }
                if (g9q0Var instanceof h9q0) {
                    return Next.a(Collections.singleton(new v9q0(((h9q0) g9q0Var).a, tv80Var2)));
                }
                if (g9q0Var instanceof i9q0) {
                    return Next.a(Collections.singleton(new v9q0(((i9q0) g9q0Var).a, tv80Var2)));
                }
                if (g9q0Var instanceof j9q0) {
                    return Next.a(Collections.singleton(new v9q0(((j9q0) g9q0Var).a, tv80Var2)));
                }
                if (g9q0Var instanceof k9q0) {
                    k9q0 k9q0Var = (k9q0) g9q0Var;
                    return Next.a(Collections.singleton(new u9q0(k9q0Var.a, k9q0Var.b, tv80Var2)));
                }
                if (g9q0Var instanceof l9q0) {
                    l9q0 l9q0Var = (l9q0) g9q0Var;
                    return Next.a(Collections.singleton(new u9q0(l9q0Var.a, l9q0Var.b, tv80Var2)));
                }
                if (g9q0Var instanceof m9q0) {
                    return Next.i(q9q0.a(q9q0Var, null, Boolean.FALSE, 1), Collections.singleton(new x9q0(((m9q0) g9q0Var).a)));
                }
                if (g9q0Var instanceof n9q0) {
                    return Next.h(q9q0.a(q9q0Var, null, Boolean.valueOf(((n9q0) g9q0Var).a), 1));
                }
                if (g9q0Var instanceof o9q0) {
                    return Next.a(Collections.singleton(new v9q0(((o9q0) g9q0Var).a, tv80Var2)));
                }
                eg.o();
                return null;
            case 2:
                gwn gwnVar = (jwn) obj;
                vvn vvnVar = (awn) obj2;
                if (vvnVar instanceof xvn) {
                    gwnVar.getClass();
                    vvn vvnVar2 = (xvn) vvnVar;
                    if (vvnVar2 instanceof uvn) {
                        return vby0.u(Next.j(), vvnVar2, gwnVar);
                    }
                    if (vvnVar2 instanceof vvn) {
                        vvn vvnVar3 = vvnVar2;
                        return vby0.u(Next.h(new hwn(vvnVar3.b, vvnVar3.c, vvnVar3.d, null, gwnVar.f(), gwnVar.b(), gwnVar.d(), gwnVar.g(), gwnVar.a(), gwnVar.c(), gwnVar.e(), 8)), vvnVar2, gwnVar);
                    }
                    if (vvnVar2 instanceof wvn) {
                        wvn wvnVar = (wvn) vvnVar2;
                        return vby0.u(Next.h(new iwn(wvnVar.b, wvnVar.c, wvnVar.d, null, gwnVar.f(), gwnVar.b(), gwnVar.d(), gwnVar.g(), gwnVar.a(), gwnVar.c(), gwnVar.e(), 8)), vvnVar2, gwnVar);
                    }
                    eg.o();
                    return null;
                }
                if (vvnVar instanceof rvn) {
                    rvn rvnVar = (rvn) vvnVar;
                    return Next.i(new hwn(rvnVar.a, 0L, 0L, null, gwnVar.f(), gwnVar.b(), gwnVar.d(), gwnVar.g(), gwnVar.a(), gwnVar.c(), gwnVar.e(), 8), Collections.singleton(new cq11(rvnVar.b)));
                }
                if (!(vvnVar instanceof svn)) {
                    if (vvnVar instanceof zvn) {
                        if (gwnVar instanceof gwn) {
                            zvn zvnVar = (zvn) vvnVar;
                            gwnVarH4 = gwn.h(gwnVar, (String) null, zvnVar.a, zvnVar.b, (Map) null, zvnVar.c, (Map) null, 83);
                        } else if (gwnVar instanceof hwn) {
                            zvn zvnVar2 = (zvn) vvnVar;
                            gwnVarH4 = hwn.h((hwn) gwnVar, null, zvnVar2.a, zvnVar2.b, null, zvnVar2.c, null, 1343);
                        } else {
                            if (!(gwnVar instanceof iwn)) {
                                eg.o();
                                return null;
                            }
                            zvn zvnVar3 = (zvn) vvnVar;
                            gwnVarH4 = iwn.h((iwn) gwnVar, null, zvnVar3.a, zvnVar3.b, null, zvnVar3.c, null, 1343);
                        }
                        return Next.h(gwnVarH4);
                    }
                    if (vvnVar instanceof qvn) {
                        return Next.a(Collections.singleton(new gq11(((qvn) vvnVar).a)));
                    }
                    if (vvnVar instanceof pvn) {
                        if (gwnVar instanceof gwn) {
                            gwnVarH3 = gwn.h(gwnVar, (String) null, (List) null, (dwn) null, ((pvn) vvnVar).a, false, (Map) null, 111);
                        } else if (gwnVar instanceof hwn) {
                            gwnVarH3 = hwn.h((hwn) gwnVar, null, null, null, ((pvn) vvnVar).a, false, null, 1791);
                        } else {
                            if (!(gwnVar instanceof iwn)) {
                                eg.o();
                                return null;
                            }
                            gwnVarH3 = iwn.h((iwn) gwnVar, null, null, null, ((pvn) vvnVar).a, false, null, 1791);
                        }
                        return Next.h(gwnVarH3);
                    }
                    if (vvnVar instanceof tvn) {
                        return Next.j();
                    }
                    if (vvnVar instanceof yvn) {
                        if (gwnVar instanceof gwn) {
                            gwnVarH2 = gwn.h(gwnVar, ((yvn) vvnVar).a, (List) null, (dwn) null, (Map) null, false, (Map) null, 125);
                        } else if (gwnVar instanceof hwn) {
                            gwnVarH2 = hwn.h((hwn) gwnVar, ((yvn) vvnVar).a, null, null, null, false, null, 2015);
                        } else {
                            if (!(gwnVar instanceof iwn)) {
                                eg.o();
                                return null;
                            }
                            gwnVarH2 = iwn.h((iwn) gwnVar, ((yvn) vvnVar).a, null, null, null, false, null, 2015);
                        }
                        return Next.h(gwnVarH2);
                    }
                    if (!(vvnVar instanceof ovn)) {
                        eg.o();
                        return null;
                    }
                    if (gwnVar instanceof gwn) {
                        gwnVarH = gwn.h(gwnVar, (String) null, (List) null, (dwn) null, (Map) null, false, ((ovn) vvnVar).a, 63);
                    } else if (gwnVar instanceof hwn) {
                        gwnVarH = hwn.h((hwn) gwnVar, null, null, null, null, false, ((ovn) vvnVar).a, 1023);
                    } else {
                        if (!(gwnVar instanceof iwn)) {
                            eg.o();
                            return null;
                        }
                        gwnVarH = iwn.h((iwn) gwnVar, null, null, null, null, false, ((ovn) vvnVar).a, 1023);
                    }
                    return Next.h(gwnVarH);
                }
                if (gwnVar instanceof hwn) {
                    svn svnVar = (svn) vvnVar;
                    if (u890.j(((hwn) gwnVar).a, svnVar.a)) {
                        eq11Var = new fq11(svnVar.b);
                    } else if (gwnVar.g() instanceof cwn) {
                        svn svnVar2 = (svn) vvnVar;
                        if (gwnVar.c()) {
                            listD = o7h.T0(gwnVar.d());
                        } else {
                            listD = gwnVar.d();
                        }
                        List list = listD;
                        String str3 = svnVar2.a;
                        String strB = gwnVar.b();
                        String strF = gwnVar.f();
                        String str4 = svnVar2.b;
                        bwnVar3 = svnVar2.c;
                        if (gwnVar.e().isEmpty()) {
                            bwnVar4 = bwnVar3;
                        } else {
                            bwnVar4 = new bwn(sqg0.O(bwnVar3.a, gwnVar.e()), bwnVar3.b);
                        }
                        eq11Var = new dq11(str3, strB, strF, list, str4, bwnVar4);
                    } else {
                        svn svnVar3 = (svn) vvnVar;
                        String str5 = svnVar3.a;
                        String strB2 = gwnVar.b();
                        String strF2 = gwnVar.f();
                        List listD2 = gwnVar.d();
                        String str6 = svnVar3.b;
                        bwnVar = svnVar3.c;
                        if (gwnVar.e().isEmpty()) {
                            bwnVar2 = bwnVar;
                        } else {
                            bwnVar2 = new bwn(sqg0.O(bwnVar.a, gwnVar.e()), bwnVar.b);
                        }
                        eq11Var = new eq11(str5, strB2, strF2, listD2, str6, bwnVar2);
                    }
                } else if (gwnVar.g() instanceof cwn) {
                    svn svnVar4 = (svn) vvnVar;
                    if (gwnVar.c()) {
                        listD = o7h.T0(gwnVar.d());
                    } else {
                        listD = gwnVar.d();
                    }
                    List list2 = listD;
                    String str7 = svnVar4.a;
                    String strB3 = gwnVar.b();
                    String strF3 = gwnVar.f();
                    String str8 = svnVar4.b;
                    bwnVar3 = svnVar4.c;
                    if (gwnVar.e().isEmpty()) {
                        bwnVar4 = new bwn(sqg0.O(bwnVar3.a, gwnVar.e()), bwnVar3.b);
                    } else {
                        bwnVar4 = bwnVar3;
                    }
                    eq11Var = new dq11(str7, strB3, strF3, list2, str8, bwnVar4);
                } else {
                    svn svnVar5 = (svn) vvnVar;
                    String str9 = svnVar5.a;
                    String strB4 = gwnVar.b();
                    String strF4 = gwnVar.f();
                    List listD3 = gwnVar.d();
                    String str10 = svnVar5.b;
                    bwnVar = svnVar5.c;
                    if (gwnVar.e().isEmpty()) {
                        bwnVar2 = new bwn(sqg0.O(bwnVar.a, gwnVar.e()), bwnVar.b);
                    } else {
                        bwnVar2 = bwnVar;
                    }
                    eq11Var = new eq11(str9, strB4, strF4, listD3, str10, bwnVar2);
                }
                return Next.i(new iwn(((svn) vvnVar).a, 0L, 0L, null, gwnVar.f(), gwnVar.b(), gwnVar.d(), gwnVar.g(), gwnVar.a(), gwnVar.c(), gwnVar.e(), 8), Collections.singleton(eq11Var));
            case 3:
                dzs0 dzs0Var = (dzs0) obj;
                czs0 czs0Var = (czs0) obj2;
                List list3 = dzs0Var.b;
                if (czs0Var instanceof yys0) {
                    yys0 yys0Var = (yys0) czs0Var;
                    ArrayList arrayList = new ArrayList(list3);
                    arrayList.set(yys0Var.a, String.valueOf(yys0Var.b));
                    String strY0 = o7h.y0(arrayList, "", (String) null, (String) null, (iu30) null, 62);
                    return strY0.length() == 4 ? Next.i(dzs0.a(dzs0Var, false, arrayList, null, null, 13), Effects.a(new wys0[]{new wys0(strY0)})) : Next.h(dzs0.a(dzs0Var, false, arrayList, null, null, 13));
                }
                if (czs0Var instanceof zys0) {
                    ArrayList arrayList2 = new ArrayList(list3);
                    arrayList2.set(((zys0) czs0Var).a, "");
                    return Next.h(dzs0.a(dzs0Var, false, arrayList2, null, null, 13));
                }
                if (czs0Var instanceof bzs0) {
                    return Next.h(dzs0.a(dzs0Var, true, null, null, null, 14));
                }
                if (czs0Var instanceof azs0) {
                    return Next.h(dzs0.a(dzs0Var, false, null, null, null, 14));
                }
                if (!(czs0Var instanceof xys0)) {
                    eg.o();
                    return null;
                }
                ArrayList arrayList3 = new ArrayList(4);
                for (int i3 = 0; i3 < 4; i3++) {
                    arrayList3.add("");
                }
                return Next.h(dzs0.a(dzs0Var, false, arrayList3, null, null, 13));
            case 4:
                if (obj2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
            case 5:
                xju0 xju0Var = (xju0) obj;
                tq80 tq80Var2 = (tq80) obj2;
                tqw tqwVar2 = tq80Var2.b;
                bku0 bku0Var = xju0Var.l;
                String str11 = xju0Var.a;
                int i4 = xju0Var.h;
                Boolean bool = xju0Var.g;
                rju0 rju0Var = (tju0) tq80Var2.a;
                if (rju0Var instanceof lju0) {
                    lju0 lju0Var = (lju0) rju0Var;
                    ArrayList arrayList4 = lju0Var.a;
                    if (lju0Var.c) {
                        if (arrayList4.isEmpty()) {
                            z2 = false;
                        } else {
                            Iterator it = arrayList4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                } else if (u890.j(((uju0) it.next()).a, str11)) {
                                    z2 = true;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z2);
                    } else {
                        boolValueOf = null;
                    }
                    if (u890.j(boolValueOf, Boolean.TRUE)) {
                        Iterator it2 = arrayList4.iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i5 = -1;
                            } else if (!u890.j(((uju0) it2.next()).a, str11)) {
                                i5++;
                            }
                        }
                        if (i5 > 0) {
                            tv80Var = ((uju0) arrayList4.get(i5 - 1)).b;
                        }
                    }
                    xju0 xju0VarA = xju0.a(xju0Var, null, boolValueOf, lju0Var.c, lju0Var.b, arrayList4, null, 0, tv80Var, null, null, null, 3779);
                    if (bool == null || !u890.j(boolValueOf, bool) || bku0Var == null) {
                        return Next.h(xju0VarA);
                    }
                    String str12 = lju0Var.b;
                    int i6 = bku0Var.d;
                    String str13 = bku0Var.b;
                    Object[] objArr = (i6 == 1 || i6 == 4) ? 1 : 0;
                    i2 = objArr != 0 ? 1 : 2;
                    String str14 = bku0Var.a;
                    return Next.h(xju0.a(xju0VarA, null, null, false, null, null, null, 0, null, null, new vju0(i2, str12, objArr != 0 ? new yju0(str14, str13) : new zju0(str14, str13, bku0Var.c)), null, 3007));
                }
                if (u890.j(rju0Var, nju0.a)) {
                    Boolean bool2 = xju0Var.c;
                    if (bool2 == null) {
                        return Next.j();
                    }
                    boolean zBooleanValue = bool2.booleanValue();
                    if (bool != null) {
                        return Next.j();
                    }
                    boolean z4 = !zBooleanValue;
                    int i7 = i4 + 1;
                    String str15 = xju0Var.b;
                    String str16 = xju0Var.a;
                    xju0 xju0VarA2 = xju0.a(xju0Var, null, null, false, null, null, Boolean.valueOf(z4), i7, null, null, null, new bku0(zBooleanValue ? 2 : 1, i7, str16, str15, xju0Var.i), 1855);
                    return zBooleanValue ? Next.i(xju0VarA2, Collections.singleton(new gju0(i7, str16, str15, tqwVar2 != null ? n3o1.y(tqwVar2) : null))) : Next.i(xju0VarA2, Collections.singleton(new dju0(str16, str15, i7, (tqwVar2 == null || (ou80Var = n3o1.y(tqwVar2).a) == null) ? null : new zxc0(ou80Var))));
                }
                if (!(rju0Var instanceof rju0)) {
                    if (rju0Var instanceof qju0) {
                        if (((qju0) rju0Var).a != i4) {
                            return Next.j();
                        }
                        return bool == null ? Next.j() : Next.h(xju0.a(xju0Var, null, null, false, null, null, null, 0, null, null, new vju0(3, "", null), null, 959));
                    }
                    if (rju0Var instanceof sju0) {
                        if (((sju0) rju0Var).a != i4) {
                            return Next.j();
                        }
                        return bool == null ? Next.j() : Next.h(xju0.a(xju0Var, null, null, false, null, null, null, 0, null, null, null, null, 1983));
                    }
                    if (rju0Var instanceof oju0) {
                        oju0 oju0Var = (oju0) rju0Var;
                        return d5p1.m(xju0Var, oju0Var.a, oju0Var.b, false, 3, xju0Var.i, new n5u0(rju0Var, (byte) 7));
                    }
                    if (rju0Var instanceof pju0) {
                        pju0 pju0Var = (pju0) rju0Var;
                        return d5p1.m(xju0Var, pju0Var.a, pju0Var.b, true, 4, pju0Var.c, new aft0(tq80Var2, rju0Var, (byte) 19));
                    }
                    if (u890.j(rju0Var, mju0.a)) {
                        return Next.h(xju0.a(xju0Var, null, null, false, null, null, null, 0, null, null, null, null, 3071));
                    }
                    eg.o();
                    return null;
                }
                int i8 = rju0Var.a;
                if (i8 != i4) {
                    return Next.j();
                }
                if (bku0Var == null) {
                    return Next.j();
                }
                Set setW0 = dm61.w0(new kju0[]{new hju0(i8)});
                String str17 = xju0Var.j;
                if (str17 != null && str17.length() != 0) {
                    int iC = l1d.C(bku0Var.d);
                    if (iC == 0) {
                        i2 = 1;
                    } else if (iC != 1 && iC != 2) {
                        if (iC != 3) {
                            eg.o();
                            return null;
                        }
                        i2 = 1;
                    }
                    setW0.add(new fju0(str17, bku0Var.b, i2, bku0Var.a));
                }
                return Next.a(setW0);
            case 6:
                return b((dhm0) obj, (tq80) obj2);
            case 7:
                tbv0 tbv0Var = (tbv0) obj;
                rbv0 rbv0Var = (sbv0) obj2;
                e9p1 e9p1Var = tbv0Var.a;
                String str18 = tbv0Var.b;
                if (rbv0Var instanceof qbv0) {
                    ClientPollResponse clientPollResponse = ((qbv0) rbv0Var).a;
                    if (!u890.j(clientPollResponse.o().getEntityUri(), str18)) {
                        return Next.h(tbv0.a(tbv0Var, new icv0(str18), (String) null, 2));
                    }
                    kcv0 kcv0Var = e9p1Var instanceof kcv0 ? (kcv0) e9p1Var : null;
                    return Next.h(tbv0.a(tbv0Var, new kcv0(clientPollResponse, false, z6x.a, false, kcv0Var != null ? kcv0Var.f : false, str18), (String) null, 2));
                }
                if (rbv0Var instanceof pbv0) {
                    return Next.h(tbv0.a(tbv0Var, new jcv0(str18), (String) null, 2));
                }
                if (rbv0Var instanceof mbv0) {
                    if (((mbv0) rbv0Var).a) {
                        return Next.i(tbv0.a(tbv0Var, new icv0(str18), (String) null, 2), Collections.singleton(new kbv0(str18)));
                    }
                    if (!(e9p1Var instanceof icv0) && (!(e9p1Var instanceof lcv0) || !((lcv0) e9p1Var).d)) {
                        z3 = false;
                    }
                    return Next.h(tbv0.a(tbv0Var, new lcv0(str18, z3), (String) null, 2));
                }
                if (rbv0Var.equals(nbv0.a)) {
                    if (e9p1Var instanceof kcv0) {
                        ClientPollResponse clientPollResponse2 = ((kcv0) e9p1Var).c;
                        String strO = clientPollResponse2.o().p().o();
                        String strT = clientPollResponse2.o().t();
                        strS = clientPollResponse2.o().s();
                        str = strO;
                        str2 = strT;
                    } else {
                        str = "";
                        strS = str;
                    }
                    return Next.a(Collections.singleton(new jbv0(str2, str, strS)));
                }
                if (rbv0Var.equals(nbv0.b)) {
                    return Next.a(Collections.singleton(new kbv0(str18)));
                }
                if (!(rbv0Var instanceof rbv0)) {
                    if (rbv0Var.equals(nbv0.c)) {
                        return !(e9p1Var instanceof kcv0) ? Next.j() : Next.h(tbv0.a(tbv0Var, kcv0.q((kcv0) e9p1Var, null, false, 53), (String) null, 2));
                    }
                    if ((rbv0Var instanceof obv0) || rbv0Var.equals(nbv0.d)) {
                        return Next.j();
                    }
                    eg.o();
                    return null;
                }
                rbv0 rbv0Var2 = rbv0Var;
                if (!(e9p1Var instanceof kcv0)) {
                    return Next.j();
                }
                List list4 = rbv0Var2.a;
                if (list4.isEmpty()) {
                    list4 = ((kcv0) e9p1Var).e;
                }
                List list5 = list4;
                kcv0 kcv0Var2 = (kcv0) e9p1Var;
                ClientPollResponse clientPollResponse3 = kcv0Var2.c;
                h290 h290VarR = clientPollResponse3.o().r();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : h290VarR) {
                    if (list5.contains(Integer.valueOf(((PollOption) obj3).o()))) {
                        arrayList5.add(obj3);
                    }
                }
                return !arrayList5.isEmpty() ? Next.i(tbv0.a(tbv0Var, kcv0.q(kcv0Var2, list5, true, 51), (String) null, 2), Collections.singleton(new lbv0(clientPollResponse3.o().q(), arrayList5))) : Next.j();
            case 8:
                return c(obj, obj2);
            case 9:
                mhw0 mhw0Var = (mhw0) obj;
                tq80 tq80Var3 = (tq80) obj2;
                String str19 = mhw0Var.b;
                PlayabilityRestriction playabilityRestriction = mhw0Var.f;
                String str20 = mhw0Var.a;
                ihw0 ihw0Var = mhw0Var.e;
                tqw tqwVar3 = tq80Var3.b;
                rgw0 rgw0Var = (wgw0) tq80Var3.a;
                if (rgw0Var instanceof rgw0) {
                    rgw0 rgw0Var2 = rgw0Var;
                    String str21 = rgw0Var2.a;
                    String str22 = rgw0Var2.b;
                    String str23 = rgw0Var2.c;
                    return Next.h(mhw0.a(mhw0Var, (String) null, (String) null, (lhw0) null, new ihw0(rgw0Var2.f ? 1 : rgw0Var2.e ? 2 : 3, rgw0Var2.d, str21, str22, str23), (PlayabilityRestriction) null, 47));
                }
                if (rgw0Var instanceof qgw0) {
                    return Next.h(mhw0.a(mhw0Var, (String) null, (String) null, (lhw0) null, hhw0.a, (PlayabilityRestriction) null, 47));
                }
                if (rgw0Var instanceof ogw0) {
                    lhw0 lhw0Var2 = mhw0Var.d;
                    if (lhw0Var2.a) {
                        return Next.a(Collections.singleton(new zfw0(tqwVar3 != null ? n3o1.y(tqwVar3) : null)));
                    }
                    if (playabilityRestriction == PlayabilityRestriction.EXPLICIT_CONTENT) {
                        return Next.a(Collections.singleton(new dgw0(str20, tqwVar3 != null ? n3o1.y(tqwVar3) : null)));
                    }
                    if (playabilityRestriction == PlayabilityRestriction.AGE_RESTRICTED) {
                        ihw0 ihw0Var2 = ihw0Var instanceof ihw0 ? ihw0Var : null;
                        return Next.a(Collections.singleton(new cgw0(str20, ihw0Var2 != null ? ihw0Var2.c : null, tqwVar3 != null ? n3o1.y(tqwVar3) : null)));
                    }
                    if (lhw0Var2.b) {
                        return Next.a(Collections.singleton(new bgw0(tqwVar3 != null ? n3o1.y(tqwVar3) : null)));
                    }
                    if (ihw0Var instanceof ihw0) {
                        return Next.a(Collections.singleton(new agw0(str20, ihw0Var.a, str19, tqwVar3 != null ? n3o1.y(tqwVar3) : null)));
                    }
                    return Next.j();
                }
                if (rgw0Var instanceof pgw0) {
                    if (!(ihw0Var instanceof ihw0)) {
                        return Next.j();
                    }
                    ihw0 ihw0Var3 = ihw0Var;
                    return Next.a(Collections.singleton(new yfw0(str20, str19, ihw0Var3.a, ihw0Var3.b, ihw0Var3.c, playabilityRestriction == PlayabilityRestriction.NO_RESTRICTION, tqwVar3 != null ? n3o1.y(tqwVar3) : null)));
                }
                if (!(rgw0Var instanceof tgw0)) {
                    if (rgw0Var instanceof sgw0) {
                        return Next.h(mhw0.a(mhw0Var, (String) null, (String) null, (lhw0) null, (khw0) null, ((sgw0) rgw0Var).a, 31));
                    }
                    if ((rgw0Var instanceof ugw0) || (rgw0Var instanceof vgw0)) {
                        return Next.j();
                    }
                    eg.o();
                    return null;
                }
                tgw0 tgw0Var = (tgw0) rgw0Var;
                boolean zEquals = str20.equals(tgw0Var.a);
                if (zEquals) {
                    lhw0Var = new lhw0(tgw0Var.d, tgw0Var.b, tgw0Var.c);
                } else {
                    if (zEquals) {
                        eg.o();
                        return null;
                    }
                    lhw0Var = new lhw0();
                }
                return Next.h(mhw0.a(mhw0Var, (String) null, (String) null, lhw0Var, (khw0) null, (PlayabilityRestriction) null, 55));
            case 10:
                dpw0 dpw0Var = (dpw0) obj;
                bpw0 bpw0Var = (bpw0) obj2;
                dpw0Var.getClass();
                bpw0Var.getClass();
                if (bpw0Var instanceof zow0) {
                    if (dpw0Var.b != l2r0.a) {
                        return Next.j();
                    }
                    boolean z5 = ((zow0) bpw0Var).a;
                    return Next.i(dpw0.a(dpw0Var, z5, (l2r0) null, (String) null, 14), Collections.singleton(new row0(z5)));
                }
                if (bpw0Var instanceof apw0) {
                    boolean z6 = ((apw0) bpw0Var).a;
                    Set setW1 = dm61.w0(new vow0[]{new row0(z6)});
                    String str24 = dpw0Var.c;
                    if (str24 != null) {
                        setW1.add(new uow0(str24, z6));
                    }
                    return Next.i(dpw0.a(dpw0Var, z6, (l2r0) null, (String) null, 6), setW1);
                }
                if (bpw0Var instanceof xow0) {
                    return Next.a(Collections.singleton(new sow0(((xow0) bpw0Var).a)));
                }
                if (bpw0Var.equals(yow0.a)) {
                    return Next.j();
                }
                if (bpw0Var.equals(wow0.a)) {
                    return Next.a(Collections.singleton(new tow0(dpw0Var.a)));
                }
                eg.o();
                return null;
            case 11:
                c2y0 c2y0Var = (c2y0) obj;
                tq80 tq80Var4 = (tq80) obj2;
                cio cioVar = c2y0Var.b;
                b2y0 b2y0Var = (b2y0) tq80Var4.a;
                if (b2y0Var instanceof a2y0) {
                    return Next.h(c2y0.a(c2y0Var, false, ((a2y0) b2y0Var).a, 1));
                }
                if (b2y0Var instanceof w1y0) {
                    tqw tqwVar4 = tq80Var4.b;
                    tv80 tv80VarY = tqwVar4 != null ? n3o1.y(tqwVar4) : null;
                    if (tv80VarY == null || cioVar != null) {
                        return cioVar != null ? Next.h(c2y0.a(c2y0Var, true, (cio) null, 2)) : Next.j();
                    }
                    return Next.a(Collections.singleton(new v1y0(tv80VarY)));
                }
                if (u890.j(b2y0Var, x1y0.a)) {
                    return Next.h(c2y0.a(c2y0Var, false, (cio) null, 2));
                }
                if (b2y0Var instanceof y1y0) {
                    return Next.i(c2y0.a(c2y0Var, false, (cio) null, 2), Collections.singleton(new v1y0(((y1y0) b2y0Var).a)));
                }
                if (b2y0Var instanceof z1y0) {
                    return Next.i(c2y0.a(c2y0Var, false, (cio) null, 2), Collections.singleton(new v1y0(((z1y0) b2y0Var).a)));
                }
                eg.o();
                return null;
            case 12:
                z3y0 z3y0Var = (z3y0) obj;
                tq80 tq80Var5 = (tq80) obj2;
                cio cioVar2 = z3y0Var.d;
                g3d0 g3d0Var = z3y0Var.c;
                Set set = z3y0Var.b;
                y3y0 y3y0Var = (y3y0) tq80Var5.a;
                if (y3y0Var instanceof u3y0) {
                    u3y0 u3y0Var = (u3y0) y3y0Var;
                    return Next.h(z3y0.a(z3y0Var, false, u3y0Var.a, u3y0Var.b, 1));
                }
                if (y3y0Var instanceof t3y0) {
                    tqw tqwVar5 = tq80Var5.b;
                    tv80 tv80VarY2 = tqwVar5 != null ? n3o1.y(tqwVar5) : null;
                    if (tv80VarY2 == null || cioVar2 != null) {
                        return cioVar2 != null ? Next.h(z3y0.a(z3y0Var, true, null, null, 14)) : Next.j();
                    }
                    return Next.a(Collections.singleton(new s3y0(tv80VarY2, set, g3d0Var)));
                }
                if (u890.j(y3y0Var, v3y0.a)) {
                    return Next.h(z3y0.a(z3y0Var, false, null, null, 14));
                }
                if (y3y0Var instanceof w3y0) {
                    return Next.i(z3y0.a(z3y0Var, false, null, null, 14), Collections.singleton(new s3y0(((w3y0) y3y0Var).a, set, g3d0Var)));
                }
                if (y3y0Var instanceof x3y0) {
                    return Next.i(z3y0.a(z3y0Var, false, null, null, 14), Collections.singleton(new s3y0(((x3y0) y3y0Var).a, set, g3d0Var)));
                }
                eg.o();
                return null;
            case 13:
                return d(obj, obj2);
            case 14:
                return e(obj, obj2);
            case 15:
                return f(obj, obj2);
            case 16:
                return g(obj, obj2);
            case 17:
                return mqo1.x((o501) obj, (f501) obj2);
            case 18:
                return h(obj, obj2);
            case 19:
                return i(obj, obj2);
            case 20:
                return j(obj, obj2);
            case 21:
                return k(obj, obj2);
            case 22:
                return l(obj, obj2);
            case 23:
                return m(obj, obj2);
            case 24:
                return n(obj, obj2);
            case 25:
                return o(obj, obj2);
            case 26:
                ep61 ep61Var = (ep61) obj;
                tq80 tq80Var6 = (tq80) obj2;
                dp61 dp61Var = (dp61) tq80Var6.a;
                if (dp61Var instanceof cp61) {
                    ep61Var.getClass();
                    return Next.h(ep61.a(ep61Var, ((cp61) dp61Var).a, null, 6));
                }
                if (u890.j(dp61Var, ap61.b)) {
                    String str25 = ep61Var.b;
                    tqw tqwVar6 = tq80Var6.b;
                    return Next.a(Collections.singleton(new yo61(str25, tqwVar6 != null ? n3o1.y(tqwVar6) : null)));
                }
                if (dp61Var instanceof bp61) {
                    ep61Var.getClass();
                    return Next.h(ep61.a(ep61Var, false, null, 3));
                }
                if (u890.j(dp61Var, ap61.a)) {
                    ep61Var.getClass();
                    return Next.i(ep61.a(ep61Var, false, null, 3), Collections.singleton(xo61.a));
                }
                eg.o();
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return p(obj, obj2);
            case 28:
                return q(obj, obj2);
            default:
                km71 km71Var = (km71) obj;
                im71 im71Var = (im71) obj2;
                if (im71Var instanceof fm71) {
                    int i9 = ((fm71) im71Var).a;
                    return Next.i(km71.a(km71Var, (ArrayList) null, i9, 1), Collections.singleton(new yl71(i9)));
                }
                if (!(im71Var instanceof gm71)) {
                    if (im71Var instanceof hm71) {
                        return Next.h(km71.a(km71Var, (ArrayList) null, ((hm71) im71Var).a, 1));
                    }
                    eg.o();
                    return null;
                }
                List list6 = km71Var.a;
                ArrayList arrayList6 = new ArrayList(q7h.U(list6, 10));
                int i10 = 0;
                for (Object obj4 : list6) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str26 = (String) obj4;
                    gm71 gm71Var = (gm71) im71Var;
                    if (i10 == gm71Var.a) {
                        str26 = gm71Var.b;
                    }
                    arrayList6.add(str26);
                    i10 = i11;
                }
                return Next.h(km71.a(km71Var, arrayList6, 0, 2));
        }
    }

    public Next b(dhm0 dhm0Var, tq80 tq80Var) {
        String str;
        ou80 ou80Var;
        Object next;
        boolean z2 = dhm0Var.P0;
        String str2 = dhm0Var.W0;
        boolean z3 = dhm0Var.d;
        boolean z4 = dhm0Var.c;
        Set set = dhm0Var.Z;
        Set set2 = dhm0Var.t;
        boolean z5 = dhm0Var.f;
        List list = dhm0Var.V0;
        xbe0 xbe0Var = dhm0Var.O0;
        List list2 = dhm0Var.R0;
        tqw tqwVar = tq80Var.b;
        Object obj = tq80Var.a;
        qzz qzzVar = (t600) obj;
        boolean z6 = qzzVar instanceof z300;
        mbe0 mbe0Var = mbe0.a;
        if (z6) {
            if (!u890.j(xbe0Var, mbe0Var) && !z5) {
                return Next.h(dhm0.a(dhm0Var, null, false, false, null, false, false, false, null, null, false, null, false, null, false, false, o7h.N0(list, o7h.k0(list2, list.size())), null, 1966079));
            }
            if (u890.j(xbe0Var, mbe0Var) || list2.size() - list.size() <= 0) {
                return !u890.j(xbe0Var, mbe0Var) ? Next.i(dhm0.a(dhm0Var, null, false, false, null, false, false, false, null, null, false, null, false, mbe0Var, false, false, null, null, 2080767), Collections.singleton(boo1.A(dhm0Var))) : Next.j();
            }
            dhm0 dhm0VarA = dhm0.a(dhm0Var, null, false, false, null, false, false, false, null, null, false, null, false, null, false, false, o7h.K0(list2, o7h.p1(list)), null, 1966079);
            xj61 xj61Var = new xj61();
            if (dhm0VarA.f && dhm0VarA.R0.size() < dhm0VarA.U0 * 2) {
                xj61Var.add(boo1.A(dhm0VarA));
            }
            return Next.i(dhm0VarA, cwl1.j(xj61Var));
        }
        if (qzzVar instanceof qzz) {
            String str3 = qzzVar.a;
            dhm0 dhm0VarA2 = dhm0.a(dhm0Var, null, false, false, null, false, false, false, null, dm61.x0(str3, set2), false, null, false, null, false, false, boo1.u(list2, Collections.singleton(str3)), null, 1965567);
            xj61 xj61Var2 = new xj61();
            if (dhm0VarA2.f && dhm0VarA2.R0.size() < dhm0VarA2.U0 * 2) {
                xj61Var2.add(boo1.A(dhm0VarA2));
            }
            return Next.i(dhm0VarA2, cwl1.j(xj61Var2));
        }
        if (qzzVar instanceof nvz) {
            nvz nvzVar = (nvz) obj;
            String str4 = nvzVar.b;
            List<p111> list3 = list2;
            Iterator it = list3.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((p111) next).b, str4));
            p111 p111Var = (p111) next;
            if (p111Var == null) {
                return Next.j();
            }
            if (p111Var.c) {
                return Next.j();
            }
            ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
            for (p111 p111VarA : list3) {
                if (u890.j(p111VarA.b, str4)) {
                    p111VarA = p111.a(p111VarA, true, false, (urt0) null, false, false, 254);
                }
                arrayList.add(p111VarA);
            }
            return Next.i(dhm0.a(dhm0Var, null, false, false, null, false, false, false, null, null, false, null, false, null, false, false, arrayList, null, 1966079), Collections.singleton(new f9w(nvzVar.a, str4, dhm0Var.W0, dhm0Var.b, tqwVar != null ? n3o1.y(tqwVar) : null)));
        }
        if (qzzVar instanceof ryz) {
            ryz ryzVar = (ryz) qzzVar;
            List<p111> list4 = list2;
            ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
            for (p111 p111VarA2 : list4) {
                if (u890.j(p111VarA2.b, ryzVar.b)) {
                    p111VarA2 = p111.a(p111VarA2, false, false, (urt0) null, false, false, 254);
                }
                arrayList2.add(p111VarA2);
            }
            return Next.i(dhm0.a(dhm0Var, null, false, false, null, false, false, false, null, null, false, null, false, null, false, false, arrayList2, null, 1966079), Collections.singleton(new lfw(ryzVar.a)));
        }
        boolean z7 = qzzVar instanceof h300;
        Set set3 = w7x.a;
        if (z7) {
            h300 h300Var = (h300) qzzVar;
            Set set4 = h300Var.d;
            boolean z8 = (list2.isEmpty() && !(u890.j(h300Var.c, dhm0Var.e) && set4.size() == set.size())) || h300Var.a != z4;
            dhm0 dhm0VarA3 = dhm0.a(dhm0Var, h300Var.b, h300Var.a, false, h300Var.c, !set4.equals(set) ? true : z5, false, false, null, set4.isEmpty() ? set3 : (!set.isEmpty() || dhm0Var.b.length() <= 0) ? set2 : set4, false, set4, false, null, false, false, boo1.u(list2, set4), null, 1961417);
            xj61 xj61Var3 = new xj61();
            if (z8) {
                xj61Var3.add(boo1.A(dhm0VarA3));
            }
            return Next.i(dhm0VarA3, cwl1.j(xj61Var3));
        }
        if (qzzVar instanceof v300) {
            return Next.h(dhm0.a(dhm0Var, null, false, false, null, false, false, false, null, null, false, null, false, (z3 && list2.isEmpty()) ? ube0.a : tae0.a, false, false, null, null, 2080767));
        }
        if (qzzVar instanceof g300) {
            g300 g300Var = (g300) qzzVar;
            List<p111> list5 = list2;
            ArrayList arrayList3 = new ArrayList(q7h.U(list5, 10));
            for (p111 p111Var2 : list5) {
                boolean zJ = u890.j(g300Var.d, str2);
                jrt0 jrt0Var = crt0.a;
                if (zJ && u890.j(g300Var.a, p111Var2.b)) {
                    if (g300Var.b) {
                        jrt0Var = jrt0.a;
                    } else if (g300Var.c) {
                        jrt0Var = ort0.a;
                    }
                }
                arrayList3.add(p111.a(p111Var2, false, false, jrt0Var, false, false, 247));
            }
            return Next.h(dhm0.a(dhm0Var, null, false, false, null, false, false, false, null, null, false, null, false, null, false, false, arrayList3, null, 1966079));
        }
        if (qzzVar instanceof gxz) {
            boolean z9 = ((gxz) qzzVar).a;
            boolean z10 = !z9;
            List list6 = list2;
            ArrayList arrayList4 = new ArrayList(q7h.U(list6, 10));
            Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                boolean z11 = z10;
                arrayList4.add(p111.a((p111) it2.next(), false, z11, (urt0) null, false, false, 251));
                z10 = z11;
            }
            dhm0 dhm0VarA4 = dhm0.a(dhm0Var, null, false, z10, null, false, false, false, null, null, false, null, false, null, false, false, arrayList4, null, 1966071);
            xj61 xj61Var4 = new xj61();
            if (z9 && z3 && dhm0VarA4.R0.isEmpty()) {
                xj61Var4.add(boo1.A(dhm0VarA4));
            }
            return Next.i(dhm0VarA4, cwl1.j(xj61Var4));
        }
        if (qzzVar instanceof szz) {
            p111 p111Var3 = ((szz) obj).b;
            boolean z12 = p111Var3.f;
            String str5 = p111Var3.b;
            if (z12 && z2) {
                return Next.a(Collections.singleton(new afw(str5)));
            }
            if (p111Var3.Y) {
                return Next.a(Collections.singleton(new hfw(str5)));
            }
            return Next.a(Collections.singleton(new cfw(str5, tqwVar != null ? n3o1.y(tqwVar) : null)));
        }
        boolean z13 = qzzVar instanceof w300;
        List list7 = z6x.a;
        if (z13) {
            w300 w300Var = (w300) qzzVar;
            Set set5 = dhm0Var.i;
            List list8 = w300Var.b;
            boolean zIsEmpty = list8.isEmpty();
            ibe0 ibe0Var = ibe0.a;
            if (zIsEmpty) {
                if (set5.isEmpty() || z4) {
                    return Next.h(dhm0.a(dhm0Var, null, false, false, null, false, false, false, null, null, false, null, false, ibe0Var, false, false, list7, null, 1949663));
                }
                dhm0 dhm0VarA5 = dhm0.a(dhm0Var, null, false, false, null, false, false, false, set3, null, false, null, false, mbe0Var, false, false, null, null, 2080511);
                return Next.i(dhm0VarA5, Collections.singleton(boo1.A(dhm0VarA5)));
            }
            LinkedHashSet linkedHashSetY0 = dm61.y0(set, set5);
            smc0 smc0VarN = k4p1.n();
            ArrayList arrayListU = boo1.u(list8, linkedHashSetY0);
            if (u890.j(xbe0Var, mbe0Var)) {
                smc0VarN.addAll(arrayListU);
            } else {
                smc0VarN.addAll(list2);
                smc0VarN.addAll(arrayListU);
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            List list9 = list8;
            ArrayList arrayList5 = new ArrayList(q7h.U(list9, 10));
            Iterator it3 = list9.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((p111) it3.next()).b);
            }
            dhm0 dhm0VarB = boo1.B(dhm0.a(dhm0Var, null, false, false, null, list8.size() >= w300Var.a, false, false, dm61.y0(set5, o7h.p1(arrayList5)), null, false, null, false, ibe0Var, false, false, smc0VarK, null, 1949407));
            return Next.i(dhm0VarB, Collections.singleton(new gew(dhm0VarB.W0, dhm0VarB.V0, dhm0Var.T0)));
        }
        if (qzzVar instanceof rzz) {
            rzz rzzVar = (rzz) obj;
            p111 p111Var4 = rzzVar.b;
            if (p111Var4.f && z2) {
                return Next.a(Collections.singleton(new afw(p111Var4.b)));
            }
            if (!dhm0Var.g) {
                return Next.j();
            }
            int i2 = rzzVar.a;
            if (tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null || (str = ou80Var.a) == null) {
                str = "";
            }
            return Next.a(Collections.singleton(new cew(i2, str2, str, list)));
        }
        if (qzzVar instanceof kyz) {
            boolean z14 = ((kyz) qzzVar).a;
            boolean z15 = !z14;
            if (!z14) {
                list7 = list2;
            }
            return Next.h(dhm0.a(dhm0Var, null, false, false, null, false, false, z15, null, null, false, null, false, null, false, false, list7, null, 1965951));
        }
        if (qzzVar instanceof jxz) {
            jxz jxzVar = (jxz) qzzVar;
            return Next.h(boo1.B(dhm0.a(dhm0Var, null, false, false, null, false, false, false, null, null, jxzVar.a, null, jxzVar.b, null, jxzVar.c, jxzVar.d, null, null, 1988607)));
        }
        if (qzzVar instanceof u300) {
            return Next.h(dhm0.a(dhm0Var, null, false, false, null, false, false, false, null, null, false, null, false, null, false, false, null, ((u300) qzzVar).a, 1572863));
        }
        if (qzzVar instanceof t300) {
            return Next.j();
        }
        if (qzzVar instanceof r400) {
            r400 r400Var = (r400) qzzVar;
            return Next.a(Collections.singleton(new f9w(0, r400Var.a, str2, dhm0Var.b, r400Var.b)));
        }
        eg.o();
        return null;
    }
}
