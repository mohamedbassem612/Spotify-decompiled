package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a4h1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ utl b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4h1(utl utlVar, int i, byte b) {
        super(1);
        this.a = b;
        this.b = utlVar;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = this.c;
        utl utlVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return utlVar.a.get(i + ((Number) obj).intValue());
            default:
                return utlVar.b.get(i + ((Number) obj).intValue());
        }
    }
}
