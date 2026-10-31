package p;

import android.content.ClipData;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o2y0 extends hab0 implements iu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ung c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2y0(List list, int i, ung ungVar, String str, int i2, Function0 function0) {
        super(1);
        this.a = list;
        this.b = i;
        this.c = ungVar;
        this.d = str;
        this.e = i2;
        this.f = function0;
    }

    public final Object invoke(Object obj) {
        y2y0 y2y0Var;
        int iIntValue = ((Number) obj).intValue();
        x2y0 x2y0Var = (x2y0) o7h.t0(this.b, this.a);
        String str = (x2y0Var == null || (y2y0Var = (y2y0) o7h.t0(iIntValue, x2y0Var.a)) == null) ? null : y2y0Var.a;
        if (str != null) {
            e94 e94Var = this.c;
            e94Var.getClass();
            ((f94) e94Var).a.a().setPrimaryClip(ClipData.newPlainText(this.d, str));
            if (this.e < 33) {
                this.f.invoke();
            }
        }
        return rih1.a;
    }
}
