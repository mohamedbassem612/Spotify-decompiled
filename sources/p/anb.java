package p;

import android.content.Context;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class anb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cnb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ anb(cnb cnbVar, byte b) {
        super(1);
        this.a = b;
        this.b = cnbVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cnb cnbVar = this.b;
        switch (b) {
            case 0:
                ji50 ji50Var = (ji50) obj;
                ymb ymbVar = new ymb(cnbVar, (byte) 0);
                c7b c7bVar = c7b.c1;
                vq9 vq9Var = vq9.c1;
                LinkedHashMap linkedHashMap = ji50Var.b;
                w7x w7xVar = w7x.a;
                linkedHashMap.put(enb.class, r4o1.P(c7bVar, w7xVar, ymbVar, vq9Var));
                ymb ymbVar2 = new ymb(cnbVar, (byte) 1);
                i8r0.e0.getClass();
                linkedHashMap.put(dnb.class, r4o1.P(c7b.e1, w7xVar, ymbVar2, vq9.d1));
                h9d0 h9d0Var = cnbVar.b;
                linkedHashMap.put(fnb.class, new r3r(new xzq(new uh01(ji50Var.a, cnbVar.h, (i1r0) h9d0Var.d, (kt91) h9d0Var.e, ((ut71) h9d0Var.f).b((Context) h9d0Var.c, cnbVar.i), ((wz4) h9d0Var.g).a(), (g0l) h9d0Var.h, cnbVar.g, h9d0Var.b, h9d0Var.a ? new ewn0((w4h) h9d0Var.i, (byte) 16) : null), zmb.b), vq9.b1, 4));
                return rih1.a;
            default:
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                iix0 iix0Var = i1rVar2 != null ? (iix0) i1rVar2.a : null;
                Map mapSingletonMap = iix0Var != null ? Collections.singletonMap(cnbVar.f, iix0Var) : null;
                if (mapSingletonMap == null) {
                    mapSingletonMap = b7x.a;
                }
                return new whx0(mapSingletonMap);
        }
    }
}
