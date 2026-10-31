package androidx.xr.runtime.internal;

import android.app.Activity;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.nka0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/xr/runtime/internal/RenderingRuntimeFactory;", "", "", "Lp/nka0;", "runtimes", "Landroid/app/Activity;", "activity", "create", "(Ljava/util/List;Landroid/app/Activity;)Lp/nka0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RenderingRuntimeFactory {
    nka0 create(List<? extends nka0> runtimes, Activity activity);

    /* synthetic */ Set getRequirements();
}
