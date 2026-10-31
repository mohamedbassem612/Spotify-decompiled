package app.p000rive;

import app.p000rive.Asset;
import app.p000rive.core.CommandQueue;
import kotlin.Metadata;
import p.lnm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004J$\u0010\n\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H&¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lapp/rive/AssetOps;", "H", "Lapp/rive/Asset;", "A", "", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "worker", "", "bytes", "decode", "(Lapp/rive/core/CommandQueue;[BLp/lnm;)Ljava/lang/Object;", "handle", "Lp/rih1;", "delete", "(Lapp/rive/core/CommandQueue;Ljava/lang/Object;)V", "", "key", "register", "(Lapp/rive/core/CommandQueue;Ljava/lang/String;Ljava/lang/Object;)V", "unregister", "(Lapp/rive/core/CommandQueue;Ljava/lang/String;)V", "construct", "(Ljava/lang/Object;Lapp/rive/core/CommandQueue;)Lapp/rive/Asset;", "getTag", "()Ljava/lang/String;", "tag", "getLabel", "label", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AssetOps<H, A extends Asset<H>> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <H, A extends Asset<H>> void register(AssetOps<H, A> assetOps, CommandQueue commandQueue, String str, H h) {
        }

        public static <H, A extends Asset<H>> void unregister(AssetOps<H, A> assetOps, CommandQueue commandQueue, String str) {
        }
    }

    A construct(H handle, CommandQueue worker);

    Object decode(CommandQueue commandQueue, byte[] bArr, lnm<? super H> lnmVar);

    void delete(CommandQueue worker, H handle);

    String getLabel();

    String getTag();

    void register(CommandQueue worker, String key, H handle);

    void unregister(CommandQueue worker, String key);
}
