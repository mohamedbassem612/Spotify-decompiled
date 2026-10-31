package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.concertpageview.v1.Row;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class dq7 implements Update {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ dq7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public static Next b(pb31 pb31Var, ega1 ega1Var, ega1 ega1Var2) {
        km90 km90VarC;
        Object objF;
        dga1 dga1Var = pb31Var.a() ? ega1Var.a : ega1Var2.a;
        l620 l620Var = pb31Var.e() ? ega1Var.b : ega1Var2.b;
        cga1 cga1Var = ega1Var2.c;
        if (cga1Var == null) {
            cga1Var = ega1Var.c;
        }
        ega1Var.getClass();
        ega1 ega1Var3 = new ega1(dga1Var, l620Var, cga1Var);
        if (pb31Var instanceof ob31) {
            km90VarC = ((ob31) pb31Var).c();
        } else {
            if (!(pb31Var instanceof lb31)) {
                if (pb31Var instanceof kb31) {
                    return Next.j();
                }
                eg.o();
                return null;
            }
            lb31 lb31Var = (lb31) pb31Var;
            km90 km90Var = lb31Var.g;
            km90VarC = km90Var == null ? lb31Var.f : km90Var;
        }
        if (!dga1Var.equals(ega1Var.a) || l620Var != ega1Var.b) {
            return d(ega1Var3, pb31Var, km90VarC, pb31Var.b(), 0);
        }
        if (pb31Var instanceof mb31) {
            mb31 mb31Var = (mb31) pb31Var;
            objF = new mb31(mb31Var.a, mb31Var.b, ega1Var3, mb31Var.d, mb31Var.e, mb31Var.f, mb31Var.g);
        } else if (pb31Var instanceof nb31) {
            nb31 nb31Var = (nb31) pb31Var;
            objF = new nb31(nb31Var.a, nb31Var.b, ega1Var3, nb31Var.d, nb31Var.e, nb31Var.f);
        } else {
            if (!(pb31Var instanceof lb31)) {
                if (pb31Var instanceof kb31) {
                    return Next.j();
                }
                eg.o();
                return null;
            }
            objF = lb31.f((lb31) pb31Var, null, ega1Var3, null, 1015);
        }
        return Next.i(objF, Collections.singleton(new za31(ega1Var3, pb31Var.getUsername(), 0)));
    }

    public static Next c(dq7 dq7Var, ega1 ega1Var, vbe vbeVar, String str, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z4 = (i & 32) != 0 ? false : z3;
        boolean z5 = vbeVar instanceof qb31;
        if (z5) {
            ega1Var = ega1.a(ega1Var, null, l620.a, null, 5);
        }
        boolean z6 = z;
        km90 km90Var = z5 ? im90.a : (km90) dq7Var.b;
        ega1 ega1Var2 = ega1Var;
        return Next.i(new mb31(str, vbeVar, ega1Var2, km90Var, z6, z2, z4), Collections.singleton(new wa31(ega1Var2, km90Var)));
    }

    public static Next d(ega1 ega1Var, pb31 pb31Var, km90 km90Var, vbe vbeVar, int i) {
        return Next.i(new nb31(pb31Var.getUsername(), vbeVar, ega1Var, km90Var, pb31Var.a() || i == 1, pb31Var.e() || i == 2), f46.S0(new ab31[]{new za31(ega1Var, pb31Var.getUsername(), i), new wa31(ega1Var, km90Var)}));
    }

    private final Next e(Object obj, Object obj2) {
        w7x w7xVarSingleton;
        ly80 ly80Var = (ly80) obj;
        tq80 tq80Var = (tq80) obj2;
        bz80 bz80Var = (bz80) this.b;
        ly80Var.getClass();
        boolean z = ly80Var.h;
        wx80 wx80Var = (iy80) tq80Var.a;
        tqw tqwVar = tq80Var.b;
        fq2 fq2Var = bz80Var.i;
        pe peVar = bz80Var.h;
        jy80 jy80Var = ly80Var.u;
        if ((jy80Var == jy80.b || jy80Var == jy80.c) && ((wx80Var instanceof ux80) || (wx80Var instanceof ey80) || (wx80Var instanceof zx80) || (wx80Var instanceof dy80) || (wx80Var instanceof cy80))) {
            return Next.j();
        }
        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        if (wx80Var instanceof ux80) {
            return Next.a(Collections.singleton(new nx80(ly80Var.e, tv80VarY)));
        }
        if (wx80Var instanceof ey80) {
            if (!z || peVar.e()) {
                return (z || ly80Var.f) ? Next.a(Collections.singleton(new ox80((String) null, tv80VarY, false, 5))) : Next.a(Collections.singleton(new rx80(2, tv80VarY)));
            }
            return Next.a(Collections.singleton(new px80(1, tv80VarY)));
        }
        if (wx80Var instanceof zx80) {
            return ly80Var.g ? Next.a(Collections.singleton(new px80(2, tv80VarY))) : Next.a(Collections.singleton(new rx80(1, tv80VarY)));
        }
        if (wx80Var instanceof dy80) {
            fq2Var.n();
            return Next.j();
        }
        if (wx80Var instanceof hy80) {
            hy80 hy80Var = (hy80) wx80Var;
            String string = ihc1.e1(hy80Var.a).toString();
            ly80 ly80VarA = ly80.a(ly80Var, (String) null, false, false, false, (String) null, false, false, false, false, false, false, false, krm0.a, false, false, (String) null, false, (String) null, false, false, (jy80) null, 2093055);
            if (ihc1.y0(string)) {
                w7xVarSingleton = w7x.a;
            } else {
                w7xVarSingleton = (!z || peVar.e()) ? Collections.singleton(new ox80(string, (tv80) null, false, 2)) : Collections.singleton(new tx80(string, hy80Var.b, false));
            }
            return Next.i(ly80VarA, w7xVarSingleton);
        }
        if (wx80Var instanceof wx80) {
            return Next.h(ly80.a(ly80Var, (String) null, false, false, false, (String) null, false, false, false, false, false, false, false, wx80Var.a, false, false, (String) null, false, (String) null, false, false, (jy80) null, 2093055));
        }
        if (wx80Var instanceof xx80) {
            return Next.h(ly80.a(ly80Var, (String) null, false, false, false, (String) null, false, false, false, false, false, false, false, (krm0) null, true, false, ((xx80) wx80Var).b, false, (String) null, false, false, (jy80) null, 2056191));
        }
        if (wx80Var instanceof fy80) {
            return Next.h(ly80.a(ly80Var, (String) null, false, false, false, (String) null, false, false, false, false, false, false, false, (krm0) null, false, true, (String) null, false, (String) null, false, false, (jy80) null, 2080767));
        }
        if (wx80Var instanceof gy80) {
            return Next.h(ly80.a(ly80Var, (String) null, false, false, false, (String) null, false, false, false, false, false, false, false, (krm0) null, false, false, (String) null, false, (String) null, false, false, (jy80) null, 2080767));
        }
        if (wx80Var instanceof yx80) {
            return Next.h(ly80.a(ly80Var, (String) null, false, false, false, (String) null, false, false, false, false, false, false, false, (krm0) null, false, false, (String) null, false, (String) null, false, false, (jy80) null, 2056191));
        }
        if (wx80Var instanceof cy80) {
            if (ly80Var.t || too1.p((jre) fq2Var.s.a.getValue())) {
                return Next.j();
            }
            if (!z || peVar.e()) {
                return Next.a(Collections.singleton(new ox80(((cy80) wx80Var).a, tv80VarY, false, 4)));
            }
            return Next.i(ly80.a(ly80Var, (String) null, false, false, false, (String) null, false, false, false, false, false, false, false, (krm0) null, false, false, (String) null, false, (String) null, false, true, (jy80) null, 1572863), Collections.singleton(new qx80(((cy80) wx80Var).a, tv80VarY)));
        }
        if (wx80Var instanceof by80) {
            return Next.h(ly80.a(ly80Var, (String) null, false, false, false, (String) null, false, false, false, false, false, false, false, (krm0) null, false, false, (String) null, false, (String) null, false, false, (jy80) null, 1572863));
        }
        if (wx80Var instanceof vx80) {
            jy80 jy80Var2 = ((vx80) wx80Var).a;
            return jy80Var == jy80Var2 ? Next.j() : Next.h(ly80.a(ly80Var, (String) null, false, false, false, (String) null, false, false, false, false, false, false, false, (krm0) null, false, false, (String) null, false, (String) null, false, false, jy80Var2, 1048575));
        }
        if (wx80Var instanceof ay80) {
            ay80 ay80Var = (ay80) wx80Var;
            return u890.j(ly80Var.r, ay80Var.a) ? Next.j() : Next.h(ly80.a(ly80Var, (String) null, false, false, false, (String) null, false, false, false, false, false, false, false, (krm0) null, false, false, (String) null, false, ay80Var.a, false, false, (jy80) null, 1966079));
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0202  */
    private final Next f(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        te30 te30Var;
        vra0 vra0Var = (vra0) obj;
        tq80 tq80Var = (tq80) obj2;
        vra0Var.getClass();
        lra0 lra0Var = (sra0) tq80Var.a;
        mr4 mr4Var = ((mta0) this.b).d;
        boolean zX = mr4Var.x();
        boolean zK = q1o1.k(mr4Var);
        tqw tqwVar = tq80Var.b;
        boolean z3 = vra0Var.h;
        String str = vra0Var.j;
        rq2 rq2Var = vra0Var.a;
        String str2 = vra0Var.g;
        String str3 = vra0Var.d;
        String str4 = vra0Var.e;
        if (lra0Var.equals(mra0.a)) {
            return ihc1.y0(str4) ? Next.a(Collections.singleton(isa0.a)) : Next.j();
        }
        boolean z4 = lra0Var instanceof lra0;
        lsa0 lsa0Var = yra0.a;
        if (z4) {
            return lra0Var.a ? Next.i(vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, (String) null, 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8189), Collections.singleton(lsa0Var)) : Next.j();
        }
        boolean z5 = lra0Var instanceof nra0;
        xra0 xra0Var = xra0.a;
        if (z5) {
            tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
            vra0 vra0VarA = vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, "", 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8173);
            xj61 xj61Var = new xj61();
            xj61Var.add(new gsa0(384, ((nra0) lra0Var).a, str3, vra0Var.i, vra0Var.j, (String) null, vra0Var.a, tv80VarY, new uya1(2, zX && z3), false));
            xj61Var.add(lsa0Var);
            xj61Var.add(new jsa0(str3, ""));
            if (str2 != null) {
                xj61Var.add(xra0Var);
            }
            return Next.i(vra0VarA, cwl1.j(xj61Var));
        }
        if (lra0Var instanceof kra0) {
            vra0 vra0VarA2 = vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, "", 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8173);
            xj61 xj61Var2 = new xj61();
            xj61Var2.add(new gsa0(16, ((kra0) lra0Var).a.e, str3, vra0Var.i, vra0Var.j, "suggested_prompt", vra0Var.a, (tv80) null, new uya1(2, zX && z3), str2 == null));
            xj61Var2.add(lsa0Var);
            xj61Var2.add(new jsa0(str3, ""));
            if (str2 != null) {
                xj61Var2.add(xra0Var);
            }
            return Next.i(vra0VarA2, cwl1.j(xj61Var2));
        }
        boolean z6 = lra0Var instanceof gra0;
        rq2 rq2Var2 = rq2.e;
        if (z6) {
            vra0 vra0VarA3 = vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, (String) null, 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8189);
            if (ihc1.y0(str4)) {
                c380 c380Var = vra0Var.c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : c380Var) {
                    iys0 iys0Var = (iys0) obj3;
                    if (iys0Var.f == null && !iys0Var.j && !ihc1.y0(iys0Var.e)) {
                        arrayList2.add(obj3);
                    }
                }
                arrayList = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((iys0) it.next()).e);
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
            } else {
                arrayList = null;
            }
            c380<zs80> c380Var2 = vra0Var.k;
            if (!ihc1.y0(str4) || c380Var2.isEmpty()) {
                te30Var = null;
            } else {
                ArrayList arrayList3 = new ArrayList(q7h.U(c380Var2, 10));
                for (zs80 zs80Var : c380Var2) {
                    String str5 = zs80Var.a;
                    String str6 = zs80Var.b;
                    c380<iys0> c380Var3 = zs80Var.c;
                    ArrayList arrayList4 = new ArrayList(q7h.U(c380Var3, 10));
                    for (iys0 iys0Var2 : c380Var3) {
                        arrayList4.add(new irr0(iys0Var2.e, iys0Var2.g, iys0Var2.k, iys0Var2.h));
                    }
                    arrayList3.add(new qqr0(str5, str6, arrayList4));
                }
                te30Var = new te30(arrayList3);
            }
            boolean z7 = str2 == null;
            rq2Var.getClass();
            return Next.i(vra0VarA3, f46.S0(new lsa0[]{new fsa0(arrayList, te30Var, z7, rq2Var == rq2Var2 ? "spotify:internal:npv-mini-chat" : str), lsa0Var, new jsa0(str3, str4)}));
        }
        if (lra0Var instanceof zqa0) {
            vra0 vra0VarA4 = vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, (String) null, 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8189);
            rq2Var.getClass();
            return Next.i(vra0VarA4, f46.S0(new lsa0[]{new fsa0((ArrayList) null, (te30) null, false, rq2Var == rq2Var2 ? "spotify:internal:npv-mini-chat" : str), lsa0Var, new jsa0(str3, str4)}));
        }
        if (lra0Var instanceof ara0) {
            return Next.i(vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, "", 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8173), f46.S0(new lsa0[]{lsa0Var, new jsa0(str3, str4)}));
        }
        if (lra0Var instanceof ora0) {
            return Next.h(vra0.a(vra0Var, (rq2) null, false, mqo1.A(((ora0) lra0Var).a), (String) null, (String) null, 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8187));
        }
        if (lra0Var instanceof hra0) {
            return Next.h(vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, (String) null, 0, (String) null, false, (String) null, (String) null, mqo1.A(((hra0) lra0Var).a), (lpu) null, false, 7167));
        }
        if (lra0Var instanceof dra0) {
            return Next.h(vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, (String) null, 0, (String) null, false, (String) null, (String) null, (c380) null, ((dra0) lra0Var).a, false, 6143));
        }
        if (lra0Var instanceof cra0) {
            return vra0Var.l.a ? Next.a(Collections.singleton(zra0.a)) : Next.i(vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, (String) null, 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8189), f46.S0(new lsa0[]{new esa0(((cra0) lra0Var).a), lsa0Var}));
        }
        if (lra0Var instanceof bra0) {
            return (((bra0) lra0Var).a && vra0Var.b) ? Next.i(vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, (String) null, 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8189), f46.S0(new lsa0[]{lsa0Var, new jsa0(str3, str4)})) : Next.j();
        }
        if (lra0Var instanceof era0) {
            return Next.h(vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, ((era0) lra0Var).a, 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8175));
        }
        if (lra0Var instanceof fra0) {
            return Next.h(vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, ((fra0) lra0Var).a, 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8175));
        }
        if (lra0Var instanceof pra0) {
            return Next.h(vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, (String) null, 0, (String) null, ((pra0) lra0Var).a, (String) null, (String) null, (c380) null, (lpu) null, false, 8063));
        }
        if (lra0Var instanceof qra0) {
            boolean z8 = zX && ((qra0) lra0Var).a;
            return Next.i(vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, (String) null, 0, (String) null, z8, (String) null, (String) null, (c380) null, (lpu) null, false, 8063), Collections.singleton(new ksa0(z8)));
        }
        if (lra0Var instanceof ira0) {
            return Next.j();
        }
        if (lra0Var instanceof jra0) {
            if (str2 == null) {
                return Next.j();
            }
            fg91 fg91Var = fg91.b;
            vra0 vra0VarA5 = vra0.a(vra0.a(vra0Var, (rq2) null, false, fg91Var, (String) null, (String) null, 0, (String) null, false, (String) null, (String) null, fg91Var, (lpu) null, false, 7163), (rq2) null, false, (c380) null, (String) null, (String) null, 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8127);
            xj61 xj61Var3 = new xj61();
            xj61Var3.add(new hsa0(str));
            if (!zK) {
                xj61Var3.add(new bsa0(rq2Var, vra0Var.i, vra0Var.m));
            }
            return Next.i(vra0VarA5, cwl1.j(xj61Var3));
        }
        if (!(lra0Var instanceof rra0)) {
            eg.o();
            return null;
        }
        rra0 rra0Var = (rra0) lra0Var;
        String string = ihc1.e1(rra0Var.a).toString();
        if (ihc1.y0(string)) {
            return Next.j();
        }
        vra0 vra0VarA6 = vra0.a(vra0Var, (rq2) null, false, (c380) null, (String) null, "", 0, (String) null, false, (String) null, (String) null, (c380) null, (lpu) null, false, 8173);
        xj61 xj61Var4 = new xj61();
        rq2 rq2Var3 = vra0Var.a;
        if (zX && rra0Var.b) {
            z = true;
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        xj61Var4.add(new gsa0(272, string, str3, vra0Var.i, vra0Var.j, "voice", rq2Var3, (tv80) null, new uya1(z, z2), false));
        xj61Var4.add(lsa0Var);
        xj61Var4.add(new jsa0(str3, ""));
        if (str2 != null) {
            xj61Var4.add(xra0Var);
        }
        return Next.i(vra0VarA6, cwl1.j(xj61Var4));
    }

    private final Next g(Object obj, Object obj2) {
        boolean z;
        sxc0 sxc0Var = (sxc0) obj;
        etc0 etc0Var = (htc0) obj2;
        sxc0Var.getClass();
        etc0Var.getClass();
        xu30 xu30Var = (xu30) this.b;
        int i = sxc0Var.d;
        un90 un90Var = sxc0Var.c;
        oqz0 oqz0Var = sxc0Var.b;
        bqq0 bqq0Var = sxc0Var.a;
        if (etc0Var instanceof etc0) {
            fqq0 fqq0Var = etc0Var.a;
            if (ryo1.w(bqq0Var, fqq0Var)) {
                return Next.j();
            }
            as3 as3Var = bqq0Var.b;
            boolean z2 = bqq0Var.h;
            fqq0 fqq0VarA = fqq0.a(fqq0Var, as3Var, null, null, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_NON_DIRECT_BUFFER);
            if (fqq0Var.g != null) {
                fqq0VarA = fqq0.a(fqq0VarA, null, bqq0Var.g, null, 447);
            }
            Boolean bool = fqq0Var.h;
            if (bool != null && bool.equals(Boolean.valueOf(z2))) {
                fqq0VarA = fqq0.a(fqq0VarA, null, null, Boolean.valueOf(z2), 383);
            }
            if (ryo1.w(bqq0Var, fqq0VarA)) {
                bqq0 bqq0VarP = ryo1.p(bqq0Var, fqq0Var);
                un90 un90Var2 = un90Var;
                while (un90Var2 instanceof qn90) {
                    un90Var2 = ((qn90) un90Var2).a;
                }
                return Next.i(sxc0.a(sxc0Var, bqq0VarP, (oqz0) null, new qn90(un90Var2), (ln01) null, (List) null, (List) null, 250), Effects.a(new woc0[]{new woc0(oqz0Var.c, un90Var)}));
            }
            bqq0 bqq0VarP2 = ryo1.p(bqq0Var, fqq0Var);
            oqz0 oqz0VarA = oqz0.a(oqz0Var, (tr80) null, yoi1.Q(0, i), oqz0Var.c + 1, 1);
            while (un90Var instanceof qn90) {
                un90Var = ((qn90) un90Var).a;
            }
            sxc0 sxc0VarA = sxc0.a(sxc0Var, bqq0VarP2, oqz0VarA, new qn90(un90Var), (ln01) null, (List) null, (List) null, 248);
            jf20 jf20Var = fqq0Var.c;
            return Next.i(sxc0VarA, Effects.a(new voc0[]{ryo1.v(sxc0VarA, jf20Var != null ? jf20Var.b : null)}));
        }
        if (etc0Var instanceof atc0) {
            atc0 atc0Var = (atc0) etc0Var;
            int i2 = atc0Var.a;
            List list = atc0Var.b;
            if (oqz0Var.c != i2) {
                return Next.j();
            }
            List listE = lwc0.e(bqq0Var.d, list);
            if (!listE.equals(bqq0Var.d)) {
                return Next.a(Effects.a(new yoc0[]{new yoc0(new fqq0(null, null, new jf20(listE, list), null, null, null, null, null, null, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_NEGATIVE_SEGMENT_COUNT))}));
            }
            on90 on90Var = new on90(i2, list);
            return u890.j(un90Var, on90Var) ? Next.j() : Next.h(sxc0.a(sxc0Var, (bqq0) null, (oqz0) null, on90Var, (ln01) null, (List) null, (List) null, 251));
        }
        if (etc0Var instanceof ctc0) {
            ctc0 ctc0Var = (ctc0) etc0Var;
            return oqz0Var.c != ctc0Var.a ? Next.j() : Next.h(sxc0.a(sxc0Var, (bqq0) null, (oqz0) null, ctc0Var.b, (ln01) null, (List) null, (List) null, 251));
        }
        if (etc0Var instanceof btc0) {
            btc0 btc0Var = (btc0) etc0Var;
            int i3 = btc0Var.a;
            b8e0 b8e0Var = btc0Var.b;
            if (oqz0Var.c != i3) {
                return Next.j();
            }
            List list2 = bqq0Var.d;
            List listE2 = lwc0.e(list2, b8e0Var.getFilters());
            if (b8e0Var.b() && (un90Var instanceof b8e0) && (((z = un90Var instanceof nn90)) || !((b8e0) un90Var).b())) {
                int count = ((b8e0) un90Var).getCount();
                if ((!z || count > b8e0Var.getCount()) && (count != b8e0Var.getCount() || !listE2.equals(list2))) {
                    return Next.j();
                }
            }
            if (!listE2.equals(list2)) {
                return Next.a(Effects.a(new yoc0[]{new yoc0(new fqq0(null, null, new jf20(listE2, b8e0Var.getFilters()), null, null, null, null, null, null, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_NEGATIVE_SEGMENT_COUNT))}));
            }
            un90 un90Var3 = (un90) xu30Var.invoke(sxc0Var, Integer.valueOf(i3), b8e0Var);
            if (u890.j(un90Var3, un90Var)) {
                return Next.j();
            }
            sxc0 sxc0VarA2 = sxc0.a(sxc0Var, (bqq0) null, (oqz0) null, un90Var3, (ln01) null, (List) null, (List) null, 251);
            xoc0 xoc0VarD = lwc0.d(sxc0VarA2);
            return xoc0VarD.a.isEmpty() ? Next.h(sxc0VarA2) : Next.i(sxc0VarA2, Collections.singleton(xoc0VarD));
        }
        if (etc0Var instanceof ftc0) {
            List list3 = ((ftc0) etc0Var).a;
            if (bqq0Var.e instanceof kml) {
                ln01 ln01Var = sxc0Var.f;
                if (!(ln01Var instanceof kn01) && (!(ln01Var instanceof ln01) || !u890.j(ln01Var.a, list3))) {
                    sxc0 sxc0VarA3 = sxc0.a(sxc0Var, (bqq0) null, (oqz0) null, (un90) null, new ln01(list3), (List) null, (List) null, 223);
                    String str = bqq0Var.e.a;
                    if (str != null && str.length() != 0) {
                        return Next.h(sxc0VarA3);
                    }
                    if (list3.isEmpty()) {
                        return Next.h(sxc0.a(sxc0VarA3, (bqq0) null, (oqz0) null, new on90(-1, z6x.a), (ln01) null, (List) null, (List) null, 251));
                    }
                    while (un90Var instanceof qn90) {
                        un90Var = ((qn90) un90Var).a;
                    }
                    return Next.i(sxc0.a(sxc0VarA3, (bqq0) null, (oqz0) null, new qn90(un90Var), (ln01) null, (List) null, (List) null, 251), Effects.a(new voc0[]{ryo1.v(sxc0VarA3, (List) null)}));
                }
            }
            return Next.j();
        }
        if (etc0Var instanceof gtc0) {
            tr80 tr80Var = ((gtc0) etc0Var).a;
            if (u890.j(oqz0Var.a, tr80Var)) {
                return Next.j();
            }
            sxc0 sxc0VarA4 = sxc0.a(sxc0Var, (bqq0) null, oqz0.a(oqz0Var, tr80Var, (tr80) null, 0, 6), (un90) null, (ln01) null, (List) null, (List) null, 253);
            xoc0 xoc0VarD2 = lwc0.d(sxc0VarA4);
            return xoc0VarD2.a.isEmpty() ? Next.h(sxc0VarA4) : Next.i(sxc0VarA4, Collections.singleton(xoc0VarD2));
        }
        if (etc0Var instanceof dtc0) {
            tr80 tr80Var2 = ((dtc0) etc0Var).a;
            if (tr80Var2.isEmpty()) {
                return Next.j();
            }
            tr80 tr80VarC = lwc0.c(i, un90Var instanceof b8e0 ? ((b8e0) un90Var).h() : 0, tr80Var2);
            tr80 tr80Var3 = oqz0Var.b;
            if (u890.j(tr80Var3, tr80VarC)) {
                return Next.j();
            }
            if (!tr80Var3.isEmpty() && tr80Var3.c(((rr80) tr80VarC).a) && tr80Var3.c(((rr80) tr80VarC).b)) {
                return Next.j();
            }
            sxc0 sxc0VarA5 = sxc0.a(sxc0Var, (bqq0) null, oqz0.a(oqz0Var, (tr80) null, tr80VarC, 0, 5), (un90) null, (ln01) null, (List) null, (List) null, 253);
            return Next.i(sxc0VarA5, Effects.a(new voc0[]{ryo1.v(sxc0VarA5, (List) null)}));
        }
        if (!(etc0Var instanceof ysc0)) {
            if (etc0Var instanceof zsc0) {
                zsc0 zsc0Var = (zsc0) etc0Var;
                return (u890.j(sxc0Var.g, zsc0Var.a) && u890.j(sxc0Var.h, zsc0Var.b)) ? Next.j() : Next.h(sxc0.a(sxc0Var, (bqq0) null, (oqz0) null, (un90) null, (ln01) null, zsc0Var.a, zsc0Var.b, 63));
            }
            eg.o();
            return null;
        }
        tnl tnlVar = ((ysc0) etc0Var).a;
        mml mmlVar = bqq0Var.e;
        boolean z3 = mmlVar instanceof lml;
        if (z3 && (tnlVar instanceof tnl)) {
            lml lmlVar = (lml) mmlVar;
            String str2 = tnlVar.a;
            if (str2 == null) {
                str2 = "";
            }
            lml lmlVar2 = new lml(lmlVar.a, str2);
            return !mmlVar.equals(lmlVar2) ? Next.h(sxc0.a(sxc0Var, bqq0.a(bqq0Var, (as3) null, (dia1) null, lmlVar2, 495), (oqz0) null, (un90) null, (ln01) null, (List) null, (List) null, 254)) : Next.j();
        }
        if (z3 && (tnlVar instanceof qnl)) {
            return Next.h(sxc0.a(sxc0Var, bqq0.a(bqq0Var, (as3) null, (dia1) null, jml.a, 495), (oqz0) null, (un90) null, (ln01) null, (List) null, (List) null, 254));
        }
        if (!(mmlVar instanceof iml) || !(tnlVar instanceof rnl)) {
            return Next.j();
        }
        iml imlVar = (iml) mmlVar;
        iml imlVar2 = new iml(imlVar.a, ((rnl) tnlVar).a, imlVar.c);
        return !mmlVar.equals(imlVar2) ? Next.h(sxc0.a(sxc0Var, bqq0.a(bqq0Var, (as3) null, (dia1) null, imlVar2, 495), (oqz0) null, (un90) null, (ln01) null, (List) null, (List) null, 254)) : Next.j();
    }

    private final Next h(Object obj, Object obj2) {
        tv80 tv80VarY;
        yad0 yad0Var = (yad0) obj;
        tq80 tq80Var = (tq80) obj2;
        yad0Var.getClass();
        tq80Var.getClass();
        String str = ((cbd0) this.b).d;
        Map map = yad0Var.a;
        Map map2 = yad0Var.b;
        tad0 tad0Var = (vad0) tq80Var.a;
        if (tad0Var instanceof sad0) {
            ArrayList arrayList = ((sad0) tad0Var).a;
            int iS = zno1.s(q7h.U(arrayList, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj3 : arrayList) {
                linkedHashMap.put(((zad0) obj3).a, obj3);
            }
            LinkedHashMap linkedHashMapO = sqg0.O(map2, linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMapO.entrySet()) {
                if (map.keySet().contains((String) entry.getKey())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap2.equals(map2)) {
                return Next.j();
            }
            yad0 yad0VarA = yad0.a(yad0Var, (LinkedHashMap) null, linkedHashMap2, (rad0) null, 5);
            return Next.i(yad0VarA, Collections.singleton(new hbw(yad0VarA)));
        }
        if (tad0Var instanceof tad0) {
            return Next.h(yad0.a(yad0Var, (LinkedHashMap) null, (Map) null, tad0Var.a, 3));
        }
        if (!(tad0Var instanceof uad0)) {
            eg.o();
            return null;
        }
        try {
            tqw tqwVar = tq80Var.b;
            tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        } catch (IllegalStateException e) {
            Logger.d(l1d.m("BUZZ: ListeningActivityButton clicked but interactionResult is invalid: ", e.getMessage()), new Object[0]);
            tv80VarY = null;
        }
        if (tv80VarY == null) {
            return Next.j();
        }
        had0 had0Var = yad0Var.c;
        if (had0Var instanceof had0) {
            String str2 = (String) o7h.r0(map.keySet());
            if (str2 == null) {
                return Next.j();
            }
            had0 had0Var2 = had0Var;
            String str3 = had0Var2.c;
            if (str3 == null) {
                return Next.j();
            }
            return Next.a(Collections.singleton(new ndw(had0Var2.a, str2, str3, had0Var2.d, null, tv80VarY, had0Var2.e)));
        }
        if (had0Var instanceof pad0) {
            pad0 pad0Var = (pad0) had0Var;
            return Next.a(Collections.singleton(new ndw(pad0Var.C(), pad0Var.getUsername(), pad0Var.getEntityUri(), pad0Var.getContextUri(), str, tv80VarY, pad0Var.i())));
        }
        if ((had0Var instanceof nad0) || (had0Var instanceof jad0) || (had0Var instanceof kad0)) {
            return Next.a(Collections.singleton(new cdw(str, tv80VarY)));
        }
        if (had0Var instanceof iad0) {
            return Next.j();
        }
        eg.o();
        return null;
    }

    private final Next i(Object obj, Object obj2) {
        nee0 nee0Var = (nee0) obj;
        tq80 tq80Var = (tq80) obj2;
        mee0 mee0Var = (mee0) tq80Var.a;
        boolean zJ = u890.j(mee0Var, lee0.e);
        fee0 fee0Var = fee0.a;
        if (zJ) {
            return Next.a(Collections.singleton(fee0Var));
        }
        if (u890.j(mee0Var, lee0.f)) {
            nee0Var.getClass();
            return Next.h(nee0.a(nee0Var, true, 0, 5));
        }
        if (u890.j(mee0Var, lee0.d)) {
            nee0Var.getClass();
            return Next.h(nee0.a(nee0Var, false, 0, 5));
        }
        if (u890.j(mee0Var, lee0.b)) {
            nee0Var.getClass();
            return Next.i(nee0.a(nee0Var, false, 2, 3), Collections.singleton(iee0.a));
        }
        if (u890.j(mee0Var, lee0.a)) {
            see0 see0Var = (see0) this.b;
            boolean zC0 = ag0.C0(see0Var.a, see0Var.h);
            nee0Var.getClass();
            return Next.h(nee0.a(nee0Var, !zC0, zC0 ? 1 : 3, 1));
        }
        if (mee0Var instanceof kee0) {
            return Next.a(Collections.singleton(new hee0(tq80Var.b)));
        }
        if (!u890.j(mee0Var, lee0.c)) {
            eg.o();
            return null;
        }
        nee0Var.getClass();
        nee0 nee0VarA = nee0.a(nee0Var, false, 0, 5);
        xj61 xj61Var = new xj61();
        if (nee0Var.c == 3) {
            xj61Var.add(gee0.a);
        } else {
            xj61Var.add(fee0Var);
        }
        return Next.i(nee0VarA, cwl1.j(xj61Var));
    }

    private final Next j(Object obj, Object obj2) {
        mrm0 mrm0Var = (mrm0) obj;
        hrm0 hrm0Var = (jrm0) obj2;
        wrm0 wrm0Var = (wrm0) this.b;
        mrm0Var.getClass();
        krm0 krm0Var = mrm0Var.a;
        hrm0Var.getClass();
        if (hrm0Var.equals(irm0.a)) {
            return Next.a(Collections.singleton(prm0.a));
        }
        boolean z = hrm0Var instanceof hrm0;
        krm0 krm0Var2 = krm0.b;
        lrm0 lrm0Var = lrm0.a;
        if (z) {
            return hrm0Var.a ? Next.h(new mrm0(krm0Var2, lrm0Var)) : Next.h(new mrm0(krm0Var, lrm0.b));
        }
        if (hrm0Var.equals(grm0.a)) {
            return Next.h(new mrm0(krm0Var, lrm0.c));
        }
        boolean z2 = hrm0Var instanceof frm0;
        krm0 krm0Var3 = krm0.a;
        if (z2) {
            boolean z3 = ((frm0) hrm0Var).a;
            if (!z3) {
                krm0Var2 = krm0Var3;
            }
            return Next.i(new mrm0(krm0Var2, lrm0Var), (z3 || wrm0Var.Q0 == null) ? w7x.a : Collections.singleton(qrm0.a));
        }
        if (hrm0Var.equals(erm0.a)) {
            return Next.h(new mrm0(krm0Var3, lrm0Var));
        }
        eg.o();
        return null;
    }

    private final Next k(Object obj, Object obj2) {
        km90 km90Var = (km90) this.b;
        ob31 ob31Var = (pb31) obj;
        jb31 jb31Var = (jb31) obj2;
        boolean z = ob31Var instanceof kb31;
        vbe qb31Var = rb31.e;
        if (z) {
            kb31 kb31Var = (kb31) ob31Var;
            String str = kb31Var.a;
            if (jb31Var instanceof fb31) {
                return c(this, ((fb31) jb31Var).a, kb31Var.c, str, !kb31Var.b, false, false, 48);
            }
            if (jb31Var instanceof ib31) {
                ib31 ib31Var = (ib31) jb31Var;
                ega1 ega1Var = ib31Var.a;
                int i = ib31Var.b;
                mb31 mb31Var = new mb31(str, qb31Var, ega1Var, km90Var, false, i == 1, i == 2);
                xj61 xj61Var = new xj61();
                xj61Var.add(new wa31(ega1Var, km90Var));
                if (str.length() > 0) {
                    xj61Var.add(new za31(ega1Var, str, i));
                }
                return Next.i(mb31Var, cwl1.j(xj61Var));
            }
            if (jb31Var instanceof eb31) {
                String str2 = ((eb31) jb31Var).a;
                if (str2 != null) {
                    qb31Var = new qb31(str2);
                }
                return Next.h(kb31.f(kb31Var, null, qb31Var, 1));
            }
            if (jb31Var instanceof gb31) {
                String str3 = ((gb31) jb31Var).a;
                return Next.i(kb31.f(kb31Var, str3, null, 6), Collections.singleton(new ya31(str3)));
            }
            if (jb31Var instanceof hb31) {
                return Next.j();
            }
            if (jb31Var instanceof bb31) {
                return Next.j();
            }
            tw20.v("Got unexpected ", kb31Var, " and ", jb31Var, " combination");
            return null;
        }
        if (ob31Var instanceof ob31) {
            ob31 ob31Var2 = ob31Var;
            if (jb31Var instanceof fb31) {
                return (ob31Var2.a() || ob31Var2.e()) ? b(ob31Var2, ob31Var2.d(), ((fb31) jb31Var).a) : d(((fb31) jb31Var).a, ob31Var2, ob31Var2.c(), ob31Var2.b(), 0);
            }
            if (jb31Var instanceof ib31) {
                ib31 ib31Var2 = (ib31) jb31Var;
                return d(n(ob31Var2.d(), ib31Var2), ob31Var2, ob31Var2.c(), qb31Var, ib31Var2.b);
            }
            if (jb31Var instanceof db31) {
                db31 db31Var = (db31) jb31Var;
                boolean z2 = ob31Var2 instanceof mb31;
                return Next.i(new lb31(ob31Var2.getUsername(), ob31Var2.b(), db31Var.a, ega1.a(db31Var.b, null, null, ob31Var2.d().c, 3), db31Var.c, db31Var.d, z2 && ((mb31) ob31Var2).e, ob31Var2.a(), ob31Var2.e(), 64), (z2 && ((mb31) ob31Var2).e) ? Collections.singleton(xa31.a) : w7x.a);
            }
            if ((jb31Var instanceof gb31) || (jb31Var instanceof eb31)) {
                return Next.j();
            }
            if (jb31Var instanceof hb31) {
                return Next.j();
            }
            if (jb31Var instanceof bb31) {
                return Next.h(new lb31(ob31Var2.getUsername(), ob31Var2.b(), (List) z6x.a, ob31Var2.d(), false, ob31Var2.c(), false, ob31Var2.a(), ob31Var2.e(), 208));
            }
            tw20.v("Got unexpected ", ob31Var2, " and ", jb31Var, " combination");
            return null;
        }
        if (!(ob31Var instanceof lb31)) {
            eg.o();
            return null;
        }
        lb31 lb31Var = (lb31) ob31Var;
        boolean z3 = lb31Var.e;
        ega1 ega1Var2 = lb31Var.d;
        km90 km90Var2 = lb31Var.f;
        km90 km90Var3 = lb31Var.g;
        if (jb31Var instanceof fb31) {
            if (lb31Var.a() || lb31Var.e()) {
                return b(lb31Var, ega1Var2, ((fb31) jb31Var).a);
            }
            ega1 ega1Var3 = ((fb31) jb31Var).a;
            if (km90Var3 != null) {
                km90Var2 = km90Var3;
            }
            return d(ega1Var3, lb31Var, km90Var2, lb31Var.b(), 0);
        }
        if (jb31Var instanceof ib31) {
            ib31 ib31Var3 = (ib31) jb31Var;
            ega1 ega1VarN = n(ega1Var2, ib31Var3);
            if (km90Var3 != null) {
                km90Var2 = km90Var3;
            }
            return d(ega1VarN, lb31Var, km90Var2, qb31Var, ib31Var3.b);
        }
        boolean z4 = jb31Var instanceof hb31;
        im90 im90Var = im90.a;
        if (z4) {
            return (km90Var3 == null && !u890.j(km90Var2, im90Var) && z3) ? Next.i(lb31.f(lb31Var, null, null, im90Var, 959), Collections.singleton(new wa31(ega1Var2, im90Var))) : Next.j();
        }
        boolean z5 = jb31Var instanceof cb31;
        l620 l620Var = l620.a;
        if (z5) {
            ega1 ega1VarA = ega1.a(ega1Var2, null, l620Var, null, 5);
            if (km90Var3 != null) {
                km90Var2 = km90Var3;
            }
            return d(ega1VarA, lb31Var, km90Var2, qb31Var, 2);
        }
        if (jb31Var instanceof db31) {
            db31 db31Var2 = (db31) jb31Var;
            List list = db31Var2.a;
            if (list.equals(lb31Var.c) && db31Var2.c == z3 && u890.j(db31Var2.d, km90Var2) && km90Var3 == null) {
                return Next.j();
            }
            String str4 = lb31Var.a;
            boolean z6 = lb31Var.h;
            if (z6) {
                qb31Var = lb31Var.b;
            }
            return Next.h(new lb31(str4, qb31Var, list, lb31Var.d, db31Var2.c, db31Var2.d, z6, lb31Var.i, lb31Var.j, 64));
        }
        if (jb31Var instanceof bb31) {
            return km90Var3 != null ? Next.h(lb31.f(lb31Var, null, null, null, 959)) : Next.j();
        }
        if (!(jb31Var instanceof eb31)) {
            if (jb31Var instanceof gb31) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (!lb31Var.h) {
            return Next.j();
        }
        String str5 = ((eb31) jb31Var).a;
        if (str5 != null && (ega1Var2.b != l620Var || !u890.j(km90Var2, im90Var))) {
            return c(this, lb31Var.d, new qb31(str5), lb31Var.a, false, lb31Var.i, lb31Var.j, 8);
        }
        if (str5 != null) {
            qb31Var = new qb31(str5);
        }
        return Next.h(lb31.f(lb31Var, qb31Var, null, null, 893));
    }

    private final Next l(Object obj, Object obj2) {
        tr80 tr80VarQ;
        s280 s280Var;
        s280 s280Var2;
        wz81 wz81Var = (yz81) obj;
        tz81 tz81Var = (uz81) obj2;
        a0z0 a0z0Var = (a0z0) this.b;
        cc9 cc9Var = (cc9) a0z0Var.j;
        boolean z = tz81Var instanceof tz81;
        Set setG = w7x.a;
        s280 lkk1Var = null;
        if (!z) {
            boolean z2 = tz81Var instanceof sz81;
            List listF = z6x.a;
            if (!z2) {
                if (tz81Var instanceof qz81) {
                    return Next.h(new pz81(((qz81) tz81Var).a));
                }
                if (!(tz81Var instanceof rz81)) {
                    eg.o();
                    return null;
                }
                wz81Var.getClass();
                rz81 rz81Var = (rz81) tz81Var;
                Function0 function0 = rz81Var.d;
                if (wz81Var instanceof pz81) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return Next.j();
                }
                if (wz81Var instanceof xz81) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return Next.j();
                }
                if (!(wz81Var instanceof wz81)) {
                    eg.o();
                    return null;
                }
                try {
                    wz81 wz81VarB = a0z0Var.b(wz81Var, rz81Var.a, rz81Var.b, rz81Var.c);
                    if (function0 != null) {
                        function0.invoke();
                    }
                    if (!wz81VarB.f.isEmpty()) {
                        s280 s280Var3 = wz81VarB.g;
                        lkk1Var = s280Var3.isEmpty() ? null : s280Var3;
                        if (lkk1Var != null) {
                            int i = ((rr80) lkk1Var).a;
                            listF = a0z0Var.f(wz81VarB, l1d.f(((rr80) lkk1Var).b, i, 2, i));
                        }
                    }
                    return Next.i(wz81VarB, a0z0Var.g(listF, wz81VarB));
                } catch (Throwable th) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                    throw th;
                }
            }
            sz81 sz81Var = (sz81) tz81Var;
            wz81Var.getClass();
            if (!(wz81Var instanceof wz81)) {
                if (wz81Var instanceof xz81) {
                    return Next.j();
                }
                if (wz81Var instanceof pz81) {
                    return Next.j();
                }
                eg.o();
                return null;
            }
            int i2 = sz81Var.a;
            wz81 wz81Var2 = wz81Var;
            tr80 tr80Var = wz81Var2.g;
            if (i2 != wz81Var2.d) {
                return Next.j();
            }
            List list = sz81Var.b;
            List list2 = wz81Var2.c;
            Map map = wz81Var2.k;
            q8n q8nVar = zz81.a;
            if (!list2.isEmpty() && !list.isEmpty()) {
                lkk1Var = new lkk1(zz81.d(list2, o7h.q0(list), map), zz81.d(list2, o7h.A0(list), map));
            }
            if (lkk1Var != null) {
                if (!wz81Var2.f.isEmpty()) {
                    int i3 = lkk1Var.a;
                    listF = a0z0Var.f(wz81Var2, l1d.f(lkk1Var.b, i3, 2, i3));
                }
                setG = a0z0Var.g(listF, wz81Var2);
            }
            int i4 = cc9Var.a;
            if (lkk1Var == null) {
                tr80VarQ = yoi1.Q(-i4, i4);
            } else {
                int i5 = (lkk1Var.b + lkk1Var.a) / 2;
                int i6 = ((rr80) tr80Var).a;
                int i7 = cc9Var.b;
                tr80VarQ = (i6 + i7 >= i5 || ((rr80) tr80Var).b - i7 <= i5) ? yoi1.Q(i5 - i4, i5 + i4) : tr80Var;
            }
            if (u890.j(tr80VarQ, tr80Var)) {
                return setG.isEmpty() ? Next.j() : Next.a(setG);
            }
            wz81 wz81VarA = wz81.a(wz81Var2, (ioj0) null, (d0r) null, (List) null, 0, 0, (List) null, tr80VarQ, (List) null, (List) null, (Map) null, (LinkedHashMap) null, (s280) null, 8127);
            return Next.i(wz81VarA, dm61.y0(a0z0Var.e(wz81VarA), setG));
        }
        wz81Var.getClass();
        tz81 tz81Var2 = tz81Var;
        ioj0 ioj0Var = tz81Var2.b;
        List list3 = tz81Var2.a;
        d0r d0rVar = (d0r) a0z0Var.i;
        boolean z3 = wz81Var instanceof wz81;
        Map map2 = b7x.a;
        if (!z3) {
            if (!(wz81Var instanceof xz81)) {
                if (wz81Var instanceof pz81) {
                    return Next.j();
                }
                eg.o();
                return null;
            }
            mmr0 mmr0VarB = zz81.b(d0rVar);
            ioj0 ioj0Var2 = (ioj0) mmr0VarB.a;
            s280 s280Var4 = (d0r) mmr0VarB.b;
            mmr0 mmr0VarI = a0z0.i(new ioj0(), ioj0Var, ioj0Var2);
            ioj0 ioj0Var3 = (ioj0) mmr0VarI.a;
            ioj0 ioj0Var4 = (ioj0) mmr0VarI.b;
            s280 s280VarJ = a0z0.j(ioj0Var);
            lkk1Var = s280Var4 instanceof s280 ? s280Var4 : null;
            if (lkk1Var == null) {
                s280Var = s280Var4;
            } else if (s280VarJ == null) {
                s280Var = lkk1Var;
            } else {
                Map map3 = lkk1Var.a;
                if (map3 != null) {
                    map2 = map3;
                }
                s280Var4 = new s280(sqg0.O(s280VarJ.a, map2));
                s280Var = s280Var4;
            }
            vz81 vz81VarC = a0z0Var.c(list3, ioj0Var3, s280Var, false);
            List list4 = vz81VarC.a;
            int i8 = cc9Var.a;
            wz81 wz81Var3 = new wz81(ioj0Var4, s280Var, list3, 0, 0, list4, yoi1.Q(-i8, i8), vz81VarC.b, vz81VarC.c, vz81VarC.d, zz81.f(list3), false, s280VarJ);
            if (!list3.isEmpty()) {
                setG = a0z0Var.e(wz81Var3);
            }
            return Next.i(wz81Var3, setG);
        }
        wz81 wz81Var4 = wz81Var;
        ioj0 ioj0Var5 = wz81Var4.a;
        mmr0 mmr0VarB2 = zz81.b(d0rVar);
        ioj0 ioj0Var6 = (ioj0) mmr0VarB2.a;
        s280 s280Var5 = (d0r) mmr0VarB2.b;
        mmr0 mmr0VarI2 = a0z0.i(ioj0Var5, ioj0Var, ioj0Var6);
        ioj0 ioj0Var7 = (ioj0) mmr0VarI2.a;
        ioj0 ioj0Var8 = (ioj0) mmr0VarI2.b;
        s280 s280VarJ2 = a0z0.j(ioj0Var);
        s280 s280Var6 = wz81Var4.m;
        if (s280VarJ2 == null) {
            s280VarJ2 = s280Var6;
        } else if (s280Var6 != null) {
            Map map4 = s280VarJ2.a;
            if (map4 == null) {
                map4 = map2;
            }
            s280VarJ2 = new s280(sqg0.O(s280Var6.a, map4));
        }
        lkk1Var = s280Var5 instanceof s280 ? s280Var5 : null;
        if (lkk1Var == null) {
            s280Var2 = s280Var5;
        } else if (s280VarJ2 == null) {
            s280Var2 = lkk1Var;
        } else {
            Map map5 = lkk1Var.a;
            if (map5 != null) {
                map2 = map5;
            }
            s280Var5 = new s280(sqg0.O(s280VarJ2.a, map2));
            s280Var2 = s280Var5;
        }
        boolean zJ = u890.j(ioj0Var8, ioj0Var5);
        int i9 = wz81Var4.e;
        if (!zJ) {
            i9++;
        }
        int i10 = i9;
        vz81 vz81VarC2 = a0z0Var.c(list3, ioj0Var7, s280Var2, wz81Var4.l);
        List list5 = vz81VarC2.a;
        boolean zEquals = list5.equals(wz81Var4.f);
        int i11 = wz81Var4.d;
        if (!zEquals) {
            i11++;
        }
        wz81 wz81VarA2 = wz81.a(wz81Var4, ioj0Var8, s280Var2, list3, i11, i10, list5, (tr80) null, vz81VarC2.b, vz81VarC2.c, vz81VarC2.d, zz81.f(list3), s280VarJ2, 2112);
        return Next.i(wz81VarA2, a0z0Var.e(wz81VarA2));
    }

    private final Next m(Object obj, Object obj2) {
        tr80 tr80VarQ;
        jc91 jc91Var = (jc91) obj;
        fc91 fc91Var = (fc91) obj2;
        tgo1 tgo1Var = (tgo1) this.b;
        if (!(jc91Var instanceof hc91)) {
            if (!u890.j(jc91Var, ic91.a)) {
                eg.o();
                return null;
            }
            if (fc91Var instanceof ec91) {
                return Next.j();
            }
            if (fc91Var instanceof dc91) {
                List list = ((dc91) fc91Var).a;
                return Next.h(new hc91(list, o7h.d1(list, 10), yoi1.Q(-10, 10)));
            }
            eg.o();
            return null;
        }
        if (!(fc91Var instanceof ec91)) {
            if (fc91Var instanceof dc91) {
                List list2 = ((dc91) fc91Var).a;
                return Next.h(new hc91(list2, o7h.d1(list2, 10), yoi1.Q(-10, 10)));
            }
            eg.o();
            return null;
        }
        hc91 hc91Var = (hc91) jc91Var;
        tr80 tr80Var = hc91Var.c;
        List list3 = hc91Var.a;
        List list4 = ((ec91) fc91Var).a;
        if (list3.isEmpty() || list4.isEmpty()) {
            tr80VarQ = tr80.d;
        } else {
            Iterator it = list3.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (u890.j((String) it.next(), o7h.q0(list4))) {
                    break;
                }
                i++;
            }
            Iterator it2 = list3.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (u890.j((String) it2.next(), o7h.A0(list4))) {
                    break;
                }
                i2++;
            }
            if (i == -1 || i2 == -1) {
                tr80VarQ = tr80.d;
            } else {
                int i3 = (i2 + i) / 2;
                int i4 = ((rr80) tr80Var).a;
                byte b = tgo1Var.a;
                tr80VarQ = (i4 + b >= i3 || ((rr80) tr80Var).b - b <= i3) ? yoi1.Q(i3 - 10, i3 + 10) : tr80Var;
            }
        }
        if (u890.j(tr80VarQ, tr80Var)) {
            return Next.j();
        }
        return Next.h(new hc91(list3, o7h.Y0(list3, tr80VarQ.isEmpty() ? tr80.d : new tr80(yoi1.q(0, tr80VarQ), yoi1.q(((rr80) p7h.K(list3)).b, tr80VarQ), 1)), tr80VarQ));
    }

    public static ega1 n(ega1 ega1Var, ib31 ib31Var) {
        int i = ib31Var.b;
        ega1 ega1Var2 = ib31Var.a;
        int iC = l1d.C(i);
        if (iC == 0) {
            return ega1.a(ega1Var, ega1Var2.a, null, null, 6);
        }
        if (iC == 1) {
            return ega1.a(ega1Var, null, ega1Var2.b, null, 5);
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    public final Next a(Object obj, Object obj2) {
        String str;
        long j;
        boolean z = false;
        tv80 tv80Var = null;
        switch (this.a) {
            case 0:
                return (Next) ((eq7) this.b).invoke(obj, obj2);
            case 1:
                return (Next) ((pp5) this.b).invoke(obj, obj2);
            case 2:
                return ((drm1) this.b).b((mie) obj, (iie) obj2);
            case 3:
                ppe ppeVar = (ppe) obj;
                ppeVar.getClass();
                npe npeVar = (npe) ((tq80) obj2).a;
                String str2 = ((rqe) this.b).a.Q;
                vpe vpeVar = vpe.a;
                bqe bqeVar = spe.a;
                bqe bqeVar2 = upe.a;
                jre jreVar = ppeVar.a;
                if (jreVar instanceof gre) {
                    return Next.j();
                }
                if (npeVar.equals(gpe.a)) {
                    return Next.a(Collections.singleton(xpe.a));
                }
                if (npeVar instanceof ape) {
                    return Next.a(f46.S0(new bqe[]{new tpe(((ape) npeVar).a, str2, false), bqeVar2}));
                }
                if (npeVar instanceof dpe) {
                    dpe dpeVar = (dpe) npeVar;
                    return Next.a(f46.S0(new bqe[]{new tpe(dpeVar.a, str2, dpeVar.b), bqeVar2}));
                }
                if (npeVar instanceof fpe) {
                    return Next.a(Collections.singleton(new wpe(((fpe) npeVar).a, (uya1) null, "text", too1.q(jreVar))));
                }
                if (npeVar instanceof lpe) {
                    return Next.i(ppe.a(ppeVar, (ire) null, 15), Collections.singleton(aqe.a));
                }
                if (npeVar instanceof kpe) {
                    return Next.a(Collections.singleton(bqeVar));
                }
                if (npeVar instanceof mpe) {
                    mpe mpeVar = (mpe) npeVar;
                    String string = ihc1.e1(mpeVar.a).toString();
                    return string.length() == 0 ? Next.a(Collections.singleton(bqeVar)) : Next.a(f46.S0(new bqe[]{bqeVar, new wpe(string, new uya1(mpeVar.b, false), "voice", too1.q(jreVar))}));
                }
                if (npeVar instanceof epe) {
                    return Next.j();
                }
                if (npeVar instanceof bpe) {
                    return Next.a(Collections.singleton(ype.a));
                }
                if (npeVar instanceof hpe) {
                    return Next.a(Collections.singleton(zpe.a));
                }
                if (npeVar instanceof cpe) {
                    return Next.a(Collections.singleton(bqeVar2));
                }
                if (npeVar instanceof ipe) {
                    return Next.a(Collections.singleton(vpeVar));
                }
                if (npeVar instanceof jpe) {
                    return Next.a(Collections.singleton(vpeVar));
                }
                eg.o();
                return null;
            case 4:
                vif vifVar = (vif) obj;
                tq80 tq80Var = (tq80) obj2;
                String str3 = ((xif) this.b).g;
                mif mifVar = (uif) tq80Var.a;
                if (mifVar instanceof qif) {
                    vifVar.getClass();
                    return Next.h(vif.a(vifVar, 0, 0, ((qif) mifVar).a, 3));
                }
                if (u890.j(mifVar, iif.a)) {
                    return vifVar.c ? Next.h(vif.a(vifVar, 0, 3, false, 4)) : Next.i(vif.a(vifVar, 0, 0, false, 4), Effects.a(new b9w[]{new b9w(str3)}));
                }
                if (u890.j(mifVar, sif.a)) {
                    vifVar.getClass();
                    return Next.h(vif.a(vifVar, 0, 1, false, 4));
                }
                if (u890.j(mifVar, jif.a)) {
                    vifVar.getClass();
                    return Next.h(vif.a(vifVar, 0, 2, false, 4));
                }
                if (mifVar instanceof mif) {
                    vifVar.getClass();
                    return Next.i(vif.a(vifVar, 0, 0, false, 4), Effects.a(new l9w[]{new l9w(mifVar.b)}));
                }
                if (u890.j(mifVar, oif.a)) {
                    vifVar.getClass();
                    return Next.i(vif.a(vifVar, 0, 0, false, 4), Effects.a(new new[]{new new(str3)}));
                }
                if (u890.j(mifVar, kif.a)) {
                    vifVar.getClass();
                    return Next.i(vif.a(vifVar, 0, 0, false, 4), Effects.a(new b9w[]{new b9w(str3)}));
                }
                if (u890.j(mifVar, pif.a) || u890.j(mifVar, nif.a) || u890.j(mifVar, lif.a)) {
                    vifVar.getClass();
                    return Next.h(vif.a(vifVar, 0, 0, false, 4));
                }
                if (mifVar instanceof tif) {
                    vifVar.getClass();
                    return Next.h(vif.a(vifVar, ((tif) mifVar).a, 0, false, 6));
                }
                if (u890.j(mifVar, rif.a)) {
                    tqw tqwVar = tq80Var.b;
                    return Next.a(Effects.a(new ldw[]{new ldw(tqwVar != null ? n3o1.y(tqwVar) : null)}));
                }
                eg.o();
                return null;
            case 5:
                Object obj3 = (xog) obj;
                pog pogVar = (tog) obj2;
                if (pogVar instanceof oog) {
                    boolean z2 = ((oog) pogVar).a;
                    wog wogVar = obj3 instanceof wog ? (wog) obj3 : null;
                    return Next.a(Collections.singleton(new kog(z2, wogVar != null ? new jog(wogVar.f, wogVar.h, wogVar.i - wogVar.b, wogVar.g, wogVar.a, wogVar.k, wogVar.l) : null)));
                }
                if (pogVar instanceof rog) {
                    if (obj3 instanceof wog) {
                        wog wogVar2 = (wog) obj3;
                        return Next.a(Collections.singleton(new nog(new jog(wogVar2.f, wogVar2.h, wogVar2.i - wogVar2.b, wogVar2.g, wogVar2.a, wogVar2.k, wogVar2.l), wogVar2.c, wogVar2.d)));
                    }
                    eg.m("Check failed.");
                    return null;
                }
                if (pogVar instanceof qog) {
                    if (!(obj3 instanceof wog)) {
                        eg.m("Check failed.");
                        return null;
                    }
                    wog wogVar3 = (wog) obj3;
                    int i = wogVar3.f;
                    int i2 = ((qog) pogVar).a;
                    return i != i2 ? Next.h(wog.a(wogVar3, i2, null, 65503)) : Next.j();
                }
                if (pogVar instanceof sog) {
                    if (obj3 instanceof wog) {
                        return Next.h(wog.a((wog) obj3, 0, ((sog) pogVar).a, 63487));
                    }
                    eg.m("Check failed.");
                    return null;
                }
                if (!(pogVar instanceof pog)) {
                    eg.o();
                } else {
                    if (obj3 instanceof wog) {
                        yqg yqgVar = (yqg) this.b;
                        xj61 xj61Var = new xj61();
                        pog pogVar2 = pogVar;
                        e8g1 e8g1Var = pogVar2.a;
                        wog wogVar4 = (wog) obj3;
                        xj61Var.add(new mog(e8g1Var, wogVar4.g, wogVar4.a, pogVar2.c, (int) (yqgVar.b() - wogVar4.h), wogVar4.j, wogVar4.k, wogVar4.l, wogVar4.i - wogVar4.b));
                        e8g1 e8g1Var2 = e8g1Var instanceof e8g1 ? e8g1Var : null;
                        if (e8g1Var2 != null) {
                            xj61Var.add(new log(e8g1Var2.a, pogVar2.b, wogVar4.d));
                        }
                        xj61 xj61VarJ = cwl1.j(xj61Var);
                        if (e8g1Var instanceof f8g1) {
                            obj3 = vog.a;
                        }
                        return Next.i(obj3, xj61VarJ);
                    }
                    eg.m("Check failed.");
                }
                return null;
            case 6:
                iun iunVar = (iun) obj;
                aun aunVar = (aun) obj2;
                tv80 tv80Var2 = wsn.a;
                asn asnVar = ((kun) this.b).d;
                if (!(iunVar instanceof hun)) {
                    return Next.h(iunVar);
                }
                if (aunVar instanceof vtn) {
                    return Next.h(hun.a((hun) iunVar, null, new eun(((vtn) aunVar).a), null, null, null, null, false, false, null, null, null, false, 16379));
                }
                if (aunVar instanceof xtn) {
                    return Next.h(hun.a((hun) iunVar, ((xtn) aunVar).a, null, null, null, null, null, false, false, null, null, null, false, 16381));
                }
                if (aunVar instanceof wtn) {
                    return Next.h(hun.a((hun) iunVar, null, ((wtn) aunVar).a, null, null, null, null, false, false, null, null, null, false, 16379));
                }
                if (aunVar instanceof utn) {
                    hun hunVar = (hun) iunVar;
                    utn utnVar = (utn) aunVar;
                    String str4 = utnVar.a;
                    String str5 = utnVar.b;
                    boolean z3 = utnVar.e;
                    return Next.h(hun.a(hunVar, null, null, utnVar.c, str4, str5, z3 ? utnVar.d : hunVar.g, hunVar.h || z3, false, null, utnVar.g, utnVar.h, utnVar.f, 8967));
                }
                if (aunVar instanceof rtn) {
                    return Next.h(hun.a((hun) iunVar, null, null, null, null, null, null, false, ((rtn) aunVar).a, null, null, null, false, 16127));
                }
                if (aunVar instanceof ztn) {
                    return Next.h(hun.a((hun) iunVar, null, null, null, null, null, null, false, false, ((ztn) aunVar).a, null, null, false, 15871));
                }
                if (aunVar instanceof qtn) {
                    return Next.j();
                }
                if (aunVar instanceof stn) {
                    hun hunVar2 = (hun) iunVar;
                    if (hunVar2.n) {
                        return Next.i(hun.a(hunVar2, null, null, null, null, null, null, false, false, null, null, null, false, 8191), Collections.singleton(ptn.a));
                    }
                    asnVar.j(tv80Var2);
                    return Next.j();
                }
                aunVar.getClass();
                if (aunVar instanceof stn) {
                    tv80Var = tv80Var2;
                } else if ((aunVar instanceof ttn) || (aunVar instanceof ytn)) {
                    throw null;
                }
                if (tv80Var != null) {
                    asnVar.j(tv80Var);
                }
                return Next.j();
            case 7:
                ziu ziuVar = (ziu) obj;
                liu liuVar = (liu) obj2;
                boolean z4 = ziuVar.e;
                tiu tiuVar = (tiu) this.b;
                int i3 = tiuVar.a;
                boolean z5 = ziuVar.a;
                diu diuVar = ziuVar.f;
                List list = diuVar.e;
                fq0 fq0Var = diuVar.a;
                boolean zIsEmpty = list.isEmpty();
                String strR = ila0.r(list);
                String str6 = strR != null ? strR : "";
                if (liuVar instanceof txc) {
                    return tiu.b(ziuVar, "cta_button");
                }
                if (liuVar instanceof osd) {
                    return tiu.b(ziuVar, "container");
                }
                if (liuVar instanceof tr70) {
                    return tiu.b(ziuVar, "image");
                }
                if (liuVar instanceof tw50) {
                    return tiu.b(ziuVar, "header");
                }
                if (liuVar instanceof dw70) {
                    return Next.a(Effects.a(new hib1[]{new hib1(fq0Var, i3)}));
                }
                if (liuVar instanceof fw70) {
                    return tiuVar.a(ziu.a(ziuVar, false, false, true, false, (diu) null, 0, 119), dm61.w0(new chu[]{new wzb1(true), new v57(fq0Var.a())}));
                }
                if (liuVar instanceof rs70) {
                    if (zIsEmpty) {
                        return Next.j();
                    }
                    xj61 xj61Var2 = new xj61();
                    xj61Var2.add(new wzb1(false));
                    xj61Var2.add(new xk21(str6, fq0Var));
                    if (i3 != 1) {
                        if (i3 == 2) {
                            z = true;
                        } else if (i3 != 3) {
                            throw null;
                        }
                    }
                    if (z) {
                        xj61 xj61Var3 = new xj61();
                        if (z4) {
                            xj61Var3.add(co0.f1);
                        }
                        xj61Var2.add(new deu(fq0Var, cwl1.j(xj61Var3)));
                    }
                    return Next.a(cwl1.j(xj61Var2));
                }
                if (liuVar instanceof hrg) {
                    xj61 xj61Var4 = new xj61();
                    if (z4) {
                        xj61Var4.add(co0.f1);
                    }
                    return Next.a(Effects.a(new deu[]{new deu(fq0Var, dm61.x0(co0.g, cwl1.j(xj61Var4)))}));
                }
                if (liuVar instanceof ys21) {
                    boolean z6 = !z5;
                    return Next.i(ziu.a(ziuVar, z6, false, false, false, (diu) null, 0, 126), Effects.a(new ct21[]{new ct21(fq0Var.a(), z6)}));
                }
                if (liuVar instanceof nd5) {
                    return Next.i(ziu.a(ziuVar, true, false, false, false, (diu) null, 0, 126), Effects.a(new ate0[]{new ate0(fq0Var, "ad_auto_collapse", diuVar.g)}));
                }
                if (!(liuVar instanceof kjs0)) {
                    eg.o();
                    return null;
                }
                int i4 = ((rr80) new tr80(50, 100, 1)).b;
                tr80 tr80VarQ = yoi1.Q(0, 50);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i5 = ((kjs0) liuVar).a;
                ziu ziuVarA = ziu.a(ziuVar, false, false, false, false, (diu) null, i5, 63);
                ziu ziuVarA2 = i5 <= 0 ? ziu.a(ziuVarA, false, false, false, false, (diu) null, 0, 122) : ziu.a(ziuVarA, false, true, false, false, (diu) null, 0, 123);
                if (z4 && !tiuVar.c.c()) {
                    int i6 = ((rr80) tr80VarQ).a;
                    int i7 = ((rr80) tr80VarQ).b;
                    int i8 = ziuVar.g;
                    if (i6 <= i8 && i8 <= i7 && 50 <= i5 && i5 <= i4) {
                        linkedHashSet.add(new em21(fq0Var.a()));
                    } else if (50 <= i8 && i8 <= i4 && i6 <= i5 && i5 <= i7) {
                        linkedHashSet.add(new hm21(fq0Var.a()));
                    }
                }
                return tiuVar.a(ziuVarA2, linkedHashSet);
            case 8:
                le10 le10Var = (le10) obj;
                ee10 ee10Var = (fe10) obj2;
                ge10 ge10Var = ge10.a;
                re10 re10Var = (re10) this.b;
                if (ee10Var instanceof ee10) {
                    le10Var.getClass();
                    eww0 eww0Var = ee10Var.a;
                    String str7 = eww0Var.b;
                    int iC = l1d.C(1);
                    if (iC == 0) {
                        str = eww0Var.o;
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        str = eww0Var.f;
                    }
                    return Next.h(le10.a(le10Var, str7, str, Integer.valueOf(eww0Var.g), (String) null, (xd10) null, 0, (String) null, (String) null, (String) null, false, ge10Var, (List) null, 6129));
                }
                if (ee10Var instanceof ce10) {
                    re10Var.f.invoke(((ce10) ee10Var).a);
                    return Next.j();
                }
                if (ee10Var instanceof de10) {
                    le10Var.getClass();
                    return Next.h(le10.a(le10Var, (String) null, (String) null, (Integer) null, (String) null, (xd10) null, 0, (String) null, (String) null, (String) null, false, ge10Var, (List) null, 6143));
                }
                if (ee10Var instanceof be10) {
                    le10Var.getClass();
                    return Next.h(le10.a(le10Var, (String) null, (String) null, (Integer) null, (String) null, ((be10) ee10Var).a, 0, (String) null, (String) null, (String) null, false, (je10) null, (List) null, 8159));
                }
                if (ee10Var instanceof ae10) {
                    le10Var.getClass();
                    return Next.h(le10.a(le10Var, (String) null, (String) null, (Integer) null, (String) null, (xd10) null, 0, (String) null, (String) null, (String) null, false, (je10) null, ((ae10) ee10Var).a, 4095));
                }
                eg.o();
                return null;
            case 9:
                return (Next) ((eq7) this.b).invoke(obj, obj2);
            case 10:
                cn50 cn50Var = (cn50) obj;
                tq80 tq80Var2 = (tq80) obj2;
                hn50 hn50Var = (hn50) this.b;
                List list2 = hn50Var.b;
                String str8 = hn50Var.c;
                an50 an50Var = (an50) tq80Var2.a;
                if (an50Var instanceof wm50) {
                    cn50Var.getClass();
                    return Next.h(cn50.a(cn50Var, 0, 0, ((wm50) an50Var).a, 7));
                }
                if (u890.j(an50Var, xm50.a)) {
                    if (cn50Var.d) {
                        return Next.h(cn50.a(cn50Var, 0, 1, false, 9));
                    }
                    return !list2.isEmpty() ? Next.h(cn50.a(cn50.a(cn50Var, 0, 0, false, 9), 0, 2, false, 11)) : Next.i(cn50.a(cn50Var, 0, 0, false, 9), Effects.a(new z8w[]{new z8w(str8)}));
                }
                if (u890.j(an50Var, vm50.a)) {
                    cn50Var.getClass();
                    return Next.h(cn50.a(cn50Var, 0, 3, false, 9));
                }
                if (u890.j(an50Var, sm50.a)) {
                    return (cn50Var.c != 1 || list2.isEmpty()) ? Next.i(cn50.a(cn50Var, 0, 0, false, 9), Effects.a(new z8w[]{new z8w(str8)})) : Next.h(cn50.a(cn50.a(cn50Var, 0, 0, false, 9), 0, 2, false, 11));
                }
                if (u890.j(an50Var, tm50.a)) {
                    cn50Var.getClass();
                    return Next.h(cn50.a(cn50.a(cn50Var, 0, 0, false, 9), 0, 3, false, 11));
                }
                if (u890.j(an50Var, qm50.a)) {
                    cn50Var.getClass();
                    return Next.i(cn50.a(cn50Var, 0, 0, false, 9), Effects.a(new dbw[]{new dbw(str8, hn50Var.f)}));
                }
                if (u890.j(an50Var, um50.a) || u890.j(an50Var, rm50.a)) {
                    cn50Var.getClass();
                    return Next.h(cn50.a(cn50Var, 0, 0, false, 9));
                }
                if (an50Var instanceof zm50) {
                    cn50Var.getClass();
                    return Next.h(cn50.a(cn50Var, ((zm50) an50Var).a, 0, false, 13));
                }
                if (u890.j(an50Var, ym50.a)) {
                    tqw tqwVar2 = tq80Var2.b;
                    return Next.a(Effects.a(new jdw[]{new jdw(tqwVar2 != null ? n3o1.y(tqwVar2) : null)}));
                }
                eg.o();
                return null;
            case 11:
                Object objA = (zh60) obj;
                ph60 ph60Var = (vh60) obj2;
                ((ni60) this.b).b.invoke(ph60Var);
                if (ph60Var instanceof oh60) {
                    return Next.j();
                }
                if (ph60Var.equals(rh60.a)) {
                    return Next.j();
                }
                if (ph60Var instanceof nh60) {
                    return Next.i(new wh60(((nh60) ph60Var).a), Collections.singleton(mi60.a));
                }
                if (ph60Var instanceof qh60) {
                    return Next.h(new xh60(((qh60) ph60Var).a, lqs0.d));
                }
                if (ph60Var instanceof lh60) {
                    xh60 xh60Var = objA instanceof xh60 ? (xh60) objA : null;
                    if (xh60Var == null) {
                        return Next.j();
                    }
                    String str9 = ((lh60) ph60Var).a;
                    c380<mmr0> c380Var = xh60Var.a;
                    ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                    for (mmr0 mmr0Var : c380Var) {
                        yzm yzmVar = (yzm) mmr0Var.a;
                        c380 c380Var2 = (c380) mmr0Var.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : c380Var2) {
                            if (!((zzm) obj4).a.equals(str9)) {
                                arrayList2.add(obj4);
                            }
                        }
                        arrayList.add(new mmr0(yzmVar, mqo1.A(arrayList2)));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        if (!((c380) ((mmr0) obj5).b).isEmpty()) {
                            arrayList3.add(obj5);
                        }
                    }
                    return Next.h(xh60.a(xh60Var, mqo1.A(arrayList3), null, 2));
                }
                if (ph60Var instanceof mh60) {
                    xh60 xh60Var2 = objA instanceof xh60 ? (xh60) objA : null;
                    if (xh60Var2 == null) {
                        return Next.j();
                    }
                    u380 u380Var = ((xh60) objA).b;
                    String str10 = ((mh60) ph60Var).a;
                    return Next.i(xh60.a(xh60Var2, null, mqo1.C(dm61.u0(str10, u380Var)), 1), Collections.singleton(new li60(str10)));
                }
                if (ph60Var instanceof sh60) {
                    String str11 = ((sh60) ph60Var).a;
                    xh60 xh60Var3 = objA instanceof xh60 ? (xh60) objA : null;
                    if (xh60Var3 != null) {
                        objA = xh60.a(xh60Var3, null, mqo1.C(dm61.x0(str11, ((xh60) objA).b)), 1);
                    }
                    return Next.i(objA, Collections.singleton(new ki60(str11)));
                }
                if (ph60Var.equals(th60.a)) {
                    return Next.i(yh60.a, Collections.singleton(ji60.a));
                }
                if (!(ph60Var instanceof ph60)) {
                    if (ph60Var instanceof uh60) {
                        xh60 xh60Var4 = objA instanceof xh60 ? (xh60) objA : null;
                        return xh60Var4 != null ? Next.h(xh60.a(xh60Var4, null, mqo1.C(dm61.u0(((uh60) ph60Var).a, ((xh60) objA).b)), 1)) : Next.j();
                    }
                    eg.o();
                    return null;
                }
                zzm zzmVar = ph60Var.a;
                String str12 = zzmVar.a;
                xh60 xh60Var5 = objA instanceof xh60 ? (xh60) objA : null;
                if (xh60Var5 != null) {
                    objA = xh60.a(xh60Var5, null, mqo1.C(dm61.x0(str12, ((xh60) objA).b)), 1);
                }
                return Next.i(objA, Collections.singleton(new ki60(zzmVar.a)));
            case 12:
                oe80 oe80Var = (oe80) obj;
                ke80 ke80Var = (me80) obj2;
                if (!(ke80Var instanceof ke80)) {
                    if (ke80Var instanceof le80) {
                        oe80Var.getClass();
                        return Next.h(oe80.a(oe80Var, (m6p1) null, ((le80) ke80Var).a, (String) null, (String) null, (DynamicTagsMetadata) null, 29));
                    }
                    eg.o();
                    return null;
                }
                be80 be80Var = ke80Var.a;
                ((se80) this.b).f = be80Var;
                if (!(be80Var instanceof be80)) {
                    oe80Var.getClass();
                    return Next.h(oe80.a(oe80Var, be80Var, (o6p1) null, (String) null, (String) null, (DynamicTagsMetadata) null, 30));
                }
                oe80Var.getClass();
                oe80 oe80VarA = oe80.a(oe80Var, be80Var, (o6p1) null, (String) null, (String) null, (DynamicTagsMetadata) null, 30);
                MessageResponseToken messageResponseToken = be80Var.c;
                String str13 = oe80Var.c;
                return Next.i(oe80VarA, Collections.singleton(new he80(messageResponseToken, str13 != null ? str13 : "", oe80Var.e)));
            case 13:
                return e(obj, obj2);
            case 14:
                l790 l790Var = (l790) obj;
                e790 e790Var = (h790) obj2;
                m790 m790Var = l790Var.a;
                ytw0 ytw0Var = (ytw0) this.b;
                if (e790Var instanceof e790) {
                    boolean z7 = m790Var.c;
                    e790 e790Var2 = e790Var;
                    b7l b7lVar = e790Var2.a;
                    boolean z8 = b7lVar.c;
                    return ytw0Var.d(l790Var, m790.a(m790Var, b7lVar.a, b7lVar.b, z8, b7lVar.d, b7lVar.e, b7lVar.f, e790Var2.b, false, false, false, false, 0L, 0L, false, 0L, z7 != z8 ? e790Var2.b : m790Var.p, 32640), e790Var);
                }
                if (e790Var instanceof f790) {
                    return ytw0Var.d(l790Var, m790.a(m790Var, false, false, false, 0, false, false, 0L, false, ((f790) e790Var).a, false, false, 0L, 0L, false, 0L, 0L, 65279), e790Var);
                }
                if (!(e790Var instanceof g790)) {
                    if (e790Var instanceof d790) {
                        return ytw0Var.d(l790Var, m790.a(m790Var, false, false, false, 0, false, false, 0L, ((d790) e790Var).a, false, false, false, 0L, 0L, false, 0L, 0L, 65407), e790Var);
                    }
                    if (!(e790Var instanceof c790)) {
                        eg.o();
                        return null;
                    }
                    c790 c790Var = (c790) e790Var;
                    Integer num = c790Var.a;
                    return ytw0Var.d(l790Var, m790.a(m790Var, false, false, false, 0, false, false, 0L, false, false, false, false, 0L, 0L, (num != null && num.intValue() == 25) || (num != null && num.intValue() == 10001), c790Var.b, 0L, 40959), e790Var);
                }
                if (m790Var.k) {
                    j = m790Var.m;
                } else {
                    g790 g790Var = (g790) e790Var;
                    if (g790Var.b) {
                        j = g790Var.c;
                    } else {
                        j = m790Var.m;
                    }
                }
                long j2 = j;
                g790 g790Var2 = (g790) e790Var;
                return ytw0Var.d(l790Var, m790.a(m790Var, false, false, false, 0, false, false, 0L, false, false, g790Var2.a, g790Var2.b, j2, g790Var2.c, false, 0L, 0L, 57855), e790Var);
            case 15:
                return f(obj, obj2);
            case 16:
                return g(obj, obj2);
            case 17:
                return h(obj, obj2);
            case 18:
                return i(obj, obj2);
            case 19:
                return (Next) ((hry) this.b).invoke(obj, obj2);
            case 20:
                return (Next) ((mbf0) this.b).invoke(obj, obj2);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                w9m1 w9m1Var = (oam1) obj2;
                if (w9m1Var instanceof w9m1) {
                    w9m1 w9m1Var2 = w9m1Var;
                    return ((Update) this.b).a(obj, new tq80(w9m1Var2.a, w9m1Var2.b));
                }
                if (!(w9m1Var instanceof fam1)) {
                    return Next.h(obj);
                }
                uah0 uah0Var = ((fam1) w9m1Var).a;
                w0h1.o(1, uah0Var);
                return (Next) uah0Var.invoke(obj);
            case 22:
                return j(obj, obj2);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return ((wam0) this.b).c((iaz0) obj, (a9z0) obj2);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return k(obj, obj2);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return (Next) ((u841) this.b).invoke(obj, obj2);
            case 26:
                return l(obj, obj2);
            case 27:
                return m(obj, obj2);
            case 28:
                return (Next) ((gsc1) this.b).invoke(obj, obj2);
            default:
                return (Next) ((eq7) this.b).invoke(obj, obj2);
        }
    }
}
