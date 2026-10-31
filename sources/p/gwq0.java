package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.io.IOException;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gwq0 extends vaa {
    public final ns40 h;
    public final q641 i;
    public final b380 j;
    public final int[] k;
    public final SparseArray l;
    public final SparseIntArray m;

    public gwq0(Context context, boolean z, b380 b380Var) throws VideoFrameProcessingException {
        super(1, z);
        int[] iArr = null;
        int i = 15;
        if (z) {
            int[] iArr2 = new int[b380Var.size()];
            for (int i2 = 0; i2 < b380Var.size(); i2++) {
                oxa oxaVar = (oxa) b380Var.get(i2);
                if (oxaVar == null) {
                    k220.g(oxaVar, " is not supported on HDR content.");
                    throw null;
                }
                dm5.y(Build.VERSION.SDK_INT >= 34);
                iArr2[i2] = 1;
                i -= 2;
                if (i < 0) {
                    hhg1.n("Too many HDR overlays in the same OverlayShaderProgram instance.");
                    throw null;
                }
            }
            this.k = iArr2;
            iArr = iArr2;
        } else {
            this.k = null;
            dm5.n(b380Var.size() <= 15, "OverlayShaderProgram does not support more than 15 SDR overlays in the same instance.");
        }
        this.j = b380Var;
        this.i = new q641();
        this.l = new SparseArray();
        this.m = new SparseIntArray();
        try {
            ns40 ns40Var = new ns40(k(b380Var.size()), j(context, b380Var.size(), iArr));
            this.h = ns40Var;
            ns40Var.d(fn31.P());
        } catch (GlUtil.GlException | IOException e) {
            throw new VideoFrameProcessingException((Throwable) e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01af  */
    public static String j(Context context, int i, int[] iArr) {
        String str;
        StringBuilder sb = new StringBuilder("#version 100\nprecision mediump float;\nuniform sampler2D uVideoTexSampler0;\nvarying vec2 vVideoTexSamplingCoord0;\n\n");
        sb.append(zoi1.U(context, 2131886156));
        if (iArr != null) {
            sb.append(zoi1.U(context, 2131886157));
        }
        for (int i2 = 1; i2 <= i; i2++) {
            Locale locale = Locale.US;
            sb.append("uniform sampler2D uOverlayTexSampler" + i2 + ";\n");
            sb.append("uniform float uOverlayAlphaScale" + i2 + ";\n");
            sb.append("varying vec2 vOverlayTexSamplingCoord" + i2 + ";\n");
            sb.append("\n");
            if (iArr != null) {
                int i3 = iArr[i2 - 1];
                if (i3 == 1) {
                    sb.append("// Uniforms for applying the gainmap to the base.\n");
                    sb.append("uniform sampler2D uGainmapTexSampler" + i2 + ";\n");
                    sb.append("uniform int uGainmapIsAlpha" + i2 + ";\n");
                    sb.append("uniform int uNoGamma" + i2 + ";\n");
                    sb.append("uniform int uSingleChannel" + i2 + ";\n");
                    sb.append("uniform vec4 uLogRatioMin" + i2 + ";\n");
                    sb.append("uniform vec4 uLogRatioMax" + i2 + ";\n");
                    sb.append("uniform vec4 uEpsilonSdr" + i2 + ";\n");
                    sb.append("uniform vec4 uEpsilonHdr" + i2 + ";\n");
                    sb.append("uniform vec4 uGainmapGamma" + i2 + ";\n");
                    sb.append("uniform float uDisplayRatioHdr" + i2 + ";\n");
                    sb.append("uniform float uDisplayRatioSdr" + i2 + ";\n");
                    sb.append("\n");
                } else if (i3 == 2) {
                    sb.append("uniform mat4 uLuminanceMatrix" + i2 + ";\n");
                }
            }
        }
        sb.append("void main() {\n vec4 videoColor = vec4(texture2D(uVideoTexSampler0, vVideoTexSamplingCoord0));\n vec4 fragColor = videoColor;\n");
        for (int i4 = 1; i4 <= i; i4++) {
            sb.append("        vec4 electricalOverlayColor% = getClampToBorderOverlayColor(\n      uOverlayTexSampler%, vOverlayTexSamplingCoord%, uOverlayAlphaScale%);\n".replace("%", Integer.toString(i4)));
            if (iArr == null) {
                str = "electricalOverlayColor";
            } else {
                int i5 = iArr[i4 - 1];
                if (i5 == 1) {
                    sb.append("        vec4 gainmap% = texture2D(uGainmapTexSampler%, vOverlayTexSamplingCoord%);\n  vec3 opticalBt709Color% = applyGainmap(\n      srgbEotf(electricalOverlayColor%), gainmap%, uGainmapIsAlpha%, uNoGamma%,\n      uSingleChannel%, uLogRatioMin%, uLogRatioMax%, uEpsilonSdr%, uEpsilonHdr%,\n      uGainmapGamma%, uDisplayRatioHdr%, uDisplayRatioSdr%);\n  vec4 opticalBt2020OverlayColor% =\n      vec4(scaleHdrLuminance(bt709ToBt2020(opticalBt709Color%)),           electricalOverlayColor%.a);".replace("%", Integer.toString(i4)));
                    str = "opticalBt2020OverlayColor";
                } else if (i5 == 2) {
                    sb.append("vec4 opticalOverlayColor% = uLuminanceMatrix% * srgbEotf(electricalOverlayColor%);\n".replace("%", Integer.toString(i4)));
                    str = "opticalOverlayColor";
                } else {
                    str = "electricalOverlayColor";
                }
            }
            Locale locale2 = Locale.US;
            sb.append("  fragColor = getMixColor(fragColor, " + str + i4 + ");\n");
        }
        sb.append("  gl_FragColor = fragColor;\n}\n");
        return sb.toString();
    }

    public static String k(int i) {
        StringBuilder sb = new StringBuilder("#version 100\nattribute vec4 aFramePosition;\nvarying vec2 vVideoTexSamplingCoord0;\n");
        for (int i2 = 1; i2 <= i; i2++) {
            String str = zoi1.a;
            Locale locale = Locale.US;
            sb.append("uniform mat4 uTransformationMatrix" + i2 + ";\n");
            sb.append("uniform mat4 uVertexTransformationMatrix" + i2 + ";\n");
            sb.append("varying vec2 vOverlayTexSamplingCoord" + i2 + ";\n");
        }
        sb.append("vec2 getTexSamplingCoord(vec2 ndcPosition){\n  return vec2(ndcPosition.x * 0.5 + 0.5, ndcPosition.y * 0.5 + 0.5);\n}\nvoid main() {\n  gl_Position = aFramePosition;\n  vVideoTexSamplingCoord0 = getTexSamplingCoord(aFramePosition.xy);\n");
        for (int i3 = 1; i3 <= i; i3++) {
            sb.append("      vec4 aOverlayPosition% =\n  uVertexTransformationMatrix% * uTransformationMatrix% * aFramePosition;\nvOverlayTexSamplingCoord% = getTexSamplingCoord(aOverlayPosition%.xy);".replace("%", Integer.toString(i3)));
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override // p.vaa
    public final l291 e(int i, int i2) {
        l291 l291Var = new l291(i, i2);
        ((pbq) this.i).e = l291Var;
        w280 w280VarR = this.j.r(0);
        while (w280VarR.hasNext()) {
            ((oxa) w280VarR.next()).getClass();
        }
        return l291Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    @Override // p.vaa
    public final void h(int i, long j) throws VideoFrameProcessingException {
        SparseIntArray sparseIntArray = this.m;
        SparseArray sparseArray = this.l;
        b380 b380Var = this.j;
        ns40 ns40Var = this.h;
        try {
            GLES20.glUseProgram(ns40Var.a);
            fn31.t();
            for (int i2 = 1; i2 <= b380Var.size(); i2++) {
                int i3 = i2 - 1;
                oxa oxaVar = (oxa) b380Var.get(i3);
                int[] iArr = this.k;
                if (iArr != null) {
                    int i4 = iArr[i3];
                    if (i4 == 1) {
                        dm5.m(Objects.nonNull(oxaVar));
                        Bitmap bitmapA = oxaVar.a(j);
                        dm5.m(bitmapA.hasGainmap());
                        Gainmap gainmap = bitmapA.getGainmap();
                        gainmap.getClass();
                        Gainmap gainmapF = qpp0.f(sparseArray.get(i2));
                        if (gainmapF == null || !sf.g(gainmapF, gainmap)) {
                            sparseArray.put(i2, gainmap);
                            if (sparseIntArray.get(i2, -1) == -1) {
                                Bitmap gainmapContents = gainmap.getGainmapContents();
                                int iL = fn31.L();
                                fn31.V(iL, gainmapContents);
                                sparseIntArray.put(i2, iL);
                            } else {
                                fn31.V(sparseIntArray.get(i2), gainmap.getGainmapContents());
                            }
                            ns40Var.h(sparseIntArray.get(i2), b380Var.size() + i2, "uGainmapTexSampler" + i2);
                            sf.M(ns40Var, qpp0.f(sparseArray.get(i2)), i2);
                        }
                    } else if (i4 == 2) {
                        float[] fArrA = fn31.A();
                        oxaVar.b().getClass();
                        Matrix.scaleM(fArrA, 0, 1.0f, 1.0f, 1.0f);
                        String str = zoi1.a;
                        Locale locale = Locale.US;
                        ns40Var.f("uLuminanceMatrix" + i2, fArrA);
                    }
                }
                String str2 = zoi1.a;
                Locale locale2 = Locale.US;
                String str3 = "uOverlayTexSampler" + i2;
                Bitmap bitmapA2 = oxaVar.a(j);
                int generationId = bitmapA2.getGenerationId();
                if (bitmapA2 != oxaVar.d || generationId != oxaVar.c) {
                    oxaVar.d = bitmapA2;
                    oxaVar.c = generationId;
                    try {
                        int iL2 = oxaVar.b;
                        if (iL2 == -1) {
                            iL2 = fn31.L();
                            oxaVar.b = iL2;
                        }
                        fn31.V(iL2, bitmapA2);
                    } catch (GlUtil.GlException e) {
                        throw new VideoFrameProcessingException((Throwable) e);
                    }
                }
                ns40Var.h(oxaVar.b, i2, str3);
                ns40Var.f("uVertexTransformationMatrix" + i2, oxaVar.a);
                yrb1 yrb1VarB = oxaVar.b();
                Bitmap bitmap = oxaVar.d;
                bitmap.getClass();
                int width = bitmap.getWidth();
                Bitmap bitmap2 = oxaVar.d;
                bitmap2.getClass();
                ns40Var.f("uTransformationMatrix" + i2, this.i.M(new l291(width, bitmap2.getHeight()), yrb1VarB));
                yrb1VarB.getClass();
                ns40Var.e("uOverlayAlphaScale" + i2, 1.0f);
            }
            ns40Var.h(i, 0, "uVideoTexSampler0");
            ns40Var.b();
            GLES20.glDrawArrays(5, 0, 4);
            fn31.t();
        } catch (GlUtil.GlException e2) {
            throw new VideoFrameProcessingException(j, e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    @Override // p.rs40
    public final void release() throws VideoFrameProcessingException {
        int i;
        b380 b380Var = this.j;
        try {
            this.a.b();
            try {
                this.h.c();
                for (int i2 = 0; i2 < b380Var.size(); i2++) {
                    oxa oxaVar = (oxa) b380Var.get(i2);
                    oxaVar.d = null;
                    int i3 = oxaVar.b;
                    if (i3 != -1) {
                        try {
                            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
                            fn31.t();
                        } catch (GlUtil.GlException e) {
                            throw new VideoFrameProcessingException((Throwable) e);
                        }
                    }
                    oxaVar.b = -1;
                    int[] iArr = this.k;
                    if (iArr != null && iArr[i2] == 1 && (i = this.m.get(i2, -1)) != -1) {
                        GLES20.glDeleteTextures(1, new int[]{i}, 0);
                        fn31.t();
                    }
                }
            } catch (GlUtil.GlException e2) {
                throw new VideoFrameProcessingException((Throwable) e2);
            }
        } catch (GlUtil.GlException e3) {
            throw new VideoFrameProcessingException((Throwable) e3);
        }
    }
}
