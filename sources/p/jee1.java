package p;

import android.os.Trace;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jee1 extends pim0 implements zlb0, m7v, t161 {
    public String O0;
    public lee1 P0;
    public f930 Q0;
    public int R0;
    public boolean S0;
    public int T0;
    public int U0;
    public x9h V0;
    public HashMap W0;
    public xor0 X0;
    public hee1 Y0;
    public iee1 Z0;

    public final xor0 H1() {
        lee1 lee1Var = this.P0;
        xor0 xor0Var = this.X0;
        if (xor0Var == null) {
            xor0Var = new xor0(this.O0, lee1Var, this.Q0, this.R0, this.S0, this.T0, this.U0);
            this.X0 = xor0Var;
        }
        xor0Var.getClass();
        return xor0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    public final int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        xor0 xor0VarH1;
        iee1 iee1Var = this.Z0;
        if (iee1Var == null) {
            xor0VarH1 = H1();
        } else {
            if (!iee1Var.c) {
                iee1Var = null;
            }
            if (iee1Var == null || (xor0VarH1 = iee1Var.d) == null) {
                xor0VarH1 = H1();
            }
        }
        xor0VarH1.d(x5f0Var);
        return r2p1.h(xor0VarH1.e(x5f0Var.getLayoutDirection()).e());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    public final int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        xor0 xor0VarH1;
        iee1 iee1Var = this.Z0;
        if (iee1Var == null) {
            xor0VarH1 = H1();
        } else {
            if (!iee1Var.c) {
                iee1Var = null;
            }
            if (iee1Var == null || (xor0VarH1 = iee1Var.d) == null) {
                xor0VarH1 = H1();
            }
        }
        xor0VarH1.d(x5f0Var);
        return r2p1.h(xor0VarH1.e(x5f0Var.getLayoutDirection()).d());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x003d, B:21:0x0045, B:22:0x006f, B:12:0x0015), top: B:28:0x0005 }] */
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        xor0 xor0VarH1;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            iee1 iee1Var = this.Z0;
            if (iee1Var == null) {
                xor0VarH1 = H1();
            } else {
                if (!iee1Var.c) {
                    iee1Var = null;
                }
                if (iee1Var == null || (xor0VarH1 = iee1Var.d) == null) {
                    xor0VarH1 = H1();
                }
            }
            xor0VarH1.d(ifh0Var);
            boolean zB = xor0VarH1.b(j, ifh0Var.getLayoutDirection());
            uor0 uor0Var = xor0VarH1.n;
            if (uor0Var != null) {
                uor0Var.a();
            }
            nw4 nw4Var = xor0VarH1.j;
            nw4Var.getClass();
            w9e1 w9e1Var = nw4Var.d;
            long j2 = xor0VarH1.l;
            if (zB) {
                dio1.x(this);
                HashMap map = this.W0;
                if (map == null) {
                    map = new HashMap(2);
                    this.W0 = map;
                }
                map.put(xl3.a, Integer.valueOf(Math.round(w9e1Var.d(0) + 0.0f)));
                map.put(xl3.b, Integer.valueOf(Math.round(w9e1Var.d(w9e1Var.g - 1) + 0.0f)));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            q5t0 q5t0VarH = afh0Var.H(m5n1.v(i, i, i2, i2));
            HashMap map2 = this.W0;
            map2.getClass();
            return ifh0Var.S(i, i2, map2, new p6(q5t0VarH, (byte) 20));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.iu30] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.hee1] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void g(e261 e261Var) {
        hee1 hee1Var = this.Y0;
        ?? r0 = hee1Var;
        if (hee1Var == null) {
            final byte b = 0;
            ?? r1 = new iu30(this) { // from class: p.hee1
                public final /* synthetic */ jee1 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
                public final Object invoke(Object obj) {
                    wat watVar;
                    y9e1 y9e1Var;
                    byte b2 = b;
                    boolean z = true;
                    jee1 jee1Var = this.b;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            xor0 xor0VarH1 = jee1Var.H1();
                            lee1 lee1Var = jee1Var.P0;
                            x9h x9hVar = jee1Var.V0;
                            lee1 lee1VarF = lee1.f(lee1Var, x9hVar != null ? x9hVar.a() : u7h.k, 0L, (FontWeight) null, (FontFamily) null, 0L, 0, 0L, 16777214);
                            flb0 flb0Var = xor0VarH1.o;
                            y9e1 y9e1Var2 = null;
                            if (flb0Var == null || (watVar = xor0VarH1.i) == null) {
                                y9e1Var = null;
                            } else {
                                af5 af5Var = new af5(xor0VarH1.a);
                                if (xor0VarH1.j == null || xor0VarH1.n == null) {
                                    y9e1Var = null;
                                } else {
                                    long j = xor0VarH1.f172p & (-8589934589L);
                                    int i = xor0VarH1.f;
                                    boolean z2 = xor0VarH1.e;
                                    int i2 = xor0VarH1.d;
                                    f930 f930Var = xor0VarH1.c;
                                    z6x z6xVar = z6x.a;
                                    y9e1Var = new y9e1(new x9e1(af5Var, lee1VarF, z6xVar, i, z2, i2, watVar, flb0Var, f930Var, j), new zrm0(new wp20((List) z6xVar, af5Var, watVar, f930Var, lee1VarF, z2), j, xor0VarH1.f, xor0VarH1.d), xor0VarH1.l);
                                }
                            }
                            if (y9e1Var != null) {
                                list.add(y9e1Var);
                                y9e1Var2 = y9e1Var;
                            }
                            return Boolean.valueOf(y9e1Var2 != null);
                        case 1:
                            String str = ((af5) obj).b;
                            iee1 iee1Var = jee1Var.Z0;
                            if (iee1Var == null) {
                                iee1 iee1Var2 = new iee1(jee1Var.O0, str);
                                xor0 xor0Var = new xor0(str, jee1Var.P0, jee1Var.Q0, jee1Var.R0, jee1Var.S0, jee1Var.T0, jee1Var.U0);
                                xor0Var.d(jee1Var.H1().i);
                                iee1Var2.d = xor0Var;
                                jee1Var.Z0 = iee1Var2;
                            } else if (!u890.j(str, iee1Var.b)) {
                                iee1Var.b = str;
                                xor0 xor0Var2 = iee1Var.d;
                                if (xor0Var2 != null) {
                                    lee1 lee1Var2 = jee1Var.P0;
                                    f930 f930Var2 = jee1Var.Q0;
                                    int i3 = jee1Var.R0;
                                    boolean z3 = jee1Var.S0;
                                    int i4 = jee1Var.T0;
                                    int i5 = jee1Var.U0;
                                    xor0Var2.a = str;
                                    xor0Var2.b = lee1Var2;
                                    xor0Var2.c = f930Var2;
                                    xor0Var2.d = i3;
                                    xor0Var2.e = z3;
                                    xor0Var2.f = i4;
                                    xor0Var2.g = i5;
                                    xor0Var2.s = (xor0Var2.s << 2) | 2;
                                    xor0Var2.c();
                                }
                            }
                            nko1.C(jee1Var);
                            dio1.y(jee1Var);
                            ha71.x(jee1Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            iee1 iee1Var3 = jee1Var.Z0;
                            if (iee1Var3 == null) {
                                z = false;
                            } else {
                                iee1Var3.c = zBooleanValue;
                                nko1.C(jee1Var);
                                dio1.y(jee1Var);
                                ha71.x(jee1Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.Y0 = r1;
            r0 = r1;
        }
        b261.C(e261Var, new af5(this.O0));
        iee1 iee1Var = this.Z0;
        if (iee1Var != null) {
            boolean z = iee1Var.c;
            d261 d261Var = z161.E;
            mma0[] mma0VarArr = b261.a;
            mma0 mma0Var = mma0VarArr[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            d261Var.getClass();
            e261Var.b(d261Var, boolValueOf);
            af5 af5Var = new af5(iee1Var.b);
            d261 d261Var2 = z161.D;
            mma0 mma0Var2 = mma0VarArr[16];
            d261Var2.getClass();
            e261Var.b(d261Var2, af5Var);
        }
        final byte b2 = 1;
        e261Var.b(m161.l, new we((String) null, new iu30(this) { // from class: p.hee1
            public final /* synthetic */ jee1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
            public final Object invoke(Object obj) {
                wat watVar;
                y9e1 y9e1Var;
                byte b3 = b2;
                boolean z2 = true;
                jee1 jee1Var = this.b;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        xor0 xor0VarH1 = jee1Var.H1();
                        lee1 lee1Var = jee1Var.P0;
                        x9h x9hVar = jee1Var.V0;
                        lee1 lee1VarF = lee1.f(lee1Var, x9hVar != null ? x9hVar.a() : u7h.k, 0L, (FontWeight) null, (FontFamily) null, 0L, 0, 0L, 16777214);
                        flb0 flb0Var = xor0VarH1.o;
                        y9e1 y9e1Var2 = null;
                        if (flb0Var == null || (watVar = xor0VarH1.i) == null) {
                            y9e1Var = null;
                        } else {
                            af5 af5Var2 = new af5(xor0VarH1.a);
                            if (xor0VarH1.j == null || xor0VarH1.n == null) {
                                y9e1Var = null;
                            } else {
                                long j = xor0VarH1.f172p & (-8589934589L);
                                int i = xor0VarH1.f;
                                boolean z3 = xor0VarH1.e;
                                int i2 = xor0VarH1.d;
                                f930 f930Var = xor0VarH1.c;
                                z6x z6xVar = z6x.a;
                                y9e1Var = new y9e1(new x9e1(af5Var2, lee1VarF, z6xVar, i, z3, i2, watVar, flb0Var, f930Var, j), new zrm0(new wp20((List) z6xVar, af5Var2, watVar, f930Var, lee1VarF, z3), j, xor0VarH1.f, xor0VarH1.d), xor0VarH1.l);
                            }
                        }
                        if (y9e1Var != null) {
                            list.add(y9e1Var);
                            y9e1Var2 = y9e1Var;
                        }
                        return Boolean.valueOf(y9e1Var2 != null);
                    case 1:
                        String str = ((af5) obj).b;
                        iee1 iee1Var2 = jee1Var.Z0;
                        if (iee1Var2 == null) {
                            iee1 iee1Var3 = new iee1(jee1Var.O0, str);
                            xor0 xor0Var = new xor0(str, jee1Var.P0, jee1Var.Q0, jee1Var.R0, jee1Var.S0, jee1Var.T0, jee1Var.U0);
                            xor0Var.d(jee1Var.H1().i);
                            iee1Var3.d = xor0Var;
                            jee1Var.Z0 = iee1Var3;
                        } else if (!u890.j(str, iee1Var2.b)) {
                            iee1Var2.b = str;
                            xor0 xor0Var2 = iee1Var2.d;
                            if (xor0Var2 != null) {
                                lee1 lee1Var2 = jee1Var.P0;
                                f930 f930Var2 = jee1Var.Q0;
                                int i3 = jee1Var.R0;
                                boolean z4 = jee1Var.S0;
                                int i4 = jee1Var.T0;
                                int i5 = jee1Var.U0;
                                xor0Var2.a = str;
                                xor0Var2.b = lee1Var2;
                                xor0Var2.c = f930Var2;
                                xor0Var2.d = i3;
                                xor0Var2.e = z4;
                                xor0Var2.f = i4;
                                xor0Var2.g = i5;
                                xor0Var2.s = (xor0Var2.s << 2) | 2;
                                xor0Var2.c();
                            }
                        }
                        nko1.C(jee1Var);
                        dio1.y(jee1Var);
                        ha71.x(jee1Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        iee1 iee1Var4 = jee1Var.Z0;
                        if (iee1Var4 == null) {
                            z2 = false;
                        } else {
                            iee1Var4.c = zBooleanValue;
                            nko1.C(jee1Var);
                            dio1.y(jee1Var);
                            ha71.x(jee1Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final byte b3 = 2;
        e261Var.b(m161.m, new we((String) null, new iu30(this) { // from class: p.hee1
            public final /* synthetic */ jee1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
            public final Object invoke(Object obj) {
                wat watVar;
                y9e1 y9e1Var;
                byte b4 = b3;
                boolean z2 = true;
                jee1 jee1Var = this.b;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        xor0 xor0VarH1 = jee1Var.H1();
                        lee1 lee1Var = jee1Var.P0;
                        x9h x9hVar = jee1Var.V0;
                        lee1 lee1VarF = lee1.f(lee1Var, x9hVar != null ? x9hVar.a() : u7h.k, 0L, (FontWeight) null, (FontFamily) null, 0L, 0, 0L, 16777214);
                        flb0 flb0Var = xor0VarH1.o;
                        y9e1 y9e1Var2 = null;
                        if (flb0Var == null || (watVar = xor0VarH1.i) == null) {
                            y9e1Var = null;
                        } else {
                            af5 af5Var2 = new af5(xor0VarH1.a);
                            if (xor0VarH1.j == null || xor0VarH1.n == null) {
                                y9e1Var = null;
                            } else {
                                long j = xor0VarH1.f172p & (-8589934589L);
                                int i = xor0VarH1.f;
                                boolean z3 = xor0VarH1.e;
                                int i2 = xor0VarH1.d;
                                f930 f930Var = xor0VarH1.c;
                                z6x z6xVar = z6x.a;
                                y9e1Var = new y9e1(new x9e1(af5Var2, lee1VarF, z6xVar, i, z3, i2, watVar, flb0Var, f930Var, j), new zrm0(new wp20((List) z6xVar, af5Var2, watVar, f930Var, lee1VarF, z3), j, xor0VarH1.f, xor0VarH1.d), xor0VarH1.l);
                            }
                        }
                        if (y9e1Var != null) {
                            list.add(y9e1Var);
                            y9e1Var2 = y9e1Var;
                        }
                        return Boolean.valueOf(y9e1Var2 != null);
                    case 1:
                        String str = ((af5) obj).b;
                        iee1 iee1Var2 = jee1Var.Z0;
                        if (iee1Var2 == null) {
                            iee1 iee1Var3 = new iee1(jee1Var.O0, str);
                            xor0 xor0Var = new xor0(str, jee1Var.P0, jee1Var.Q0, jee1Var.R0, jee1Var.S0, jee1Var.T0, jee1Var.U0);
                            xor0Var.d(jee1Var.H1().i);
                            iee1Var3.d = xor0Var;
                            jee1Var.Z0 = iee1Var3;
                        } else if (!u890.j(str, iee1Var2.b)) {
                            iee1Var2.b = str;
                            xor0 xor0Var2 = iee1Var2.d;
                            if (xor0Var2 != null) {
                                lee1 lee1Var2 = jee1Var.P0;
                                f930 f930Var2 = jee1Var.Q0;
                                int i3 = jee1Var.R0;
                                boolean z4 = jee1Var.S0;
                                int i4 = jee1Var.T0;
                                int i5 = jee1Var.U0;
                                xor0Var2.a = str;
                                xor0Var2.b = lee1Var2;
                                xor0Var2.c = f930Var2;
                                xor0Var2.d = i3;
                                xor0Var2.e = z4;
                                xor0Var2.f = i4;
                                xor0Var2.g = i5;
                                xor0Var2.s = (xor0Var2.s << 2) | 2;
                                xor0Var2.c();
                            }
                        }
                        nko1.C(jee1Var);
                        dio1.y(jee1Var);
                        ha71.x(jee1Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        iee1 iee1Var4 = jee1Var.Z0;
                        if (iee1Var4 == null) {
                            z2 = false;
                        } else {
                            iee1Var4.c = zBooleanValue;
                            nko1.C(jee1Var);
                            dio1.y(jee1Var);
                            ha71.x(jee1Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        e261Var.b(m161.n, new we((String) null, new ww21(this, (byte) 25)));
        b261.b(e261Var, (iu30) r0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        xor0 xor0VarH1;
        iee1 iee1Var = this.Z0;
        if (iee1Var == null) {
            xor0VarH1 = H1();
        } else {
            if (!iee1Var.c) {
                iee1Var = null;
            }
            if (iee1Var == null || (xor0VarH1 = iee1Var.d) == null) {
                xor0VarH1 = H1();
            }
        }
        xor0VarH1.d(x5f0Var);
        return xor0VarH1.a(i, x5f0Var.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    public final void t0(lsl lslVar) {
        xor0 xor0VarH1;
        if (((pim0) this).N0) {
            iee1 iee1Var = this.Z0;
            if (iee1Var == null) {
                xor0VarH1 = H1();
            } else {
                if (!iee1Var.c) {
                    iee1Var = null;
                }
                if (iee1Var == null || (xor0VarH1 = iee1Var.d) == null) {
                    xor0VarH1 = H1();
                }
            }
            nw4 nw4Var = xor0VarH1.j;
            if (nw4Var == null) {
                tf80.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.X0 + ", textSubstitution=" + this.Z0 + ")");
                jah.d();
                return;
            }
            fid fidVarP = lslVar.a1().p();
            boolean z = xor0VarH1.k;
            if (z) {
                long j = xor0VarH1.l;
                fidVarP.q();
                fidVarP.g(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                lee1 lee1Var = this.P0;
                zma1 zma1Var = lee1Var.a;
                TextDecoration textDecoration = zma1Var.m;
                if (textDecoration == null) {
                    textDecoration = TextDecoration.b;
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = zma1Var.n;
                if (shadow == null) {
                    shadow = Shadow.d;
                }
                Shadow shadow2 = shadow;
                z520 z520Var = zma1Var.p;
                if (z520Var == null) {
                    z520Var = z520.a;
                }
                z520 z520Var2 = z520Var;
                Brush brushB = lee1Var.b();
                if (brushB != null) {
                    nw4Var.g(fidVarP, brushB, lee1Var.a.a.b(), shadow2, textDecoration2, z520Var2);
                } else {
                    x9h x9hVar = this.V0;
                    long jA = x9hVar != null ? x9hVar.a() : u7h.k;
                    if (jA == 16) {
                        jA = lee1Var.c() != 16 ? lee1Var.c() : u7h.b;
                    }
                    nw4Var.f(fidVarP, jA, shadow2, textDecoration2, z520Var2);
                }
            } finally {
                if (z) {
                    fidVarP.i();
                }
            }
        }
    }

    public final boolean w1() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        xor0 xor0VarH1;
        iee1 iee1Var = this.Z0;
        if (iee1Var == null) {
            xor0VarH1 = H1();
        } else {
            if (!iee1Var.c) {
                iee1Var = null;
            }
            if (iee1Var == null || (xor0VarH1 = iee1Var.d) == null) {
                xor0VarH1 = H1();
            }
        }
        xor0VarH1.d(x5f0Var);
        return xor0VarH1.a(i, x5f0Var.getLayoutDirection());
    }
}
