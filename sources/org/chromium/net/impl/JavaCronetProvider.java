package org.chromium.net.impl;

import android.content.Context;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.httpflags.HttpFlagsLoader;
import org.chromium.net.httpflags.ResolvedFlags;
import p.c8o;
import p.u7a0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class JavaCronetProvider extends CronetProvider {
    public JavaCronetProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        if (HttpEngineNativeProvider.a()) {
            Context context = this.mContext;
            ResolvedFlags.Value value = HttpFlagsLoader.getHttpFlags(context, ImplVersion.getCronetVersion(), false, c8o.p(context).getBoolean("android.net.http.EnableTelemetry", false)).flags().get("Cronet_ForceHttpEngineInFallback");
            if (value != null && value.getBoolValue()) {
                return new HttpEngineNativeProvider(this.mContext).createBuilder();
            }
        }
        return new ExperimentalCronetEngine.Builder(new u7a0(this.mContext));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JavaCronetProvider) && this.mContext.equals(((JavaCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return CronetProvider.PROVIDER_NAME_FALLBACK;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        return ImplVersion.getCronetVersion();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return true;
    }
}
