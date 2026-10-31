package p;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g65 implements aqg0 {
    public final /* synthetic */ byte a;

    @Override // p.aqg0
    public final j2i1 a(Object obj, dqq0 dqq0Var) {
        switch (this.a) {
            case 0:
                return jch0.h0(((Uri) obj).toString());
            case 1:
                return jch0.g(((s8s0) obj).a.r());
            case 2:
                int iIntValue = ((Number) obj).intValue();
                Context context = dqq0Var.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return jch0.h0("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return jch0.h0((String) obj);
        }
    }
}
