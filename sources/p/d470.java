package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d470 extends hab0 implements iu30 {
    public final /* synthetic */ s370 a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ wgh1 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ n811 e;
    public final /* synthetic */ dh30 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ mev h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d470(s370 s370Var, c380 c380Var, wgh1 wgh1Var, float f, n811 n811Var, dh30 dh30Var, ven0 ven0Var, mev mevVar) {
        super(1);
        this.a = s370Var;
        this.b = c380Var;
        this.c = wgh1Var;
        this.d = f;
        this.e = n811Var;
        this.f = dh30Var;
        this.g = ven0Var;
        this.h = mevVar;
    }

    public final Object invoke(Object obj) {
        epb0 epb0Var = (epb0) obj;
        wgh1 wgh1Var = this.c;
        int i = wgh1Var.h;
        int i2 = 0;
        s370 s370Var = this.a;
        if (s370Var != null) {
            suo1.v(epb0Var, "header", new j2i(-1436633091, new b470(s370Var, wgh1Var, this.d, (byte) 0), true));
        }
        int i3 = 0;
        for (Object obj2 : this.b) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            y370 y370Var = (z370) obj2;
            if (y370Var instanceof w370) {
                w370 w370Var = (w370) y370Var;
                suo1.v(epb0Var, "hero-".concat(w370Var.g), new j2i(1793030900, new xo7(w370Var, i3, wgh1Var, this.f, (byte) 5), true));
            } else if (y370Var instanceof y370) {
                suo1.v(epb0Var, f4i1.c(i3, "title-"), new j2i(-344687267, new cex(y370Var, wgh1Var, (byte) 25), true));
            } else {
                boolean z = y370Var instanceof u370;
                n811 n811Var = this.e;
                ven0 ven0Var = this.g;
                if (z) {
                    c380 c380Var = ((u370) y370Var).a;
                    n811Var.a = c380Var.size();
                    List listD1 = o7h.d1(c380Var, ((Boolean) ven0Var.getValue()).booleanValue() ? n811Var.a : i);
                    wgh1 wgh1Var2 = wgh1Var;
                    int i5 = i2;
                    for (Object obj3 : listD1) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            p7h.T();
                            throw null;
                        }
                        r370 r370Var = (r370) obj3;
                        epb0.Q(epb0Var, r370Var.g, (Object) null, new j2i(-890598237, new b2(r370Var, i3, i5, wgh1Var2, this.h, listD1), true), 6);
                        wgh1Var2 = wgh1Var2;
                        i5 = i6;
                    }
                    wgh1Var = wgh1Var2;
                } else if (y370Var instanceof v370) {
                    if (i < n811Var.a) {
                        suo1.v(epb0Var, f4i1.c(i3, "grid-presentation-"), new j2i(1600545206, new xo7((v370) y370Var, i3, wgh1Var, ven0Var), true));
                    }
                } else if (y370Var instanceof t370) {
                    suo1.v(epb0Var, f4i1.c(i3, "card-group-"), new j2i(-191556422, new zo7((t370) y370Var, i3, wgh1Var, (byte) 3), true));
                } else if (y370Var instanceof x370) {
                    suo1.v(epb0Var, f4i1.c(i3, "progress-tracker-"), new j2i(-140512807, new zo7((x370) y370Var, i3, wgh1Var, (byte) 4), true));
                }
            }
            i3 = i4;
            i2 = 0;
        }
        return rih1.a;
    }
}
