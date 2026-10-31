package p;

import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fxi1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gxi1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fxi1(gxi1 gxi1Var, byte b) {
        super(1);
        this.a = b;
        this.b = gxi1Var;
    }

    public final Object invoke(Object obj) {
        h1a h1aVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gxi1 gxi1Var = this.b;
        switch (b) {
            case 0:
                sxi1 sxi1Var = (sxi1) obj;
                t8r0 t8r0Var = gxi1Var.a;
                if (sxi1Var.equals(nxi1.a)) {
                    t8r0Var.j(tu80.g);
                    Consumer consumer = gxi1Var.h;
                    if (consumer != null) {
                        consumer.accept(kwi1.a);
                    }
                } else if (sxi1Var instanceof rxi1) {
                    String str = ((rxi1) sxi1Var).a;
                    tv80 tv80VarJ = t8r0Var.j(new kv80(str));
                    Consumer consumer2 = gxi1Var.h;
                    if (consumer2 != null) {
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        consumer2.accept(new twi1(str, yon1.c6().c, tv80VarJ));
                    }
                } else if (sxi1Var instanceof qxi1) {
                    Consumer consumer3 = gxi1Var.h;
                    if (consumer3 != null) {
                        consumer3.accept(new rwi1(null));
                    }
                } else if (sxi1Var instanceof pxi1) {
                    pxi1 pxi1Var = (pxi1) sxi1Var;
                    p5k p5kVar = pxi1Var.a;
                    String str2 = p5kVar.c;
                    if (str2 != null) {
                        tv80 tv80VarJ2 = t8r0Var.j(new bv80(pxi1Var.b, p5kVar.a, str2));
                        Consumer consumer4 = gxi1Var.h;
                        if (consumer4 != null) {
                            consumer4.accept(new owi1(str2, tv80VarJ2));
                        }
                    }
                } else {
                    if (!(sxi1Var instanceof oxi1)) {
                        eg.o();
                        return null;
                    }
                    ywi1 ywi1Var = gxi1Var.Z;
                    if (ywi1Var != null && (h1aVar = ywi1Var.a.i) != null) {
                        t8r0Var.j(new wu80(h1aVar.a));
                        Consumer consumer5 = gxi1Var.h;
                        if (consumer5 != null) {
                            consumer5.accept(new lwi1(h1aVar));
                        }
                    }
                }
                return rih1Var;
            case 1:
                bod1 bod1Var = (dod1) obj;
                if (!(bod1Var instanceof aod1)) {
                    if (bod1Var instanceof bod1) {
                        t8r0 t8r0Var2 = gxi1Var.a;
                        hod1 hod1Var = bod1Var.a;
                        String str3 = hod1Var.a;
                        ywi1 ywi1Var2 = gxi1Var.Z;
                        t8r0Var2.j(new mv80(str3, ywi1Var2 != null ? ywi1Var2.a.a : ""));
                        Consumer consumer6 = gxi1Var.h;
                        if (consumer6 != null) {
                            consumer6.accept(new swi1(gxi1Var.Y.indexOf(hod1Var)));
                        }
                    } else if (!(bod1Var instanceof cod1)) {
                        eg.o();
                        return null;
                    }
                }
                return rih1Var;
            default:
                vwi1 vwi1Var = (vwi1) obj;
                Consumer consumer7 = gxi1Var.h;
                if (consumer7 != null) {
                    consumer7.accept(vwi1Var);
                }
                return rih1Var;
        }
    }
}
