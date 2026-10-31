package p;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class i15 {
    public static /* synthetic */ BlendModeColorFilter a(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* synthetic */ ComposeShader b(Shader shader, Shader shader2, BlendMode blendMode) {
        return new ComposeShader(shader, shader2, blendMode);
    }

    public static /* synthetic */ LinearGradient c(float f, float f2, float f3, float f4, long[] jArr, float[] fArr, Shader.TileMode tileMode) {
        return new LinearGradient(f, f2, f3, f4, jArr, fArr, tileMode);
    }

    public static /* synthetic */ RadialGradient d(float f, float f2, float f3, long[] jArr, float[] fArr, Shader.TileMode tileMode) {
        return new RadialGradient(f, f2, f3, jArr, fArr, tileMode);
    }

    public static /* synthetic */ RenderNode e() {
        return new RenderNode("graphicsLayer");
    }

    public static /* synthetic */ SweepGradient f(float f, float f2, long[] jArr, float[] fArr) {
        return new SweepGradient(f, f2, jArr, fArr);
    }

    public static /* synthetic */ Typeface.CustomFallbackBuilder g(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* synthetic */ FontFamily.Builder h(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ MediaSession i(Context context, Bundle bundle, String str) {
        return new MediaSession(context, str, bundle);
    }

    public static /* synthetic */ MediaSession j(Context context, String str) {
        return new MediaSession(context, str, null);
    }

    public static /* synthetic */ LineHeightSpan.Standard k(int i) {
        return new LineHeightSpan.Standard(i);
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ RenderNode m() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ FontFamily.Builder n(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void q() {
    }
}
