package app.p000rive.runtime.kotlin.core;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.eg;
import p.hab0;
import p.hhg1;
import p.rih1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0014¢\u0006\u0004\b$\u0010\u000eJ\u0017\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0002H\u0014¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0082 ¢\u0006\u0004\b+\u0010,J \u0010.\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b.\u0010/J(\u00100\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b0\u00101J \u00102\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b2\u0010/J \u00103\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0082 ¢\u0006\u0004\b3\u00104J(\u00105\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013H\u0082 ¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b7\u0010\u001fJ\u001f\u00107\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0013H\u0002¢\u0006\u0004\b7\u0010#R\"\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020:098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0011\u00108\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelListProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "Lp/rih1;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "newFileLock", "updateFileLock$kotlin_release", "(Ljava/util/concurrent/locks/ReentrantLock;)V", "updateFileLock", "pollChanges$kotlin_release", "()V", "pollChanges", "pointer", "cppDelete", "(J)V", "", "index", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "elementAt", "(I)Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "get", "item", "add", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "(ILapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "remove", "removeAt", "(I)V", "index1", "index2", "swap", "(II)V", "nativeGetValue", "value", "nativeSetValue", "(Lp/rih1;)V", "cppPointer", "cppSize", "(J)I", "cppElementAt", "(JI)J", "itemPointer", "cppAdd", "(JJ)V", "cppAddAt", "(JIJ)V", "cppRemove", "cppRemoveAt", "(JI)V", "cppSwap", "(JII)V", "boundsCheck", "size", "", "Lapp/rive/runtime/kotlin/core/ViewModelListProperty$CacheEntry;", "cachedItems", "Ljava/util/Map;", "getSize", "()I", "CacheEntry", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelListProperty extends ViewModelProperty<rih1> {
    public static final int $stable = 8;
    private Map<Long, CacheEntry> cachedItems;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelListProperty$CacheEntry;", "", "instance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "count", "", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;I)V", "getCount", "()I", "setCount", "(I)V", "getInstance", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CacheEntry {
        private int count;
        private final ViewModelInstance instance;

        public CacheEntry(ViewModelInstance viewModelInstance, int i) {
            this.instance = viewModelInstance;
            this.count = i;
        }

        public static /* synthetic */ CacheEntry copy$default(CacheEntry cacheEntry, ViewModelInstance viewModelInstance, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                viewModelInstance = cacheEntry.instance;
            }
            if ((i2 & 2) != 0) {
                i = cacheEntry.count;
            }
            return cacheEntry.copy(viewModelInstance, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewModelInstance getInstance() {
            return this.instance;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public final CacheEntry copy(ViewModelInstance instance, int count) {
            return new CacheEntry(instance, count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheEntry)) {
                return false;
            }
            CacheEntry cacheEntry = (CacheEntry) other;
            return u890.j(this.instance, cacheEntry.instance) && this.count == cacheEntry.count;
        }

        public final int getCount() {
            return this.count;
        }

        public final ViewModelInstance getInstance() {
            return this.instance;
        }

        public int hashCode() {
            return Integer.hashCode(this.count) + (this.instance.hashCode() * 31);
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public String toString() {
            return "CacheEntry(instance=" + this.instance + ", count=" + this.count + ")";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.ViewModelListProperty$elementAt$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01051 extends hab0 implements Function0 {
        final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01051(int i) {
            super(0);
            this.$index = i;
        }

        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final ViewModelInstance m520invoke() {
            ViewModelInstance cacheEntry;
            ViewModelListProperty.this.boundsCheck(this.$index);
            ViewModelListProperty viewModelListProperty = ViewModelListProperty.this;
            long jCppElementAt = viewModelListProperty.cppElementAt(viewModelListProperty.getCppPointer(), this.$index);
            CacheEntry cacheEntry2 = (CacheEntry) ViewModelListProperty.this.cachedItems.get(Long.valueOf(jCppElementAt));
            if (cacheEntry2 != null && (cacheEntry = cacheEntry2.getInstance()) != null) {
                return cacheEntry;
            }
            ViewModelListProperty viewModelListProperty2 = ViewModelListProperty.this;
            ViewModelInstance viewModelInstance = new ViewModelInstance(jCppElementAt, viewModelListProperty2.getFileLock());
            viewModelListProperty2.cachedItems.put(Long.valueOf(jCppElementAt), new CacheEntry(viewModelInstance, 1));
            return viewModelInstance;
        }
    }

    public ViewModelListProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        this.cachedItems = new LinkedHashMap();
    }

    private final void boundsCheck(int index, int size) {
        if (index < 0 || index >= size) {
            eg.g("Index out of bounds for ViewModelListProperty.");
        }
    }

    private final native void cppAdd(long cppPointer, long itemPointer);

    private final native void cppAddAt(long cppPointer, int index, long itemPointer);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppElementAt(long cppPointer, int index);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppRemove(long cppPointer, long itemPointer);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppRemoveAt(long cppPointer, int index);

    /* JADX INFO: Access modifiers changed from: private */
    public final native int cppSize(long cppPointer);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppSwap(long cppPointer, int index1, int index2);

    public final void add(int index, ViewModelInstance item) {
        if (!item.getHasCppObject()) {
            hhg1.n("Cannot add a disposed ViewModelProperty to ViewModelListProperty.");
            return;
        }
        ReentrantLock fileLock = getFileLock();
        item.updateFileLock$kotlin_release(fileLock);
        synchronized (fileLock) {
            try {
                boundsCheck(index, cppSize(getCppPointer()));
                Map<Long, CacheEntry> map = this.cachedItems;
                Long lValueOf = Long.valueOf(item.getCppPointer());
                CacheEntry cacheEntry = map.get(lValueOf);
                if (cacheEntry == null) {
                    item.acquire();
                    cacheEntry = new CacheEntry(item, 0);
                    map.put(lValueOf, cacheEntry);
                }
                CacheEntry cacheEntry2 = cacheEntry;
                cacheEntry2.setCount(cacheEntry2.getCount() + 1);
                cppAddAt(getCppPointer(), index, item.getCppPointer());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // app.p000rive.runtime.kotlin.core.NativeObject
    public void cppDelete(long pointer) {
        withLock(new AnonymousClass1(pointer));
    }

    public final ViewModelInstance elementAt(int index) {
        return (ViewModelInstance) withLock(new C01051(index));
    }

    public final ViewModelInstance get(int index) {
        return elementAt(index);
    }

    public final int getSize() {
        return ((Number) withLock(new ViewModelListProperty$size$1(this))).intValue();
    }

    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ rih1 nativeGetValue() {
        nativeGetValue2();
        return rih1.a;
    }

    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public void pollChanges$kotlin_release() {
        withLock(new ViewModelListProperty$pollChanges$1(this));
    }

    public final void remove(ViewModelInstance item) {
        withLock(new C01061(item, this));
    }

    public final void removeAt(int index) {
        withLock(new C01071(index));
    }

    public final void swap(int index1, int index2) {
        withLock(new C01081(index1, index2));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0097 */
    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateFileLock$kotlin_release(java.util.concurrent.locks.ReentrantLock r8) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: app.p000rive.runtime.kotlin.core.ViewModelListProperty.updateFileLock$kotlin_release(java.util.concurrent.locks.ReentrantLock):void");
    }

    /* JADX INFO: renamed from: nativeGetValue, reason: avoid collision after fix types in other method */
    public void nativeGetValue2() {
    }

    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(rih1 value) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void boundsCheck(int index) {
        boundsCheck(index, getSize());
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.ViewModelListProperty$swap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C01081 extends hab0 implements Function0 {
        final /* synthetic */ int $index1;
        final /* synthetic */ int $index2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01081(int i, int i2) {
            super(0);
            this.$index1 = i;
            this.$index2 = i2;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m525invoke() {
            ViewModelListProperty.this.boundsCheck(this.$index1);
            ViewModelListProperty.this.boundsCheck(this.$index2);
            if (this.$index1 == this.$index2) {
                return;
            }
            ViewModelListProperty viewModelListProperty = ViewModelListProperty.this;
            viewModelListProperty.cppSwap(viewModelListProperty.getCppPointer(), this.$index1, this.$index2);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m525invoke();
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.ViewModelListProperty$cppDelete$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ long $pointer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j) {
            super(0);
            this.$pointer = j;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m519invoke() {
            ViewModelListProperty.super.cppDelete(this.$pointer);
            Iterator it = ViewModelListProperty.this.cachedItems.values().iterator();
            while (it.hasNext()) {
                ((CacheEntry) it.next()).getInstance().release();
            }
            ViewModelListProperty.this.cachedItems.clear();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m519invoke();
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.ViewModelListProperty$remove$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C01061 extends hab0 implements Function0 {
        final /* synthetic */ ViewModelInstance $item;
        final /* synthetic */ ViewModelListProperty this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01061(ViewModelInstance viewModelInstance, ViewModelListProperty viewModelListProperty) {
            super(0);
            this.$item = viewModelInstance;
            this.this$0 = viewModelListProperty;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m522invoke() {
            if (!this.$item.getHasCppObject()) {
                hhg1.n("Cannot remove a disposed ViewModelProperty from ViewModelListProperty.");
                return;
            }
            CacheEntry cacheEntry = (CacheEntry) this.this$0.cachedItems.remove(Long.valueOf(this.$item.getCppPointer()));
            if (cacheEntry != null) {
                cacheEntry.getInstance().release();
            }
            ViewModelListProperty viewModelListProperty = this.this$0;
            viewModelListProperty.cppRemove(viewModelListProperty.getCppPointer(), this.$item.getCppPointer());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m522invoke();
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.ViewModelListProperty$removeAt$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C01071 extends hab0 implements Function0 {
        final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01071(int i) {
            super(0);
            this.$index = i;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m523invoke() {
            CacheEntry cacheEntry;
            ViewModelListProperty.this.boundsCheck(this.$index);
            ViewModelListProperty viewModelListProperty = ViewModelListProperty.this;
            long jCppElementAt = viewModelListProperty.cppElementAt(viewModelListProperty.getCppPointer(), this.$index);
            CacheEntry cacheEntry2 = (CacheEntry) ViewModelListProperty.this.cachedItems.get(Long.valueOf(jCppElementAt));
            if (cacheEntry2 != null) {
                ViewModelListProperty viewModelListProperty2 = ViewModelListProperty.this;
                cacheEntry2.setCount(cacheEntry2.getCount() - 1);
                if (cacheEntry2.getCount() == 0 && (cacheEntry = (CacheEntry) viewModelListProperty2.cachedItems.remove(Long.valueOf(jCppElementAt))) != null) {
                    cacheEntry.getInstance().release();
                }
            }
            ViewModelListProperty viewModelListProperty3 = ViewModelListProperty.this;
            viewModelListProperty3.cppRemoveAt(viewModelListProperty3.getCppPointer(), this.$index);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m523invoke();
            return rih1.a;
        }
    }

    public final void add(ViewModelInstance item) {
        if (item.getHasCppObject()) {
            ReentrantLock fileLock = getFileLock();
            item.updateFileLock$kotlin_release(fileLock);
            synchronized (fileLock) {
                try {
                    Map<Long, CacheEntry> map = this.cachedItems;
                    Long lValueOf = Long.valueOf(item.getCppPointer());
                    CacheEntry cacheEntry = map.get(lValueOf);
                    if (cacheEntry == null) {
                        item.acquire();
                        cacheEntry = new CacheEntry(item, 0);
                        map.put(lValueOf, cacheEntry);
                    }
                    CacheEntry cacheEntry2 = cacheEntry;
                    cacheEntry2.setCount(cacheEntry2.getCount() + 1);
                    cppAdd(getCppPointer(), item.getCppPointer());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        hhg1.n("Cannot add a disposed ViewModelProperty to ViewModelListProperty.");
    }
}
