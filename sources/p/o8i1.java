package p;

import com.spotify.appstorage.userdirectory.NativeUserDirectoryManager;
import com.spotify.appstorage.userdirectory.UserDirectoryApi;
import com.spotify.appstorage.userdirectory.UserDirectoryCachePaths;
import com.spotify.appstorage.userdirectoryimpl.NativeUserDirectoryManagerImpl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o8i1 implements UserDirectoryApi, f961 {
    public final NativeUserDirectoryManagerImpl a;

    public o8i1(ph61 ph61Var, UserDirectoryCachePaths userDirectoryCachePaths) {
        this.a = NativeUserDirectoryManagerImpl.INSTANCE.create(ph61Var.a().getCanonicalUsername(), userDirectoryCachePaths.getCachePath(), userDirectoryCachePaths.getSettingsPath());
    }

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryApi
    public final String getCachePath() {
        return this.a.getCachePath();
    }

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryApi
    public final NativeUserDirectoryManager getNativeUserDirectoryManager() {
        return this.a;
    }

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryApi
    public final String getSettingsPath() {
        return this.a.getSettingsPath();
    }

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryApi
    public final String makeCachePath(String str) {
        return this.a.makeCachePath(str);
    }

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryApi
    public final String makeSettingsPath(String str) {
        return this.a.makeSettingsPath(str);
    }

    public final void shutdown() {
        this.a.destroy();
    }

    public final Object getApi() {
        return this;
    }
}
