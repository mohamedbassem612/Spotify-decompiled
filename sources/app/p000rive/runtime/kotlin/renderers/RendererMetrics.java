package app.p000rive.runtime.kotlin.renderers;

import android.app.Activity;
import android.os.Build;
import android.view.FrameMetrics;
import android.view.Window;
import app.p000rive.RiveLog;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.m811;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lapp/rive/runtime/kotlin/renderers/RendererMetrics;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/view/Window;", "window", "Landroid/view/FrameMetrics;", "frameMetrics", "", "dropCountSinceLastInvocation", "Lp/rih1;", "onFrameMetricsAvailable", "(Landroid/view/Window;Landroid/view/FrameMetrics;I)V", "allFrames", "I", "sampleCount", "jankyFrames", "Ljava/math/BigDecimal;", "totalTime", "Ljava/math/BigDecimal;", "", "refreshRateMs", "F", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RendererMetrics implements Window.OnFrameMetricsAvailableListener {
    private static final double ONE_MS_IN_NS = 1000000.0d;
    public static final int SAMPLES = 30;
    private static final String TAG = "RiveL/RendererMetrics";
    private int allFrames;
    private int jankyFrames;
    private final float refreshRateMs;
    private int sampleCount;
    private BigDecimal totalTime = new BigDecimal(0.0d);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.RendererMetrics$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ m811 $refreshRateHz;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(m811 m811Var) {
            super(0);
            this.$refreshRateHz = m811Var;
        }

        public final String invoke() {
            return String.format(Locale.US, "Refresh rate: %.1f Hz", Arrays.copyOf(new Object[]{Float.valueOf(this.$refreshRateHz.a)}, 1));
        }
    }

    public RendererMetrics(Activity activity) {
        Window window = activity.getWindow();
        m811 m811Var = new m811();
        m811Var.a = Build.VERSION.SDK_INT >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        RiveLog.INSTANCE.getLogger().i(TAG, new AnonymousClass1(m811Var));
        this.refreshRateMs = 1000.0f / m811Var.a;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int dropCountSinceLastInvocation) {
        if (window == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, C01141.INSTANCE);
            return;
        }
        if (frameMetrics == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, AnonymousClass2.INSTANCE);
            return;
        }
        FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
        this.allFrames++;
        this.sampleCount++;
        double metric = frameMetrics2.getMetric(8) / ONE_MS_IN_NS;
        BigDecimal bigDecimalAdd = this.totalTime.add(new BigDecimal(String.valueOf(metric)));
        this.totalTime = bigDecimalAdd;
        if (bigDecimalAdd.compareTo(new BigDecimal(String.valueOf(this.refreshRateMs))) > 0) {
            this.jankyFrames++;
        }
        if (this.sampleCount == 30) {
            this.sampleCount = 0;
            RiveLog.INSTANCE.getLogger().i(TAG, new AnonymousClass3(String.format(Locale.US, "\\n\n============ FrameMetrics ============\n=== Frame issued in:        %.2fms ===\n=== Draw Time:              %.2fms ===\n=== Swap Buffers Duration:  %.2fms ===\n=== GPU commands sent in:   %.2fms ===\n======================================\n=== Overall average:        %.2fms ===", Double.valueOf(metric), Double.valueOf(frameMetrics2.getMetric(4) / ONE_MS_IN_NS), Double.valueOf(frameMetrics2.getMetric(7) / ONE_MS_IN_NS), Double.valueOf(frameMetrics2.getMetric(6) / ONE_MS_IN_NS), this.totalTime.divide(BigDecimal.valueOf(this.allFrames), 2, RoundingMode.HALF_UP))));
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.RendererMetrics$onFrameMetricsAvailable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01141 extends hab0 implements Function0 {
        public static final C01141 INSTANCE = new C01141();

        public C01141() {
            super(0);
        }

        public final String invoke() {
            return "Invalid Window reference.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.RendererMetrics$onFrameMetricsAvailable$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends hab0 implements Function0 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        public final String invoke() {
            return "Invalid FrameMetrics reference.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.RendererMetrics$onFrameMetricsAvailable$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends hab0 implements Function0 {
        final /* synthetic */ String $frameValues;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$frameValues = str;
        }

        public final String invoke() {
            return this.$frameValues;
        }
    }
}
