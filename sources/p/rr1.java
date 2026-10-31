package p;

import android.graphics.RectF;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rr1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ upo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr1(upo upoVar, byte b) {
        super(0);
        this.a = b;
        this.b = upoVar;
    }

    public final Object invoke() {
        byte b = this.a;
        upo upoVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return upoVar.c();
            case 1:
                return (RectF) upoVar.h.getValue();
            case 2:
                return upoVar.c();
            case 3:
                return Boolean.valueOf(((Boolean) upoVar.g.getValue()).booleanValue() && !((Boolean) upoVar.b.getValue()).booleanValue() && upoVar.c() != wy71.c && upoVar.d() > 0 && upoVar.a.s() < ((float) upoVar.d()));
            case 4:
                return (RectF) upoVar.h.getValue();
            default:
                return new mmr0(Integer.valueOf(upoVar.d()), Integer.valueOf(((Number) upoVar.d.getValue()).intValue()));
        }
    }
}
