package p;

import android.hardware.SensorManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class udm1 {
    public final Function0 a = tdm1.a;
    public final bpb1 b;
    public final bpb1 c;
    public SensorManager d;
    public boolean e;
    public float[] f;
    public long g;
    public Long h;
    public float i;
    public float j;
    public boolean k;
    public float l;
    public final du91 m;

    public udm1() {
        bpb1 bpb1VarB = gio1.b(Float.valueOf(0.0f));
        this.b = bpb1VarB;
        this.c = bpb1VarB;
        this.g = Long.MIN_VALUE;
        this.l = 0.6981317f;
        this.m = new du91(this);
    }

    public final void a() {
        float f = this.i + this.j;
        float f2 = this.l;
        this.b.m((Object) null, Float.valueOf(yoi1.o(f, -f2, f2)));
    }
}
