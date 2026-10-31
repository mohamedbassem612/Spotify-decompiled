package p;

import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class sdm1 {
    public static final pxg1 a;
    public static final pxg1 b;
    public static final pxg1 c;
    public static final pxg1 d;
    public static final pxg1 e;
    public static final pxg1 f;
    public static final float g;
    public static final float h;

    static {
        ilv.a.getClass();
        ceo ceoVar = flv.g;
        a = new pxg1(700, 100, ceoVar);
        b = new pxg1(700, 200, ceoVar);
        ceo ceoVar2 = flv.d;
        c = new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 500, ceoVar2);
        d = new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 1500, ceoVar2);
        e = irn1.o0(500, 0, ceoVar2, 2);
        f = irn1.o0(3000, 0, flv.e, 2);
        g = 50.0f;
        h = 6.0f;
    }
}
