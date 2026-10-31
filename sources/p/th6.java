package p;

import android.net.Uri;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.v1.proto.SceneTemplate$WrappedPlacesContent$Card1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class th6 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th6(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return new th6((qj41) obj3, (wh6) obj2, (vh6) obj, lnmVar, (byte) 0);
            case 1:
                return new th6((qj41) obj3, (se8) obj2, (SceneTemplate.AudiobooksContent.Card3) obj, lnmVar, (byte) 1);
            case 2:
                return new th6((y6a) obj3, (z7a) obj2, (d3j0) obj, lnmVar, (byte) 2);
            case 3:
                return new th6((vxv0) obj3, (c380) obj2, (f6h) obj, lnmVar, (byte) 3);
            case 4:
                return new th6((vxv0) obj3, (c380) obj2, (nt30) obj, lnmVar, (byte) 4);
            case 5:
                return new th6((vxv0) obj3, (c380) obj2, (aqa) obj, lnmVar, (byte) 5);
            case 6:
                return new th6((ven0) obj3, (ji6) obj2, (qam1) obj, lnmVar, (byte) 6);
            default:
                return new th6((qj41) obj3, (se8) obj2, (SceneTemplate$WrappedPlacesContent$Card1) obj, lnmVar, (byte) 7);
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
                create(lnmVar).invokeSuspend(rih1Var);
                return Boolean.TRUE;
            case 3:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 6:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create(lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                hm5.M(obj);
                return f46.i0(new bk41[]{new bk41("artistCardsRevealBackgroundLayer", Collections.singletonList((qj41) obj2)), new bk41("artistCardsRevealLayer", Collections.singletonList(new ji6((wh6) obj3, (xf6) ((vh6) obj4).h)))});
            case 1:
                hm5.M(obj);
                SceneTemplate.AudiobooksContent.Card3 card3 = (SceneTemplate.AudiobooksContent.Card3) obj4;
                se8 se8Var = (se8) obj3;
                return p7h.M(new bk41[]{new bk41("audiobooksBackgroundLayer", Collections.singletonList((qj41) obj2)), new bk41("audiobooksYearBookLayer", Collections.singletonList(new ji6(new rl1(new hf8(card3, (byte) 0), new hf8(card3, (byte) 1), new hf8(card3, (byte) 2), pwo1.v(se8Var.b, se8Var.c), (byte) 4))))});
            case 2:
                hm5.M(obj);
                y6a y6aVar = (y6a) obj2;
                z7a z7aVar = (z7a) obj3;
                bpb1 bpb1Var = y6aVar.d;
                j6w0 j6w0Var = (j6w0) bpb1Var.getValue();
                if (u890.j(j6w0Var != null ? j6w0Var.a : null, z7aVar)) {
                    bpb1Var.l((Object) null);
                }
                fn31.T(z7aVar.b, (o8n) null, 0, new wc5(y6aVar, z7aVar, (d3j0) obj4, (lnm) null, (byte) 25), 3);
                return Boolean.TRUE;
            case 3:
                hm5.M(obj);
                List listL1 = o7h.l1((c380) obj3);
                Uri uri = ((f6h) obj4).f;
                if (aq8.B(listL1) || uri == null) {
                    return null;
                }
                return new bkc0(uri.toString(), (String) null, 62, (String) null);
            case 4:
                hm5.M(obj);
                List listL2 = o7h.l1((c380) obj3);
                Uri uri2 = ((nt30) obj4).c;
                if (aq8.B(listL2) || uri2 == null) {
                    return null;
                }
                return new bkc0(uri2.toString(), (String) null, 62, (String) null);
            case 5:
                hm5.M(obj);
                List listL3 = o7h.l1((c380) obj3);
                Uri uri3 = ((aqa) obj4).e;
                if (aq8.B(listL3) || uri3 == null) {
                    return null;
                }
                return new bkc0(uri3.toString(), (String) null, 62, (String) null);
            case 6:
                hm5.M(obj);
                ((ven0) obj2).setValue(Boolean.TRUE);
                if (((ooh0) ((ji6) obj3).b).c) {
                    sam1.a((qam1) obj4);
                }
                return rih1.a;
            default:
                hm5.M(obj);
                SceneTemplate$WrappedPlacesContent$Card1 sceneTemplate$WrappedPlacesContent$Card1 = (SceneTemplate$WrappedPlacesContent$Card1) obj4;
                se8 se8Var2 = (se8) obj3;
                return p7h.M(new bk41[]{new bk41("wrappedPlacesIntroBackgroundLayer", Collections.singletonList((qj41) obj2)), new bk41("wrappedPlacesIntroLayer", Collections.singletonList(new jye1(new fdm1(sceneTemplate$WrappedPlacesContent$Card1, (byte) 0), new fdm1(sceneTemplate$WrappedPlacesContent$Card1, (byte) 1), pwo1.v(se8Var2.b, se8Var2.c))))});
        }
    }
}
