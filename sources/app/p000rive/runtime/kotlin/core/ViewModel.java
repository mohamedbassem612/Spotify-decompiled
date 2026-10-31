package app.p000rive.runtime.kotlin.core;

import app.p000rive.runtime.kotlin.core.errors.ViewModelException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.f4i1;
import p.q7h;
import p.r0z;
import p.t0z;
import p.u890;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0002'(B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0095 J\u0011\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0092 J\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\nH\u0092 J\u0019\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0092 J\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u0003H\u0092 J\u0011\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0003H\u0092 J\u0011\u0010 \u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0003H\u0092 J\u0011\u0010!\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0003H\u0092 J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\f¨\u0006)"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "fileLock", "Ljava/util/concurrent/locks/ReentrantLock;", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "getFileLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "instanceCount", "", "getInstanceCount", "()I", "name", "", "getName", "()Ljava/lang/String;", "properties", "", "Lapp/rive/runtime/kotlin/core/ViewModel$Property;", "getProperties", "()Ljava/util/List;", "propertyCount", "getPropertyCount", "cppCreateBlankInstance", "cppPointer", "cppCreateDefaultInstance", "cppCreateInstanceFromIndex", "index", "cppCreateInstanceFromName", "cppGetProperties", "cppInstanceCount", "cppName", "cppPropertyCount", "createBlankInstance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "createDefaultInstance", "createInstanceFromIndex", "createInstanceFromName", "Property", "PropertyDataType", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ViewModel extends NativeObject {
    public static final int $stable = 8;
    private final ReentrantLock fileLock;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel$Property;", "", "type", "Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "name", "", "(Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "()Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Property {
        public static final int $stable = 0;
        private final String name;
        private final PropertyDataType type;

        public Property(PropertyDataType propertyDataType, String str) {
            this.type = propertyDataType;
            this.name = str;
        }

        public static /* synthetic */ Property copy$default(Property property, PropertyDataType propertyDataType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                propertyDataType = property.type;
            }
            if ((i & 2) != 0) {
                str = property.name;
            }
            return property.copy(propertyDataType, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PropertyDataType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Property copy(PropertyDataType type, String name) {
            return new Property(type, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Property)) {
                return false;
            }
            Property property = (Property) other;
            return this.type == property.type && u890.j(this.name, property.name);
        }

        public final String getName() {
            return this.name;
        }

        public final PropertyDataType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "Property(type=" + this.type + ", name=" + this.name + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "STRING", "NUMBER", "BOOLEAN", "COLOR", "LIST", "ENUM", "TRIGGER", "VIEW_MODEL", "INTEGER", "SYMBOL_LIST_INDEX", "ASSET_IMAGE", "ARTBOARD", "ASSET_FONT", "ASSET_BLOB", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum PropertyDataType {
        NONE(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        COLOR(4),
        LIST(5),
        ENUM(6),
        TRIGGER(7),
        VIEW_MODEL(8),
        INTEGER(9),
        SYMBOL_LIST_INDEX(10),
        ASSET_IMAGE(11),
        ARTBOARD(12),
        ASSET_FONT(13),
        ASSET_BLOB(14);

        private static final Map<Integer, PropertyDataType> map;
        private final int value;
        private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType$Companion;", "", "()V", "map", "", "", "Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "fromInt", "type", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PropertyDataType fromInt(int type) {
                return (PropertyDataType) PropertyDataType.map.get(Integer.valueOf(type));
            }

            private Companion() {
            }
        }

        static {
            r0z entries = getEntries();
            int iS = zno1.s(q7h.U(entries, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
            for (Object obj : entries) {
                linkedHashMap.put(Integer.valueOf(((PropertyDataType) obj).value), obj);
            }
            map = linkedHashMap;
        }

        PropertyDataType(int i) {
            this.value = i;
        }

        public static final PropertyDataType fromInt(int i) {
            return INSTANCE.fromInt(i);
        }

        public static r0z getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public ViewModel(long j, ReentrantLock reentrantLock) {
        super(j);
        this.fileLock = reentrantLock;
    }

    private native long cppCreateDefaultInstance(long cppPointer);

    private native long cppCreateInstanceFromIndex(long cppPointer, int index);

    private native long cppCreateInstanceFromName(long cppPointer, String name);

    private native List<Property> cppGetProperties(long cppPointer);

    private native int cppInstanceCount(long cppPointer);

    private native String cppName(long cppPointer);

    private native int cppPropertyCount(long cppPointer);

    public native long cppCreateBlankInstance(long cppPointer);

    public ViewModelInstance createBlankInstance() throws ViewModelException {
        long jCppCreateBlankInstance;
        synchronized (getFileLock()) {
            jCppCreateBlankInstance = cppCreateBlankInstance(getCppPointer());
        }
        if (jCppCreateBlankInstance == 0) {
            throw new ViewModelException("Could not create a blank ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateBlankInstance, getFileLock());
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public ViewModelInstance createDefaultInstance() throws ViewModelException {
        long jCppCreateDefaultInstance;
        synchronized (getFileLock()) {
            jCppCreateDefaultInstance = cppCreateDefaultInstance(getCppPointer());
        }
        if (jCppCreateDefaultInstance == 0) {
            throw new ViewModelException("Could not create default ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateDefaultInstance, getFileLock());
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public ViewModelInstance createInstanceFromIndex(int index) throws ViewModelException {
        long jCppCreateInstanceFromIndex;
        synchronized (getFileLock()) {
            jCppCreateInstanceFromIndex = cppCreateInstanceFromIndex(getCppPointer(), index);
        }
        if (jCppCreateInstanceFromIndex == 0) {
            throw new ViewModelException(f4i1.c(index, "ViewModel instance not found: "));
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromIndex, getFileLock());
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public ViewModelInstance createInstanceFromName(String name) throws ViewModelException {
        long jCppCreateInstanceFromName;
        synchronized (getFileLock()) {
            jCppCreateInstanceFromName = cppCreateInstanceFromName(getCppPointer(), name);
        }
        if (jCppCreateInstanceFromName == 0) {
            throw new ViewModelException("ViewModel instance not found: ".concat(name));
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromName, getFileLock());
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public ReentrantLock getFileLock() {
        return this.fileLock;
    }

    public int getInstanceCount() {
        return cppInstanceCount(getCppPointer());
    }

    public String getName() {
        return cppName(getCppPointer());
    }

    public List<Property> getProperties() {
        return cppGetProperties(getCppPointer());
    }

    public int getPropertyCount() {
        return cppPropertyCount(getCppPointer());
    }
}
