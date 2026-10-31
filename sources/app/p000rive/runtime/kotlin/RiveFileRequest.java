package app.p000rive.runtime.kotlin;

import app.p000rive.runtime.kotlin.core.File;
import app.p000rive.runtime.kotlin.core.FileAssetLoader;
import app.p000rive.runtime.kotlin.core.RendererType;
import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.h8o0;
import p.ky21;
import p.luo1;
import p.mi31;
import p.mn21;
import p.my21;
import p.ty21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u0006\u001a"}, d2 = {"Lapp/rive/runtime/kotlin/RiveFileRequest;", "Lp/mn21;", "Lapp/rive/runtime/kotlin/core/File;", "", "url", "Lapp/rive/runtime/kotlin/core/RendererType;", "rendererType", "Lp/my21;", "listener", "Lp/ky21;", "errorListener", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "assetLoader", "<init>", "(Ljava/lang/String;Lapp/rive/runtime/kotlin/core/RendererType;Lp/my21;Lp/ky21;Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "response", "Lp/rih1;", "deliverResponse", "(Lapp/rive/runtime/kotlin/core/File;)V", "Lp/h8o0;", "Lp/ty21;", "parseNetworkResponse", "(Lp/h8o0;)Lp/ty21;", "Lapp/rive/runtime/kotlin/core/RendererType;", "Lp/my21;", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveFileRequest extends mn21 {
    public static final int $stable = 8;
    private final FileAssetLoader assetLoader;
    private final my21 listener;
    private final RendererType rendererType;

    public /* synthetic */ RiveFileRequest(String str, RendererType rendererType, my21 my21Var, ky21 ky21Var, FileAssetLoader fileAssetLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rendererType, my21Var, ky21Var, (i & 16) != 0 ? null : fileAssetLoader);
    }

    @Override // p.mn21
    public void deliverResponse(File response) {
        RiveAnimationView.loadFromNetwork$lambda$4(((mi31) this.listener).a, response);
    }

    @Override // p.mn21
    public ty21 parseNetworkResponse(h8o0 response) {
        byte[] bArr;
        if (response != null) {
            try {
                bArr = response.a;
            } catch (UnsupportedEncodingException e) {
                return new ty21(new ParseError(e));
            }
        } else {
            bArr = null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new ty21(new File(bArr, this.rendererType, this.assetLoader), luo1.v(response));
    }

    public RiveFileRequest(String str, RendererType rendererType, my21 my21Var, ky21 ky21Var, FileAssetLoader fileAssetLoader) {
        super(str, ky21Var);
        this.rendererType = rendererType;
        this.listener = my21Var;
        this.assetLoader = fileAssetLoader;
    }
}
