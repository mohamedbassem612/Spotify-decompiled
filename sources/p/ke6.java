package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.v1.proto.SceneTemplate$RelationshipStatusContent$Card2;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ke6 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke6(ven0 ven0Var, g7m1 g7m1Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 5;
        this.b = ven0Var;
        this.e = g7m1Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                return new ke6(obj4, obj2, (a3k) obj, obj3, lnmVar, (byte) 0);
            case 1:
                return new ke6(obj4, obj2, (a3k) obj, obj3, lnmVar, (byte) 1);
            case 2:
                return new ke6(obj4, obj2, (a3k) obj, obj3, lnmVar, (byte) 2);
            case 3:
                return new ke6((qj41) obj2, obj4, (a3k) obj, (com.google.protobuf.h) obj3, lnmVar, (byte) 3);
            case 4:
                return new ke6((qj41) obj2, obj4, (a3k) obj, (com.google.protobuf.h) obj3, lnmVar, (byte) 4);
            default:
                return new ke6((ven0) obj4, (g7m1) obj3, (ven0) obj2, (ven0) obj, lnmVar);
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
            case 3:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(lnmVar).invokeSuspend(rih1Var);
            default:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                mmr0 mmr0Var = (mmr0) obj5;
                return f46.i0(new bk41[]{mmr0Var != null ? new bk41("artistCardsListBackgroundLayer", Collections.singletonList(new ej31((wj31) mmr0Var.a, (List) mmr0Var.b, (Map) null, (zu30) new wh((oe6) obj2, (g7m1) obj4, (byte) 4), 10))) : null, new bk41("artistCardsListLayer", Collections.singletonList((qj41) obj3))});
            case 1:
                hm5.M(obj);
                SceneTemplate.ListeningAgeContent.Card1 card1 = (SceneTemplate.ListeningAgeContent.Card1) obj4;
                se8 se8Var = (se8) obj2;
                return p7h.M(new bk41[]{new bk41("introAnimationLayer", Collections.singletonList(new ej31((wj31) obj5, (List) obj3, (Map) null, (zu30) null, 26))), new bk41("introTextLayer", Collections.singletonList(new thd0(new shd0(card1, (byte) 0), new shd0(card1, (byte) 1), pwo1.v(se8Var.b, se8Var.c))))});
            case 2:
                hm5.M(obj);
                SceneTemplate$RelationshipStatusContent$Card2 sceneTemplate$RelationshipStatusContent$Card2 = (SceneTemplate$RelationshipStatusContent$Card2) obj4;
                hab0 ao11Var = new ao11(sceneTemplate$RelationshipStatusContent$Card2, (byte) 0);
                ao11 ao11Var2 = new ao11(sceneTemplate$RelationshipStatusContent$Card2, (byte) 1);
                hab0 ao11Var3 = new ao11(sceneTemplate$RelationshipStatusContent$Card2, (byte) 2);
                se8 se8Var2 = (se8) obj2;
                boolean zV = pwo1.v(se8Var2.b, se8Var2.c);
                boolean zP = sceneTemplate$RelationshipStatusContent$Card2.p();
                boolean zQ = sceneTemplate$RelationshipStatusContent$Card2.q();
                ooh0 ooh0Var = new ooh0();
                ooh0Var.d = ao11Var;
                ooh0Var.e = ao11Var2;
                ooh0Var.f = ao11Var3;
                ooh0Var.g = (wj31) obj5;
                ooh0Var.h = (List) obj3;
                ooh0Var.a = zV;
                ooh0Var.b = zP;
                ooh0Var.c = zQ;
                return Collections.singletonList(new bk41("relationshipStatusRevealLayer", Collections.singletonList(new ji6(ooh0Var))));
            case 3:
                hm5.M(obj);
                SceneTemplate.TopAlbumsContent.Single single = (SceneTemplate.TopAlbumsContent.Single) obj4;
                t7f1 t7f1Var = (t7f1) obj2;
                return p7h.M(new bk41[]{new bk41("topAlbumsSingleBackgroundLayer", Collections.singletonList((qj41) obj3)), new bk41("topAlbumsSingleLayer", Collections.singletonList(new thd0(new u7f1(new s7f1(single, (byte) 0), (yj41) obj5, new s7f1(single, (byte) 1), new s7f1(single, (byte) 2), new s7f1(single, (byte) 3)), pwo1.v(t7f1Var.c, t7f1Var.d))))});
            case 4:
                hm5.M(obj);
                o9f1 o9f1Var = (o9f1) obj2;
                return p7h.M(new bk41[]{new bk41("topFivePodcastsBackgroundLayer", Collections.singletonList((qj41) obj3)), new bk41("topFivePodcastsLayer", Collections.singletonList(new jye1(new p9f1(new gsc1((SceneTemplate.TopFivePodcastsContent.Card1) obj4, (byte) 27), (List) obj5), pwo1.v(o9f1Var.d, o9f1Var.e))))});
            default:
                hm5.M(obj);
                ((ven0) obj5).setValue(((g7m1) obj4).d);
                ven0 ven0Var = (ven0) obj3;
                Boolean bool = Boolean.FALSE;
                ven0Var.setValue(bool);
                ((ven0) obj2).setValue(bool);
                ven0Var.setValue(Boolean.TRUE);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke6(Object obj, Object obj2, a3k a3kVar, Object obj3, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = a3kVar;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke6(qj41 qj41Var, Object obj, a3k a3kVar, com.google.protobuf.h hVar, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = qj41Var;
        this.b = obj;
        this.d = a3kVar;
        this.e = hVar;
    }
}
