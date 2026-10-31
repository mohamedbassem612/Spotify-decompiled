package p;

import com.spotify.jvm.jni.NativeClassLoader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yln0 implements jlq0 {
    @Override // p.jlq0
    public final void c() {
        NativeClassLoader.INSTANCE.load();
    }

    @Override // p.jlq0
    public final String getName() {
        return "NativeClassLoaderOperation";
    }
}
