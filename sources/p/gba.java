package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gba implements cba {
    public final /* synthetic */ hba a;

    public final void a() {
        hba hbaVar = this.a;
        boolean z = hbaVar.r.k() == 1.0f;
        if (z != hbaVar.x) {
            hbaVar.x = z;
            hbaVar.o.invalidateSelf();
        }
    }
}
