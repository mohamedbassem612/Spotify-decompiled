package androidx.xr.runtime.interfaces;

import android.content.Context;
import java.util.Set;
import kotlin.Metadata;
import p.hhg1;
import p.jlm1;
import p.mkm1;
import p.o8n;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/xr/runtime/interfaces/XrDeviceCapabilityProviderFactory;", "", "Landroid/content/Context;", "context", "Lp/o8n;", "coroutineContext", "Lp/jlm1;", "nativeInstanceProvider", "Lp/mkm1;", "create", "(Landroid/content/Context;Lp/o8n;Lp/jlm1;)Lp/mkm1;", "runtime-interfaces"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface XrDeviceCapabilityProviderFactory {
    static /* synthetic */ mkm1 create$default(XrDeviceCapabilityProviderFactory xrDeviceCapabilityProviderFactory, Context context, o8n o8nVar, jlm1 jlm1Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: create");
            return null;
        }
        if ((i & 4) != 0) {
            jlm1Var = null;
        }
        return xrDeviceCapabilityProviderFactory.create(context, o8nVar, jlm1Var);
    }

    mkm1 create(Context context, o8n coroutineContext, jlm1 nativeInstanceProvider);

    /* synthetic */ Set getRequirements();
}
