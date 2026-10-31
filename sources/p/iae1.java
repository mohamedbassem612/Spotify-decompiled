package p;

import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iae1 {
    public static final long e;
    public final o0e1 a;
    public final yqg b;
    public final dt71 c;
    public final yc2 d;

    static {
        ytw0 ytw0Var = jfv.b;
        e = fdg1.k0(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, ngv.d);
    }

    public iae1(o0e1 o0e1Var, yqg yqgVar) {
        this.a = o0e1Var;
        this.b = yqgVar;
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        this.c = dt71VarE;
        this.d = new yc2(new m441(new xn2(e, dt71VarE, this, (lnm) null, (byte) 15)), (byte) 24);
    }
}
