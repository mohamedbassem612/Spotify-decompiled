package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum ad4 implements z0z {
    LOW("low"),
    MID("mid"),
    HIGH("high");

    public final String a;

    ad4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
