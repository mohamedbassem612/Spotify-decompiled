package p;

import com.spotify.wrapped.v1.proto.AudioPreview;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kme1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kme1(ven0 ven0Var, jia jiaVar, ven0 ven0Var2, SceneTemplate.TopSongJourneyContent.Card2 card2, pcf1 pcf1Var, ven0 ven0Var3, lnm lnmVar) {
        super(1, lnmVar);
        this.f = ven0Var;
        this.c = jiaVar;
        this.g = ven0Var2;
        this.b = card2;
        this.d = pcf1Var;
        this.e = ven0Var3;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.g;
        Object obj5 = this.c;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                return new kme1((wj31) obj5, (List) obj3, (List) obj2, (bbc) obj, (ven0) obj6, (ven0) obj4, lnmVar);
            case 1:
                return new kme1((qj41) obj5, (g7f1) obj2, (SceneTemplate.TopAlbumsContent.List) obj, (g7m1) obj6, (List) obj3, (kia) obj4, lnmVar);
            case 2:
                return new kme1((g7m1) obj, (List) obj3, (SceneTemplate.TopGenreContent.Card2) obj6, (wj31) obj5, (List) obj2, (ebf1) obj4, lnmVar);
            default:
                return new kme1((ven0) obj6, (jia) obj5, (ven0) obj4, (SceneTemplate.TopSongJourneyContent.Card2) obj3, (pcf1) obj2, (ven0) obj, lnmVar);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 1:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(lnmVar).invokeSuspend(rih1Var);
            default:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x017d  */
    public final Object invokeSuspend(Object obj) {
        String str;
        byte b = this.a;
        String str2 = null;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.c;
        Object obj6 = this.f;
        Object obj7 = this.g;
        switch (b) {
            case 0:
                hm5.M(obj);
                return p7h.M(new bk41[]{new bk41("timeMachineBackgroundLayer", Collections.singletonList(new ej31((wj31) obj5, (List) obj3, Collections.singletonMap("transitionComplete", new ro8((bbc) obj4, null, (byte) 27)), (zu30) new juy0((ven0) obj6, (ven0) obj7, (byte) 10), 2))), new bk41("timeMachineContentLayer", (List) obj2)});
            case 1:
                hm5.M(obj);
                bk41 bk41Var = new bk41("topAlbumsListBackgroundLayer", Collections.singletonList((qj41) obj5));
                g7f1 g7f1Var = (g7f1) obj2;
                SceneTemplate.TopAlbumsContent.List list = (SceneTemplate.TopAlbumsContent.List) obj4;
                list.getClass();
                String id = ((g7m1) obj6).a.getId();
                gsc1 gsc1Var = new gsc1(list, (byte) 24);
                h290 h290VarN = list.n();
                List list2 = (List) obj3;
                Iterator it = h290VarN.iterator();
                Iterator it2 = list2.iterator();
                ArrayList arrayList = new ArrayList(Math.min(q7h.U(h290VarN, 10), q7h.U(list2, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    Object next = it.next();
                    yj41 yj41Var = (yj41) it2.next();
                    SceneTemplate.TopAlbumsContent.List.RankedAlbumSummary rankedAlbumSummary = (SceneTemplate.TopAlbumsContent.List.RankedAlbumSummary) next;
                    rankedAlbumSummary.getClass();
                    AudioPreview audioPreviewS = rankedAlbumSummary.s();
                    String url = audioPreviewS.getUrl();
                    if (url.length() == 0) {
                        url = str2;
                    }
                    rx7 rx7Var = url != null ? new rx7(url, u3k.m(audioPreviewS), u3k.j(audioPreviewS)) : null;
                    h7f1 h7f1Var = new h7f1(rankedAlbumSummary);
                    i7f1 i7f1Var = new i7f1(rankedAlbumSummary);
                    j7f1 j7f1Var = new j7f1(rankedAlbumSummary);
                    String strO = rankedAlbumSummary.o();
                    String strN = rankedAlbumSummary.n();
                    if (rx7Var != null) {
                        strN.getClass();
                        if (ihc1.y0(strN)) {
                            str = null;
                        } else {
                            str = strN;
                        }
                    } else {
                        str = null;
                    }
                    arrayList.add(new k7f1(h7f1Var, i7f1Var, j7f1Var, yj41Var, strO, rx7Var, str));
                    str2 = null;
                }
                return p7h.M(new bk41[]{bk41Var, new bk41("topAlbumsListLayer", Collections.singletonList(new ce6(new l7f1(id, gsc1Var, mqo1.A(o7h.d1(arrayList, 5)), list.q()), pwo1.v(g7f1Var.b, g7f1Var.c), g7f1Var.g, new nda1(0, (kia) obj7, kia.class, "reset", "reset()V", 0, (byte) 26), new k7b1(1, (kia) obj7, kia.class, "select", "select(I)V", 0, (byte) 26))))});
            case 2:
                hm5.M(obj);
                g7m1 g7m1Var = (g7m1) obj4;
                SceneTemplate.TopGenreContent.Card2 card2 = (SceneTemplate.TopGenreContent.Card2) obj6;
                ebf1 ebf1Var = (ebf1) obj7;
                return Collections.singletonList(new bk41("topGenreListLayer", Collections.singletonList(new lf6(new fbf1(g7m1Var.a.getId(), new gsc1(card2, (byte) 29), (List) obj3, card2.r(), card2.q()), (wj31) obj5, (List) obj2, g7m1Var.e, pwo1.v(ebf1Var.c, ebf1Var.d), ebf1Var.f))));
            default:
                hm5.M(obj);
                ((ven0) obj6).setValue((jia) obj5);
                ven0 ven0Var = (ven0) obj7;
                Boolean bool = Boolean.FALSE;
                ((ven0) obj4).setValue(bool);
                ven0Var.setValue(bool);
                ven0Var.setValue(Boolean.TRUE);
                SceneTemplate.TopSongJourneyContent.Card2 card3 = (SceneTemplate.TopSongJourneyContent.Card2) obj3;
                if (card3.r() && !ihc1.y0(card3.n().getUrl())) {
                    xgm1 xgm1Var = ((pcf1) obj2).i;
                    String url2 = card3.n().getUrl();
                    AudioPreview audioPreviewN = card3.n();
                    xgm1Var.a(new lgm1(url2, audioPreviewN.w() ? new tal1(audioPreviewN.t().p(), audioPreviewN.t().n()) : sal1.a, null));
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kme1(wj31 wj31Var, List list, List list2, bbc bbcVar, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(1, lnmVar);
        this.c = wj31Var;
        this.b = list;
        this.d = list2;
        this.e = bbcVar;
        this.f = ven0Var;
        this.g = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kme1(qj41 qj41Var, g7f1 g7f1Var, SceneTemplate.TopAlbumsContent.List list, g7m1 g7m1Var, List list2, kia kiaVar, lnm lnmVar) {
        super(1, lnmVar);
        this.c = qj41Var;
        this.d = g7f1Var;
        this.e = list;
        this.f = g7m1Var;
        this.b = list2;
        this.g = kiaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kme1(g7m1 g7m1Var, List list, SceneTemplate.TopGenreContent.Card2 card2, wj31 wj31Var, List list2, ebf1 ebf1Var, lnm lnmVar) {
        super(1, lnmVar);
        this.e = g7m1Var;
        this.b = list;
        this.f = card2;
        this.c = wj31Var;
        this.d = list2;
        this.g = ebf1Var;
    }
}
