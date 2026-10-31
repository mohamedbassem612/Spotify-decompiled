package app.p000rive;

import app.p000rive.core.CommandQueue;
import app.p000rive.core.FontHandle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.d9n;
import p.eg;
import p.hm5;
import p.lnm;
import p.os00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lapp/rive/FontAsset;", "Lapp/rive/Asset;", "Lapp/rive/core/FontHandle;", "handle", "worker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "(JLapp/rive/core/CommandQueue;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "workerReference", "Lapp/rive/AcquiredWorkerReference;", "(JLapp/rive/AcquiredWorkerReference;)V", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontAsset extends Asset<FontHandle> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String tag = "Rive/Font";
    private static final String label = "font";

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u00020\u00032\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\u0087@¢\u0006\u0004\b\u000e\u0010\fJ*\u0010\u0011\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\fJ&\u0010\u0016\u001a\u00020\u00132\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u001b\u001a\u00020\u00132\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0002H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u00132\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010 \u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007H\u0016ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Lapp/rive/FontAsset$Companion;", "Lapp/rive/AssetOps;", "Lapp/rive/core/FontHandle;", "Lapp/rive/FontAsset;", "<init>", "()V", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "", "bytes", "create", "(Lapp/rive/core/CommandQueue;[BLp/lnm;)Ljava/lang/Object;", "Lapp/rive/Result;", "fromBytes", "worker", "decode-epMswW4", "decode", "handle", "Lp/rih1;", "delete-8-RWjZU", "(Lapp/rive/core/CommandQueue;J)V", "delete", "", "key", "register-AltPSKk", "(Lapp/rive/core/CommandQueue;Ljava/lang/String;J)V", "register", "unregister", "(Lapp/rive/core/CommandQueue;Ljava/lang/String;)V", "construct-5E6tRKQ", "(JLapp/rive/core/CommandQueue;)Lapp/rive/FontAsset;", "construct", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "label", "getLabel", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements AssetOps<FontHandle, FontAsset> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // app.p000rive.AssetOps
        public /* bridge */ /* synthetic */ Asset construct(FontHandle fontHandle, CommandQueue commandQueue) {
            return m23construct5E6tRKQ(fontHandle.m388unboximpl(), commandQueue);
        }

        /* JADX INFO: renamed from: construct-5E6tRKQ, reason: not valid java name */
        public FontAsset m23construct5E6tRKQ(long handle, CommandQueue worker) {
            return new FontAsset(handle, new AcquiredWorkerReference(worker), (DefaultConstructorMarker) null);
        }

        public final Object create(CommandQueue commandQueue, byte[] bArr, lnm<? super FontAsset> lnmVar) {
            return Asset.INSTANCE.createAsset$kotlin_release(this, commandQueue, bArr, lnmVar);
        }

        @Override // app.p000rive.AssetOps
        /* JADX INFO: renamed from: decode-epMswW4, reason: not valid java name and merged with bridge method [inline-methods] */
        public Object decode(CommandQueue commandQueue, byte[] bArr, lnm<? super FontHandle> lnmVar) {
            return commandQueue.m222decodeFontsOckvAc(bArr, lnmVar);
        }

        @Override // app.p000rive.AssetOps
        public /* bridge */ /* synthetic */ void delete(CommandQueue commandQueue, FontHandle fontHandle) {
            m25delete8RWjZU(commandQueue, fontHandle.m388unboximpl());
        }

        /* JADX INFO: renamed from: delete-8-RWjZU, reason: not valid java name */
        public void m25delete8RWjZU(CommandQueue worker, long handle) {
            worker.m227deleteFontwK5q9OY(handle);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @adt
        public final Object fromBytes(CommandQueue commandQueue, byte[] bArr, lnm<? super Result<FontAsset>> lnmVar) {
            FontAsset$Companion$fromBytes$1 fontAsset$Companion$fromBytes$1;
            if (lnmVar instanceof FontAsset$Companion$fromBytes$1) {
                fontAsset$Companion$fromBytes$1 = (FontAsset$Companion$fromBytes$1) lnmVar;
                int i = fontAsset$Companion$fromBytes$1.label;
                if ((i & os00.INVALID_ID) != 0) {
                    fontAsset$Companion$fromBytes$1.label = i - os00.INVALID_ID;
                } else {
                    fontAsset$Companion$fromBytes$1 = new FontAsset$Companion$fromBytes$1(this, lnmVar);
                }
            } else {
                fontAsset$Companion$fromBytes$1 = new FontAsset$Companion$fromBytes$1(this, lnmVar);
            }
            Object objCreate = fontAsset$Companion$fromBytes$1.result;
            int i2 = fontAsset$Companion$fromBytes$1.label;
            try {
                if (i2 == 0) {
                    hm5.M(objCreate);
                    fontAsset$Companion$fromBytes$1.label = 1;
                    objCreate = create(commandQueue, bArr, fontAsset$Companion$fromBytes$1);
                    d9n d9nVar = d9n.a;
                    if (objCreate == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objCreate);
                }
                return new Result.Success(objCreate);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                return new Result.Error(e2);
            }
        }

        @Override // app.p000rive.AssetOps
        public String getLabel() {
            return FontAsset.label;
        }

        @Override // app.p000rive.AssetOps
        public String getTag() {
            return FontAsset.tag;
        }

        @Override // app.p000rive.AssetOps
        public /* bridge */ /* synthetic */ void register(CommandQueue commandQueue, String str, FontHandle fontHandle) {
            m26registerAltPSKk(commandQueue, str, fontHandle.m388unboximpl());
        }

        /* JADX INFO: renamed from: register-AltPSKk, reason: not valid java name */
        public void m26registerAltPSKk(CommandQueue worker, String key, long handle) {
            worker.m267registerFont8RWjZU(key, handle);
        }

        @Override // app.p000rive.AssetOps
        public void unregister(CommandQueue worker, String key) {
            worker.unregisterFont(key);
        }

        private Companion() {
        }
    }

    private FontAsset(long j, AcquiredWorkerReference acquiredWorkerReference) {
        super(FontHandle.m382boximpl(j), acquiredWorkerReference.getWorker(), INSTANCE, null);
    }

    @adt
    public /* synthetic */ FontAsset(long j, CommandQueue commandQueue, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, commandQueue);
    }

    public /* synthetic */ FontAsset(long j, AcquiredWorkerReference acquiredWorkerReference, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, acquiredWorkerReference);
    }

    private FontAsset(long j, CommandQueue commandQueue) {
        this(j, AssetsKt.acquireForAsset(commandQueue, "Rive/Font"));
    }
}
