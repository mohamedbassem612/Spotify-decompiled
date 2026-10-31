package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p1x implements prj0 {
    public final j0x a;
    public final e3x b;
    public final mr20 c;
    public final huz d;
    public final idd1 e;

    public p1x(String str, j0x j0xVar, q8n q8nVar, e3x e3xVar, ytp0 ytp0Var) {
        List listSingletonList;
        this.a = j0xVar;
        this.b = e3xVar;
        this.c = o4p1.r(j0xVar.a(new qrd1(new mmr0(new prd1(), str))), q8nVar);
        int iOrdinal = ((ge4) ytp0Var.b).d().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            listSingletonList = z6x.a;
        } else if (iOrdinal == 2) {
            listSingletonList = Collections.singletonList(1);
        } else if (iOrdinal == 3) {
            listSingletonList = Collections.singletonList(2);
        } else if (iOrdinal == 4) {
            listSingletonList = Collections.singletonList(3);
        } else {
            if (iOrdinal != 5) {
                eg.o();
                throw null;
            }
            listSingletonList = Collections.singletonList(7);
        }
        this.d = new huz(listSingletonList, (byte) 10);
        this.e = new idd1(new v7v(this, (byte) 16));
    }

    public final void a() {
        this.b.a.m((Object) null, d3x.a);
    }

    public final yd91 d() {
        return (yd91) this.e.getValue();
    }

    public final mr20 getShow() {
        return this.c;
    }

    public final mr20 x() {
        return this.d;
    }
}
