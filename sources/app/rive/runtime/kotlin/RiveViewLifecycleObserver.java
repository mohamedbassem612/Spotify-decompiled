package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.RefCount;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p.iac0;
import p.o5s;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lapp/rive/runtime/kotlin/RiveViewLifecycleObserver;", "Lp/o5s;", "", "Lapp/rive/runtime/kotlin/core/RefCount;", "dependencies", "<init>", "(Ljava/util/List;)V", "Lp/iac0;", "owner", "Lp/rih1;", "onDestroy", "(Lp/iac0;)V", "dependency", "", "remove", "(Lapp/rive/runtime/kotlin/core/RefCount;)Z", "insert", "(Lapp/rive/runtime/kotlin/core/RefCount;)V", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public class RiveViewLifecycleObserver implements o5s {
    public static final int $stable = 8;
    private final List<RefCount> dependencies;

    public RiveViewLifecycleObserver(List<RefCount> list) {
        this.dependencies = list;
    }

    public final List<RefCount> getDependencies() {
        return this.dependencies;
    }

    public final void insert(RefCount dependency) {
        this.dependencies.add(dependency);
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onCreate(iac0 iac0Var) {
    }

    @Override // p.o5s
    public void onDestroy(iac0 owner) {
        Iterator<T> it = this.dependencies.iterator();
        while (it.hasNext()) {
            ((RefCount) it.next()).release();
        }
        owner.getLifecycle().d(this);
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onPause(iac0 iac0Var) {
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onResume(iac0 iac0Var) {
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onStart(iac0 iac0Var) {
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onStop(iac0 iac0Var) {
    }

    public final boolean remove(RefCount dependency) {
        return this.dependencies.remove(dependency);
    }
}
