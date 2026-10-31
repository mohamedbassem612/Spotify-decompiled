package p;

import com.spotify.concertpageview.v1.SourceReference;
import com.spotify.concertpageview.v1.TicketingTimeline;
import com.spotify.concertpageview.v1.TimelineAction;
import com.spotify.concertpageview.v1.TimelineEntry;
import com.spotify.concertpageview.v1.a;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ajk implements Update {
    public static final ajk a = new ajk();

    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    public final Next a(Object obj, Object obj2) {
        String str;
        ca00 ca00Var = (ca00) obj;
        vlk vlkVar = (vlk) obj2;
        String str2 = ca00Var.f;
        boolean z = ca00Var.d;
        lto0 lto0Var = ca00Var.h;
        List list = ca00Var.c;
        List list2 = ca00Var.b;
        la00 la00Var = ca00Var.a;
        String str3 = la00Var.g;
        List list3 = la00Var.b;
        String str4 = la00Var.c;
        String str5 = la00Var.d;
        if (vlkVar instanceof alk) {
            alk alkVar = (alk) vlkVar;
            sv50 sv50Var = (sv50) list3.get(0);
            String str6 = la00Var.j;
            String strConcat = sv50Var.c.concat(":concerts");
            List list4 = list2;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r7h.W(((ved1) it.next()).d, arrayList);
            }
            ArrayList arrayListN0 = o7h.N0(arrayList, list4);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayListN0) {
                if (obj3 instanceof u5m) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList<TimelineEntry> arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                r7h.W(((u5m) it2.next()).a.p(), arrayList3);
            }
            for (TimelineEntry timelineEntry : arrayList3) {
                String strN = timelineEntry.y().n();
                if (timelineEntry.hasSource() && timelineEntry.y().s()) {
                    strN.getClass();
                    if (ihc1.y0(strN)) {
                        strN = null;
                    }
                } else {
                    strN = null;
                }
                if (strN != null) {
                    str = strN;
                    return Next.a(Effects.a(new zfk[]{new zfk(alkVar.a, sv50Var.a, sv50Var.b, alkVar.b, str3, str6, strConcat, str, upf.k(la00Var, alkVar.c))}));
                }
            }
            str = null;
            return Next.a(Effects.a(new zfk[]{new zfk(alkVar.a, sv50Var.a, sv50Var.b, alkVar.b, str3, str6, strConcat, str, upf.k(la00Var, alkVar.c))}));
        }
        if (vlkVar instanceof qlk) {
            qlk qlkVar = (qlk) vlkVar;
            return Next.a(Effects.a(new cgk[]{new cgk(qlkVar.a, qlkVar.b, qlkVar.c)}));
        }
        if (vlkVar instanceof elk) {
            String str7 = ((elk) vlkVar).a;
            jb00 jb00Var = lto0Var.b;
            boolean z2 = jb00Var.a;
            boolean z3 = jb00Var.b;
            if (z || ((z2 && z3) || !ca00Var.j)) {
                return Next.a(Effects.a(new egk[]{z ? new egk(2, str7) : new egk(1, str7)}));
            }
            return Next.i(ca00.a(ca00Var, null, null, null, false, false, null, null, new gvo0(z2, z3, str7), false, null, null, 3839), Effects.a(new hgk[]{hgk.e}));
        }
        if (vlkVar instanceof okk) {
            k6k k6kVarK = upf.k(la00Var, ((okk) vlkVar).a);
            return k6kVarK != null ? Next.a(Effects.a(new tfk[]{new tfk(k6kVarK)})) : Next.j();
        }
        boolean z4 = vlkVar instanceof xkk;
        wt6 wt6Var = wt6.c;
        if (z4) {
            xkk xkkVar = (xkk) vlkVar;
            return Next.i(ca00.a(ca00Var, null, null, null, false, false, null, null, null, false, wt6Var, null, 3071), Effects.a(new qfk[]{new qfk(0, xkkVar.a, xkkVar.b)}));
        }
        if (vlkVar instanceof ukk) {
            return Next.h(ca00.a(ca00Var, null, null, null, false, false, null, null, null, false, wt6Var, null, 3071));
        }
        if (vlkVar instanceof rlk) {
            vqe1 vqe1Var = ((rlk) vlkVar).a;
            TimelineAction timelineAction = vqe1Var.a;
            switch (timelineAction.n().ordinal()) {
                case 1:
                    return Next.a(Effects.a(new sfk[]{new sfk(timelineAction.getUri(), 0)}));
                case 2:
                case 3:
                case 4:
                    return Next.a(Effects.a(new vfk[]{new vfk(str5, vqe1Var)}));
                case 5:
                    String uri = timelineAction.getUri();
                    if (ihc1.y0(uri)) {
                        uri = null;
                    }
                    if (uri == null) {
                        SourceReference sourceReference = vqe1Var.b;
                        uri = sourceReference != null ? sourceReference.n() : null;
                    }
                    if (uri == null) {
                        return Next.j();
                    }
                    return nhc1.Y(uri, "http", false) ? Next.a(Effects.a(new sfk[]{new sfk(uri, 0)})) : Next.a(Effects.a(new qfk[]{new qfk(0, uri, null)}));
                case 6:
                    return nhc1.Y(timelineAction.getUri(), "http", false) ? Next.a(Effects.a(new sfk[]{new sfk(timelineAction.getUri(), 0)})) : Next.a(Effects.a(new qfk[]{new qfk(0, timelineAction.getUri(), null)}));
                case 7:
                    return Next.j();
                default:
                    return Next.j();
            }
        }
        if (vlkVar instanceof slk) {
            slk slkVar = (slk) vlkVar;
            TicketingTimeline ticketingTimeline = slkVar.a;
            Long l = slkVar.b;
            boolean z5 = slkVar.c;
            ArrayList arrayListA = apo.A(list2, ticketingTimeline);
            List<ved1> list5 = list;
            ArrayList arrayList4 = new ArrayList(q7h.U(list5, 10));
            for (ved1 ved1Var : list5) {
                arrayList4.add(new ved1(ved1Var.a, ved1Var.b, apo.A(ved1Var.d, ticketingTimeline), ved1Var.c));
            }
            return Next.h(ca00.a(ca00Var, null, arrayListA, arrayList4, false, z5, null, null, null, false, null, l, 2025));
        }
        if (vlkVar instanceof tlk) {
            return Next.h(ca00.a(ca00Var, null, null, null, false, ((tlk) vlkVar).a, null, null, null, false, null, null, 4079));
        }
        if (vlkVar instanceof klk) {
            Long l2 = ca00Var.l;
            return (l2 == null || l2.longValue() > ((klk) vlkVar).a) ? Next.j() : Next.a(Effects.a(new wfk[]{new wfk(str5)}));
        }
        if (vlkVar instanceof rkk) {
            rkk rkkVar = (rkk) vlkVar;
            return Next.a(Effects.a(new qfk[]{new qfk(0, rkkVar.a, rkkVar.c)}));
        }
        if (vlkVar instanceof vkk) {
            return Next.a(Effects.a(new nfk[]{nfk.e}));
        }
        if (vlkVar instanceof ykk) {
            return Next.a(Effects.a(new qfk[]{new qfk(0, ((ykk) vlkVar).a, null)}));
        }
        if (vlkVar instanceof ulk) {
            ulk ulkVar = (ulk) vlkVar;
            return Next.a(Effects.a(new qfk[]{new qfk(0, ulkVar.a, ulkVar.b)}));
        }
        if (vlkVar instanceof dlk) {
            dlk dlkVar = (dlk) vlkVar;
            return Next.a(Effects.a(new qfk[]{new qfk(0, dlkVar.a, dlkVar.b)}));
        }
        if (vlkVar instanceof qkk) {
            qkk qkkVar = (qkk) vlkVar;
            String str8 = qkkVar.a;
            tv80 tv80Var = qkkVar.b;
            return Next.a(Effects.a(new ufk[]{new ufk(u890.j(str2, str8) ? new a9u0(tv80Var) : new y8u0(str8, tv80Var))}));
        }
        if (vlkVar instanceof pkk) {
            return Next.a(Effects.a(new ufk[]{new ufk(new w8u0(((pkk) vlkVar).b))}));
        }
        if (vlkVar instanceof mlk) {
            mlk mlkVar = (mlk) vlkVar;
            return Next.i(ca00.a(ca00Var, null, null, null, false, false, mlkVar.a, null, null, false, null, null, 4063), Effects.a(new ggk[]{new ggk(mlkVar.a)}));
        }
        if (vlkVar instanceof glk) {
            return Next.a(Effects.a(new yfk[]{new yfk(((glk) vlkVar).a)}));
        }
        if (vlkVar instanceof olk) {
            return Next.h(ca00.a(ca00Var, null, null, null, ((olk) vlkVar).a, false, null, null, null, false, null, null, 4087));
        }
        if (vlkVar instanceof plk) {
            plk plkVar = (plk) vlkVar;
            return Next.a(Effects.a(new agk[]{new agk(plkVar.a, plkVar.b, plkVar.c, str2)}));
        }
        if (vlkVar instanceof nlk) {
            return Next.h(ca00.a(ca00Var, null, null, null, false, false, null, ((nlk) vlkVar).a, null, false, null, null, 3967));
        }
        if (vlkVar instanceof hlk) {
            hlk hlkVar = (hlk) vlkVar;
            String str9 = hlkVar.a;
            boolean z6 = lto0Var.a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (!z6) {
                linkedHashSet.add(new bgk(ca00Var.g, str9));
            }
            if (hlkVar.b) {
                linkedHashSet.add(new dgk(str9, str5));
            } else {
                linkedHashSet.add(new fgk(str9, str5));
            }
            return Next.a(linkedHashSet);
        }
        boolean z7 = vlkVar instanceof jlk;
        fvo0 fvo0Var = fvo0.a;
        if (z7) {
            return Next.i(ca00.a(ca00Var, null, null, null, false, false, null, null, fvo0Var, false, null, null, 3839), Effects.a(new egk[]{new egk(1, str5)}));
        }
        if (vlkVar instanceof wkk) {
            return Next.h(ca00.a(ca00Var, null, null, null, false, false, null, null, null, ((wkk) vlkVar).a, null, null, 3583));
        }
        if (vlkVar instanceof llk) {
            llk llkVar = (llk) vlkVar;
            String strConcat2 = "spotify:concert:".concat(str4);
            return Next.i(ca00.a(ca00Var, null, null, null, false, false, null, null, fvo0Var, false, null, null, 3839), Effects.a(new nln[]{z ? new egk(2, strConcat2) : new egk(1, strConcat2), new fgk(llkVar.a, str5)}));
        }
        if (vlkVar.equals(ilk.a)) {
            return Next.i(ca00.a(ca00Var, null, null, null, false, false, null, null, fvo0Var, false, null, null, 3839), Effects.a(new egk[]{new egk(1, "spotify:concert:".concat(str4))}));
        }
        if (vlkVar instanceof zkk) {
            zkk zkkVar = (zkk) vlkVar;
            String str10 = zkkVar.a.c;
            return str10 != null ? Next.i(ca00Var, Effects.a(new qfk[]{new qfk(0, str10, zkkVar.b)})) : Next.j();
        }
        if (vlkVar instanceof tkk) {
            tkk tkkVar = (tkk) vlkVar;
            return Next.a(Effects.a(new qfk[]{new qfk(0, tkkVar.a, tkkVar.b)}));
        }
        if (vlkVar instanceof skk) {
            return Next.h(ca00.a(ca00Var, null, null, null, false, false, null, null, null, false, new vt6(((skk) vlkVar).a), null, 3071));
        }
        if (vlkVar instanceof flk) {
            return Next.a(Effects.a(new sfk[]{new sfk(((flk) vlkVar).a, 0)}));
        }
        if (!(vlkVar instanceof blk)) {
            if (vlkVar instanceof clk) {
                return Next.h(ca00.a(ca00Var, new la00(la00Var.a, list3, str4, str5, la00Var.e, la00Var.f, str3, la00Var.h, la00Var.i, la00Var.j, la00Var.k, ((clk) vlkVar).a), null, null, false, false, null, null, null, false, null, null, 4094));
            }
            eg.o();
            return null;
        }
        a aVarV = TimelineAction.v();
        aVarV.n();
        TimelineAction timelineAction2 = (TimelineAction) aVarV.build();
        nla1 nla1VarV = SourceReference.v();
        nla1VarV.n(((blk) vlkVar).a);
        return Next.a(Effects.a(new vfk[]{new vfk(str5, new vqe1(timelineAction2, nla1VarV.build()))}));
    }
}
