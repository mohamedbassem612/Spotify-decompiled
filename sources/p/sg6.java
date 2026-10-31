package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sg6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg6(byte b, boolean z) {
        super(0);
        this.a = b;
        this.b = z;
    }

    public final Object invoke() {
        long j;
        byte b = this.a;
        boolean z = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Boolean.valueOf(z);
            case 1:
                if (z) {
                    uwr uwrVar = cbx.a;
                    j = ((vex) zex.a.e).n;
                } else {
                    uwr uwrVar2 = cbx.a;
                    j = ((vex) zex.a.e).k;
                }
                return new u7h(j);
            case 2:
                return v8r.q(Boolean.valueOf(z));
            case 3:
                return new tgm((String) null, false, false, this.b, false, false, false, (yh10) null, false, false, 0, false, false, true, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -32779, 1);
            case 4:
                return z ? flb0.b : flb0.a;
            default:
                return Boolean.valueOf(z);
        }
    }
}
