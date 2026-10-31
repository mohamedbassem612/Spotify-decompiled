package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qe01 {
    public static final bma1 l;
    public static final bma1 m;
    public static final bma1 n;
    public static final bma1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final bma1 f40p;
    public static final bma1 q;
    public final dma1 a;
    public final bpb1 b;
    public final xe01 c;
    public final bpb1 d;
    public final xe01 e;
    public final bpb1 f;
    public final xe01 g;
    public final bpb1 h;
    public final xe01 i;
    public final bpb1 j;
    public final xe01 k;

    static {
        nbc nbcVar = bma1.b;
        l = nbcVar.u("ereader_color_theme");
        m = nbcVar.u("ereader_font_family");
        n = nbcVar.u("ereader_font_size_index");
        o = nbcVar.u("ereader_line_spacing_index");
        f40p = nbcVar.u("ereader_word_spacing_index");
        q = nbcVar.u("ereader_char_spacing_index");
    }

    public qe01(dma1 dma1Var) {
        Object next;
        hc01 hc01Var;
        fd01 fd01Var;
        this.a = dma1Var;
        Object obj = null;
        String strE = dma1Var.e(l, (String) null);
        if (strE == null) {
            hc01.d.getClass();
            hc01Var = hc01.e;
        } else {
            Iterator it = hc01.h.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((hc01) next).name(), strE));
            hc01Var = (hc01) next;
            if (hc01Var == null) {
                hc01.d.getClass();
                hc01Var = hc01.e;
            }
        }
        bpb1 bpb1VarB = gio1.b(hc01Var);
        this.b = bpb1VarB;
        this.c = d5p1.h(bpb1VarB);
        String strE2 = this.a.e(m, (String) null);
        if (strE2 == null) {
            fd01.d.getClass();
            fd01Var = fd01.e;
        } else {
            for (Object obj2 : fd01.g) {
                if (u890.j(((fd01) obj2).name(), strE2)) {
                    obj = obj2;
                    break;
                }
            }
            fd01Var = (fd01) obj;
            if (fd01Var == null) {
                fd01.d.getClass();
                fd01Var = fd01.e;
            }
        }
        bpb1 bpb1VarB2 = gio1.b(fd01Var);
        this.d = bpb1VarB2;
        this.e = d5p1.h(bpb1VarB2);
        dma1 dma1Var2 = this.a;
        bpb1 bpb1VarB3 = gio1.b(new te01(dma1Var2.l(n, 1), dma1Var2.l(o, 2), dma1Var2.l(f40p, 1), dma1Var2.l(q, 2)));
        this.f = bpb1VarB3;
        this.g = d5p1.h(bpb1VarB3);
        Boolean bool = Boolean.FALSE;
        bpb1 bpb1VarB4 = gio1.b(bool);
        this.h = bpb1VarB4;
        this.i = d5p1.h(bpb1VarB4);
        bpb1 bpb1VarB5 = gio1.b(bool);
        this.j = bpb1VarB5;
        this.k = d5p1.h(bpb1VarB5);
    }

    public final void a(iu30 iu30Var) {
        bpb1 bpb1Var = this.f;
        te01 te01Var = (te01) iu30Var.invoke(bpb1Var.getValue());
        bpb1Var.l(te01Var);
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.b(n, te01Var.a);
        hma1VarEdit.b(o, te01Var.b);
        hma1VarEdit.b(f40p, te01Var.c);
        hma1VarEdit.b(q, te01Var.d);
        hma1VarEdit.g();
    }
}
