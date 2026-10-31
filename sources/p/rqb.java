package p;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.graphics.RuntimeShader;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class rqb {
    public static /* synthetic */ PackageManager.ComponentEnabledSetting a(int i, ComponentName componentName) {
        return new PackageManager.ComponentEnabledSetting(componentName, i, 1);
    }

    public static /* synthetic */ RuntimeShader b() {
        return new RuntimeShader("\n    uniform float2 rectOrigin;\n    uniform float2 rectSize;\n    uniform float cornerRadius;\n    uniform float innerFullOpacityRadius;\n    uniform float outerFeatherRadius;\n    uniform float4 fillColor;\n    uniform float noiseStrength;\n    uniform shader noiseTexture;\n\n    float sdRoundedRect(float2 p, float2 halfSize, float radius) {\n        float2 q = abs(p) - halfSize + radius;\n        return length(max(q, 0.0)) + min(max(q.x, q.y), 0.0) - radius;\n    }\n\n    half4 main(float2 fragCoord) {\n        float2 rectCenter = rectOrigin + rectSize * 0.5;\n        float2 halfSize = rectSize * 0.5;\n        float dist = sdRoundedRect(fragCoord - rectCenter, halfSize, cornerRadius);\n        float feather = innerFullOpacityRadius + outerFeatherRadius;\n        float fadeT = feather > 0.0\n            ? clamp((dist + innerFullOpacityRadius) / feather, 0.0, 1.0)\n            : step(0.0, dist);\n        float fade = fadeT * fadeT * (3.0 - 2.0 * fadeT);\n        float alpha = 1.0 - fade;\n\n        float3 base = fillColor.rgb;\n\n        float4 noiseSample = noiseTexture.eval(fragCoord);\n        float3 blend = float3(noiseSample.r);\n        float3 lo = 2.0 * base * blend;\n        float3 hi = 1.0 - 2.0 * (1.0 - base) * (1.0 - blend);\n        float3 blended = mix(lo, hi, step(0.5, base));\n        float3 result = mix(base, blended, noiseStrength);\n\n        return half4(half3(result) * half(alpha), half(fillColor.a * alpha));\n    }\n");
    }

    public static /* synthetic */ BoringLayout c(int i, int i2, BoringLayout.Metrics metrics, Layout.Alignment alignment, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, boolean z) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }

    public static /* synthetic */ EditorBoundsInfo.Builder d() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ RuntimeShader f() {
        return new RuntimeShader("\n  uniform shader content;\n  uniform float height;\n  uniform float overscroll;\n\n  half4 main(float2 coord) {\n    float t = coord.y / height;\n    float o = abs(overscroll);\n    if (overscroll < 0.0) t = 1.0 - t;\n    float offset = 1.0 - t;\n    float variation = mix(1.0, offset, 0.7);\n    float src = 1.0 / (1.0 + o) - offset / (1.0 + o * variation);\n    if (overscroll < 0.0) src = 1.0 - src;\n    return content.eval(float2(coord.x, src * height));\n  }\n  ");
    }
}
