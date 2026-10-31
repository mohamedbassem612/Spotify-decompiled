package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ow6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow6(boolean z, qpj1 qpj1Var, int i, hqk1 hqk1Var, iu30 iu30Var) {
        super(0);
        this.b = z;
        this.d = qpj1Var;
        this.c = i;
        this.e = hqk1Var;
        this.f = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.f;
        Object obj2 = this.d;
        boolean z = this.b;
        Object obj3 = this.e;
        int i = this.c;
        rha1 rha1Var = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                xu30 xu30Var = (xu30) obj3;
                cia1 cia1Var = (cia1) obj2;
                if (z && cia1Var.d) {
                    rha1 rha1Var2 = (rha1) obj;
                    if (rha1Var2 != null) {
                        rha1 rha1Var3 = rha1.a;
                        if (rha1Var2 == rha1Var3) {
                            rha1Var3 = rha1.b;
                        }
                        rha1Var = rha1Var3;
                    }
                    xu30Var.invoke(cia1Var, rha1Var, Integer.valueOf(i));
                } else {
                    xu30Var.invoke(cia1Var, cia1Var.e, Integer.valueOf(i));
                }
                break;
            default:
                qpj1 qpj1Var = (qpj1) obj2;
                h7l0 h7l0Var = (h7l0) qpj1Var.b;
                idd1 idd1Var = (idd1) qpj1Var.c;
                String str = ((hqk1) obj3).a;
                b7x b7xVar = b7x.a;
                if (z) {
                    i8h1 i8h1Var = (i8h1) idd1Var.getValue();
                    Integer numValueOf = Integer.valueOf(i);
                    x6h1 x6h1VarC = h7l0Var.b.c();
                    x6h1VarC.i.add(new a7h1("play_pause_button", (String) null, numValueOf, (String) null, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    i8h1 i8h1Var2 = (i8h1) idd1Var.getValue();
                    Integer numValueOf2 = Integer.valueOf(i);
                    x6h1 x6h1VarC2 = h7l0Var.b.c();
                    x6h1VarC2.i.add(new a7h1("play_pause_button", (String) null, numValueOf2, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                ((iu30) obj).invoke(str);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow6(boolean z, cia1 cia1Var, xu30 xu30Var, rha1 rha1Var, int i) {
        super(0);
        this.b = z;
        this.d = cia1Var;
        this.e = xu30Var;
        this.f = rha1Var;
        this.c = i;
    }
}
