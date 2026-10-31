package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eav extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gik1 b;
    public final /* synthetic */ fav c;
    public final /* synthetic */ ttk0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eav(gik1 gik1Var, fav favVar, ttk0 ttk0Var, byte b) {
        super(0);
        this.a = b;
        this.b = gik1Var;
        this.c = favVar;
        this.d = ttk0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ttk0 ttk0Var = this.d;
        fav favVar = this.c;
        gik1 gik1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return gik1Var.a(favVar, new dav(ttk0Var, favVar, (byte) 0));
            default:
                return gik1Var.a(favVar, new dav(ttk0Var, favVar, (byte) 1));
        }
    }
}
