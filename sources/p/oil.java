package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oil implements pil {
    public boolean a;
    public String b;
    public String c;
    public float d;
    public float e;

    @Override // p.pil
    public final float value() {
        float f = this.d;
        if (f >= this.e) {
            this.a = true;
        }
        if (this.a) {
            return f;
        }
        float f2 = f + 1.0f;
        this.d = f2;
        return f2;
    }
}
