package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bwj0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ p811 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bwj0(ven0 ven0Var, iu30 iu30Var, p811 p811Var, wvj0 wvj0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
        this.c = iu30Var;
        this.d = p811Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        iu30 iu30Var = this.c;
        p811 p811Var = this.d;
        switch (b) {
            case 0:
                zqk1 zqk1Var = (zqk1) obj;
                ven0Var.setValue(zqk1Var);
                if (zqk1Var instanceof yqk1) {
                    iu30Var.invoke(new tvj0(((yqk1) obj).a, ((List) p811Var.a).indexOf(obj)));
                } else {
                    if (!(zqk1Var instanceof xqk1)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new qvj0(((List) p811Var.a).indexOf(obj)));
                }
                return rih1Var;
            case 1:
                fez fezVar = (fez) obj;
                ven0Var.setValue(fezVar);
                if (fezVar instanceof eez) {
                    iu30Var.invoke(new rvj0(((eez) obj).a, ((List) p811Var.a).indexOf(obj)));
                } else {
                    if (!(fezVar instanceof cez)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new ovj0(((List) p811Var.a).indexOf(obj)));
                }
                return rih1Var;
            default:
                j820 j820Var = (j820) obj;
                ven0Var.setValue(j820Var);
                if (j820Var instanceof i820) {
                    iu30Var.invoke(new svj0(((i820) obj).a, ((List) p811Var.a).indexOf(obj)));
                } else {
                    if (!(j820Var instanceof h820)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new pvj0(((List) p811Var.a).indexOf(obj)));
                }
                return rih1Var;
        }
    }
}
