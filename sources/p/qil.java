package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qil implements pil {
    public float a;
    public float b;

    @Override // p.pil
    public final float value() {
        float f = this.b + this.a;
        this.b = f;
        return f;
    }
}
