package app.p000rive.runtime.kotlin.core;

import app.p000rive.runtime.kotlin.core.errors.ArtboardException;
import app.p000rive.runtime.kotlin.core.errors.ViewModelException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.f4i1;
import p.gvg;
import p.hhg1;
import p.lr80;
import p.q7h;
import p.tr80;
import p.u890;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0017\u0018\u00002\u00020\u0001:\u0001YB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0095 ¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0095 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u001f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-J0\u00100\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010/\u001a\u00020\nH\u0092 ¢\u0006\u0004\b0\u00101J \u00102\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0010H\u0092 ¢\u0006\u0004\b2\u0010\u0013J \u00103\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0092 ¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0092 ¢\u0006\u0004\b5\u00106J \u00107\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0010H\u0092 ¢\u0006\u0004\b7\u0010\u0013J\u0018\u00108\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0092 ¢\u0006\u0004\b8\u00109J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010\u000b\u001a\u00020\nH\u0092 ¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0092 ¢\u0006\u0004\b>\u00106J \u0010?\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020\fH\u0092 ¢\u0006\u0004\b?\u0010\u000fJ \u0010A\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010@\u001a\u00020\nH\u0092 ¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020F8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010JR\u0014\u0010O\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010-R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00100:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020;0:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0014\u0010X\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010-¨\u0006Z"}, d2 = {"Lapp/rive/runtime/kotlin/core/File;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "bytes", "Lapp/rive/runtime/kotlin/core/RendererType;", "rendererType", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "fileAssetLoader", "<init>", "([BLapp/rive/runtime/kotlin/core/RendererType;Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "", "cppPointer", "", "index", "cppArtboardByIndex", "(JI)J", "", "viewModelName", "cppViewModelByName", "(JLjava/lang/String;)J", "pointer", "Lp/rih1;", "cppDelete", "(J)V", "name", "Lapp/rive/runtime/kotlin/core/Artboard;", "artboard", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/Artboard;", "(I)Lapp/rive/runtime/kotlin/core/Artboard;", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "viewModelInstance", "Lapp/rive/runtime/kotlin/core/BindableArtboard;", "createBindableArtboardByName", "(Ljava/lang/String;Lapp/rive/runtime/kotlin/core/ViewModelInstance;)Lapp/rive/runtime/kotlin/core/BindableArtboard;", "createDefaultBindableArtboard", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;)Lapp/rive/runtime/kotlin/core/BindableArtboard;", "viewModelIdx", "Lapp/rive/runtime/kotlin/core/ViewModel;", "getViewModelByIndex", "(I)Lapp/rive/runtime/kotlin/core/ViewModel;", "getViewModelByName", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModel;", "defaultViewModelForArtboard", "(Lapp/rive/runtime/kotlin/core/Artboard;)Lapp/rive/runtime/kotlin/core/ViewModel;", "release", "()I", "length", "fileAssetLoaderPointer", "import", "([BIIJ)J", "cppArtboardByName", "cppArtboardNameByIndex", "(JI)Ljava/lang/String;", "cppArtboardCount", "(J)I", "cppCreateBindableArtboardByName", "cppCreateDefaultBindableArtboard", "(J)J", "", "Lapp/rive/runtime/kotlin/core/File$Enum;", "cppEnums", "(J)Ljava/util/List;", "cppViewModelCount", "cppViewModelByIndex", "artboardPointer", "cppDefaultViewModelForArtboard", "(JJ)J", "Lapp/rive/runtime/kotlin/core/RendererType;", "getRendererType", "()Lapp/rive/runtime/kotlin/core/RendererType;", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getFileLock$kotlin_release", "()Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "lock", "getFirstArtboard", "()Lapp/rive/runtime/kotlin/core/Artboard;", "firstArtboard", "getArtboardCount", "artboardCount", "getArtboardNames", "()Ljava/util/List;", "artboardNames", "getEnums", "enums", "getViewModelCount", "viewModelCount", "Enum", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class File extends NativeObject {
    public static final int $stable = 8;
    private final ReentrantLock fileLock;
    private final RendererType rendererType;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/core/File$Enum;", "", "name", "", "values", "", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Enum {
        public static final int $stable = 8;
        private final String name;
        private final List<String> values;

        public Enum(String str, List<String> list) {
            this.name = str;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Enum copy$default(Enum r0, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.name;
            }
            if ((i & 2) != 0) {
                list = r0.values;
            }
            return r0.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<String> component2() {
            return this.values;
        }

        public final Enum copy(String name, List<String> values) {
            return new Enum(name, values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Enum)) {
                return false;
            }
            Enum r5 = (Enum) other;
            return u890.j(this.name, r5.name) && u890.j(this.values, r5.values);
        }

        public final String getName() {
            return this.name;
        }

        public final List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "Enum(name=" + this.name + ", values=" + this.values + ")";
        }
    }

    public File(byte[] bArr, RendererType rendererType, FileAssetLoader fileAssetLoader) {
        super(0L);
        this.rendererType = rendererType;
        if (fileAssetLoader != null) {
            fileAssetLoader.setRendererType(getRendererType());
            fileAssetLoader.acquire();
            getDependencies().add(fileAssetLoader);
        }
        setCppPointer(m509import(bArr, bArr.length, getRendererType().getValue(), fileAssetLoader != null ? fileAssetLoader.getCppPointer() : 0L));
        getRefs().incrementAndGet();
        this.fileLock = new ReentrantLock();
    }

    private native long cppArtboardByName(long cppPointer, String name);

    private native int cppArtboardCount(long cppPointer);

    private native String cppArtboardNameByIndex(long cppPointer, int index);

    private native long cppCreateBindableArtboardByName(long cppPointer, String name);

    private native long cppCreateDefaultBindableArtboard(long cppPointer);

    private native long cppDefaultViewModelForArtboard(long cppPointer, long artboardPointer);

    private native List<Enum> cppEnums(long cppPointer);

    private native long cppViewModelByIndex(long cppPointer, int viewModelIdx);

    private native int cppViewModelCount(long cppPointer);

    public static /* synthetic */ BindableArtboard createBindableArtboardByName$default(File file, String str, ViewModelInstance viewModelInstance, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: createBindableArtboardByName");
            return null;
        }
        if ((i & 2) != 0) {
            viewModelInstance = null;
        }
        return file.createBindableArtboardByName(str, viewModelInstance);
    }

    public static /* synthetic */ BindableArtboard createDefaultBindableArtboard$default(File file, ViewModelInstance viewModelInstance, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: createDefaultBindableArtboard");
            return null;
        }
        if ((i & 1) != 0) {
            viewModelInstance = null;
        }
        return file.createDefaultBindableArtboard(viewModelInstance);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    private native long m509import(byte[] bytes, int length, int rendererType, long fileAssetLoaderPointer);

    public Artboard artboard(String name) throws ArtboardException {
        long jCppArtboardByName = cppArtboardByName(getCppPointer(), name);
        if (jCppArtboardByName != 0) {
            Artboard artboard = new Artboard(jCppArtboardByName, getFileLock(), this);
            getDependencies().add(artboard);
            return artboard;
        }
        List<String> artboardNames = getArtboardNames();
        ArrayList arrayList = new ArrayList(q7h.U(artboardNames, 10));
        Iterator<T> it = artboardNames.iterator();
        while (it.hasNext()) {
            arrayList.add("\"" + ((String) it.next()) + "\"");
        }
        throw new ArtboardException("Artboard \"" + name + "\" not found. Available Artboards: " + arrayList);
    }

    public native long cppArtboardByIndex(long cppPointer, int index);

    @Override // app.p000rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public native long cppViewModelByName(long cppPointer, String viewModelName);

    public BindableArtboard createBindableArtboardByName(String name, ViewModelInstance viewModelInstance) throws ArtboardException {
        long jCppCreateBindableArtboardByName = cppCreateBindableArtboardByName(getCppPointer(), name);
        if (jCppCreateBindableArtboardByName == 0) {
            throw new ArtboardException(f4i1.f("No BindableArtboard found with name ", name, "."));
        }
        BindableArtboard bindableArtboard = new BindableArtboard(jCppCreateBindableArtboardByName, viewModelInstance);
        getDependencies().add(bindableArtboard);
        return bindableArtboard;
    }

    public BindableArtboard createDefaultBindableArtboard(ViewModelInstance viewModelInstance) throws ArtboardException {
        long jCppCreateDefaultBindableArtboard = cppCreateDefaultBindableArtboard(getCppPointer());
        if (jCppCreateDefaultBindableArtboard == 0) {
            throw new ArtboardException("No default BindableArtboard.");
        }
        BindableArtboard bindableArtboard = new BindableArtboard(jCppCreateDefaultBindableArtboard, viewModelInstance);
        getDependencies().add(bindableArtboard);
        return bindableArtboard;
    }

    public ViewModel defaultViewModelForArtboard(Artboard artboard) throws ViewModelException {
        long jCppDefaultViewModelForArtboard = cppDefaultViewModelForArtboard(getCppPointer(), artboard.getCppPointer());
        if (jCppDefaultViewModelForArtboard == 0) {
            throw new ViewModelException(f4i1.f("No default ViewModel found for artboard ", artboard.getName(), "."));
        }
        ViewModel viewModel = new ViewModel(jCppDefaultViewModelForArtboard, getFileLock());
        getDependencies().add(viewModel);
        return viewModel;
    }

    public int getArtboardCount() {
        return cppArtboardCount(getCppPointer());
    }

    public List<String> getArtboardNames() {
        tr80 tr80VarQ = yoi1.Q(0, getArtboardCount());
        ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
        lr80 it = tr80VarQ.iterator();
        while (it.hasNext()) {
            arrayList.add(cppArtboardNameByIndex(getCppPointer(), it.nextInt()));
        }
        return arrayList;
    }

    public List<Enum> getEnums() {
        return cppEnums(getCppPointer());
    }

    /* JADX INFO: renamed from: getFileLock$kotlin_release, reason: from getter */
    public ReentrantLock getFileLock() {
        return this.fileLock;
    }

    public Artboard getFirstArtboard() {
        return artboard(0);
    }

    public ReentrantLock getLock() {
        return getFileLock();
    }

    public RendererType getRendererType() {
        return this.rendererType;
    }

    public ViewModel getViewModelByIndex(int viewModelIdx) throws ViewModelException {
        long jCppViewModelByIndex = cppViewModelByIndex(getCppPointer(), viewModelIdx);
        if (jCppViewModelByIndex == 0) {
            throw new ViewModelException(gvg.e(viewModelIdx, "No ViewModel found at index ", "."));
        }
        ViewModel viewModel = new ViewModel(jCppViewModelByIndex, getFileLock());
        getDependencies().add(viewModel);
        return viewModel;
    }

    public ViewModel getViewModelByName(String viewModelName) throws ViewModelException {
        long jCppViewModelByName = cppViewModelByName(getCppPointer(), viewModelName);
        if (jCppViewModelByName == 0) {
            throw new ViewModelException(f4i1.f("No ViewModel found with name ", viewModelName, "."));
        }
        ViewModel viewModel = new ViewModel(jCppViewModelByName, getFileLock());
        getDependencies().add(viewModel);
        return viewModel;
    }

    public int getViewModelCount() {
        return cppViewModelCount(getCppPointer());
    }

    @Override // app.p000rive.runtime.kotlin.core.NativeObject, app.p000rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease;
        synchronized (getFileLock()) {
            iRelease = super.release();
        }
        return iRelease;
    }

    public /* synthetic */ File(byte[] bArr, RendererType rendererType, FileAssetLoader fileAssetLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, (i & 4) != 0 ? null : fileAssetLoader);
    }

    public Artboard artboard(int index) throws ArtboardException {
        long jCppArtboardByIndex = cppArtboardByIndex(getCppPointer(), index);
        if (jCppArtboardByIndex != 0) {
            Artboard artboard = new Artboard(jCppArtboardByIndex, getFileLock(), this);
            getDependencies().add(artboard);
            return artboard;
        }
        throw new ArtboardException(gvg.e(index, "No Artboard found at index ", "."));
    }
}
