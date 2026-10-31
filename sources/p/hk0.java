package p;

import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hk0 implements gdr0, dba {
    public float a;
    public final Object b;

    public hk0(List list) {
        this.a = -1.0f;
        this.b = (sua0) list.get(0);
    }

    public int a(wat watVar, int i) {
        i2c i2cVar = (i2c) this.b;
        int iI0 = watVar.i0(i2cVar.d()) - (watVar.i0(this.a) * 2);
        int iI1 = watVar.i0(i2cVar.c());
        return iI0 > iI1 ? iI1 : iI0;
    }

    public boolean b(float f) {
        if (this.a == f) {
            return true;
        }
        this.a = f;
        return false;
    }

    public sua0 c() {
        return (sua0) this.b;
    }

    public boolean d(float f) {
        return !((sua0) this.b).c();
    }

    public float e() {
        return ((sua0) this.b).b();
    }

    public float f() {
        return ((sua0) this.b).a();
    }

    public boolean isEmpty() {
        return false;
    }

    public hk0(i2c i2cVar, float f) {
        this.b = i2cVar;
        this.a = f;
    }

    public hk0(GlueToolbar glueToolbar) {
        this.a = -1.0f;
        this.b = glueToolbar;
    }
}
