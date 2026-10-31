package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tyb1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uyb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tyb1(uyb1 uyb1Var, byte b) {
        super(0);
        this.a = b;
        this.b = uyb1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        uyb1 uyb1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return j6p1.k(j6p1.k(new jp80(uyb1Var), new h3h1(axb1.N0)), new eq80(new e3h1(uyb1Var.c, (n7h1) null, uyb1Var.b)));
            default:
                return Integer.valueOf(uyb1Var.getResources().getDimensionPixelSize(2131165563));
        }
    }
}
