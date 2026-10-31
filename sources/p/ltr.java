package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ltr implements t1q0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ltr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                mtr mtrVar = (mtr) obj;
                if (mtrVar.g) {
                    Integer num = mtrVar.l;
                    boolean z = false;
                    if (num != null && i < num.intValue()) {
                        z = true;
                    }
                    mtrVar.l = Integer.valueOf(i);
                    String str = mtrVar.n;
                    mtrVar.n = null;
                    if (z && str != null && mtrVar.d.a()) {
                        mtrVar.b(str, str);
                        break;
                    }
                }
                break;
            default:
                ((p7h0) obj).t = Integer.valueOf(i);
                break;
        }
    }
}
