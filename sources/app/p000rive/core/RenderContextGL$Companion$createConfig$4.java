package app.p000rive.core;

import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.cy30;
import p.hab0;
import p.ktd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RenderContextGL$Companion$createConfig$4 extends hab0 implements Function0 {
    final /* synthetic */ EGLConfig $chosenConfig;
    final /* synthetic */ EGLDisplay $display;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderContextGL$Companion$createConfig$4(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        super(0);
        this.$display = eGLDisplay;
        this.$chosenConfig = eGLConfig;
    }

    public final String invoke() {
        int iCreateConfig$attr = RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12324);
        int iCreateConfig$attr2 = RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12323);
        int iCreateConfig$attr3 = RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12322);
        int iCreateConfig$attr4 = RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12321);
        int iCreateConfig$attr5 = RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12325);
        int iCreateConfig$attr6 = RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12326);
        StringBuilder sbQ = cy30.q(iCreateConfig$attr, iCreateConfig$attr2, "EGL config chosen successfully:\n  R=", "\n  G=", "\n  B=");
        ktd.p(iCreateConfig$attr3, iCreateConfig$attr4, "\n  A=", "\n  Depth=", sbQ);
        sbQ.append(iCreateConfig$attr5);
        sbQ.append("\n  Stencil=");
        sbQ.append(iCreateConfig$attr6);
        return sbQ.toString();
    }
}
