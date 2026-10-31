package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nps {
    public final iu30 a;
    public final b431 b;

    public nps(cir0 cir0Var, iu30 iu30Var) {
        this.a = iu30Var;
        this.b = cir0Var.h().a(i7w0.i, new wj1(this, (byte) 17));
    }

    public static zha1 b(dia1 dia1Var) {
        switch (dia1Var) {
            case RECENTLY_UPDATED:
                return zha1.i;
            case RECENTLY_ADDED:
                return zha1.g;
            case ALPHABETICAL:
                return zha1.a;
            case CREATOR:
                return zha1.c;
            case CUSTOM:
                return zha1.d;
            case RECENTLY_PLAYED_OR_ADDED:
                return zha1.h;
            case AUTHOR:
                return zha1.b;
            case RELEVANCE:
                return zha1.t;
            case DATE:
                return zha1.e;
            case RELEASE_DATE:
                return zha1.f;
            default:
                eg.o();
                return null;
        }
    }

    public final void a(hia1 hia1Var) {
        zha1 zha1VarB = b(hia1Var.a);
        List list = hia1Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((dia1) it.next()));
        }
        this.b.a(new dum1(new dsm1(arrayList, zha1VarB)), (String) null);
    }
}
