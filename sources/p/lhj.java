package p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lhj extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oz71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lhj(oz71 oz71Var, byte b) {
        super(1);
        this.a = b;
        this.b = oz71Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oz71 oz71Var = this.b;
        switch (b) {
            case 0:
                b261.n((e261) obj, Pattern.compile("\\[([^]]+)]\\(([^)]+)\\)").matcher(nhc1.W(oz71Var.a, "*", "")).replaceAll("$1"));
                break;
            default:
                mz71 mz71Var = (mz71) obj;
                iu30 iu30Var = oz71Var.d;
                if (iu30Var != null) {
                    iu30Var.invoke(mz71Var);
                }
                break;
        }
        return rih1Var;
    }
}
