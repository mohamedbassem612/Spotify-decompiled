package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class t4k {
    public static final kiv a = mod.t(new ya4((byte) 11));
    public static final kiv b = mod.t(new ya4((byte) 13));
    public static final kiv c = mod.t(new ya4((byte) 19));
    public static final kiv d = mod.t(new ya4((byte) 20));
    public static final kiv e = mod.t(new ya4((byte) 21));
    public static final kiv f = mod.t(new ya4((byte) 23));
    public static final kiv g = mod.t(new ya4((byte) 24));
    public static final kiv h = mod.t(new ya4((byte) 25));
    public static final kiv i = mod.t(new ya4((byte) 26));
    public static final kiv j = mod.t(new ya4((byte) 27));
    public static final kiv k = mod.t(new ya4((byte) 22));
    public static final kiv l = mod.t(new ya4((byte) 28));
    public static final kiv m = mod.t(new ya4((byte) 29));
    public static final kiv n = mod.t(new n4k((byte) 0));
    public static final kiv o = mod.t(new n4k((byte) 1));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final kiv f112p;
    public static final kiv q;
    public static final kiv r;
    public static final kiv s;
    public static final kiv t;
    public static final kiv u;
    public static final kiv v;
    public static final kiv w;
    public static final kiv x;
    public static final kiv y;

    static {
        mod.i(new ia4((byte) 6));
        f112p = mod.t(new n4k((byte) 2));
        q = mod.t(new n4k((byte) 3));
        r = mod.t(new n4k((byte) 4));
        s = mod.t(new ya4((byte) 12));
        t = mod.t(new ya4((byte) 14));
        u = mod.t(new ya4((byte) 15));
        v = mod.t(new ya4((byte) 16));
        w = mod.t(new ya4((byte) 17));
        x = mod.h(new ya4((byte) 18));
        y = mod.t(new n4k((byte) 5));
    }

    public static final void a(oxq0 oxq0Var, f65 f65Var, vu30 vu30Var, b0k b0kVar, int i2) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1925803616);
        int i3 = i2 | (x340Var.g(oxq0Var) ? 4 : 2) | (x340Var.g(f65Var) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            ha4 ha4Var = (ha4) oxq0Var;
            ely0 ely0VarA = a.a(ha4Var.getAccessibilityManager());
            ely0 ely0VarA2 = b.a(ha4Var.m27getAutofill());
            ely0 ely0VarA3 = d.a(ha4Var.getAutofillManager());
            ely0 ely0VarA4 = c.a(ha4Var.getAutofillTree());
            ely0 ely0VarA5 = e.a(ha4Var.getClipboardManager());
            ely0 ely0VarA6 = f.a(ha4Var.getClipboard());
            ely0 ely0VarA7 = h.a(ha4Var.getDensity());
            ely0 ely0VarA8 = i.a(ha4Var.getFocusOwner());
            ely0 ely0VarA9 = j.a(ha4Var.getFontLoader());
            ely0VarA9.g = false;
            ely0 ely0VarA10 = k.a(ha4Var.getFontFamilyResolver());
            ely0VarA10.g = false;
            ely0 ely0VarA11 = l.a(ha4Var.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new u94(ha4Var, (byte) 3);
                x340Var.s0(objT);
            }
            ely0 ely0VarC = m.c((iu30) objT);
            ely0 ely0VarA12 = n.a(ha4Var.getLayoutDirection());
            boolean z2 = i4 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new u94(ha4Var, (byte) 4);
                x340Var.s0(objT2);
            }
            ely0 ely0VarC2 = f112p.c((iu30) objT2);
            boolean z3 = i4 == 4;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new u94(ha4Var, (byte) 5);
                x340Var.s0(objT3);
            }
            ely0 ely0VarC3 = q.c((iu30) objT3);
            boolean z4 = i4 == 4;
            Object objT4 = x340Var.T();
            if (z4 || objT4 == m4cVar) {
                objT4 = new u94(ha4Var, (byte) 6);
                x340Var.s0(objT4);
            }
            ely0 ely0VarC4 = r.c((iu30) objT4);
            ely0 ely0VarA13 = s.a(f65Var);
            ely0 ely0VarA14 = t.a(ha4Var.getViewConfiguration());
            ely0 ely0VarA15 = u.a(ha4Var.getWindowInfo());
            boolean z5 = i4 == 4;
            Object objT5 = x340Var.T();
            if (z5 || objT5 == m4cVar) {
                objT5 = new u94(ha4Var, (byte) 7);
                x340Var.s0(objT5);
            }
            mod.c(new ely0[]{ely0VarA, ely0VarA2, ely0VarA3, ely0VarA4, ely0VarA5, ely0VarA6, ely0VarA7, ely0VarA8, ely0VarA9, ely0VarA10, ely0VarA11, ely0VarC, ely0VarA12, ely0VarC2, ely0VarC3, ely0VarC4, ely0VarA13, ely0VarA14, ely0VarA15, w.c((iu30) objT5), g.a(ha4Var.getGraphicsContext()), kge0.a.a(ha4Var.getRetainedValuesStore()), o.a(ha4Var.getLocaleList())}, vu30Var, x340Var, ((i3 >> 3) & 112) | 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qg(oxq0Var, f65Var, vu30Var, i2, (byte) 3);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
