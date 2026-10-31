package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class jni0 implements htf {
    public final /* synthetic */ byte a;
    public final String b;

    public /* synthetic */ jni0(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // p.htf
    public final /* bridge */ String b(c8a0 c8a0Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return gxo1.k(this, c8a0Var);
    }

    @Override // p.htf
    public final String getDescription() {
        byte b = this.a;
        return this.b;
    }
}
