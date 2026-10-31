package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f22 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h22 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f22(h22 h22Var, byte b) {
        super(1);
        this.a = b;
        this.b = h22Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        h22 h22Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                String str = (String) obj;
                uba ubaVar = h22Var.K1;
                if (ubaVar == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var = h22Var.T1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("learn_more", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                uba ubaVar2 = ubaVar;
                ubaVar2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            default:
                String str2 = (String) obj;
                uba ubaVar3 = h22Var.K1;
                if (ubaVar3 == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var2 = h22Var.T1;
                if (dsk0Var2 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC2 = dsk0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("legal_terms", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                uba ubaVar4 = ubaVar3;
                ubaVar4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
        }
    }
}
