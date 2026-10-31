package app.p000rive.runtime.kotlin.core;

import app.p000rive.runtime.kotlin.core.errors.ViewModelException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p.ihc1;
import p.l1d;
import p.o7h;
import p.u890;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001:\u0001hB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\tH\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u0000H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0018\u0010<\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\b<\u0010=J \u0010>\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0092 ¢\u0006\u0004\b>\u0010?J \u0010@\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0092 ¢\u0006\u0004\b@\u0010?J \u0010A\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0092 ¢\u0006\u0004\bA\u0010?J \u0010B\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0092 ¢\u0006\u0004\bB\u0010?J \u0010C\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0092 ¢\u0006\u0004\bC\u0010?J \u0010D\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0092 ¢\u0006\u0004\bD\u0010?J \u0010E\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0092 ¢\u0006\u0004\bE\u0010?J \u0010F\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0092 ¢\u0006\u0004\bF\u0010?J \u0010G\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0092 ¢\u0006\u0004\bG\u0010?J \u0010H\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0092 ¢\u0006\u0004\bH\u0010?J(\u0010K\u001a\u00020J2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bM\u0010\u000bJ\u0018\u0010N\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bN\u0010\u000bJ`\u0010T\u001a\u00028\u0000\"\u000e\b\u0000\u0010P\u0018\u0001*\u0006\u0012\u0002\b\u00030O2\u0006\u0010\u0017\u001a\u00020\u00162\u001a\b\u0004\u0010R\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020Q2\u001a\b\u0004\u0010S\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000QH\u0092\b¢\u0006\u0004\bT\u0010UJ\u001d\u0010X\u001a\u00020\u00002\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00160VH\u0012¢\u0006\u0004\bX\u0010YR\u0016\u0010\u0005\u001a\u00020\u00048\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010ZR2\u0010\\\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030O0[8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR.\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00000[8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\bb\u0010]\u001a\u0004\bc\u0010_\"\u0004\bd\u0010aR\u0014\u0010g\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006i"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "pointer", "Lp/rih1;", "cppDelete", "(J)V", "", "release", "()I", "newFileLock", "updateFileLock$kotlin_release", "(Ljava/util/concurrent/locks/ReentrantLock;)V", "updateFileLock", "pollChanges$kotlin_release", "()V", "pollChanges", "", "path", "Lapp/rive/runtime/kotlin/core/ViewModelNumberProperty;", "getNumberProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelNumberProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelStringProperty;", "getStringProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelStringProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelBooleanProperty;", "getBooleanProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelBooleanProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelColorProperty;", "getColorProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelColorProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelEnumProperty;", "getEnumProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelEnumProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty;", "getTriggerProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelImageProperty;", "getImageProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelImageProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelListProperty;", "getListProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelListProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelArtboardProperty;", "getArtboardProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelArtboardProperty;", "getInstanceProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "instance", "setInstanceProperty", "(Ljava/lang/String;Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "transfer", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "cppPointer", "cppName", "(J)Ljava/lang/String;", "cppPropertyNumber", "(JLjava/lang/String;)J", "cppPropertyString", "cppPropertyBoolean", "cppPropertyColor", "cppPropertyEnum", "cppPropertyTrigger", "cppPropertyImage", "cppPropertyList", "cppPropertyArtboard", "cppPropertyInstance", "instancePointer", "", "cppSetInstanceProperty", "(JLjava/lang/String;J)Z", "cppRefInstance", "cppDerefInstance", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "T", "Lkotlin/Function2;", "cppGetPropertyFn", "constructor", "getProperty", "(Ljava/lang/String;Lp/vu30;Lp/vu30;)Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "", "parts", "traverse", "(Ljava/util/List;)Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "Ljava/util/concurrent/locks/ReentrantLock;", "", "properties", "Ljava/util/Map;", "getProperties", "()Ljava/util/Map;", "setProperties", "(Ljava/util/Map;)V", "children", "getChildren", "setChildren", "getName", "()Ljava/lang/String;", "name", "Transfer", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ViewModelInstance extends NativeObject {
    public static final int $stable = 8;
    private Map<String, ViewModelInstance> children;
    private volatile ReentrantLock fileLock;
    private Map<String, ViewModelProperty<?>> properties;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "instance", "<init>", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "Lp/rih1;", "dispose", "()V", "end$kotlin_release", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "end", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "", "valid", "Z", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Transfer {
        public static final int $stable = 8;
        private final ViewModelInstance instance;
        private boolean valid = true;

        public Transfer(ViewModelInstance viewModelInstance) throws ViewModelException {
            this.instance = viewModelInstance;
            if (viewModelInstance.getRefCount() <= 0) {
                throw new ViewModelException("Cannot transfer a disposed ViewModelInstance.");
            }
            synchronized (viewModelInstance.fileLock) {
                viewModelInstance.cppRefInstance(viewModelInstance.getCppPointer());
            }
            viewModelInstance.acquire();
        }

        public final void dispose() throws ViewModelException {
            if (this.valid) {
                this.valid = false;
                this.instance.release();
            } else {
                throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot dispose.");
            }
        }

        public final ViewModelInstance end$kotlin_release() throws ViewModelException {
            if (this.valid) {
                this.valid = false;
                return this.instance;
            }
            throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot end transfer again.");
        }
    }

    public ViewModelInstance(long j, ReentrantLock reentrantLock) {
        super(j);
        this.fileLock = reentrantLock;
        this.properties = new ConcurrentHashMap();
        this.children = new ConcurrentHashMap();
        synchronized (this.fileLock) {
            cppRefInstance(getCppPointer());
        }
    }

    private native void cppDerefInstance(long cppPointer);

    private native String cppName(long cppPointer);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyArtboard(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyBoolean(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyColor(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyEnum(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyImage(long cppPointer, String path);

    private native long cppPropertyInstance(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyList(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyNumber(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyString(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyTrigger(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native void cppRefInstance(long cppPointer);

    private native boolean cppSetInstanceProperty(long cppPointer, String path, long instancePointer);

    private <T extends ViewModelProperty<?>> T getProperty(String path, vu30 cppGetPropertyFn, vu30 constructor) throws ViewModelException {
        T t;
        List listQ0 = ihc1.Q0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listQ0.subList(0, listQ0.size() - 1);
        String str = (String) o7h.A0(listQ0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            if (viewModelInstanceTraverse.getProperties().get(str) != null) {
                u890.B();
                throw null;
            }
            long jLongValue = ((Number) cppGetPropertyFn.invoke(Long.valueOf(viewModelInstanceTraverse.getCppPointer()), str)).longValue();
            if (jLongValue == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            t = (T) constructor.invoke(Long.valueOf(jLongValue), viewModelInstanceTraverse.fileLock);
            viewModelInstanceTraverse.getProperties().put(str, t);
            getDependencies().add(t);
        }
        return t;
    }

    private ViewModelInstance traverse(List<String> parts) throws ViewModelException {
        if (parts.isEmpty()) {
            return this;
        }
        String str = (String) o7h.q0(parts);
        Map<String, ViewModelInstance> children = getChildren();
        ViewModelInstance viewModelInstanceTraverse$createChildInstance = children.get(str);
        if (viewModelInstanceTraverse$createChildInstance == null) {
            viewModelInstanceTraverse$createChildInstance = traverse$createChildInstance(this, str);
            children.put(str, viewModelInstanceTraverse$createChildInstance);
        }
        return viewModelInstanceTraverse$createChildInstance.traverse(parts.subList(1, parts.size()));
    }

    private static final ViewModelInstance traverse$createChildInstance(ViewModelInstance viewModelInstance, String str) throws ViewModelException {
        long jCppPropertyInstance;
        synchronized (viewModelInstance.fileLock) {
            jCppPropertyInstance = viewModelInstance.cppPropertyInstance(viewModelInstance.getCppPointer(), str);
        }
        if (jCppPropertyInstance == 0) {
            throw new ViewModelException(l1d.m("Property not found: ", str));
        }
        ViewModelInstance viewModelInstance2 = new ViewModelInstance(jCppPropertyInstance, viewModelInstance.fileLock);
        viewModelInstance.getChildren().put(str, viewModelInstance2);
        viewModelInstance.getDependencies().add(viewModelInstance2);
        return viewModelInstance2;
    }

    @Override // app.p000rive.runtime.kotlin.core.NativeObject
    public void cppDelete(long pointer) {
        synchronized (this.fileLock) {
            cppDerefInstance(pointer);
        }
    }

    public ViewModelArtboardProperty getArtboardProperty(String path) throws ViewModelException {
        ViewModelProperty<?> viewModelProperty;
        List listQ0 = ihc1.Q0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listQ0.subList(0, listQ0.size() - 1);
        String str = (String) o7h.A0(listQ0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            try {
                viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
                if (viewModelProperty == null) {
                    long jCppPropertyArtboard = cppPropertyArtboard(viewModelInstanceTraverse.getCppPointer(), str);
                    if (jCppPropertyArtboard == 0) {
                        throw new ViewModelException("Property not found: ".concat(path));
                    }
                    ViewModelArtboardProperty viewModelArtboardProperty = new ViewModelArtboardProperty(jCppPropertyArtboard, viewModelInstanceTraverse.fileLock);
                    viewModelInstanceTraverse.getProperties().put(str, viewModelArtboardProperty);
                    getDependencies().add(viewModelArtboardProperty);
                    viewModelProperty = viewModelArtboardProperty;
                } else if (!(viewModelProperty instanceof ViewModelArtboardProperty)) {
                    throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (ViewModelArtboardProperty) viewModelProperty;
    }

    public ViewModelBooleanProperty getBooleanProperty(String path) throws ViewModelException {
        ViewModelProperty<?> viewModelProperty;
        List listQ0 = ihc1.Q0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listQ0.subList(0, listQ0.size() - 1);
        String str = (String) o7h.A0(listQ0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            try {
                viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
                if (viewModelProperty == null) {
                    long jCppPropertyBoolean = cppPropertyBoolean(viewModelInstanceTraverse.getCppPointer(), str);
                    if (jCppPropertyBoolean == 0) {
                        throw new ViewModelException("Property not found: ".concat(path));
                    }
                    ViewModelBooleanProperty viewModelBooleanProperty = new ViewModelBooleanProperty(jCppPropertyBoolean, viewModelInstanceTraverse.fileLock);
                    viewModelInstanceTraverse.getProperties().put(str, viewModelBooleanProperty);
                    getDependencies().add(viewModelBooleanProperty);
                    viewModelProperty = viewModelBooleanProperty;
                } else if (!(viewModelProperty instanceof ViewModelBooleanProperty)) {
                    throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (ViewModelBooleanProperty) viewModelProperty;
    }

    public Map<String, ViewModelInstance> getChildren() {
        return this.children;
    }

    public ViewModelColorProperty getColorProperty(String path) throws ViewModelException {
        ViewModelProperty<?> viewModelProperty;
        List listQ0 = ihc1.Q0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listQ0.subList(0, listQ0.size() - 1);
        String str = (String) o7h.A0(listQ0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            try {
                viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
                if (viewModelProperty == null) {
                    long jCppPropertyColor = cppPropertyColor(viewModelInstanceTraverse.getCppPointer(), str);
                    if (jCppPropertyColor == 0) {
                        throw new ViewModelException("Property not found: ".concat(path));
                    }
                    ViewModelColorProperty viewModelColorProperty = new ViewModelColorProperty(jCppPropertyColor, viewModelInstanceTraverse.fileLock);
                    viewModelInstanceTraverse.getProperties().put(str, viewModelColorProperty);
                    getDependencies().add(viewModelColorProperty);
                    viewModelProperty = viewModelColorProperty;
                } else if (!(viewModelProperty instanceof ViewModelColorProperty)) {
                    throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (ViewModelColorProperty) viewModelProperty;
    }

    public ViewModelEnumProperty getEnumProperty(String path) throws ViewModelException {
        ViewModelProperty<?> viewModelProperty;
        List listQ0 = ihc1.Q0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listQ0.subList(0, listQ0.size() - 1);
        String str = (String) o7h.A0(listQ0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            try {
                viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
                if (viewModelProperty == null) {
                    long jCppPropertyEnum = cppPropertyEnum(viewModelInstanceTraverse.getCppPointer(), str);
                    if (jCppPropertyEnum == 0) {
                        throw new ViewModelException("Property not found: ".concat(path));
                    }
                    ViewModelEnumProperty viewModelEnumProperty = new ViewModelEnumProperty(jCppPropertyEnum, viewModelInstanceTraverse.fileLock);
                    viewModelInstanceTraverse.getProperties().put(str, viewModelEnumProperty);
                    getDependencies().add(viewModelEnumProperty);
                    viewModelProperty = viewModelEnumProperty;
                } else if (!(viewModelProperty instanceof ViewModelEnumProperty)) {
                    throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (ViewModelEnumProperty) viewModelProperty;
    }

    public ViewModelImageProperty getImageProperty(String path) throws ViewModelException {
        ViewModelProperty<?> viewModelProperty;
        List listQ0 = ihc1.Q0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listQ0.subList(0, listQ0.size() - 1);
        String str = (String) o7h.A0(listQ0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            try {
                viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
                if (viewModelProperty == null) {
                    long jCppPropertyImage = cppPropertyImage(viewModelInstanceTraverse.getCppPointer(), str);
                    if (jCppPropertyImage == 0) {
                        throw new ViewModelException("Property not found: ".concat(path));
                    }
                    ViewModelImageProperty viewModelImageProperty = new ViewModelImageProperty(jCppPropertyImage, viewModelInstanceTraverse.fileLock);
                    viewModelInstanceTraverse.getProperties().put(str, viewModelImageProperty);
                    getDependencies().add(viewModelImageProperty);
                    viewModelProperty = viewModelImageProperty;
                } else if (!(viewModelProperty instanceof ViewModelImageProperty)) {
                    throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (ViewModelImageProperty) viewModelProperty;
    }

    public ViewModelInstance getInstanceProperty(String path) {
        return traverse(ihc1.Q0(path, new String[]{"/"}, 0, 6));
    }

    public ViewModelListProperty getListProperty(String path) throws ViewModelException {
        ViewModelProperty<?> viewModelProperty;
        List listQ0 = ihc1.Q0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listQ0.subList(0, listQ0.size() - 1);
        String str = (String) o7h.A0(listQ0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            try {
                viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
                if (viewModelProperty == null) {
                    long jCppPropertyList = cppPropertyList(viewModelInstanceTraverse.getCppPointer(), str);
                    if (jCppPropertyList == 0) {
                        throw new ViewModelException("Property not found: ".concat(path));
                    }
                    ViewModelListProperty viewModelListProperty = new ViewModelListProperty(jCppPropertyList, viewModelInstanceTraverse.fileLock);
                    viewModelInstanceTraverse.getProperties().put(str, viewModelListProperty);
                    getDependencies().add(viewModelListProperty);
                    viewModelProperty = viewModelListProperty;
                } else if (!(viewModelProperty instanceof ViewModelListProperty)) {
                    throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (ViewModelListProperty) viewModelProperty;
    }

    public String getName() {
        return cppName(getCppPointer());
    }

    public ViewModelNumberProperty getNumberProperty(String path) throws ViewModelException {
        ViewModelProperty<?> viewModelProperty;
        List listQ0 = ihc1.Q0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listQ0.subList(0, listQ0.size() - 1);
        String str = (String) o7h.A0(listQ0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            try {
                viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
                if (viewModelProperty == null) {
                    long jCppPropertyNumber = cppPropertyNumber(viewModelInstanceTraverse.getCppPointer(), str);
                    if (jCppPropertyNumber == 0) {
                        throw new ViewModelException("Property not found: ".concat(path));
                    }
                    ViewModelNumberProperty viewModelNumberProperty = new ViewModelNumberProperty(jCppPropertyNumber, viewModelInstanceTraverse.fileLock);
                    viewModelInstanceTraverse.getProperties().put(str, viewModelNumberProperty);
                    getDependencies().add(viewModelNumberProperty);
                    viewModelProperty = viewModelNumberProperty;
                } else if (!(viewModelProperty instanceof ViewModelNumberProperty)) {
                    throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (ViewModelNumberProperty) viewModelProperty;
    }

    public Map<String, ViewModelProperty<?>> getProperties() {
        return this.properties;
    }

    public ViewModelStringProperty getStringProperty(String path) throws ViewModelException {
        ViewModelProperty<?> viewModelProperty;
        List listQ0 = ihc1.Q0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listQ0.subList(0, listQ0.size() - 1);
        String str = (String) o7h.A0(listQ0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            try {
                viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
                if (viewModelProperty == null) {
                    long jCppPropertyString = cppPropertyString(viewModelInstanceTraverse.getCppPointer(), str);
                    if (jCppPropertyString == 0) {
                        throw new ViewModelException("Property not found: ".concat(path));
                    }
                    ViewModelStringProperty viewModelStringProperty = new ViewModelStringProperty(jCppPropertyString, viewModelInstanceTraverse.fileLock);
                    viewModelInstanceTraverse.getProperties().put(str, viewModelStringProperty);
                    getDependencies().add(viewModelStringProperty);
                    viewModelProperty = viewModelStringProperty;
                } else if (!(viewModelProperty instanceof ViewModelStringProperty)) {
                    throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (ViewModelStringProperty) viewModelProperty;
    }

    public ViewModelTriggerProperty getTriggerProperty(String path) throws ViewModelException {
        ViewModelProperty<?> viewModelProperty;
        List listQ0 = ihc1.Q0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listQ0.subList(0, listQ0.size() - 1);
        String str = (String) o7h.A0(listQ0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            try {
                viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
                if (viewModelProperty == null) {
                    long jCppPropertyTrigger = cppPropertyTrigger(viewModelInstanceTraverse.getCppPointer(), str);
                    if (jCppPropertyTrigger == 0) {
                        throw new ViewModelException("Property not found: ".concat(path));
                    }
                    ViewModelTriggerProperty viewModelTriggerProperty = new ViewModelTriggerProperty(jCppPropertyTrigger, viewModelInstanceTraverse.fileLock);
                    viewModelInstanceTraverse.getProperties().put(str, viewModelTriggerProperty);
                    getDependencies().add(viewModelTriggerProperty);
                    viewModelProperty = viewModelTriggerProperty;
                } else if (!(viewModelProperty instanceof ViewModelTriggerProperty)) {
                    throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (ViewModelTriggerProperty) viewModelProperty;
    }

    public void pollChanges$kotlin_release() {
        synchronized (this.fileLock) {
            try {
                Iterator<T> it = getProperties().values().iterator();
                while (it.hasNext()) {
                    ((ViewModelProperty) it.next()).pollChanges$kotlin_release();
                }
                Iterator<T> it2 = getChildren().values().iterator();
                while (it2.hasNext()) {
                    ((ViewModelInstance) it2.next()).pollChanges$kotlin_release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // app.p000rive.runtime.kotlin.core.NativeObject, app.p000rive.runtime.kotlin.core.RefCount
    public int release() {
        while (true) {
            ReentrantLock reentrantLock = this.fileLock;
            synchronized (reentrantLock) {
                if (this.fileLock == reentrantLock) {
                    return super.release();
                }
            }
        }
    }

    public void setChildren(Map<String, ViewModelInstance> map) {
        this.children = map;
    }

    public void setInstanceProperty(String path, ViewModelInstance instance) throws ViewModelException {
        List listQ0 = ihc1.Q0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listQ0.subList(0, listQ0.size() - 1);
        String str = (String) o7h.A0(listQ0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ReentrantLock reentrantLock = viewModelInstanceTraverse.fileLock;
        instance.updateFileLock$kotlin_release(reentrantLock);
        synchronized (reentrantLock) {
            if (!cppSetInstanceProperty(viewModelInstanceTraverse.getCppPointer(), str, instance.getCppPointer())) {
                throw new ViewModelException("Property not found: " + path + "; or instance is incompatible.");
            }
            viewModelInstanceTraverse.getChildren().put(str, instance);
        }
    }

    public void setProperties(Map<String, ViewModelProperty<?>> map) {
        this.properties = map;
    }

    public Transfer transfer() {
        return new Transfer(this);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateFileLock$kotlin_release(java.util.concurrent.locks.ReentrantLock r7) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: app.p000rive.runtime.kotlin.core.ViewModelInstance.updateFileLock$kotlin_release(java.util.concurrent.locks.ReentrantLock):void");
    }
}
