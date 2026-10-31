package androidx.xr.projected;

import android.content.Context;
import androidx.xr.runtime.interfaces.XrDeviceCapabilityProviderFactory;
import java.util.Set;
import kotlin.Metadata;
import p.f46;
import p.jlm1;
import p.mkm1;
import p.o8n;
import p.sl10;
import p.tkx0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/xr/projected/ProjectedDeviceCapabilityProviderFactory;", "Landroidx/xr/runtime/interfaces/XrDeviceCapabilityProviderFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lp/o8n;", "coroutineContext", "Lp/jlm1;", "nativeInstanceProvider", "Lp/mkm1;", "create", "(Landroid/content/Context;Lp/o8n;Lp/jlm1;)Lp/mkm1;", "", "Lp/sl10;", "requirements", "Ljava/util/Set;", "getRequirements", "()Ljava/util/Set;", "projected"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProjectedDeviceCapabilityProviderFactory implements XrDeviceCapabilityProviderFactory {
    public static final int $stable = 8;
    private final Set<sl10> requirements = f46.S0(new sl10[]{sl10.b, sl10.e});

    @Override // androidx.xr.runtime.interfaces.XrDeviceCapabilityProviderFactory
    public mkm1 create(Context context, o8n coroutineContext, jlm1 nativeInstanceProvider) {
        return new tkx0(context, coroutineContext);
    }

    @Override // androidx.xr.runtime.interfaces.XrDeviceCapabilityProviderFactory
    public Set<sl10> getRequirements() {
        return this.requirements;
    }
}
