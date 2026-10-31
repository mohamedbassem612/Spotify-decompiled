package app.p000rive.runtime.kotlin;

import app.p000rive.runtime.kotlin.core.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.f4i1;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType;", "", "()V", "Companion", "ResourceBytes", "ResourceId", "ResourceRiveFile", "ResourceUrl", "Lapp/rive/runtime/kotlin/ResourceType$ResourceBytes;", "Lapp/rive/runtime/kotlin/ResourceType$ResourceId;", "Lapp/rive/runtime/kotlin/ResourceType$ResourceRiveFile;", "Lapp/rive/runtime/kotlin/ResourceType$ResourceUrl;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ResourceType {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType$Companion;", "", "()V", "makeMaybeResource", "Lapp/rive/runtime/kotlin/ResourceType;", "value", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResourceType makeMaybeResource(Object value) {
            if (value == null) {
                return null;
            }
            if (value instanceof Integer) {
                return new ResourceId(((Number) value).intValue());
            }
            if (value instanceof String) {
                return new ResourceUrl((String) value);
            }
            if (value instanceof byte[]) {
                return new ResourceBytes((byte[]) value);
            }
            if (value instanceof File) {
                return new ResourceRiveFile((File) value);
            }
            hhg1.n(f4i1.f("Incompatible type ", value.getClass().getSimpleName(), "."));
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType$ResourceBytes;", "Lapp/rive/runtime/kotlin/ResourceType;", "bytes", "", "([B)V", "getBytes", "()[B", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResourceBytes extends ResourceType {
        public static final int $stable = 8;
        private final byte[] bytes;

        public ResourceBytes(byte[] bArr) {
            super(null);
            this.bytes = bArr;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType$ResourceId;", "Lapp/rive/runtime/kotlin/ResourceType;", "id", "", "(I)V", "getId", "()I", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResourceId extends ResourceType {
        public static final int $stable = 0;
        private final int id;

        public ResourceId(int i) {
            super(null);
            this.id = i;
        }

        public final int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType$ResourceRiveFile;", "Lapp/rive/runtime/kotlin/ResourceType;", "file", "Lapp/rive/runtime/kotlin/core/File;", "(Lapp/rive/runtime/kotlin/core/File;)V", "getFile", "()Lapp/rive/runtime/kotlin/core/File;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResourceRiveFile extends ResourceType {
        public static final int $stable = 8;
        private final File file;

        public ResourceRiveFile(File file) {
            super(null);
            this.file = file;
        }

        public final File getFile() {
            return this.file;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType$ResourceUrl;", "Lapp/rive/runtime/kotlin/ResourceType;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResourceUrl extends ResourceType {
        public static final int $stable = 0;
        private final String url;

        public ResourceUrl(String str) {
            super(null);
            this.url = str;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    public /* synthetic */ ResourceType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ResourceType() {
    }
}
