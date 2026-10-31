package app.p000rive;

import app.p000rive.core.ArtboardHandle;
import app.p000rive.core.CheckableAutoCloseable;
import app.p000rive.core.CloseOnce;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.DefaultViewModelInfo;
import app.p000rive.core.FileHandle;
import app.p000rive.core.SuspendLazy;
import app.p000rive.runtime.kotlin.core.File;
import app.p000rive.runtime.kotlin.core.ViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0004\b\u0014\u0010\u0011J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0015\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0019\u0010\u0017J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000eH\u0086@¢\u0006\u0004\b\u001b\u0010\u0011J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R \u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R,\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0*0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R,\u00102\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e0*0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R \u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000e0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010,R&\u00105\u001a\u0014\u0012\u0004\u0012\u000204\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0*0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Lapp/rive/RiveFile;", "Lapp/rive/core/CheckableAutoCloseable;", "Lapp/rive/core/FileHandle;", "fileHandle", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "<init>", "(JLapp/rive/core/CommandQueue;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lp/rih1;", "close", "()V", "checkOpen$kotlin_release", "checkOpen", "", "", "getArtboardNames", "(Lp/lnm;)Ljava/lang/Object;", "Lapp/rive/RiveFileAsset;", "getFileAssets", "getViewModelNames", "viewModel", "getViewModelInstanceNames", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lapp/rive/runtime/kotlin/core/ViewModel$Property;", "getViewModelProperties", "Lapp/rive/runtime/kotlin/core/File$Enum;", "getEnums", "Lapp/rive/Artboard;", "artboard", "Lapp/rive/core/DefaultViewModelInfo;", "getDefaultViewModelInfo", "(Lapp/rive/Artboard;Lp/lnm;)Ljava/lang/Object;", "J", "getFileHandle-ENT3xMk", "()J", "Lapp/rive/core/CommandQueue;", "getRiveWorker", "()Lapp/rive/core/CommandQueue;", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "Lapp/rive/core/SuspendLazy;", "artboardNamesCache", "Lapp/rive/core/SuspendLazy;", "fileAssetsCache", "viewModelNamesCache", "", "instanceNamesCache", "Ljava/util/Map;", "propertiesCache", "enumsCache", "Lapp/rive/core/ArtboardHandle;", "defaultViewModelInfoCache", "", "getClosed", "()Z", "closed", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveFile implements CheckableAutoCloseable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SuspendLazy<List<String>> artboardNamesCache;
    private final CloseOnce closer;
    private final Map<ArtboardHandle, SuspendLazy<DefaultViewModelInfo>> defaultViewModelInfoCache;
    private final SuspendLazy<List<File.Enum>> enumsCache;
    private final SuspendLazy<List<RiveFileAsset>> fileAssetsCache;
    private final long fileHandle;
    private final Map<String, SuspendLazy<List<String>>> instanceNamesCache;
    private final Map<String, SuspendLazy<List<ViewModel.Property>>> propertiesCache;
    private final CommandQueue riveWorker;
    private final SuspendLazy<List<String>> viewModelNamesCache;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0087@¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lapp/rive/RiveFile$Companion;", "", "<init>", "()V", "Lapp/rive/RiveFileSource;", "source", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/RiveFile;", "load", "(Lapp/rive/RiveFileSource;Lapp/rive/core/CommandQueue;Lp/lnm;)Ljava/lang/Object;", "Lapp/rive/Result;", "fromSource", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @adt
        public final Object fromSource(RiveFileSource riveFileSource, CommandQueue commandQueue, lnm<? super Result<RiveFile>> lnmVar) {
            RiveFile$Companion$fromSource$1 riveFile$Companion$fromSource$1;
            if (lnmVar instanceof RiveFile$Companion$fromSource$1) {
                riveFile$Companion$fromSource$1 = (RiveFile$Companion$fromSource$1) lnmVar;
                int i = riveFile$Companion$fromSource$1.label;
                if ((i & os00.INVALID_ID) != 0) {
                    riveFile$Companion$fromSource$1.label = i - os00.INVALID_ID;
                } else {
                    riveFile$Companion$fromSource$1 = new RiveFile$Companion$fromSource$1(this, lnmVar);
                }
            } else {
                riveFile$Companion$fromSource$1 = new RiveFile$Companion$fromSource$1(this, lnmVar);
            }
            Object objLoad = riveFile$Companion$fromSource$1.result;
            int i2 = riveFile$Companion$fromSource$1.label;
            try {
                if (i2 == 0) {
                    hm5.M(objLoad);
                    riveFile$Companion$fromSource$1.label = 1;
                    objLoad = load(riveFileSource, commandQueue, riveFile$Companion$fromSource$1);
                    d9n d9nVar = d9n.a;
                    if (objLoad == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objLoad);
                }
                return new Result.Success(objLoad);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                return new Result.Error(e2);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
        
            if (r6 == r5) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object load(app.p000rive.RiveFileSource r7, app.p000rive.core.CommandQueue r8, p.lnm<? super app.p000rive.RiveFile> r9) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: app.p000rive.RiveFile.Companion.load(app.rive.RiveFileSource, app.rive.core.CommandQueue, p.lnm):java.lang.Object");
        }

        private Companion() {
        }
    }

    private RiveFile(long j, CommandQueue commandQueue) {
        this.fileHandle = j;
        this.riveWorker = commandQueue;
        this.closer = new CloseOnce(FileHandle.m372toStringimpl(j), new RiveFile$closer$1(this));
        commandQueue.acquire("Rive/File");
        this.artboardNamesCache = new SuspendLazy<>(new RiveFile$artboardNamesCache$1(this, null));
        this.fileAssetsCache = new SuspendLazy<>(new RiveFile$fileAssetsCache$1(this, null));
        this.viewModelNamesCache = new SuspendLazy<>(new RiveFile$viewModelNamesCache$1(this, null));
        this.instanceNamesCache = new LinkedHashMap();
        this.propertiesCache = new LinkedHashMap();
        this.enumsCache = new SuspendLazy<>(new RiveFile$enumsCache$1(this, null));
        this.defaultViewModelInfoCache = new LinkedHashMap();
    }

    public final void checkOpen$kotlin_release() {
        this.closer.checkOpen();
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final Object getArtboardNames(lnm<? super List<String>> lnmVar) {
        this.closer.checkOpen();
        return this.artboardNamesCache.await(lnmVar);
    }

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final Object getDefaultViewModelInfo(Artboard artboard, lnm<? super DefaultViewModelInfo> lnmVar) {
        SuspendLazy<DefaultViewModelInfo> suspendLazy;
        this.closer.checkOpen();
        artboard.checkOpen$kotlin_release();
        artboard.requireFromFile$kotlin_release(this);
        synchronized (this.defaultViewModelInfoCache) {
            try {
                Map<ArtboardHandle, SuspendLazy<DefaultViewModelInfo>> map = this.defaultViewModelInfoCache;
                ArtboardHandle artboardHandleM178boximpl = ArtboardHandle.m178boximpl(artboard.getArtboardHandle());
                SuspendLazy<DefaultViewModelInfo> suspendLazy2 = map.get(artboardHandleM178boximpl);
                if (suspendLazy2 == null) {
                    suspendLazy2 = new SuspendLazy<>(new RiveFile$getDefaultViewModelInfo$2$1$1(this, artboard, null));
                    map.put(artboardHandleM178boximpl, suspendLazy2);
                }
                suspendLazy = suspendLazy2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return suspendLazy.await(lnmVar);
    }

    public final Object getEnums(lnm<? super List<File.Enum>> lnmVar) {
        this.closer.checkOpen();
        return this.enumsCache.await(lnmVar);
    }

    public final Object getFileAssets(lnm<? super List<RiveFileAsset>> lnmVar) {
        this.closer.checkOpen();
        return this.fileAssetsCache.await(lnmVar);
    }

    /* JADX INFO: renamed from: getFileHandle-ENT3xMk, reason: not valid java name and from getter */
    public final long getFileHandle() {
        return this.fileHandle;
    }

    public final CommandQueue getRiveWorker() {
        return this.riveWorker;
    }

    public final Object getViewModelInstanceNames(String str, lnm<? super List<String>> lnmVar) {
        SuspendLazy<List<String>> suspendLazy;
        this.closer.checkOpen();
        synchronized (this.instanceNamesCache) {
            try {
                Map<String, SuspendLazy<List<String>>> map = this.instanceNamesCache;
                SuspendLazy<List<String>> suspendLazy2 = map.get(str);
                if (suspendLazy2 == null) {
                    suspendLazy2 = new SuspendLazy<>(new RiveFile$getViewModelInstanceNames$2$1$1(this, str, null));
                    map.put(str, suspendLazy2);
                }
                suspendLazy = suspendLazy2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return suspendLazy.await(lnmVar);
    }

    public final Object getViewModelNames(lnm<? super List<String>> lnmVar) {
        this.closer.checkOpen();
        return this.viewModelNamesCache.await(lnmVar);
    }

    public final Object getViewModelProperties(String str, lnm<? super List<ViewModel.Property>> lnmVar) {
        SuspendLazy<List<ViewModel.Property>> suspendLazy;
        this.closer.checkOpen();
        synchronized (this.propertiesCache) {
            try {
                Map<String, SuspendLazy<List<ViewModel.Property>>> map = this.propertiesCache;
                SuspendLazy<List<ViewModel.Property>> suspendLazy2 = map.get(str);
                if (suspendLazy2 == null) {
                    suspendLazy2 = new SuspendLazy<>(new RiveFile$getViewModelProperties$2$1$1(this, str, null));
                    map.put(str, suspendLazy2);
                }
                suspendLazy = suspendLazy2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return suspendLazy.await(lnmVar);
    }

    public /* synthetic */ RiveFile(long j, CommandQueue commandQueue, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, commandQueue);
    }
}
