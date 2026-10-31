package p;

import android.os.Bundle;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mnl extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnl() {
        super(3, (lnm) null);
        this.a = (byte) 10;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                mnl mnlVar = new mnl(this.c, (lnm) obj3, (byte) 0);
                mnlVar.b = (Throwable) obj2;
                mnlVar.invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                mnl mnlVar2 = new mnl((int) b2, (lnm) obj3, (byte) 1);
                mnlVar2.b = (ioj0) obj;
                mnlVar2.c = (Map) obj2;
                return mnlVar2.invokeSuspend(rih1Var);
            case 2:
                mnl mnlVar3 = new mnl((int) b2, (lnm) obj3, (byte) 2);
                mnlVar3.b = (kjm) obj;
                mnlVar3.c = (yim) obj2;
                return mnlVar3.invokeSuspend(rih1Var);
            case 3:
                mnl mnlVar4 = new mnl((y2o) this.c, (lnm) obj3, b2);
                mnlVar4.b = (Throwable) obj2;
                mnlVar4.invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                mnl mnlVar5 = new mnl((int) b2, (lnm) obj3, (byte) 4);
                mnlVar5.b = (List) obj;
                mnlVar5.c = (bxn) obj2;
                return mnlVar5.invokeSuspend(rih1Var);
            case 5:
                mnl mnlVar6 = new mnl(this.c, (lnm) obj3, (byte) 5);
                mnlVar6.b = (Throwable) obj2;
                mnlVar6.invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                mnl mnlVar7 = new mnl((int) b2, (lnm) obj3, (byte) 6);
                mnlVar7.b = (sv61) obj;
                mnlVar7.c = (lax) obj2;
                return mnlVar7.invokeSuspend(rih1Var);
            case 7:
                mnl mnlVar8 = new mnl((int) b2, (lnm) obj3, (byte) 7);
                mnlVar8.b = (y9o) obj;
                mnlVar8.c = (x9o) obj2;
                return mnlVar8.invokeSuspend(rih1Var);
            case 8:
                mnl mnlVar9 = new mnl(this.c, (lnm) obj3, (byte) 8);
                mnlVar9.b = (l0l) obj;
                return mnlVar9.invokeSuspend(rih1Var);
            case 9:
                mnl mnlVar10 = new mnl((int) b2, (lnm) obj3, (byte) 9);
                mnlVar10.b = (ler) obj;
                mnlVar10.c = (mer) obj2;
                return mnlVar10.invokeSuspend(rih1Var);
            case 10:
                mnl mnlVar11 = new mnl((int) b2, (lnm) obj3, (byte) 10);
                mnlVar11.b = (l0l) obj;
                mnlVar11.c = (List) obj2;
                return mnlVar11.invokeSuspend(rih1Var);
            case 11:
                mnl mnlVar12 = new mnl((int) b2, (lnm) obj3, (byte) 11);
                mnlVar12.b = (PlayerState) obj;
                mnlVar12.c = (pnl) obj2;
                return mnlVar12.invokeSuspend(rih1Var);
            case 12:
                mnl mnlVar13 = new mnl((int) b2, (lnm) obj3, (byte) 12);
                mnlVar13.b = (Map) obj;
                mnlVar13.c = (teh0) obj2;
                return mnlVar13.invokeSuspend(rih1Var);
            case 13:
                mnl mnlVar14 = new mnl((int) b2, (lnm) obj3, (byte) 13);
                mnlVar14.b = (YourLibraryDecorateResponse) obj;
                mnlVar14.c = (YourLibraryResponse) obj2;
                return mnlVar14.invokeSuspend(rih1Var);
            case 14:
                mnl mnlVar15 = new mnl((int) b2, (lnm) obj3, (byte) 14);
                mnlVar15.b = (pp90) obj;
                mnlVar15.c = (bp90) obj2;
                return mnlVar15.invokeSuspend(rih1Var);
            case 15:
                mnl mnlVar16 = new mnl(this.c, (lnm) obj3, (byte) 15);
                mnlVar16.b = (tv80) obj2;
                mnlVar16.invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                mnl mnlVar17 = new mnl((int) b2, (lnm) obj3, (byte) 16);
                mnlVar17.b = (PlayerState) obj;
                mnlVar17.c = (spq0) obj2;
                return mnlVar17.invokeSuspend(rih1Var);
            case 17:
                mnl mnlVar18 = new mnl((int) b2, (lnm) obj3, (byte) 17);
                mnlVar18.b = (cuu) obj;
                mnlVar18.c = (fuu) obj2;
                return mnlVar18.invokeSuspend(rih1Var);
            case 18:
                mnl mnlVar19 = new mnl(this.c, (lnm) obj3, (byte) 18);
                mnlVar19.b = (tqw) obj2;
                mnlVar19.invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                mnl mnlVar20 = new mnl((int) b2, (lnm) obj3, (byte) 19);
                mnlVar20.b = (n6w) obj;
                mnlVar20.c = (xkk1) obj2;
                return mnlVar20.invokeSuspend(rih1Var);
            case 20:
                mnl mnlVar21 = new mnl((int) b2, (lnm) obj3, (byte) 20);
                mnlVar21.b = (Map) obj;
                mnlVar21.c = (mmr0) obj2;
                return mnlVar21.invokeSuspend(rih1Var);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                mnl mnlVar22 = new mnl((int) b2, (lnm) obj3, (byte) 21);
                mnlVar22.b = (gwp0) obj;
                mnlVar22.c = (gwp0) obj2;
                return mnlVar22.invokeSuspend(rih1Var);
            case 22:
                mnl mnlVar23 = new mnl((int) b2, (lnm) obj3, (byte) 22);
                mnlVar23.b = (ily0) obj;
                mnlVar23.c = obj2;
                return mnlVar23.invokeSuspend(rih1Var);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                mnl mnlVar24 = new mnl((int) b2, (lnm) obj3, (byte) 23);
                mnlVar24.b = (mmr0) obj;
                mnlVar24.c = obj2;
                return mnlVar24.invokeSuspend(rih1Var);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                mnl mnlVar25 = new mnl((int) b2, (lnm) obj3, (byte) 24);
                mnlVar25.b = (tnj0) obj;
                mnlVar25.c = (mmr0) obj2;
                return mnlVar25.invokeSuspend(rih1Var);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                mnl mnlVar26 = new mnl((int) b2, (lnm) obj3, (byte) 25);
                mnlVar26.b = (List) obj;
                mnlVar26.c = (spq0) obj2;
                return mnlVar26.invokeSuspend(rih1Var);
            case 26:
                mnl mnlVar27 = new mnl((int) b2, (lnm) obj3, (byte) 26);
                mnlVar27.b = (pp90) obj;
                mnlVar27.c = (v1p0) obj2;
                return mnlVar27.invokeSuspend(rih1Var);
            case 27:
                mnl mnlVar28 = new mnl((int) b2, (lnm) obj3, (byte) 27);
                mnlVar28.b = (ioj0) obj;
                mnlVar28.c = (v17) obj2;
                return mnlVar28.invokeSuspend(rih1Var);
            case 28:
                mnl mnlVar29 = new mnl((int) b2, (lnm) obj3, (byte) 28);
                mnlVar29.b = (ww60) obj;
                mnlVar29.c = (Boolean) obj2;
                return mnlVar29.invokeSuspend(rih1Var);
            default:
                mnl mnlVar30 = new mnl((int) b2, (lnm) obj3, (byte) 29);
                mnlVar30.b = (Set) obj;
                mnlVar30.c = (mmr0) obj2;
                return mnlVar30.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:194:0x049a A[PHI: r11
      0x049a: PHI (r11v26 java.lang.Integer) = (r11v13 java.lang.Integer), (r11v18 java.lang.Integer) binds: [B:193:0x0498, B:202:0x04b0] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object invokeSuspend(Object obj) {
        goj0 goj0VarA;
        prl prlVar;
        int iIntValue;
        gvh0 gvh0Var;
        byte b = this.a;
        int i = 1;
        rih1 rih1Var = rih1.a;
        String str = null;
        numValueOf = null;
        Integer numValueOf = null;
        str = null;
        switch (b) {
            case 0:
                Throwable th = (Throwable) this.b;
                hm5.M(obj);
                ((nnl) this.c).h(th);
                return rih1Var;
            case 1:
                ioj0 ioj0Var = (ioj0) this.b;
                Map map = (Map) this.c;
                hm5.M(obj);
                Set setB = ioj0Var.a.b();
                int iS = zno1.s(q7h.U(setB, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj2 : setB) {
                    hoj0 hoj0VarC = ioj0Var.c(prl.class, (String) obj2);
                    nrl nrlVar = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (prlVar = (prl) goj0VarA.a) == null) ? mrl.a : prlVar.b;
                    map.getClass();
                    boolean z = nrlVar instanceof lrl;
                    nlq0 nlq0Var = olq0.a;
                    if (z) {
                        orl orlVar = ((lrl) nrlVar).a;
                        if (orlVar != null && !u890.j(map.get(orlVar.a), orlVar.b)) {
                            nlq0Var = new nlq0(Collections.singleton(mlq0.a));
                        }
                    } else if (!(nrlVar instanceof irl) && !(nrlVar instanceof jrl) && !(nrlVar instanceof krl) && !(nrlVar instanceof mrl)) {
                        eg.o();
                        return null;
                    }
                    linkedHashMap.put(obj2, nlq0Var);
                }
                return new rlq0(linkedHashMap);
            case 2:
                kjm kjmVar = (kjm) this.b;
                yim yimVar = (yim) this.c;
                hm5.M(obj);
                return new qdm(kjmVar, yimVar);
            case 3:
                Throwable th2 = (Throwable) this.b;
                hm5.M(obj);
                ((y2o) this.c).h(th2);
                return rih1Var;
            case 4:
                List list = (List) this.b;
                bxn bxnVar = (bxn) this.c;
                hm5.M(obj);
                return (bxnVar == null || list.isEmpty()) ? new b1o(list) : new a1o(bxnVar, (bxn) o7h.q0(list));
            case 5:
                Throwable th3 = (Throwable) this.b;
                hm5.M(obj);
                ((x6o) this.c).h(th3);
                return rih1Var;
            case 6:
                sv61 sv61Var = (sv61) this.b;
                gax gaxVar = (lax) this.c;
                hm5.M(obj);
                Object obj3 = sv61Var.b;
                it61 it61Var = sv61Var.a;
                Integer num = (Integer) obj3;
                if (num == null) {
                    it61 it61Var2 = it61Var instanceof it61 ? it61Var : null;
                    num = it61Var2 != null ? (Integer) it61Var2.a : null;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = num.intValue();
                }
                int iP = yoi1.p(iIntValue, 0, 12);
                if (it61Var instanceof ht61) {
                    gaxVar = new gax(2131961689, (String) null);
                }
                return new f9o(iP, gaxVar);
            case 7:
                y9o y9oVar = (y9o) this.b;
                v9o v9oVar = (x9o) this.c;
                hm5.M(obj);
                if (v9oVar instanceof v9o) {
                    boolean z2 = v9oVar.a;
                    int i2 = y9oVar.b;
                    y9oVar.getClass();
                    return new y9o(i2, z2);
                }
                if (!(v9oVar instanceof w9o)) {
                    eg.o();
                    return null;
                }
                int i3 = ((w9o) v9oVar).a;
                boolean z3 = y9oVar.a;
                y9oVar.getClass();
                return new y9o(i3, z3);
            case 8:
                l0l l0lVar = (l0l) this.b;
                hm5.M(obj);
                if (l0lVar == null) {
                    return mb0.a;
                }
                if (l0lVar.l()) {
                    return kb0.a;
                }
                p7s p7sVar = ((fer) this.c).c;
                p7sVar.c();
                owh0.b();
                lwh0 lwh0Var = e130.v(owh0.c().h(), p7sVar.f).l;
                if (lwh0Var != null && (gvh0Var = lwh0Var.u) != null) {
                    str = gvh0Var.b;
                }
                int iA = l0lVar.A();
                if (iA >= 24) {
                    iA = 24;
                }
                return new lb0(jch0.S(wmo1.B(l0lVar.c()) * ((double) iA)), iA, str);
            case 9:
                ler lerVar = (ler) this.b;
                mer merVar = (mer) this.c;
                hm5.M(obj);
                return new yvg1(lerVar, merVar.a, merVar.b);
            case 10:
                l0l l0lVar2 = (l0l) this.b;
                List list2 = (List) this.c;
                hm5.M(obj);
                return new mmr0(l0lVar2, list2);
            case 11:
                PlayerState playerState = (PlayerState) this.b;
                pnl pnlVar = (pnl) this.c;
                hm5.M(obj);
                return new mmr0(playerState, pnlVar);
            case 12:
                Map map2 = (Map) this.b;
                qeh0 qeh0Var = (teh0) this.c;
                hm5.M(obj);
                if (u890.j(qeh0Var, oeh0.a) || u890.j(qeh0Var, peh0.a)) {
                    map2.clear();
                } else if (qeh0Var instanceof qeh0) {
                    qeh0 qeh0Var2 = qeh0Var;
                    map2.put(qeh0Var2.a, qeh0Var2.b);
                } else if (qeh0Var instanceof reh0) {
                    map2.remove(((reh0) qeh0Var).a.getServiceName());
                } else {
                    if (!(qeh0Var instanceof seh0)) {
                        eg.o();
                        return null;
                    }
                    map2.remove(((seh0) qeh0Var).a);
                }
                return map2;
            case 13:
                YourLibraryDecorateResponse yourLibraryDecorateResponse = (YourLibraryDecorateResponse) this.b;
                YourLibraryResponse yourLibraryResponse = (YourLibraryResponse) this.c;
                hm5.M(obj);
                h290 h290VarN = yourLibraryResponse.n();
                h290<YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity> h290VarO = yourLibraryDecorateResponse.o();
                int iS2 = zno1.s(q7h.U(h290VarO, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity : h290VarO) {
                    linkedHashMap2.put(yourLibraryDecoratedEntity.e().getUri(), Boolean.valueOf(yourLibraryDecoratedEntity.e().u()));
                }
                return new yas(linkedHashMap2, h290VarN);
            case 14:
                pp90 pp90Var = (pp90) this.b;
                bp90 bp90Var = (bp90) this.c;
                hm5.M(obj);
                if (pp90Var != null) {
                    return new mmr0(pp90Var, bp90Var);
                }
                return null;
            case 15:
                tv80 tv80Var = (tv80) this.b;
                hm5.M(obj);
                ((p6t) this.c).b.a(p6t.e, tv80Var, (Bundle) null);
                return rih1Var;
            case 16:
                PlayerState playerState2 = (PlayerState) this.b;
                spq0 spq0Var = (spq0) this.c;
                hm5.M(obj);
                playerState2.getClass();
                l0l l0lVar3 = (l0l) spq0Var.h();
                boolean z4 = !playerState2.isPaused() && playerState2.isPlaying();
                e5u0 e5u0Var = (l0lVar3 == null || l0lVar3.l()) ? d5u0.a : new e5u0(l0lVar3.d());
                ContextTrack contextTrack = (ContextTrack) playerState2.track().h();
                if (contextTrack == null) {
                    i = 5;
                } else if (l4o1.E(contextTrack)) {
                    i = 4;
                } else if (l4o1.G(contextTrack)) {
                    i = 3;
                } else if (nhc1.Y(contextTrack.uri(), "spotify:episode:", false)) {
                    i = 2;
                } else if (!l4o1.W(contextTrack)) {
                    i = 5;
                }
                return new h5u0(z4, e5u0Var, i);
            case 17:
                fuu fuuVar = fuu.b;
                fuu fuuVar2 = fuu.c;
                cuu cuuVar = (cuu) this.b;
                fuu fuuVar3 = (fuu) this.c;
                hm5.M(obj);
                h2v h2vVar = cuuVar.a;
                String str2 = cuuVar.d;
                boolean z5 = cuuVar.b;
                fuu fuuVar4 = cuuVar.f;
                fuu fuuVar5 = (cuuVar.c || u890.j(fuuVar3, fuuVar2)) ? fuuVar2 : fuuVar;
                if (cuuVar.e) {
                    fuuVar = fuu.a;
                }
                return new buu(h2vVar, str2, fuuVar4, z5, fuuVar5, fuuVar);
            case 18:
                tqw tqwVar = (tqw) this.b;
                hm5.M(obj);
                m2v m2vVar = (m2v) this.c;
                m2vVar.b.a(ixb.c);
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                lzn0 lzn0Var = m2vVar.c;
                if (tv80VarY != null) {
                    lzn0Var.a(m2v.g, tv80VarY, (Bundle) null);
                } else {
                    lzn0Var.h(m2v.g);
                }
                return rih1Var;
            case 19:
                n6w n6wVar = (n6w) this.b;
                xkk1 xkk1Var = (xkk1) this.c;
                hm5.M(obj);
                y4w w4wVar = !n6wVar.a.isEmpty() ? new w4w(n6wVar.a) : x4w.a;
                if (xkk1Var != null) {
                    pp70 pp70Var = xkk1Var.d;
                    if (pp70Var == null) {
                        pp70Var = xkk1Var.a.b;
                    }
                    if (pp70Var != null) {
                        numValueOf = Integer.valueOf(z4p1.G(pp70Var.c.b.b));
                    }
                }
                return new q810(w4wVar, numValueOf);
            case 20:
                Map map3 = (Map) this.b;
                mmr0 mmr0Var = (mmr0) this.c;
                hm5.M(obj);
                return sqg0.P(map3, new mmr0((String) mmr0Var.a, (n5f0) mmr0Var.b));
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                gwp0 gwp0Var = (gwp0) this.b;
                gwp0 gwp0Var2 = (gwp0) this.c;
                hm5.M(obj);
                List list3 = gwp0Var2.a;
                Set setP1 = o7h.p1(cuz.c(list3));
                Set setP2 = o7h.p1(cuz.b(list3));
                Map map4 = gwp0Var.c;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : map4.entrySet()) {
                    if (setP1.contains((String) entry.getKey())) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMapO = sqg0.O(linkedHashMap3, gwp0Var2.c);
                Map map5 = gwp0Var.d;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry2 : map5.entrySet()) {
                    if (setP2.contains((String) entry2.getKey())) {
                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                    }
                }
                return new gwp0(list3, gwp0Var2.b, linkedHashMapO, sqg0.O(linkedHashMap4, gwp0Var2.d));
            case 22:
                ily0 ily0Var = (ily0) this.b;
                Object obj4 = this.c;
                hm5.M(obj);
                if (ily0Var == null) {
                    return null;
                }
                return new mmr0(ily0Var, obj4);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                mmr0 mmr0Var2 = (mmr0) this.b;
                Object obj5 = this.c;
                hm5.M(obj);
                return new mmr0(mmr0Var2.b, obj5);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                tnj0 tnj0Var = (tnj0) this.b;
                mmr0 mmr0Var3 = (mmr0) this.c;
                hm5.M(obj);
                return new ha10(tnj0Var, (String) mmr0Var3.a, (String) mmr0Var3.b);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                List list4 = (List) this.b;
                spq0 spq0Var2 = (spq0) this.c;
                hm5.M(obj);
                list4.getClass();
                ArrayList<jai1> arrayList = new ArrayList();
                for (Object obj6 : list4) {
                    if (((kai1) obj6).a() instanceof l560) {
                        arrayList.add(obj6);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (jai1 jai1Var : arrayList) {
                    l560 l560Var = jai1Var.a;
                    boolean z6 = spq0Var2.c() && u890.j(spq0Var2.b(), l560Var);
                    String str3 = jai1Var.b.g;
                    if (str3 == null) {
                        str3 = "Unknown";
                    }
                    arrayList2.add(new rul1(l560Var, str3, z6));
                }
                return o7h.Z0(arrayList2);
            case 26:
                pp90 pp90Var2 = (pp90) this.b;
                v1p0 v1p0Var = (v1p0) this.c;
                hm5.M(obj);
                if (pp90Var2 != null) {
                    return eo50.a;
                }
                return v1p0Var != null ? new go50(v1p0Var) : fo50.a;
            case 27:
                ioj0 ioj0Var2 = (ioj0) this.b;
                v17 v17Var = (v17) this.c;
                hm5.M(obj);
                return new h060(ioj0Var2, v17Var);
            case 28:
                ww60 ww60Var = (ww60) this.b;
                Boolean bool = (Boolean) this.c;
                hm5.M(obj);
                bool.getClass();
                return new ww60(ww60Var.a, ww60Var.b, ww60Var.c, ww60Var.d, ww60Var.e, bool.booleanValue());
            default:
                Set set = (Set) this.b;
                mmr0 mmr0Var4 = (mmr0) this.c;
                hm5.M(obj);
                String str4 = (String) mmr0Var4.a;
                return ((Boolean) mmr0Var4.b).booleanValue() ? dm61.x0(str4, set) : dm61.u0(str4, set);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mnl(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mnl(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
