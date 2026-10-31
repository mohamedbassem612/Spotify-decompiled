package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class c2t {
    public static final List A;
    public static final z6x B;
    public static final List C;
    public static final List a = p7h.M(new Integer[]{2, 4, 8, 12, 16, 32});
    public static final Set b = Collections.singleton(12);
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final List j;
    public static final List k;
    public static final List l;
    public static final List m;
    public static final List n;
    public static final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List f2p;
    public static final List q;
    public static final List r;
    public static final z6x s;
    public static final List t;
    public static final List u;
    public static final List v;
    public static final List w;
    public static final List x;
    public static final z6x y;
    public static final List z;

    static {
        b8w0 b8w0Var = b8w0.SimpleFade;
        b8w0 b8w0Var2 = b8w0.BassSwap;
        b8w0 b8w0Var3 = b8w0.EqSwap;
        b8w0 b8w0Var4 = b8w0.BassSwapLowPassFilterIn;
        b8w0 b8w0Var5 = b8w0.BassSwapFilterIn;
        b8w0 b8w0Var6 = b8w0.SimpleCut;
        c = p7h.M(new b8w0[]{b8w0Var, b8w0Var2, b8w0Var3, b8w0Var4, b8w0Var5, b8w0Var6});
        duk1 duk1Var = duk1.CrossShape;
        duk1 duk1Var2 = duk1.FullOverlap;
        duk1 duk1Var3 = duk1.SlowInSlowOut;
        duk1 duk1Var4 = duk1.FastInAtStartSlowOut;
        duk1 duk1Var5 = duk1.SlowInFastOutAtEnd;
        duk1 duk1Var6 = duk1.Cut;
        duk1 duk1Var7 = duk1.Crossfade;
        d = p7h.M(new duk1[]{duk1Var, duk1Var2, duk1Var3, duk1Var4, duk1Var5, duk1Var6, duk1Var7});
        jez jezVar = jez.BassSwap;
        jez jezVar2 = jez.BassSwapAtEnd;
        jez jezVar3 = jez.EqSwap;
        jez jezVar4 = jez.None;
        e = p7h.M(new jez[]{jezVar, jezVar2, jezVar3, jezVar4});
        ha20 ha20Var = ha20.None;
        ha20 ha20Var2 = ha20.LowPassFilterOut;
        ha20 ha20Var3 = ha20.LowPassFilterIn;
        ha20 ha20Var4 = ha20.LowPassFilterInLowPassFilterOut;
        ha20 ha20Var5 = ha20.LowPassFilterInFilterOut;
        ha20 ha20Var6 = ha20.FilterOut;
        ha20 ha20Var7 = ha20.FilterIn;
        ha20 ha20Var8 = ha20.FilterInFilterOut;
        ha20 ha20Var9 = ha20.FilterInLowPassFilterOut;
        f = p7h.M(new ha20[]{ha20Var, ha20Var2, ha20Var3, ha20Var4, ha20Var5, ha20Var6, ha20Var7, ha20Var8, ha20Var9});
        g = p7h.M(new b8w0[]{b8w0Var, b8w0Var2, b8w0Var3, b8w0Var4, b8w0Var5, b8w0Var6});
        duk1 duk1Var8 = duk1.SlowInSemiFastOutAtEnd;
        h = p7h.M(new duk1[]{duk1Var, duk1Var2, duk1Var3, duk1Var4, duk1Var5, duk1Var6, duk1Var7, duk1Var8});
        jez jezVar5 = jez.StartFadeOut;
        jez jezVar6 = jez.BassSwapAtStart;
        jez jezVar7 = jez.BassCuts;
        jez jezVar8 = jez.NoBass;
        i = p7h.M(new jez[]{jezVar, jezVar2, jezVar3, jezVar6, jezVar7, jezVar8, jezVar5, jezVar4});
        j = p7h.M(new ha20[]{ha20Var, ha20Var2, ha20Var3, ha20Var4, ha20Var5, ha20Var6, ha20Var7, ha20Var8, ha20Var9});
        k = p7h.M(new b8w0[]{b8w0Var, b8w0Var2, b8w0Var3, b8w0Var4, b8w0Var5, b8w0Var6});
        l = p7h.M(new duk1[]{duk1Var, duk1Var2, duk1Var3, duk1Var4, duk1Var5, duk1Var6, duk1Var7, duk1Var8});
        m = p7h.M(new jez[]{jezVar, jezVar2, jezVar3, jezVar7, jezVar8, jezVar4});
        n = p7h.M(new ha20[]{ha20Var, ha20Var2, ha20Var3, ha20Var4, ha20Var5, ha20Var6, ha20Var7, ha20Var8, ha20Var9});
        o = p7h.M(new b8w0[]{b8w0Var, b8w0Var2, b8w0Var3, b8w0Var4, b8w0Var5, b8w0Var6});
        f2p = p7h.M(new duk1[]{duk1Var, duk1Var2, duk1Var3, duk1Var4, duk1Var5, duk1Var6, duk1Var7, duk1Var8});
        q = p7h.M(new jez[]{jezVar, jezVar2, jezVar6, jezVar3, jezVar7, jezVar8, jezVar4});
        r = p7h.M(new ha20[]{ha20Var, ha20Var2, ha20Var3, ha20Var4, ha20Var5, ha20Var6, ha20Var7, ha20Var8, ha20Var9});
        z6x z6xVar = z6x.a;
        s = z6xVar;
        t = p7h.M(new duk1[]{duk1Var, duk1Var2, duk1Var3, duk1Var4, duk1Var5, duk1Var6, duk1Var7, duk1Var8, duk1.FadeInOneBarCutOut, duk1.OverlapOneBarCutOut});
        u = p7h.M(new b8w0[]{b8w0Var, b8w0Var2, b8w0Var3, b8w0Var4, b8w0Var5, b8w0Var6, b8w0.Dissolve, b8w0.Surge, b8w0.Afterglow});
        v = p7h.M(new jez[]{jezVar, jezVar2, jezVar6, jezVar3, jezVar7, jezVar8, jez.BassFadeOut, jezVar4});
        w = p7h.M(new ha20[]{ha20Var, ha20Var2, ha20Var3, ha20Var4, ha20Var5, ha20Var6, ha20Var7, ha20Var8, ha20Var9, ha20.HighPassFilterHalfOut, ha20.NoiseOutEnd});
        x = p7h.M(new rx30[]{rx30.None, rx30.ReverbOutCentre, rx30.ReverbCutEnd, rx30.ReverbOutEnd, rx30.EchoHalfCutEnd, rx30.EchoHalfOutEnd, rx30.Echo3QCutEnd, rx30.Echo3QOutEnd, rx30.Echo1CutEnd, rx30.Echo1OutEnd, rx30.DelayHalfCutEnd, rx30.Delay3QCutEnd});
        y = z6xVar;
        m7f0 m7f0Var = m7f0.HalvingEnd;
        m7f0 m7f0Var2 = m7f0.None;
        m7f0 m7f0Var3 = m7f0.OneBeat;
        m7f0 m7f0Var4 = m7f0.TwoBeat;
        m7f0 m7f0Var5 = m7f0.FourBeat;
        m7f0 m7f0Var6 = m7f0.EightBeat;
        m7f0 m7f0Var7 = m7f0.SixteenBeat;
        z = p7h.M(new m7f0[]{m7f0Var2, m7f0Var3, m7f0Var4, m7f0Var5, m7f0Var6, m7f0Var7, m7f0Var});
        A = p7h.M(new m7f0[]{m7f0Var2, m7f0Var3, m7f0Var4, m7f0Var5, m7f0Var6, m7f0Var7});
        B = z6xVar;
        C = p7h.M(new vaa0[]{vaa0.None, vaa0.SpinbackEnd1Beat, vaa0.SpinbackEnd2Beat, vaa0.SpinbackEnd4Beat, vaa0.VinylStopFast4End, vaa0.VinylStopFast2End, vaa0.VinylStopFast1End, vaa0.VinylStopSlowEnd});
    }
}
