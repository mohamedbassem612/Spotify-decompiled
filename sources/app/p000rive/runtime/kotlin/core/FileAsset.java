package app.p000rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.idd1;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0013\u0010\u000bJ\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010\"\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b\u0082\u0001\u0003#$%¨\u0006&"}, d2 = {"Lapp/rive/runtime/kotlin/core/FileAsset;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "address", "", "rendererTypeIdx", "<init>", "(JI)V", "cppPointer", "", "cppName", "(J)Ljava/lang/String;", "cppUniqueFilename", "", "bytes", "rendererType", "", "cppDecode", "(J[BI)Z", "cppCDNUrl", "decode", "([B)Z", "Lapp/rive/runtime/kotlin/core/RendererType;", "Lapp/rive/runtime/kotlin/core/RendererType;", "name$delegate", "Lp/znb0;", "getName", "()Ljava/lang/String;", "name", "uniqueFilename$delegate", "getUniqueFilename", "uniqueFilename", "cdnUrl$delegate", "getCdnUrl", "cdnUrl", "Lapp/rive/runtime/kotlin/core/AudioAsset;", "Lapp/rive/runtime/kotlin/core/FontAsset;", "Lapp/rive/runtime/kotlin/core/ImageAsset;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FileAsset extends NativeObject {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: cdnUrl$delegate, reason: from kotlin metadata */
    private final znb0 cdnUrl;

    /* JADX INFO: renamed from: name$delegate, reason: from kotlin metadata */
    private final znb0 name;
    private final RendererType rendererType;

    /* JADX INFO: renamed from: uniqueFilename$delegate, reason: from kotlin metadata */
    private final znb0 uniqueFilename;

    private FileAsset(long j, int i) {
        super(j);
        this.rendererType = RendererType.INSTANCE.fromIndex(i);
        this.name = new idd1(new FileAsset$name$2(this));
        this.uniqueFilename = new idd1(new FileAsset$uniqueFilename$2(this));
        this.cdnUrl = new idd1(new FileAsset$cdnUrl$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppCDNUrl(long cppPointer);

    private final native boolean cppDecode(long cppPointer, byte[] bytes, int rendererType);

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppName(long cppPointer);

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppUniqueFilename(long cppPointer);

    public final boolean decode(byte[] bytes) {
        return cppDecode(getCppPointer(), bytes, this.rendererType.getValue());
    }

    public final String getCdnUrl() {
        return (String) this.cdnUrl.getValue();
    }

    public final String getName() {
        return (String) this.name.getValue();
    }

    public final String getUniqueFilename() {
        return (String) this.uniqueFilename.getValue();
    }

    public /* synthetic */ FileAsset(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i);
    }
}
