package androidx.xr.runtime.internal;

import android.content.Context;
import java.util.Set;
import kotlin.Metadata;
import p.c9n;
import p.nka0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/xr/runtime/internal/PerceptionRuntimeFactory;", "", "Landroid/content/Context;", "context", "Lp/c9n;", "coroutineScope", "Lp/nka0;", "createRuntime", "(Landroid/content/Context;Lp/c9n;)Lp/nka0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PerceptionRuntimeFactory {
    nka0 createRuntime(Context context, c9n coroutineScope);

    /* synthetic */ Set getRequirements();
}
