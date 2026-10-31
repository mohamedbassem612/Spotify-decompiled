package p;

import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lvp0 {
    public final OfflinePlugin.PluginCommand a;
    public final Collection b;

    public lvp0(OfflinePlugin.PluginCommand pluginCommand, Collection collection) {
        this.a = pluginCommand;
        this.b = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvp0)) {
            return false;
        }
        lvp0 lvp0Var = (lvp0) obj;
        return this.a.equals(lvp0Var.a) && this.b.equals(lvp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
