package app.p000rive;

import app.p000rive.core.RiveSurface;
import kotlin.Metadata;
import p.err0;
import p.hdn0;
import p.v8r;
import p.ven0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R/\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R/\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lapp/rive/RiveSurfaceState;", "", "<init>", "()V", "Lapp/rive/core/RiveSurface;", "<set-?>", "surface$delegate", "Lp/ven0;", "getSurface", "()Lapp/rive/core/RiveSurface;", "setSurface", "(Lapp/rive/core/RiveSurface;)V", "surface", "", "width$delegate", "Lp/hdn0;", "getWidth", "()I", "setWidth", "(I)V", "width", "height$delegate", "getHeight", "setHeight", "height", "Lapp/rive/RiveTextureView;", "textureView$delegate", "getTextureView", "()Lapp/rive/RiveTextureView;", "setTextureView", "(Lapp/rive/RiveTextureView;)V", "textureView", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class RiveSurfaceState {

    /* JADX INFO: renamed from: surface$delegate, reason: from kotlin metadata */
    private final ven0 surface = v8r.q((Object) null);

    /* JADX INFO: renamed from: width$delegate, reason: from kotlin metadata */
    private final hdn0 width = new err0(0);

    /* JADX INFO: renamed from: height$delegate, reason: from kotlin metadata */
    private final hdn0 height = new err0(0);

    /* JADX INFO: renamed from: textureView$delegate, reason: from kotlin metadata */
    private final ven0 textureView = v8r.q((Object) null);

    public final int getHeight() {
        return this.height.s();
    }

    public final RiveSurface getSurface() {
        return (RiveSurface) this.surface.getValue();
    }

    public final RiveTextureView getTextureView() {
        return (RiveTextureView) this.textureView.getValue();
    }

    public final int getWidth() {
        return this.width.s();
    }

    public final void setHeight(int i) {
        this.height.t(i);
    }

    public final void setSurface(RiveSurface riveSurface) {
        this.surface.setValue(riveSurface);
    }

    public final void setTextureView(RiveTextureView riveTextureView) {
        this.textureView.setValue(riveTextureView);
    }

    public final void setWidth(int i) {
        this.width.t(i);
    }
}
