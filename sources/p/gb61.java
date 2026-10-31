package p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gb61 implements ib61 {
    public final SessionConfiguration a;
    public final List b;

    public gb61(ArrayList arrayList, g661 g661Var, t2d t2dVar) {
        utq0 utq0Var;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, jb61.a(arrayList), g661Var, t2dVar);
        this.a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            if (outputConfiguration == null) {
                utq0Var = null;
            } else {
                int i = Build.VERSION.SDK_INT;
                utq0Var = new utq0(i >= 33 ? new buq0(outputConfiguration) : i >= 28 ? new auq0(new ztq0(outputConfiguration)) : i >= 26 ? new ytq0(new xtq0(outputConfiguration)) : new wtq0(new vtq0(outputConfiguration)));
            }
            arrayList2.add(utq0Var);
        }
        this.b = Collections.unmodifiableList(arrayList2);
    }

    @Override // p.ib61
    public final List a() {
        return this.b;
    }

    @Override // p.ib61
    public final void b(ei80 ei80Var) {
        this.a.setInputConfiguration(ei80Var.a.a);
    }

    @Override // p.ib61
    public final Object c() {
        return this.a;
    }

    @Override // p.ib61
    public final ei80 d() {
        return ei80.a(this.a.getInputConfiguration());
    }

    @Override // p.ib61
    public final Executor e() {
        return this.a.getExecutor();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gb61) {
            return this.a.equals(((gb61) obj).a);
        }
        return false;
    }

    @Override // p.ib61
    public final int f() {
        return this.a.getSessionType();
    }

    @Override // p.ib61
    public final CameraCaptureSession.StateCallback g() {
        return this.a.getStateCallback();
    }

    @Override // p.ib61
    public final void h(CaptureRequest captureRequest) {
        this.a.setSessionParameters(captureRequest);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
