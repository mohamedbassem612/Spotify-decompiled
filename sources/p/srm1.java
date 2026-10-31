package p;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class srm1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ urm1 b;
    public final /* synthetic */ p1f0 c;
    public final /* synthetic */ vrm1 d;
    public final /* synthetic */ grm1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ srm1(urm1 urm1Var, p1f0 p1f0Var, vrm1 vrm1Var, grm1 grm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = urm1Var;
        this.c = p1f0Var;
        this.d = vrm1Var;
        this.e = grm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        grm1 grm1Var = this.e;
        vrm1 vrm1Var = this.d;
        b7x b7xVar = b7x.a;
        p1f0 p1f0Var = this.c;
        urm1 urm1Var = this.b;
        switch (b) {
            case 0:
                mxa1 mxa1Var = urm1Var.d;
                qzh qzhVar = (qzh) ((idd1) p1f0Var.e).getValue();
                int iA = urm1Var.a(qzhVar != null ? qzhVar.getView() : null);
                i8h1 i8h1Var = (i8h1) mxa1Var.b;
                z4m0 z4m0Var = (z4m0) mxa1Var.d;
                z4m0Var.getClass();
                x6h1 x6h1VarC = z4m0Var.a.c();
                x6h1VarC.i.add(new a7h1("list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                Integer numValueOf = Integer.valueOf(iA);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("item", (String) null, numValueOf, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                String str = (String) ((idd1) mxa1Var.f).getValue();
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                t8h1 t8h1Var = urm1Var.e;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                t8h1.n(t8h1Var, yon1.G1("COLLECTION_YOUREPISODES_SETTINGS_REMOVEPLAYED", "collection/yourepisodes/settings/removeplayed", 373, "collection"));
                krm1.i1((krm1) ((idd1) p1f0Var.h).getValue(), vrm1Var.a.b, grm1Var, new rrm1(urm1Var, (byte) 0));
                urm1Var.g = 1;
                break;
            default:
                mxa1 mxa1Var2 = urm1Var.d;
                qzh qzhVar2 = (qzh) ((idd1) p1f0Var.f).getValue();
                int iA2 = urm1Var.a(qzhVar2 != null ? qzhVar2.getView() : null);
                i8h1 i8h1Var2 = (i8h1) mxa1Var2.b;
                z4m0 z4m0Var2 = (z4m0) mxa1Var2.d;
                z4m0Var2.getClass();
                x6h1 x6h1VarC3 = z4m0Var2.a.c();
                x6h1VarC3.i.add(new a7h1("list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                Integer numValueOf2 = Integer.valueOf(iA2);
                x6h1 x6h1VarC4 = y6h1VarA3.c();
                x6h1VarC4.i.add(new a7h1("item", (String) null, numValueOf2, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA4 = x6h1VarC4.a();
                String str2 = (String) ((idd1) mxa1Var2.g).getValue();
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA4, r6h1.c, System.currentTimeMillis()), (xj61) null);
                t8h1 t8h1Var2 = urm1Var.e;
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                t8h1.n(t8h1Var2, yon1.G1("COLLECTION_YOUREPISODES_SETTINGS_REMOVEUNPLAYED", "collection/yourepisodes/settings/removeunplayed", 374, "collection"));
                krm1.i1((krm1) ((idd1) p1f0Var.h).getValue(), vrm1Var.b.b, grm1Var, new rrm1(urm1Var, (byte) 1));
                urm1Var.g = 2;
                break;
        }
        return rih1Var;
    }
}
