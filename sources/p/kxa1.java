package p;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kxa1 extends GLSurfaceView {
    public static final /* synthetic */ int O0 = 0;
    public boolean N0;
    public final CopyOnWriteArrayList a;
    public final SensorManager b;
    public final Sensor c;
    public final xqq0 d;
    public final Handler e;
    public final ek41 f;
    public SurfaceTexture g;
    public Surface h;
    public boolean i;
    public boolean t;

    public kxa1(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        ek41 ek41Var = new ek41();
        this.f = ek41Var;
        jxa1 jxa1Var = new jxa1(this, ek41Var);
        View.OnTouchListener fif1Var = new fif1(context, jxa1Var);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new xqq0(windowManager.getDefaultDisplay(), fif1Var, jxa1Var);
        this.i = true;
        setEGLContextClientVersion(2);
        setRenderer(jxa1Var);
        setOnTouchListener(fif1Var);
    }

    public final void a() {
        boolean z = this.i && this.t;
        Sensor sensor = this.c;
        if (sensor == null || z == this.N0) {
            return;
        }
        xqq0 xqq0Var = this.d;
        SensorManager sensorManager = this.b;
        if (z) {
            sensorManager.registerListener(xqq0Var, sensor, 0);
        } else {
            sensorManager.unregisterListener(xqq0Var);
        }
        this.N0 = z;
    }

    public i4d getCameraMotionListener() {
        return this.f;
    }

    public moj1 getVideoFrameMetadataListener() {
        return this.f;
    }

    public Surface getVideoSurface() {
        return this.h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new v241(this, (byte) 10));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.t = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.t = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.f.X = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.i = z;
        a();
    }
}
