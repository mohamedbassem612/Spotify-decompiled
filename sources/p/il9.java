package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class il9 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il9(xtb0 xtb0Var, int i, byte b) {
        super(0);
        this.a = b;
        this.b = xtb0Var;
        this.c = i;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        int i = this.c;
        xtb0 xtb0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qtb0 qtb0Var = (qtb0) o7h.C0(xtb0Var.h().l);
                if (qtb0Var != null && qtb0Var.a != i - 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                int i2 = xtb0Var.h().o;
                qtb0 qtb0Var2 = (qtb0) o7h.C0(xtb0Var.h().l);
                int i3 = qtb0Var2 != null ? qtb0Var2.a : 0;
                if (i > 0 && i3 + i + 1 >= i2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ptb0 ptb0VarH = xtb0Var.h();
                int i4 = ptb0VarH.o;
                qtb0 qtb0Var3 = (qtb0) o7h.C0(ptb0VarH.l);
                return Boolean.valueOf(i4 - (qtb0Var3 != null ? qtb0Var3.a : -1) <= i);
            default:
                ptb0 ptb0VarH2 = xtb0Var.h();
                int i5 = ptb0VarH2.o;
                qtb0 qtb0Var4 = (qtb0) o7h.C0(ptb0VarH2.l);
                int i6 = qtb0Var4 != null ? qtb0Var4.a : -1;
                if (i5 > 0 && i6 >= 0 && i5 - i6 <= i) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
