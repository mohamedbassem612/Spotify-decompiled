package p;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class exj1 implements mpj1 {
    public final npj1 a;
    public final Object b = new Object();
    public final ifb1 c;
    public final boolean d;
    public final long e;
    public int f;
    public int g;
    public final /* synthetic */ fxj1 h;

    public exj1(fxj1 fxj1Var, Context context, dz81 dz81Var, x8h x8hVar, m9x0 m9x0Var, List list, ifb1 ifb1Var, long j, boolean z) {
        this.h = fxj1Var;
        this.c = ifb1Var;
        this.d = z;
        this.e = j;
        npj1 npj1VarA = dz81Var.a(context, x8hVar, this, l5u.a, j, z);
        this.a = npj1VarA;
        npj1VarA.e(list);
        npj1VarA.h(m9x0Var);
    }

    @Override // p.mpj1
    public final void a(VideoFrameProcessingException videoFrameProcessingException) {
        this.c.accept(ExportException.e(videoFrameProcessingException));
    }

    @Override // p.mpj1
    public final void b(long j, boolean z) {
        if (this.d) {
            return;
        }
        synchronized (this.b) {
            this.g++;
        }
        f();
    }

    @Override // p.mpj1
    public final void c(int i, int i2) {
        o3d1 o3d1VarA;
        try {
            o3d1VarA = this.h.f.a(i, i2);
        } catch (ExportException e) {
            this.c.accept(e);
            o3d1VarA = null;
        }
        this.a.m(o3d1VarA);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    @Override // p.mpj1
    public final void d(long j) {
        this.h.h = j;
        try {
            this.h.f.b();
        } catch (ExportException e) {
            this.c.accept(e);
        }
    }

    public final void f() {
        boolean z;
        int i;
        synchronized (this.b) {
            try {
                int i2 = this.g;
                if (i2 <= 0 || (i = this.f) >= -1) {
                    z = false;
                } else {
                    z = true;
                    this.f = i + 1;
                    this.g = i2 - 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.a.g(-3L);
        }
    }
}
