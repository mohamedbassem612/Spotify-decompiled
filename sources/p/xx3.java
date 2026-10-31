package p;

import android.net.Uri;
import androidx.glance.session.SessionWorker;
import com.spotify.wrapped.v1.proto.CardShareConfiguration;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xx3 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx3(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new xx3((yx3) obj2, (rrk0) obj, lnmVar, (byte) 0);
            case 1:
                return new xx3((o95) obj2, obj, lnmVar, (byte) 1);
            case 2:
                return new xx3((res) obj2, (dgo) obj, lnmVar, (byte) 2);
            case 3:
                return new xx3((Set) obj2, (hur) obj, lnmVar, (byte) 3);
            case 4:
                return new xx3((ufm1) obj2, (rfm1) obj, lnmVar, (byte) 4);
            case 5:
                return new xx3((Uri) obj2, (pdw) obj, lnmVar, (byte) 5);
            case 6:
                return new xx3((List) obj2, (e4j0) obj, lnmVar, (byte) 6);
            case 7:
                return new xx3((q6n0) obj2, (bkc0) obj, lnmVar, (byte) 7);
            case 8:
                return new xx3((ji6) obj2, (qam1) obj, lnmVar, (byte) 8);
            case 9:
                return new xx3((Uri) obj2, (jz31) obj, lnmVar, (byte) 9);
            case 10:
                return new xx3((ove1) obj2, (SessionWorker) obj, lnmVar, (byte) 10);
            case 11:
                return new xx3((qj41) obj2, (f311) obj, lnmVar, (byte) 11);
            case 12:
                return new xx3((lcf1) obj2, (List) obj, lnmVar, (byte) 12);
            case 13:
                return new xx3((lcf1) obj2, (qj41) obj, lnmVar, (byte) 13);
            case 14:
                return new xx3((g7m1) obj2, (ajh1) obj, lnmVar, (byte) 14);
            case 15:
                return new xx3((j7j1) obj2, (x8j1) obj, lnmVar, (byte) 15);
            case 16:
                return new xx3((g7j1) obj2, (x8j1) obj, lnmVar, (byte) 16);
            default:
                return new xx3((hfm1) obj2, (Map) obj, lnmVar, (byte) 17);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 6:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 8:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 10:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 12:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 13:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 14:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 15:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create(lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        List listSingletonList;
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 2;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                ((yx3) obj2).g.f(((rrk0) obj3).e(), (Set) null);
                return rih1Var;
            case 1:
                hm5.M(obj);
                o95 o95Var = (o95) obj2;
                o95Var.d();
                Object objC = o95Var.c(obj3);
                o95Var.c.b.setValue(objC);
                o95Var.e.setValue(objC);
                return rih1Var;
            case 2:
                hm5.M(obj);
                dgo dgoVar = (dgo) obj3;
                xn10 xn10Var = dgoVar.g;
                if (xn10Var == null) {
                    eg.o();
                    return null;
                }
                xgf xgfVar = new xgf(new fhf(Uri.parse(xn10Var.e)), cuo1.J(dz61.d));
                if (xn10Var != null) {
                    return new wgf(xgfVar, new fhf(Uri.parse(xn10Var.d)), new r771(dgoVar.h));
                }
                eg.o();
                return null;
            case 3:
                hm5.M(obj);
                Set set = (Set) obj2;
                int size = set.size();
                if (size == 0) {
                    return new huz(qu90.a, (byte) 10);
                }
                hur hurVar = (hur) obj3;
                c9c0 c9c0Var = (c9c0) hurVar.b;
                if (size != 1) {
                    return hu20.e(new ow9(c9c0Var.b.current(), set, (byte) 2), new y3s((lnm) null, new sg0(1, (lnm) null, (byte) 8), (byte) 1));
                }
                String str2 = (String) o7h.p0(set);
                return hu20.e(new ld2(c9c0Var.b.current(), str2, (byte) 19), new y3s((lnm) null, new fpo(hurVar, str2, lnmVar, b3), (byte) 2));
            case 4:
                rfm1 rfm1Var = (rfm1) obj3;
                hm5.M(obj);
                ifm1 ifm1Var = ((ufm1) obj2).c.e;
                if (ifm1Var instanceof gfm1) {
                    return new wgf(new xgf(new fhf(Uri.parse(((gfm1) ifm1Var).a)), cuo1.J(dz61.d)), (fhf) null, new r771(rfm1Var.a.b));
                }
                if (ifm1Var instanceof hfm1) {
                    return new wgf(new xgf(new ehf((Integer) null, -16777216), cuo1.J(dz61.d)), (fhf) null, new r771(rfm1Var.a.b));
                }
                eg.o();
                return null;
            case 5:
                hm5.M(obj);
                Uri uri = (Uri) obj2;
                if (uri != null) {
                    return new wgf(new xgf(new fhf(uri), cuo1.J(((pdw) obj3).c.f)), (fhf) null, new r771(tyo1.p(blc0.sg, new String[0])));
                }
                return null;
            case 6:
                hm5.M(obj);
                e4j0.d((List) obj2, (e4j0) obj3);
                return rih1Var;
            case 7:
                hm5.M(obj);
                f7n0 f7n0Var = ((q6n0) obj2).b;
                bkc0 bkc0Var = (bkc0) obj3;
                Uri uri2 = (bkc0Var == null || (str = bkc0Var.a) == null) ? null : Uri.parse(str);
                int i = w6n0.b;
                if (!(f7n0Var instanceof f7n0) || uri2 == null) {
                    return null;
                }
                fhf fhfVar = new fhf(uri2);
                u771 u771Var = f7n0Var.a;
                return new wgf(new xgf(fhfVar, cuo1.J(u771Var.b.c)), (fhf) null, new r771(u771Var.a.b));
            case 8:
                hm5.M(obj);
                ooh0 ooh0Var = (ooh0) ((ji6) obj2).b;
                boolean z = ooh0Var.b;
                boolean z2 = ooh0Var.a;
                if (z && z2) {
                    ((qam1) obj3).a(4);
                }
                return rih1Var;
            case 9:
                hm5.M(obj);
                Uri uri3 = (Uri) obj2;
                if (uri3 != null) {
                    return new wgf(new xgf(new fhf(uri3), cuo1.J(dz61.d)), (fhf) null, new r771(tyo1.p(blc0.Ag, new String[]{((jz31) obj3).a})));
                }
                return null;
            case 10:
                hm5.M(obj);
                ((ove1) obj2).b(((SessionWorker) obj3).i.c);
                return rih1Var;
            case 11:
                hm5.M(obj);
                return p7h.M(new bk41[]{new bk41("topPlaylistsBackgroundLayer", Collections.singletonList((qj41) obj2)), new bk41("topPlaylistsListLayer", Collections.singletonList((f311) obj3))});
            case 12:
                hm5.M(obj);
                return p7h.M(new bk41[]{new bk41("topSongJourneyContendersBackgroundLayer", Collections.singletonList((lcf1) obj2)), new bk41("topSongJourneyContendersLayer", (List) obj3)});
            case 13:
                hm5.M(obj);
                return p7h.M(new bk41[]{new bk41("topSongJourneyRevealBackgroundLayer", Collections.singletonList((lcf1) obj2)), new bk41("topSongJourneyRevealLayer", Collections.singletonList((qj41) obj3))});
            case 14:
                hm5.M(obj);
                StoryCard storyCard = ((g7m1) obj2).a;
                bk41 bk41Var = new bk41("debug", Collections.singletonList(new nve1(l1d.m("Missing Story: ", storyCard.getId()))));
                ajh1 ajh1Var = (ajh1) obj3;
                if (cik1.h(storyCard.v(), 2)) {
                    cik1 cik1Var = ajh1Var.a;
                    String id = storyCard.getId();
                    CardShareConfiguration cardShareConfigurationV = storyCard.v();
                    gec gecVar = new gec(new Integer(-16777216), new Integer(-1), "Share", (String) null);
                    listSingletonList = Collections.singletonList(new u8r(new iec(gecVar, gecVar, new huz(Boolean.TRUE, (byte) 10), 1, new s8m1(new q8m1(id, cardShareConfigurationV, gecVar, 0, 24), cik1Var, b2))));
                } else {
                    listSingletonList = z6x.a;
                }
                return p7h.M(new bk41[]{bk41Var, new bk41("share", listSingletonList)});
            case 15:
                hm5.M(obj);
                j7j1 j7j1Var = (j7j1) obj2;
                ji0 ji0Var = j7j1Var.a;
                if (ji0Var != null) {
                    vi11 vi11Var = ((x8j1) obj3).d;
                    long j = j7j1Var.b;
                    o2u0 o2u0VarB = ((av0) vi11Var.c).b(ji0Var, ji0Var.g.b);
                    if (o2u0VarB == null) {
                        n57.e("No playable video found in ad");
                    } else {
                        uoa uoaVar = (uoa) vi11Var.e;
                        if (uoaVar != null) {
                            uoaVar.h(o2u0VarB, new oot0(j, 0L, false, false, (hu7) null, (tne1) null, false, 254));
                        } else {
                            n57.e("Player is not available. Setup first!");
                        }
                    }
                } else {
                    n57.e("Ad is null. Cannot play.");
                }
                return rih1Var;
            case 16:
                hm5.M(obj);
                g7j1 g7j1Var = (g7j1) obj2;
                ji0 ji0Var2 = g7j1Var.a;
                if (ji0Var2 != null) {
                    pxc.a(((x8j1) obj3).h, ji0Var2, new Long(0L), g7j1Var.b, "mhpto", 16);
                } else {
                    n57.e("Ad is not actionable. Failed to navigate.");
                }
                return rih1Var;
            default:
                hm5.M(obj);
                hfm1 hfm1Var = (hfm1) obj2;
                return new bm31(hfm1Var.a, hfm1Var.b, (Map) obj3);
        }
    }
}
