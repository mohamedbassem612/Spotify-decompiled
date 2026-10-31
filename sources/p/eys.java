package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eys {
    public static final mhh1 d;
    public final phh1 a;
    public final qhh1 b;
    public final nh4 c;

    static {
        h380 h380VarA = j380.a();
        Boolean bool = Boolean.TRUE;
        h380VarA.e("link", bool);
        h380VarA.e("name", bool);
        h380VarA.e("offline", bool);
        h380VarA.e("isNew", bool);
        h380VarA.e("isInListenLater", bool);
        h380VarA.e("isPlayed", bool);
        h380VarA.e("length", bool);
        h380VarA.e("timeLeft", bool);
        h380VarA.e("playable", bool);
        h380VarA.e("available", bool);
        h380VarA.e("covers", bool);
        h380VarA.e("isExplicit", bool);
        h380VarA.e("freezeFrames", bool);
        h380VarA.e("manifestId", bool);
        h380VarA.e("mediaTypeEnum", bool);
        h380VarA.e("description", bool);
        h380VarA.e("publishDate", bool);
        h380 h380VarA2 = j380.a();
        h380VarA2.e("name", bool);
        h380VarA2.e("link", bool);
        h380VarA2.e("inCollection", bool);
        h380VarA2.e("covers", bool);
        aqa0.Companion.getClass();
        aqa0 aqa0Var = new aqa0(h380VarA2.b(true));
        e3z.Companion.getClass();
        e3z e3zVar = new e3z(aqa0Var, z6x.a, h380VarA.b(true));
        zar.Companion.getClass();
        d = new mhh1(new uav0(new zar(e3zVar)), new nqz0(3));
    }

    public eys(phh1 phh1Var, qhh1 qhh1Var, nh4 nh4Var) {
        this.a = phh1Var;
        this.b = qhh1Var;
        this.c = nh4Var;
    }
}
