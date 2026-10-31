package p;

import com.spotify.fileaccess.fileio.NativeFileIO;
import com.spotify.fileaccess.fileioimpl.NativeFileIOImpl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i420 implements f961 {
    public final NativeFileIO a;

    public i420() {
        NativeFileIOImpl.Companion.getClass();
        this.a = NativeFileIOImpl.create();
    }

    @Override // p.dwo
    public final void shutdown() {
        this.a.destroy();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
