package app.p000rive;

import app.p000rive.core.ArtboardHandle;
import app.p000rive.core.CheckableAutoCloseable;
import app.p000rive.core.CloseOnce;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.FileHandle;
import app.p000rive.core.RiveSurface;
import app.p000rive.core.SuspendLazy;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.d9n;
import p.eg;
import p.f4i1;
import p.gvg;
import p.hm5;
import p.lnm;
import p.os00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0015\u001a\u00020\r2\n\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\r2\n\u0010\u0012\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u001b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001eH\u0086@¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\r¢\u0006\u0004\b'\u0010\u000fJ\u0015\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020#¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020#H\u0086@¢\u0006\u0004\b+\u0010 R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u00101R \u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001e098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Lapp/rive/Artboard;", "Lapp/rive/core/CheckableAutoCloseable;", "Lapp/rive/core/ArtboardHandle;", "artboardHandle", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/core/FileHandle;", "fileHandle", "", "name", "<init>", "(JLapp/rive/core/CommandQueue;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lp/rih1;", "close", "()V", "checkOpen$kotlin_release", "checkOpen", "worker", "requireOwnedBy$kotlin_release", "(Lapp/rive/core/CommandQueue;)V", "requireOwnedBy", "Lapp/rive/RiveFile;", "file", "requireFromFile$kotlin_release", "(Lapp/rive/RiveFile;)V", "requireFromFile", "expectedFileHandle", "requireFromFile-n824lvY$kotlin_release", "(Lapp/rive/core/CommandQueue;J)V", "", "getStateMachineNames", "(Lp/lnm;)Ljava/lang/Object;", "Lapp/rive/core/RiveSurface;", "surface", "", "scaleFactor", "resizeArtboard", "(Lapp/rive/core/RiveSurface;F)V", "resetArtboardSize", "volume", "setVolume", "(F)V", "getVolume", "J", "getArtboardHandle-nSTdbJo", "()J", "Lapp/rive/core/CommandQueue;", "getRiveWorker$kotlin_release", "()Lapp/rive/core/CommandQueue;", "getFileHandle-ENT3xMk$kotlin_release", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "Lapp/rive/core/SuspendLazy;", "stateMachineNamesCache", "Lapp/rive/core/SuspendLazy;", "", "getClosed", "()Z", "closed", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Artboard implements CheckableAutoCloseable {
    private final long artboardHandle;
    private final CloseOnce closer;
    private final long fileHandle;
    private final String name;
    private final CommandQueue riveWorker;
    private final SuspendLazy<List<String>> stateMachineNamesCache;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/rive/Artboard$Companion;", "", "<init>", "()V", "Lapp/rive/RiveFile;", "file", "", "artboardName", "Lapp/rive/Artboard;", "create", "(Lapp/rive/RiveFile;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "fromFile", "(Lapp/rive/RiveFile;Ljava/lang/String;)Lapp/rive/Artboard;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object create$default(Companion companion, RiveFile riveFile, String str, lnm lnmVar, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.create(riveFile, str, lnmVar);
        }

        public static /* synthetic */ Artboard fromFile$default(Companion companion, RiveFile riveFile, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.fromFile(riveFile, str);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [app.rive.RiveFile, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v10 */
        /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v21 */
        /* JADX WARN: Type inference failed for: r13v22 */
        /* JADX WARN: Type inference failed for: r13v24 */
        /* JADX WARN: Type inference failed for: r13v25 */
        /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v9 */
        /* JADX WARN: Type inference failed for: r15v1, types: [int] */
        /* JADX WARN: Type inference failed for: r15v10 */
        /* JADX WARN: Type inference failed for: r15v11 */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13, types: [app.rive.RiveFile] */
        /* JADX WARN: Type inference failed for: r15v14 */
        /* JADX WARN: Type inference failed for: r15v19 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v20 */
        /* JADX WARN: Type inference failed for: r15v21 */
        /* JADX WARN: Type inference failed for: r15v22 */
        /* JADX WARN: Type inference failed for: r15v23 */
        /* JADX WARN: Type inference failed for: r15v24 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4, types: [app.rive.RiveFile] */
        /* JADX WARN: Type inference failed for: r15v5, types: [app.rive.RiveFile] */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r15v8 */
        public final Object create(RiveFile riveFile, String str, lnm<? super Artboard> lnmVar) throws Exception {
            Artboard$Companion$create$1 artboard$Companion$create$1;
            Exception exc;
            CancellationException cancellationException;
            ?? r15;
            ?? r13;
            ?? r16;
            ?? r14;
            ?? r17;
            String str2;
            ?? r18;
            String str3;
            long jM184unboximpl;
            if (lnmVar instanceof Artboard$Companion$create$1) {
                artboard$Companion$create$1 = (Artboard$Companion$create$1) lnmVar;
                int i = artboard$Companion$create$1.label;
                if ((i & os00.INVALID_ID) != 0) {
                    artboard$Companion$create$1.label = i - os00.INVALID_ID;
                } else {
                    artboard$Companion$create$1 = new Artboard$Companion$create$1(this, lnmVar);
                }
            } else {
                artboard$Companion$create$1 = new Artboard$Companion$create$1(this, lnmVar);
            }
            Object obj = artboard$Companion$create$1.result;
            ?? r19 = artboard$Companion$create$1.label;
            try {
                if (r19 == 0) {
                    hm5.M(obj);
                    String strConcat = str != null ? "with name ".concat(str) : "(default)";
                    RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Artboard$Companion$create$2(strConcat, riveFile));
                    try {
                        riveFile.checkOpen$kotlin_release();
                        d9n d9nVar = d9n.a;
                        if (str != null) {
                            CommandQueue riveWorker = riveFile.getRiveWorker();
                            long jM49getFileHandleENT3xMk = riveFile.getFileHandle();
                            artboard$Companion$create$1.L$0 = riveFile;
                            artboard$Companion$create$1.L$1 = str;
                            artboard$Companion$create$1.L$2 = strConcat;
                            artboard$Companion$create$1.label = 1;
                            Object objM212createArtboardByNameConfirmedSTqRd7c = riveWorker.m212createArtboardByNameConfirmedSTqRd7c(jM49getFileHandleENT3xMk, str, artboard$Companion$create$1);
                            if (objM212createArtboardByNameConfirmedSTqRd7c != d9nVar) {
                                r18 = riveFile;
                                str3 = strConcat;
                                obj = objM212createArtboardByNameConfirmedSTqRd7c;
                                jM184unboximpl = ((ArtboardHandle) obj).m184unboximpl();
                                riveFile = str3;
                                r19 = r18;
                            }
                        } else {
                            CommandQueue riveWorker2 = riveFile.getRiveWorker();
                            long jM49getFileHandleENT3xMk2 = riveFile.getFileHandle();
                            artboard$Companion$create$1.L$0 = riveFile;
                            artboard$Companion$create$1.L$1 = str;
                            artboard$Companion$create$1.L$2 = strConcat;
                            artboard$Companion$create$1.label = 2;
                            Object objM214createDefaultArtboardConfirmed2ZIOzHc = riveWorker2.m214createDefaultArtboardConfirmed2ZIOzHc(jM49getFileHandleENT3xMk2, artboard$Companion$create$1);
                            if (objM214createDefaultArtboardConfirmed2ZIOzHc != d9nVar) {
                                r17 = riveFile;
                                str2 = strConcat;
                                obj = objM214createDefaultArtboardConfirmed2ZIOzHc;
                                jM184unboximpl = ((ArtboardHandle) obj).m184unboximpl();
                                riveFile = str2;
                                r19 = r17;
                            }
                        }
                        return d9nVar;
                    } catch (CancellationException e) {
                        r16 = riveFile;
                        r14 = strConcat;
                        cancellationException = e;
                        RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Artboard$Companion$create$4(r14, r16));
                        throw cancellationException;
                    } catch (Exception e2) {
                        r15 = riveFile;
                        r13 = strConcat;
                        exc = e2;
                        RiveLog.INSTANCE.getLogger().e("Rive/Artboard", exc, new Artboard$Companion$create$5(r13, r15));
                        throw exc;
                    }
                }
                if (r19 == 1) {
                    String str4 = (String) artboard$Companion$create$1.L$2;
                    str = (String) artboard$Companion$create$1.L$1;
                    RiveFile riveFile2 = (RiveFile) artboard$Companion$create$1.L$0;
                    hm5.M(obj);
                    str3 = str4;
                    r18 = riveFile2;
                    jM184unboximpl = ((ArtboardHandle) obj).m184unboximpl();
                    riveFile = str3;
                    r19 = r18;
                } else {
                    if (r19 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = (String) artboard$Companion$create$1.L$2;
                    str = (String) artboard$Companion$create$1.L$1;
                    RiveFile riveFile3 = (RiveFile) artboard$Companion$create$1.L$0;
                    hm5.M(obj);
                    str2 = str5;
                    r17 = riveFile3;
                    jM184unboximpl = ((ArtboardHandle) obj).m184unboximpl();
                    riveFile = str2;
                    r19 = r17;
                }
                String str6 = str;
                long j = jM184unboximpl;
                RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Artboard$Companion$create$3(j, riveFile, r19));
                return new Artboard(j, r19.getRiveWorker(), r19.getFileHandle(), str6, null);
            } catch (CancellationException e3) {
                cancellationException = e3;
                r14 = riveFile;
                r16 = r19;
            } catch (Exception e4) {
                exc = e4;
                r13 = riveFile;
                r15 = r19;
            }
        }

        @adt
        public final Artboard fromFile(RiveFile file, String artboardName) {
            file.checkOpen$kotlin_release();
            long jM211createArtboardByName2ZIOzHc = artboardName != null ? file.getRiveWorker().m211createArtboardByName2ZIOzHc(file.getFileHandle(), artboardName) : file.getRiveWorker().m213createDefaultArtboard6NrLy0M(file.getFileHandle());
            RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Artboard$Companion$fromFile$1(jM211createArtboardByName2ZIOzHc, artboardName != null ? "with name ".concat(artboardName) : "(default)", file));
            return new Artboard(jM211createArtboardByName2ZIOzHc, file.getRiveWorker(), file.getFileHandle(), artboardName, null);
        }

        private Companion() {
        }
    }

    private Artboard(long j, CommandQueue commandQueue, long j2, String str) {
        this.artboardHandle = j;
        this.riveWorker = commandQueue;
        this.fileHandle = j2;
        this.name = str;
        this.closer = new CloseOnce(ArtboardHandle.m183toStringimpl(j), new Artboard$closer$1(this));
        this.stateMachineNamesCache = new SuspendLazy<>(new Artboard$stateMachineNamesCache$1(this, null));
    }

    public static /* synthetic */ void resizeArtboard$default(Artboard artboard, RiveSurface riveSurface, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        artboard.resizeArtboard(riveSurface, f);
    }

    public final void checkOpen$kotlin_release() {
        this.closer.checkOpen();
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    /* JADX INFO: renamed from: getArtboardHandle-nSTdbJo, reason: not valid java name and from getter */
    public final long getArtboardHandle() {
        return this.artboardHandle;
    }

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    /* JADX INFO: renamed from: getFileHandle-ENT3xMk$kotlin_release, reason: not valid java name and from getter */
    public final long getFileHandle() {
        return this.fileHandle;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getRiveWorker$kotlin_release, reason: from getter */
    public final CommandQueue getRiveWorker() {
        return this.riveWorker;
    }

    public final Object getStateMachineNames(lnm<? super List<String>> lnmVar) {
        this.closer.checkOpen();
        return this.stateMachineNamesCache.await(lnmVar);
    }

    public final Object getVolume(lnm<? super Float> lnmVar) {
        this.closer.checkOpen();
        return this.riveWorker.m241getArtboardVolumeb88yb0A(this.artboardHandle, lnmVar);
    }

    public final void requireFromFile$kotlin_release(RiveFile file) {
        m2requireFromFilen824lvY$kotlin_release(file.getRiveWorker(), file.getFileHandle());
    }

    /* JADX INFO: renamed from: requireFromFile-n824lvY$kotlin_release, reason: not valid java name */
    public final void m2requireFromFilen824lvY$kotlin_release(CommandQueue worker, long expectedFileHandle) {
        if (this.riveWorker != worker || !FileHandle.m370equalsimpl0(this.fileHandle, expectedFileHandle)) {
            throw new RiveIncompatibleResourceException(gvg.h("Artboard ", ArtboardHandle.m183toStringimpl(this.artboardHandle), " was not created from RiveFile ", FileHandle.m372toStringimpl(expectedFileHandle)));
        }
    }

    public final void requireOwnedBy$kotlin_release(CommandQueue worker) {
        if (this.riveWorker != worker) {
            throw new RiveIncompatibleResourceException(f4i1.f("Artboard ", ArtboardHandle.m183toStringimpl(this.artboardHandle), " is not owned by the required RiveWorker"));
        }
    }

    public final void resetArtboardSize() {
        this.closer.checkOpen();
        this.riveWorker.m274resetArtboardSizeuiJWFY8(this.artboardHandle);
    }

    public final void resizeArtboard(RiveSurface surface, float scaleFactor) {
        this.closer.checkOpen();
        surface.checkOpen$kotlin_release();
        surface.requireOwnedBy$kotlin_release(this.riveWorker);
        this.riveWorker.m275resizeArtboardVFK_cXo(this.artboardHandle, surface, scaleFactor);
    }

    public final void setVolume(float volume) {
        this.closer.checkOpen();
        this.riveWorker.m278setArtboardVolumeb88yb0A(this.artboardHandle, volume);
    }

    public /* synthetic */ Artboard(long j, CommandQueue commandQueue, long j2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, commandQueue, j2, str);
    }
}
