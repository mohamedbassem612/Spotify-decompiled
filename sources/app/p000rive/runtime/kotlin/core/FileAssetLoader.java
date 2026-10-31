package app.p000rive.runtime.kotlin.core;

import app.p000rive.runtime.kotlin.core.errors.RiveException;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H\u0084 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "<init>", "()V", "", "pointer", "", "rendererType", "Lp/rih1;", "cppSetRendererType", "(JI)V", "constructor", "()J", "cppDelete", "(J)V", "cppRef", "Lapp/rive/runtime/kotlin/core/FileAsset;", "asset", "", "inBandBytes", "", "loadContents", "(Lapp/rive/runtime/kotlin/core/FileAsset;[B)Z", "Lapp/rive/runtime/kotlin/core/RendererType;", "setRendererType", "(Lapp/rive/runtime/kotlin/core/RendererType;)V", "acquire", "()I", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FileAssetLoader extends NativeObject {
    public static final int $stable = 0;

    public FileAssetLoader() throws RiveException {
        super(0L);
        setCppPointer(constructor());
        getRefs().incrementAndGet();
        getCppPointer();
    }

    private final native void cppSetRendererType(long pointer, int rendererType);

    @Override // app.p000rive.runtime.kotlin.core.NativeObject, app.p000rive.runtime.kotlin.core.RefCount
    public int acquire() {
        cppRef(getCppPointer());
        return super.acquire();
    }

    public final native long constructor();

    @Override // app.p000rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public final native void cppRef(long pointer);

    public abstract boolean loadContents(FileAsset asset, byte[] inBandBytes);

    public final void setRendererType(RendererType rendererType) {
        cppSetRendererType(getCppPointer(), rendererType.getValue());
    }
}
