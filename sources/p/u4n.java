package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u4n extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ v4n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4n(v4n v4nVar, byte b) {
        super((Object) null);
        this.b = b;
        switch (b) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.c = v4nVar;
                super(bool);
                break;
            default:
                this.c = v4nVar;
                break;
        }
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        byte b = this.b;
        v4n v4nVar = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                mma0[] mma0VarArr = v4n.a2;
                v4nVar.o1();
                break;
            default:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    mma0[] mma0VarArr2 = v4n.a2;
                    v4nVar.o1();
                }
                break;
        }
    }
}
