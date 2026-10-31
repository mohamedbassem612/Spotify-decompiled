package p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hb61 implements ib61 {
    public final List a;
    public final t2d b;
    public final g661 c;
    public ei80 d = null;

    public hb61(ArrayList arrayList, g661 g661Var, t2d t2dVar) {
        this.a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.b = t2dVar;
        this.c = g661Var;
    }

    @Override // p.ib61
    public final List a() {
        return this.a;
    }

    @Override // p.ib61
    public final void b(ei80 ei80Var) {
        this.d = ei80Var;
    }

    @Override // p.ib61
    public final Object c() {
        return null;
    }

    @Override // p.ib61
    public final ei80 d() {
        return this.d;
    }

    @Override // p.ib61
    public final Executor e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hb61) {
            hb61 hb61Var = (hb61) obj;
            List list = hb61Var.a;
            if (Objects.equals(this.d, hb61Var.d)) {
                List list2 = this.a;
                if (list2.size() == list.size()) {
                    for (int i = 0; i < list2.size(); i++) {
                        if (((utq0) list2.get(i)).equals(list.get(i))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p.ib61
    public final int f() {
        return 0;
    }

    @Override // p.ib61
    public final CameraCaptureSession.StateCallback g() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        ei80 ei80Var = this.d;
        int iHashCode2 = (ei80Var == null ? 0 : ei80Var.a.a.hashCode()) ^ i;
        return (iHashCode2 << 5) - iHashCode2;
    }

    @Override // p.ib61
    public final void h(CaptureRequest captureRequest) {
    }
}
