package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.voting.proto.v2.SendVotesRequestV2;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class gp71 implements Update {
    public final /* synthetic */ byte a;
    public static final gp71 b = new gp71(0);
    public static final gp71 c = new gp71(1);
    public static final gp71 d = new gp71(2);
    public static final gp71 e = new gp71(3);
    public static final gp71 f = new gp71(4);
    public static final gp71 g = new gp71(5);
    public static final gp71 h = new gp71(6);
    public static final gp71 i = new gp71(7);
    public static final gp71 j = new gp71(8);
    public static final gp71 k = new gp71(9);
    public static final gp71 l = new gp71(10);
    public static final gp71 m = new gp71(11);
    public static final gp71 n = new gp71(12);
    public static final gp71 o = new gp71(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final gp71 f18p = new gp71(14);
    public static final gp71 q = new gp71(15);
    public static final gp71 r = new gp71(16);
    public static final gp71 s = new gp71(17);
    public static final gp71 t = new gp71(18);
    public static final gp71 u = new gp71(19);
    public static final gp71 v = new gp71(20);
    public static final gp71 w = new gp71(21);
    public static final gp71 x = new gp71(22);
    public static final gp71 y = new gp71(23);
    public static final gp71 z = new gp71(24);
    public static final gp71 A = new gp71(25);
    public static final gp71 B = new gp71(26);
    public static final gp71 C = new gp71(27);
    public static final gp71 D = new gp71(28);
    public static final gp71 E = new gp71(29);

    public /* synthetic */ gp71(byte b2) {
        this.a = b2;
    }

    public static Next b(hua1 hua1Var, float f2) {
        fxa1 fxa1Var = hua1Var.n;
        hua1 hua1VarA = hua1.a(hua1Var, null, null, null, null, null, null, f2, false, false, null, false, false, null, !(fxa1Var instanceof exa1) ? exa1.a : fxa1Var, null, 24511);
        xj61 xj61Var = new xj61();
        if (!(fxa1Var instanceof exa1)) {
            xj61Var.add(cra1.a);
        }
        return Next.i(hua1VarA, cwl1.j(xj61Var));
    }

    public static Next c(p2l1 p2l1Var, String str, boolean z2) {
        f291 f291Var = p2l1Var.c;
        String str2 = p2l1Var.b;
        Next nextA = z2 ? Next.a(Effects.a(new i0l1[]{new i0l1(str)})) : null;
        if (nextA == null) {
            Set set = s4b1.f;
            if (uic.u(str)) {
                str2.getClass();
                nextA = Next.a(Effects.a(new q0l1[]{new q0l1(str, new l2l1(str2, "openedDeeplink", Collections.singletonMap("url", str)), !f291Var.j)}));
            } else {
                nextA = null;
            }
            if (nextA == null) {
                String host = Uri.parse(str).getHost();
                Next nextI = (host == null || host.equals(Uri.parse(f291Var.b).getHost()) || nhc1.R(host, ".spotify.com", true) || nhc1.R(host, ".byspotify.com", true)) ? Next.i(p2l1.a(p2l1Var, str, null, 125), Effects.a(new p0l1[]{new p0l1(str)})) : null;
                if (nextI != null) {
                    return nextI;
                }
                str2.getClass();
                return Next.a(Effects.a(new q0l1[]{new q0l1(str, new l2l1(str2, "openedExternalLink", Collections.singletonMap("url", str)), false)}));
            }
        }
        return nextA;
    }

    private final Next g(Object obj, Object obj2) {
        wjn0 wjn0Var = (wjn0) obj;
        ljn0 ljn0Var = (qjn0) obj2;
        ub ubVar = wjn0Var.d;
        if (!(ljn0Var instanceof ljn0)) {
            if (ljn0Var instanceof mjn0) {
                return Next.a(Effects.a(new cjn0[]{new cjn0(((mjn0) ljn0Var).a)}));
            }
            if (ljn0Var instanceof njn0) {
                return Next.h(wjn0.a(wjn0Var, (vjn0) null, ((njn0) ljn0Var).a, (ub) null, 11));
            }
            if (ljn0Var.equals(ojn0.a)) {
                if (wjn0Var.a instanceof ujn0) {
                    return !ubVar.a() ? Next.a(Effects.a(new djn0[]{djn0.a})) : Next.a(Effects.a(new bjn0[]{bjn0.a}));
                }
                return Next.a(Effects.a(new ejn0[]{ejn0.a}));
            }
            if (ljn0Var instanceof pjn0) {
                String str = ((pjn0) ljn0Var).a;
                return str.length() == 0 ? Next.h(wjn0.a(wjn0Var, tjn0.b, false, (ub) null, 14)) : Next.h(wjn0.a(wjn0Var, new ujn0(str), false, (ub) null, 14));
            }
            eg.o();
            return null;
        }
        ljn0 ljn0Var2 = ljn0Var;
        boolean z2 = ljn0Var2.a;
        int i2 = ljn0Var2.b;
        if (ubVar instanceof sb) {
            sb sbVarK = (sb) ubVar;
            gc gcVar = sbVarK.c;
            boolean z3 = sbVarK.e;
            switch (l1d.C(i2)) {
                case 0:
                    qc qcVar = sbVarK.a;
                    if (qcVar instanceof oc) {
                        sbVarK = sb.k(sbVarK, new oc(z2), null, null, null, 30);
                    } else if (!(qcVar instanceof pc)) {
                        eg.o();
                        return null;
                    }
                    break;
                case 1:
                case 2:
                    break;
                case 3:
                    nc ncVar = sbVarK.b;
                    if (ncVar instanceof ic) {
                        sbVarK = sb.k(sbVarK, null, new ic(z2, z3), null, null, 29);
                    } else if (ncVar instanceof mc) {
                        sbVarK = sb.k(sbVarK, null, new mc(z2, z3), null, null, 29);
                    } else if (!(ncVar instanceof jc)) {
                        if (ncVar instanceof kc) {
                            sbVarK = sb.k(sbVarK, null, new kc(z2, z3), null, null, 29);
                        } else {
                            if (!(ncVar instanceof lc)) {
                                eg.o();
                                return null;
                            }
                            sbVarK = sb.k(sbVarK, null, new lc(z2, z3), null, null, 29);
                        }
                    }
                    break;
                case 4:
                    if (gcVar instanceof ec) {
                        sbVarK = sb.k(sbVarK, null, null, new ec(z2, false), null, 27);
                    } else if (!(gcVar instanceof fc) && !(gcVar instanceof gc)) {
                        eg.o();
                        return null;
                    }
                    break;
                case 5:
                    if (!(gcVar instanceof ec) && !(gcVar instanceof fc)) {
                        if (!(gcVar instanceof gc)) {
                            eg.o();
                            return null;
                        }
                        sbVarK = sb.k(sbVarK, null, null, gc.b(gcVar, z2, false, 6), null, 27);
                    }
                    break;
                case 6:
                    if (!(gcVar instanceof ec) && !(gcVar instanceof fc)) {
                        if (!(gcVar instanceof gc)) {
                            eg.o();
                            return null;
                        }
                        sbVarK = sb.k(sbVarK, null, null, gc.b(gcVar, false, z2, 5), null, 27);
                    }
                    break;
                case 7:
                    zc zcVar = sbVarK.d;
                    if (zcVar instanceof yc) {
                        sbVarK = sb.k(sbVarK, null, null, null, new yc(z2, z3), 23);
                    } else if (!(zcVar instanceof xc)) {
                        eg.o();
                        return null;
                    }
                    break;
                default:
                    eg.o();
                    return null;
            }
            return Next.h(wjn0.a(wjn0Var, (vjn0) null, false, sbVarK, 7));
        }
        if (!(ubVar instanceof tb)) {
            eg.o();
            return null;
        }
        tb tbVarK = (tb) ubVar;
        gc gcVar2 = tbVarK.e;
        boolean z4 = tbVarK.f;
        switch (l1d.C(i2)) {
            case 0:
                break;
            case 1:
                ed edVar = tbVarK.a;
                if (edVar instanceof bd) {
                    tbVarK = tb.k(tbVarK, new bd(z2), null, null, null, null, 62);
                } else if (!(edVar instanceof cd)) {
                    if (!(edVar instanceof dd)) {
                        eg.o();
                        return null;
                    }
                    tbVarK = tb.k(tbVarK, new dd(z2), null, null, null, null, 62);
                }
                break;
            case 2:
                wc wcVar = tbVarK.b;
                if (wcVar instanceof rc) {
                    tbVarK = tb.k(tbVarK, null, new rc(z2), null, null, null, 61);
                } else if (!(wcVar instanceof sc) && !(wcVar instanceof tc) && !(wcVar instanceof vc) && !(wcVar instanceof uc)) {
                    eg.o();
                    return null;
                }
                break;
            case 3:
                nc ncVar2 = tbVarK.d;
                if (ncVar2 instanceof ic) {
                    tbVarK = tb.k(tbVarK, null, null, null, new ic(z2, z4), null, 55);
                } else if (ncVar2 instanceof mc) {
                    tbVarK = tb.k(tbVarK, null, null, null, new mc(z2, z4), null, 55);
                } else if (!(ncVar2 instanceof jc)) {
                    if (ncVar2 instanceof kc) {
                        tbVarK = tb.k(tbVarK, null, null, null, new kc(z2, z4), null, 55);
                    } else {
                        if (!(ncVar2 instanceof lc)) {
                            eg.o();
                            return null;
                        }
                        tbVarK = tb.k(tbVarK, null, null, null, new lc(z2, z4), null, 55);
                    }
                }
                break;
            case 4:
                if (gcVar2 instanceof ec) {
                    tbVarK = tb.k(tbVarK, null, null, null, null, new ec(z2, false), 47);
                } else if (!(gcVar2 instanceof fc) && !(gcVar2 instanceof gc)) {
                    eg.o();
                    return null;
                }
                break;
            case 5:
                if (!(gcVar2 instanceof ec) && !(gcVar2 instanceof fc)) {
                    if (!(gcVar2 instanceof gc)) {
                        eg.o();
                        return null;
                    }
                    tbVarK = tb.k(tbVarK, null, null, null, null, gc.b(gcVar2, z2, false, 6), 47);
                }
                break;
            case 6:
                if (!(gcVar2 instanceof ec) && !(gcVar2 instanceof fc)) {
                    if (!(gcVar2 instanceof gc)) {
                        eg.o();
                        return null;
                    }
                    tbVarK = tb.k(tbVarK, null, null, null, null, gc.b(gcVar2, false, z2, 5), 47);
                }
                break;
            case 7:
                zc zcVar2 = tbVarK.c;
                if (zcVar2 instanceof yc) {
                    tbVarK = tb.k(tbVarK, null, null, new yc(z2, z4), null, null, 59);
                } else if (!(zcVar2 instanceof xc)) {
                    eg.o();
                    return null;
                }
                break;
            default:
                eg.o();
                return null;
        }
        return Next.h(wjn0.a(wjn0Var, (vjn0) null, false, tbVarK, 7));
    }

    /* JADX WARN: Code duplicated, block: B:110:0x025e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0262  */
    private final Next h(Object obj, Object obj2) {
        xqa1 xqa1Var;
        hua1 hua1Var = (hua1) obj;
        ysa1 ysa1Var = (dta1) obj2;
        String str = hua1Var.b;
        Float f2 = hua1Var.e;
        String str2 = hua1Var.a;
        float f3 = hua1Var.g;
        if (ysa1Var instanceof wsa1) {
            wsa1 wsa1Var = (wsa1) ysa1Var;
            String str3 = wsa1Var.a;
            Float f4 = wsa1Var.b;
            return Next.h(hua1.a(hua1Var, null, null, null, str3, null, f4, f4 != null ? f4.floatValue() : f3, false, false, wsa1Var.c, false, false, null, null, null, 32151));
        }
        Float f5 = null;
        if (ysa1Var instanceof isa1) {
            if (f2 != null) {
                if (f2.floatValue() == 0.0f) {
                    f2 = null;
                }
                if (f2 != null) {
                    float fFloatValue = f2.floatValue();
                    int i2 = ((isa1) ysa1Var).a;
                    return b(hua1Var, i2 != jch0.U(fFloatValue) ? yoi1.o(i2 / fFloatValue, 0.7f, 1.3f) : 1.0f);
                }
            }
            return Next.j();
        }
        if (ysa1Var instanceof ksa1) {
            return b(hua1Var, yoi1.o((((ksa1) ysa1Var).a / 100.0f) + 1.0f, 0.7f, 1.3f));
        }
        if (ysa1Var instanceof osa1) {
            String str4 = hua1Var.d;
            if (str4 == null) {
                return Next.j();
            }
            ltt0 ltt0Var = hua1Var.j;
            if (ltt0Var == ltt0.c) {
                return Next.a(Collections.singleton(new bra1(str4)));
            }
            if (ltt0Var == ltt0.d) {
                return Next.a(Collections.singleton(new zqa1(str4)));
            }
            return hua1Var.b() ? Next.j() : Next.i(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, false, null, false, false, null, cxa1.a, null, 24575), Collections.singleton(new wqa1(str4, f3)));
        }
        boolean z2 = ysa1Var instanceof qsa1;
        cra1 cra1Var = cra1.a;
        if (z2) {
            return Next.a(Collections.singleton(cra1Var));
        }
        if (ysa1Var instanceof psa1) {
            return Next.h(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, false, null, false, false, null, ((psa1) ysa1Var).a, null, 24575));
        }
        if (ysa1Var instanceof ssa1) {
            return hua1Var.h ? Next.j() : Next.i(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, true, false, null, false, false, null, null, null, 32639), Collections.singleton(new tqa1(str2, str, f3, hua1Var.c)));
        }
        if (ysa1Var instanceof ysa1) {
            qig1 qig1Var = ysa1Var.a;
            qjg1 qjg1Var = qig1Var.b;
            qjg1 qjg1Var2 = qig1Var.a;
            qjg1Var2.getClass();
            if (!(qjg1Var2 instanceof pjg1) && !(qjg1Var2 instanceof njg1)) {
                qjg1Var.getClass();
                if (!(qjg1Var instanceof pjg1) && !(qjg1Var instanceof njg1)) {
                    return Next.a(Collections.singleton(new rqa1(str2, qig1Var)));
                }
            }
            return Next.h(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, false, null, true, (qjg1Var2 instanceof pjg1) || (qjg1Var instanceof pjg1), qig1Var, null, null, 25599));
        }
        if (ysa1Var instanceof msa1) {
            if (!((msa1) ysa1Var).a) {
                return Next.h(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, false, null, false, false, null, null, null, 25471));
            }
            hua1 hua1VarA = hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, false, null, false, false, null, null, null, 25599);
            qig1 qig1Var2 = hua1Var.m;
            if (qig1Var2 == null) {
                qig1Var2 = qig1.c;
            }
            return Next.i(hua1VarA, Collections.singleton(new rqa1(str2, qig1Var2)));
        }
        if (ysa1Var instanceof xsa1) {
            if (!((xsa1) ysa1Var).a) {
                return Next.h(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, false, null, false, false, null, null, null, 28543));
            }
            if (f2 == null) {
                if (Math.abs(f3 - 1.0f) < 5.0E-4f) {
                    if (hua1Var.f != null) {
                        xqa1Var = new xqa1(str2, str);
                    }
                }
                return Next.a(Collections.singleton(xqa1Var));
            }
            float fFloatValue2 = f2.floatValue();
            if (jch0.U(fFloatValue2 * f3) == jch0.U(fFloatValue2)) {
                if (hua1Var.f != null) {
                    xqa1Var = new xqa1(str2, str);
                }
            }
            return Next.a(Collections.singleton(xqa1Var));
            xqa1Var = new yqa1(str2, f3, str);
            return Next.a(Collections.singleton(xqa1Var));
        }
        boolean z3 = ysa1Var instanceof usa1;
        sqa1 sqa1Var = sqa1.a;
        if (z3) {
            return Next.i(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, false, null, false, false, null, null, null, 25471), Collections.singleton(sqa1Var));
        }
        if (ysa1Var instanceof tsa1) {
            return Next.i(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, false, null, false, false, null, null, null, 25471), Collections.singleton(ara1.a));
        }
        if (ysa1Var instanceof jsa1) {
            return Next.i(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, false, null, false, false, null, null, null, 25471), Collections.singleton(sqa1Var));
        }
        if (ysa1Var instanceof nsa1) {
            return Next.a(Collections.singleton(sqa1Var));
        }
        if (ysa1Var instanceof lsa1) {
            boolean z4 = ((lsa1) ysa1Var).a;
            boolean z5 = !z4;
            if (z5 == hua1Var.i) {
                return Next.j();
            }
            return (z4 || (hua1Var.n instanceof exa1)) ? Next.h(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, z5, null, false, false, null, null, null, 32511)) : Next.i(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, true, null, false, false, null, exa1.a, null, 24319), Collections.singleton(cra1Var));
        }
        if (ysa1Var instanceof hsa1) {
            return Next.h(hua1.a(hua1Var, null, null, null, null, ((hsa1) ysa1Var).a, null, 0.0f, false, false, null, false, false, null, null, null, 32751));
        }
        if (ysa1Var instanceof rsa1) {
            return Next.h(hua1.a(hua1Var, null, null, null, null, null, null, 0.0f, false, false, null, false, false, null, null, ((rsa1) ysa1Var).a, 16383));
        }
        if (!(ysa1Var instanceof vsa1)) {
            eg.o();
            return null;
        }
        if (f2 != null) {
            if (f2.floatValue() == 0.0f) {
                f2 = null;
            }
            if (f2 != null) {
                float fFloatValue3 = ((vsa1) ysa1Var).a / f2.floatValue();
                Float fValueOf = Float.valueOf(fFloatValue3);
                if (0.7f <= fFloatValue3 && fFloatValue3 <= 1.3f) {
                    f5 = fValueOf;
                }
                return f5 != null ? Next.h(hua1.a(hua1Var, null, null, null, null, null, null, f5.floatValue(), false, false, null, false, false, null, null, null, 32703)) : Next.j();
            }
        }
        return Next.j();
    }

    private final Next i(Object obj, Object obj2) throws Throwable {
        g7d1 g7d1VarA;
        boolean z2;
        boolean z3;
        g7d1 g7d1Var = (g7d1) obj;
        s6d1 s6d1Var = (v6d1) obj2;
        int i2 = g7d1Var.d;
        List list = g7d1Var.b;
        Throwable th = null;
        if (s6d1Var instanceof s6d1) {
            jy0 jy0Var = s6d1Var.a;
            if (!(jy0Var instanceof jy0)) {
                if (u890.j(jy0Var, iy0.a)) {
                    return Next.a(Effects.a(new y4d1[]{new y4d1(g7d1Var, 9)}));
                }
                eg.o();
                return null;
            }
            Map map = jy0Var.a;
            g7d1 g7d1VarA2 = g7d1.a(g7d1Var, (ArrayList) null, (f7d1) null, 0, false, map, 2047);
            if (g7d1Var.i) {
                return Next.i(g7d1VarA2, Effects.a(new y4d1[]{new y4d1(g7d1Var, 8)}));
            }
            List<z6d1> list2 = g7d1VarA2.b;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (z6d1 z6d1Var : list2) {
                List<y6d1> list3 = z6d1Var.e;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                for (y6d1 y6d1Var : list3) {
                    arrayList2.add(y6d1.a(y6d1Var, !y6d1Var.c && u890.j((String) map.get(y6d1Var.a), "INTEREST_LEVEL_SEE_MORE")));
                }
                if (arrayList2.isEmpty()) {
                    z3 = false;
                    break;
                }
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                        break;
                    }
                    if (((y6d1) it.next()).d) {
                        z3 = true;
                        break;
                    }
                }
                arrayList.add(z6d1.a(z6d1Var, arrayList2, z3));
            }
            return Next.h(g7d1.a(g7d1VarA2, arrayList, (f7d1) null, 0, false, (Map) null, 4093));
        }
        if (!(s6d1Var instanceof p6d1)) {
            if (s6d1Var instanceof q6d1) {
                if (i2 < p7h.L(list)) {
                    g7d1 g7d1VarA3 = g7d1.a(g7d1Var, (ArrayList) null, (f7d1) null, i2 + 1, false, (Map) null, 4087);
                    return Next.i(g7d1VarA3, Effects.a(new d5d1[]{new d5d1(g7d1VarA3)}));
                }
                g7d1 g7d1VarA4 = g7d1.a(g7d1Var, (ArrayList) null, e7d1.a, 0, false, (Map) null, 4091);
                return Next.i(g7d1VarA4, dm61.y0(Effects.a(new f5d1[]{new f5d1(g7d1VarA4)}), u890.j(g7d1Var.k, "topic_survey") ? Effects.a(new b5d1[]{new b5d1(g7d1VarA4)}) : Effects.a(new u4d1[]{new u4d1(false)})));
            }
            boolean z4 = s6d1Var instanceof t6d1;
            c7d1 c7d1Var = c7d1.a;
            if (z4) {
                return ((t6d1) s6d1Var).a ? Next.a(Effects.a(new u4d1[]{new u4d1(false)})) : Next.i(g7d1.a(g7d1Var, (ArrayList) null, c7d1Var, 0, false, (Map) null, 4091), Effects.a(new u4d1[]{new u4d1(true)}));
            }
            if (s6d1Var instanceof r6d1) {
                a6d1 a6d1Var = ((r6d1) s6d1Var).a;
                if (u890.j(a6d1Var, z5d1.a)) {
                    return Next.j();
                }
                if (a6d1Var instanceof y5d1) {
                    return Next.i(g7d1.a(g7d1Var, (ArrayList) null, c7d1Var, 0, false, (Map) null, 4091), Effects.a(new w4d1[]{new w4d1(g7d1Var, ((y5d1) a6d1Var).a)}));
                }
                eg.o();
                return null;
            }
            if (s6d1Var instanceof n6d1) {
                return Next.h(g7d1.a(g7d1Var, (ArrayList) null, (f7d1) null, 0, false, (Map) null, 3839));
            }
            if (s6d1Var instanceof u6d1) {
                return Next.a(Effects.a(new z4d1[]{new z4d1()}));
            }
            if (!(s6d1Var instanceof o6d1)) {
                eg.o();
                return null;
            }
            if (!((o6d1) s6d1Var).a) {
                return Next.h(g7d1.a(g7d1Var, (ArrayList) null, (f7d1) null, 0, false, (Map) null, 3583));
            }
            g7d1 g7d1VarA5 = g7d1.a(g7d1Var, (ArrayList) null, (f7d1) null, 0, true, (Map) null, 3583);
            return Next.i(g7d1VarA5, w6d1.z(g7d1VarA5));
        }
        p6d1 p6d1Var = (p6d1) s6d1Var;
        int i3 = p6d1Var.a;
        int i4 = p6d1Var.b;
        if (i3 < list.size()) {
            boolean z5 = ((z6d1) list.get(i3)).d == 2;
            z6d1 z6d1Var2 = (z6d1) list.get(i3);
            y6d1 y6d1Var2 = (y6d1) o7h.t0(i4, z6d1Var2.e);
            boolean z6 = y6d1Var2 != null && y6d1Var2.c;
            List list4 = z6d1Var2.e;
            ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
            int i5 = 0;
            for (Object obj3 : list4) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    Throwable th2 = th;
                    p7h.T();
                    throw th2;
                }
                y6d1 y6d1VarA = (y6d1) obj3;
                Throwable th3 = th;
                boolean z7 = !z6 && y6d1VarA.c;
                if (z5 && i4 == i5) {
                    y6d1VarA = y6d1.a(y6d1VarA, true);
                } else if (i4 == i5) {
                    y6d1VarA = y6d1.a(y6d1VarA, !y6d1VarA.d);
                } else if (z5 || z6 || z7) {
                    y6d1VarA = y6d1.a(y6d1VarA, false);
                }
                arrayList3.add(y6d1VarA);
                th = th3;
                i5 = i6;
            }
            Throwable th4 = th;
            List list5 = list;
            ArrayList arrayList4 = new ArrayList(q7h.U(list5, 10));
            int i7 = 0;
            for (Object obj4 : list5) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    p7h.T();
                    throw th4;
                }
                z6d1 z6d1VarA = (z6d1) obj4;
                if (i7 == i3) {
                    if (arrayList3.isEmpty()) {
                        z2 = false;
                        break;
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        }
                        if (((y6d1) it2.next()).d) {
                            z2 = true;
                            break;
                        }
                    }
                    z6d1VarA = z6d1.a(z6d1VarA, arrayList3, z2);
                }
                arrayList4.add(z6d1VarA);
                i7 = i8;
            }
            g7d1VarA = g7d1.a(g7d1Var, arrayList4, (f7d1) null, 0, false, (Map) null, 4093);
        } else {
            g7d1VarA = g7d1Var;
        }
        return Next.i(g7d1VarA, Effects.a(new c5d1[]{new c5d1(g7d1Var, g7d1VarA, p6d1Var)}));
    }

    private final Next j(Object obj, Object obj2) {
        erf1 erf1Var = (erf1) obj;
        tq80 tq80Var = (tq80) obj2;
        arf1 arf1Var = (brf1) tq80Var.a;
        if (arf1Var instanceof arf1) {
            return Next.a(Collections.singleton(new wqf1(arf1Var.b)));
        }
        if (arf1Var instanceof zqf1) {
            srt0 srt0Var = erf1Var.b;
            srt0 srt0Var2 = ((zqf1) arf1Var).a;
            return u890.j(srt0Var, srt0Var2) ? Next.j() : Next.h(new erf1(erf1Var.a, srt0Var2));
        }
        if (!(arf1Var instanceof yqf1)) {
            eg.o();
            return null;
        }
        tqw tqwVar = tq80Var.b;
        if (tqwVar != null) {
            return Next.a(Collections.singleton(new xqf1(((yqf1) arf1Var).b, n3o1.y(tqwVar))));
        }
        return Next.j();
    }

    private final Next k(Object obj, Object obj2) {
        ccg1 ccg1Var = (ccg1) obj;
        xbg1 xbg1Var = (bcg1) obj2;
        tcd1 tcd1Var = ccg1Var.e;
        boolean z2 = ccg1Var.l;
        boolean z3 = ccg1Var.k;
        boolean zEquals = xbg1Var.equals(tbg1.a);
        tcd1 tcd1Var2 = tcd1.c;
        pbg1 pbg1Var = pbg1.a;
        if (zEquals) {
            if (tcd1Var == tcd1Var2) {
                return Next.j();
            }
            if (!ccg1Var.f) {
                return Next.j();
            }
            if (ccg1Var.n) {
                return Next.i(ccg1.a(ccg1Var, (String) null, (String) null, (ArrayList) null, 0, (tcd1) null, false, false, 0, 0, 0, ccg1Var.b(), false, false, false, false, 27647), ccg1Var.b() ? Collections.singleton(pbg1Var) : Collections.singleton(qbg1.a));
            }
            return Next.h(ccg1.a(ccg1Var, (String) null, (String) null, (ArrayList) null, 0, (tcd1) null, false, false, 0, 0, 0, false, false, false, true, false, 24575));
        }
        if (xbg1Var instanceof acg1) {
            acg1 acg1Var = (acg1) xbg1Var;
            return Next.h(ccg1.a(ccg1Var, (String) null, (String) null, (ArrayList) null, 0, (tcd1) null, false, false, 0, acg1Var.a, acg1Var.b, false, false, false, false, false, 31999));
        }
        if (xbg1Var instanceof ubg1) {
            return (z3 || tcd1Var == tcd1Var2) ? Next.j() : Next.i(ccg1.a(ccg1Var, (String) null, (String) null, (ArrayList) null, 0, (tcd1) null, false, false, 0, 0, 0, true, false, true, false, false, 27647), Collections.singleton(pbg1Var));
        }
        if (xbg1Var instanceof xbg1) {
            xbg1 xbg1Var2 = xbg1Var;
            if (tcd1Var == tcd1Var2) {
                return Next.j();
            }
            ccg1 ccg1VarA = ccg1.a(ccg1Var, (String) null, (String) null, (ArrayList) null, 0, (tcd1) null, false, false, xbg1Var2.a, 0, 0, false, false, false, false, false, 32639);
            boolean zB = !ccg1VarA.k ? ccg1VarA.b() : true;
            return Next.i(ccg1.a(ccg1VarA, (String) null, (String) null, (ArrayList) null, 0, (tcd1) null, false, false, 0, 0, 0, zB, false, false, false, false, 31743), (z3 || !zB) ? w7x.a : Collections.singleton(pbg1Var));
        }
        if (xbg1Var.equals(wbg1.a)) {
            return z2 ? Next.j() : Next.h(ccg1.a(ccg1Var, (String) null, (String) null, (ArrayList) null, 0, (tcd1) null, false, false, 0, 0, 0, false, true, false, false, false, 30719));
        }
        if (xbg1Var.equals(vbg1.a)) {
            return !z2 ? Next.j() : Next.h(ccg1.a(ccg1Var, (String) null, (String) null, (ArrayList) null, 0, (tcd1) null, false, false, 0, 0, 0, false, false, false, false, false, 30719));
        }
        if (xbg1Var instanceof ybg1) {
            ybg1 ybg1Var = (ybg1) xbg1Var;
            return Next.h(ccg1.a(ccg1Var, (String) null, (String) null, (ArrayList) null, 0, (tcd1) null, ybg1Var.a, ybg1Var.b, 0, 0, 0, false, false, false, false, false, 32671));
        }
        if (xbg1Var instanceof zbg1) {
            zbg1 zbg1Var = (zbg1) xbg1Var;
            return tcd1Var == tcd1Var2 ? Next.j() : Next.a(Collections.singleton(new sbg1(zbg1Var.a, zbg1Var.b)));
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    private final Next l(Object obj, Object obj2) {
        c9 c9VarS;
        jth1 jth1Var = (jth1) obj;
        cth1 cth1Var = (gth1) obj2;
        String str = jth1Var.e;
        ith1 ith1Var = jth1Var.f;
        if (cth1Var instanceof fth1) {
            return Next.a(Collections.singleton(new jsh1(cth1Var)));
        }
        if (cth1Var.equals(bth1.a)) {
            return (!jth1Var.g || jth1Var.i || ith1Var == null || str == null) ? Next.j() : Next.i(jth1.a(jth1Var, (c380) null, (String) null, false, true, (String) null, (String) null, 1791), Collections.singleton(new lsh1(str, ith1Var)));
        }
        if (!(cth1Var instanceof ath1)) {
            if (cth1Var instanceof cth1) {
                return Next.h(jth1.a(jth1Var, (c380) null, (String) null, cth1Var.a, false, (String) null, (String) null, 1599));
            }
            if (cth1Var.equals(eth1.a)) {
                jth1 jth1VarA = jth1.a(jth1Var, (c380) null, (String) null, false, false, (String) null, (String) null, 1727);
                String str2 = jth1Var.k;
                return Next.i(jth1VarA, (ihc1.y0(str2) || str == null || ith1Var == null) ? w7x.a : Collections.singleton(new msh1(str2, str, ith1Var)));
            }
            if (cth1Var.equals(dth1.a)) {
                return Next.h(jth1.a(jth1Var, (c380) null, (String) null, false, false, (String) null, (String) null, 1791));
            }
            eg.o();
            return null;
        }
        ath1 ath1Var = (ath1) cth1Var;
        String str3 = ath1Var.b;
        if (str3 == null) {
            c9VarS = jth1Var.a;
        } else {
            if (ihc1.y0(str3)) {
                str3 = null;
            }
            if (str3 == null || (c9VarS = mqo1.s(new String[]{str3})) == null) {
                c9VarS = jth1Var.a;
            }
        }
        c9 c9Var = c9VarS;
        String str4 = ath1Var.a;
        String str5 = ihc1.y0(str4) ? null : str4;
        if (str5 == null) {
            str5 = jth1Var.b;
        }
        return Next.h(jth1.a(jth1Var, c9Var, str5, false, false, (String) null, (String) null, 2044));
    }

    private final Next m(Object obj, Object obj2) {
        wwh1 wwh1Var = (wwh1) obj;
        swh1 swh1Var = (vwh1) obj2;
        wwh1Var.getClass();
        swh1Var.getClass();
        if (swh1Var.equals(twh1.a)) {
            return Next.a(Collections.singleton(iwh1.a));
        }
        if (swh1Var instanceof uwh1) {
            return Next.j();
        }
        if (swh1Var instanceof rwh1) {
            return Next.j();
        }
        if (swh1Var instanceof swh1) {
            swh1 swh1Var2 = swh1Var;
            return Next.a(Collections.singleton(new lwh1(swh1Var2.a, swh1Var2.b)));
        }
        if (!(swh1Var instanceof mwh1)) {
            if (swh1Var instanceof qwh1) {
                return Next.h(wwh1.a(wwh1Var, (bro1) null, true, (String) null, 5));
            }
            if (swh1Var instanceof owh1) {
                return Next.h(wwh1.a(wwh1Var, (bro1) null, false, (String) null, 5));
            }
            boolean z2 = swh1Var instanceof pwh1;
            jwh1 jwh1Var = jwh1.a;
            if (z2) {
                return Next.i(wwh1.a(wwh1Var, (bro1) null, false, (String) null, 5), Collections.singleton(jwh1Var));
            }
            if (swh1Var instanceof nwh1) {
                return Next.i(wwh1.a(wwh1Var, (bro1) null, false, (String) null, 3), Collections.singleton(jwh1Var));
            }
            eg.o();
            return null;
        }
        bro1 bro1Var = ((mwh1) swh1Var).a;
        wk7 wk7Var = bro1Var instanceof wk7 ? (wk7) bro1Var : null;
        String str = wk7Var != null ? wk7Var.c : wwh1Var.c;
        boolean z3 = bro1Var instanceof yk7;
        b4g b4gVar = b4g.b;
        b4g b4gVar2 = b4g.a;
        b4g b4gVar3 = z3 ? b4gVar2 : b4gVar;
        xj61 xj61Var = new xj61();
        xj61Var.add(new kwh1(bro1Var));
        if (wwh1Var.a instanceof yk7) {
            b4gVar = b4gVar2;
        }
        if (b4gVar3 != b4gVar) {
            xj61Var.add(new hwh1(b4gVar3));
        }
        return Next.i(wwh1.a(wwh1Var, bro1Var, false, str, 2), cwl1.j(xj61Var));
    }

    private final Next n(Object obj, Object obj2) {
        ou80 ou80Var;
        g6i1 g6i1Var = (i6i1) obj;
        tq80 tq80Var = (tq80) obj2;
        Object obj3 = tq80Var.a;
        if (g6i1Var instanceof h6i1) {
            h6i1 h6i1Var = (h6i1) g6i1Var;
            y5i1 y5i1Var = h6i1Var.c;
            m5i1 m5i1Var = (r5i1) obj3;
            if (m5i1Var instanceof m5i1) {
                m5i1 m5i1Var2 = m5i1Var;
                return Next.h(new g6i1(h6i1Var.a, h6i1Var.b, y5i1Var, h6i1Var.d, m5i1Var2.a, m5i1Var2.b, m5i1Var2.c, m5i1Var2.d, m5i1Var2.e));
            }
            if (m5i1Var instanceof l5i1) {
                Logger.d("UserActivityRowElement", new Object[]{"Metadata loading failed: ".concat(((l5i1) m5i1Var).a)});
                return Next.h(new f6i1(h6i1Var.a, h6i1Var.b, y5i1Var, h6i1Var.d));
            }
            if (m5i1Var instanceof i5i1) {
                return y5i1Var instanceof y5i1 ? Next.h(h6i1.b(h6i1Var, new t5i1(y5i1Var.getUri(), ((i5i1) m5i1Var).a))) : Next.j();
            }
            if (m5i1Var instanceof h5i1) {
                Logger.d("UserActivityRowElement", new Object[]{"Context data loading failed: ".concat(((h5i1) m5i1Var).a)});
                return y5i1Var instanceof u5i1 ? Next.h(h6i1.b(h6i1Var, new s5i1(((u5i1) y5i1Var).a))) : Next.j();
            }
            if (m5i1Var instanceof j5i1) {
                return y5i1Var instanceof y5i1 ? Next.h(h6i1.b(h6i1Var, new w5i1(y5i1Var.getUri()))) : Next.j();
            }
            return Next.j();
        }
        lst0 jst0Var = null;
        if (!(g6i1Var instanceof g6i1)) {
            if (g6i1Var instanceof f6i1) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        g6i1 g6i1Var2 = g6i1Var;
        String str = g6i1Var2.b;
        t5i1 t5i1Var = g6i1Var2.c;
        tqw tqwVar = tq80Var.b;
        q5i1 q5i1Var = (r5i1) obj3;
        if (!(q5i1Var instanceof q5i1)) {
            if (q5i1Var instanceof n5i1) {
                tqwVar.getClass();
                return Next.a(Collections.singleton(new bfw(str, n3o1.y(tqwVar))));
            }
            boolean z2 = q5i1Var instanceof k5i1;
            n9w n9wVar = n9w.a;
            if (z2) {
                return Next.a(Collections.singleton(n9wVar));
            }
            if (q5i1Var instanceof p5i1) {
                return Next.a(Collections.singleton(n9wVar));
            }
            if (q5i1Var instanceof o5i1) {
                Logger.d("UserActivityRowElement", new Object[]{gvg.h("Playback failed for ", str, ": ", ((o5i1) q5i1Var).a)});
                return Next.a(Collections.singleton(n9wVar));
            }
            if (q5i1Var instanceof m5i1) {
                m5i1 m5i1Var3 = (m5i1) q5i1Var;
                return Next.h(g6i1.b(g6i1Var2, 0L, (String) null, (z5i1) null, false, m5i1Var3.a, m5i1Var3.b, m5i1Var3.c, m5i1Var3.d, m5i1Var3.e, 15));
            }
            if (q5i1Var instanceof l5i1) {
                Logger.d("UserActivityRowElement", new Object[]{"Metadata loading failed: ".concat(((l5i1) q5i1Var).a)});
                return Next.j();
            }
            if (q5i1Var instanceof i5i1) {
                return t5i1Var instanceof y5i1 ? Next.h(g6i1.b(g6i1Var2, 0L, (String) null, new t5i1(((y5i1) t5i1Var).getUri(), ((i5i1) q5i1Var).a), false, (String) null, (String) null, (String) null, (List) null, (String) null, 507)) : Next.j();
            }
            if (q5i1Var instanceof h5i1) {
                Logger.d("UserActivityRowElement", new Object[]{"Context data loading failed: ".concat(((h5i1) q5i1Var).a)});
                return t5i1Var instanceof u5i1 ? Next.h(g6i1.b(g6i1Var2, 0L, (String) null, new s5i1(((u5i1) t5i1Var).a), false, (String) null, (String) null, (String) null, (List) null, (String) null, 507)) : Next.j();
            }
            if (q5i1Var instanceof j5i1) {
                return t5i1Var instanceof y5i1 ? Next.h(g6i1.b(g6i1Var2, 0L, (String) null, new w5i1(((y5i1) t5i1Var).getUri()), false, (String) null, (String) null, (String) null, (List) null, (String) null, 507)) : Next.j();
            }
            eg.o();
            return null;
        }
        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        boolean z3 = t5i1Var instanceof t5i1;
        x5i1 x5i1Var = x5i1.a;
        v5i1 v5i1Var = v5i1.a;
        if (!z3 && !(t5i1Var instanceof u5i1) && !(t5i1Var instanceof s5i1) && !(t5i1Var instanceof w5i1) && !t5i1Var.equals(v5i1Var)) {
            if (!t5i1Var.equals(x5i1Var)) {
                eg.o();
                return null;
            }
            if (tv80VarY != null && (ou80Var = tv80VarY.a) != null) {
                jst0Var = ou80Var.a;
            }
            if (jst0Var == null) {
                jst0Var = "";
            }
            return Next.a(Collections.singleton(new ydw(q5i1Var.a, jst0Var)));
        }
        String str2 = q5i1Var.a;
        String str3 = g6i1Var2.i;
        if (z3) {
            jst0Var = new jst0(t5i1Var.a);
        } else if ((t5i1Var instanceof u5i1) || (t5i1Var instanceof s5i1)) {
            jst0Var = new jst0(((y5i1) t5i1Var).getUri());
        } else if ((t5i1Var instanceof w5i1) || t5i1Var.equals(v5i1Var)) {
            if (str3 != null) {
                jst0Var = new hst0(str3);
            }
        } else if (!t5i1Var.equals(x5i1Var)) {
            eg.o();
            return null;
        }
        return Next.a(Collections.singleton(new aew(str2, jst0Var, tv80VarY)));
    }

    private final Next o(Object obj, Object obj2) {
        rhj1 rhj1Var = (rhj1) obj;
        jhj1 jhj1Var = (khj1) obj2;
        u771 u771Var = rhj1Var.h;
        if (jhj1Var instanceof jhj1) {
            return Next.h(rhj1.a(rhj1Var, (String) null, (jlw0) null, (u771) null, (phj1) null, jhj1Var.a, 2047));
        }
        if (jhj1Var instanceof ghj1) {
            rhj1 rhj1VarA = rhj1.a(rhj1Var, (String) null, (jlw0) null, (u771) null, (phj1) null, (wkt) null, 2047);
            ghj1 ghj1Var = (ghj1) jhj1Var;
            wkt wktVar = ghj1Var.a;
            int i2 = rhj1Var.f;
            return Next.i(rhj1VarA, Collections.singleton(new bhj1(rhj1Var.h, wktVar, new ant(i2, i2), ghj1Var.b, ghj1Var.c)));
        }
        if (jhj1Var instanceof ihj1) {
            ihj1 ihj1Var = (ihj1) jhj1Var;
            return Next.i(rhj1Var, Collections.singleton(new zgj1(ihj1Var.b, ihj1Var.c, ihj1Var.d)));
        }
        if (jhj1Var instanceof ehj1) {
            ehj1 ehj1Var = (ehj1) jhj1Var;
            u771 u771VarA = u771.a(u771Var, t771.a(u771Var.a, wa71.a(u771Var.a.a, ehj1Var.a, (cqs0) null, (String) null, 126), (z771) null, 2), (pz61) null, (bj71) null, 6);
            return Next.h(rhj1.a(rhj1Var, ehj1Var.a, ehj1Var.e, u771VarA, new mhj1(ehj1Var.b, ehj1Var.d, ehj1Var.c), (wkt) null, 2937));
        }
        if (jhj1Var instanceof dhj1) {
            return Next.h(rhj1.a(rhj1Var, (String) null, (jlw0) null, (u771) null, lhj1.a, (wkt) null, 3071));
        }
        boolean z2 = jhj1Var instanceof hhj1;
        ohj1 ohj1Var = ohj1.a;
        if (z2) {
            return Next.i(rhj1.a(rhj1Var, (String) null, (jlw0) null, (u771) null, ohj1Var, (wkt) null, 3071), Collections.singleton(new ahj1(rhj1Var.a, rhj1Var.b, rhj1Var.h, rhj1Var.i, rhj1Var.t, rhj1Var.c)));
        }
        if (!(jhj1Var instanceof fhj1)) {
            eg.o();
            return null;
        }
        xj61 xj61Var = new xj61();
        String str = rhj1Var.a;
        String str2 = ((fhj1) jhj1Var).a;
        xj61Var.add(new ahj1(str, str2, rhj1Var.h, rhj1Var.i, rhj1Var.t, rhj1Var.c));
        if (u771Var.b.d) {
            xj61Var.add(new chj1(rhj1Var.a, str2));
        }
        return Next.i(rhj1.a(rhj1Var, str2, (jlw0) null, (u771) null, ohj1Var, (wkt) null, 3069), cwl1.j(xj61Var));
    }

    private final Next p(Object obj, Object obj2) {
        xuj1 xuj1Var = (xuj1) obj;
        wtj1 wtj1Var = (cuj1) obj2;
        bm31 bm31Var = xuj1Var.b;
        int i2 = xuj1Var.d;
        wuj1 wuj1Var = xuj1Var.a;
        boolean z2 = wtj1Var instanceof wtj1;
        puj1 puj1Var = puj1.a;
        if (z2) {
            bm31 bm31Var2 = wtj1Var.a;
            return Next.i(xuj1.a(xuj1Var, puj1Var, bm31Var2, (oi31) null, 0, 60), Collections.singleton(new nsj1(bm31Var2.a, bm31Var2.c)));
        }
        if (wtj1Var instanceof vtj1) {
            return Next.h(xuj1.a(xuj1Var, new tuj1(((vtj1) wtj1Var).a), (bm31) null, (oi31) null, 0, 62));
        }
        if (wtj1Var instanceof xtj1) {
            return Next.h(xuj1.a(xuj1Var, new vuj1(((xtj1) wtj1Var).a), (bm31) null, (oi31) null, 0, 62));
        }
        if (wtj1Var instanceof utj1) {
            return Next.h(xuj1.a(xuj1Var, suj1.a, (bm31) null, ((utj1) wtj1Var).a, 0, 58));
        }
        boolean z3 = wtj1Var instanceof stj1;
        wuj1 wuj1Var2 = ruj1.a;
        wuj1 wuj1Var3 = quj1.a;
        if (z3) {
            if (!(wuj1Var instanceof suj1)) {
                return Next.j();
            }
            if (!xuj1Var.e || xuj1Var.f) {
                wuj1Var3 = wuj1Var2;
            }
            return Next.h(xuj1.a(xuj1Var, wuj1Var3, (bm31) null, (oi31) null, 0, 54));
        }
        if (wtj1Var instanceof ttj1) {
            int i3 = i2 + 1;
            return Next.i(xuj1.a(xuj1Var, new tuj1(((ttj1) wtj1Var).a), (bm31) null, (oi31) null, i3, 50), Collections.singleton(new psj1(Math.min((long) (Math.pow(2.0d, i2) * 200.0d), 3200L), i3)));
        }
        if (wtj1Var instanceof rtj1) {
            if (!(wuj1Var instanceof suj1)) {
                return Next.j();
            }
            int i4 = i2 + 1;
            return Next.i(xuj1.a(xuj1Var, new tuj1(((rtj1) wtj1Var).a), (bm31) null, (oi31) null, i4, 50), Collections.singleton(new psj1(Math.min((long) (Math.pow(2.0d, i2) * 200.0d), 3200L), i4)));
        }
        boolean z4 = wtj1Var instanceof buj1;
        osj1 osj1Var = osj1.a;
        uuj1 uuj1Var = uuj1.a;
        if (z4) {
            if (wuj1Var instanceof tuj1) {
                return bm31Var != null ? Next.i(xuj1.a(xuj1Var, puj1Var, (bm31) null, (oi31) null, 0, 62), Collections.singleton(new nsj1(bm31Var.a, bm31Var.c))) : Next.i(xuj1.a(xuj1Var, uuj1Var, (bm31) null, (oi31) null, 0, 62), Collections.singleton(osj1Var));
            }
            return Next.j();
        }
        if (wtj1Var instanceof ytj1) {
            if ((wuj1Var instanceof tuj1) && i2 == ((ytj1) wtj1Var).a) {
                return bm31Var != null ? Next.i(xuj1.a(xuj1Var, puj1Var, (bm31) null, (oi31) null, 0, 62), Collections.singleton(new nsj1(bm31Var.a, bm31Var.c))) : Next.i(xuj1.a(xuj1Var, uuj1Var, (bm31) null, (oi31) null, 0, 62), Collections.singleton(osj1Var));
            }
            return Next.j();
        }
        if (wtj1Var instanceof auj1) {
            return wuj1Var instanceof quj1 ? Next.h(xuj1.a(xuj1Var, wuj1Var2, (bm31) null, (oi31) null, 0, 30)) : Next.j();
        }
        if (wtj1Var instanceof ztj1) {
            return wuj1Var instanceof ruj1 ? Next.h(xuj1.a(xuj1Var, wuj1Var3, (bm31) null, (oi31) null, 0, 62)) : Next.j();
        }
        eg.o();
        return null;
    }

    private final Next q(Object obj, Object obj2) {
        y0k1 y0k1VarA;
        y0k1 y0k1Var = (y0k1) obj;
        x0k1 x0k1Var = (x0k1) obj2;
        if (x0k1Var instanceof v0k1) {
            y0k1Var.getClass();
            return z5p1.m(y0k1Var, 1);
        }
        if (x0k1Var instanceof u0k1) {
            y0k1Var.getClass();
            return z5p1.m(y0k1Var, 2);
        }
        if (x0k1Var instanceof w0k1) {
            y0k1Var.getClass();
            return z5p1.m(y0k1Var, 3);
        }
        if (!(x0k1Var instanceof t0k1)) {
            eg.o();
            return null;
        }
        y0k1Var.getClass();
        t0k1 t0k1Var = (t0k1) x0k1Var;
        int i2 = t0k1Var.a;
        boolean z2 = t0k1Var.b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int iC = l1d.C(i2);
        j0k1 j0k1Var = j0k1.c;
        if (iC != 0) {
            if (iC != 1) {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                if (!y0k1Var.g) {
                    return Next.j();
                }
                if (z2) {
                    y0k1VarA = y0k1.a(y0k1Var, false, false, false, false, false, false, 63);
                } else {
                    linkedHashSet.add(j0k1Var);
                    y0k1VarA = y0k1.a(y0k1Var, false, false, !y0k1Var.d, false, false, false, 55);
                }
            } else {
                if (!y0k1Var.f) {
                    return Next.j();
                }
                if (z2) {
                    y0k1VarA = y0k1.a(y0k1Var, false, false, false, false, false, false, 95);
                } else {
                    linkedHashSet.add(j0k1Var);
                    y0k1VarA = y0k1.a(y0k1Var, false, !y0k1Var.c, false, false, false, false, 91);
                }
            }
        } else {
            if (!y0k1Var.e) {
                return Next.j();
            }
            if (z2) {
                y0k1VarA = y0k1.a(y0k1Var, false, false, false, false, false, false, 111);
            } else {
                linkedHashSet.add(j0k1Var);
                y0k1VarA = y0k1.a(y0k1Var, !y0k1Var.b, false, false, false, false, false, 109);
            }
        }
        return Next.i(y0k1VarA, linkedHashSet);
    }

    private final Next r(Object obj, Object obj2) {
        p2l1 p2l1Var = (p2l1) obj;
        a2l1 a2l1Var = (j2l1) obj2;
        f291 f291Var = p2l1Var.c;
        String str = p2l1Var.b;
        if (a2l1Var instanceof y1l1) {
            String str2 = ((y1l1) a2l1Var).a;
            return Next.i(p2l1.a(p2l1Var, str2, null, 125), Effects.a(new l0l1[]{new l0l1(new l2l1(str2, 2, (Map) null, "pageLoadStarted"))}));
        }
        if (a2l1Var instanceof z1l1) {
            String str3 = ((z1l1) a2l1Var).a;
            return u890.j(Uri.parse(str3).getHost(), Uri.parse(f291Var.b).getHost()) ? Next.i(p2l1.a(p2l1Var, str3, null, 117), Effects.a(new f1l1[]{new l0l1(new l2l1(str3, 2, (Map) null, "pageLoadSucceeded")), n0l1.a})) : Next.i(p2l1.a(p2l1Var, str3, null, 125), Effects.a(new l0l1[]{new l0l1(new l2l1(str3, 2, (Map) null, "pageLoadSucceeded"))}));
        }
        if (a2l1Var instanceof x1l1) {
            x1l1 x1l1Var = (x1l1) a2l1Var;
            String str4 = x1l1Var.a;
            p2l1 p2l1VarA = p2l1.a(p2l1Var, str4, null, 117);
            String str5 = x1l1Var.b;
            Integer num = x1l1Var.c;
            return Next.i(p2l1VarA, Effects.a(new l0l1[]{new l0l1(new l2l1(str4, "pageLoadFailed", num == null ? Collections.singletonMap("error", str5) : sqg0.J(new mmr0[]{new mmr0("error", str5), new mmr0("statusCode", String.valueOf(num.intValue()))})))}));
        }
        if (a2l1Var instanceof a2l1) {
            return Next.a(Effects.a(new l0l1[]{new l0l1(new l2l1(a2l1Var.a, 2, (Map) null, "pageLoadTimedOut"))}));
        }
        if (a2l1Var instanceof r1l1) {
            r1l1 r1l1Var = (r1l1) a2l1Var;
            return c(p2l1Var, r1l1Var.a, r1l1Var.b);
        }
        if (a2l1Var instanceof s1l1) {
            s1l1 s1l1Var = (s1l1) a2l1Var;
            return c(p2l1Var, s1l1Var.a, s1l1Var.b);
        }
        if (a2l1Var instanceof p1l1) {
            return Next.a(Effects.a(new m0l1[]{new m0l1(new l2l1(str, 2, (Map) null, "dismissed"))}));
        }
        if (!(a2l1Var instanceof i2l1)) {
            if (a2l1Var instanceof g2l1) {
                g2l1 g2l1Var = (g2l1) a2l1Var;
                j0p1 j0p1Var = p2l1Var.e;
                if (j0p1Var instanceof cb71) {
                    return Next.j();
                }
                if (!(j0p1Var instanceof db71)) {
                    eg.o();
                    return null;
                }
                p2l1 p2l1VarA2 = p2l1.a(p2l1Var, null, cb71.c, 95);
                y0l1 y0l1Var = new y0l1(new yzk1(((db71) j0p1Var).c, g2l1Var.a));
                str.getClass();
                return Next.i(p2l1VarA2, Effects.a(new f1l1[]{y0l1Var, new l0l1(new l2l1(str, 2, (Map) null, "shareSheetDismissed"))}));
            }
            if (a2l1Var instanceof q1l1) {
                Object obj3 = ((q1l1) a2l1Var).a;
                boolean z2 = obj3 instanceof m231;
                wze1 wze1Var = (wze1) (z2 ? null : obj3);
                String str6 = wze1Var != null ? wze1Var.a : null;
                Throwable thA = e331.a(obj3);
                y0l1 y0l1Var2 = new y0l1(new lzk1(str6, thA != null ? thA.getMessage() : null));
                if (z2) {
                    obj3 = null;
                }
                wze1 wze1Var2 = (wze1) obj3;
                return Next.a(Effects.a(new f1l1[]{y0l1Var2, new l0l1(new l2l1((String) null, 1, tx9.o(2, wze1Var2 != null ? Long.valueOf(wze1Var2.c) : null), "authenticationSucceeded"))}));
            }
            if (a2l1Var instanceof h2l1) {
                return Next.h(p2l1.a(p2l1Var, ((h2l1) a2l1Var).a, null, 125));
            }
            if (a2l1Var instanceof c2l1) {
                c2l1 c2l1Var = (c2l1) a2l1Var;
                return Next.a(Effects.a(new y0l1[]{new y0l1(new rzk1(c2l1Var.a, c2l1Var.b))}));
            }
            if (a2l1Var instanceof b2l1) {
                return Next.a(Effects.a(new l0l1[]{new l0l1(new l2l1(str, "error", Collections.singletonMap("error", ((b2l1) a2l1Var).a)))}));
            }
            if (a2l1Var instanceof n1l1) {
                return Next.a(Effects.a(new m0l1[]{new m0l1(new l2l1(str, 2, (Map) null, "dismissed"))}));
            }
            if (a2l1Var instanceof o1l1) {
                return Next.a(Effects.a(new y0l1[]{new y0l1(bzk1.INSTANCE)}));
            }
            if (a2l1Var instanceof w1l1) {
                return Next.a(Effects.a(new y0l1[]{new y0l1(new b0l1(true))}));
            }
            if (a2l1Var instanceof t1l1) {
                return Next.a(Effects.a(new y0l1[]{new y0l1(new b0l1(false))}));
            }
            if (a2l1Var instanceof e2l1) {
                return Next.a(Effects.a(new f1l1[]{new y0l1(vzk1.INSTANCE), new l0l1(new l2l1(str, 2, (Map) null, "screenshotDetected"))}));
            }
            if (a2l1Var instanceof l1l1) {
                return Next.a(Effects.a(new l0l1[]{new l0l1(new l2l1(str, 2, (Map) null, "appEnteredBackground"))}));
            }
            if (a2l1Var instanceof k1l1) {
                return Next.a(Effects.a(new l0l1[]{new l0l1(new l2l1(str, 2, (Map) null, "appBecameActive"))}));
            }
            if (a2l1Var instanceof u1l1) {
                u1l1 u1l1Var = (u1l1) a2l1Var;
                int i2 = u1l1Var.a;
                String str7 = u1l1Var.b;
                return Next.a(Effects.a(new f1l1[]{new y0l1(new izk1(i2, (String) null, str7)), new l0l1(new l2l1(str, "playlistCreationFailed", Collections.singletonMap("error", str7)))}));
            }
            if (a2l1Var instanceof v1l1) {
                v1l1 v1l1Var = (v1l1) a2l1Var;
                return Next.a(Effects.a(new f1l1[]{new y0l1(new izk1(v1l1Var.a, v1l1Var.b, (String) null)), new l0l1(new l2l1(str, 2, (Map) null, "playlistCreationSucceeded"))}));
            }
            if (a2l1Var instanceof d2l1) {
                d2l1 d2l1Var = (d2l1) a2l1Var;
                return Next.a(Effects.a(new y0l1[]{new y0l1((c0l1) new tak1(d2l1Var, (byte) 8).invoke(d2l1Var))}));
            }
            if (a2l1Var instanceof f2l1) {
                f2l1 f2l1Var = (f2l1) a2l1Var;
                return Next.a(Effects.a(new a1l1[]{new a1l1(f2l1Var.a, f291Var.f, f2l1Var.b, f2l1Var.c)}));
            }
            eg.o();
            return null;
        }
        b4l1 b4l1Var = ((i2l1) a2l1Var).a;
        if (b4l1Var instanceof j3l1) {
            return Next.a(Effects.a(new o0l1[]{o0l1.a}));
        }
        if (b4l1Var instanceof i3l1) {
            if (f291Var.c != ci8.b) {
                return Next.a(Effects.a(new f1l1[]{new y0l1(new lzk1((String) null, "Site Requested new ID Token but is not IDT site.")), new l0l1(new l2l1((String) null, 1, sqg0.J(new mmr0[]{new mmr0("error", "Site Requested new ID Token but is not IDT site."), new mmr0("reason", xvj1.c(2))}), "authenticationFailed"))}));
            }
            String str8 = f291Var.d;
            str8.getClass();
            return Next.a(Effects.a(new f1l1[]{new v0l1((i3l1) b4l1Var, str8, f291Var.b), new l0l1(new l2l1((String) null, 1, tx9.o(2, null), "authenticationStarted"))}));
        }
        if (b4l1Var instanceof b4l1) {
            b4l1 b4l1Var2 = b4l1Var;
            p2l1 p2l1VarA3 = p2l1.a(p2l1Var, null, new db71(b4l1Var2.b), 95);
            w0l1 w0l1Var = new w0l1(b4l1Var2);
            str.getClass();
            String str9 = b4l1Var2.c;
            String str10 = b4l1Var2.d;
            if (str10 == null) {
                str10 = "";
            }
            String str11 = b4l1Var2.f;
            LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0("imageUrl", str10), new mmr0("url", str9)});
            if (str11 != null) {
                linkedHashMapM.put("message", str11);
            }
            return Next.i(p2l1VarA3, Effects.a(new f1l1[]{w0l1Var, new l0l1(new l2l1(str, "shareSheetOpened", linkedHashMapM))}));
        }
        if (b4l1Var instanceof k4l1) {
            str.getClass();
            k4l1 k4l1Var = (k4l1) b4l1Var;
            String str12 = k4l1Var.b;
            String str13 = k4l1Var.c;
            String str14 = k4l1Var.d;
            String str15 = k4l1Var.e;
            LinkedHashMap linkedHashMapM2 = sqg0.M(new mmr0[]{new mmr0("category", str12), new mmr0("action", str13)});
            if (str14 != null) {
                linkedHashMapM2.put("label", str14);
            }
            if (str15 != null) {
                linkedHashMapM2.put("value", str15);
            }
            return Next.a(Effects.a(new l0l1[]{new l0l1(new l2l1(str, "webEvent", linkedHashMapM2))}));
        }
        if (b4l1Var instanceof d3l1) {
            return Next.a(Effects.a(new m0l1[]{new m0l1(new l2l1(str, 2, (Map) null, "dismissed"))}));
        }
        if (b4l1Var instanceof q3l1) {
            return Next.a(Effects.a(new s0l1[]{new s0l1(false)}));
        }
        if (b4l1Var instanceof u3l1) {
            return Next.a(Effects.a(new x0l1[]{x0l1.a}));
        }
        if (b4l1Var instanceof x3l1) {
            return Next.a(Effects.a(new d1l1[]{d1l1.a}));
        }
        if (b4l1Var instanceof v3l1) {
            return Next.a(Effects.a(new c1l1[]{c1l1.a}));
        }
        if (b4l1Var instanceof t3l1) {
            return Next.a(Effects.a(new t0l1[]{new t0l1(((t3l1) b4l1Var).b)}));
        }
        if (b4l1Var instanceof c3l1) {
            return Next.a(Effects.a(new h0l1[]{h0l1.a}));
        }
        if (b4l1Var instanceof e4l1) {
            return Next.a(Effects.a(new e1l1[]{new e1l1(f291Var.a, ((e4l1) b4l1Var).b)}));
        }
        if (b4l1Var instanceof h3l1) {
            h3l1 h3l1Var = (h3l1) b4l1Var;
            return Next.a(Effects.a(new j0l1[]{new j0l1(h3l1Var.b, h3l1Var.c, h3l1Var.d, h3l1Var.e, h3l1Var.f)}));
        }
        if (b4l1Var instanceof p3l1) {
            xj61 xj61Var = new xj61();
            p3l1 p3l1Var = (p3l1) b4l1Var;
            String str16 = p3l1Var.b;
            String str17 = p3l1Var.c;
            if (u890.j(str17, "replaceTheStage")) {
                str.getClass();
                xj61Var.add(new q0l1(str16, new l2l1(str, "openedDeeplink", Collections.singletonMap("url", str16)), true));
            } else {
                xj61Var.add(new r0l1(str16, u890.j(str17, "externalBrowser")));
            }
            return Next.a(cwl1.j(xj61Var));
        }
        if (b4l1Var instanceof h4l1) {
            return Next.a(Effects.a(new z0l1[]{new z0l1(((h4l1) b4l1Var).b)}));
        }
        if (b4l1Var instanceof y3l1) {
            return Next.a(Effects.a(new u0l1[]{u0l1.a}));
        }
        if (b4l1Var instanceof m3l1) {
            jdm0 jdm0Var = ((m3l1) b4l1Var).b;
            return Next.a(Effects.a(new k0l1[]{new k0l1(jdm0Var.a, jdm0Var.b)}));
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:273:0x0637  */
    /* JADX WARN: Code duplicated, block: B:274:0x063d  */
    /* JADX WARN: Code duplicated, block: B:306:0x06a7 A[PHI: r0 r29 r30
      0x06a7: PHI (r0v40 java.lang.Integer) = 
      (r0v33 java.lang.Integer)
      (r0v33 java.lang.Integer)
      (r0v34 java.lang.Integer)
      (r0v36 java.lang.Integer)
      (r0v41 java.lang.Integer)
     binds: [B:301:0x0698, B:303:0x069c, B:298:0x068d, B:293:0x0676, B:273:0x0637] A[DONT_GENERATE, DONT_INLINE]
      0x06a7: PHI (r29v12 java.util.Set) = (r29v9 java.util.Set), (r29v9 java.util.Set), (r29v10 java.util.Set), (r29v7 java.util.Set), (r29v7 java.util.Set) binds: [B:301:0x0698, B:303:0x069c, B:298:0x068d, B:293:0x0676, B:273:0x0637] A[DONT_GENERATE, DONT_INLINE]
      0x06a7: PHI (r30v16 java.lang.String) = 
      (r30v12 java.lang.String)
      (r30v12 java.lang.String)
      (r30v12 java.lang.String)
      (r30v13 java.lang.String)
      (r30v17 java.lang.String)
     binds: [B:301:0x0698, B:303:0x069c, B:298:0x068d, B:293:0x0676, B:273:0x0637] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:407:0x095b  */
    /* JADX WARN: Code duplicated, block: B:424:0x09bf  */
    private final Next s(Object obj, Object obj2) {
        z6x arrayList;
        String str;
        Integer num;
        String str2;
        lju ljuVar;
        String str3;
        Integer numC0;
        int i2;
        int iP;
        String str4;
        LinkedHashMap linkedHashMapD;
        Object next;
        LinkedHashMap linkedHashMapD2;
        z6x arrayList2;
        gzl1 gzl1VarB;
        Integer num2;
        int iDoubleValue;
        wwx0 wwx0Var;
        int iDoubleValue2;
        boolean z2;
        int iDoubleValue3;
        boolean z3;
        boolean z4;
        t120 t120Var;
        Double d2;
        t120 t120Var2;
        Double d3;
        t120 t120Var3;
        Double d4;
        t120 t120Var4;
        Double d5;
        t120 t120Var5;
        Double d6;
        t120 t120Var6;
        Double d7;
        Integer numC1;
        Integer numC2;
        d4m1 d4m1Var = (d4m1) obj;
        p3m1 p3m1Var = (b4m1) obj2;
        boolean z5 = d4m1Var.B;
        qu61 qu61Var = d4m1Var.F;
        int i3 = d4m1Var.k;
        boolean z6 = d4m1Var.D;
        boolean z7 = d4m1Var.z;
        String str5 = d4m1Var.a;
        boolean z8 = d4m1Var.b;
        boolean z9 = p3m1Var instanceof a4m1;
        z6x z6xVar = z6x.a;
        if (z9) {
            tqu0 tqu0Var = ((a4m1) p3m1Var).a;
            List list = tqu0Var.b;
            int iS = zno1.s(q7h.U(list, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj3 : list) {
                linkedHashMap.put(((wwx0) obj3).a, obj3);
            }
            wwx0 wwx0Var2 = (wwx0) linkedHashMap.get("duration");
            wwx0 wwx0Var3 = (wwx0) linkedHashMap.get("intensity");
            if (wwx0Var3 == null) {
                wwx0Var3 = (wwx0) linkedHashMap.get("target_bpm");
            }
            String str6 = wwx0Var3 != null ? wwx0Var3.a : null;
            String str7 = str6 != null ? str6 : "";
            t120 t120Var7 = wwx0Var3 != null ? wwx0Var3.e : null;
            wwx0 wwx0Var4 = (wwx0) linkedHashMap.get("genre");
            wwx0 wwx0Var5 = (wwx0) linkedHashMap.get("discovery");
            wwx0 wwx0Var6 = (wwx0) linkedHashMap.get("workout_type");
            if (wwx0Var4 == null) {
                linkedHashMapD2 = b7x.a;
            } else {
                String str8 = wwx0Var4.d;
                linkedHashMapD2 = str8 == null ? null : nju.d(str8);
                if (linkedHashMapD2 == null) {
                    linkedHashMapD2 = b7x.a;
                }
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMapD2.size());
            Iterator it = linkedHashMapD2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList3.add(new xi40((String) entry.getKey(), (String) entry.getValue()));
                it = it;
                z6xVar = z6xVar;
            }
            z6x z6xVar2 = z6xVar;
            if (wwx0Var4 != null) {
                List listQ0 = ihc1.Q0(wwx0Var4.b, new String[]{","}, 0, 6);
                ArrayList arrayList4 = new ArrayList(q7h.U(listQ0, 10));
                Iterator it2 = listQ0.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(ihc1.e1((String) it2.next()).toString());
                }
                arrayList2 = new ArrayList();
                for (Object obj4 : arrayList4) {
                    if (((String) obj4).length() > 0) {
                        arrayList2.add(obj4);
                    }
                }
            } else {
                arrayList2 = z6xVar2;
            }
            ArrayList arrayList5 = (Iterable) arrayList2;
            ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(new f3n0((String) it3.next()));
            }
            Set setP1 = o7h.p1(arrayList6);
            ArrayList arrayListX = w6d1.x(arrayList3, setP1);
            int iIntValue = (wwx0Var2 == null || (numC2 = nhc1.c0(wwx0Var2.b)) == null) ? 0 : numC2.intValue();
            Integer numC3 = wwx0Var3 != null ? nhc1.c0(wwx0Var3.b) : null;
            Integer num3 = (wwx0Var5 == null || (numC1 = nhc1.c0(wwx0Var5.b)) == null || numC1.intValue() < 0) ? null : numC1;
            if (wwx0Var6 != null) {
                String str9 = wwx0Var6.b;
                gzl1.Companion.getClass();
                gzl1VarB = fzl1.b(str9);
                if (gzl1VarB == null) {
                    gzl1VarB = gzl1.c;
                }
            } else {
                gzl1VarB = gzl1.c;
            }
            gzl1 gzl1Var = gzl1VarB;
            wwx0 wwx0Var7 = (wwx0) linkedHashMap.get("beat_matching");
            boolean zJ = u890.j(wwx0Var7 != null ? wwx0Var7.b : null, "on");
            wwx0 wwx0Var8 = (wwx0) linkedHashMap.get("adjust_speed");
            boolean zJ2 = u890.j(wwx0Var8 != null ? wwx0Var8.b : null, "on");
            qu61 qu61Var2 = new qu61(iIntValue, numC3 != null ? numC3.intValue() : 0, setP1, num3, gzl1Var, zJ, zJ2, tqu0Var.d);
            String str10 = tqu0Var.a;
            boolean z10 = tqu0Var.c;
            int iDoubleValue4 = (wwx0Var2 == null || (t120Var6 = wwx0Var2.e) == null || (d7 = t120Var6.a) == null) ? 0 : (int) d7.doubleValue();
            int iDoubleValue5 = (wwx0Var2 == null || (t120Var5 = wwx0Var2.e) == null || (d6 = t120Var5.b) == null) ? 0 : (int) d6.doubleValue();
            if (wwx0Var2 == null || (t120Var4 = wwx0Var2.e) == null || (d5 = t120Var4.c) == null) {
                num2 = numC3;
                iDoubleValue = 0;
            } else {
                Integer num4 = numC3;
                iDoubleValue = (int) d5.doubleValue();
                num2 = num4;
            }
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            boolean z11 = num2 != null;
            int iDoubleValue6 = (wwx0Var3 == null || (t120Var3 = wwx0Var3.e) == null || (d4 = t120Var3.a) == null) ? 0 : (int) d4.doubleValue();
            if (wwx0Var3 == null || (t120Var2 = wwx0Var3.e) == null || (d3 = t120Var2.b) == null) {
                wwx0Var = wwx0Var5;
                iDoubleValue2 = 0;
            } else {
                iDoubleValue2 = (int) d3.doubleValue();
                wwx0Var = wwx0Var5;
            }
            if (wwx0Var3 == null || (t120Var = wwx0Var3.e) == null || (d2 = t120Var.c) == null) {
                z2 = z10;
                iDoubleValue3 = 0;
            } else {
                iDoubleValue3 = (int) d2.doubleValue();
                z2 = z10;
            }
            List listM = p7h.M(new Double[]{t120Var7 != null ? t120Var7.a : null, t120Var7 != null ? t120Var7.b : null, t120Var7 != null ? t120Var7.c : null});
            if ((listM instanceof Collection) && listM.isEmpty()) {
                z4 = true;
            } else {
                Iterator it4 = listM.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Double d8 = (Double) it4.next();
                        if (d8 == null || Math.abs(d8.doubleValue()) > Double.MAX_VALUE) {
                            z3 = z2;
                        } else {
                            z3 = z2;
                            Iterator it5 = it4;
                            if (u890.g(d8, (int) d8.doubleValue())) {
                                z2 = z3;
                                it4 = it5;
                            }
                        }
                        z2 = z3;
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                }
            }
            d4m1 d4m1VarA = d4m1.a(d4m1Var, null, str10, z2, iIntValue, iDoubleValue4, iDoubleValue5, iDoubleValue, iIntValue2, z11, null, iDoubleValue6, iDoubleValue2, iDoubleValue3, z4, str7, arrayListX, setP1, num3, wwx0Var != null, gzl1Var, wwx0Var6 != null, linkedHashMap.containsKey("adjust_speed"), tqu0Var.d, zJ, zJ2, false, false, qu61Var2, 1879052301);
            ArrayList arrayListK = w6d1.k(d4m1VarA);
            ws61 ws61Var = d4m1VarA.d;
            if (!arrayListK.contains(ws61Var)) {
                ws61Var = (ws61) o7h.q0(arrayListK);
            }
            return Next.h(d4m1.a(d4m1VarA, ws61Var, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, false, false, false, false, null, -9));
        }
        if (p3m1Var instanceof z3m1) {
            return Next.h(d4m1.a(d4m1Var, null, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, false, false, false, false, null, -5));
        }
        boolean z12 = p3m1Var instanceof u3m1;
        q2m1 q2m1Var = q2m1.b;
        ws61 ws61Var2 = ws61.c;
        if (z12) {
            ws61 ws61Var3 = ((u3m1) p3m1Var).a;
            if (!z6 || ws61Var3 == ws61Var2) {
                return (!z8 || w6d1.k(d4m1Var).contains(ws61Var3)) ? w6d1.B(d4m1Var, new c4m1((Object) ws61Var3, (byte) 0)) : Next.j();
            }
            return Next.a(Collections.singleton(q2m1Var));
        }
        if (p3m1Var instanceof n3m1) {
            boolean z13 = ((n3m1) p3m1Var).a;
            if (!z13) {
                ws61Var2 = d4m1Var.d;
            }
            return Next.h(d4m1.a(d4m1Var, ws61Var2, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, false, false, false, z13, null, -536870921));
        }
        if (p3m1Var instanceof q3m1) {
            return w6d1.B(d4m1Var, new sl11(((q3m1) p3m1Var).a, (byte) 23));
        }
        if (p3m1Var instanceof t3m1) {
            int i4 = ((t3m1) p3m1Var).a;
            return i4 == i3 ? Next.j() : w6d1.B(d4m1Var, new sl11(i4, (byte) 24));
        }
        if (p3m1Var instanceof r3m1) {
            return w6d1.B(d4m1Var, new bek1(((r3m1) p3m1Var).a, (byte) 10));
        }
        if (p3m1Var instanceof p3m1) {
            return w6d1.B(d4m1Var, new sl11(p3m1Var.a, (byte) 22));
        }
        if (p3m1Var instanceof v3m1) {
            return w6d1.B(d4m1Var, new c4m1((Object) ((v3m1) p3m1Var).a, (byte) 1));
        }
        if (p3m1Var instanceof l3m1) {
            return !z8 ? Next.j() : Next.h(d4m1.a(d4m1Var, null, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, null, false, false, !z7, false, false, false, false, null, -33554433));
        }
        if (p3m1Var instanceof m3m1) {
            return w6d1.B(d4m1Var, owl1.S0);
        }
        if (p3m1Var instanceof s3m1) {
            return !z8 ? Next.j() : Next.h(d4m1.a(d4m1Var, null, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, false, !z5, false, false, null, -134217729));
        }
        boolean z14 = p3m1Var instanceof x3m1;
        m2m1 m2m1Var = m2m1.b;
        if (!z14) {
            if (p3m1Var instanceof y3m1) {
                if (z8) {
                    return (qu61Var == null || qu61Var.h == z7) ? Next.i(d4m1.a(d4m1Var, null, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, false, false, false, false, null, -268435457), Collections.singleton(m2m1Var)) : Next.i(d4m1Var, Collections.singleton(new n2m1(str5, z7)));
                }
                return Next.j();
            }
            boolean z15 = p3m1Var instanceof w3m1;
            o2m1 o2m1Var = o2m1.b;
            if (z15) {
                Set setSingleton = Collections.singleton(o2m1Var);
                if (!z8) {
                    return Next.j();
                }
                d4m1 d4m1VarA2 = d4m1.a(d4m1Var, null, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, false, false, false, false, null, -268435457);
                return setSingleton.isEmpty() ? Next.h(d4m1VarA2) : Next.i(d4m1VarA2, setSingleton);
            }
            if (!(p3m1Var instanceof k3m1)) {
                if (!(p3m1Var instanceof o3m1)) {
                    eg.o();
                    return null;
                }
                String str11 = ((o3m1) p3m1Var).a;
                if (z8) {
                    return z7 ? Next.i(d4m1.a(d4m1Var, null, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, false, false, false, false, null, -268435457), f46.S0(new sgc1[]{m2m1Var, new l2m1(str11)})) : Next.i(d4m1Var, Collections.singleton(new n2m1(str11, false)));
                }
                return Next.j();
            }
            k3m1 k3m1Var = (k3m1) p3m1Var;
            String str12 = k3m1Var.a;
            boolean z16 = k3m1Var.b;
            if (!z8) {
                return Next.j();
            }
            if (!z16) {
                return Next.i(d4m1.a(d4m1Var, null, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, false, false, false, false, null, -268435457), Collections.singleton(o2m1Var));
            }
            Set setW0 = dm61.w0(new sgc1[]{m2m1Var});
            if (!u890.j(str12, str5)) {
                setW0.add(new l2m1(str12));
            }
            return Next.i(d4m1.a(d4m1Var, null, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, false, false, false, false, null, -268435457), setW0);
        }
        String str13 = d4m1Var.e;
        if (!z8) {
            return Next.j();
        }
        gzl1 gzl1Var2 = d4m1Var.w;
        Integer num5 = d4m1Var.u;
        Set set = d4m1Var.t;
        boolean z17 = d4m1Var.A;
        String str14 = ",";
        int i5 = d4m1Var.g;
        String str15 = d4m1Var.r;
        if (qu61Var != null) {
            smc0 smc0VarN = k4p1.n();
            Integer num6 = num5;
            if (i5 > 0) {
                smc0VarN.add(new r120("duration", String.valueOf(i5)));
            }
            smc0VarN.add(new r120("beat_matching", z17 ? "on" : "off"));
            if (str15.length() > 0) {
                smc0VarN.add(new r120(str15, String.valueOf(i3)));
            }
            smc0VarN.add(new r120("adjust_speed", z5 ? "on" : "off"));
            smc0VarN.add(new r120("genre", o7h.y0(set, ",", (String) null, (String) null, owl1.T0, 30)));
            if (num6 != null) {
                smc0VarN.add(new r120("discovery", String.valueOf(num6.intValue())));
            }
            smc0VarN.add(new r120("workout_type", gzl1Var2.a));
            smc0 smc0VarK = k4p1.k(smc0VarN);
            arrayList = new ArrayList();
            ListIterator listIterator = smc0VarK.listIterator(0);
            while (true) {
                rmc0 rmc0Var = (rmc0) listIterator;
                if (!rmc0Var.hasNext()) {
                    break;
                }
                Object next2 = rmc0Var.next();
                ListIterator listIterator2 = listIterator;
                String str16 = ((r120) next2).a;
                if (str16.equals("duration")) {
                    if (i5 != qu61Var.a) {
                        str = str15;
                        num = num6;
                        arrayList.add(next2);
                    } else {
                        str = str15;
                        num = num6;
                    }
                } else if (str16.equals("beat_matching")) {
                    if (z17 != qu61Var.f) {
                        str = str15;
                        num = num6;
                        arrayList.add(next2);
                    } else {
                        str = str15;
                        num = num6;
                    }
                } else if (str16.equals(str15)) {
                    if (i3 != qu61Var.b) {
                        str = str15;
                        num = num6;
                        arrayList.add(next2);
                    } else {
                        str = str15;
                        num = num6;
                    }
                } else if (str16.equals("adjust_speed")) {
                    if (z5 != qu61Var.g) {
                        str = str15;
                        num = num6;
                        arrayList.add(next2);
                    } else {
                        str = str15;
                        num = num6;
                    }
                } else if (str16.equals("genre")) {
                    str = str15;
                    num = num6;
                    if (!u890.j(set, qu61Var.c)) {
                        arrayList.add(next2);
                    }
                } else {
                    str = str15;
                    Set set2 = set;
                    if (str16.equals("discovery")) {
                        set = set2;
                        num = num6;
                        if (!u890.j(num, qu61Var.d)) {
                            arrayList.add(next2);
                        }
                    } else {
                        set = set2;
                        num = num6;
                        if (!str16.equals("workout_type") || gzl1Var2 != qu61Var.e) {
                            arrayList.add(next2);
                        }
                    }
                }
                listIterator = listIterator2;
                num6 = num;
                str15 = str;
            }
        } else {
            arrayList = z6xVar;
        }
        smc0 smc0VarH = xpv0.h(str13);
        ArrayList arrayList7 = new ArrayList();
        for (r120 r120Var : (Iterable) arrayList) {
            rmc0 rmc0VarListIterator = smc0VarH.listIterator(0);
            do {
                rmc0 rmc0Var2 = rmc0VarListIterator;
                if (!rmc0Var2.hasNext()) {
                    next = null;
                    break;
                }
                next = rmc0Var2.next();
            } while (!((wwx0) next).a.equals(r120Var.a));
            wwx0 wwx0Var9 = (wwx0) next;
            mmr0 mmr0Var = wwx0Var9 != null ? new mmr0(wwx0Var9, r120Var.b) : null;
            if (mmr0Var != null) {
                arrayList7.add(mmr0Var);
            }
        }
        String strX = str13;
        for (mmr0 mmr0Var2 : o7h.a1(arrayList7, new hzx0(str13, (byte) 0))) {
            wwx0 wwx0Var10 = (wwx0) mmr0Var2.a;
            String strB = (String) mmr0Var2.b;
            String str17 = wwx0Var10.a;
            String str18 = wwx0Var10.d;
            String str19 = wwx0Var10.c;
            StringBuilder sb = new StringBuilder(cy30.p("data-field=\"", str17, "\" data-value=\"", eqr0.x(strB), "\""));
            if (str19.length() > 0) {
                sb.append(" data-unit=\"" + eqr0.x(str19) + "\"");
            }
            if (str18 != null) {
                sb.append(" data-format=\"" + eqr0.x(str18) + "\"");
            }
            t120 t120Var8 = wwx0Var10.e;
            if (t120Var8 != null) {
                Double d9 = t120Var8.a;
                if (d9 != null) {
                    double dDoubleValue = d9.doubleValue();
                    long j2 = (long) dDoubleValue;
                    sb.append(" data-min=\"" + (dDoubleValue == ((double) j2) ? String.valueOf(j2) : String.valueOf(dDoubleValue)) + "\"");
                }
                Double d10 = t120Var8.b;
                if (d10 != null) {
                    double dDoubleValue2 = d10.doubleValue();
                    long j3 = (long) dDoubleValue2;
                    sb.append(" data-max=\"" + (dDoubleValue2 == ((double) j3) ? String.valueOf(j3) : String.valueOf(dDoubleValue2)) + "\"");
                }
                Double d11 = t120Var8.c;
                if (d11 != null) {
                    double dDoubleValue3 = d11.doubleValue();
                    long j4 = (long) dDoubleValue3;
                    sb.append(" data-step=\"" + (dDoubleValue3 == ((double) j4) ? String.valueOf(j4) : String.valueOf(dDoubleValue3)) + "\"");
                }
            }
            String string = sb.toString();
            LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0("value", strB)});
            if (str19.length() > 0) {
                linkedHashMapM.put("unit", str19);
            }
            if (str18 == null) {
                str2 = str14;
            } else {
                str2 = str14;
                if (!ihc1.h0(strB, str2, false) || (linkedHashMapD = nju.d(str18)) == null) {
                    kju kjuVarC = nju.c(str18);
                    if (kjuVarC != null && u890.j(kjuVarC.b, "select")) {
                        List list2 = kjuVarC.c;
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj5 : list2) {
                            if (!u890.j(((mmr0) obj5).a, "other")) {
                                arrayList8.add(obj5);
                            }
                        }
                        ArrayList arrayList9 = new ArrayList(q7h.U(arrayList8, 10));
                        Iterator it6 = arrayList8.iterator();
                        while (it6.hasNext()) {
                            arrayList9.add((String) ((mmr0) it6.next()).a);
                        }
                        if (!arrayList9.isEmpty()) {
                            ljuVar = new lju(kjuVarC.a, arrayList9);
                        }
                        if (ljuVar != null) {
                            List listK0 = ljuVar.b;
                            str3 = ljuVar.a;
                            if (!linkedHashMapM.containsKey(str3) || (numC0 = nhc1.c0(strB)) == null) {
                                strB = nju.b(str18, linkedHashMapM);
                            } else {
                                if (numC0.intValue() < 0) {
                                    str4 = (String) o7h.q0(listK0);
                                } else {
                                    if (u890.j(o7h.q0(listK0), "unset")) {
                                        i2 = 1;
                                        listK0 = o7h.k0(listK0, 1);
                                    } else {
                                        i2 = 1;
                                    }
                                    int iIntValue3 = numC0.intValue();
                                    int size = listK0.size();
                                    if (size <= i2) {
                                        iP = 0;
                                    } else {
                                        int i6 = size - 1;
                                        iP = yoi1.p((int) Math.rint(((double) iIntValue3) / (100.0d / ((double) i6))), 0, i6);
                                    }
                                    str4 = (String) listK0.get(iP);
                                }
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMapM);
                                linkedHashMap2.put(str3, str4);
                                strB = nju.b(str18, linkedHashMap2);
                            }
                        } else {
                            strB = nju.b(str18, linkedHashMapM);
                        }
                    }
                    ljuVar = null;
                    if (ljuVar != null) {
                        List listK1 = ljuVar.b;
                        str3 = ljuVar.a;
                        if (linkedHashMapM.containsKey(str3)) {
                            strB = nju.b(str18, linkedHashMapM);
                        } else {
                            strB = nju.b(str18, linkedHashMapM);
                        }
                    } else {
                        strB = nju.b(str18, linkedHashMapM);
                    }
                } else {
                    List listQ1 = ihc1.Q0(strB, new String[]{str2}, 0, 6);
                    ArrayList<String> arrayList10 = new ArrayList(q7h.U(listQ1, 10));
                    Iterator it7 = listQ1.iterator();
                    while (it7.hasNext()) {
                        arrayList10.add(ihc1.e1((String) it7.next()).toString());
                    }
                    ArrayList arrayList11 = new ArrayList(q7h.U(arrayList10, 10));
                    for (String str20 : arrayList10) {
                        String str21 = (String) linkedHashMapD.get(str20);
                        if (str21 != null) {
                            str20 = str21;
                        }
                        arrayList11.add(str20);
                    }
                    int size2 = arrayList11.size();
                    if (size2 == 0) {
                        strB = "";
                    } else if (size2 == 1) {
                        strB = (String) arrayList11.get(0);
                    } else if (size2 != 2) {
                        strB = o7h.y0(o7h.l0(1, arrayList11), ", ", (String) null, (String) null, (iu30) null, 62) + ", and " + o7h.A0(arrayList11);
                    } else {
                        strB = pze0.i(" and ", arrayList11.get(0), arrayList11.get(1));
                    }
                }
            }
            strX = nhc1.X(strX, wwx0Var10.g, cy30.p("<b ", string, ">", eqr0.x(strB), "</b>"));
            str14 = str2;
        }
        if (z6 && !strX.equals(str13)) {
            return Next.a(Collections.singleton(q2m1Var));
        }
        if (strX.equals(str13)) {
            return (qu61Var == null || qu61Var.h == z7) ? Next.a(Collections.singleton(m2m1Var)) : Next.i(d4m1.a(d4m1Var, null, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, false, false, true, false, null, -268435457), Collections.singleton(new n2m1(str5, z7)));
        }
        return Next.i(d4m1.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0aa4: RETURN 
              (wrap com.spotify.mobius.Next:0x0aa0: INVOKE 
              (wrap p.d4m1:0x0a98: INVOKE 
              (r1v3 ?? I:p.d4m1)
              (null p.ws61)
              (null java.lang.String)
              false
              (0 int)
              (0 int)
              (0 int)
              (0 int)
              (0 int)
              false
              (null p.puc)
              (0 int)
              (0 int)
              (0 int)
              false
              (null java.lang.String)
              (null java.util.List)
              (null java.util.Set)
              (null java.lang.Integer)
              false
              (null p.gzl1)
              false
              false
              false
              false
              false
              true
              false
              (null p.qu61)
              (-268435457 int)
             STATIC call: p.d4m1.a(p.d4m1, p.ws61, java.lang.String, boolean, int, int, int, int, int, boolean, p.puc, int, int, int, boolean, java.lang.String, java.util.List, java.util.Set, java.lang.Integer, boolean, p.gzl1, boolean, boolean, boolean, boolean, boolean, boolean, boolean, p.qu61, int):p.d4m1 A[MD:(p.d4m1, p.ws61, java.lang.String, boolean, int, int, int, int, int, boolean, p.puc, int, int, int, boolean, java.lang.String, java.util.List, java.util.Set, java.lang.Integer, boolean, p.gzl1, boolean, boolean, boolean, boolean, boolean, boolean, boolean, p.qu61, int):p.d4m1 (m), WRAPPED] (LINE:2713))
              (wrap java.util.Set:0x0a9c: INVOKE 
              (wrap p.p2m1:?: TERNARY null = ((wrap boolean:0x0a58: IGET (r1v3 ?? I:p.d4m1) A[WRAPPED] (LINE:2649) p.d4m1.f boolean) != false) ? (wrap ??:0x0a5e: CONSTRUCTOR (r7v0 'str5' java.lang.String), (r1v29 'strX' java.lang.String) A[WRAPPED] (LINE:2655) call: p.p2m1.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR) : (wrap ??:0x0a66: CONSTRUCTOR (r7v0 'str5' java.lang.String), (r1v29 'strX' java.lang.String) A[WRAPPED] (LINE:2663) call: p.j2m1.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR))
             STATIC call: java.util.Collections.singleton(java.lang.Object):java.util.Set A[MD:<T>:(T):java.util.Set<T> (c), WRAPPED] (LINE:2717))
             STATIC call: com.spotify.mobius.Next.i(java.lang.Object, java.util.Set):com.spotify.mobius.Next A[WRAPPED] (LINE:2721))
             (LINE:2721) in method: p.gp71.s(java.lang.Object, java.lang.Object):com.spotify.mobius.Next, file: /workspace/spotify-analysis/dex-input/classes12.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v3 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            */
        /*
            Method dump skipped, instruction units count: 3198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gp71.s(java.lang.Object, java.lang.Object):com.spotify.mobius.Next");
    }

    private final Next t(Object obj, Object obj2) {
        acm1 acm1Var = (acm1) obj;
        mam1 mam1Var = (pam1) obj2;
        egm1 egm1Var = acm1Var.d;
        Map map = acm1Var.c;
        StoryCard storyCard = acm1Var.a;
        boolean z2 = mam1Var instanceof mam1;
        Set setSingleton = w7x.a;
        if (z2) {
            String id = storyCard != null ? storyCard.getId() : null;
            mam1 mam1Var2 = mam1Var;
            StoryCard storyCard2 = mam1Var2.a;
            boolean zJ = u890.j(id, storyCard2.getId());
            acm1 acm1VarA = acm1.a(acm1Var, mam1Var2.a, (LinkedHashMap) null, (LinkedHashMap) null, zJ ? new egm1(egm1Var.b, egm1Var.c, 57) : new egm1((Integer) null, false, 63), zJ && acm1Var.e, 6);
            if (!u890.j(map.get(storyCard2.getId()), Boolean.TRUE)) {
                return Next.h(acm1VarA);
            }
            if (!storyCard2.u()) {
                setSingleton = Collections.singleton(new b9m1(new x0c1("2026_wrapped_seen_story_cards"), storyCard2.getId()));
            }
            return Next.i(acm1VarA, setSingleton);
        }
        if (mam1Var instanceof nam1) {
            String id2 = storyCard != null ? storyCard.getId() : null;
            nam1 nam1Var = (nam1) mam1Var;
            boolean z3 = nam1Var.b;
            StoryCard storyCard3 = nam1Var.a;
            if (!u890.j(id2, storyCard3.getId()) || !z3) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(storyCard3.getId(), Boolean.valueOf(z3));
                return Next.h(acm1.a(acm1Var, (StoryCard) null, (LinkedHashMap) null, linkedHashMap, (egm1) null, false, 27));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
            linkedHashMap2.put(storyCard3.getId(), Boolean.TRUE);
            acm1 acm1VarA2 = acm1.a(acm1Var, (StoryCard) null, (LinkedHashMap) null, linkedHashMap2, (egm1) null, false, 27);
            if (!storyCard3.u()) {
                setSingleton = Collections.singleton(new b9m1(new x0c1("2026_wrapped_seen_story_cards"), storyCard3.getId()));
            }
            return Next.i(acm1VarA2, setSingleton);
        }
        if (mam1Var instanceof iam1) {
            return storyCard == null ? Next.j() : Next.i(acm1Var, f46.S0(new d9m1[]{new c9m1(storyCard.getId(), 1, storyCard.v(), egm1Var.b, egm1Var.c), new u8m1(storyCard.getId())}));
        }
        if (mam1Var instanceof gam1) {
            return Next.a(Collections.singleton(new a9m1(((gam1) mam1Var).a)));
        }
        if (mam1Var instanceof ham1) {
            ham1 ham1Var = (ham1) mam1Var;
            return Next.a(Collections.singleton(new b9m1(ham1Var.a, ham1Var.b)));
        }
        if (mam1Var instanceof v9m1) {
            v9m1 v9m1Var = (v9m1) mam1Var;
            x1c1 x1c1Var = v9m1Var.b;
            if (x1c1Var == null) {
                return Next.j();
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(acm1Var.b);
            linkedHashMap3.put(v9m1Var.a, x1c1Var);
            return Next.h(acm1.a(acm1Var, (StoryCard) null, linkedHashMap3, (LinkedHashMap) null, (egm1) null, false, 29));
        }
        if (mam1Var.equals(eam1.a)) {
            return Next.a(Collections.singleton(z8m1.a));
        }
        if (mam1Var.equals(dam1.a)) {
            return Next.a(Collections.singleton(y8m1.a));
        }
        if (mam1Var instanceof cam1) {
            cam1 cam1Var = (cam1) mam1Var;
            return Next.a(Collections.singleton(new x8m1(cam1Var.a, cam1Var.b, cam1Var.c)));
        }
        if (mam1Var instanceof aam1) {
            return Next.a(Collections.singleton(new t8m1(((aam1) mam1Var).a)));
        }
        if (mam1Var instanceof u9m1) {
            return egm1Var.a ? Next.j() : Next.h(acm1.a(acm1Var, (StoryCard) null, (LinkedHashMap) null, (LinkedHashMap) null, egm1.a(egm1Var, (Integer) null, false, false, 62), false, 23));
        }
        if (mam1Var instanceof jam1) {
            jam1 jam1Var = (jam1) mam1Var;
            return Next.h(acm1.a(acm1Var, (StoryCard) null, (LinkedHashMap) null, (LinkedHashMap) null, egm1.a(egm1Var, jam1Var.a, jam1Var.b, false, 57), false, 23));
        }
        if (mam1Var instanceof y9m1) {
            return Next.h(acm1.a(acm1Var, (StoryCard) null, (LinkedHashMap) null, (LinkedHashMap) null, egm1.a(egm1Var, (Integer) null, false, false, 55), false, 23));
        }
        if (mam1Var instanceof lam1) {
            return Next.h(acm1.a(acm1Var, (StoryCard) null, (LinkedHashMap) null, (LinkedHashMap) null, egm1.a(egm1Var, (Integer) null, false, true, 55), false, 23));
        }
        if (mam1Var instanceof bam1) {
            return Next.a(Collections.singleton(v8m1.a));
        }
        if (mam1Var instanceof z9m1) {
            return Next.h(acm1.a(acm1Var, (StoryCard) null, (LinkedHashMap) null, (LinkedHashMap) null, egm1.a(egm1Var, (Integer) null, false, false, 47), false, 23));
        }
        if (mam1Var instanceof kam1) {
            return Next.h(acm1.a(acm1Var, (StoryCard) null, (LinkedHashMap) null, (LinkedHashMap) null, (egm1) null, true, 15));
        }
        if (mam1Var instanceof x9m1) {
            return egm1Var.f ? Next.j() : Next.h(acm1.a(acm1Var, (StoryCard) null, (LinkedHashMap) null, (LinkedHashMap) null, egm1.a(egm1Var, (Integer) null, false, false, 31), false, 23));
        }
        eg.o();
        return null;
    }

    public final Next a(Object obj, Object obj2) {
        Object objInvoke;
        boolean z2 = true;
        int iP = 0;
        switch (this.a) {
            case 0:
                dp71 dp71Var = (fp71) obj;
                xo71 xo71Var = (bp71) obj2;
                if (!(dp71Var instanceof dp71)) {
                    return Next.j();
                }
                if (xo71Var instanceof zo71) {
                    zo71 zo71Var = (zo71) xo71Var;
                    return Next.h(dp71.c(dp71Var, mqo1.F(zo71Var.b), 2, zo71Var.c, 18));
                }
                if (xo71Var.equals(yo71.a)) {
                    return Next.h(dp71.c(dp71Var, (c9) null, 3, false, 27));
                }
                if (xo71Var.equals(ap71.a)) {
                    dp71 dp71Var2 = dp71Var;
                    t7q0 t7q0Var = dp71Var2.b;
                    return Next.a(Effects.a(new vo71[]{new vo71(t7q0Var.getUri(), dp71Var2.e && (t7q0Var instanceof g7q0))}));
                }
                if (xo71Var instanceof xo71) {
                    return Next.a(Effects.a(new uo71[]{new uo71(xo71Var.a)}));
                }
                eg.o();
                return null;
            case 1:
                xr71 xr71Var = (xr71) obj;
                tq80 tq80Var = (tq80) obj2;
                pr71 pr71Var = (pr71) tq80Var.a;
                if (u890.j(pr71Var, nr71.a)) {
                    xr71Var.getClass();
                    return Next.h(xr71.a(xr71Var, vr71.a, (hr71) null, 2));
                }
                if (pr71Var instanceof or71) {
                    xr71Var.getClass();
                    return Next.h(xr71.a(xr71Var, new ur71(((or71) pr71Var).a, false), (hr71) null, 2));
                }
                if (u890.j(pr71Var, mr71.a)) {
                    wr71 wr71Var = xr71Var.a;
                    if (wr71Var instanceof vr71) {
                        return Next.j();
                    }
                    if (wr71Var instanceof ur71) {
                        sr71 sr71Var = ((ur71) wr71Var).a;
                        ArrayList arrayList = sr71Var.b;
                        if (arrayList.size() != 1) {
                            return arrayList.size() > 1 ? Next.a(Effects.a(new jr71[]{new jr71(sr71Var.a, arrayList)})) : Next.j();
                        }
                        String str = ((qr71) o7h.q0(arrayList)).b;
                        tqw tqwVar = tq80Var.b;
                        return Next.a(Effects.a(new ir71[]{new ir71(str, tqwVar != null ? n3o1.y(tqwVar) : null)}));
                    }
                    eg.o();
                } else {
                    if (pr71Var instanceof lr71) {
                        wr71 wr71Var2 = xr71Var.a;
                        ur71 ur71Var = wr71Var2 instanceof ur71 ? (ur71) wr71Var2 : null;
                        return ur71Var == null ? Next.j() : Next.h(xr71.a(xr71Var, new ur71(ur71Var.a, true), (hr71) null, 2));
                    }
                    if (u890.j(pr71Var, kr71.a)) {
                        wr71 wr71Var3 = xr71Var.a;
                        ur71 ur71Var2 = wr71Var3 instanceof ur71 ? (ur71) wr71Var3 : null;
                        return ur71Var2 == null ? Next.j() : Next.h(xr71.a(xr71Var, new ur71(ur71Var2.a, false), (hr71) null, 2));
                    }
                    eg.o();
                }
                return null;
            case 2:
                tr3 tr3Var = (tr3) obj;
                ar3 ar3Var = (hr3) obj2;
                if (ar3Var instanceof zo3) {
                    return Next.a(Effects.a(new on3[]{new on3(m8k1.c)}));
                }
                boolean z3 = ar3Var instanceof ap3;
                nfd nfdVar = nfd.a;
                aey aeyVar = aey.N0;
                if (z3) {
                    tr3Var.getClass();
                    ap3 ap3Var = (ap3) ar3Var;
                    aey aeyVar2 = ap3Var.c;
                    if (aeyVar2 == aeyVar) {
                        return Next.j();
                    }
                    String str2 = ap3Var.a;
                    return Next.a(Effects.a(new on3[]{new on3(new b9k1(str2, ap3Var.b, ((Boolean) tr3Var.c.a(nfdVar)).booleanValue(), w3p1.x(tr3Var, aeyVar2, str2), ap3Var.d, null, ap3Var.e, 192))}));
                }
                if (ar3Var instanceof dp3) {
                    tr3Var.getClass();
                    dp3 dp3Var = (dp3) ar3Var;
                    aey aeyVar3 = dp3Var.c;
                    if (aeyVar3 == aeyVar) {
                        return Next.j();
                    }
                    String str3 = dp3Var.a;
                    return Next.a(Effects.a(new on3[]{new on3(new b9k1(str3, dp3Var.b, ((Boolean) tr3Var.c.a(nfdVar)).booleanValue(), w3p1.x(tr3Var, aeyVar3, str3), dp3Var.d, null, dp3Var.e, 192))}));
                }
                if (ar3Var instanceof fp3) {
                    tr3Var.getClass();
                    return Next.a(Effects.a(new on3[]{w3p1.t(tr3Var, (fp3) ar3Var)}));
                }
                boolean z4 = ar3Var instanceof np3;
                qzi0 qzi0Var = qzi0.a;
                List list = z6x.a;
                if (z4) {
                    tr3Var.getClass();
                    xj61 xj61Var = new xj61();
                    sxc0 sxc0Var = tr3Var.b;
                    un90 un90Var = sxc0Var.c;
                    bqq0 bqq0Var = sxc0Var.a;
                    xj61Var.add(new mn3(new not(un90Var, bqq0Var.e, bqq0Var.d)));
                    tzi0 tzi0Var = (tzi0) tr3Var.c.a(qzi0Var);
                    if (!(tzi0Var instanceof szi0)) {
                        if (tzi0Var instanceof rzi0) {
                            list = ((rzi0) tzi0Var).a;
                        } else {
                            eg.o();
                        }
                    }
                    xj61Var.add(new xn3(list, tr3Var.a() instanceof jml, o920.c));
                    return Next.a(cwl1.j(xj61Var));
                }
                if (ar3Var instanceof lp3) {
                    return Next.j();
                }
                if (ar3Var instanceof qp3) {
                    tr3Var.getClass();
                    as3 as3VarA = tr3Var.b.a.b.a();
                    return Next.a(Effects.a(new qxd0[]{new co3(as3VarA), new tn3(new yoc0(new fqq0(as3VarA, (dia1) null, (jf20) null, (mml) null, (Boolean) null, (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 510)))}));
                }
                if (ar3Var instanceof wp3) {
                    return Next.a(Effects.a(new on3[]{new on3(new m9k1(((wp3) ar3Var).a))}));
                }
                if (ar3Var instanceof rp3) {
                    tr3Var.getClass();
                    sxc0 sxc0Var2 = tr3Var.b;
                    if (!sxc0Var2.b.a.isEmpty()) {
                        tr80 tr80Var = sxc0Var2.b.a;
                        int i2 = ((rr80) tr80Var).a;
                        if (i2 > 0) {
                            return Next.a(Effects.a(new on3[]{new on3(new e9k1(Math.abs(((float) i2) / ((float) (((rr80) tr80Var).b - i2))) < 3.0f))}));
                        }
                    }
                    return Next.j();
                }
                if (ar3Var instanceof xp3) {
                    tr3Var.getClass();
                    d6c0 d6c0Var = ((xp3) ar3Var).a;
                    xj61 xj61Var2 = new xj61();
                    sxc0 sxc0Var3 = tr3Var.b;
                    un90 un90Var2 = sxc0Var3.c;
                    bqq0 bqq0Var2 = sxc0Var3.a;
                    xj61Var2.add(new mn3(new oot(un90Var2, bqq0Var2.e, d6c0Var, bqq0Var2.d)));
                    tzi0 tzi0Var2 = (tzi0) tr3Var.c.a(qzi0Var);
                    if (!(tzi0Var2 instanceof szi0)) {
                        if (tzi0Var2 instanceof rzi0) {
                            list = ((rzi0) tzi0Var2).a;
                        } else {
                            eg.o();
                        }
                    }
                    xj61Var2.add(new xn3(list, tr3Var.a() instanceof jml, new q920(d6c0Var)));
                    return Next.a(cwl1.j(xj61Var2));
                }
                if (ar3Var instanceof yp3) {
                    tr3Var.getClass();
                    d6c0 d6c0Var2 = ((yp3) ar3Var).a;
                    xj61 xj61Var3 = new xj61();
                    sxc0 sxc0Var4 = tr3Var.b;
                    un90 un90Var3 = sxc0Var4.c;
                    bqq0 bqq0Var3 = sxc0Var4.a;
                    xj61Var3.add(new mn3(new pot(un90Var3, bqq0Var3.e, d6c0Var2, bqq0Var3.d)));
                    tzi0 tzi0Var3 = (tzi0) tr3Var.c.a(qzi0Var);
                    if (!(tzi0Var3 instanceof szi0)) {
                        if (tzi0Var3 instanceof rzi0) {
                            list = ((rzi0) tzi0Var3).a;
                        } else {
                            eg.o();
                        }
                    }
                    xj61Var3.add(new xn3(list, tr3Var.a() instanceof jml, new p920(d6c0Var2)));
                    return Next.a(cwl1.j(xj61Var3));
                }
                if (ar3Var instanceof dq3) {
                    tr3Var.getClass();
                    w7c0 w7c0Var = tr3Var.c;
                    w7c0 w7c0Var2 = ((dq3) ar3Var).a;
                    return u890.j(w7c0Var, w7c0Var2) ? Next.j() : Next.h(tr3.b(tr3Var, null, null, new w7c0(sqg0.O(w7c0Var.a, w7c0Var2.a)), false, 11));
                }
                if (!(ar3Var instanceof kq3)) {
                    if (ar3Var instanceof mq3) {
                        return Next.a(Effects.a(new eo3[]{eo3.d}));
                    }
                    if (ar3Var instanceof nq3) {
                        return Next.a(Effects.a(new fo3[]{new fo3(((nq3) ar3Var).a)}));
                    }
                    if (ar3Var instanceof ar3) {
                        tr3Var.getClass();
                        bqq0 bqq0Var4 = tr3Var.b.a;
                        dia1 dia1Var = bqq0Var4.c;
                        dia1 dia1Var2 = ar3Var.a;
                        return dia1Var == dia1Var2 ? Next.j() : Next.a(f46.S0(new qxd0[]{new bo3(dia1Var2, new uia1(bqq0Var4.e, bqq0Var4.d)), new tn3(new yoc0(new fqq0((as3) null, dia1Var2, (jf20) null, (mml) null, (Boolean) null, (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 509)))}));
                    }
                    if (ar3Var instanceof br3) {
                        tr3Var.getClass();
                        bqq0 bqq0Var5 = tr3Var.b.a;
                        return Next.a(Effects.a(new on3[]{new on3(new p9k1(new hia1(bqq0Var5.c, tr3Var.a, bqq0Var5.d)))}));
                    }
                    if (ar3Var instanceof cr3) {
                        return Next.a(Effects.a(new un3[]{new un3(((cr3) ar3Var).a)}));
                    }
                    if (ar3Var instanceof dr3) {
                        return Next.a(Effects.a(new uo3[]{new uo3(((dr3) ar3Var).a)}));
                    }
                    if (ar3Var instanceof cp3) {
                        cp3 cp3Var = (cp3) ar3Var;
                        return Next.a(Effects.a(new rn3[]{new rn3(cp3Var.a, cp3Var.b, cp3Var.c)}));
                    }
                    n57.e("Unexpected " + ar3Var + " goes unhandled");
                    return Next.j();
                }
                tr3Var.getClass();
                kq3 kq3Var = (kq3) ar3Var;
                if (kq3Var instanceof jq3) {
                    return Next.j();
                }
                if (kq3Var instanceof iq3) {
                    iq3 iq3Var = (iq3) kq3Var;
                    return Next.i(tr3.b(tr3Var, iq3Var.b, null, null, false, 14), Collections.singleton(new tn3(new yoc0(iq3Var.a))));
                }
                hhg1.n("Failed requirement.");
                return null;
            case 3:
                xx71 xx71VarA = (xx71) obj;
                mx71 mx71Var = (vx71) obj2;
                String str4 = xx71VarA.i;
                mw71 mw71Var = xx71VarA.k;
                boolean z5 = xx71VarA.g;
                long j2 = xx71VarA.m;
                boolean z6 = xx71VarA.n;
                String str5 = xx71VarA.a;
                boolean z7 = xx71VarA.e;
                ew71 ew71Var = xx71VarA.j;
                List list2 = xx71VarA.d;
                long j3 = xx71VarA.l;
                if (mx71Var instanceof tx71) {
                    tx71 tx71Var = (tx71) mx71Var;
                    List listN0 = tx71Var.a;
                    int i3 = tx71Var.d;
                    if (tx71Var.c != j3) {
                        return Next.j();
                    }
                    int iC = l1d.C(i3);
                    if (iC != 0) {
                        if (iC == 1) {
                            listN0 = o7h.N0(listN0, list2);
                        } else {
                            eg.o();
                        }
                    }
                    String str6 = tx71Var.b;
                    if (i3 == 1 && z6) {
                        j2++;
                    }
                    xx71 xx71VarA2 = xx71.a(xx71VarA, (String) null, (String) null, (dw71) null, listN0, false, (ew71) null, false, false, str6, (ew71) null, (mw71) null, 0L, j2, z6 && i3 != 1, false, (Set) null, (Set) null, 118279);
                    return Next.i(xx71VarA2, r4p1.t(xx71VarA2, xx71VarA2.q));
                }
                boolean z8 = mx71Var instanceof sx71;
                List list3 = z6x.a;
                if (z8) {
                    sx71 sx71Var = (sx71) mx71Var;
                    if (sx71Var.a != j3) {
                        return Next.j();
                    }
                    int iC2 = l1d.C(sx71Var.b);
                    if (iC2 == 0) {
                        if (xx71VarA.f == null) {
                            list3 = list2;
                        }
                        return Next.h(xx71.a(xx71VarA, (String) null, (String) null, (dw71) null, list3, false, (ew71) null, true, false, (String) null, (ew71) null, (mw71) null, 0L, 0L, false, false, (Set) null, (Set) null, 130951));
                    }
                    if (iC2 == 1) {
                        return Next.i(xx71.a(xx71VarA, (String) null, (String) null, (dw71) null, (List) null, false, (ew71) null, false, false, (String) null, (ew71) null, (mw71) null, 0L, 0L, false, false, (Set) null, (Set) null, 130943), Collections.singleton(new rw71(2131962386)));
                    }
                    eg.o();
                } else {
                    if (mx71Var instanceof mx71) {
                        mx71 mx71Var2 = mx71Var;
                        if (mx71Var2.a == ew71Var) {
                            return Next.j();
                        }
                        long j4 = j3 + 1;
                        if (list2.isEmpty() && (z7 || z5)) {
                            z2 = false;
                        }
                        ew71 ew71Var2 = mx71Var2.a;
                        if (ew71Var2 == null) {
                            list3 = list2;
                        }
                        xx71 xx71VarA3 = xx71.a(xx71VarA, (String) null, (String) null, (dw71) null, list3, true, (ew71Var2 == null && z2) ? ew71Var : null, false, false, (String) null, ew71Var2, (mw71) null, j4, 0L, true, false, (Set) null, (Set) null, 119815);
                        return Next.i(xx71VarA3, Collections.singleton(new pw71(r4p1.x(xx71VarA3))));
                    }
                    if (mx71Var instanceof ux71) {
                        mw71 mw71Var2 = ((ux71) mx71Var).a;
                        if (mw71Var2 == mw71Var) {
                            return Next.j();
                        }
                        xx71 xx71VarA4 = xx71.a(xx71VarA, (String) null, (String) null, (dw71) null, list3, true, (ew71) null, false, false, (String) null, (ew71) null, mw71Var2, j3 + 1, 0L, true, false, (Set) null, (Set) null, 119303);
                        return Next.i(xx71VarA4, Collections.singleton(new pw71(r4p1.x(xx71VarA4))));
                    }
                    if (mx71Var.equals(rx71.a)) {
                        return (z7 || xx71VarA.h || str4 == null) ? Next.j() : Next.i(xx71.a(xx71VarA, (String) null, (String) null, (dw71) null, (List) null, false, (ew71) null, false, true, (String) null, (ew71) null, (mw71) null, 0L, 0L, false, false, (Set) null, (Set) null, 130943), Collections.singleton(new pw71(r4p1.x(xx71VarA), str4, 2)));
                    }
                    if (mx71Var.equals(qx71.a)) {
                        xx71 xx71VarA5 = xx71.a(xx71VarA, (String) null, (String) null, (dw71) null, (List) null, true, (ew71) null, false, false, (String) null, (ew71) null, (mw71) null, j3 + 1, 0L, false, false, (Set) null, (Set) null, 128527);
                        return Next.i(xx71VarA5, Collections.singleton(new pw71(r4p1.x(xx71VarA5))));
                    }
                    if (mx71Var.equals(nx71.a)) {
                        return (ew71Var != ew71.f || z7 || z5 || list2.isEmpty() || xx71VarA.o) ? Next.j() : Next.i(xx71.a(xx71VarA, (String) null, (String) null, (dw71) null, (List) null, false, (ew71) null, false, false, (String) null, (ew71) null, (mw71) null, 0L, 0L, false, true, (Set) null, (Set) null, 114687), Collections.singleton(new ow71(str5, mw71Var.c, xx71VarA.b)));
                    }
                    if (mx71Var instanceof ox71) {
                        ox71 ox71Var = (ox71) mx71Var;
                        if (ox71Var.a.equals(str5)) {
                            xx71VarA = xx71.a(xx71VarA, (String) null, (String) null, (dw71) null, (List) null, false, (ew71) null, false, false, (String) null, (ew71) null, (mw71) null, 0L, 0L, false, false, (Set) null, (Set) null, 114687);
                        }
                        xj61 xj61Var4 = new xj61();
                        xj61Var4.add(new qw71(ox71Var.b));
                        if (!ox71Var.c) {
                            xj61Var4.add(new rw71(2131962393));
                        }
                        return Next.i(xx71VarA, cwl1.j(xj61Var4));
                    }
                    if (mx71Var instanceof px71) {
                        if (((px71) mx71Var).a.equals(str5)) {
                            xx71VarA = xx71.a(xx71VarA, (String) null, (String) null, (dw71) null, (List) null, false, (ew71) null, false, false, (String) null, (ew71) null, (mw71) null, 0L, 0L, false, false, (Set) null, (Set) null, 114687);
                        }
                        return Next.i(xx71VarA, Collections.singleton(new rw71(2131962357)));
                    }
                    if (mx71Var instanceof jx71) {
                        return Next.a(Collections.singleton(new nw71(((jx71) mx71Var).a)));
                    }
                    if (mx71Var instanceof lx71) {
                        return Next.a(Collections.singleton(new sw71(((lx71) mx71Var).a)));
                    }
                    if (mx71Var instanceof kx71) {
                        kx71 kx71Var = (kx71) mx71Var;
                        xx71 xx71VarA6 = xx71.a(xx71VarA, (String) null, (String) null, (dw71) null, (List) null, false, (ew71) null, false, false, (String) null, (ew71) null, (mw71) null, 0L, 0L, false, false, kx71Var.a, kx71Var.b, 32767);
                        return Next.i(xx71VarA6, r4p1.t(xx71VarA6, kx71Var.b));
                    }
                    eg.o();
                }
                return null;
            case 4:
                nxw nxwVar = (nxw) obj;
                gxw gxwVar = (gxw) obj2;
                jxw jxwVar = new jxw(nxwVar, (byte) 0);
                jxw jxwVar2 = new jxw(nxwVar, (byte) 1);
                jxw jxwVar3 = new jxw(nxwVar, (byte) 2);
                jxw jxwVar4 = new jxw(nxwVar, (byte) 3);
                jxw jxwVar5 = new jxw(nxwVar, (byte) 4);
                if (gxwVar instanceof axw) {
                    objInvoke = jxwVar.invoke(gxwVar);
                } else if (gxwVar instanceof exw) {
                    objInvoke = jxwVar2.invoke(gxwVar);
                } else if (gxwVar instanceof dxw) {
                    objInvoke = jxwVar3.invoke(gxwVar);
                } else if (gxwVar instanceof cxw) {
                    objInvoke = jxwVar4.invoke(gxwVar);
                } else if (gxwVar instanceof bxw) {
                    objInvoke = Next.j();
                } else {
                    if (!(gxwVar instanceof fxw)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = jxwVar5.invoke(gxwVar);
                }
                return (Next) objInvoke;
            case 5:
                return g(obj, obj2);
            case 6:
                z011 z011Var = (z011) obj;
                tq80 tq80Var2 = (tq80) obj2;
                j011 j011Var = (j011) tq80Var2.a;
                if (!(j011Var instanceof i011)) {
                    z011Var.getClass();
                    return y1x0.e(z011Var, j011Var);
                }
                z011Var.getClass();
                tqw tqwVar2 = tq80Var2.b;
                return y1x0.e(z011Var, new i011(tqwVar2 != null ? n3o1.y(tqwVar2) : null));
            case 7:
                return h(obj, obj2);
            case 8:
                zgb1 zgb1Var = (bhb1) obj;
                ugb1 ugb1Var = (wgb1) obj2;
                if (ugb1Var instanceof rgb1) {
                    if (!(zgb1Var instanceof zgb1)) {
                        rgb1 rgb1Var = (rgb1) ugb1Var;
                        ArrayList arrayList2 = rgb1Var.e;
                        cuu0 cuu0Var = rgb1Var.f;
                        zgb1 zgb1Var2 = new zgb1(zgb1Var.h(), zgb1Var.g(), zgb1Var.a(), zgb1Var.j(), zgb1Var.k(), rgb1Var.a, rgb1Var.b, rgb1Var.c, rgb1Var.d, ((x8d1) arrayList2.get(0)).a(), arrayList2, 0, false, cuu0Var != null ? cuu0Var.j(zgb1Var.j().g.getBoolean("playlist.share.is_inviting_contributors", false)) : null, zgb1Var.b(), 4096);
                        return Next.i(zgb1Var2, xyn1.y(zgb1Var2, dxo1.w(zgb1Var.h())));
                    }
                    zgb1 zgb1Var3 = zgb1Var;
                    List list4 = zgb1Var3.X;
                    rgb1 rgb1Var2 = (rgb1) ugb1Var;
                    ArrayList arrayList3 = rgb1Var2.e;
                    cuu0 cuu0Var2 = zgb1Var3.N0;
                    int i4 = zgb1Var3.Y;
                    x8d1 x8d1Var = (x8d1) o7h.t0(i4, list4);
                    if (x8d1Var != null) {
                        int iIndexOf = arrayList3.indexOf(x8d1Var);
                        if (iIndexOf >= 0) {
                            iP = iIndexOf;
                        } else {
                            iP = i4 <= p7h.L(arrayList3) ? i4 : yoi1.p(0, 0, p7h.L(arrayList3));
                        }
                    }
                    x8d1 x8d1Var2 = (x8d1) arrayList3.get(iP);
                    zgb1 zgb1VarL = zgb1.l(zgb1Var3, 0, (wkt) null, rgb1Var2.a, rgb1Var2.b, rgb1Var2.c, rgb1Var2.d, x8d1Var2.a(), arrayList3, iP, x8d1Var2 instanceof t8d1, r2p1.l(cuu0Var2, rgb1Var2.f), 16415);
                    return Next.i(zgb1VarL, (arrayList3.equals(list4) && (cuu0Var2 instanceof auu0) == (zgb1VarL.N0 instanceof auu0)) ? w7x.a : xyn1.y(zgb1VarL, dxo1.w(zgb1Var3.a)));
                }
                if (ugb1Var instanceof ugb1) {
                    if (zgb1Var instanceof ahb1) {
                        return Next.h(ahb1.l((ahb1) zgb1Var, 0, ugb1Var.a, 47));
                    }
                    if (zgb1Var instanceof ygb1) {
                        return Next.h(ygb1.l((ygb1) zgb1Var, 0, ugb1Var.a, 47));
                    }
                    if (zgb1Var instanceof zgb1) {
                        return Next.h(zgb1.l(zgb1Var, 0, ugb1Var.a, (String) null, (String) null, (String) null, 0, (llw0) null, (ArrayList) null, 0, false, (cuu0) null, 32751));
                    }
                    eg.o();
                    return null;
                }
                if (ugb1Var instanceof sgb1) {
                    if (!(zgb1Var instanceof zgb1)) {
                        return Next.j();
                    }
                    zgb1 zgb1Var4 = zgb1Var;
                    sgb1 sgb1Var = (sgb1) ugb1Var;
                    return Next.i(zgb1.l(zgb1Var4, 0, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (ArrayList) null, 0, false, (cuu0) null, 32751), Collections.singleton(new ogb1(zgb1Var4, sgb1Var.a, sgb1Var.b, sgb1Var.c)));
                }
                if (ugb1Var instanceof vgb1) {
                    vgb1 vgb1Var = (vgb1) ugb1Var;
                    if (!(zgb1Var instanceof zgb1)) {
                        return Next.j();
                    }
                    zgb1 zgb1Var5 = zgb1Var;
                    x8d1 x8d1Var3 = (x8d1) o7h.t0(vgb1Var.a, zgb1Var5.X);
                    return x8d1Var3 == null ? Next.j() : Next.h(zgb1.l(zgb1Var5, 0, (wkt) null, (String) null, (String) null, (String) null, 0, x8d1Var3.a(), (ArrayList) null, vgb1Var.a, x8d1Var3 instanceof t8d1, (cuu0) null, 26111));
                }
                if (ugb1Var instanceof pgb1) {
                    if (!(zgb1Var instanceof zgb1)) {
                        return Next.j();
                    }
                    zgb1 zgb1Var6 = zgb1Var;
                    cuu0 cuu0Var3 = zgb1Var6.N0;
                    return Next.h(zgb1.l(zgb1Var6, 0, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (ArrayList) null, 0, false, cuu0Var3 != null ? cuu0Var3.j(((pgb1) ugb1Var).a) : null, 24575));
                }
                if (ugb1Var instanceof qgb1) {
                    return zgb1Var instanceof zgb1 ? Next.j() : Next.h(new ygb1(zgb1Var.h(), zgb1Var.g(), zgb1Var.a(), zgb1Var.j(), (wkt) null, zgb1Var.b()));
                }
                if (ugb1Var instanceof tgb1) {
                    return Next.h(new ahb1(zgb1Var.h(), zgb1Var.g(), zgb1Var.a(), zgb1Var.j(), (wkt) null, zgb1Var.b()));
                }
                eg.o();
                return null;
            case 9:
                return Next.j();
            case 10:
                return i(obj, obj2);
            case 11:
                return d((khd1) obj, (tgd1) obj2);
            case 12:
                yff1 yff1Var = (yff1) obj;
                tq80 tq80Var3 = (tq80) obj2;
                tff1 tff1Var = (uff1) tq80Var3.a;
                if (tff1Var instanceof tff1) {
                    return Next.a(Collections.singleton(new lff1(tff1Var.b)));
                }
                if (tff1Var instanceof sff1) {
                    srt0 srt0Var = yff1Var.b;
                    srt0 srt0Var2 = ((sff1) tff1Var).a;
                    return !srt0Var.equals(srt0Var2) ? Next.h(yff1.a(yff1Var, srt0Var2, false, false, 13)) : Next.j();
                }
                if (tff1Var instanceof nff1) {
                    boolean z9 = yff1Var.c;
                    boolean z10 = ((nff1) tff1Var).a;
                    return z9 != z10 ? Next.h(yff1.a(yff1Var, (srt0) null, z10, false, 11)) : Next.j();
                }
                if (tff1Var instanceof off1) {
                    boolean z11 = yff1Var.d;
                    boolean z12 = ((off1) tff1Var).a;
                    return z11 != z12 ? Next.h(yff1.a(yff1Var, (srt0) null, false, z12, 7)) : Next.j();
                }
                if (!(tff1Var instanceof pff1)) {
                    return tff1Var instanceof rff1 ? Next.a(Collections.singleton(new kff1(((rff1) tff1Var).b))) : Next.j();
                }
                tqw tqwVar3 = tq80Var3.b;
                tv80 tv80VarY = tqwVar3 != null ? n3o1.y(tqwVar3) : null;
                if (tv80VarY != null) {
                    return Next.a(Collections.singleton(new mff1(((pff1) tff1Var).b, tv80VarY)));
                }
                n57.e("Missing InteractionLoggingResult for TopTracksElement context menu");
                return Next.j();
            case 13:
                return j(obj, obj2);
            case 14:
                return y9g1.z((q9g1) obj, (d9g1) obj2);
            case 15:
                return k(obj, obj2);
            case 16:
                return l(obj, obj2);
            case 17:
                return m(obj, obj2);
            case 18:
                return n(obj, obj2);
            case 19:
                return o(obj, obj2);
            case 20:
                return p(obj, obj2);
            case 21:
                return q(obj, obj2);
            case 22:
                return f((eyk1) obj, (ayk1) obj2);
            case 23:
                return e((fwk1) obj, (yvk1) obj2);
            case 24:
                return r(obj, obj2);
            case 25:
                return s(obj, obj2);
            case 26:
                sfm1 sfm1Var = (sfm1) obj2;
                return sfm1Var instanceof sfm1 ? Next.a(Collections.singleton(new rfm1((ufm1) obj, sfm1Var.a))) : Next.j();
            case 27:
                return t(obj, obj2);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return yoo1.C((w9p0) obj, (gmm1) obj2);
            default:
                inm1 inm1Var = (pnm1) ((tq80) obj2).a;
                if (inm1Var instanceof jnm1) {
                    jnm1 jnm1Var = (jnm1) inm1Var;
                    Integer num = jnm1Var.c;
                    String str7 = jnm1Var.b;
                    String str8 = jnm1Var.a;
                    boolean z13 = jnm1Var.e;
                    String str9 = jnm1Var.d;
                    return Next.h(z13 ? new tnm1(str9, str8, num, str7) : new vnm1(str9, str8, num, str7));
                }
                if (inm1Var instanceof lnm1) {
                    lnm1 lnm1Var = (lnm1) inm1Var;
                    return Next.h(new snm1(lnm1Var.a, lnm1Var.b, lnm1Var.c));
                }
                if (inm1Var instanceof hnm1) {
                    hnm1 hnm1Var = (hnm1) inm1Var;
                    return Next.h(new rnm1(hnm1Var.a, hnm1Var.b, hnm1Var.c));
                }
                if (inm1Var instanceof knm1) {
                    knm1 knm1Var = (knm1) inm1Var;
                    return Next.h(new unm1(knm1Var.a, knm1Var.b, knm1Var.c));
                }
                if (inm1Var instanceof inm1) {
                    Logger.d(l1d.m("YourActivityCarouselItem: Data loading failed: ", inm1Var.a.getMessage()), new Object[0]);
                    return Next.j();
                }
                if (inm1Var instanceof nnm1) {
                    return Next.a(Collections.singleton(paw.a));
                }
                if ((inm1Var instanceof onm1) || (inm1Var instanceof mnm1)) {
                    return Next.a(Collections.singleton(kfw.a));
                }
                eg.o();
                return null;
        }
    }

    public Next d(khd1 khd1Var, tgd1 tgd1Var) {
        List list = khd1Var.a;
        if (tgd1Var instanceof sgd1) {
            List list2 = ((sgd1) tgd1Var).a;
            String uri = ((xgd1) o7h.q0(list2)).e.getUri();
            List<xgd1> list3 = list2;
            ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
            for (xgd1 xgd1Var : list3) {
                z6x z6xVar = z6x.a;
                arrayList.add(new ygd1(xgd1Var, new bpd((String) null, z6xVar, z6xVar), 4, null));
            }
            return Next.i(khd1.b(khd1Var, arrayList, uri, (String) null, 4), Collections.singleton(new nfd1(uri)));
        }
        if (tgd1Var instanceof mgd1) {
            String str = ((mgd1) tgd1Var).a;
            List<ygd1> list4 = list;
            ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
            for (ygd1 ygd1VarA : list4) {
                if (u890.j(ygd1VarA.a.e.getUri(), str) && ygd1VarA.b.c.isEmpty()) {
                    ygd1VarA = ygd1.a(ygd1VarA, null, 1, null, 11);
                }
                arrayList2.add(ygd1VarA);
            }
            return Next.h(khd1.b(khd1Var, arrayList2, (String) null, str, 10));
        }
        if (tgd1Var instanceof ngd1) {
            ngd1 ngd1Var = (ngd1) tgd1Var;
            String str2 = ngd1Var.a;
            List<ygd1> list5 = list;
            ArrayList arrayList3 = new ArrayList(q7h.U(list5, 10));
            for (ygd1 ygd1VarA2 : list5) {
                if (u890.j(ygd1VarA2.a.e.getUri(), str2)) {
                    ygd1VarA2 = ygd1.a(ygd1VarA2, ngd1Var.b, 2, ngd1Var.c, 1);
                }
                arrayList3.add(ygd1VarA2);
            }
            return Next.h(khd1.b(khd1Var, arrayList3, (String) null, str2, 10));
        }
        if (tgd1Var instanceof pgd1) {
            pgd1 pgd1Var = (pgd1) tgd1Var;
            j80 j80Var = pgd1Var.a;
            String str3 = pgd1Var.b;
            tv80 tv80Var = pgd1Var.c;
            return Next.a(f46.S0(new tfd1[]{new sfd1(j80Var, str3, tv80Var), new pfd1(tv80Var.a, fqn0.a)}));
        }
        if (tgd1Var instanceof lgd1) {
            lgd1 lgd1Var = (lgd1) tgd1Var;
            return Next.a(Collections.singleton(new pfd1(lgd1Var.b, lgd1Var.a.a)));
        }
        if (tgd1Var instanceof qgd1) {
            qgd1 qgd1Var = (qgd1) tgd1Var;
            return Next.a(Collections.singleton(new qfd1(qgd1Var.a, qgd1Var.b)));
        }
        if (tgd1Var instanceof rgd1) {
            rgd1 rgd1Var = (rgd1) tgd1Var;
            wqn0 wqn0Var = rgd1Var.a;
            String uri2 = wqn0Var.getUri();
            return Next.i(khd1.b(khd1Var, (ArrayList) null, uri2, uri2, 1), Collections.singleton(new rfd1(rgd1Var.b, wqn0Var)));
        }
        if (!(tgd1Var instanceof ogd1)) {
            eg.o();
            return null;
        }
        List<ygd1> list6 = list;
        for (ygd1 ygd1Var : list6) {
            if (ygd1Var.a.e.equals(((ogd1) tgd1Var).a)) {
                String uri3 = ygd1Var.a.e.getUri();
                int iC = l1d.C(ygd1Var.c);
                if (iC != 0) {
                    if (iC == 1) {
                        return Next.a(f46.S0(new tfd1[]{new mfd1(), new nfd1(uri3)}));
                    }
                    if (iC == 2 || iC == 3) {
                        return Next.a(Collections.singleton(new nfd1(uri3)));
                    }
                    eg.o();
                    return null;
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(list6, 10));
                for (ygd1 ygd1VarA3 : list6) {
                    if (u890.j(ygd1VarA3.a.e.getUri(), uri3)) {
                        ygd1VarA3 = ygd1.a(ygd1VarA3, null, 3, null, 11);
                    }
                    arrayList4.add(ygd1VarA3);
                }
                return Next.i(khd1.b(khd1Var, arrayList4, (String) null, (String) null, 14), Collections.singleton(new nfd1(uri3)));
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }

    public Next e(fwk1 fwk1Var, yvk1 yvk1Var) {
        xhz xhzVar = fwk1Var.h;
        String str = fwk1Var.a;
        List<wdo0> list = fwk1Var.f;
        if (yvk1Var instanceof wvk1) {
            return fwk1Var.d - fwk1Var.g() == 0 ? Next.j() : Next.h(fwk1Var.a(1, ((wvk1) yvk1Var).a));
        }
        if (yvk1Var instanceof vvk1) {
            String str2 = ((vvk1) yvk1Var).a;
            for (wdo0 wdo0Var : list) {
                if (u890.j(wdo0Var.a, str2)) {
                    return wdo0Var.e == 0 ? Next.j() : Next.h(fwk1Var.a(-1, str2));
                }
            }
            bhn0.t("Collection contains no element matching the predicate.");
            return null;
        }
        if (!(yvk1Var instanceof svk1)) {
            if (yvk1Var instanceof xvk1) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(wdo0.a((wdo0) it.next(), 0));
                }
                return Next.h(fwk1.b(fwk1Var, arrayList, xhz.a(xhzVar, false), false, 1887));
            }
            if (yvk1Var instanceof uvk1) {
                return Next.a(Collections.singleton(new ivk1(((uvk1) yvk1Var).a, fwk1Var.t, fwk1Var.X, fwk1Var.b, l1d.m("spotify:playlist:", str))));
            }
            if (yvk1Var instanceof tvk1) {
                return Next.h(fwk1.b(fwk1Var, null, xhz.a(xhzVar, true), false, 1663));
            }
            eg.o();
            return null;
        }
        if (fwk1Var.g() == 0 || fwk1Var.i) {
            return Next.j();
        }
        fwk1 fwk1VarB = fwk1.b(fwk1Var, null, xhz.a(xhzVar, false), true, 1663);
        String str3 = fwk1Var.t;
        String str4 = fwk1Var.X;
        x461 x461VarO = SendVotesRequestV2.o();
        x461VarO.r(str3);
        x461VarO.q(str4);
        ArrayList<wdo0> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((wdo0) obj).e > 0) {
                arrayList2.add(obj);
            }
        }
        int iS = zno1.s(q7h.U(arrayList2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (wdo0 wdo0Var2 : arrayList2) {
            linkedHashMap.put(wdo0Var2.a, Integer.valueOf(wdo0Var2.e));
        }
        x461VarO.n(linkedHashMap);
        return Next.i(fwk1VarB, Collections.singleton(new jvk1((SendVotesRequestV2) x461VarO.build(), fwk1Var.t, fwk1Var.X, fwk1Var.b, l1d.m("spotify:playlist:", str))));
    }

    public Next f(eyk1 eyk1Var, ayk1 ayk1Var) {
        List list = eyk1Var.c;
        if (ayk1Var.equals(xxk1.a)) {
            return Next.a(Collections.singleton(pxk1.a));
        }
        if (ayk1Var instanceof zxk1) {
            zxk1 zxk1Var = (zxk1) ayk1Var;
            return Next.a(Collections.singleton(new rxk1(zxk1Var.a, zxk1Var.b, zxk1Var.c)));
        }
        if (!(ayk1Var instanceof yxk1)) {
            if (ayk1Var instanceof wxk1) {
                return Next.h(new eyk1(((wxk1) ayk1Var).a, eyk1Var.a, eyk1Var.b, eyk1Var.e, eyk1Var.f, list));
            }
            eg.o();
            return null;
        }
        yxk1 yxk1Var = (yxk1) ayk1Var;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof s271) {
                arrayList.add(obj);
            }
        }
        s271 s271Var = (s271) o7h.s0(arrayList);
        if (s271Var == null) {
            return Next.j();
        }
        r271 r271Var = (r271) o7h.t0(eyk1Var.d, s271Var.a);
        return r271Var == null ? Next.j() : Next.a(Collections.singleton(new qxk1(s271Var.c, s271Var.d, r271Var.c, yxk1Var.a)));
    }
}
